package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public interface ay<K, V> extends bd<K, V> {
    Map<K, Collection<V>> asMap();

    List<V> get(@NullableDecl K k);

    @CanIgnoreReturnValue
    List<V> removeAll(@NullableDecl Object obj);
}
