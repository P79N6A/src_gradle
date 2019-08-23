package com.ss.android.ugc.aweme.iesapi.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.iesapi.a;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50043a;

    /* renamed from: b  reason: collision with root package name */
    private final c f50044b;

    /* renamed from: c  reason: collision with root package name */
    private final a.C0592a f50045c;

    public d(c cVar, a.C0592a aVar) {
        this.f50044b = cVar;
        this.f50045c = aVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f50043a, false, 50014, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50043a, false, 50014, new Class[0], Void.TYPE);
            return;
        }
        this.f50044b.c(this.f50045c);
    }
}
