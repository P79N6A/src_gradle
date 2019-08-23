package com.ss.android.ugc.aweme.commercialize.coupon.views;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class CouponDetailActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38592a;

    /* renamed from: b  reason: collision with root package name */
    private CouponDetailActivity f38593b;

    /* renamed from: c  reason: collision with root package name */
    private View f38594c;

    /* renamed from: d  reason: collision with root package name */
    private View f38595d;

    /* renamed from: e  reason: collision with root package name */
    private View f38596e;

    /* renamed from: f  reason: collision with root package name */
    private View f38597f;
    private View g;
    private View h;
    private View i;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f38592a, false, 30495, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38592a, false, 30495, new Class[0], Void.TYPE);
            return;
        }
        CouponDetailActivity couponDetailActivity = this.f38593b;
        if (couponDetailActivity != null) {
            this.f38593b = null;
            couponDetailActivity.mStatusView = null;
            couponDetailActivity.headImageIv = null;
            couponDetailActivity.headImageIvBg = null;
            couponDetailActivity.avatarImageView = null;
            couponDetailActivity.merchantNameTv = null;
            couponDetailActivity.titleView = null;
            couponDetailActivity.couponNumberTv = null;
            couponDetailActivity.couponNumberTitleTv = null;
            couponDetailActivity.couponStatusTv = null;
            couponDetailActivity.validEndTimeTv = null;
            couponDetailActivity.merchantMoreBtn = null;
            couponDetailActivity.merchantPoiList = null;
            couponDetailActivity.merchantPosition = null;
            couponDetailActivity.merchantContact = null;
            couponDetailActivity.merchantDetail = null;
            couponDetailActivity.mQRCodeIV = null;
            couponDetailActivity.mBRCodeIV = null;
            couponDetailActivity.couponUseBt = null;
            couponDetailActivity.couponDivideView = null;
            couponDetailActivity.couponNumberFL = null;
            couponDetailActivity.couponListBt = null;
            couponDetailActivity.mMerchantDetail = null;
            this.f38594c.setOnClickListener(null);
            this.f38594c = null;
            this.f38595d.setOnClickListener(null);
            this.f38595d = null;
            this.f38596e.setOnClickListener(null);
            this.f38596e = null;
            this.f38597f.setOnClickListener(null);
            this.f38597f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.i.setOnClickListener(null);
            this.i = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public CouponDetailActivity_ViewBinding(final CouponDetailActivity couponDetailActivity, View view) {
        this.f38593b = couponDetailActivity;
        couponDetailActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
        couponDetailActivity.headImageIv = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.an2, "field 'headImageIv'", RemoteImageView.class);
        couponDetailActivity.headImageIvBg = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.an3, "field 'headImageIvBg'", ImageView.class);
        couponDetailActivity.avatarImageView = (AvatarImageView) Utils.findRequiredViewAsType(view, C0906R.id.i4, "field 'avatarImageView'", AvatarImageView.class);
        couponDetailActivity.merchantNameTv = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bml, "field 'merchantNameTv'", TextView.class);
        couponDetailActivity.titleView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.d41, "field 'titleView'", TextView.class);
        couponDetailActivity.couponNumberTv = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.a15, "field 'couponNumberTv'", TextView.class);
        couponDetailActivity.couponNumberTitleTv = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.a14, "field 'couponNumberTitleTv'", TextView.class);
        couponDetailActivity.couponStatusTv = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.a17, "field 'couponStatusTv'", TextView.class);
        couponDetailActivity.validEndTimeTv = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dqx, "field 'validEndTimeTv'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.awn, "field 'merchantMoreBtn' and method 'onClick'");
        couponDetailActivity.merchantMoreBtn = findRequiredView;
        this.f38594c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38598a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38598a, false, 30496, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38598a, false, 30496, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                couponDetailActivity.onClick(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.awo, "field 'merchantPoiList' and method 'onClick'");
        couponDetailActivity.merchantPoiList = findRequiredView2;
        this.f38595d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38601a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38601a, false, 30497, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38601a, false, 30497, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                couponDetailActivity.onClick(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.awp, "field 'merchantPosition' and method 'onClick'");
        couponDetailActivity.merchantPosition = findRequiredView3;
        this.f38596e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38604a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38604a, false, 30498, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38604a, false, 30498, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                couponDetailActivity.onClick(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.awl, "field 'merchantContact' and method 'onClick'");
        couponDetailActivity.merchantContact = findRequiredView4;
        this.f38597f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38607a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38607a, false, 30499, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38607a, false, 30499, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                couponDetailActivity.onClick(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, C0906R.id.awm, "field 'merchantDetail' and method 'onClick'");
        couponDetailActivity.merchantDetail = findRequiredView5;
        this.g = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38610a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38610a, false, 30500, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38610a, false, 30500, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                couponDetailActivity.onClick(view2);
            }
        });
        couponDetailActivity.mQRCodeIV = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.c9q, "field 'mQRCodeIV'", RemoteImageView.class);
        couponDetailActivity.mBRCodeIV = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.n8, "field 'mBRCodeIV'", RemoteImageView.class);
        View findRequiredView6 = Utils.findRequiredView(view, C0906R.id.a19, "field 'couponUseBt' and method 'onClick'");
        couponDetailActivity.couponUseBt = (DmtTextView) Utils.castView(findRequiredView6, C0906R.id.a19, "field 'couponUseBt'", DmtTextView.class);
        this.h = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38613a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38613a, false, 30501, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38613a, false, 30501, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                couponDetailActivity.onClick(view2);
            }
        });
        couponDetailActivity.couponDivideView = Utils.findRequiredView(view, C0906R.id.a0y, "field 'couponDivideView'");
        couponDetailActivity.couponNumberFL = Utils.findRequiredView(view, C0906R.id.a13, "field 'couponNumberFL'");
        couponDetailActivity.couponListBt = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.a11, "field 'couponListBt'", LinearLayout.class);
        couponDetailActivity.mMerchantDetail = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.del, "field 'mMerchantDetail'", DmtTextView.class);
        View findRequiredView7 = Utils.findRequiredView(view, C0906R.id.iz, "method 'onClick'");
        this.i = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38616a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38616a, false, 30502, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38616a, false, 30502, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                couponDetailActivity.onClick(view2);
            }
        });
    }
}
