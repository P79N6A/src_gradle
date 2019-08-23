package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class c<K, V> extends d<K, V> implements ay<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract List<V> b();

    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Collection c() {
        return Collections.emptyList();
    }

    protected c(Map<K, Collection<V>> map) {
        super(map);
    }

    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    public final <E> Collection<E> a(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    public List<V> get(@NullableDecl K k) {
        return (List) super.get(k);
    }

    @CanIgnoreReturnValue
    public List<V> removeAll(@NullableDecl Object obj) {
        return (List) super.removeAll(obj);
    }

    /* access modifiers changed from: package-private */
    public final Collection<V> a(K k, Collection<V> collection) {
        return a(k, (List) collection, null);
    }

    @CanIgnoreReturnValue
    public boolean put(@NullableDecl K k, @NullableDecl V v) {
        return super.put(k, v);
    }

    @CanIgnoreReturnValue
    public List<V> replaceValues(@NullableDecl K k, Iterable<? extends V> iterable) {
        return (List) super.replaceValues(k, iterable);
    }
}
