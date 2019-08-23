package com.bytedance.android.livesdk.feed.fragment;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.media.Media;
import com.bytedance.android.live.core.network.d;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout;
import com.bytedance.android.livesdk.feed.adapter.c;
import com.bytedance.android.livesdk.feed.h;
import com.bytedance.android.livesdk.feed.h.a;
import com.bytedance.android.livesdk.feed.j.b;
import com.bytedance.android.livesdk.feed.q;
import com.bytedance.android.livesdk.feed.tab.d.a;
import com.bytedance.android.livesdk.feed.ui.FeedItemDecoration2;
import com.bytedance.android.livesdk.feed.viewmodel.DislikeTipViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.FeedTabViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.FragmentFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.SyncContentViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TimeOutRefreshViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import org.json.JSONObject;

public abstract class BaseTabFeedFragment extends BaseFeedFragment {
    public static ChangeQuickRedirect j;
    protected BannerSwipeRefreshLayout k;
    protected TabFeedViewModel l;
    public DislikeTipViewModel m;
    public a n;
    public ViewModelProvider.Factory o;
    protected FeedTabViewModel p;
    protected View q;
    private TimeOutRefreshViewModel r;
    private SyncContentViewModel s;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void m() {
        this.l.a("feed_refresh");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void n() throws Exception {
        if (this.l != null) {
            this.l.a("enter_auto");
        }
    }

    public final long c() {
        if (!PatchProxy.isSupport(new Object[0], this, j, false, 8633, new Class[0], Long.TYPE)) {
            return l();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, j, false, 8633, new Class[0], Long.TYPE)).longValue();
    }

