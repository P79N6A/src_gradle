package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class em implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67576a;

    /* renamed from: b  reason: collision with root package name */
    private final el f67577b;

    /* renamed from: c  reason: collision with root package name */
    private final ei f67578c;

    em(el elVar, ei eiVar) {
        this.f67577b = elVar;
        this.f67578c = eiVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f67576a, false, 74472, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67576a, false, 74472, new Class[0], Void.TYPE);
            return;
        }
        el elVar = this.f67577b;
        ei eiVar = this.f67578c;
        if (elVar.f67537b != null) {
            elVar.f67537b.a(elVar.f67540e.a(0, eiVar.e()));
        }
    }
}
