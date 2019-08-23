package com.ss.android.ugc.aweme.story.shootvideo.friends.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.c;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73534a;

    /* renamed from: b  reason: collision with root package name */
    private final c f73535b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f73536c;

    e(c cVar, boolean z) {
        this.f73535b = cVar;
        this.f73536c = z;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f73534a, false, 85324, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73534a, false, 85324, new Class[0], Void.TYPE);
            return;
        }
        c cVar = this.f73535b;
        if (this.f73536c) {
            ((c) cVar.f2979f).a(cVar.f73530b, ((b) cVar.i()).b());
        } else {
            ((c) cVar.f2979f).b(cVar.f73530b, ((b) cVar.i()).b());
        }
    }
}
