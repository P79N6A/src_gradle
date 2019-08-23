package com.ss.android.ugc.aweme.feed.h;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45505a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f45506b;

    k(Runnable runnable) {
        this.f45506b = runnable;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f45505a, false, 42038, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45505a, false, 42038, new Class[0], Void.TYPE);
            return;
        }
        a.b(this.f45506b);
    }
}
