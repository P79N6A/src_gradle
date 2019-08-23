package com.ss.android.ugc.aweme.comment.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView;

public class VideoCommentDialogFragment2_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36544a;

    /* renamed from: b  reason: collision with root package name */
    private VideoCommentDialogFragment2 f36545b;

    /* renamed from: c  reason: collision with root package name */
    private View f36546c;

    /* renamed from: d  reason: collision with root package name */
    private View f36547d;

    /* renamed from: e  reason: collision with root package name */
    private View f36548e;

    /* renamed from: f  reason: collision with root package name */
    private View f36549f;
    private View g;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f36544a, false, 27759, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36544a, false, 27759, new Class[0], Void.TYPE);
            return;
        }
        VideoCommentDialogFragment2 videoCommentDialogFragment2 = this.f36545b;
        if (videoCommentDialogFragment2 != null) {
            this.f36545b = null;
            videoCommentDialogFragment2.mCommentAdLayout = null;
            videoCommentDialogFragment2.mCommentAdSourceTv = null;
            videoCommentDialogFragment2.mCommentAdDesTv = null;
            videoCommentDialogFragment2.mCommentAdBtn = null;
            videoCommentDialogFragment2.mCommentAdUserAvatar = null;
            videoCommentDialogFragment2.commerceArea = null;
            videoCommentDialogFragment2.commerceTitle = null;
            videoCommentDialogFragment2.commerceClose = null;
            videoCommentDialogFragment2.commercePrice = null;
            videoCommentDialogFragment2.commerceSales = null;
            videoCommentDialogFragment2.commerceDivider = null;
            videoCommentDialogFragment2.commerceBottomDivider = null;
            videoCommentDialogFragment2.commerceBottomDivider2 = null;
            videoCommentDialogFragment2.poiCouponText = null;
            videoCommentDialogFragment2.commerceLogo = null;
            videoCommentDialogFragment2.commerceLogoRight = null;
            videoCommentDialogFragment2.ivMicroAppLink = null;
            videoCommentDialogFragment2.linkTag = null;
            videoCommentDialogFragment2.linkIcon = null;
            videoCommentDialogFragment2.linkClose = null;
            videoCommentDialogFragment2.linkTitle = null;
            videoCommentDialogFragment2.linkDesc = null;
            videoCommentDialogFragment2.linkAdTag = null;
            videoCommentDialogFragment2.linkAdTagDiv = null;
            videoCommentDialogFragment2.mCommentLayout = null;
            this.f36546c.setOnClickListener(null);
            this.f36546c = null;
            this.f36547d.setOnClickListener(null);
            this.f36547d = null;
            this.f36548e.setOnClickListener(null);
            this.f36548e = null;
            this.f36549f.setOnClickListener(null);
            this.f36549f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public VideoCommentDialogFragment2_ViewBinding(final VideoCommentDialogFragment2 videoCommentDialogFragment2, View view) {
        this.f36545b = videoCommentDialogFragment2;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.v0, "field 'mCommentAdLayout' and method 'onClick'");
        videoCommentDialogFragment2.mCommentAdLayout = findRequiredView;
        this.f36546c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36550a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f36550a, false, 27760, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f36550a, false, 27760, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                videoCommentDialogFragment2.onClick(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.uz, "field 'mCommentAdSourceTv' and method 'onClick'");
        videoCommentDialogFragment2.mCommentAdSourceTv = (TextView) Utils.castView(findRequiredView2, C0906R.id.uz, "field 'mCommentAdSourceTv'", TextView.class);
        this.f36547d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36553a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f36553a, false, 27761, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f36553a, false, 27761, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                videoCommentDialogFragment2.onClick(view2);
            }
        });
        videoCommentDialogFragment2.mCommentAdDesTv = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.ux, "field 'mCommentAdDesTv'", TextView.class);
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.uu, "field 'mCommentAdBtn' and method 'onClick'");
        videoCommentDialogFragment2.mCommentAdBtn = (TextView) Utils.castView(findRequiredView3, C0906R.id.uu, "field 'mCommentAdBtn'", TextView.class);
        this.f36548e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36556a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f36556a, false, 27762, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f36556a, false, 27762, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                videoCommentDialogFragment2.onClick(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.v1, "field 'mCommentAdUserAvatar' and method 'onClick'");
        videoCommentDialogFragment2.mCommentAdUserAvatar = (AvatarWithBorderView) Utils.castView(findRequiredView4, C0906R.id.v1, "field 'mCommentAdUserAvatar'", AvatarWithBorderView.class);
        this.f36549f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36559a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f36559a, false, 27763, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f36559a, false, 27763, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                videoCommentDialogFragment2.onClick(view2);
            }
        });
        videoCommentDialogFragment2.commerceArea = Utils.findRequiredView(view, C0906R.id.w3, "field 'commerceArea'");
        videoCommentDialogFragment2.commerceTitle = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.xm, "field 'commerceTitle'", TextView.class);
        videoCommentDialogFragment2.commerceClose = Utils.findRequiredView(view, C0906R.id.wa, "field 'commerceClose'");
        videoCommentDialogFragment2.commercePrice = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.xb, "field 'commercePrice'", TextView.class);
        videoCommentDialogFragment2.commerceSales = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.xc, "field 'commerceSales'", TextView.class);
        videoCommentDialogFragment2.commerceDivider = Utils.findRequiredView(view, C0906R.id.ws, "field 'commerceDivider'");
        videoCommentDialogFragment2.commerceBottomDivider = Utils.findRequiredView(view, C0906R.id.w7, "field 'commerceBottomDivider'");
        videoCommentDialogFragment2.commerceBottomDivider2 = Utils.findRequiredView(view, C0906R.id.w8, "field 'commerceBottomDivider2'");
        videoCommentDialogFragment2.poiCouponText = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.a0m, "field 'poiCouponText'", TextView.class);
        videoCommentDialogFragment2.commerceLogo = (RemoteRoundImageView) Utils.findRequiredViewAsType(view, C0906R.id.wx, "field 'commerceLogo'", RemoteRoundImageView.class);
        videoCommentDialogFragment2.commerceLogoRight = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.wy, "field 'commerceLogoRight'", ImageView.class);
        videoCommentDialogFragment2.ivMicroAppLink = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b3a, "field 'ivMicroAppLink'", ImageView.class);
        videoCommentDialogFragment2.linkTag = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.bci, "field 'linkTag'", ViewGroup.class);
        videoCommentDialogFragment2.linkIcon = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.bca, "field 'linkIcon'", RemoteImageView.class);
        videoCommentDialogFragment2.linkClose = Utils.findRequiredView(view, C0906R.id.bc9, "field 'linkClose'");
        videoCommentDialogFragment2.linkTitle = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bcj, "field 'linkTitle'", TextView.class);
        videoCommentDialogFragment2.linkDesc = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bc_, "field 'linkDesc'", TextView.class);
        videoCommentDialogFragment2.linkAdTag = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.d1, "field 'linkAdTag'", TextView.class);
        videoCommentDialogFragment2.linkAdTagDiv = Utils.findRequiredView(view, C0906R.id.d4, "field 'linkAdTagDiv'");
        videoCommentDialogFragment2.mCommentLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.vd, "field 'mCommentLayout'", LinearLayout.class);
        View findRequiredView5 = Utils.findRequiredView(view, C0906R.id.uv, "method 'onClick'");
        this.g = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36562a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f36562a, false, 27764, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f36562a, false, 27764, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                videoCommentDialogFragment2.onClick(view2);
            }
        });
    }
}
