package com.ss.android.ugc.aweme.miniapp.card;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55641a;

    /* renamed from: b  reason: collision with root package name */
    private final MicroAppVideoCardView f55642b;

    e(MicroAppVideoCardView microAppVideoCardView) {
        this.f55642b = microAppVideoCardView;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f55641a, false, 59196, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f55641a, false, 59196, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        MicroAppVideoCardView microAppVideoCardView = this.f55642b;
        if (microAppVideoCardView.m != null) {
            microAppVideoCardView.m.a();
        }
    }
}
