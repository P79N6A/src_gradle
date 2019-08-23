package com.google.common.collect;

import com.google.common.a.c;
import com.google.common.a.d;
import com.google.common.a.i;
import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.bb;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

@GwtCompatible
public final class ba {

    /* renamed from: a  reason: collision with root package name */
    boolean f24614a;

    /* renamed from: b  reason: collision with root package name */
    int f24615b = -1;

    /* renamed from: c  reason: collision with root package name */
    int f24616c = -1;
    @MonotonicNonNullDecl

    /* renamed from: d  reason: collision with root package name */
    bb.n f24617d;
    @MonotonicNonNullDecl

    /* renamed from: e  reason: collision with root package name */
    bb.n f24618e;
    @MonotonicNonNullDecl

    /* renamed from: f  reason: collision with root package name */
    d<Object> f24619f;

    /* access modifiers changed from: package-private */
    public final int a() {
        if (this.f24615b == -1) {
            return 16;
        }
        return this.f24615b;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        if (this.f24616c == -1) {
            return 4;
        }
        return this.f24616c;
    }

    /* access modifiers changed from: package-private */
    public final bb.n c() {
        return (bb.n) i.a(this.f24617d, bb.n.STRONG);
    }

    /* access modifiers changed from: package-private */
    public final bb.n d() {
        return (bb.n) i.a(this.f24618e, bb.n.STRONG);
    }

    public final <K, V> ConcurrentMap<K, V> e() {
        if (!this.f24614a) {
            return new ConcurrentHashMap(a(), 0.75f, b());
        }
        if (c() == bb.n.STRONG && d() == bb.n.STRONG) {
            return new bb(this, bb.o.a.f24645a);
        }
        if (c() == bb.n.STRONG && d() == bb.n.WEAK) {
            return new bb(this, bb.q.a.f24647a);
        }
        if (c() == bb.n.WEAK && d() == bb.n.STRONG) {
            return new bb(this, bb.v.a.f24651a);
        }
        if (c() == bb.n.WEAK && d() == bb.n.WEAK) {
            return new bb(this, bb.x.a.f24653a);
        }
        throw new AssertionError();
    }

    public final String toString() {
        i.a a2 = i.a(this);
        if (this.f24615b != -1) {
            a2.a("initialCapacity", this.f24615b);
        }
        if (this.f24616c != -1) {
            a2.a("concurrencyLevel", this.f24616c);
        }
        if (this.f24617d != null) {
            a2.a("keyStrength", (Object) c.a(this.f24617d.toString()));
        }
        if (this.f24618e != null) {
            a2.a("valueStrength", (Object) c.a(this.f24618e.toString()));
        }
        if (this.f24619f != null) {
            a2.a("keyEquivalence");
        }
        return a2.toString();
    }

    /* access modifiers changed from: package-private */
    public final ba a(bb.n nVar) {
        boolean z;
        if (this.f24617d == null) {
            z = true;
        } else {
            z = false;
        }
        m.a(z, "Key strength was already set to %s", (Object) this.f24617d);
        this.f24617d = (bb.n) m.a(nVar);
        if (nVar != bb.n.STRONG) {
            this.f24614a = true;
        }
        return this;
    }
}
