package com.ss.android.ugc.aweme.comment.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class CommentReplyButtonViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36293a;

    /* renamed from: b  reason: collision with root package name */
    private CommentReplyButtonViewHolder f36294b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f36293a, false, 27230, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36293a, false, 27230, new Class[0], Void.TYPE);
            return;
        }
        CommentReplyButtonViewHolder commentReplyButtonViewHolder = this.f36294b;
        if (commentReplyButtonViewHolder != null) {
            this.f36294b = null;
            commentReplyButtonViewHolder.mLayoutButton = null;
            commentReplyButtonViewHolder.mLayoutLoading = null;
            commentReplyButtonViewHolder.mTvTitle = null;
            commentReplyButtonViewHolder.mImgExpand = null;
            commentReplyButtonViewHolder.mImgCollapse = null;
            commentReplyButtonViewHolder.mDivider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public CommentReplyButtonViewHolder_ViewBinding(CommentReplyButtonViewHolder commentReplyButtonViewHolder, View view) {
        this.f36294b = commentReplyButtonViewHolder;
        commentReplyButtonViewHolder.mLayoutButton = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.b_6, "field 'mLayoutButton'", LinearLayout.class);
        commentReplyButtonViewHolder.mLayoutLoading = (DmtLoadingLayout) Utils.findRequiredViewAsType(view, C0906R.id.b_7, "field 'mLayoutLoading'", DmtLoadingLayout.class);
        commentReplyButtonViewHolder.mTvTitle = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.dhf, "field 'mTvTitle'", DmtTextView.class);
        commentReplyButtonViewHolder.mImgExpand = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.atl, "field 'mImgExpand'", ImageView.class);
        commentReplyButtonViewHolder.mImgCollapse = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.atk, "field 'mImgCollapse'", ImageView.class);
        commentReplyButtonViewHolder.mDivider = Utils.findRequiredView(view, C0906R.id.a5u, "field 'mDivider'");
    }
}
