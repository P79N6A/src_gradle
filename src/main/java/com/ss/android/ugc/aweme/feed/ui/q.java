package com.ss.android.ugc.aweme.feed.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46827a;

    /* renamed from: b  reason: collision with root package name */
    private final p f46828b;

    /* renamed from: c  reason: collision with root package name */
    private final String f46829c;

    q(p pVar, String str) {
        this.f46828b = pVar;
        this.f46829c = str;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f46827a, false, 42703, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46827a, false, 42703, new Class[0], Void.TYPE);
            return;
        }
        p pVar = this.f46828b;
        pVar.onShareComplete(pVar.a(this.f46829c, pVar.f46811c.getAid()));
    }
}
