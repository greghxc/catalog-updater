package com.hacksy;

import com.hacksy.client.CatalogClient;
import com.hacksy.client.InventoryClient;
import com.hacksy.model.Book;
import com.hacksy.model.CatalogEntry;
import com.hacksy.model.ISBNIdentifiable;

public class App
{
    public static void main( String[] args ) {
        CatalogEntry[] catalog = getCatalog();
        Book[] inventory = getInventory();

        // Stand in for a SNS publisher or whatever
        StdOutPublisher stdOutPublisher = new StdOutPublisher<ISBNIdentifiable>();

        // Implements both actor and collector
        StaleCollectionEvaluator staleCollectionEvaluator =
                new StaleCollectionEvaluator(catalog);

        // Processors for our publish and unpublish object arrays
        ObjectProcessor<ISBNIdentifiable> publisher =
                new ObjectProcessor<ISBNIdentifiable>(stdOutPublisher, staleCollectionEvaluator);

        ObjectProcessor<ISBNIdentifiable> unpublisher =
                new ObjectProcessor<ISBNIdentifiable>(stdOutPublisher);

        System.out.println("== Publishing items to Publisher ==");
        publisher.process(inventory);

        System.out.println("\n== Publishing stale items to Unpublisher ==");
        unpublisher.process(staleCollectionEvaluator.getCollected());
    }


    // These just get our initial data in a visible way
    private static Book[] getInventory() {
        InventoryClient inventoryClient = new InventoryClient();
        Book[] inventory = inventoryClient.getInvetory();
        System.out.println("== Initial Inventory ==");
        System.out.println("Inventory represents books in stock that should be published to the catalog. Items not " +
                "on this list should be removed from the catalog.");
        System.out.println(arrayToString(inventory));
        return inventory;
    }

    private static CatalogEntry[] getCatalog() {
        CatalogClient catalogClient = new CatalogClient();
        CatalogEntry[] catalog = catalogClient.getCatalogEntries();
        System.out.println("== Initial Catalog ==");
        System.out.println("Catalog represents books in the catalog that needs to be updated with what's currently " +
                "in stock.");
        System.out.println(String.join("\n", arrayToString(catalog)));
        return catalog;
    }

    private static <T> String arrayToString(T[] array) {
        String accumulator = "";
        for (T object : array) {
            accumulator += object.toString() + "\n";
        }
        return accumulator;
    }
}
