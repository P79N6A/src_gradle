package com.ss.android.ugc.aweme.feed.panel;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45721a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseListFragmentPanel f45722b;

    d(BaseListFragmentPanel baseListFragmentPanel) {
        this.f45722b = baseListFragmentPanel;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f45721a, false, 41736, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f45721a, false, 41736, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f45722b.aS();
    }
}
