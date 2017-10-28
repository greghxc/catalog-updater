package com.hacksy.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class CatalogEntry implements ISBNIdentifiable {
    @NonNull private ISBN ISBN;
    @NonNull private int priceInCents;
}
