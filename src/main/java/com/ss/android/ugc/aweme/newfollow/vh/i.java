package com.ss.android.ugc.aweme.newfollow.vh;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.comment.adapter.CommentViewHolder;
import com.ss.android.ugc.aweme.comment.widget.a;

public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57719a;

    /* renamed from: b  reason: collision with root package name */
    private final CommentFollowFeedMomentViewHolder f57720b;

    /* renamed from: c  reason: collision with root package name */
    private final CommentViewHolder.a f57721c;

    i(CommentFollowFeedMomentViewHolder commentFollowFeedMomentViewHolder, CommentViewHolder.a aVar) {
        this.f57720b = commentFollowFeedMomentViewHolder;
        this.f57721c = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f57719a, false, 62098, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f57719a, false, 62098, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        CommentFollowFeedMomentViewHolder commentFollowFeedMomentViewHolder = this.f57720b;
        CommentViewHolder.a aVar = this.f57721c;
        if (aVar != null) {
            aVar.a((a) null, commentFollowFeedMomentViewHolder.f57493b);
        }
    }
}
