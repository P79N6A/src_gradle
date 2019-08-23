package com.ss.android.ugc.aweme.filter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class aj implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47492a;

    /* renamed from: b  reason: collision with root package name */
    private final FilterScrollerModule f47493b;

    aj(FilterScrollerModule filterScrollerModule) {
        this.f47493b = filterScrollerModule;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f47492a, false, 44348, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f47492a, false, 44348, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f47493b.b();
    }
}
