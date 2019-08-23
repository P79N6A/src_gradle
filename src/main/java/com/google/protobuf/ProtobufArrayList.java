package com.google.protobuf;

import java.util.ArrayList;
import java.util.List;

public final class ProtobufArrayList<E> extends AbstractProtobufList<E> {
    private static final ProtobufArrayList<Object> EMPTY_LIST;
    private final List<E> list;

    public static <E> ProtobufArrayList<E> emptyList() {
        return EMPTY_LIST;
    }

    public final int size() {
        return this.list.size();
    }

    static {
        ProtobufArrayList<Object> protobufArrayList = new ProtobufArrayList<>();
        EMPTY_LIST = protobufArrayList;
        protobufArrayList.makeImmutable();
    }

    ProtobufArrayList() {
        this(new ArrayList(10));
    }

    private ProtobufArrayList(List<E> list2) {
        this.list = list2;
    }

    public final E get(int i) {
        return this.list.get(i);
    }

    public final E remove(int i) {
        ensureIsMutable();
        E remove = this.list.remove(i);
        this.modCount++;
        return remove;
    }

    public final ProtobufArrayList<E> mutableCopyWithCapacity(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.list);
            return new ProtobufArrayList<>(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i, E e2) {
        ensureIsMutable();
        this.list.add(i, e2);
        this.modCount++;
    }

    public final E set(int i, E e2) {
        ensureIsMutable();
        E e3 = this.list.set(i, e2);
        this.modCount++;
        return e3;
    }
}
