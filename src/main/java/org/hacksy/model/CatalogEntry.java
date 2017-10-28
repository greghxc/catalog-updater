package org.hacksy.model;

import lombok.Data;

@Data
public class CatalogEntry implements ISBNIdentifiable {
    final private ISBN ISBN;
    final private int priceInCents;
}
