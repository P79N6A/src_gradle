package com.ss.android.ugc.aweme.setting.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64418a;

    /* renamed from: b  reason: collision with root package name */
    private final BlackListActivity f64419b;

    c(BlackListActivity blackListActivity) {
        this.f64419b = blackListActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f64418a, false, 72423, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f64418a, false, 72423, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        BlackListActivity blackListActivity = this.f64419b;
        blackListActivity.mStatusView.d();
        if (PatchProxy.isSupport(new Object[0], blackListActivity, BlackListActivity.f64113a, false, 72420, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], blackListActivity, BlackListActivity.f64113a, false, 72420, new Class[0], Void.TYPE);
            return;
        }
        if (blackListActivity.f64114b != null) {
            blackListActivity.f64114b.a(1);
        }
    }
}
