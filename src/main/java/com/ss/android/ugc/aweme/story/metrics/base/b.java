package com.ss.android.ugc.aweme.story.metrics.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73154a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f73155b;

    b(Runnable runnable) {
        this.f73155b = runnable;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f73154a, false, 84783, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73154a, false, 84783, new Class[0], Void.TYPE);
            return;
        }
        a.a(this.f73155b);
    }
}
