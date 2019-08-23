package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.poi.ui.coupon.PoiAdLayout;
import com.ss.android.ugc.aweme.poi.ui.coupon.PoiCouponLayout;
import com.ss.android.ugc.aweme.poi.widget.CompoundDrawableAndTextLayout;
import com.ss.android.ugc.aweme.poi.widget.HorizontalBusinessComponentLayout;
import com.ss.android.ugc.aweme.poi.widget.PoiActsFlipperView;
import com.ss.android.ugc.aweme.poi.widget.PoiHeaderLayout;

public class PoiOptimizedDetailViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59583a;

    /* renamed from: b  reason: collision with root package name */
    private PoiOptimizedDetailViewHolder f59584b;

    /* renamed from: c  reason: collision with root package name */
    private View f59585c;

    /* renamed from: d  reason: collision with root package name */
    private View f59586d;

    /* renamed from: e  reason: collision with root package name */
    private View f59587e;

    /* renamed from: f  reason: collision with root package name */
    private View f59588f;
    private View g;
    private View h;
    private View i;
    private View j;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f59583a, false, 64883, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59583a, false, 64883, new Class[0], Void.TYPE);
            return;
        }
        PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder = this.f59584b;
        if (poiOptimizedDetailViewHolder != null) {
            this.f59584b = null;
            poiOptimizedDetailViewHolder.mPoiAddrDivider = null;
            poiOptimizedDetailViewHolder.mPoiAddrLayout = null;
            poiOptimizedDetailViewHolder.mPoiDistance = null;
            poiOptimizedDetailViewHolder.mPhoneDivider = null;
            poiOptimizedDetailViewHolder.mPhone = null;
            poiOptimizedDetailViewHolder.mPhoneLayout = null;
            poiOptimizedDetailViewHolder.mDetailDescLayout = null;
            poiOptimizedDetailViewHolder.mDetailDesc = null;
            poiOptimizedDetailViewHolder.mPoiAddr = null;
            poiOptimizedDetailViewHolder.mPoiRank = null;
            poiOptimizedDetailViewHolder.mPoiRankLayout = null;
            poiOptimizedDetailViewHolder.mPoiContentLayout = null;
            poiOptimizedDetailViewHolder.mPoiCouponLayout = null;
            poiOptimizedDetailViewHolder.mPoiAdLayout = null;
            poiOptimizedDetailViewHolder.mPoiReserveAndQueueLayout = null;
            poiOptimizedDetailViewHolder.mPoiReserve = null;
            poiOptimizedDetailViewHolder.mPoiQueue = null;
            poiOptimizedDetailViewHolder.mPoiQueueDivider = null;
            poiOptimizedDetailViewHolder.mPoiReserveAndQueueDivider = null;
            poiOptimizedDetailViewHolder.mPoiCollectLayout = null;
            poiOptimizedDetailViewHolder.mBusinessComponent = null;
            poiOptimizedDetailViewHolder.mActsView = null;
            poiOptimizedDetailViewHolder.mActsLayout = null;
            poiOptimizedDetailViewHolder.mMerchantActsView = null;
            poiOptimizedDetailViewHolder.mMerchantActsLayout = null;
            poiOptimizedDetailViewHolder.mPoiHeaderLayout = null;
            poiOptimizedDetailViewHolder.mPoiNavi = null;
            poiOptimizedDetailViewHolder.mPoiNaviDivider = null;
            poiOptimizedDetailViewHolder.mRankMore = null;
            poiOptimizedDetailViewHolder.mActMore = null;
            poiOptimizedDetailViewHolder.mMerchantMore = null;
            this.f59585c.setOnClickListener(null);
            this.f59585c = null;
            this.f59586d.setOnClickListener(null);
            this.f59586d = null;
            this.f59587e.setOnClickListener(null);
            this.f59587e = null;
            this.f59588f.setOnClickListener(null);
            this.f59588f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.j.setOnClickListener(null);
            this.j = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PoiOptimizedDetailViewHolder_ViewBinding(final PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder, View view) {
        this.f59584b = poiOptimizedDetailViewHolder;
        poiOptimizedDetailViewHolder.mPoiAddrDivider = Utils.findRequiredView(view, C0906R.id.c0j, "field 'mPoiAddrDivider'");
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.c0k, "field 'mPoiAddrLayout' and method 'onClick'");
        poiOptimizedDetailViewHolder.mPoiAddrLayout = findRequiredView;
        this.f59585c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59589a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f59589a, false, 64884, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f59589a, false, 64884, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                poiOptimizedDetailViewHolder.onClick(view2);
            }
        });
        poiOptimizedDetailViewHolder.mPoiDistance = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.c0p, "field 'mPoiDistance'", TextView.class);
        poiOptimizedDetailViewHolder.mPhoneDivider = Utils.findRequiredView(view, C0906R.id.c0v, "field 'mPhoneDivider'");
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.c0u, "field 'mPhone' and method 'onClick'");
        poiOptimizedDetailViewHolder.mPhone = findRequiredView2;
        this.f59586d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59592a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f59592a, false, 64885, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f59592a, false, 64885, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                poiOptimizedDetailViewHolder.onClick(view2);
            }
        });
        poiOptimizedDetailViewHolder.mPhoneLayout = Utils.findRequiredView(view, C0906R.id.c0w, "field 'mPhoneLayout'");
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.c0e, "field 'mDetailDescLayout' and method 'onClick'");
        poiOptimizedDetailViewHolder.mDetailDescLayout = findRequiredView3;
        this.f59587e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59595a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f59595a, false, 64886, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f59595a, false, 64886, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                poiOptimizedDetailViewHolder.onClick(view2);
            }
        });
        poiOptimizedDetailViewHolder.mDetailDesc = (CompoundDrawableAndTextLayout) Utils.findRequiredViewAsType(view, C0906R.id.c0d, "field 'mDetailDesc'", CompoundDrawableAndTextLayout.class);
        poiOptimizedDetailViewHolder.mPoiAddr = (CompoundDrawableAndTextLayout) Utils.findRequiredViewAsType(view, C0906R.id.c0h, "field 'mPoiAddr'", CompoundDrawableAndTextLayout.class);
        poiOptimizedDetailViewHolder.mPoiRank = (CompoundDrawableAndTextLayout) Utils.findRequiredViewAsType(view, C0906R.id.c1_, "field 'mPoiRank'", CompoundDrawableAndTextLayout.class);
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.c1a, "field 'mPoiRankLayout' and method 'onClick'");
        poiOptimizedDetailViewHolder.mPoiRankLayout = findRequiredView4;
        this.f59588f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59598a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f59598a, false, 64887, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f59598a, false, 64887, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                poiOptimizedDetailViewHolder.onClick(view2);
            }
        });
        poiOptimizedDetailViewHolder.mPoiContentLayout = Utils.findRequiredView(view, C0906R.id.c0c, "field 'mPoiContentLayout'");
        poiOptimizedDetailViewHolder.mPoiCouponLayout = (PoiCouponLayout) Utils.findRequiredViewAsType(view, C0906R.id.c00, "field 'mPoiCouponLayout'", PoiCouponLayout.class);
        poiOptimizedDetailViewHolder.mPoiAdLayout = (PoiAdLayout) Utils.findRequiredViewAsType(view, C0906R.id.byx, "field 'mPoiAdLayout'", PoiAdLayout.class);
        poiOptimizedDetailViewHolder.mPoiReserveAndQueueLayout = Utils.findRequiredView(view, C0906R.id.c1d, "field 'mPoiReserveAndQueueLayout'");
        poiOptimizedDetailViewHolder.mPoiReserve = (CompoundDrawableAndTextLayout) Utils.findRequiredViewAsType(view, C0906R.id.c1c, "field 'mPoiReserve'", CompoundDrawableAndTextLayout.class);
        poiOptimizedDetailViewHolder.mPoiQueue = (CompoundDrawableAndTextLayout) Utils.findRequiredViewAsType(view, C0906R.id.c18, "field 'mPoiQueue'", CompoundDrawableAndTextLayout.class);
        poiOptimizedDetailViewHolder.mPoiQueueDivider = Utils.findRequiredView(view, C0906R.id.c19, "field 'mPoiQueueDivider'");
        poiOptimizedDetailViewHolder.mPoiReserveAndQueueDivider = Utils.findRequiredView(view, C0906R.id.c1e, "field 'mPoiReserveAndQueueDivider'");
        View findRequiredView5 = Utils.findRequiredView(view, C0906R.id.c0m, "field 'mPoiCollectLayout' and method 'onClick'");
        poiOptimizedDetailViewHolder.mPoiCollectLayout = findRequiredView5;
        this.g = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59601a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f59601a, false, 64888, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f59601a, false, 64888, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                poiOptimizedDetailViewHolder.onClick(view2);
            }
        });
        poiOptimizedDetailViewHolder.mBusinessComponent = (HorizontalBusinessComponentLayout) Utils.findRequiredViewAsType(view, C0906R.id.c0_, "field 'mBusinessComponent'", HorizontalBusinessComponentLayout.class);
        poiOptimizedDetailViewHolder.mActsView = (PoiActsFlipperView) Utils.findRequiredViewAsType(view, C0906R.id.c04, "field 'mActsView'", PoiActsFlipperView.class);
        View findRequiredView6 = Utils.findRequiredView(view, C0906R.id.c05, "field 'mActsLayout' and method 'onClick'");
        poiOptimizedDetailViewHolder.mActsLayout = findRequiredView6;
        this.h = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59604a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f59604a, false, 64889, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f59604a, false, 64889, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                poiOptimizedDetailViewHolder.onClick(view2);
            }
        });
        poiOptimizedDetailViewHolder.mMerchantActsView = (CompoundDrawableAndTextLayout) Utils.findRequiredViewAsType(view, C0906R.id.c26, "field 'mMerchantActsView'", CompoundDrawableAndTextLayout.class);
        View findRequiredView7 = Utils.findRequiredView(view, C0906R.id.c27, "field 'mMerchantActsLayout' and method 'onClick'");
        poiOptimizedDetailViewHolder.mMerchantActsLayout = findRequiredView7;
        this.i = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59607a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f59607a, false, 64890, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f59607a, false, 64890, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                poiOptimizedDetailViewHolder.onClick(view2);
            }
        });
        poiOptimizedDetailViewHolder.mPoiHeaderLayout = (PoiHeaderLayout) Utils.findRequiredViewAsType(view, C0906R.id.c1v, "field 'mPoiHeaderLayout'", PoiHeaderLayout.class);
        View findRequiredView8 = Utils.findRequiredView(view, C0906R.id.c0s, "field 'mPoiNavi' and method 'onClick'");
        poiOptimizedDetailViewHolder.mPoiNavi = findRequiredView8;
        this.j = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59610a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f59610a, false, 64891, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f59610a, false, 64891, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                poiOptimizedDetailViewHolder.onClick(view2);
            }
        });
        poiOptimizedDetailViewHolder.mPoiNaviDivider = Utils.findRequiredView(view, C0906R.id.c0t, "field 'mPoiNaviDivider'");
        poiOptimizedDetailViewHolder.mRankMore = Utils.findRequiredView(view, C0906R.id.c1b, "field 'mRankMore'");
        poiOptimizedDetailViewHolder.mActMore = Utils.findRequiredView(view, C0906R.id.c06, "field 'mActMore'");
        poiOptimizedDetailViewHolder.mMerchantMore = Utils.findRequiredView(view, C0906R.id.c28, "field 'mMerchantMore'");
    }
}
