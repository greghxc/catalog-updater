package com.hacksy.model;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ISBNTest {
    @Test
    public void basicEquality() {
        assertThat(new ISBN("0001"), is(new ISBN("0001")));
    }

    @Test
    public void testHashCode() {
        assertThat(new ISBN("0001").hashCode(), is(new ISBN("0001").hashCode()));
    }

}