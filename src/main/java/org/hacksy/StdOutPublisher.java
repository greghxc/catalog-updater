package org.hacksy;

public class StdOutPublisher<T> implements ObjectActor<T> {
    public void actOn(T object) {
        System.out.println("Published:" + object.toString());
    }
}
