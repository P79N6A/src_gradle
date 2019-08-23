package com.ss.android.ugc.aweme.challenge.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35712a;

    /* renamed from: b  reason: collision with root package name */
    private final DetailAwemeListFragment f35713b;

    o(DetailAwemeListFragment detailAwemeListFragment) {
        this.f35713b = detailAwemeListFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f35712a, false, 26267, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f35712a, false, 26267, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f35713b.o();
    }
}
