package com.ss.android.ugc.aweme.bizactivity;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35218a;

    /* renamed from: b  reason: collision with root package name */
    private final BizActivityFloatDialogHelper f35219b;

    a(BizActivityFloatDialogHelper bizActivityFloatDialogHelper) {
        this.f35219b = bizActivityFloatDialogHelper;
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f35218a, false, 25684, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f35218a, false, 25684, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f35219b.a(view2);
    }
}
