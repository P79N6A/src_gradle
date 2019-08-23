package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class al<K, V> extends ar<Map.Entry<K, V>> {

    @GwtIncompatible
    static class a<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final ak<K, V> map;

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            return this.map.entrySet();
        }

        a(ak<K, V> akVar) {
            this.map = akVar;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract ak<K, V> a();

    al() {
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible
    public final boolean b() {
        return a().e();
    }

    public int hashCode() {
        return a().hashCode();
    }

    /* access modifiers changed from: package-private */
    public boolean isPartialView() {
        return a().d();
    }

    public int size() {
        return a().size();
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible
    public Object writeReplace() {
        return new a(a());
    }

    public boolean contains(@NullableDecl Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = a().get(entry.getKey());
        if (obj2 == null || !obj2.equals(entry.getValue())) {
            return false;
        }
        return true;
    }
}
