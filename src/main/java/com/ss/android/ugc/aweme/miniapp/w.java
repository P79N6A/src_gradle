package com.ss.android.ugc.aweme.miniapp;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class w implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55973a;

    /* renamed from: b  reason: collision with root package name */
    private final RecentlyUsedMicroAppActivity f55974b;

    w(RecentlyUsedMicroAppActivity recentlyUsedMicroAppActivity) {
        this.f55974b = recentlyUsedMicroAppActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f55973a, false, 59111, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f55973a, false, 59111, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f55974b.b();
    }
}