    @CallSuper
    public int d() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 8632, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, j, false, 8632, new Class[0], Integer.TYPE)).intValue();
        }
        int intValue = ((Integer) b.f14213d.a()).intValue();
        if (intValue <= 1) {
            intValue = super.d();
        }
        return intValue;
    }

    public long l() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 8628, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, j, false, 8628, new Class[0], Long.TYPE)).longValue();
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getLong("id");
        }
        return -1;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 8623, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 8623, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        k();
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 8622, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 8622, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        j();
    }

    public FragmentFeedViewModel e() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 8630, new Class[0], FragmentFeedViewModel.class)) {
            return (FragmentFeedViewModel) PatchProxy.accessDispatch(new Object[0], this, j, false, 8630, new Class[0], FragmentFeedViewModel.class);
        }
        this.l = (TabFeedViewModel) ViewModelProviders.of((Fragment) this, (ViewModelProvider.Factory) this.f14122c.a(l()).a((h) this)).get(TabFeedViewModel.class);
        this.l.f7975d.observe(this, new g(this));
        this.k.setOnRefreshListener(new h(this));
        return this.l;
    }

    public final RecyclerView.ItemDecoration i() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 8631, new Class[0], RecyclerView.ItemDecoration.class)) {
            return (RecyclerView.ItemDecoration) PatchProxy.accessDispatch(new Object[0], this, j, false, 8631, new Class[0], RecyclerView.ItemDecoration.class);
        }
        this.h.setPadding(this.h.getPaddingLeft(), this.h.getPaddingTop(), this.h.getPaddingRight(), this.h.getPaddingBottom());
        return new FeedItemDecoration2();
    }

    public void j() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 8624, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 8624, new Class[0], Void.TYPE);
            return;
        }
        if (this.m != null) {
            this.m.f14460c = -1;
        }
        if (this.r != null) {
            TimeOutRefreshViewModel timeOutRefreshViewModel = this.r;
            if (PatchProxy.isSupport(new Object[0], timeOutRefreshViewModel, TimeOutRefreshViewModel.f14475a, false, 9039, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], timeOutRefreshViewModel, TimeOutRefreshViewModel.f14475a, false, 9039, new Class[0], Void.TYPE);
            } else if (timeOutRefreshViewModel.f14478d == Long.MAX_VALUE) {
                timeOutRefreshViewModel.f14478d = System.currentTimeMillis();
            }
        }
    }

    public void k() {
        long j2;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 8625, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 8625, new Class[0], Void.TYPE);
            return;
        }
        if (this.r != null) {
            TimeOutRefreshViewModel timeOutRefreshViewModel = this.r;
            if (PatchProxy.isSupport(new Object[0], timeOutRefreshViewModel, TimeOutRefreshViewModel.f14475a, false, 9040, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], timeOutRefreshViewModel, TimeOutRefreshViewModel.f14475a, false, 9040, new Class[0], Void.TYPE);
                return;
            }
            if (!timeOutRefreshViewModel.f14476b && timeOutRefreshViewModel.f14478d != Long.MAX_VALUE) {
                long currentTimeMillis = System.currentTimeMillis() - timeOutRefreshViewModel.f14478d;
                if (PatchProxy.isSupport(new Object[0], timeOutRefreshViewModel, TimeOutRefreshViewModel.f14475a, false, 9041, new Class[0], Long.TYPE)) {
                    j2 = ((Long) PatchProxy.accessDispatch(new Object[0], timeOutRefreshViewModel, TimeOutRefreshViewModel.f14475a, false, 9041, new Class[0], Long.TYPE)).longValue();
                } else {
                    j2 = (long) ((Integer) b.f14212c.a()).intValue();
                }
                if (currentTimeMillis > j2) {
                    timeOutRefreshViewModel.f14477c.onNext(i.f8107b);
                }
            }
            timeOutRefreshViewModel.f14478d = Long.MAX_VALUE;
            timeOutRefreshViewModel.f14476b = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(d dVar) {
        boolean z;
        BannerSwipeRefreshLayout bannerSwipeRefreshLayout = this.k;
        if (dVar == null || !dVar.a()) {
            z = false;
        } else {
            z = true;
        }
        bannerSwipeRefreshLayout.setRefreshing(z);
    }

    public final void a(FeedItem feedItem) {
        if (PatchProxy.isSupport(new Object[]{feedItem}, this, j, false, 8629, new Class[]{FeedItem.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItem}, this, j, false, 8629, new Class[]{FeedItem.class}, Void.TYPE);
            return;
        }
        super.a(feedItem);
        if (this.r != null) {
            this.r.f14476b = true;
        }
    }

    public final c.a a(c.a aVar) {
        c.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, j, false, 8620, new Class[]{c.a.class}, c.a.class)) {
            return (c.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, j, false, 8620, new Class[]{c.a.class}, c.a.class);
        }
        aVar2.l = new BannerSwipeRefreshLayout.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14126a;

            public final void a(RecyclerView recyclerView) {
                BaseTabFeedFragment.this.k.q = recyclerView;
            }

            public final void a(ViewPager viewPager, View view) {
                ViewPager viewPager2 = viewPager;
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{viewPager2, view2}, this, f14126a, false, 8645, new Class[]{ViewPager.class, View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{viewPager2, view2}, this, f14126a, false, 8645, new Class[]{ViewPager.class, View.class}, Void.TYPE);
                    return;
                }
                BannerSwipeRefreshLayout bannerSwipeRefreshLayout = BaseTabFeedFragment.this.k;
                bannerSwipeRefreshLayout.o = viewPager2;
                bannerSwipeRefreshLayout.p = view2;
            }
        };
        return aVar2;
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, j, false, 8617, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, j, false, 8617, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("user_visible")) {
            setUserVisibleHint(arguments.getBoolean("user_visible"));
        }
    }

    @CallSuper
    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, j, false, 8621, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, j, false, 8621, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (!z) {
            j();
        } else {
            k();
        }
    }

    public void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, j, false, 8619, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, j, false, 8619, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.k = (BannerSwipeRefreshLayout) view.findViewById(C0906R.id.cxz);
        if (com.bytedance.android.livesdk.feed.l.c.b()) {
            this.k.setColorSchemeColors(Color.parseColor("#ff6880"));
        }
        this.h.addOnScrollListener(new RecyclerView.OnScrollListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14124a;

            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                int i2;
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f14124a, false, 8643, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f14124a, false, 8643, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i != 0) {
                    DislikeTipViewModel dislikeTipViewModel = BaseTabFeedFragment.this.m;
                    if (PatchProxy.isSupport(new Object[]{recyclerView}, dislikeTipViewModel, DislikeTipViewModel.f14458a, false, 9007, new Class[]{RecyclerView.class}, Void.TYPE)) {
                        DislikeTipViewModel dislikeTipViewModel2 = dislikeTipViewModel;
                        PatchProxy.accessDispatch(new Object[]{recyclerView}, dislikeTipViewModel2, DislikeTipViewModel.f14458a, false, 9007, new Class[]{RecyclerView.class}, Void.TYPE);
                    } else if (dislikeTipViewModel.f14459b && recyclerView != null && !dislikeTipViewModel.f14462e && dislikeTipViewModel.f14460c == -1) {
                        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                        if (layoutManager instanceof StaggeredGridLayoutManager) {
                            dislikeTipViewModel.f14460c = ((StaggeredGridLayoutManager) layoutManager).findLastVisibleItemPositions(null)[0];
                        } else if (layoutManager instanceof GridLayoutManager) {
                            dislikeTipViewModel.f14460c = ((GridLayoutManager) layoutManager).findLastVisibleItemPosition();
                        }
                    }
                } else {
                    DislikeTipViewModel dislikeTipViewModel3 = BaseTabFeedFragment.this.m;
                    if (PatchProxy.isSupport(new Object[]{recyclerView}, dislikeTipViewModel3, DislikeTipViewModel.f14458a, false, 9008, new Class[]{RecyclerView.class}, Boolean.TYPE)) {
                        DislikeTipViewModel dislikeTipViewModel4 = dislikeTipViewModel3;
                        ((Boolean) PatchProxy.accessDispatch(new Object[]{recyclerView}, dislikeTipViewModel4, DislikeTipViewModel.f14458a, false, 9008, new Class[]{RecyclerView.class}, Boolean.TYPE)).booleanValue();
                    } else if (dislikeTipViewModel3.f14459b && recyclerView != null && !dislikeTipViewModel3.f14462e && dislikeTipViewModel3.f14460c != -1) {
                        RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                        if (layoutManager2 instanceof StaggeredGridLayoutManager) {
                            int[] findLastVisibleItemPositions = ((StaggeredGridLayoutManager) layoutManager2).findLastVisibleItemPositions(null);
                            if (findLastVisibleItemPositions.length > 1) {
                                i2 = findLastVisibleItemPositions[1];
                                if (i2 >= 0 && i2 - dislikeTipViewModel3.f14460c > 10) {
                                    dislikeTipViewModel3.f14460c = -1;
                                    com.bytedance.ies.e.b.a(dislikeTipViewModel3.f14461d, "ttlive_live_user").a("HAVE_SHOW_DISLIKE_GUIDE", (Object) Boolean.TRUE).a();
                                    dislikeTipViewModel3.f14462e = true;
                                }
                            }
                        } else if (layoutManager2 instanceof GridLayoutManager) {
                            i2 = ((GridLayoutManager) layoutManager2).findLastVisibleItemPosition();
                            dislikeTipViewModel3.f14460c = -1;
                            com.bytedance.ies.e.b.a(dislikeTipViewModel3.f14461d, "ttlive_live_user").a("HAVE_SHOW_DISLIKE_GUIDE", (Object) Boolean.TRUE).a();
                            dislikeTipViewModel3.f14462e = true;
                        }
                        i2 = -1;
                        dislikeTipViewModel3.f14460c = -1;
                        com.bytedance.ies.e.b.a(dislikeTipViewModel3.f14461d, "ttlive_live_user").a("HAVE_SHOW_DISLIKE_GUIDE", (Object) Boolean.TRUE).a();
                        dislikeTipViewModel3.f14462e = true;
                    }
                }
                com.bytedance.android.livesdk.feed.h.a aVar = a.C0100a.f14179a;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, aVar, com.bytedance.android.livesdk.feed.h.a.f14171a, false, 8772, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    com.bytedance.android.livesdk.feed.h.a aVar2 = aVar;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, aVar2, com.bytedance.android.livesdk.feed.h.a.f14171a, false, 8772, new Class[]{Integer.TYPE}, Void.TYPE);
                } else if (i == 0) {
                    aVar.b();
                } else {
                    if (aVar.f14176f || aVar.g <= 10) {
                        aVar.a();
                    }
                }
            }

            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f14124a, false, 8644, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f14124a, false, 8644, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
            }
        });
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        com.bytedance.android.livesdk.feed.tab.d.a aVar;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, j, false, 8626, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, j, false, 8626, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.m = (DislikeTipViewModel) ViewModelProviders.of((Fragment) this, (ViewModelProvider.Factory) this.f14122c.a(l())).get(DislikeTipViewModel.class);
        if (PatchProxy.isSupport(new Object[0], this, j, false, 8636, new Class[0], com.bytedance.android.livesdk.feed.tab.d.a.class)) {
            aVar = (com.bytedance.android.livesdk.feed.tab.d.a) PatchProxy.accessDispatch(new Object[0], this, j, false, 8636, new Class[0], com.bytedance.android.livesdk.feed.tab.d.a.class);
        } else {
            aVar = new com.bytedance.android.livesdk.feed.tab.d.a(com.bytedance.android.livesdk.feed.tab.b.a.d(), new q(), com.bytedance.android.livesdk.feed.services.d.a().c(), new com.bytedance.android.livesdk.feed.tab.b());
        }
        this.n = aVar;
        this.p = (FeedTabViewModel) ViewModelProviders.of(getActivity(), (ViewModelProvider.Factory) this.n).get(FeedTabViewModel.class);
        this.r = (TimeOutRefreshViewModel) ViewModelProviders.of((Fragment) this, (ViewModelProvider.Factory) this.f14122c).get(TimeOutRefreshViewModel.class);
        this.r.f14477c.subscribe(new c(this), d.f14141b);
        this.s = (SyncContentViewModel) ViewModelProviders.of((Fragment) this, this.o).get(SyncContentViewModel.class);
        this.f14121b.o.observe(this, new e(this));
        this.l.p.observe(this, f.f14145b);
    }

    public final void a(FeedItem feedItem, long j2) {
        FeedItem feedItem2 = feedItem;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{feedItem2, new Long(j3)}, this, j, false, 8634, new Class[]{FeedItem.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItem2, new Long(j3)}, this, j, false, 8634, new Class[]{FeedItem.class, Long.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{feedItem2}, this, j, false, 8635, new Class[]{FeedItem.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItem2}, this, j, false, 8635, new Class[]{FeedItem.class}, Void.TYPE);
        } else if (!(feedItem2 == null || feedItem2.type != 4 || feedItem2.item == null)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("request_id", feedItem2.resId);
                jSONObject.put("log_pb", feedItem2.logPb);
            } catch (Exception unused) {
            }
        }
        if (feedItem2 != null && (feedItem2.item instanceof Media)) {
            Media media = (Media) feedItem2.item;
            if (media.getAuthor() != null) {
                media.getAuthor().getId();
            }
            if (!(media.getVideoModel() == null || media.getVideoModel().getCoverModel() == null)) {
                media.getVideoModel().getCoverModel().isLoaded();
            }
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup, bundle}, this, j, false, 8618, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup, bundle}, this, j, false, 8618, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        this.q = super.onCreateView(layoutInflater, viewGroup, bundle);
        a(this.q);
        return this.q;
    }
}
