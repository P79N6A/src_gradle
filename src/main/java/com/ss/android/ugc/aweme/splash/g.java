package com.ss.android.ugc.aweme.splash;

import android.app.Dialog;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.splash.SplashActivity;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71598a;

    /* renamed from: b  reason: collision with root package name */
    private final Dialog f71599b;

    /* renamed from: c  reason: collision with root package name */
    private final SplashActivity.a f71600c;

    g(Dialog dialog, SplashActivity.a aVar) {
        this.f71599b = dialog;
        this.f71600c = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f71598a, false, 81849, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f71598a, false, 81849, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        SplashActivity.lambda$showConfirmUseNetworkDlg$4$SplashActivity(this.f71599b, this.f71600c, view);
    }
}
