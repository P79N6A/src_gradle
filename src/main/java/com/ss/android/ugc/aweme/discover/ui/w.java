package com.ss.android.ugc.aweme.discover.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class w implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43201a;

    /* renamed from: b  reason: collision with root package name */
    private final HotSearchAndDiscoveryFragment2 f43202b;

    w(HotSearchAndDiscoveryFragment2 hotSearchAndDiscoveryFragment2) {
        this.f43202b = hotSearchAndDiscoveryFragment2;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f43201a, false, 37646, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f43201a, false, 37646, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f43202b.o();
    }
}
