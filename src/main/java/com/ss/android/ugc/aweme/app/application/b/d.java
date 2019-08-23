package com.ss.android.ugc.aweme.app.application.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33930a;

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f33931b = new d();

    private d() {
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f33930a, false, 23241, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33930a, false, 23241, new Class[0], Void.TYPE);
            return;
        }
        try {
            AbTestManager.a().b();
        } catch (Throwable unused) {
        }
    }
}
