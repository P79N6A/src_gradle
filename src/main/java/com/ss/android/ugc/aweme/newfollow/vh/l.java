package com.ss.android.ugc.aweme.newfollow.vh;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57727a;

    /* renamed from: b  reason: collision with root package name */
    private final FlowFeedArticleItemViewHolder f57728b;

    public l(FlowFeedArticleItemViewHolder flowFeedArticleItemViewHolder) {
        this.f57728b = flowFeedArticleItemViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f57727a, false, 62151, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f57727a, false, 62151, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        FlowFeedArticleItemViewHolder flowFeedArticleItemViewHolder = this.f57728b;
        if (flowFeedArticleItemViewHolder.f57517b != null) {
            flowFeedArticleItemViewHolder.f57517b.a(flowFeedArticleItemViewHolder.f57518c, flowFeedArticleItemViewHolder.getAdapterPosition());
        }
    }
}
