package com.ss.android.ugc.aweme.profile.ui.header;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.c.a.a;

public final /* synthetic */ class v implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62933a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsMyCommonHeaderLayout f62934b;

    v(AbsMyCommonHeaderLayout absMyCommonHeaderLayout) {
        this.f62934b = absMyCommonHeaderLayout;
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f62933a, false, 69479, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f62933a, false, 69479, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        AbsMyCommonHeaderLayout absMyCommonHeaderLayout = this.f62934b;
        if (!a.a(view)) {
            absMyCommonHeaderLayout.g(view2);
        }
    }
}
