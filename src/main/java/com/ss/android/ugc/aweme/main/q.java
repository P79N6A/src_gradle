package com.ss.android.ugc.aweme.main;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54885a;

    /* renamed from: b  reason: collision with root package name */
    private final MainActivity f54886b;

    q(MainActivity mainActivity) {
        this.f54886b = mainActivity;
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f54885a, false, 57208, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f54885a, false, 57208, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f54886b.lambda$onAwesomeSplashEvent$9$MainActivity(view2);
    }
}
