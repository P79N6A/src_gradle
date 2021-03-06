package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class AbstractProtobufList<E> extends AbstractList<E> implements Internal.ProtobufList<E> {
    private boolean isMutable = true;

    public final void makeImmutable() {
        this.isMutable = false;
    }

    public boolean isModifiable() {
        return this.isMutable;
    }

    AbstractProtobufList() {
    }

    public void clear() {
        ensureIsMutable();
        super.clear();
    }

    /* access modifiers changed from: protected */
    public void ensureIsMutable() {
        if (!this.isMutable) {
            throw new UnsupportedOperationException();
        }
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public E remove(int i) {
        ensureIsMutable();
        return super.remove(i);
    }

    public boolean removeAll(Collection<?> collection) {
        ensureIsMutable();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        ensureIsMutable();
        return super.retainAll(collection);
    }

    public boolean add(E e2) {
        ensureIsMutable();
        return super.add(e2);
    }

    public boolean addAll(Collection<? extends E> collection) {
        ensureIsMutable();
        return super.addAll(collection);
    }

    public boolean remove(Object obj) {
        ensureIsMutable();
        return super.remove(obj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public void add(int i, E e2) {
        ensureIsMutable();
        super.add(i, e2);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        ensureIsMutable();
        return super.addAll(i, collection);
    }

    public E set(int i, E e2) {
        ensureIsMutable();
        return super.set(i, e2);
    }
}
