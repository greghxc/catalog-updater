package org.hacksy.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class Book implements ISBNIdentifiable {
    final private String title;
    final private String author;
    final private String format;
    final private ISBN ISBN;
}
