package com.ss.android.ugc.aweme.profile.ui.header;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62896a;

    /* renamed from: b  reason: collision with root package name */
    private final a f62897b;

    e(a aVar) {
        this.f62897b = aVar;
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f62896a, false, 69396, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f62896a, false, 69396, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f62897b.d(view2);
    }
}
