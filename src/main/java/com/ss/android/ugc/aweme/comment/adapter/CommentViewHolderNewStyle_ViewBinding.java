package com.ss.android.ugc.aweme.comment.adapter;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.views.RelationLabelTextView;

public class CommentViewHolderNewStyle_ViewBinding extends CommentViewHolder_ViewBinding {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36334a;

    /* renamed from: c  reason: collision with root package name */
    private CommentViewHolderNewStyle f36335c;

    /* renamed from: d  reason: collision with root package name */
    private View f36336d;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f36334a, false, 27276, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36334a, false, 27276, new Class[0], Void.TYPE);
            return;
        }
        CommentViewHolderNewStyle commentViewHolderNewStyle = this.f36335c;
        if (commentViewHolderNewStyle != null) {
            this.f36335c = null;
            commentViewHolderNewStyle.mCommentTimeView = null;
            commentViewHolderNewStyle.mDiggCountView = null;
            commentViewHolderNewStyle.mDiggView = null;
            commentViewHolderNewStyle.mCommentStyleView = null;
            commentViewHolderNewStyle.mDiggLayout = null;
            commentViewHolderNewStyle.mReplyCommentStyleView = null;
            commentViewHolderNewStyle.mTvRelationLabel = null;
            commentViewHolderNewStyle.mTvReplyCommentRelationLabel = null;
            commentViewHolderNewStyle.mCommentSplitView = null;
            commentViewHolderNewStyle.mReplyCommentSplitView = null;
            commentViewHolderNewStyle.mPostStatus = null;
            commentViewHolderNewStyle.mTvLikedByCreator = null;
            this.f36336d.setOnClickListener(null);
            this.f36336d = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public CommentViewHolderNewStyle_ViewBinding(final CommentViewHolderNewStyle commentViewHolderNewStyle, View view) {
        super(commentViewHolderNewStyle, view);
        this.f36335c = commentViewHolderNewStyle;
        commentViewHolderNewStyle.mCommentTimeView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.vq, "field 'mCommentTimeView'", TextView.class);
        commentViewHolderNewStyle.mDiggCountView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.db2, "field 'mDiggCountView'", TextView.class);
        commentViewHolderNewStyle.mDiggView = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b0n, "field 'mDiggView'", ImageView.class);
        commentViewHolderNewStyle.mCommentStyleView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.vp, "field 'mCommentStyleView'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.b8e, "field 'mDiggLayout' and method 'onClick'");
        commentViewHolderNewStyle.mDiggLayout = findRequiredView;
        this.f36336d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36337a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f36337a, false, 27277, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f36337a, false, 27277, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                commentViewHolderNewStyle.onClick(view2);
            }
        });
        commentViewHolderNewStyle.mReplyCommentStyleView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.cdg, "field 'mReplyCommentStyleView'", TextView.class);
        commentViewHolderNewStyle.mTvRelationLabel = (RelationLabelTextView) Utils.findRequiredViewAsType(view, C0906R.id.dhb, "field 'mTvRelationLabel'", RelationLabelTextView.class);
        commentViewHolderNewStyle.mTvReplyCommentRelationLabel = (RelationLabelTextView) Utils.findRequiredViewAsType(view, C0906R.id.dhe, "field 'mTvReplyCommentRelationLabel'", RelationLabelTextView.class);
        commentViewHolderNewStyle.mCommentSplitView = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.vn, "field 'mCommentSplitView'", DmtTextView.class);
        commentViewHolderNewStyle.mReplyCommentSplitView = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.cdf, "field 'mReplyCommentSplitView'", DmtTextView.class);
        commentViewHolderNewStyle.mPostStatus = (DmtTextView) Utils.findOptionalViewAsType(view, C0906R.id.c4u, "field 'mPostStatus'", DmtTextView.class);
        commentViewHolderNewStyle.mTvLikedByCreator = (DmtTextView) Utils.findOptionalViewAsType(view, C0906R.id.bbi, "field 'mTvLikedByCreator'", DmtTextView.class);
    }
}
