package org.hacksy.client;

import org.hacksy.model.Book;
import org.hacksy.model.ISBN;

public class InventoryClient {
    private Book[] inventory = new Book[]{
            new Book("Title 1", "Author 1", "Paperback", new ISBN("0001")),
            new Book("Title 2", "Author 2", "Paperback", new ISBN("0002")),
            new Book("Title 4", "Author 4", "Paperback", new ISBN("0004")),
            new Book("Title 5", "Author 5", "Paperback", new ISBN("0005"))
    };

    public Book[] getInvetory() {
        return inventory;
    }
}
