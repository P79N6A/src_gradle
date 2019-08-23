package com.ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.comment.f;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36348a;

    /* renamed from: b  reason: collision with root package name */
    private final CommentReplyViewHolder f36349b;

    e(CommentReplyViewHolder commentReplyViewHolder) {
        this.f36349b = commentReplyViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f36348a, false, 27242, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f36348a, false, 27242, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        CommentReplyViewHolder commentReplyViewHolder = this.f36349b;
        if (commentReplyViewHolder.f36296b != null && f.f36433c.b(commentReplyViewHolder.f36297c)) {
            commentReplyViewHolder.f36296b.c(commentReplyViewHolder.f36297c);
        }
    }
}
