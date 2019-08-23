package com.ss.android.ugc.aweme.splash;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.splash.SplashActivity;

public final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71591a;

    /* renamed from: b  reason: collision with root package name */
    private final SplashActivity.a f71592b;

    d(SplashActivity.a aVar) {
        this.f71592b = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogInterface dialogInterface2 = dialogInterface;
        if (PatchProxy.isSupport(new Object[]{dialogInterface2, Integer.valueOf(i)}, this, f71591a, false, 81846, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface2, Integer.valueOf(i)}, this, f71591a, false, 81846, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        SplashActivity.lambda$showConfirmUseNetworkDlg$1$SplashActivity(this.f71592b, dialogInterface2, i);
    }
}
