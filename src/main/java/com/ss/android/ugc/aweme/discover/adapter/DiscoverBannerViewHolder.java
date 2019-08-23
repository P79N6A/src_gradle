package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.log.l;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.helper.b;
import com.ss.android.ugc.aweme.discover.helper.i;
import com.ss.android.ugc.aweme.discover.mob.c;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.discover.widget.IndicatorView;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.ag;
import com.ss.android.ugc.aweme.utils.dp;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiscoverBannerViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41580a;

    /* renamed from: b  reason: collision with root package name */
    public static final List<Banner> f41581b = Arrays.asList(new Banner[]{new Banner()});

    /* renamed from: c  reason: collision with root package name */
    public BannerAdapter f41582c;

    /* renamed from: d  reason: collision with root package name */
    public final i f41583d;

    /* renamed from: e  reason: collision with root package name */
    public List<Banner> f41584e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f41585f = true;
    private Context g;
    private boolean h = true;
    @BindView(2131493231)
    RelativeLayout mBannerLayout;
    @BindView(2131494013)
    public IndicatorView mIndicator;
    @BindView(2131497328)
    View mStatusBar;
    @BindView(2131497895)
    TextView mTitle;
    @BindView(2131498537)
    public ViewPager mViewPager;

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f41580a, false, 35551, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f41580a, false, 35551, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!z || !this.h) {
            this.f41583d.b();
            this.mViewPager.setOnTouchListener(null);
        } else {
            this.f41583d.a();
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f41580a, false, 35553, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f41580a, false, 35553, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (AbTestManager.a().an()) {
            this.h = z;
        }
    }

    public DiscoverBannerViewHolder(View view) {
        super(view);
        int i;
        int i2;
        this.g = view.getContext();
        ButterKnife.bind((Object) this, view);
        Context context = this.g;
        if (PatchProxy.isSupport(new Object[]{context}, this, f41580a, false, 35547, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f41580a, false, 35547, new Class[]{Context.class}, Void.TYPE);
        } else {
            if (!a.a()) {
                i = UIUtils.getScreenWidth(context) - ((int) (UIUtils.dip2Px(context, 16.0f) * 2.0f));
            } else {
                i = UIUtils.getScreenWidth(context);
            }
            if (b.a()) {
                this.mTitle.setVisibility(0);
                i2 = (int) (((float) i) * 0.34985423f);
            } else {
                this.mTitle.setVisibility(8);
                i2 = (int) (((float) i) * 0.48104957f);
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mBannerLayout.getLayoutParams();
            if (!a.a()) {
                layoutParams.setMargins((int) UIUtils.dip2Px(context, 16.0f), 0, (int) UIUtils.dip2Px(context, 16.0f), 0);
            }
            layoutParams.height = i2;
            this.mBannerLayout.setLayoutParams(layoutParams);
            if (!a.a() && Build.VERSION.SDK_INT >= 21) {
                this.mBannerLayout.setOutlineProvider(new dp((int) UIUtils.dip2Px(this.itemView.getContext(), 2.0f)));
                this.mBannerLayout.setClipToOutline(true);
            }
        }
        this.f41583d = new i(this.mViewPager);
        if (Build.VERSION.SDK_INT >= 19) {
            this.mStatusBar.getLayoutParams().height = UIUtils.getStatusBarHeight(view.getContext());
        }
        this.mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41586a;

            public void onPageScrollStateChanged(int i) {
            }

            public void onPageScrolled(int i, float f2, int i2) {
            }

            public void onPageSelected(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41586a, false, 35554, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41586a, false, 35554, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                DiscoverBannerViewHolder.this.a(i);
            }
        });
        ViewCompat.setLayoutDirection(this.mIndicator, 0);
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41580a, false, 35548, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41580a, false, 35548, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!(this.f41584e == null || this.f41584e.size() == 0)) {
            List<Banner> list = this.f41584e;
            Banner banner = list.get(i % list.size());
            int size = (i % this.f41584e.size()) + 1;
            r.onEvent(MobClick.obtain().setEventName("banner_show").setLabelName("discovery").setExtValueLong((long) size).setValue(Long.toString(banner.getCreativeId())));
            List<Banner> list2 = this.f41584e;
            r.a("banner_show", (Map) new c().setBannerId(banner.getBid()).setTagId(ag.a(list2.get(i % list2.size()).getSchema())).setClientOrder(size).buildParams());
            if (banner.isAd()) {
                Context context = this.g;
                int size2 = (i % this.f41584e.size()) + 1;
                if (PatchProxy.isSupport(new Object[]{context, banner, Integer.valueOf(size2)}, null, g.f39316a, true, 31741, new Class[]{Context.class, Banner.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context, banner, Integer.valueOf(size2)}, null, g.f39316a, true, 31741, new Class[]{Context.class, Banner.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("banner_order", Integer.valueOf(size2));
                d.a().b("show").g(banner.getLogExtra()).a("discovery_ad").d("banner").a(Long.valueOf(banner.getCreativeId())).a((Object) hashMap).a(context);
                g.a((g.a) new l(banner, hashMap), (Collection<String>) banner.getTrackUrlList(), false);
            }
        }
    }
}
