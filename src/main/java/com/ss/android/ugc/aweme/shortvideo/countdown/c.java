package com.ss.android.ugc.aweme.shortvideo.countdown;

import com.facebook.c.b.k;
import com.facebook.c.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.anim.d;

public final /* synthetic */ class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66062a;

    /* renamed from: b  reason: collision with root package name */
    private final a f66063b;

    c(a aVar) {
        this.f66063b = aVar;
    }

    public final void a(k kVar, String str) {
        k kVar2 = kVar;
        if (PatchProxy.isSupport(new Object[]{kVar2, str}, this, f66062a, false, 75319, new Class[]{k.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVar2, str}, this, f66062a, false, 75319, new Class[]{k.class, String.class}, Void.TYPE);
            return;
        }
        a aVar = this.f66063b;
        aVar.f66056c = new e().a(kVar2).a();
        aVar.f66058e.setVisibility(0);
        aVar.f66058e.setLayerType(1, null);
        aVar.f66058e.setImageDrawable(aVar.f66056c);
        aVar.f66056c.a(aVar.f66059f);
        aVar.f66056c.a();
        aVar.f66056c.c();
    }
}
