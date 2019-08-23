package com.bytedance.android.livesdk.s;

import com.bytedance.android.livesdkapi.b.c;
import com.bytedance.android.livesdkapi.depend.d.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17154a;

    /* renamed from: b  reason: collision with root package name */
    private final j f17155b;

    k(j jVar) {
        this.f17155b = jVar;
    }

    public final void a(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17154a, false, 12914, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17154a, false, 12914, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        j jVar = this.f17155b;
        boolean b2 = jVar.b();
        for (d a2 : jVar.f17150b) {
            a2.a(b2);
        }
    }
}
