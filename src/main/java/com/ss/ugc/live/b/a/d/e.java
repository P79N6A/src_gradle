package com.ss.ugc.live.b.a.d;

import com.ss.ugc.live.b.a.b.b;
import com.ss.ugc.live.b.a.b.c;

public final class e implements a<String> {

    /* renamed from: a  reason: collision with root package name */
    private static d<String> f78648a;

    /* renamed from: b  reason: collision with root package name */
    private static d<String> f78649b;

    /* renamed from: c  reason: collision with root package name */
    private b f78650c = new c();

    private d<String> a(com.ss.ugc.live.b.a.e eVar) {
        return new b(new c(this.f78650c, eVar.f78653a));
    }

    public final d<String> a(com.ss.ugc.live.b.a.c cVar, com.ss.ugc.live.b.a.e eVar) {
        if (!cVar.f78638e) {
            if (f78649b != null) {
                return f78649b;
            }
            d<String> a2 = a(eVar);
            f78649b = a2;
            return a2;
        } else if (f78648a != null) {
            return f78648a;
        } else {
            f fVar = new f(a(eVar));
            f78648a = fVar;
            return fVar;
        }
    }
}
