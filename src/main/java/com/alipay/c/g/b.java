package com.alipay.c.g;

import com.alipay.c.g.a;
import java.util.Map;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Map f5347a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a.C0040a f5348b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a f5349c;

    b(a aVar, Map map, a.C0040a aVar2) {
        this.f5349c = aVar;
        this.f5347a = map;
        this.f5348b = aVar2;
    }

    public final void run() {
        new com.alipay.c.a.a(this.f5349c.f5341a).a(this.f5347a);
        if (this.f5348b != null) {
            this.f5349c.a();
        }
    }
}
