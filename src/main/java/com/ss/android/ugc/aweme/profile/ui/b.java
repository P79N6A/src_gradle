package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.x;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62501a;

    /* renamed from: b  reason: collision with root package name */
    private final AwemeListFragment f62502b;

    b(AwemeListFragment awemeListFragment) {
        this.f62502b = awemeListFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62501a, false, 67805, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62501a, false, 67805, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        AwemeListFragment awemeListFragment = this.f62502b;
        x.a().d().a(Boolean.TRUE);
        awemeListFragment.E.setVisibility(8);
    }
}
