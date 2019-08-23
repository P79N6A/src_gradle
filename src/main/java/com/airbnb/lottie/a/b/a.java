package com.airbnb.lottie.a.b;

import android.support.annotation.FloatRange;
import android.support.annotation.Nullable;
import com.airbnb.lottie.g.c;
import java.util.ArrayList;
import java.util.List;

public abstract class a<K, A> {

    /* renamed from: a  reason: collision with root package name */
    final List<C0033a> f4644a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f4645b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f4646c = 0.0f;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    protected c<A> f4647d;

    /* renamed from: e  reason: collision with root package name */
    private final List<? extends com.airbnb.lottie.g.a<K>> f4648e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private com.airbnb.lottie.g.a<K> f4649f;

    /* renamed from: com.airbnb.lottie.a.b.a$a  reason: collision with other inner class name */
    public interface C0033a {
        void a();
    }

    /* access modifiers changed from: package-private */
    public abstract A a(com.airbnb.lottie.g.a<K> aVar, float f2);

    @FloatRange(from = 0.0d, to = 1.0d)
    private float f() {
        if (this.f4648e.isEmpty()) {
            return 0.0f;
        }
        return ((com.airbnb.lottie.g.a) this.f4648e.get(0)).a();
    }

    public void a() {
        for (int i = 0; i < this.f4644a.size(); i++) {
            this.f4644a.get(i).a();
        }
    }

    /* access modifiers changed from: package-private */
    @FloatRange(from = 0.0d, to = 1.0d)
    public float c() {
        if (this.f4648e.isEmpty()) {
            return 1.0f;
        }
        return ((com.airbnb.lottie.g.a) this.f4648e.get(this.f4648e.size() - 1)).b();
    }

    public A d() {
        float f2;
        com.airbnb.lottie.g.a e2 = e();
        com.airbnb.lottie.g.a e3 = e();
        if (e3.c()) {
            f2 = 0.0f;
        } else {
            f2 = e3.f4862d.getInterpolation(b());
        }
        return a(e2, f2);
    }

    /* access modifiers changed from: package-private */
    public final float b() {
        if (this.f4645b) {
            return 0.0f;
        }
        com.airbnb.lottie.g.a e2 = e();
        if (e2.c()) {
            return 0.0f;
        }
        return (this.f4646c - e2.a()) / (e2.b() - e2.a());
    }

    private com.airbnb.lottie.g.a<K> e() {
        if (this.f4649f != null && this.f4649f.a(this.f4646c)) {
            return this.f4649f;
        }
        com.airbnb.lottie.g.a<K> aVar = (com.airbnb.lottie.g.a) this.f4648e.get(this.f4648e.size() - 1);
        if (this.f4646c < aVar.a()) {
            for (int size = this.f4648e.size() - 1; size >= 0; size--) {
                aVar = (com.airbnb.lottie.g.a) this.f4648e.get(size);
                if (aVar.a(this.f4646c)) {
                    break;
                }
            }
        }
        this.f4649f = aVar;
        return aVar;
    }

    public final void a(C0033a aVar) {
        this.f4644a.add(aVar);
    }

    public final void a(@Nullable c<A> cVar) {
        if (this.f4647d != null) {
            this.f4647d.f4872c = null;
        }
        this.f4647d = cVar;
        if (cVar != null) {
            cVar.f4872c = this;
        }
    }

    a(List<? extends com.airbnb.lottie.g.a<K>> list) {
        this.f4648e = list;
    }

    public void a(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        if (f2 < f()) {
            f2 = f();
        } else if (f2 > c()) {
            f2 = c();
        }
        if (f2 != this.f4646c) {
            this.f4646c = f2;
            a();
        }
    }
}
