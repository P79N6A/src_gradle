package com.ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36344a;

    /* renamed from: b  reason: collision with root package name */
    private final CommentReplyViewHolder f36345b;

    c(CommentReplyViewHolder commentReplyViewHolder) {
        this.f36345b = commentReplyViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f36344a, false, 27240, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f36344a, false, 27240, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        CommentReplyViewHolder commentReplyViewHolder = this.f36345b;
        if (commentReplyViewHolder.f36296b != null && commentReplyViewHolder.f36297c != null && commentReplyViewHolder.f36297c.getUser() != null) {
            commentReplyViewHolder.f36296b.a(commentReplyViewHolder.f36298d, commentReplyViewHolder.f36297c);
        }
    }
}
