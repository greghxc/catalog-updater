package org.hacksy;

public class ObjectProcessor<T> {
    private ObjectActor<T>[] actors;

    public ObjectProcessor(ObjectActor<T>... actors) {
        this.actors = actors;
    }

    public void process(T[] objects) {
        for(T object : objects) {
            for (ObjectActor<T> actor : actors) {
                actor.actOn(object);
            }
        }
    }
}
