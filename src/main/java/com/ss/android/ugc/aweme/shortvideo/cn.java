package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cn implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66024a;

    /* renamed from: b  reason: collision with root package name */
    private final cj f66025b;

    /* renamed from: c  reason: collision with root package name */
    private final String f66026c;

    cn(cj cjVar, String str) {
        this.f66025b = cjVar;
        this.f66026c = str;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f66024a, false, 74221, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66024a, false, 74221, new Class[0], Void.TYPE);
            return;
        }
        cj cjVar = this.f66025b;
        cjVar.f66013b.a(this.f66026c);
    }
}
