package com.hacksy;

import java.util.Collection;

public interface Collector<T> {
    T[] getCollected();
}
