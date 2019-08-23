package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class ad<K, V> extends ae implements bd<K, V> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract bd<K, V> delegate();

    protected ad() {
    }

    public void clear() {
        delegate().clear();
    }

    public Map<K, Collection<V>> asMap() {
        return delegate().asMap();
    }

    public Collection<Map.Entry<K, V>> entries() {
        return delegate().entries();
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    public bg<K> keys() {
        return delegate().keys();
    }

    public int size() {
        return delegate().size();
    }

    public Collection<V> values() {
        return delegate().values();
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return delegate().containsKey(obj);
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return delegate().containsValue(obj);
    }

    public Collection<V> get(@NullableDecl K k) {
        return delegate().get(k);
    }

    @CanIgnoreReturnValue
    public boolean putAll(bd<? extends K, ? extends V> bdVar) {
        return delegate().putAll(bdVar);
    }

    @CanIgnoreReturnValue
    public Collection<V> removeAll(@NullableDecl Object obj) {
        return delegate().removeAll(obj);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this || delegate().equals(obj)) {
            return true;
        }
        return false;
    }

    public boolean containsEntry(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return delegate().containsEntry(obj, obj2);
    }

    @CanIgnoreReturnValue
    public boolean put(K k, V v) {
        return delegate().put(k, v);
    }

    @CanIgnoreReturnValue
    public boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return delegate().remove(obj, obj2);
    }

    @CanIgnoreReturnValue
    public boolean putAll(K k, Iterable<? extends V> iterable) {
        return delegate().putAll(k, iterable);
    }
}
