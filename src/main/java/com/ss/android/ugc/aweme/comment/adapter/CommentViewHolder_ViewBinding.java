package com.ss.android.ugc.aweme.comment.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.comment.ui.CommentTranslationStatusView;
import com.ss.android.ugc.aweme.views.MentionTextView;

public class CommentViewHolder_ViewBinding implements Unbinder {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f36340b;

    /* renamed from: a  reason: collision with root package name */
    private CommentViewHolder f36341a;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f36340b, false, 27278, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36340b, false, 27278, new Class[0], Void.TYPE);
            return;
        }
        CommentViewHolder commentViewHolder = this.f36341a;
        if (commentViewHolder != null) {
            this.f36341a = null;
            commentViewHolder.mRootView = null;
            commentViewHolder.mAvatarView = null;
            commentViewHolder.mTitleView = null;
            commentViewHolder.mContentView = null;
            commentViewHolder.mReplyContainer = null;
            commentViewHolder.mReplyTitleView = null;
            commentViewHolder.mReplyContentView = null;
            commentViewHolder.mMenuItem = null;
            commentViewHolder.mReplyDivider = null;
            commentViewHolder.mTranslationView = null;
            commentViewHolder.mBgView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public CommentViewHolder_ViewBinding(CommentViewHolder commentViewHolder, View view) {
        this.f36341a = commentViewHolder;
        commentViewHolder.mRootView = Utils.findRequiredView(view, C0906R.id.b__, "field 'mRootView'");
        commentViewHolder.mAvatarView = (CircleImageView) Utils.findRequiredViewAsType(view, C0906R.id.hk, "field 'mAvatarView'", CircleImageView.class);
        commentViewHolder.mTitleView = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.title, "field 'mTitleView'", DmtTextView.class);
        commentViewHolder.mContentView = (MentionTextView) Utils.findRequiredViewAsType(view, C0906R.id.yp, "field 'mContentView'", MentionTextView.class);
        commentViewHolder.mReplyContainer = Utils.findRequiredView(view, C0906R.id.cdh, "field 'mReplyContainer'");
        commentViewHolder.mReplyTitleView = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.cdk, "field 'mReplyTitleView'", DmtTextView.class);
        commentViewHolder.mReplyContentView = (MentionTextView) Utils.findRequiredViewAsType(view, C0906R.id.cdi, "field 'mReplyContentView'", MentionTextView.class);
        commentViewHolder.mMenuItem = (ImageView) Utils.findOptionalViewAsType(view, C0906R.id.ab5, "field 'mMenuItem'", ImageView.class);
        commentViewHolder.mReplyDivider = Utils.findRequiredView(view, C0906R.id.cdj, "field 'mReplyDivider'");
        commentViewHolder.mTranslationView = (CommentTranslationStatusView) Utils.findOptionalViewAsType(view, C0906R.id.d6m, "field 'mTranslationView'", CommentTranslationStatusView.class);
        commentViewHolder.mBgView = view.findViewById(C0906R.id.yb);
        commentViewHolder.size = view.getContext().getResources().getDimensionPixelSize(C0906R.dimen.ct);
    }
}
