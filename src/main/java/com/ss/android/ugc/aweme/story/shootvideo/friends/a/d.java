package com.ss.android.ugc.aweme.story.shootvideo.friends.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73531a;

    /* renamed from: b  reason: collision with root package name */
    private final c f73532b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f73533c;

    d(c cVar, boolean z) {
        this.f73532b = cVar;
        this.f73533c = z;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f73531a, false, 85323, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73531a, false, 85323, new Class[0], Void.TYPE);
            return;
        }
        c cVar = this.f73532b;
        boolean z = this.f73533c;
        if (z) {
            cVar.f73530b = ((b) cVar.i()).a();
        } else {
            cVar.f73530b = ((b) cVar.i()).c();
        }
        a.b(new e(cVar, z));
    }
}
