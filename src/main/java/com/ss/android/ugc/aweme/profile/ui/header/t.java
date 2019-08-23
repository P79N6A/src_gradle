package com.ss.android.ugc.aweme.profile.ui.header;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.c.a.a;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62929a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsMyCommonHeaderLayout f62930b;

    t(AbsMyCommonHeaderLayout absMyCommonHeaderLayout) {
        this.f62930b = absMyCommonHeaderLayout;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62929a, false, 69477, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62929a, false, 69477, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        AbsMyCommonHeaderLayout absMyCommonHeaderLayout = this.f62930b;
        if (!a.a(view)) {
            r.a("edit_profile", (Map) d.a().a("enter_method", "click_add_pro").f34114b);
            absMyCommonHeaderLayout.y();
        }
    }
}
