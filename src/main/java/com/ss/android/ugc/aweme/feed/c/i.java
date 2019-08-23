package com.ss.android.ugc.aweme.feed.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45103a;

    /* renamed from: b  reason: collision with root package name */
    private final c f45104b;

    /* renamed from: c  reason: collision with root package name */
    private final long f45105c;

    i(c cVar, long j) {
        this.f45104b = cVar;
        this.f45105c = j;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f45103a, false, 40968, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45103a, false, 40968, new Class[0], Void.TYPE);
            return;
        }
        c cVar = this.f45104b;
        cVar.f45088d.animate().alpha(1.0f).translationX(0.0f).setDuration(this.f45105c).start();
    }
}
