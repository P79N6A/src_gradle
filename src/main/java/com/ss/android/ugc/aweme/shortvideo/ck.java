package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ck implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66015a;

    /* renamed from: b  reason: collision with root package name */
    private final cj f66016b;

    /* renamed from: c  reason: collision with root package name */
    private final int f66017c;

    ck(cj cjVar, int i) {
        this.f66016b = cjVar;
        this.f66017c = i;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f66015a, false, 74218, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66015a, false, 74218, new Class[0], Void.TYPE);
            return;
        }
        cj cjVar = this.f66016b;
        cjVar.f66013b.a(this.f66017c);
    }
}
