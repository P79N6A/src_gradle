package com.google.common.b;

import com.google.common.a.d;
import com.google.common.a.i;
import com.google.common.a.m;
import com.google.common.a.s;
import com.google.common.a.t;
import com.google.common.a.v;
import com.google.common.annotations.GwtCompatible;
import com.google.common.b.a;
import com.google.common.b.g;
import com.google.errorprone.annotations.CheckReturnValue;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

@GwtCompatible
public final class c<K, V> {

    /* renamed from: a  reason: collision with root package name */
    static final s<? extends a.b> f24432a = new t.c(new a.b() {
        public final void a() {
        }

        public final void a(int i) {
        }

        public final void a(long j) {
        }

        public final void b(int i) {
        }

        public final void b(long j) {
        }

        public final e b() {
            return c.f24433b;
        }
    });

    /* renamed from: b  reason: collision with root package name */
    static final e f24433b;

    /* renamed from: c  reason: collision with root package name */
    static final s<a.b> f24434c = new s<a.b>() {
        public final /* synthetic */ Object get() {
            return new a.C0279a();
        }
    };

    /* renamed from: d  reason: collision with root package name */
    static final v f24435d = new v() {
        public final long a() {
            return 0;
        }
    };
    private static final Logger u = Logger.getLogger(c.class.getName());

    /* renamed from: e  reason: collision with root package name */
    boolean f24436e = true;

    /* renamed from: f  reason: collision with root package name */
    int f24437f = -1;
    int g = -1;
    long h = -1;
    long i = -1;
    @MonotonicNonNullDecl
    p<? super K, ? super V> j;
    @MonotonicNonNullDecl
    g.p k;
    @MonotonicNonNullDecl
    g.p l;
    long m = -1;
    long n = -1;
    long o = -1;
    @MonotonicNonNullDecl
    d<Object> p;
    @MonotonicNonNullDecl
    d<Object> q;
    @MonotonicNonNullDecl
    m<? super K, ? super V> r;
    @MonotonicNonNullDecl
    v s;
    public s<? extends a.b> t = f24432a;

    enum a implements m<Object, Object> {
        INSTANCE;

        public final void onRemoval(n<Object, Object> nVar) {
        }
    }

    enum b implements p<Object, Object> {
        INSTANCE;

        public final int weigh(Object obj, Object obj2) {
            return 1;
        }
    }

    public static c<Object, Object> a() {
        return new c<>();
    }

    /* access modifiers changed from: package-private */
    public final g.p b() {
        return (g.p) i.a(this.k, g.p.STRONG);
    }

    /* access modifiers changed from: package-private */
    public final g.p c() {
        return (g.p) i.a(this.l, g.p.STRONG);
    }

    private c() {
    }

    static {
        e eVar = new e(0, 0, 0, 0, 0, 0);
        f24433b = eVar;
    }

    public final <K1 extends K, V1 extends V> b<K1, V1> d() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.j == null) {
            if (this.i == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            m.b(z2, (Object) "maximumWeight requires weigher");
        } else if (this.f24436e) {
            if (this.i != -1) {
                z = true;
            } else {
                z = false;
            }
            m.b(z, (Object) "weigher requires maximumWeight");
        } else if (this.i == -1) {
            u.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
        if (this.o == -1) {
            z3 = true;
        }
        m.b(z3, (Object) "refreshAfterWrite requires a LoadingCache");
        return new g.k(this);
    }

    public final String toString() {
        i.a a2 = i.a(this);
        if (this.f24437f != -1) {
            a2.a("initialCapacity", this.f24437f);
        }
        if (this.g != -1) {
            a2.a("concurrencyLevel", this.g);
        }
        if (this.h != -1) {
            a2.a("maximumSize", this.h);
        }
        if (this.i != -1) {
            a2.a("maximumWeight", this.i);
        }
        if (this.m != -1) {
            a2.a("expireAfterWrite", (Object) this.m + NotificationStyle.NOTIFICATION_STYLE);
        }
        if (this.n != -1) {
            a2.a("expireAfterAccess", (Object) this.n + NotificationStyle.NOTIFICATION_STYLE);
        }
        if (this.k != null) {
            a2.a("keyStrength", (Object) com.google.common.a.c.a(this.k.toString()));
        }
        if (this.l != null) {
            a2.a("valueStrength", (Object) com.google.common.a.c.a(this.l.toString()));
        }
        if (this.p != null) {
            a2.a("keyEquivalence");
        }
        if (this.q != null) {
            a2.a("valueEquivalence");
        }
        if (this.r != null) {
            a2.a("removalListener");
        }
        return a2.toString();
    }

    public final c<K, V> a(g.p pVar) {
        boolean z;
        if (this.l == null) {
            z = true;
        } else {
            z = false;
        }
        m.a(z, "Value strength was already set to %s", (Object) this.l);
        this.l = (g.p) m.a(pVar);
        return this;
    }

    public final c<K, V> a(long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (this.h == -1) {
            z = true;
        } else {
            z = false;
        }
        m.a(z, "maximum size was already set to %s", this.h);
        if (this.i == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        m.a(z2, "maximum weight was already set to %s", this.i);
        if (this.j == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        m.b(z3, (Object) "maximum size can not be combined with weigher");
        if (j2 >= 0) {
            z4 = true;
        }
        m.a(z4, (Object) "maximum size must not be negative");
        this.h = j2;
        return this;
    }

    @CheckReturnValue
    public final <K1 extends K, V1 extends V> c<K1, V1> a(m<? super K1, ? super V1> mVar) {
        boolean z;
        if (this.r == null) {
            z = true;
        } else {
            z = false;
        }
        m.b(z);
        this.r = (m) m.a(mVar);
        return this;
    }
}
