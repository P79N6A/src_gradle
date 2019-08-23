package com.ss.android.ugc.aweme.app.application;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33960a;

    /* renamed from: b  reason: collision with root package name */
    private final j f33961b;

    k(j jVar) {
        this.f33961b = jVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f33960a, false, 23224, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33960a, false, 23224, new Class[0], Void.TYPE);
            return;
        }
        j jVar = this.f33961b;
        if (jVar.f33959c != null) {
            for (a run : jVar.f33959c) {
                run.run();
            }
        }
        jVar.c();
    }
}
