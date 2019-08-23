package com.ss.android.ugc.aweme.splash;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71601a;

    /* renamed from: b  reason: collision with root package name */
    private final SplashActivity f71602b;

    h(SplashActivity splashActivity) {
        this.f71602b = splashActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogInterface dialogInterface2 = dialogInterface;
        if (PatchProxy.isSupport(new Object[]{dialogInterface2, Integer.valueOf(i)}, this, f71601a, false, 81850, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface2, Integer.valueOf(i)}, this, f71601a, false, 81850, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f71602b.lambda$tryShowNotifyDialog$5$SplashActivity(dialogInterface2, i);
    }
}
