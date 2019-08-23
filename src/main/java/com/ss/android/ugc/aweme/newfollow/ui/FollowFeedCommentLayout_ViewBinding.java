package com.ss.android.ugc.aweme.newfollow.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;

public class FollowFeedCommentLayout_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57223a;

    /* renamed from: b  reason: collision with root package name */
    private FollowFeedCommentLayout f57224b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f57223a, false, 61477, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57223a, false, 61477, new Class[0], Void.TYPE);
            return;
        }
        FollowFeedCommentLayout followFeedCommentLayout = this.f57224b;
        if (followFeedCommentLayout != null) {
            this.f57224b = null;
            followFeedCommentLayout.mRecComments = null;
            followFeedCommentLayout.mLayoutAddComment = null;
            followFeedCommentLayout.mImgAvatar = null;
            followFeedCommentLayout.mShowAllComments = null;
            followFeedCommentLayout.mSpace = null;
            followFeedCommentLayout.mLayoutLikes = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FollowFeedCommentLayout_ViewBinding(FollowFeedCommentLayout followFeedCommentLayout, View view) {
        this.f57224b = followFeedCommentLayout;
        followFeedCommentLayout.mRecComments = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.cc8, "field 'mRecComments'", RecyclerView.class);
        followFeedCommentLayout.mLayoutAddComment = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.b7s, "field 'mLayoutAddComment'", LinearLayout.class);
        followFeedCommentLayout.mImgAvatar = (CircleImageView) Utils.findRequiredViewAsType(view, C0906R.id.as5, "field 'mImgAvatar'", CircleImageView.class);
        followFeedCommentLayout.mShowAllComments = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.diz, "field 'mShowAllComments'", DmtTextView.class);
        followFeedCommentLayout.mSpace = view.findViewById(C0906R.id.css);
        followFeedCommentLayout.mLayoutLikes = (CommentLikeListView) Utils.findRequiredViewAsType(view, C0906R.id.b98, "field 'mLayoutLikes'", CommentLikeListView.class);
        followFeedCommentLayout.mAvatarSize = view.getContext().getResources().getDimensionPixelSize(C0906R.dimen.gd);
    }
}
