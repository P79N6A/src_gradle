package com.ss.android.ugc.aweme.profile.ui.header;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class u implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62931a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsMyCommonHeaderLayout f62932b;

    u(AbsMyCommonHeaderLayout absMyCommonHeaderLayout) {
        this.f62932b = absMyCommonHeaderLayout;
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f62931a, false, 69478, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f62931a, false, 69478, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f62932b.i(view2);
    }
}
