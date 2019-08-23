package com.ss.android.ugc.aweme.main;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54855a;

    /* renamed from: b  reason: collision with root package name */
    private final MainActivity f54856b;

    m(MainActivity mainActivity) {
        this.f54856b = mainActivity;
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f54855a, false, 57203, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f54855a, false, 57203, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f54856b.lambda$setSplashSkipView$5$MainActivity(view2);
    }
}
