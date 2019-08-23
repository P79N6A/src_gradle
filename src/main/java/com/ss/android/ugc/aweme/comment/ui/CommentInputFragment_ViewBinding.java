package com.ss.android.ugc.aweme.comment.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.AppCompatCheckBox;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.detail.ui.FadeImageView;
import com.ss.android.ugc.aweme.views.mention.MentionEditText;

public class CommentInputFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36489a;

    /* renamed from: b  reason: collision with root package name */
    private CommentInputFragment f36490b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f36489a, false, 27476, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36489a, false, 27476, new Class[0], Void.TYPE);
            return;
        }
        CommentInputFragment commentInputFragment = this.f36490b;
        if (commentInputFragment != null) {
            this.f36490b = null;
            commentInputFragment.mEditCommentView = null;
            commentInputFragment.mSendCommentView = null;
            commentInputFragment.mLayout = null;
            commentInputFragment.mEditContainerView = null;
            commentInputFragment.ivAt = null;
            commentInputFragment.ivEmoji = null;
            commentInputFragment.tabDivider = null;
            commentInputFragment.mCbForward = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public CommentInputFragment_ViewBinding(CommentInputFragment commentInputFragment, View view) {
        this.f36490b = commentInputFragment;
        commentInputFragment.mEditCommentView = (MentionEditText) Utils.findRequiredViewAsType(view, C0906R.id.v7, "field 'mEditCommentView'", MentionEditText.class);
        commentInputFragment.mSendCommentView = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.vl, "field 'mSendCommentView'", ImageView.class);
        commentInputFragment.mLayout = Utils.findRequiredView(view, C0906R.id.y9, "field 'mLayout'");
        commentInputFragment.mEditContainerView = Utils.findRequiredView(view, C0906R.id.a8m, "field 'mEditContainerView'");
        commentInputFragment.ivAt = (FadeImageView) Utils.findRequiredViewAsType(view, C0906R.id.g3, "field 'ivAt'", FadeImageView.class);
        commentInputFragment.ivEmoji = (FadeImageView) Utils.findRequiredViewAsType(view, C0906R.id.b0x, "field 'ivEmoji'", FadeImageView.class);
        commentInputFragment.tabDivider = Utils.findRequiredView(view, C0906R.id.cyp, "field 'tabDivider'");
        commentInputFragment.mCbForward = (AppCompatCheckBox) Utils.findRequiredViewAsType(view, C0906R.id.r1, "field 'mCbForward'", AppCompatCheckBox.class);
    }
}
