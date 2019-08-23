package com.ss.android.ugc.aweme.shortvideo.j;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dmt.av.video.b.l;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68270a;

    /* renamed from: b  reason: collision with root package name */
    private final c f68271b;

    /* renamed from: c  reason: collision with root package name */
    private final l f68272c;

    g(c cVar, l lVar) {
        this.f68271b = cVar;
        this.f68272c = lVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f68270a, false, 78476, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68270a, false, 78476, new Class[0], Void.TYPE);
            return;
        }
        c cVar = this.f68271b;
        l lVar = this.f68272c;
        cVar.a(lVar.f82941c, lVar.f82942d, lVar.f82940b);
    }
}
