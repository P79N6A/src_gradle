package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Map;
import java.util.Set;

@GwtCompatible
public interface bx<K, V> extends bd<K, V> {
    Set<Map.Entry<K, V>> entries();
}
