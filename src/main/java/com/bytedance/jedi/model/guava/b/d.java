package com.bytedance.jedi.model.guava.b;

import com.bytedance.jedi.model.guava.annotations.GwtIncompatible;
import com.bytedance.jedi.model.guava.annotations.NullableDecl;
import com.bytedance.jedi.model.guava.b.c;

@GwtIncompatible
public interface d<K, V> {
    long getAccessTime();

    int getHash();

    @NullableDecl
    K getKey();

    @NullableDecl
    d<K, V> getNext();

    d<K, V> getNextInAccessQueue();

    d<K, V> getNextInWriteQueue();

    d<K, V> getPreviousInAccessQueue();

    d<K, V> getPreviousInWriteQueue();

    c.u<K, V> getValueReference();

    long getWriteTime();

    void setAccessTime(long j);

    void setNextInAccessQueue(d<K, V> dVar);

    void setNextInWriteQueue(d<K, V> dVar);

    void setPreviousInAccessQueue(d<K, V> dVar);

    void setPreviousInWriteQueue(d<K, V> dVar);

    void setValueReference(c.u<K, V> uVar);

    void setWriteTime(long j);
}
