package com.ss.android.ugc.aweme.splash;

import android.widget.CompoundButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71589a;

    /* renamed from: b  reason: collision with root package name */
    private final SplashActivity f71590b;

    c(SplashActivity splashActivity) {
        this.f71590b = splashActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CompoundButton compoundButton2 = compoundButton;
        if (PatchProxy.isSupport(new Object[]{compoundButton2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f71589a, false, 81845, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{compoundButton2, Byte.valueOf(z)}, this, f71589a, false, 81845, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f71590b.lambda$showConfirmUseNetworkDlg$0$SplashActivity(compoundButton2, z);
    }
}
