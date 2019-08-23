package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.discover.helper.i;
import com.ss.android.ugc.aweme.discover.widget.BannerViewPager;
import com.ss.android.ugc.aweme.discover.widget.IndicatorView;
import com.ss.android.ugc.aweme.feed.model.poi.PoiClassRankBannerStruct;
import com.ss.android.ugc.aweme.poi.a.b;
import com.ss.android.ugc.aweme.poi.adapter.InfiniteLoopPoiBannerAdapter;
import com.ss.android.ugc.aweme.poi.adapter.PoiRankBannerPagerAdapter;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.u.aa;
import java.util.List;

public class PoiCommonBannerViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59537a;

    /* renamed from: b  reason: collision with root package name */
    public List<PoiClassRankBannerStruct> f59538b;

    /* renamed from: c  reason: collision with root package name */
    private i f59539c;

    /* renamed from: d  reason: collision with root package name */
    private PoiRankBannerPagerAdapter f59540d;

    /* renamed from: e  reason: collision with root package name */
    private Context f59541e;

    /* renamed from: f  reason: collision with root package name */
    private View f59542f;
    private c g;
    @BindView(2131496189)
    protected View mDividerBottom;
    @BindView(2131496190)
    protected IndicatorView mIndicator;
    @BindView(2131496191)
    protected BannerViewPager mViewPager;

    public PoiCommonBannerViewHolder(View view) {
        super(view);
        this.f59541e = view.getContext();
        this.f59542f = view;
        ButterKnife.bind((Object) this, view);
    }

    public final void a(PoiClassRankBannerStruct poiClassRankBannerStruct, int i) {
        if (PatchProxy.isSupport(new Object[]{poiClassRankBannerStruct, Integer.valueOf(i)}, this, f59537a, false, 64819, new Class[]{PoiClassRankBannerStruct.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiClassRankBannerStruct, Integer.valueOf(i)}, this, f59537a, false, 64819, new Class[]{PoiClassRankBannerStruct.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        h.a(this.g, "banner_show", d.a().a("enter_from", "poi_page").a("previous_page", this.g.getPreviousPage()).a("banner_id", poiClassRankBannerStruct.getBid()).a("client_order", i).a("city_info", aa.a()).a("from_poi_id", this.g.getPoiId()));
    }

    public final void a(b bVar, c cVar) {
        if (PatchProxy.isSupport(new Object[]{bVar, cVar}, this, f59537a, false, 64818, new Class[]{b.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, cVar}, this, f59537a, false, 64818, new Class[]{b.class, c.class}, Void.TYPE);
        } else if (bVar == null || bVar.size() == 0) {
            this.f59542f.setVisibility(8);
        } else if (this.f59538b == null) {
            this.g = cVar;
            this.f59542f.setVisibility(0);
            this.f59538b = bVar.getBanners();
            this.f59539c = new i(this.mViewPager);
            ViewCompat.setLayoutDirection(this.mIndicator, 0);
            if (this.f59540d == null) {
                this.f59540d = new PoiRankBannerPagerAdapter(this.f59541e, LayoutInflater.from(this.f59541e));
                this.f59540d.f59434b = this.g;
                this.mViewPager.setAdapter(new InfiniteLoopPoiBannerAdapter(this.f59540d, this.f59538b.size(), true));
            }
            this.f59539c.f42344c = this.f59538b.size();
            this.f59540d.a(this.f59538b, 0, 53);
            this.mIndicator.a(this.mViewPager);
            if (this.f59538b.size() > 1) {
                this.mIndicator.setVisibility(0);
                this.f59539c.a();
            } else {
                this.mIndicator.setVisibility(8);
                this.f59539c.b();
                this.mViewPager.setOnTouchListener(null);
            }
            a(this.f59538b.get(0), 0);
            this.mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f59543a;

                public void onPageScrollStateChanged(int i) {
                }

                public void onPageScrolled(int i, float f2, int i2) {
                }

                public void onPageSelected(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f59543a, false, 64820, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f59543a, false, 64820, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    int size = i % PoiCommonBannerViewHolder.this.f59538b.size();
                    PoiCommonBannerViewHolder.this.a(PoiCommonBannerViewHolder.this.f59538b.get(size), size);
                }
            });
        }
    }
}
