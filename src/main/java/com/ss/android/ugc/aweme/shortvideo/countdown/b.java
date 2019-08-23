package com.ss.android.ugc.aweme.shortvideo.countdown;

import com.facebook.c.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements c.C0251c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66060a;

    /* renamed from: b  reason: collision with root package name */
    private final a f66061b;

    b(a aVar) {
        this.f66061b = aVar;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f66060a, false, 75318, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66060a, false, 75318, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f66061b;
        com.ss.android.ugc.aweme.util.c.a("onAnimationEnd() called");
        if (PatchProxy.isSupport(new Object[0], aVar, a.f66054a, false, 75317, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar, a.f66054a, false, 75317, new Class[0], Void.TYPE);
            return;
        }
        if (aVar.f66056c != null) {
            aVar.f66056c.a((c.C0251c) null);
            aVar.f66056c.b();
            aVar.f66058e.setImageDrawable(null);
            aVar.f66056c = null;
            aVar.f66058e.setVisibility(8);
            aVar.f66055b.b();
            aVar.f66057d.removeView(aVar.f66058e);
        }
    }
}
