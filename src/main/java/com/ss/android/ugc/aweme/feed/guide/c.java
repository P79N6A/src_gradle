package com.ss.android.ugc.aweme.feed.guide;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.user.util.b;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45396a;

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f45397b = new c();

    private c() {
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f45396a, false, 41182, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45396a, false, 41182, new Class[0], Void.TYPE);
            return;
        }
        b.a().b();
    }
}
