package org.hacksy.client;

import org.hacksy.model.CatalogEntry;
import org.hacksy.model.ISBN;

public class CatalogClient {
    private CatalogEntry[] catalog = new CatalogEntry[] {
            new CatalogEntry(new ISBN("0001"), 499),
            new CatalogEntry(new ISBN("0002"), 499),
            new CatalogEntry(new ISBN("0003"), 499),
            new CatalogEntry(new ISBN("0004"), 499),
    };

    public CatalogEntry[] getCatalogEntries() {
        return catalog;
    }
}
