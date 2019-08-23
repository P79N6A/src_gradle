package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class v implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62981a;

    /* renamed from: b  reason: collision with root package name */
    private final EnterpriseTransformLayout f62982b;

    /* renamed from: c  reason: collision with root package name */
    private final String f62983c;

    /* renamed from: d  reason: collision with root package name */
    private final String f62984d;

    v(EnterpriseTransformLayout enterpriseTransformLayout, String str, String str2) {
        this.f62982b = enterpriseTransformLayout;
        this.f62983c = str;
        this.f62984d = str2;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62981a, false, 68045, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62981a, false, 68045, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        EnterpriseTransformLayout enterpriseTransformLayout = this.f62982b;
        String str = this.f62983c;
        String str2 = this.f62984d;
        enterpriseTransformLayout.a(str);
        enterpriseTransformLayout.a(str2, str);
    }
}
