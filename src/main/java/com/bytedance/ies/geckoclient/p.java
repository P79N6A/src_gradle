package com.bytedance.ies.geckoclient;

import com.bytedance.common.utility.Lists;
import com.bytedance.ies.geckoclient.b.b;
import com.bytedance.ies.geckoclient.d.a;
import com.bytedance.ies.geckoclient.d.c;
import com.bytedance.ies.geckoclient.model.k;

public final class p extends a {

    /* renamed from: b  reason: collision with root package name */
    private k f20834b = o.a().b();

    public final void run() {
        try {
            if (!Lists.isEmpty(this.f20834b.f20827b)) {
                a aVar = this.f20699a;
                k kVar = this.f20834b;
                c.a().f20725b.a("https://" + aVar.f20722a + "gecko/server/packages/stats", b.a().f20720a.toJson((Object) kVar));
            }
        } catch (Exception unused) {
        }
    }

    public p(a aVar) {
        super(aVar);
    }
}
