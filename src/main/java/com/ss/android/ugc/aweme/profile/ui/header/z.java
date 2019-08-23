package com.ss.android.ugc.aweme.profile.ui.header;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class z implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62943a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsMyCommonHeaderLayout f62944b;

    z(AbsMyCommonHeaderLayout absMyCommonHeaderLayout) {
        this.f62944b = absMyCommonHeaderLayout;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62943a, false, 69483, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62943a, false, 69483, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        AbsMyCommonHeaderLayout absMyCommonHeaderLayout = this.f62944b;
        absMyCommonHeaderLayout.aw.setVisibility(8);
        absMyCommonHeaderLayout.au.y(true);
    }
}
