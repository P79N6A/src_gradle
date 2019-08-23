package com.ss.android.ugc.aweme.newfollow.vh;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.views.MentionTextView;

public class CommentFollowFeedMomentViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57497a;

    /* renamed from: b  reason: collision with root package name */
    private CommentFollowFeedMomentViewHolder f57498b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f57497a, false, 62101, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57497a, false, 62101, new Class[0], Void.TYPE);
            return;
        }
        CommentFollowFeedMomentViewHolder commentFollowFeedMomentViewHolder = this.f57498b;
        if (commentFollowFeedMomentViewHolder != null) {
            this.f57498b = null;
            commentFollowFeedMomentViewHolder.mTvComment = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public CommentFollowFeedMomentViewHolder_ViewBinding(CommentFollowFeedMomentViewHolder commentFollowFeedMomentViewHolder, View view) {
        this.f57498b = commentFollowFeedMomentViewHolder;
        commentFollowFeedMomentViewHolder.mTvComment = (MentionTextView) Utils.findRequiredViewAsType(view, C0906R.id.d_q, "field 'mTvComment'", MentionTextView.class);
    }
}
