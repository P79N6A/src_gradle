package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.d.f;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.poi.PoiClassRankBannerStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.a;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.e;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.c.b;
import com.ss.android.ugc.aweme.poi.e.e;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.poi.model.PoiDetail;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.poi.model.n;
import com.ss.android.ugc.aweme.poi.model.r;
import com.ss.android.ugc.aweme.poi.ui.PoiNoticeActivity;
import com.ss.android.ugc.aweme.poi.ui.coupon.PoiAdLayout;
import com.ss.android.ugc.aweme.poi.ui.coupon.PoiCouponLayout;
import com.ss.android.ugc.aweme.poi.ui.j;
import com.ss.android.ugc.aweme.poi.ui.s;
import com.ss.android.ugc.aweme.poi.widget.CompoundDrawableAndTextLayout;
import com.ss.android.ugc.aweme.poi.widget.HorizontalBusinessComponentLayout;
import com.ss.android.ugc.aweme.poi.widget.PoiActsFlipperView;
import com.ss.android.ugc.aweme.poi.widget.PoiHeaderLayout;
import com.ss.android.ugc.aweme.u.aa;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

public class PoiOptimizedDetailViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59577a;

    /* renamed from: b  reason: collision with root package name */
    public Context f59578b;

    /* renamed from: c  reason: collision with root package name */
    PoiDetail f59579c;

    /* renamed from: d  reason: collision with root package name */
    public j f59580d = new j();

    /* renamed from: e  reason: collision with root package name */
    public c f59581e;

    /* renamed from: f  reason: collision with root package name */
    private PoiStruct f59582f;
    private double g;
    private double h;
    private a i;
    private double j;
    private double k;
    private AbsFragment l;
    private PoiDetailHeaderInfoPresenter.a m;
    @BindView(2131496226)
    protected View mActMore;
    @BindView(2131496225)
    protected View mActsLayout;
    @BindView(2131496224)
    protected PoiActsFlipperView mActsView;
    @BindView(2131496230)
    protected HorizontalBusinessComponentLayout mBusinessComponent;
    @BindView(2131496234)
    protected CompoundDrawableAndTextLayout mDetailDesc;
    @BindView(2131496235)
    protected View mDetailDescLayout;
    @BindView(2131496301)
    protected View mMerchantActsLayout;
    @BindView(2131496300)
    protected CompoundDrawableAndTextLayout mMerchantActsView;
    @BindView(2131496302)
    protected View mMerchantMore;
    @BindView(2131496251)
    protected View mPhone;
    @BindView(2131496252)
    protected View mPhoneDivider;
    @BindView(2131496253)
    protected View mPhoneLayout;
    @BindView(2131496180)
    protected PoiAdLayout mPoiAdLayout;
    @BindView(2131496238)
    protected CompoundDrawableAndTextLayout mPoiAddr;
    @BindView(2131496240)
    protected View mPoiAddrDivider;
    @BindView(2131496241)
    protected View mPoiAddrLayout;
    @BindView(2131496243)
    protected View mPoiCollectLayout;
    @BindView(2131496233)
    protected View mPoiContentLayout;
    @BindView(2131496220)
    protected PoiCouponLayout mPoiCouponLayout;
    @BindView(2131496246)
    protected TextView mPoiDistance;
    @BindView(2131496289)
    protected PoiHeaderLayout mPoiHeaderLayout;
    @BindView(2131496249)
    protected View mPoiNavi;
    @BindView(2131496250)
    protected View mPoiNaviDivider;
    @BindView(2131496265)
    protected CompoundDrawableAndTextLayout mPoiQueue;
    @BindView(2131496266)
    protected View mPoiQueueDivider;
    @BindView(2131496267)
    protected CompoundDrawableAndTextLayout mPoiRank;
    @BindView(2131496268)
    protected View mPoiRankLayout;
    @BindView(2131496270)
    protected CompoundDrawableAndTextLayout mPoiReserve;
    @BindView(2131496272)
    protected View mPoiReserveAndQueueDivider;
    @BindView(2131496271)
    protected View mPoiReserveAndQueueLayout;
    @BindView(2131496269)
    protected View mRankMore;
    private com.ss.android.ugc.aweme.poi.adapter.c n;

    private void k() {
        if (PatchProxy.isSupport(new Object[0], this, f59577a, false, 64865, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59577a, false, 64865, new Class[0], Void.TYPE);
            return;
        }
        String poiRank = this.f59579c.getPoiRank();
        if (!StringUtils.isEmpty(poiRank)) {
            l();
            this.mPoiRankLayout.setVisibility(0);
            this.mPoiRank.setText(poiRank);
        }
    }

    private void p() {
        if (PatchProxy.isSupport(new Object[0], this, f59577a, false, 64870, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59577a, false, 64870, new Class[0], Void.TYPE);
            return;
        }
        String desc = this.f59579c.getDesc();
        if (!StringUtils.isEmpty(desc)) {
            this.mDetailDescLayout.setVisibility(0);
            this.mDetailDesc.setText(desc);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f59577a, false, 64852, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59577a, false, 64852, new Class[0], Void.TYPE);
            return;
        }
        if (this.mActsView != null) {
            this.mActsView.a();
        }
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f59577a, false, 64859, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59577a, false, 64859, new Class[0], Void.TYPE);
            return;
        }
        this.i = af.a(this.f59578b).a((f) null);
        if (this.i != null) {
            af.a(this.f59578b).d();
            try {
                this.j = this.i.latitude;
                this.k = this.i.longitude;
                if (!this.i.isGaode) {
                    double[] b2 = com.ss.android.ugc.aweme.poi.e.a.b(this.k, this.j);
                    this.k = b2[0];
                    this.j = b2[1];
                }
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
        }
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f59577a, false, 64861, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59577a, false, 64861, new Class[0], Void.TYPE);
            return;
        }
        e();
        CompoundDrawableAndTextLayout compoundDrawableAndTextLayout = this.mPoiAddr;
        PoiStruct poiStruct = this.f59582f;
        if (PatchProxy.isSupport(new Object[]{poiStruct, 2130839739}, compoundDrawableAndTextLayout, CompoundDrawableAndTextLayout.f60982a, false, 66972, new Class[]{PoiStruct.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {poiStruct, 2130839739};
            CompoundDrawableAndTextLayout compoundDrawableAndTextLayout2 = compoundDrawableAndTextLayout;
            PatchProxy.accessDispatch(objArr, compoundDrawableAndTextLayout2, CompoundDrawableAndTextLayout.f60982a, false, 66972, new Class[]{PoiStruct.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        compoundDrawableAndTextLayout.setImageResource(2130839739);
    }

    private boolean i() {
        if (PatchProxy.isSupport(new Object[0], this, f59577a, false, 64863, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f59577a, false, 64863, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (StringUtils.isEmpty(this.f59579c.getPhone())) {
            return false;
        } else {
            this.mPhone.setVisibility(0);
            this.mPhoneDivider.setVisibility(0);
            if (this.mPoiNavi.getVisibility() == 8) {
                ((LinearLayout.LayoutParams) this.mPhoneDivider.getLayoutParams()).leftMargin = 0;
            }
            return true;
        }
    }

    private boolean j() {
        if (PatchProxy.isSupport(new Object[0], this, f59577a, false, 64864, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f59577a, false, 64864, new Class[0], Boolean.TYPE)).booleanValue();
        }
        String merchantActTitle = this.f59579c.getMerchantActTitle();
        if (TextUtils.isEmpty(merchantActTitle)) {
            return false;
        }
        this.mMerchantActsLayout.setVisibility(0);
        this.mMerchantActsView.setText(merchantActTitle);
        h.a(this.f59581e, "merchant_event_show", d.a().a("enter_from", "poi_page").a("previous_page", this.f59581e.getPreviousPage()).a("poi_id", this.f59581e.getPoiId()).a("merchant_event_id", this.f59579c.getMerchantActId()));
        return true;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f59577a, false, 64853, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59577a, false, 64853, new Class[0], Void.TYPE);
            return;
        }
        if (this.mActsView != null) {
            PoiActsFlipperView poiActsFlipperView = this.mActsView;
            if (PatchProxy.isSupport(new Object[0], poiActsFlipperView, PoiActsFlipperView.f61015a, false, 67005, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], poiActsFlipperView, PoiActsFlipperView.f61015a, false, 67005, new Class[0], Void.TYPE);
            } else if (!poiActsFlipperView.isFlipping() && poiActsFlipperView.f61016b.size() >= 2) {
                poiActsFlipperView.showNext();
                poiActsFlipperView.startFlipping();
            }
        }
    }

    private void h() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f59577a, false, 64862, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59577a, false, 64862, new Class[0], Void.TYPE);
            return;
        }
        this.mPoiHeaderLayout.a(this.f59579c);
        this.mPoiNavi.setVisibility(8);
        this.mPoiNaviDivider.setVisibility(8);
        if (this.mPoiAddrLayout.getVisibility() == 8) {
            z = true;
        } else {
            z = false;
        }
        g();
        k();
        p();
        m();
        n();
        boolean i2 = i();
        o();
        List acts = this.f59579c.getActs();
        if (!CollectionUtils.isEmpty(acts)) {
            this.mActsLayout.setVisibility(0);
            this.mActsView.a(acts, this.f59581e);
            if (z) {
                this.mActsLayout.setPadding(0, (int) UIUtils.dip2Px(this.f59578b, 7.0f), 0, 0);
            }
            z = false;
        }
        boolean j2 = j();
        if (z) {
            z = !j2;
        }
        if (z) {
            this.mPoiAddrDivider.setVisibility(8);
        }
        if (i2) {
            this.mPhoneLayout.setVisibility(0);
        }
        this.mRankMore.setVisibility(0);
        this.mActMore.setVisibility(0);
        this.mMerchantMore.setVisibility(0);
    }

    private void l() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f59577a, false, 64866, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59577a, false, 64866, new Class[0], Void.TYPE);
            return;
        }
        n poiRankBundle = this.f59579c.getPoiRankBundle();
        if (poiRankBundle != null) {
            if (poiRankBundle.classOption != null) {
                str = poiRankBundle.classOption.getName();
            } else {
                str = "";
            }
            h.a(this.f59581e, "leaderboard_bar_show", d.a().a("enter_from", "poi_page").a("previous_page", this.f59581e.getPreviousPage()).a("rank_index", String.valueOf(poiRankBundle.rankValue)).a("poi_channel", this.f59579c.getPoiRankClassCode()).a("sub_class", str).a("city_info", aa.a()).a("district_code", poiRankBundle.districtCode).a("poi_id", this.f59579c.poiStruct.poiId));
        }
    }

    private void m() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f59577a, false, 64867, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59577a, false, 64867, new Class[0], Void.TYPE);
        } else if (e.i() && !this.f59579c.isEnterprise()) {
            String bookUrl = this.f59579c.getBookUrl();
            String queueUrl = this.f59579c.getQueueUrl();
            boolean z2 = true;
            if (!TextUtils.isEmpty(bookUrl)) {
                this.mPoiReserve.setVisibility(0);
                this.mPoiReserve.setTextRes(C0906R.string.bpd);
                this.mPoiReserve.setOnClickListener(new g(this));
                b.a("show", "reserve", "poi_page", "poi_page", this.f59581e);
                z = true;
            } else {
                z = false;
            }
            if (!TextUtils.isEmpty(queueUrl)) {
                this.mPoiQueue.setVisibility(0);
                this.mPoiQueue.setTextRes(C0906R.string.bp8);
                this.mPoiQueue.setOnClickListener(new h(this));
                if (z) {
                    this.mPoiQueueDivider.setVisibility(0);
                }
                b.a("show", "queue", "poi_page", "poi_page", this.f59581e);
            } else {
                z2 = false;
            }
            if (z || z2) {
                this.mPoiReserveAndQueueLayout.setVisibility(0);
                this.mPoiReserveAndQueueDivider.setVisibility(0);
            }
        }
    }

    private void o() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f59577a, false, 64869, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59577a, false, 64869, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.poi.model.d poiActivityInfo = this.f59579c.getPoiActivityInfo();
        if (poiActivityInfo == null) {
            if (!TextUtils.isEmpty(this.f59581e.getActivityId())) {
                com.bytedance.ies.dmt.ui.d.a.b(this.f59578b, (int) C0906R.string.a2w).a();
            }
            return;
        }
        if (this.f59579c.poiExtension != null) {
            str = String.valueOf(this.f59579c.poiExtension.source);
        } else {
            str = "";
        }
        this.mPoiAdLayout.a(poiActivityInfo.getAdCard(), str, this.f59581e);
        if (poiActivityInfo.getCouponInfo() != null && !TextUtils.isEmpty(this.f59581e.getActivityId()) && !TextUtils.equals(String.valueOf(poiActivityInfo.getCouponInfo().getActivityId()), this.f59581e.getActivityId())) {
            com.bytedance.ies.dmt.ui.d.a.b(this.f59578b, (int) C0906R.string.a2w).a();
        }
        this.mPoiCouponLayout.a(poiActivityInfo.getCouponInfo(), this.l, this.f59582f.getVoucherReleaseAreas(), this.f59581e);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f59577a, false, 64855, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59577a, false, 64855, new Class[0], Void.TYPE);
            return;
        }
        g.c(this.f59578b, com.ss.android.ugc.aweme.commercialize.feed.j.a().a(this.f59581e.getAwemeId()), "reserve", this.f59581e.getPoiId());
        s.f60892b = "poi_page";
        b.a("click", "reserve", "poi_page", "poi_page", this.f59581e);
        if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            com.ss.android.ugc.aweme.login.e.a((Activity) this.f59578b, "poi_page", "click_poi_puscene_reserve", (com.ss.android.ugc.aweme.base.component.f) new f(this));
        } else {
            e.a(this.f59578b, this.f59579c.getBookUrl(), this.f59578b.getResources().getString(C0906R.string.bpd));
        }
    }

    private void n() {
        if (PatchProxy.isSupport(new Object[0], this, f59577a, false, 64868, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59577a, false, 64868, new Class[0], Void.TYPE);
            return;
        }
        if (this.f59579c.isEnterprise()) {
            ArrayList<com.ss.android.ugc.aweme.poi.widget.e> arrayList = new ArrayList<>();
            if (e.i() && !TextUtils.isEmpty(this.f59579c.getBookUrl())) {
                b.a("show", "reserve", "poi_page", "poi_page", this.f59581e);
                arrayList.add(new com.ss.android.ugc.aweme.poi.widget.e(this.f59578b.getResources().getString(C0906R.string.bpd), 2130839755, true, new i(this)));
            }
            if (e.i() && !TextUtils.isEmpty(this.f59579c.getQueueUrl())) {
                b.a("show", "queue", "poi_page", "poi_page", this.f59581e);
                arrayList.add(new com.ss.android.ugc.aweme.poi.widget.e(this.f59578b.getResources().getString(C0906R.string.bp8), 2130839753, true, new j(this)));
            }
            if (this.f59579c.isEnterprise() || !StringUtils.isEmpty(this.f59579c.getPhone())) {
                arrayList.add(new com.ss.android.ugc.aweme.poi.widget.e(this.f59578b.getResources().getString(C0906R.string.bo7), 2130839738, false, new k(this)));
                b.a("show", "contacts", "poi_page", "poi_page", this.f59581e);
            }
            if (this.f59579c.isEnterprise()) {
                arrayList.add(new com.ss.android.ugc.aweme.poi.widget.e(this.f59578b.getResources().getString(C0906R.string.box), 2130839745, true, new l(this)));
                b.a("show", "merchants", "poi_page", "poi_page", this.f59581e);
            }
            if (arrayList.size() > 2) {
                this.mBusinessComponent.a(arrayList);
                this.mPoiReserveAndQueueDivider.setVisibility(0);
                return;
            }
            int i2 = 0;
            for (com.ss.android.ugc.aweme.poi.widget.e eVar : arrayList) {
                if (i2 == 0) {
                    this.mPoiReserve.setVisibility(0);
                    this.mPoiReserve.setText(eVar.f61072a);
                    this.mPoiReserve.setImageResource(eVar.f61073b);
                    this.mPoiReserve.setOnClickListener(eVar.f61075d);
                } else {
                    this.mPoiQueue.setVisibility(0);
                    this.mPoiQueue.setText(eVar.f61072a);
                    this.mPoiQueue.setImageResource(eVar.f61073b);
                    this.mPoiQueue.setOnClickListener(eVar.f61075d);
                    this.mPoiQueueDivider.setVisibility(0);
                }
                i2++;
            }
            if (i2 != 1 || ((com.ss.android.ugc.aweme.poi.widget.e) arrayList.get(0)).f61074c) {
                if (i2 > 0) {
                    this.mPoiReserveAndQueueLayout.setVisibility(0);
                    this.mPoiReserveAndQueueDivider.setVisibility(0);
                }
                if (arrayList.size() == 1) {
                    this.mPoiAddrDivider.setVisibility(8);
                    ((LinearLayout.LayoutParams) this.mPoiReserveAndQueueLayout.getLayoutParams()).topMargin = (int) UIUtils.dip2Px(this.f59578b, 15.0f);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f59577a, false, 64856, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59577a, false, 64856, new Class[0], Void.TYPE);
            return;
        }
        s.f60892b = "poi_page";
        b.a("click", "queue", "poi_page", "poi_page", this.f59581e);
        Context context = this.f59578b;
        r rVar = this.f59579c.poiCommodity;
        String lat = this.f59579c.getLat();
        String lng = this.f59579c.getLng();
        String queueUrl = this.f59579c.getQueueUrl();
        if (PatchProxy.isSupport(new Object[]{context, rVar, "poi_page", lat, lng, queueUrl}, null, e.f59672a, true, 64845, new Class[]{Context.class, r.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context, rVar, "poi_page", lat, lng, queueUrl};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, e.f59672a, true, 64845, new Class[]{Context.class, r.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(rVar, "poiCommodity");
        Intrinsics.checkParameterIsNotNull("poi_page", "enterFrom");
        Intrinsics.checkParameterIsNotNull(queueUrl, "queueUrl");
        if (context != null) {
            IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
            if (!a2.isLogin()) {
                e.a aVar = new e.a(context, rVar, "poi_page", lat, lng, queueUrl);
                com.ss.android.ugc.aweme.base.component.f fVar = aVar;
                if (PatchProxy.isSupport(new Object[]{context, "queue", "poi_page", fVar}, null, e.f59672a, true, 64846, new Class[]{Context.class, String.class, String.class, com.ss.android.ugc.aweme.base.component.f.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context, "queue", "poi_page", fVar}, null, e.f59672a, true, 64846, new Class[]{Context.class, String.class, String.class, com.ss.android.ugc.aweme.base.component.f.class}, Void.TYPE);
                } else {
                    if (!(context instanceof Activity)) {
                        context = null;
                    }
                    if (context != null) {
                        if (context != null) {
                            com.ss.android.ugc.aweme.login.e.a((Activity) context, "poi_page", "queue", fVar);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                        }
                    }
                }
            } else {
                String a3 = e.a(context, lat, lng, queueUrl);
                String string = context.getResources().getString(C0906R.string.bp8);
                Intrinsics.checkExpressionValueIsNotNull(string, "it.resources.getString(R.string.poi_queue)");
                e.a(context, a3, string);
            }
        }
    }

    public final void e() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f59577a, false, 64860, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59577a, false, 64860, new Class[0], Void.TYPE);
        } else if (!p.a(this.g, this.h) || !p.a(this.j, this.k) || !p.a(this.f59579c, this.i)) {
            this.mPoiDistance.setVisibility(8);
        } else {
            this.mPoiDistance.setVisibility(0);
            TextView textView = this.mPoiDistance;
            Context context = this.f59578b;
            double d2 = this.g;
            double d3 = this.h;
            double d4 = this.j;
            double d5 = this.k;
            if (PatchProxy.isSupport(new Object[]{context, Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)}, null, com.ss.android.ugc.aweme.poi.e.c.f59776a, true, 66791, new Class[]{Context.class, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[]{context, Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)}, null, com.ss.android.ugc.aweme.poi.e.c.f59776a, true, 66791, new Class[]{Context.class, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, String.class);
            } else {
                double a2 = com.ss.android.ugc.aweme.poi.e.c.a(d2, d3, d4, d5);
                str = String.format(context.getResources().getString(C0906R.string.boe), new Object[]{Double.valueOf(a2)});
            }
            textView.setText(str);
        }
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f59577a, false, 64871, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f59577a, false, 64871, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.mPoiContentLayout != null) {
            this.mPoiContentLayout.setAlpha(f2);
        }
    }

    public final void a(com.ss.android.ugc.aweme.commercialize.coupon.model.c cVar) {
        com.ss.android.ugc.aweme.commercialize.coupon.model.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f59577a, false, 64874, new Class[]{com.ss.android.ugc.aweme.commercialize.coupon.model.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f59577a, false, 64874, new Class[]{com.ss.android.ugc.aweme.commercialize.coupon.model.c.class}, Void.TYPE);
            return;
        }
        this.mPoiCouponLayout.a(cVar2);
    }

    public final void a(PoiDetail poiDetail) {
        if (PatchProxy.isSupport(new Object[]{poiDetail}, this, f59577a, false, 64858, new Class[]{PoiDetail.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiDetail}, this, f59577a, false, 64858, new Class[]{PoiDetail.class}, Void.TYPE);
            return;
        }
        if (poiDetail != null && this.f59579c == null) {
            this.f59579c = poiDetail;
            this.f59582f = poiDetail.getPoiStruct();
            if (this.f59582f != null) {
                this.f59581e.setPoiId(this.f59582f.poiId);
                this.f59581e.setPoiType(this.f59582f.getTypeCode());
                this.f59581e.setBackendType(this.f59582f.getBackendTypeCode());
                this.f59581e.setPoiCity(this.f59582f.getCityCode());
                if (TextUtils.isEmpty(poiDetail.getAddress())) {
                    this.mPoiAddrLayout.setVisibility(8);
                } else {
                    this.mPoiAddr.setVisibility(0);
                    this.mPoiAddr.setText(poiDetail.getAddress());
                    if (!StringUtils.isEmpty(this.f59582f.getPoiLatitude()) && !StringUtils.isEmpty(this.f59582f.getPoiLongitude())) {
                        try {
                            f();
                            this.g = Double.parseDouble(this.f59582f.getPoiLatitude());
                            this.h = Double.parseDouble(this.f59582f.getPoiLongitude());
                            double[] a2 = com.ss.android.ugc.aweme.poi.e.c.a(this.g, this.h);
                            this.g = a2[0];
                            this.h = a2[1];
                        } catch (Exception e2) {
                            com.ss.android.ugc.aweme.framework.a.a.a(e2);
                        }
                    }
                }
            } else {
                this.mPoiAddrLayout.setVisibility(8);
            }
            h();
        }
    }

    @OnClick({2131496241, 2131496249, 2131496251, 2131496243, 2131496235, 2131496268, 2131496225, 2131496301})
    public void onClick(View view) {
        String str;
        String str2;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f59577a, false, 64851, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f59577a, false, 64851, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        Aweme a2 = com.ss.android.ugc.aweme.commercialize.feed.j.a().a(this.f59581e.getAwemeId());
        if (id == C0906R.id.c0u) {
            g.h(this.f59578b, a2, this.f59581e.getPoiId());
            h.a(this.f59578b, this.f59579c.getPhone(), "poi_page", "click_button", this.f59581e);
        } else if (id == C0906R.id.c0k) {
            h.a("click_address", "click", this.f59581e);
            if (this.m != null) {
                this.m.d_(true);
            }
            g.c(this.f59578b, a2, "address", this.f59581e.getPoiId());
        } else if (id == C0906R.id.c0s) {
            h.a("click_button", "click", this.f59581e);
            if (this.m != null) {
                this.m.d_(true);
            }
            g.c(this.f59578b, a2, "address", this.f59581e.getPoiId());
        } else if (id != C0906R.id.c0m) {
            if (id == C0906R.id.c0e) {
                if (this.f59579c != null) {
                    h.a(this.f59581e, "click_poi_introduction", d.a().a("enter_from", "poi_page").a("previous_page", this.f59581e.getPreviousPage()).a("poi_id", this.f59579c.getPoiId()));
                    Context context = this.f59578b;
                    String desc = this.f59579c.getDesc();
                    String poiId = this.f59579c.getPoiId();
                    if (PatchProxy.isSupport(new Object[]{context, desc, poiId}, null, com.ss.android.ugc.aweme.poi.e.b.f59775a, true, 66787, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context, desc, poiId}, null, com.ss.android.ugc.aweme.poi.e.b.f59775a, true, 66787, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
                    } else {
                        String str3 = "https://aweme.snssdk.com/falcon/douyin_falcon/poi/detail/?poi_id=" + poiId;
                        if (PatchProxy.isSupport(new Object[]{context, desc, str3, (byte) 0}, null, com.ss.android.ugc.aweme.poi.e.b.f59775a, true, 66786, new Class[]{Context.class, String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{context, desc, str3, (byte) 0}, null, com.ss.android.ugc.aweme.poi.e.b.f59775a, true, 66786, new Class[]{Context.class, String.class, String.class, Boolean.TYPE}, Void.TYPE);
                        } else if (!NetworkUtils.isNetworkAvailable(context)) {
                            com.bytedance.ies.dmt.ui.d.a.b(context, (int) C0906R.string.bgf).a();
                        } else {
                            Intent intent = new Intent(context, CrossPlatformActivity.class);
                            intent.setData(Uri.parse(str3));
                            intent.putExtra(PushConstants.TITLE, desc);
                            intent.putExtra("show_closeall", false);
                            intent.putExtra("hide_nav_bar", false);
                            intent.putExtra("hide_status_bar", false);
                            context.startActivity(intent);
                        }
                    }
                }
            } else if (id == C0906R.id.c1a) {
                long poiRankClassCode = this.f59579c.getPoiRankClassCode();
                n poiRankBundle = this.f59579c.getPoiRankBundle();
                if (!(poiRankClassCode == -1 || poiRankBundle == null)) {
                    IBridgeService iBridgeService = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
                    if (iBridgeService != null) {
                        if (poiRankBundle.classOption != null) {
                            str2 = poiRankBundle.classOption.getName();
                        } else {
                            str2 = "";
                        }
                        h.a(this.f59581e, "enter_poi_leaderboard", d.a().a("enter_from", "poi_page").a("city_info", aa.a()).a("enter_method", "click_leaderboard_bar").a("poi_channel", poiRankClassCode).a("sub_class", str2).a("district_code", poiRankBundle.districtCode).a("poi_id", this.f59581e.getPoiId()));
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("poi_rank", poiRankBundle);
                        bundle.putString("enter_from", "poi_page");
                        bundle.putString("enter_method", "click_leaderboard_bar");
                        bundle.putString("district_code", poiRankBundle.districtCode);
                        iBridgeService.enterPoiRankActivity(this.f59578b, bundle);
                    }
                }
            } else if (id == C0906R.id.c05) {
                if (this.n == null) {
                    this.n = new com.ss.android.ugc.aweme.poi.adapter.c(this.f59581e, "poi_page", 0);
                }
                this.mActsView.a();
                this.n.a(this.f59578b, this.mActsView.getCurrentItem(), this.mActsView.getCurrentPosition());
            } else if (id == C0906R.id.c27) {
                Context context2 = this.f59578b;
                if (this.f59582f != null) {
                    str = this.f59582f.poiName;
                } else {
                    str = "";
                }
                PoiClassRankBannerStruct merchantAct = this.f59579c.getMerchantAct();
                if (PatchProxy.isSupport(new Object[]{context2, str, merchantAct}, null, PoiNoticeActivity.f60440a, true, 66059, new Class[]{Context.class, String.class, PoiClassRankBannerStruct.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context2, str, merchantAct}, null, PoiNoticeActivity.f60440a, true, 66059, new Class[]{Context.class, String.class, PoiClassRankBannerStruct.class}, Void.TYPE);
                } else {
                    PoiNoticeActivity.a aVar = PoiNoticeActivity.f60441b;
                    if (PatchProxy.isSupport(new Object[]{context2, str, merchantAct}, aVar, PoiNoticeActivity.a.f60442a, false, 66062, new Class[]{Context.class, String.class, PoiClassRankBannerStruct.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context2, str, merchantAct}, aVar, PoiNoticeActivity.a.f60442a, false, 66062, new Class[]{Context.class, String.class, PoiClassRankBannerStruct.class}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(context2, "context");
                        Intrinsics.checkParameterIsNotNull(str, "name");
                        Intrinsics.checkParameterIsNotNull(merchantAct, "data");
                        Intent intent2 = new Intent(context2, PoiNoticeActivity.class);
                        intent2.putExtra("INTENT_TITLE", str);
                        intent2.putExtra("INTENT_DATA", merchantAct);
                        context2.startActivity(intent2);
                    }
                }
                h.a(this.f59581e, "merchant_event_click", d.a().a("enter_from", "poi_page").a("previous_page", this.f59581e.getPreviousPage()).a("poi_id", this.f59581e.getPoiId()).a("merchant_event_id", this.f59579c.getMerchantActId()));
            }
        } else if (!com.ss.android.ugc.aweme.c.a.a.a(this.mPoiCollectLayout)) {
            this.f59580d.a(view2, false);
        }
    }

    public PoiOptimizedDetailViewHolder(AbsFragment absFragment, PoiDetailHeaderInfoPresenter.a aVar, View view) {
        super(view);
        this.l = absFragment;
        this.f59578b = view.getContext();
        ButterKnife.bind((Object) this, view);
        this.m = aVar;
        this.mPoiHeaderLayout.a(absFragment, aVar, this.f59580d, null);
    }
}
