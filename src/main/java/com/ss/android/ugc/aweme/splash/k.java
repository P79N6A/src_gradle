package com.ss.android.ugc.aweme.splash;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.splash.SplashActivity;

public final /* synthetic */ class k implements m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71607a;

    /* renamed from: b  reason: collision with root package name */
    private final SplashActivity f71608b;

    k(SplashActivity splashActivity) {
        this.f71608b = splashActivity;
    }

    public final void a(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, this, f71607a, false, 81868, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str2}, this, f71607a, false, 81868, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        SplashActivity.b.a(this.f71608b, str2);
    }
}
