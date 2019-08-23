package com.ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ab implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44866a;

    /* renamed from: b  reason: collision with root package name */
    private final StaggeredGridTimeLineViewHolder f44867b;

    ab(StaggeredGridTimeLineViewHolder staggeredGridTimeLineViewHolder) {
        this.f44867b = staggeredGridTimeLineViewHolder;
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f44866a, false, 40671, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f44866a, false, 40671, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f44867b.a(view2, false);
    }
}
