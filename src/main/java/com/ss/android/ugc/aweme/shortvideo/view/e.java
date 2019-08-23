package com.ss.android.ugc.aweme.shortvideo.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71299a;

    /* renamed from: b  reason: collision with root package name */
    private final d f71300b;

    e(d dVar) {
        this.f71300b = dVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f71299a, false, 81223, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71299a, false, 81223, new Class[0], Void.TYPE);
            return;
        }
        this.f71300b.b();
    }
}
