package org.hacksy;

import org.hacksy.model.ISBNIdentifiable;

import java.util.*;

public class StaleCollectionEvaluator implements ObjectCollector<ISBNIdentifiable>, ObjectActor<ISBNIdentifiable> {
    private Set<ISBNIdentifiable> potentiallyStaleISBNS;

    public StaleCollectionEvaluator(ISBNIdentifiable[] existingIdentifiables) {
        this.potentiallyStaleISBNS = buildISBNSet(existingIdentifiables);
    }

    public void actOn(ISBNIdentifiable object) {
        potentiallyStaleISBNS.remove(object.getISBN());
    }

    public ISBNIdentifiable[] getCollected() {
        ISBNIdentifiable[] collected = new ISBNIdentifiable[potentiallyStaleISBNS.size()];
        potentiallyStaleISBNS.toArray(collected);
        return collected;
    }

    private Set<ISBNIdentifiable> buildISBNSet(ISBNIdentifiable[] collection) {
        Set<ISBNIdentifiable> bareISBNSet = new HashSet<ISBNIdentifiable>();
        for(ISBNIdentifiable entry : collection) {
            bareISBNSet.add(entry.getISBN());
        }
        return bareISBNSet;
    }
}
