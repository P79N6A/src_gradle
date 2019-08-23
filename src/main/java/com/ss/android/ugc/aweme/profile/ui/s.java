package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class s implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62969a;

    /* renamed from: b  reason: collision with root package name */
    private final EnterpriseTransformLayout f62970b;

    /* renamed from: c  reason: collision with root package name */
    private final String f62971c;

    s(EnterpriseTransformLayout enterpriseTransformLayout, String str) {
        this.f62970b = enterpriseTransformLayout;
        this.f62971c = str;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62969a, false, 68042, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62969a, false, 68042, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f62970b.a(this.f62971c);
    }
}
