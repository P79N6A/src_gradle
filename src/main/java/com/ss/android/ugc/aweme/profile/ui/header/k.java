package com.ss.android.ugc.aweme.profile.ui.header;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62911a;

    /* renamed from: b  reason: collision with root package name */
    private final a f62912b;

    k(a aVar) {
        this.f62912b = aVar;
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f62911a, false, 69402, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f62911a, false, 69402, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f62912b.d(view2);
    }
}