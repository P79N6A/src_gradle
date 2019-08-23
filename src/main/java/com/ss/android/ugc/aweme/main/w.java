package com.ss.android.ugc.aweme.main;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.c.a.a;

public final /* synthetic */ class w implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55000a;

    /* renamed from: b  reason: collision with root package name */
    private final MainFragment f55001b;

    w(MainFragment mainFragment) {
        this.f55001b = mainFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f55000a, false, 57325, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f55000a, false, 57325, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        MainFragment mainFragment = this.f55001b;
        if (!a.a(view)) {
            com.ss.android.ugc.aweme.main.d.a.a(false, "homepage_follow", "capsule");
            if (mainFragment.d()) {
                mainFragment.a(3, "");
            }
        }
    }
}
