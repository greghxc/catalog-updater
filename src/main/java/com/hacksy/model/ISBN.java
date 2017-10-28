package com.hacksy.model;

import java.util.Objects;

public class ISBN implements ISBNIdentifiable {
    private String ISBNString;

    public ISBN(String ISBNString) {
        this.ISBNString = ISBNString;
    }

    public ISBN getISBN() {
        return this;
    }

    public String toString() {
        return ISBNString;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        ISBN isbn = (ISBN) o;
        return Objects.equals(ISBNString, isbn.toString());
    }

    public int hashCode() {
        return ISBNString.hashCode();
    }
}
