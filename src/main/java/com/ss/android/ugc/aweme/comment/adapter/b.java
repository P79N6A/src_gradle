package com.ss.android.ugc.aweme.comment.adapter;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.bytex.a.a.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36343a;

    public static boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f36343a, true, 27215, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f36343a, true, 27215, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = AbTestManager.a().d();
        if (d2 != null && d2.commentBG == 0) {
            z = true;
        }
        return z;
    }

    public static void a(Context context, CommentViewHolderNewStyle commentViewHolderNewStyle, Comment comment) {
        CommentViewHolderNewStyle commentViewHolderNewStyle2 = commentViewHolderNewStyle;
        if (PatchProxy.isSupport(new Object[]{context, commentViewHolderNewStyle2, comment}, null, f36343a, true, 27216, new Class[]{Context.class, CommentViewHolderNewStyle.class, Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, commentViewHolderNewStyle2, comment}, null, f36343a, true, 27216, new Class[]{Context.class, CommentViewHolderNewStyle.class, Comment.class}, Void.TYPE);
        } else if (commentViewHolderNewStyle.g() && context != null && comment != null) {
            commentViewHolderNewStyle2.mTitleView.setTextColor(context.getResources().getColor(C0906R.color.a0b));
            commentViewHolderNewStyle2.mCommentSplitView.setTextColor(context.getResources().getColor(C0906R.color.a0b));
            commentViewHolderNewStyle2.mReplyTitleView.setTextColor(context.getResources().getColor(C0906R.color.a0b));
            commentViewHolderNewStyle2.mReplyCommentSplitView.setTextColor(context.getResources().getColor(C0906R.color.a0b));
            commentViewHolderNewStyle2.mCommentTimeView.setTextColor(context.getResources().getColor(C0906R.color.a0e));
            commentViewHolderNewStyle2.mContentView.setTextColor(context.getResources().getColor(C0906R.color.a09));
            commentViewHolderNewStyle2.mReplyContentView.setTextColor(context.getResources().getColor(C0906R.color.a0b));
            commentViewHolderNewStyle2.mReplyDivider.setBackground(a.a(context.getResources(), 2130837884));
            if (comment.getLabelType() != 1) {
                commentViewHolderNewStyle2.mCommentStyleView.setTextColor(context.getResources().getColor(C0906R.color.a0b));
                if (!com.ss.android.g.a.a()) {
                    commentViewHolderNewStyle2.mCommentStyleView.setBackground(a.a(context.getResources(), 2130838345));
                }
            }
            if (!(comment.getReplyComments() == null || comment.getReplyComments().isEmpty() || comment.getReplyComments().get(0).getLabelType() == 1)) {
                commentViewHolderNewStyle2.mReplyCommentStyleView.setTextColor(context.getResources().getColor(C0906R.color.a0b));
                if (!com.ss.android.g.a.a()) {
                    commentViewHolderNewStyle2.mReplyCommentStyleView.setBackground(a.a(context.getResources(), 2130838345));
                }
            }
            commentViewHolderNewStyle2.mTvRelationLabel.setBackground(a.a(context.getResources(), 2130838345));
            commentViewHolderNewStyle2.mTvReplyCommentRelationLabel.setBackground(a.a(context.getResources(), 2130838345));
            commentViewHolderNewStyle2.mTvRelationLabel.setTextColor(context.getResources().getColor(C0906R.color.a0b));
            commentViewHolderNewStyle2.mTvReplyCommentRelationLabel.setTextColor(context.getResources().getColor(C0906R.color.a0b));
        }
    }
}
