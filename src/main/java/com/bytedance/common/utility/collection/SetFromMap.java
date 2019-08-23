package com.bytedance.common.utility.collection;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SetFromMap<E> extends AbstractSet<E> {
    private transient Set<E> backingSet;
    private final Map<E, Boolean> m;

    public void clear() {
        this.m.clear();
    }

    public int hashCode() {
        return this.backingSet.hashCode();
    }

    public boolean isEmpty() {
        return this.m.isEmpty();
    }

    public Iterator<E> iterator() {
        return this.backingSet.iterator();
    }

    public int size() {
        return this.m.size();
    }

    public Object[] toArray() {
        return this.backingSet.toArray();
    }

    public String toString() {
        return this.backingSet.toString();
    }

    public boolean contains(Object obj) {
        return this.backingSet.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.backingSet.containsAll(collection);
    }

    public boolean equals(Object obj) {
        return this.backingSet.equals(obj);
    }

    public boolean retainAll(Collection<?> collection) {
        return this.backingSet.retainAll(collection);
    }

    public SetFromMap(Map<E, Boolean> map) {
        this.m = map;
        this.backingSet = map.keySet();
    }

    public boolean add(E e2) {
        if (this.m.put(e2, Boolean.TRUE) == null) {
            return true;
        }
        return false;
    }

    public boolean remove(Object obj) {
        if (this.m.remove(obj) != null) {
            return true;
        }
        return false;
    }

    public <T> T[] toArray(T[] tArr) {
        return this.backingSet.toArray(tArr);
    }
}
