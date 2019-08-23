package com.ss.android.ugc.aweme.app.application.initialization;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.a.b.d;
import com.ss.android.ugc.a.e;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33952a;

    /* renamed from: b  reason: collision with root package name */
    private final e f33953b;

    /* renamed from: c  reason: collision with root package name */
    private final d f33954c;

    b(e eVar, d dVar) {
        this.f33953b = eVar;
        this.f33954c = dVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f33952a, false, 23259, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33952a, false, 23259, new Class[0], Void.TYPE);
            return;
        }
        e eVar = this.f33953b;
        d dVar = this.f33954c;
        a.a();
        com.ss.android.ugc.a.d.a().a(eVar, dVar);
    }
}
