package com.ss.android.ugc.aweme.newfollow.vh;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.comment.adapter.CommentViewHolder;
import com.ss.android.ugc.aweme.comment.adapter.CommentViewHolderNewStyle;
import com.ss.android.ugc.aweme.comment.model.Comment;

public class CommentViewHolderFollowFeed extends CommentViewHolderNewStyle {
    public static ChangeQuickRedirect l;

    public final boolean g() {
        return true;
    }

    public final void a(Comment comment) {
        if (PatchProxy.isSupport(new Object[]{comment}, this, l, false, 62102, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment}, this, l, false, 62102, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        super.a(comment);
        this.mCommentTimeView.setVisibility(8);
        this.mContentView.setTextColor(d.a().getResources().getColor(C0906R.color.zt));
        this.mReplyContentView.setTextColor(d.a().getResources().getColor(C0906R.color.zt));
        this.mReplyDivider.setBackgroundResource(2130837973);
        this.mTvRelationLabel.setBackgroundResource(2130838158);
        this.mTvReplyCommentRelationLabel.setBackgroundResource(2130838158);
    }

    public CommentViewHolderFollowFeed(View view, CommentViewHolder.a aVar, String str) {
        super(view, aVar, str);
        view.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57499a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f57499a, false, 62103, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f57499a, false, 62103, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (CommentViewHolderFollowFeed.this.j != null) {
                    CommentViewHolderFollowFeed.this.j.a(CommentViewHolderFollowFeed.this.h, CommentViewHolderFollowFeed.this.f36314b);
                }
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57501a;

            public final boolean onLongClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f57501a, false, 62104, new Class[]{View.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, this, f57501a, false, 62104, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
                }
                if (CommentViewHolderFollowFeed.this.j != null) {
                    CommentViewHolderFollowFeed.this.j.b(CommentViewHolderFollowFeed.this.h, CommentViewHolderFollowFeed.this.f36314b);
                }
                return true;
            }
        });
    }
}
