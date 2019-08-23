package com.ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements View.OnLongClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36346a;

    /* renamed from: b  reason: collision with root package name */
    private final CommentReplyViewHolder f36347b;

    d(CommentReplyViewHolder commentReplyViewHolder) {
        this.f36347b = commentReplyViewHolder;
    }

    public final boolean onLongClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f36346a, false, 27241, new Class[]{View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, this, f36346a, false, 27241, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
        }
        CommentReplyViewHolder commentReplyViewHolder = this.f36347b;
        if (!(commentReplyViewHolder.f36296b == null || commentReplyViewHolder.f36297c == null)) {
            commentReplyViewHolder.f36296b.b(commentReplyViewHolder.f36298d, commentReplyViewHolder.f36297c);
        }
        return true;
    }
}
