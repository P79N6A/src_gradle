package com.ss.android.ugc.aweme.comment.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.AppCompatCheckBox;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.ss.android.ugc.aweme.detail.ui.FadeImageView;
import com.ss.android.ugc.aweme.views.mention.MentionEditText;

public class KeyboardDialogFragment_ViewBinding implements Unbinder {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f36524b;

    /* renamed from: a  reason: collision with root package name */
    private KeyboardDialogFragment f36525a;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f36524b, false, 27576, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36524b, false, 27576, new Class[0], Void.TYPE);
            return;
        }
        KeyboardDialogFragment keyboardDialogFragment = this.f36525a;
        if (keyboardDialogFragment != null) {
            this.f36525a = null;
            keyboardDialogFragment.mEditText = null;
            keyboardDialogFragment.mPublishView = null;
            keyboardDialogFragment.mAtView = null;
            keyboardDialogFragment.mEmojiView = null;
            keyboardDialogFragment.mCbForward = null;
            keyboardDialogFragment.mPanelContainer = null;
            keyboardDialogFragment.mMiniPanelContainer = null;
            keyboardDialogFragment.mOutWrapper = null;
            keyboardDialogFragment.outView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public KeyboardDialogFragment_ViewBinding(KeyboardDialogFragment keyboardDialogFragment, View view) {
        this.f36525a = keyboardDialogFragment;
        keyboardDialogFragment.mEditText = (MentionEditText) Utils.findRequiredViewAsType(view, C0906R.id.v7, "field 'mEditText'", MentionEditText.class);
        keyboardDialogFragment.mPublishView = (FadeImageView) Utils.findRequiredViewAsType(view, C0906R.id.vl, "field 'mPublishView'", FadeImageView.class);
        keyboardDialogFragment.mAtView = (FadeImageView) Utils.findRequiredViewAsType(view, C0906R.id.g3, "field 'mAtView'", FadeImageView.class);
        keyboardDialogFragment.mEmojiView = (FadeImageView) Utils.findRequiredViewAsType(view, C0906R.id.b0x, "field 'mEmojiView'", FadeImageView.class);
        keyboardDialogFragment.mCbForward = (AppCompatCheckBox) Utils.findRequiredViewAsType(view, C0906R.id.r1, "field 'mCbForward'", AppCompatCheckBox.class);
        keyboardDialogFragment.mPanelContainer = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.bw9, "field 'mPanelContainer'", LinearLayout.class);
        keyboardDialogFragment.mMiniPanelContainer = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.bw_, "field 'mMiniPanelContainer'", LinearLayout.class);
        keyboardDialogFragment.mOutWrapper = (MeasureLinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.bvv, "field 'mOutWrapper'", MeasureLinearLayout.class);
        keyboardDialogFragment.outView = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.bvu, "field 'outView'", LinearLayout.class);
    }
}
