package com.hacksy.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class Book implements ISBNIdentifiable {
    @NonNull private String title;
    @NonNull private String author;
    @NonNull private String format;
    @NonNull private ISBN ISBN;
}
