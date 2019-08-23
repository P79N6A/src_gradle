package com.ss.android.ugc.aweme.forward.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.detail.ui.FadeImageView;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.views.mention.MentionEditText;

public class BaseAwemeDetailFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48425a;

    /* renamed from: b  reason: collision with root package name */
    private BaseAwemeDetailFragment f48426b;

    /* renamed from: c  reason: collision with root package name */
    private View f48427c;

    /* renamed from: d  reason: collision with root package name */
    private View f48428d;

    /* renamed from: e  reason: collision with root package name */
    private View f48429e;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f48425a, false, 45773, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48425a, false, 45773, new Class[0], Void.TYPE);
            return;
        }
        BaseAwemeDetailFragment baseAwemeDetailFragment = this.f48426b;
        if (baseAwemeDetailFragment != null) {
            this.f48426b = null;
            baseAwemeDetailFragment.mAuthorAvatarLayout = null;
            baseAwemeDetailFragment.mAuthorAvatarImageView = null;
            baseAwemeDetailFragment.mAuthorAvatarLiveView = null;
            baseAwemeDetailFragment.mAuthorAvatarBorderView = null;
            baseAwemeDetailFragment.mAuthorNameView = null;
            baseAwemeDetailFragment.mRecyclerView = null;
            baseAwemeDetailFragment.mEditText = null;
            baseAwemeDetailFragment.mAtView = null;
            baseAwemeDetailFragment.mEmojiView = null;
            this.f48427c.setOnClickListener(null);
            this.f48427c = null;
            this.f48428d.setOnClickListener(null);
            this.f48428d = null;
            this.f48429e.setOnClickListener(null);
            this.f48429e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public BaseAwemeDetailFragment_ViewBinding(final BaseAwemeDetailFragment baseAwemeDetailFragment, View view) {
        this.f48426b = baseAwemeDetailFragment;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.b7y, "field 'mAuthorAvatarLayout' and method 'onAvatarClick'");
        baseAwemeDetailFragment.mAuthorAvatarLayout = (ViewGroup) Utils.castView(findRequiredView, C0906R.id.b7y, "field 'mAuthorAvatarLayout'", ViewGroup.class);
        this.f48427c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48430a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f48430a, false, 45774, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f48430a, false, 45774, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                baseAwemeDetailFragment.onAvatarClick();
            }
        });
        baseAwemeDetailFragment.mAuthorAvatarImageView = (AvatarImageView) Utils.findRequiredViewAsType(view, C0906R.id.dp2, "field 'mAuthorAvatarImageView'", AvatarImageView.class);
        baseAwemeDetailFragment.mAuthorAvatarLiveView = (AvatarImageView) Utils.findRequiredViewAsType(view, C0906R.id.dp9, "field 'mAuthorAvatarLiveView'", AvatarImageView.class);
        baseAwemeDetailFragment.mAuthorAvatarBorderView = (LiveCircleView) Utils.findRequiredViewAsType(view, C0906R.id.dq0, "field 'mAuthorAvatarBorderView'", LiveCircleView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.dlg, "field 'mAuthorNameView' and method 'onNickNameClick'");
        baseAwemeDetailFragment.mAuthorNameView = (TextView) Utils.castView(findRequiredView2, C0906R.id.dlg, "field 'mAuthorNameView'", TextView.class);
        this.f48428d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48433a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f48433a, false, 45775, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f48433a, false, 45775, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                baseAwemeDetailFragment.onNickNameClick();
            }
        });
        baseAwemeDetailFragment.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.dug, "field 'mRecyclerView'", RecyclerView.class);
        baseAwemeDetailFragment.mEditText = (MentionEditText) Utils.findRequiredViewAsType(view, C0906R.id.v7, "field 'mEditText'", MentionEditText.class);
        baseAwemeDetailFragment.mAtView = (FadeImageView) Utils.findRequiredViewAsType(view, C0906R.id.g3, "field 'mAtView'", FadeImageView.class);
        baseAwemeDetailFragment.mEmojiView = (FadeImageView) Utils.findRequiredViewAsType(view, C0906R.id.a9e, "field 'mEmojiView'", FadeImageView.class);
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.ix, "method 'onBack'");
        this.f48429e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48436a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f48436a, false, 45776, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f48436a, false, 45776, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                baseAwemeDetailFragment.onBack();
            }
        });
    }
}
