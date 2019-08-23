package com.ss.android.ugc.effectmanager.d.a;

import com.ss.android.ugc.effectmanager.common.e.a;
import com.ss.android.ugc.effectmanager.common.e.d;
import com.ss.android.ugc.effectmanager.link.LinkSelector;

public final class b extends a {

    /* renamed from: b  reason: collision with root package name */
    private LinkSelector f77351b;

    public b(LinkSelector linkSelector) {
        this.f77351b = linkSelector;
    }

    public final boolean a(a aVar) {
        if ((aVar instanceof d) && ((d) aVar).f77324d.equals("NETWORK")) {
            this.f77351b.b();
        }
        return false;
    }
}
