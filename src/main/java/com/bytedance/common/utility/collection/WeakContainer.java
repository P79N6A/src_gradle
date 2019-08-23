package com.bytedance.common.utility.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

public class WeakContainer<E> implements Iterable<E> {
    private final WeakHashMap<E, Object> mMap = new WeakHashMap<>();
    private final Object mValue = new Object();

    public void clear() {
        this.mMap.clear();
    }

    public boolean isEmpty() {
        return this.mMap.isEmpty();
    }

    public int size() {
        return this.mMap.size();
    }

    public Iterator<E> iterator() {
        ArrayList arrayList = new ArrayList(this.mMap.size());
        for (E next : this.mMap.keySet()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList.iterator();
    }

    public E peek() {
        E e2 = null;
        if (this.mMap.size() == 0) {
            return null;
        }
        Iterator<E> it2 = this.mMap.keySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            E next = it2.next();
            if (next != null) {
                e2 = next;
                break;
            }
        }
        this.mMap.remove(e2);
        return e2;
    }

    public boolean contains(E e2) {
        return this.mMap.containsKey(e2);
    }

    public void add(E e2) {
        if (e2 == null) {
            this.mMap.size();
        } else {
            this.mMap.put(e2, this.mValue);
        }
    }

    public void remove(E e2) {
        if (e2 == null) {
            this.mMap.size();
        } else {
            this.mMap.remove(e2);
        }
    }
}
