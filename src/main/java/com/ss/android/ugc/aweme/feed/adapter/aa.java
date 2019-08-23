package com.ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class aa implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44864a;

    /* renamed from: b  reason: collision with root package name */
    private final StaggeredGridTimeLineViewHolder f44865b;

    aa(StaggeredGridTimeLineViewHolder staggeredGridTimeLineViewHolder) {
        this.f44865b = staggeredGridTimeLineViewHolder;
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f44864a, false, 40670, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f44864a, false, 40670, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f44865b.a(view2, true);
    }
}
