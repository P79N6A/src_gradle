package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66021a;

    /* renamed from: b  reason: collision with root package name */
    private final cj f66022b;

    /* renamed from: c  reason: collision with root package name */
    private final hn f66023c;

    cm(cj cjVar, hn hnVar) {
        this.f66022b = cjVar;
        this.f66023c = hnVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f66021a, false, 74220, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66021a, false, 74220, new Class[0], Void.TYPE);
            return;
        }
        cj cjVar = this.f66022b;
        cjVar.f66013b.a(this.f66023c);
    }
}
