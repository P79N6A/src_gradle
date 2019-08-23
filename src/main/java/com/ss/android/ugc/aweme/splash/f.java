package com.ss.android.ugc.aweme.splash;

import android.app.Dialog;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.splash.SplashActivity;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71595a;

    /* renamed from: b  reason: collision with root package name */
    private final Dialog f71596b;

    /* renamed from: c  reason: collision with root package name */
    private final SplashActivity.a f71597c;

    f(Dialog dialog, SplashActivity.a aVar) {
        this.f71596b = dialog;
        this.f71597c = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f71595a, false, 81848, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f71595a, false, 81848, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        SplashActivity.lambda$showConfirmUseNetworkDlg$3$SplashActivity(this.f71596b, this.f71597c, view);
    }
}
