package com.google.common.collect;

import com.google.common.a.s;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.bf;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@GwtCompatible
@Beta
public abstract class be<K0, V0> {

    static final class a<V> implements s<List<V>>, Serializable {
        private final int expectedValuesPerKey;

        public final List<V> get() {
            return new ArrayList(this.expectedValuesPerKey);
        }

        a(int i) {
            this.expectedValuesPerKey = l.a(i, "expectedValuesPerKey");
        }
    }

    public static abstract class b<K0, V0> extends be<K0, V0> {
        public abstract <K extends K0, V extends V0> ay<K, V> b();

        b() {
            super((byte) 0);
        }
    }

    public static abstract class c<K0> {
        /* access modifiers changed from: package-private */
        public abstract <K extends K0, V> Map<K, Collection<V>> a();

        c() {
        }

        public final b<K0, Object> b() {
            l.a(2, "expectedValuesPerKey");
            return new b<K0, Object>(2) {
                public final <K extends K0, V> ay<K, V> b() {
                    return new bf.a(c.this.a(), new a(2));
                }
            };
        }
    }

    private be() {
    }

    public static c<Object> a() {
        l.a(8, "expectedKeys");
        return new c<Object>(8) {
            /* access modifiers changed from: package-private */
            public final <K, V> Map<K, Collection<V>> a() {
                return p.createWithExpectedSize(8);
            }
        };
    }

    /* synthetic */ be(byte b2) {
        this();
    }
}
