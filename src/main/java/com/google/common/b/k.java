package com.google.common.b;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.b.g;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
public interface k<K, V> {
    long getAccessTime();

    int getHash();

    @NullableDecl
    K getKey();

    @NullableDecl
    k<K, V> getNext();

    k<K, V> getNextInAccessQueue();

    k<K, V> getNextInWriteQueue();

    k<K, V> getPreviousInAccessQueue();

    k<K, V> getPreviousInWriteQueue();

    g.w<K, V> getValueReference();

    long getWriteTime();

    void setAccessTime(long j);

    void setNextInAccessQueue(k<K, V> kVar);

    void setNextInWriteQueue(k<K, V> kVar);

    void setPreviousInAccessQueue(k<K, V> kVar);

    void setPreviousInWriteQueue(k<K, V> kVar);

    void setValueReference(g.w<K, V> wVar);

    void setWriteTime(long j);
}
