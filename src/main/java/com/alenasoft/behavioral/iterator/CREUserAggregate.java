package com.alenasoft.behavioral.iterator;

public class CREUserAggregate implements Aggregate{
    @Override
    public Iterator createIterator() {
        return new CREUserIterator();
    }
}
