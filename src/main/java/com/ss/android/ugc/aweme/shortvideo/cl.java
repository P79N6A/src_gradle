package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cl implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66018a;

    /* renamed from: b  reason: collision with root package name */
    private final cj f66019b;

    /* renamed from: c  reason: collision with root package name */
    private final at f66020c;

    cl(cj cjVar, at atVar) {
        this.f66019b = cjVar;
        this.f66020c = atVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f66018a, false, 74219, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66018a, false, 74219, new Class[0], Void.TYPE);
            return;
        }
        cj cjVar = this.f66019b;
        cjVar.f66013b.a(this.f66020c);
    }
}
