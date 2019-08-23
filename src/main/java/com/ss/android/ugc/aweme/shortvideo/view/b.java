package com.ss.android.ugc.aweme.shortvideo.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71290a;

    /* renamed from: b  reason: collision with root package name */
    private final a f71291b;

    b(a aVar) {
        this.f71291b = aVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f71290a, false, 81206, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71290a, false, 81206, new Class[0], Void.TYPE);
            return;
        }
        this.f71291b.a();
    }
}
