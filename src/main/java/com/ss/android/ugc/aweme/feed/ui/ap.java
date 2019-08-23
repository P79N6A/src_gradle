package com.ss.android.ugc.aweme.feed.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ap implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46505a;

    /* renamed from: b  reason: collision with root package name */
    private final LongPressLayout f46506b;

    ap(LongPressLayout longPressLayout) {
        this.f46506b = longPressLayout;
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f46505a, false, 42882, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f46505a, false, 42882, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        LongPressLayout longPressLayout = this.f46506b;
        if (longPressLayout.h != null) {
            longPressLayout.h.onClick(view2);
        }
        if (!longPressLayout.j) {
            longPressLayout.i.onClick(view2);
        }
        longPressLayout.j = false;
    }
}
