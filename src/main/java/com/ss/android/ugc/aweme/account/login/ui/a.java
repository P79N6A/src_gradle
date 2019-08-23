package com.ss.android.ugc.aweme.account.login.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.w;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32606a;

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f32607b = new a();

    private a() {
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f32606a, false, 20458, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32606a, false, 20458, new Class[0], Void.TYPE);
            return;
        }
        w.a(7, 4, "");
        if (w.h()) {
            w.a(3, 1, (Object) "");
        } else {
            w.a(3, 3, (Object) "");
        }
    }
}
