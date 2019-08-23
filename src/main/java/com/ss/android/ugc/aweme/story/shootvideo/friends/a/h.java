package com.ss.android.ugc.aweme.story.shootvideo.friends.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73542a;

    /* renamed from: b  reason: collision with root package name */
    private final g f73543b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f73544c;

    h(g gVar, boolean z) {
        this.f73543b = gVar;
        this.f73544c = z;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f73542a, false, 85329, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73542a, false, 85329, new Class[0], Void.TYPE);
            return;
        }
        g gVar = this.f73543b;
        boolean z = this.f73544c;
        if (z) {
            gVar.f73541b = ((f) gVar.i()).a();
        } else {
            gVar.f73541b = ((f) gVar.i()).c();
        }
        a.b(new i(gVar, z));
    }
}
