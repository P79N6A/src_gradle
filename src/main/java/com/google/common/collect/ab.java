package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class ab<K, V> extends ad<K, V> implements ay<K, V> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ay<K, V> delegate();

    protected ab() {
    }

    public List<V> get(@NullableDecl K k) {
        return delegate().get(k);
    }

    @CanIgnoreReturnValue
    public List<V> removeAll(@NullableDecl Object obj) {
        return delegate().removeAll(obj);
    }
}
