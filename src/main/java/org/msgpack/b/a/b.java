package org.msgpack.b.a;

import java.io.Serializable;
import java.util.Map;

public final class b<K, V> implements Serializable, Map.Entry<K, V> {
    private static final long serialVersionUID = -4564047655287765373L;
    private final K key;
    private final V value;

    public final K getKey() {
        return this.key;
    }

    public final V getValue() {
        return this.value;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (this.key == null) {
            i = 0;
        } else {
            i = this.key.hashCode();
        }
        if (this.value != null) {
            i2 = this.value.hashCode();
        }
        return i ^ i2;
    }

    public final String toString() {
        return this.key + "=" + this.value;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public b(Map.Entry<? extends K, ? extends V> entry) {
        this.key = entry.getKey();
        this.value = entry.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.key != null ? this.key.equals(entry.getKey()) : entry.getKey() == null) {
            if (this.value != null ? !this.value.equals(entry.getValue()) : entry.getValue() != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    public b(K k, V v) {
        this.key = k;
        this.value = v;
    }
}
