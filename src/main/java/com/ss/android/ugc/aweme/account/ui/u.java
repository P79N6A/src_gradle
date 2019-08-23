package com.ss.android.ugc.aweme.account.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class u implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33071a;

    /* renamed from: b  reason: collision with root package name */
    private final VerifyIDCardFragment f33072b;

    u(VerifyIDCardFragment verifyIDCardFragment) {
        this.f33072b = verifyIDCardFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f33071a, false, 21284, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f33071a, false, 21284, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f33072b.d();
    }
}
