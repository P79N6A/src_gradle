package com.ss.android.ugc.aweme.feed.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46663a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseCellFeedFragment f46664b;

    d(BaseCellFeedFragment baseCellFeedFragment) {
        this.f46664b = baseCellFeedFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f46663a, false, 42436, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f46663a, false, 42436, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f46664b.d(false);
    }
}
