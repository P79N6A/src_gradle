package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class eo implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67581a;

    /* renamed from: b  reason: collision with root package name */
    private final el f67582b;

    /* renamed from: c  reason: collision with root package name */
    private final ei f67583c;

    eo(el elVar, ei eiVar) {
        this.f67582b = elVar;
        this.f67583c = eiVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f67581a, false, 74474, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67581a, false, 74474, new Class[0], Void.TYPE);
            return;
        }
        el elVar = this.f67582b;
        elVar.f67537b.a(elVar.f67540e.a(1, this.f67583c.e()));
    }
}
