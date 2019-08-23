package com.bytedance.jedi.model.guava.b;

import com.bytedance.jedi.model.guava.a.b;
import com.bytedance.jedi.model.guava.a.f;
import com.bytedance.jedi.model.guava.annotations.GwtCompatible;
import com.bytedance.jedi.model.guava.annotations.MonotonicNonNullDecl;
import com.bytedance.jedi.model.guava.b.c;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import java.util.logging.Level;
import java.util.logging.Logger;

@GwtCompatible
public final class b<K, V> {

    /* renamed from: a  reason: collision with root package name */
    static final f f21631a = new f() {
        public final long a() {
            return 0;
        }
    };
    private static final Logger q = Logger.getLogger(b.class.getName());

    /* renamed from: b  reason: collision with root package name */
    boolean f21632b = true;

    /* renamed from: c  reason: collision with root package name */
    int f21633c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f21634d = -1;

    /* renamed from: e  reason: collision with root package name */
    long f21635e = -1;

    /* renamed from: f  reason: collision with root package name */
    long f21636f = -1;
    @MonotonicNonNullDecl
    h<? super K, ? super V> g;
    @MonotonicNonNullDecl
    c.n h;
    @MonotonicNonNullDecl
    c.n i;
    long j = -1;
    long k = -1;
    long l = -1;
    @MonotonicNonNullDecl
    com.bytedance.jedi.model.guava.a.a<Object> m;
    @MonotonicNonNullDecl
    com.bytedance.jedi.model.guava.a.a<Object> n;
    @MonotonicNonNullDecl
    f<? super K, ? super V> o;
    @MonotonicNonNullDecl
    f p;

    enum a implements f<Object, Object> {
        INSTANCE;

        public final void onRemoval(g<Object, Object> gVar) {
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.b.b$b  reason: collision with other inner class name */
    enum C0219b implements h<Object, Object> {
        INSTANCE;

        public final int weigh(Object obj, Object obj2) {
            return 1;
        }
    }

    public static b<Object, Object> a() {
        return new b<>();
    }

    /* access modifiers changed from: package-private */
    public final c.n b() {
        return (c.n) com.bytedance.jedi.model.guava.a.b.a(this.h, c.n.STRONG);
    }

    /* access modifiers changed from: package-private */
    public final c.n c() {
        return (c.n) com.bytedance.jedi.model.guava.a.b.a(this.i, c.n.STRONG);
    }

    private b() {
    }

    public final <K1 extends K, V1 extends V> a<K1, V1> d() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.g == null) {
            if (this.f21636f == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            com.bytedance.jedi.model.guava.a.c.a(z2, "maximumWeight requires weigher");
        } else if (this.f21632b) {
            if (this.f21636f != -1) {
                z = true;
            } else {
                z = false;
            }
            com.bytedance.jedi.model.guava.a.c.a(z, "weigher requires maximumWeight");
        } else if (this.f21636f == -1) {
            q.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
        if (this.l == -1) {
            z3 = true;
        }
        com.bytedance.jedi.model.guava.a.c.a(z3, "refreshAfterWrite requires a LoadingCache");
        return new c.j(this);
    }

    public final String toString() {
        b.a aVar = new b.a(getClass().getSimpleName(), (byte) 0);
        if (this.f21633c != -1) {
            aVar.a("initialCapacity", this.f21633c);
        }
        if (this.f21634d != -1) {
            aVar.a("concurrencyLevel", this.f21634d);
        }
        if (this.f21635e != -1) {
            aVar.a("maximumSize", this.f21635e);
        }
        if (this.f21636f != -1) {
            aVar.a("maximumWeight", this.f21636f);
        }
        if (this.j != -1) {
            aVar.a("expireAfterWrite", (Object) this.j + NotificationStyle.NOTIFICATION_STYLE);
        }
        if (this.k != -1) {
            aVar.a("expireAfterAccess", (Object) this.k + NotificationStyle.NOTIFICATION_STYLE);
        }
        if (this.h != null) {
            aVar.a("keyStrength", (Object) this.h.toString());
        }
        if (this.i != null) {
            aVar.a("valueStrength", (Object) this.i.toString());
        }
        if (this.m != null) {
            aVar.a("keyEquivalence");
        }
        if (this.n != null) {
            aVar.a("valueEquivalence");
        }
        if (this.o != null) {
            aVar.a("removalListener");
        }
        return aVar.toString();
    }

    public final b<K, V> a(long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (this.f21635e == -1) {
            z = true;
        } else {
            z = false;
        }
        com.bytedance.jedi.model.guava.a.c.a(z, "maximum size was already set to %s", this.f21635e);
        if (this.f21636f == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.bytedance.jedi.model.guava.a.c.a(z2, "maximum weight was already set to %s", this.f21636f);
        if (this.g == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        com.bytedance.jedi.model.guava.a.c.a(z3, "maximum size can not be combined with weigher");
        if (j2 >= 0) {
            z4 = true;
        }
        if (z4) {
            this.f21635e = j2;
            return this;
        }
        throw new IllegalArgumentException(String.valueOf("maximum size must not be negative"));
    }
}
