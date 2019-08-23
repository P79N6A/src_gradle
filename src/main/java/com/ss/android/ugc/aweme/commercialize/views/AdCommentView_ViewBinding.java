package com.ss.android.ugc.aweme.commercialize.views;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.views.MentionTextView;

public class AdCommentView_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39850a;

    /* renamed from: b  reason: collision with root package name */
    private AdCommentView f39851b;

    /* renamed from: c  reason: collision with root package name */
    private View f39852c;

    /* renamed from: d  reason: collision with root package name */
    private View f39853d;

    /* renamed from: e  reason: collision with root package name */
    private View f39854e;

    /* renamed from: f  reason: collision with root package name */
    private View f39855f;
    private View g;
    private View h;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f39850a, false, 32741, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39850a, false, 32741, new Class[0], Void.TYPE);
            return;
        }
        AdCommentView adCommentView = this.f39851b;
        if (adCommentView != null) {
            this.f39851b = null;
            adCommentView.mAvatarView = null;
            adCommentView.mTitleView = null;
            adCommentView.mContentView = null;
            adCommentView.mReplyContainer = null;
            adCommentView.mReplyTitleView = null;
            adCommentView.mReplyContentView = null;
            adCommentView.mMenuItem = null;
            adCommentView.mReplyDivider = null;
            adCommentView.mCommentTimeView = null;
            adCommentView.mDiggView = null;
            adCommentView.mCommentStyleView = null;
            adCommentView.mDiggLayout = null;
            adCommentView.mReplyCommentStyleView = null;
            adCommentView.contentll = null;
            this.f39852c.setOnClickListener(null);
            this.f39852c = null;
            this.f39853d.setOnClickListener(null);
            this.f39853d = null;
            this.f39854e.setOnClickListener(null);
            this.f39854e = null;
            this.f39855f.setOnClickListener(null);
            this.f39855f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.h.setOnClickListener(null);
            this.h = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public AdCommentView_ViewBinding(final AdCommentView adCommentView, View view) {
        this.f39851b = adCommentView;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.hk, "field 'mAvatarView' and method 'onClick'");
        adCommentView.mAvatarView = (CircleImageView) Utils.castView(findRequiredView, C0906R.id.hk, "field 'mAvatarView'", CircleImageView.class);
        this.f39852c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f39856a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f39856a, false, 32742, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f39856a, false, 32742, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                adCommentView.onClick(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.title, "field 'mTitleView' and method 'onClick'");
        adCommentView.mTitleView = (DmtTextView) Utils.castView(findRequiredView2, C0906R.id.title, "field 'mTitleView'", DmtTextView.class);
        this.f39853d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f39859a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f39859a, false, 32743, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f39859a, false, 32743, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                adCommentView.onClick(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.yp, "field 'mContentView' and method 'onClick'");
        adCommentView.mContentView = (MentionTextView) Utils.castView(findRequiredView3, C0906R.id.yp, "field 'mContentView'", MentionTextView.class);
        this.f39854e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f39862a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f39862a, false, 32744, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f39862a, false, 32744, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                adCommentView.onClick(view2);
            }
        });
        adCommentView.mReplyContainer = Utils.findRequiredView(view, C0906R.id.cdh, "field 'mReplyContainer'");
        adCommentView.mReplyTitleView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.cdk, "field 'mReplyTitleView'", TextView.class);
        adCommentView.mReplyContentView = (MentionTextView) Utils.findRequiredViewAsType(view, C0906R.id.cdi, "field 'mReplyContentView'", MentionTextView.class);
        adCommentView.mMenuItem = (ImageView) Utils.findOptionalViewAsType(view, C0906R.id.ab5, "field 'mMenuItem'", ImageView.class);
        adCommentView.mReplyDivider = Utils.findRequiredView(view, C0906R.id.cdj, "field 'mReplyDivider'");
        adCommentView.mCommentTimeView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.vq, "field 'mCommentTimeView'", TextView.class);
        adCommentView.mDiggView = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b0n, "field 'mDiggView'", ImageView.class);
        adCommentView.mCommentStyleView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.vp, "field 'mCommentStyleView'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.b8e, "field 'mDiggLayout' and method 'onClick'");
        adCommentView.mDiggLayout = (RelativeLayout) Utils.castView(findRequiredView4, C0906R.id.b8e, "field 'mDiggLayout'", RelativeLayout.class);
        this.f39855f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f39865a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f39865a, false, 32745, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f39865a, false, 32745, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                adCommentView.onClick(view2);
            }
        });
        adCommentView.mReplyCommentStyleView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.cdg, "field 'mReplyCommentStyleView'", TextView.class);
        View findRequiredView5 = Utils.findRequiredView(view, C0906R.id.z6, "field 'contentll' and method 'onClick'");
        adCommentView.contentll = (LinearLayout) Utils.castView(findRequiredView5, C0906R.id.z6, "field 'contentll'", LinearLayout.class);
        this.g = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f39868a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f39868a, false, 32746, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f39868a, false, 32746, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                adCommentView.onClick(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, C0906R.id.ve, "method 'onClick'");
        this.h = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f39871a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f39871a, false, 32747, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f39871a, false, 32747, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                adCommentView.onClick(view2);
            }
        });
        adCommentView.size = view.getContext().getResources().getDimensionPixelSize(C0906R.dimen.ct);
    }
}
