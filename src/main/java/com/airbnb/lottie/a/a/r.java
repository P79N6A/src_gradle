package com.airbnb.lottie.a.a;

import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.c.b.q;
import java.util.ArrayList;
import java.util.List;

public final class r implements b, a.C0033a {

    /* renamed from: a  reason: collision with root package name */
    public final q.a f4638a;

    /* renamed from: b  reason: collision with root package name */
    public final a<?, Float> f4639b;

    /* renamed from: c  reason: collision with root package name */
    public final a<?, Float> f4640c;

    /* renamed from: d  reason: collision with root package name */
    public final a<?, Float> f4641d;

    /* renamed from: e  reason: collision with root package name */
    private final String f4642e;

    /* renamed from: f  reason: collision with root package name */
    private final List<a.C0033a> f4643f = new ArrayList();

    public final void a(List<b> list, List<b> list2) {
    }

    public final String b() {
        return this.f4642e;
    }

    public final void a() {
        for (int i = 0; i < this.f4643f.size(); i++) {
            this.f4643f.get(i).a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(a.C0033a aVar) {
        this.f4643f.add(aVar);
    }

    public r(com.airbnb.lottie.c.c.a aVar, q qVar) {
        this.f4642e = qVar.f4761a;
        this.f4638a = qVar.f4762b;
        this.f4639b = qVar.f4763c.a();
        this.f4640c = qVar.f4764d.a();
        this.f4641d = qVar.f4765e.a();
        aVar.a(this.f4639b);
        aVar.a(this.f4640c);
        aVar.a(this.f4641d);
        this.f4639b.a((a.C0033a) this);
        this.f4640c.a((a.C0033a) this);
        this.f4641d.a((a.C0033a) this);
    }
}
