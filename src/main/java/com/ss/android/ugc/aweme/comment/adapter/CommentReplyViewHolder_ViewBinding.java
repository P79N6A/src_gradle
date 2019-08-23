package com.ss.android.ugc.aweme.comment.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.comment.ui.CommentTranslationStatusView;
import com.ss.android.ugc.aweme.views.MentionTextView;
import com.ss.android.ugc.aweme.views.RelationLabelTextView;

public class CommentReplyViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36307a;

    /* renamed from: b  reason: collision with root package name */
    private CommentReplyViewHolder f36308b;

    /* renamed from: c  reason: collision with root package name */
    private View f36309c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f36307a, false, 27248, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36307a, false, 27248, new Class[0], Void.TYPE);
            return;
        }
        CommentReplyViewHolder commentReplyViewHolder = this.f36308b;
        if (commentReplyViewHolder != null) {
            this.f36308b = null;
            commentReplyViewHolder.mBgView = null;
            commentReplyViewHolder.mRootView = null;
            commentReplyViewHolder.mAvatarView = null;
            commentReplyViewHolder.mDiggLayout = null;
            commentReplyViewHolder.mDiggView = null;
            commentReplyViewHolder.mDiggCountView = null;
            commentReplyViewHolder.mTitleView = null;
            commentReplyViewHolder.mCommentSplitView = null;
            commentReplyViewHolder.mContentView = null;
            commentReplyViewHolder.mCommentStyleView = null;
            commentReplyViewHolder.mTvRelationLabel = null;
            commentReplyViewHolder.mTranslationView = null;
            commentReplyViewHolder.mPostStatus = null;
            commentReplyViewHolder.mTvLikedByCreator = null;
            this.f36309c.setOnClickListener(null);
            this.f36309c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public CommentReplyViewHolder_ViewBinding(final CommentReplyViewHolder commentReplyViewHolder, View view) {
        this.f36308b = commentReplyViewHolder;
        commentReplyViewHolder.mBgView = view.findViewById(C0906R.id.yb);
        commentReplyViewHolder.mRootView = Utils.findRequiredView(view, C0906R.id.b__, "field 'mRootView'");
        commentReplyViewHolder.mAvatarView = (CircleImageView) Utils.findRequiredViewAsType(view, C0906R.id.hk, "field 'mAvatarView'", CircleImageView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.b8e, "field 'mDiggLayout' and method 'onClick'");
        commentReplyViewHolder.mDiggLayout = findRequiredView;
        this.f36309c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36310a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f36310a, false, 27249, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f36310a, false, 27249, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                commentReplyViewHolder.onClick(view2);
            }
        });
        commentReplyViewHolder.mDiggView = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b0n, "field 'mDiggView'", ImageView.class);
        commentReplyViewHolder.mDiggCountView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.db2, "field 'mDiggCountView'", TextView.class);
        commentReplyViewHolder.mTitleView = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.title, "field 'mTitleView'", DmtTextView.class);
        commentReplyViewHolder.mCommentSplitView = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.vn, "field 'mCommentSplitView'", DmtTextView.class);
        commentReplyViewHolder.mContentView = (MentionTextView) Utils.findRequiredViewAsType(view, C0906R.id.yp, "field 'mContentView'", MentionTextView.class);
        commentReplyViewHolder.mCommentStyleView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.vp, "field 'mCommentStyleView'", TextView.class);
        commentReplyViewHolder.mTvRelationLabel = (RelationLabelTextView) Utils.findRequiredViewAsType(view, C0906R.id.dhb, "field 'mTvRelationLabel'", RelationLabelTextView.class);
        commentReplyViewHolder.mTranslationView = (CommentTranslationStatusView) Utils.findOptionalViewAsType(view, C0906R.id.d6m, "field 'mTranslationView'", CommentTranslationStatusView.class);
        commentReplyViewHolder.mPostStatus = (DmtTextView) Utils.findOptionalViewAsType(view, C0906R.id.c4u, "field 'mPostStatus'", DmtTextView.class);
        commentReplyViewHolder.mTvLikedByCreator = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.bbi, "field 'mTvLikedByCreator'", DmtTextView.class);
    }
}
