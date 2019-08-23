package com.facebook.c.b.a;

import com.facebook.c.b.c;
import java.util.List;

public final class g extends e<c, a> {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public float f23326a;

        public final float a() {
            return Math.abs(this.f23326a);
        }

        public final void a(float f2) {
            this.f23326a *= f2;
        }
    }

    private g() {
    }

    public g(List<c> list, float[][][] fArr) {
        super(list, fArr);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(com.facebook.c.b.a aVar, com.facebook.c.b.a aVar2, float f2, Object obj) {
        c cVar = (c) aVar;
        c cVar2 = (c) aVar2;
        a aVar3 = (a) obj;
        if (cVar2 == null) {
            aVar3.f23326a = cVar.f23337a[0];
        } else {
            aVar3.f23326a = a(cVar.f23337a[0], cVar2.f23337a[0], f2);
        }
    }
}
