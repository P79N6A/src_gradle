package com.ss.android.ugc.aweme.splash;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71603a;

    /* renamed from: b  reason: collision with root package name */
    private final SplashActivity f71604b;

    i(SplashActivity splashActivity) {
        this.f71604b = splashActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogInterface dialogInterface2 = dialogInterface;
        if (PatchProxy.isSupport(new Object[]{dialogInterface2, Integer.valueOf(i)}, this, f71603a, false, 81851, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface2, Integer.valueOf(i)}, this, f71603a, false, 81851, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f71604b.lambda$tryShowNotifyDialog$6$SplashActivity(dialogInterface2, i);
    }
}
