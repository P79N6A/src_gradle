package com.ss.android.ugc.aweme.hotsearch.share;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;

public final /* synthetic */ class k implements AnimatedImageView.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49841a;

    /* renamed from: b  reason: collision with root package name */
    private final g f49842b;

    k(g gVar) {
        this.f49842b = gVar;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f49841a, false, 49784, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49841a, false, 49784, new Class[0], Void.TYPE);
            return;
        }
        g gVar = this.f49842b;
        gVar.f49829b.setDrawingCacheEnabled(true);
        if (gVar.f49833f != null) {
            gVar.f49833f.countDown();
        }
    }
}
