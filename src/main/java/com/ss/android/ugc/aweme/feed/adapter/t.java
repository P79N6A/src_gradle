package com.ss.android.ugc.aweme.feed.adapter;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.helper.i;
import com.ss.android.ugc.aweme.discover.widget.BannerViewPager;
import com.ss.android.ugc.aweme.discover.widget.IndicatorView;
import com.ss.android.ugc.aweme.feed.adapter.PoiTypeEntranceAdapter;
import com.ss.android.ugc.aweme.feed.model.poi.PoiClassRankBannerStruct;
import com.ss.android.ugc.aweme.feed.model.poi.PoiVerticalEntranceStruct;
import com.ss.android.ugc.aweme.feed.ui.SelectNearbyActivity;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.poi.adapter.InfiniteLoopPoiBannerAdapter;
import com.ss.android.ugc.aweme.poi.adapter.PoiRankBannerPagerAdapter;
import com.ss.android.ugc.aweme.poi.nearby.adapter.a;
import com.ss.android.ugc.aweme.poi.nearby.ui.PoiTypeFeedsActivity;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.List;
import java.util.Map;

public final class t extends FrameLayout implements PoiTypeEntranceAdapter.a, a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44958a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f44959b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f44960c;

    /* renamed from: d  reason: collision with root package name */
    public ViewGroup f44961d;

    /* renamed from: e  reason: collision with root package name */
    BannerViewPager f44962e;

    /* renamed from: f  reason: collision with root package name */
    IndicatorView f44963f;
    PoiRankBannerPagerAdapter g;
    i h;
    List<PoiClassRankBannerStruct> i;
    private ViewGroup j;
    private ViewGroup k;
    private RecyclerView l;
    private PoiTypeEntranceAdapter m;
    private LinearLayoutManager n;
    private View o;
    private View p;
    private boolean q;

    public final void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f44958a, false, 40586, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44958a, false, 40586, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.q = true;
        a(true);
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f44958a, false, 40587, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44958a, false, 40587, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.q = false;
        a(false);
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f44958a, false, 40582, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44958a, false, 40582, new Class[0], Void.TYPE);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.j, "alpha", new float[]{this.j.getAlpha(), 1.0f});
        ofFloat.setDuration(150);
        ofFloat.start();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f44958a, false, 40575, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44958a, false, 40575, new Class[0], Void.TYPE);
            return;
        }
        Context context = getContext();
        if (PatchProxy.isSupport(new Object[]{context}, null, SelectNearbyActivity.f46283a, true, 42989, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, null, SelectNearbyActivity.f46283a, true, 42989, new Class[]{Context.class}, Void.TYPE);
        } else {
            context.startActivity(new Intent(context, SelectNearbyActivity.class));
        }
        r.a("homepage_fresh_city_change", (Map) d.a().a("city_info", aa.a()).f34114b);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f44958a, false, 40580, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44958a, false, 40580, new Class[0], Void.TYPE);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f44960c.getText() != null) {
            sb.append(this.f44960c.getText().toString());
        }
        if (this.f44959b.getText() != null) {
            sb.append(this.f44959b.getText().toString());
        }
        this.o.setContentDescription(sb.toString());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f44958a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.view.MotionEvent> r3 = android.view.MotionEvent.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 40576(0x9e80, float:5.6859E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f44958a
            r13 = 0
            r14 = 40576(0x9e80, float:5.6859E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.view.MotionEvent> r0 = android.view.MotionEvent.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003b:
            int r1 = r18.getAction()
            r2 = 3
            if (r1 == r2) goto L_0x008b
            switch(r1) {
                case 0: goto L_0x004c;
                case 1: goto L_0x0048;
                default: goto L_0x0045;
            }
        L_0x0045:
            r1 = r17
            goto L_0x0090
        L_0x0048:
            r17.c()
            goto L_0x0045
        L_0x004c:
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = f44958a
            r13 = 0
            r14 = 40583(0x9e87, float:5.6869E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x0072
            java.lang.Object[] r2 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r4 = f44958a
            r5 = 0
            r6 = 40583(0x9e87, float:5.6869E-41)
            java.lang.Class[] r7 = new java.lang.Class[r9]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0045
        L_0x0072:
            r1 = r17
            android.view.ViewGroup r2 = r1.j
            java.lang.String r3 = "alpha"
            r4 = 2
            float[] r4 = new float[r4]
            r4 = {1065353216, 1056964608} // fill-array
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r3, r4)
            r3 = 150(0x96, double:7.4E-322)
            r2.setDuration(r3)
            r2.start()
            goto L_0x0090
        L_0x008b:
            r1 = r17
            r17.c()
        L_0x0090:
            boolean r0 = super.onTouchEvent(r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.t.b(android.view.MotionEvent):boolean");
    }

    public final void setBannerData(List<PoiClassRankBannerStruct> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f44958a, false, 40584, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f44958a, false, 40584, new Class[]{List.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(list)) {
            this.i = list;
            this.f44961d.setVisibility(0);
            if (this.g == null) {
                this.g = new PoiRankBannerPagerAdapter(getContext(), LayoutInflater.from(getContext()));
                this.f44962e.setAdapter(new InfiniteLoopPoiBannerAdapter(this.g, this.i.size(), true));
            }
            this.h.f42344c = list.size();
            this.g.a(list, 0, 54);
            this.f44963f.a(this.f44962e);
            if (list.size() > 1) {
                this.f44963f.setVisibility(0);
                this.h.a();
            } else {
                this.f44963f.setVisibility(8);
                this.h.b();
            }
            a(list.get(0), 0);
            this.f44962e.addOnPageChangeListener(new NearByHeadView$1(this));
        } else {
            this.f44961d.setVisibility(8);
        }
    }

    public final void setData(List<PoiVerticalEntranceStruct> list) {
        List<PoiVerticalEntranceStruct> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f44958a, false, 40577, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f44958a, false, 40577, new Class[]{List.class}, Void.TYPE);
        } else if (CollectionUtils.isEmpty(list)) {
            this.k.setVisibility(8);
        } else {
            this.k.setVisibility(0);
            PoiTypeEntranceAdapter poiTypeEntranceAdapter = this.m;
            if (PatchProxy.isSupport(new Object[]{list2}, poiTypeEntranceAdapter, PoiTypeEntranceAdapter.f44758a, false, 40603, new Class[]{List.class}, Void.TYPE)) {
                PoiTypeEntranceAdapter poiTypeEntranceAdapter2 = poiTypeEntranceAdapter;
                PatchProxy.accessDispatch(new Object[]{list2}, poiTypeEntranceAdapter2, PoiTypeEntranceAdapter.f44758a, false, 40603, new Class[]{List.class}, Void.TYPE);
                return;
            }
            poiTypeEntranceAdapter.f44759b = list2;
            poiTypeEntranceAdapter.notifyDataSetChanged();
        }
    }

    public t(Context context) {
        super(context);
        if (PatchProxy.isSupport(new Object[0], this, f44958a, false, 40574, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44958a, false, 40574, new Class[0], Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.y2, null, false);
        this.f44959b = (TextView) inflate.findViewById(C0906R.id.sw);
        this.f44960c = (TextView) inflate.findViewById(C0906R.id.su);
        this.j = (ViewGroup) inflate.findViewById(C0906R.id.alv);
        this.o = inflate.findViewById(C0906R.id.dtq);
        this.p = inflate.findViewById(C0906R.id.dun);
        this.k = (ViewGroup) inflate.findViewById(C0906R.id.c3z);
        this.l = (RecyclerView) inflate.findViewById(C0906R.id.c42);
        this.f44961d = (ViewGroup) inflate.findViewById(C0906R.id.jf);
        this.f44962e = (BannerViewPager) inflate.findViewById(C0906R.id.duu);
        this.f44963f = (IndicatorView) inflate.findViewById(C0906R.id.a6b);
        this.h = new i(this.f44962e);
        ViewCompat.setLayoutDirection(this.f44963f, 0);
        this.k.setVisibility(8);
        this.o.setOnClickListener(new u(this));
        this.p.setOnClickListener(new v(this));
        this.o.setOnTouchListener(new w(this));
        this.p.setOnTouchListener(new x(this));
        b();
        if (MainPageExperimentHelper.i()) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.j.getLayoutParams();
            layoutParams.setMargins(layoutParams.leftMargin, (int) (UIUtils.dip2Px(getContext(), 56.0f) + ((float) StatusBarUtils.getStatusBarHeight(getContext()))), layoutParams.rightMargin, layoutParams.bottomMargin);
            this.j.setLayoutParams(layoutParams);
        }
        this.n = new WrapLinearLayoutManager(getContext(), 0, false);
        this.l.setLayoutManager(this.n);
        this.m = new PoiTypeEntranceAdapter(this);
        this.l.setAdapter(this.m);
        addView(inflate);
    }

    public final void a(PoiVerticalEntranceStruct poiVerticalEntranceStruct) {
        PoiVerticalEntranceStruct poiVerticalEntranceStruct2 = poiVerticalEntranceStruct;
        if (PatchProxy.isSupport(new Object[]{poiVerticalEntranceStruct2}, this, f44958a, false, 40581, new Class[]{PoiVerticalEntranceStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiVerticalEntranceStruct2}, this, f44958a, false, 40581, new Class[]{PoiVerticalEntranceStruct.class}, Void.TYPE);
            return;
        }
        r.a("click_categorized_city_poi", (Map) d.a().a("city_info", aa.a()).a("poi_channel", poiVerticalEntranceStruct2.code).f34114b);
        if (poiVerticalEntranceStruct2.type == 1) {
            aa.f75005b = String.valueOf(poiVerticalEntranceStruct2.code);
            Intent intent = new Intent(getContext(), PoiTypeFeedsActivity.class);
            intent.putExtra("poi_class_code", poiVerticalEntranceStruct2.code);
            intent.putExtra("poi_name", poiVerticalEntranceStruct2.name);
            getContext().startActivity(intent);
            return;
        }
        h.a().a(poiVerticalEntranceStruct2.url);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f44958a, false, 40589, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f44958a, false, 40589, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.h != null) {
            if (!z || CollectionUtils.isEmpty(this.i) || this.i.size() <= 1 || !this.q) {
                this.h.b();
            } else {
                this.h.a();
            }
        }
    }

    public final void a(PoiClassRankBannerStruct poiClassRankBannerStruct, int i2) {
        if (PatchProxy.isSupport(new Object[]{poiClassRankBannerStruct, Integer.valueOf(i2)}, this, f44958a, false, 40588, new Class[]{PoiClassRankBannerStruct.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiClassRankBannerStruct, Integer.valueOf(i2)}, this, f44958a, false, 40588, new Class[]{PoiClassRankBannerStruct.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        r.a("banner_show", (Map) d.a().a("enter_from", "homepage_fresh").a("previous_page", "homepage_fresh").a("banner_id", poiClassRankBannerStruct.getBid()).a("client_order", i2).a("city_info", aa.a()).f34114b);
    }
}
