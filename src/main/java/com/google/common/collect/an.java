package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.Map;

@GwtCompatible
public final class an<K, V> extends ag<V> {
    @Weak
    public final ak<K, V> map;

    @GwtIncompatible
    static class a<V> implements Serializable {
        private static final long serialVersionUID = 0;
        final ak<?, V> map;

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            return this.map.values();
        }

        a(ak<?, V> akVar) {
            this.map = akVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean isPartialView() {
        return true;
    }

    public final cg<V> iterator() {
        return new cg<V>() {

            /* renamed from: a  reason: collision with root package name */
            final cg<Map.Entry<K, V>> f24561a = an.this.map.entrySet().iterator();

            public final boolean hasNext() {
                return this.f24561a.hasNext();
            }

            public final V next() {
                return ((Map.Entry) this.f24561a.next()).getValue();
            }
        };
    }

    public final int size() {
        return this.map.size();
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible
    public final Object writeReplace() {
        return new a(this.map);
    }

    public final ai<V> asList() {
        final ai asList = this.map.entrySet().asList();
        return new ai<V>() {
            /* access modifiers changed from: package-private */
            public final boolean isPartialView() {
                return true;
            }

            public final int size() {
                return asList.size();
            }

            public final V get(int i) {
                return ((Map.Entry) asList.get(i)).getValue();
            }
        };
    }

    an(ak<K, V> akVar) {
        this.map = akVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x002d
            com.google.common.collect.cg r1 = r4.iterator()
            r2 = 1
            if (r5 != 0) goto L_0x0018
        L_0x000a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0029
            java.lang.Object r5 = r1.next()
            if (r5 != 0) goto L_0x000a
        L_0x0016:
            r5 = 1
            goto L_0x002a
        L_0x0018:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0029
            java.lang.Object r3 = r1.next()
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0018
            goto L_0x0016
        L_0x0029:
            r5 = 0
        L_0x002a:
            if (r5 == 0) goto L_0x002d
            return r2
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.an.contains(java.lang.Object):boolean");
    }
}
