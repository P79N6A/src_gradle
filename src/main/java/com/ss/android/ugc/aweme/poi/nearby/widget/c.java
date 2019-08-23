package com.ss.android.ugc.aweme.poi.nearby.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.helper.i;
import com.ss.android.ugc.aweme.discover.widget.BannerViewPager;
import com.ss.android.ugc.aweme.discover.widget.IndicatorView;
import com.ss.android.ugc.aweme.feed.model.poi.PoiClassRankBannerStruct;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.ss.android.ugc.aweme.poi.adapter.InfiniteLoopPoiBannerAdapter;
import com.ss.android.ugc.aweme.poi.adapter.PoiRankBannerPagerAdapter;
import com.ss.android.ugc.aweme.poi.model.l;
import com.ss.android.ugc.aweme.poi.nearby.adapter.PoiTypePagerAdapter;
import com.ss.android.ugc.aweme.poi.nearby.adapter.PoiTypeRecyclerAdapter;
import com.ss.android.ugc.aweme.poi.nearby.adapter.a;
import com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity;
import com.ss.android.ugc.aweme.u.aa;
import java.util.List;
import java.util.Map;

public final class c extends LinearLayout implements PoiTypeRecyclerAdapter.a, a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60109a;

    /* renamed from: b  reason: collision with root package name */
    Context f60110b;

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f60111c;

    /* renamed from: d  reason: collision with root package name */
    BannerViewPager f60112d;

    /* renamed from: e  reason: collision with root package name */
    IndicatorView f60113e;

    /* renamed from: f  reason: collision with root package name */
    PoiRankBannerPagerAdapter f60114f;
    i g;
    ViewGroup h;
    ViewPager i;
    PoiTypePagerAdapter j;
    DmtTextView k;
    DmtTextView l;
    DmtTextView m;
    List<PoiClassRankBannerStruct> n;
    int o;
    private boolean p;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f60109a, false, 65366, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60109a, false, 65366, new Class[0], Void.TYPE);
            return;
        }
        this.h.setVisibility(8);
    }

    public final void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f60109a, false, 65369, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60109a, false, 65369, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.p = true;
        a(true);
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f60109a, false, 65370, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60109a, false, 65370, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.p = false;
        a(false);
    }

    public final void setPoiClassCode(int i2) {
        this.o = i2;
    }

    public c(Context context) {
        this(context, null);
    }

    public final void a(SimplePoiInfoStruct simplePoiInfoStruct) {
        SimplePoiInfoStruct simplePoiInfoStruct2 = simplePoiInfoStruct;
        if (PatchProxy.isSupport(new Object[]{simplePoiInfoStruct2}, this, f60109a, false, 65368, new Class[]{SimplePoiInfoStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{simplePoiInfoStruct2}, this, f60109a, false, 65368, new Class[]{SimplePoiInfoStruct.class}, Void.TYPE);
            return;
        }
        PoiDetailActivity.a(getContext(), new l.a().c(simplePoiInfoStruct2.poiId).g(simplePoiInfoStruct2.poiName).a(simplePoiInfoStruct2).i("categorized_city_poi").l("click_categorized_poi").m(String.valueOf(this.o)).a());
    }

    public final void setAwemeListEmptyVisibility(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60109a, false, 65367, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60109a, false, 65367, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.m.setVisibility(i2);
    }

    public final void setData(List<List<SimplePoiInfoStruct>> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f60109a, false, 65363, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f60109a, false, 65363, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.h.setVisibility(0);
        this.j = new PoiTypePagerAdapter(list, this);
        this.i.setAdapter(this.j);
    }

    public final void setBannerData(List<PoiClassRankBannerStruct> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f60109a, false, 65364, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f60109a, false, 65364, new Class[]{List.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(list)) {
            this.n = list;
            this.f60111c.setVisibility(0);
            if (this.f60114f == null) {
                this.f60114f = new PoiRankBannerPagerAdapter(this.f60110b, LayoutInflater.from(this.f60110b));
                this.f60112d.setAdapter(new InfiniteLoopPoiBannerAdapter(this.f60114f, this.n.size(), true));
            }
            this.g.f42344c = list.size();
            this.f60114f.a(list, this.o, 51);
            this.f60113e.a(this.f60112d);
            if (list.size() > 1) {
                this.f60113e.setVisibility(0);
                this.g.a();
            } else {
                this.f60113e.setVisibility(8);
                this.g.b();
            }
            a(list.get(0), 0);
            this.f60112d.addOnPageChangeListener(new PoiTypeFeedsHeadView$1(this));
        } else {
            this.f60111c.setVisibility(8);
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f60109a, false, 65371, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f60109a, false, 65371, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.g != null) {
            if (!z || CollectionUtils.isEmpty(this.n) || this.n.size() <= 1 || !this.p) {
                this.g.b();
            } else {
                this.g.a();
            }
        }
    }

    private c(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public final void a(PoiClassRankBannerStruct poiClassRankBannerStruct, int i2) {
        if (PatchProxy.isSupport(new Object[]{poiClassRankBannerStruct, Integer.valueOf(i2)}, this, f60109a, false, 65372, new Class[]{PoiClassRankBannerStruct.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiClassRankBannerStruct, Integer.valueOf(i2)}, this, f60109a, false, 65372, new Class[]{PoiClassRankBannerStruct.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        r.a("banner_show", (Map) d.a().a("enter_from", "categorized_city_poi").a("previous_page", "categorized_city_poi").a("banner_id", poiClassRankBannerStruct.getBid()).a("client_order", i2).a("poi_channel", this.o).a("city_info", aa.a()).f34114b);
    }

    private c(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        if (PatchProxy.isSupport(new Object[]{context}, this, f60109a, false, 65362, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f60109a, false, 65362, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f60110b = context;
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.re, this, true);
        this.f60111c = (ViewGroup) inflate.findViewById(C0906R.id.jf);
        this.f60112d = (BannerViewPager) inflate.findViewById(C0906R.id.duu);
        this.f60113e = (IndicatorView) inflate.findViewById(C0906R.id.a6b);
        this.h = (ViewGroup) inflate.findViewById(C0906R.id.c2n);
        this.i = (ViewPager) inflate.findViewById(C0906R.id.c46);
        this.k = (DmtTextView) inflate.findViewById(C0906R.id.c2a);
        this.l = (DmtTextView) inflate.findViewById(C0906R.id.c2_);
        this.m = (DmtTextView) inflate.findViewById(C0906R.id.ij);
        this.g = new i(this.f60112d);
        ViewCompat.setLayoutDirection(this.f60113e, 0);
        this.l.setOnClickListener(new d(this));
    }
}
