package com.google.common.collect;

import com.google.common.a.j;
import com.google.common.annotations.GwtCompatible;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class f<K, V> implements Map.Entry<K, V> {
    public abstract K getKey();

    public abstract V getValue();

    f() {
    }

    public int hashCode() {
        int i;
        Object key = getKey();
        Object value = getValue();
        int i2 = 0;
        if (key == null) {
            i = 0;
        } else {
            i = key.hashCode();
        }
        if (value != null) {
            i2 = value.hashCode();
        }
        return i ^ i2;
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }

    public V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!j.a(getKey(), entry.getKey()) || !j.a(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }
}
