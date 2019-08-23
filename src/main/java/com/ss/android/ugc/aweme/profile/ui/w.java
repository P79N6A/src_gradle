package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class w implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62985a;

    /* renamed from: b  reason: collision with root package name */
    private final EnterpriseTransformLayout f62986b;

    /* renamed from: c  reason: collision with root package name */
    private final String f62987c;

    /* renamed from: d  reason: collision with root package name */
    private final String f62988d;

    w(EnterpriseTransformLayout enterpriseTransformLayout, String str, String str2) {
        this.f62986b = enterpriseTransformLayout;
        this.f62987c = str;
        this.f62988d = str2;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62985a, false, 68046, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62985a, false, 68046, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        EnterpriseTransformLayout enterpriseTransformLayout = this.f62986b;
        String str = this.f62987c;
        String str2 = this.f62988d;
        enterpriseTransformLayout.a(str);
        enterpriseTransformLayout.a(str2, str);
    }
}
