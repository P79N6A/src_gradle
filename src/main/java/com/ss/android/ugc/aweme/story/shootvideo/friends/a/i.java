package com.ss.android.ugc.aweme.story.shootvideo.friends.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.c;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73545a;

    /* renamed from: b  reason: collision with root package name */
    private final g f73546b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f73547c;

    i(g gVar, boolean z) {
        this.f73546b = gVar;
        this.f73547c = z;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f73545a, false, 85330, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73545a, false, 85330, new Class[0], Void.TYPE);
            return;
        }
        g gVar = this.f73546b;
        if (this.f73547c) {
            ((c) gVar.f2979f).a(gVar.f73541b, ((f) gVar.i()).b());
        } else {
            ((c) gVar.f2979f).b(gVar.f73541b, ((f) gVar.i()).b());
        }
    }
}
