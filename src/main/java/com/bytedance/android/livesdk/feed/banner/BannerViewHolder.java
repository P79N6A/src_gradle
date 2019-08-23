package com.bytedance.android.livesdk.feed.banner;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;
import com.bytedance.android.live.uikit.d.c;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout;
import com.bytedance.android.livesdk.feed.banner.adapter.BannerPageAdapter;
import com.bytedance.android.livesdk.feed.g.b;
import com.bytedance.android.livesdk.feed.n;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.subjects.PublishSubject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class BannerViewHolder extends BaseViewHolder<FeedItem> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14008a;

    /* renamed from: d  reason: collision with root package name */
    ViewPager f14009d;

    /* renamed from: e  reason: collision with root package name */
    RoundIndicatorView f14010e;

    /* renamed from: f  reason: collision with root package name */
    a f14011f = new a(this.f14009d);
    PublishSubject<Object> g;
    PublishSubject<Object> h;
    PublishSubject<Boolean> i;
    private BannerPageAdapter j;
    private PageChangeListener k;
    private List<com.bytedance.android.live.base.model.b.a> l;
    private Context m;
    private String n;
    private boolean o;
    private n p;

    public static class PageChangeListener implements ViewPager.OnPageChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14012a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f14013b;

        /* renamed from: c  reason: collision with root package name */
        public int f14014c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f14015d = true;

        /* renamed from: e  reason: collision with root package name */
        private ViewPager f14016e;

        /* renamed from: f  reason: collision with root package name */
        private a f14017f;
        private String g;

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f2, int i2) {
        }

        public void onPageSelected(int i) {
            com.bytedance.android.live.base.model.b.a aVar;
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f14012a, false, 8532, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f14012a, false, 8532, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f14014c = i2;
            if (this.f14013b) {
                BannerViewHolder.a(this.f14016e, (Runnable) this.f14017f);
                if (this.f14015d && ((BannerPageAdapter) this.f14016e.getAdapter()) != null) {
                    BannerPageAdapter bannerPageAdapter = (BannerPageAdapter) this.f14016e.getAdapter();
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, bannerPageAdapter, BannerPageAdapter.f14041e, false, 8557, new Class[]{Integer.TYPE}, com.bytedance.android.live.base.model.b.a.class)) {
                        BannerPageAdapter bannerPageAdapter2 = bannerPageAdapter;
                        aVar = (com.bytedance.android.live.base.model.b.a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, bannerPageAdapter2, BannerPageAdapter.f14041e, false, 8557, new Class[]{Integer.TYPE}, com.bytedance.android.live.base.model.b.a.class);
                    } else if (bannerPageAdapter.f14042f == null || bannerPageAdapter.f14042f.isEmpty() || i2 < 0) {
                        aVar = null;
                    } else {
                        aVar = bannerPageAdapter.f14042f.get(i2 % bannerPageAdapter.f14042f.size());
                    }
                    if (aVar != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("show_source", this.g);
                        hashMap.put("banner_id", String.valueOf(aVar.getId()));
                        b.a().a("banner_show", hashMap);
                        if (this.f14016e instanceof BannerViewPager) {
                            BannerViewPager bannerViewPager = (BannerViewPager) this.f14016e;
                            if (PatchProxy.isSupport(new Object[0], bannerViewPager, BannerViewPager.f14020b, false, 8535, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], bannerViewPager, BannerViewPager.f14020b, false, 8535, new Class[0], Void.TYPE);
                            } else if (bannerViewPager.f14021c == null || bannerViewPager.f14021c.getAction() == 3 || bannerViewPager.f14021c.getAction() == 1) {
                                bannerViewPager.post(new i(bannerViewPager));
                            }
                        }
                    }
                }
            }
        }

        public PageChangeListener(ViewPager viewPager, a aVar, String str) {
            this.f14016e = viewPager;
            this.f14017f = aVar;
            this.g = str;
        }
    }

    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14018a;

        /* renamed from: b  reason: collision with root package name */
        ViewPager f14019b;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f14018a, false, 8533, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f14018a, false, 8533, new Class[0], Void.TYPE);
            } else if (!com.bytedance.android.livesdk.feed.b.f13987b || !c.a(ac.e())) {
                try {
                    Field declaredField = ViewPager.class.getDeclaredField("mFirstLayout");
                    declaredField.setAccessible(true);
                    declaredField.set(this.f14019b, Boolean.FALSE);
                    declaredField.setAccessible(false);
                    Method declaredMethod = ViewPager.class.getDeclaredMethod("setCurrentItemInternal", new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f14019b, new Object[]{Integer.valueOf(this.f14019b.getCurrentItem() + 1), Boolean.TRUE, Boolean.TRUE, 1});
                    declaredMethod.setAccessible(false);
                } catch (Exception unused) {
                    this.f14019b.setCurrentItem(this.f14019b.getCurrentItem() + 1);
                }
            } else {
                this.f14019b.setCurrentItem(this.f14019b.getCurrentItem() + 1);
            }
        }

        public a(ViewPager viewPager) {
            this.f14019b = viewPager;
        }
    }

    public final boolean b() {
        return true;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f14008a, false, 8526, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14008a, false, 8526, new Class[0], Void.TYPE);
            return;
        }
        super.c();
        this.o = true;
        if (this.k != null) {
            this.k.f14015d = true;
        }
        e();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f14008a, false, 8527, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14008a, false, 8527, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        this.o = false;
        if (this.k != null) {
            this.k.f14015d = false;
        }
        f();
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f14008a, false, 8524, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14008a, false, 8524, new Class[0], Void.TYPE);
            return;
        }
        this.f14009d.removeCallbacks(this.f14011f);
        this.f14009d.clearOnPageChangeListeners();
        if (this.k != null) {
            this.k.f14013b = false;
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f14008a, false, 8523, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14008a, false, 8523, new Class[0], Void.TYPE);
        } else if (this.o && this.itemView != null && this.itemView.getVisibility() == 0) {
            a(this.l);
            if (!(this.l == null || this.l.size() <= 1 || this.f14009d == null || this.f14010e == null)) {
                if (this.k != null) {
                    this.k.f14013b = true;
                }
                this.f14009d.clearOnPageChangeListeners();
                this.f14009d.addOnPageChangeListener(this.k);
                this.f14010e.setViewPager(this.f14009d);
                a(this.f14009d, (Runnable) this.f14011f);
            }
        }
    }

    private void a(List<com.bytedance.android.live.base.model.b.a> list) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{list}, this, f14008a, false, 8521, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f14008a, false, 8521, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.k != null) {
            i2 = this.k.f14014c;
        }
        if (list != null && !list.isEmpty() && this.o) {
            HashMap hashMap = new HashMap();
            hashMap.put("show_source", this.n);
            hashMap.put("banner_id", String.valueOf(list.get(i2 % list.size()).getId()));
            b.a().a("banner_show", hashMap);
        }
    }

    public static void a(ViewPager viewPager, Runnable runnable) {
        ViewPager viewPager2 = viewPager;
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{viewPager2, runnable2}, null, f14008a, true, 8522, new Class[]{ViewPager.class, Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager2, runnable2}, null, f14008a, true, 8522, new Class[]{ViewPager.class, Runnable.class}, Void.TYPE);
            return;
        }
        viewPager.removeCallbacks(runnable);
        viewPager2.postDelayed(runnable2, 5000);
    }

    private static boolean a(List<com.bytedance.android.live.base.model.b.a> list, List<com.bytedance.android.live.base.model.b.a> list2) {
        List<com.bytedance.android.live.base.model.b.a> list3 = list;
        List<com.bytedance.android.live.base.model.b.a> list4 = list2;
        if (PatchProxy.isSupport(new Object[]{list3, list4}, null, f14008a, true, 8525, new Class[]{List.class, List.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list3, list4}, null, f14008a, true, 8525, new Class[]{List.class, List.class}, Boolean.TYPE)).booleanValue();
        } else if (list3 == list4) {
            return true;
        } else {
            if (list3 != null && list4 == null) {
                return false;
            }
            if ((list3 == null && list4 != null) || list.size() != list2.size()) {
                return false;
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                com.bytedance.android.live.base.model.b.a aVar = list3.get(i2);
                com.bytedance.android.live.base.model.b.a aVar2 = list4.get(i2);
                if (aVar != null && !aVar.a(aVar2)) {
                    return false;
                }
                if (aVar2 != null && !aVar2.a(aVar)) {
                    return false;
                }
            }
            return true;
        }
    }

    public final /* synthetic */ void a(Object obj, int i2) {
        int i3;
        FeedItem feedItem = (FeedItem) obj;
        if (PatchProxy.isSupport(new Object[]{feedItem, Integer.valueOf(i2)}, this, f14008a, false, 8520, new Class[]{FeedItem.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItem, Integer.valueOf(i2)}, this, f14008a, false, 8520, new Class[]{FeedItem.class, Integer.TYPE}, Void.TYPE);
        } else if (feedItem != null && feedItem.banners != null) {
            List<com.bytedance.android.live.base.model.b.a> list = feedItem.banners;
            if (!a(this.l, list)) {
                a(list);
                this.f14009d.removeCallbacks(this.f14011f);
                this.l = list;
                this.f14009d.setAdapter(null);
                if (list == null || list.isEmpty()) {
                    ViewGroup.LayoutParams layoutParams = this.f14009d.getLayoutParams();
                    layoutParams.height = 0;
                    this.f14009d.setLayoutParams(layoutParams);
                    this.j = null;
                    this.f14010e.setVisibility(8);
                } else {
                    ViewGroup.LayoutParams layoutParams2 = this.f14009d.getLayoutParams();
                    Iterator<com.bytedance.android.live.base.model.b.a> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            i3 = 0;
                            break;
                        }
                        com.bytedance.android.live.base.model.b.a next = it2.next();
                        if (next != null && next.g != 0) {
                            i3 = (UIUtils.getScreenWidth(this.m) * next.f7703f) / next.g;
                            break;
                        }
                    }
                    if (i3 != layoutParams2.height) {
                        layoutParams2.height = i3;
                        this.f14009d.setLayoutParams(layoutParams2);
                    }
                    if (this.j == null) {
                        this.j = new BannerPageAdapter(this.itemView.getContext(), LayoutInflater.from(this.itemView.getContext()), this.n, this.p);
                    }
                    BannerPageAdapter bannerPageAdapter = this.j;
                    List<com.bytedance.android.live.base.model.b.a> list2 = this.l;
                    if (PatchProxy.isSupport(new Object[]{list2}, bannerPageAdapter, BannerPageAdapter.f14041e, false, 8553, new Class[]{List.class}, Void.TYPE)) {
                        BannerPageAdapter bannerPageAdapter2 = bannerPageAdapter;
                        PatchProxy.accessDispatch(new Object[]{list2}, bannerPageAdapter2, BannerPageAdapter.f14041e, false, 8553, new Class[]{List.class}, Void.TYPE);
                    } else {
                        bannerPageAdapter.f14042f.clear();
                        if (list2 != null) {
                            bannerPageAdapter.f14042f.addAll(list2);
                        }
                        bannerPageAdapter.notifyDataSetChanged();
                    }
                    this.f14009d.setAdapter(this.j);
                    if (this.l.size() > 1) {
                        a(this.f14009d, (Runnable) this.f14011f);
                        this.f14009d.clearOnPageChangeListeners();
                        this.f14009d.addOnPageChangeListener(this.k);
                        if (this.k != null) {
                            this.k.f14013b = true;
                        }
                        this.f14010e.setViewPager(this.f14009d);
                        this.f14010e.setVisibility(0);
                        this.f14010e.setCount(list.size());
                        this.f14009d.setCurrentItem(this.l.size() * (Integer.MAX_VALUE / (this.l.size() * 2)));
                    } else {
                        this.f14010e.setVisibility(8);
                    }
                }
            }
        }
    }

    public BannerViewHolder(View view, BannerSwipeRefreshLayout.a aVar, com.bytedance.android.livesdk.feed.d.c cVar, PublishSubject<Object> publishSubject, PublishSubject<Object> publishSubject2, PublishSubject<Boolean> publishSubject3, n nVar) {
        super(view);
        this.f14009d = (ViewPager) view.findViewById(C0906R.id.duu);
        this.f14010e = (RoundIndicatorView) view.findViewById(C0906R.id.au6);
        this.m = view.getContext();
        this.n = cVar.f14075c;
        this.p = nVar;
        this.g = publishSubject;
        this.h = publishSubject2;
        this.i = publishSubject3;
        this.f14009d.removeCallbacks(this.f14011f);
        this.k = new PageChangeListener(this.f14009d, this.f14011f, this.n);
        this.f14009d.setOnTouchListener(new b(this));
        this.f14010e.setViewPager(this.f14009d);
        RoundIndicatorView roundIndicatorView = this.f14010e;
        PageChangeListener pageChangeListener = this.k;
        if (PatchProxy.isSupport(new Object[]{pageChangeListener}, roundIndicatorView, RoundIndicatorView.f14024a, false, 8545, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE)) {
            RoundIndicatorView roundIndicatorView2 = roundIndicatorView;
            PatchProxy.accessDispatch(new Object[]{pageChangeListener}, roundIndicatorView2, RoundIndicatorView.f14024a, false, 8545, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE);
        } else if (roundIndicatorView.f14026c != null) {
            roundIndicatorView.f14026c.addOnPageChangeListener(pageChangeListener);
        }
        if (aVar != null) {
            aVar.a(this.f14009d, view);
        }
        this.i.subscribe(new c(this), d.f14055a);
        this.g.subscribe(new e(this), f.f14058a);
        this.h.subscribe(new g(this), h.f14061a);
        if (com.bytedance.android.livesdk.feed.l.c.c()) {
            view.setContentDescription(ac.a((int) C0906R.string.czt));
        }
    }
}
