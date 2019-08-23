package com.bytedance.android.livesdk.feed.fragment;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.feed.a;
import com.bytedance.android.live.core.a.b;
import com.bytedance.android.live.core.network.d;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.live.core.setting.CoreSettingKeys;
import com.bytedance.android.live.core.utils.fresco.ImageTypeRecorder;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout;
import com.bytedance.android.livesdk.feed.BaseFeedRoomPlayComponent;
import com.bytedance.android.livesdk.feed.IFeedRepository;
import com.bytedance.android.livesdk.feed.ItemRepository;
import com.bytedance.android.livesdk.feed.LiveFeedRoomPlayComponent;
import com.bytedance.android.livesdk.feed.adapter.BaseFeedAdapter;
import com.bytedance.android.livesdk.feed.adapter.FeedLiveAdapter;
import com.bytedance.android.livesdk.feed.d.c;
import com.bytedance.android.livesdk.feed.d.g;
import com.bytedance.android.livesdk.feed.h;
import com.bytedance.android.livesdk.feed.i.a;
import com.bytedance.android.livesdk.feed.i.e;
import com.bytedance.android.livesdk.feed.k;
import com.bytedance.android.livesdk.feed.live.BaseLiveViewHolder;
import com.bytedance.android.livesdk.feed.live.LargeLiveViewHolder;
import com.bytedance.android.livesdk.feed.live.SmallLiveViewHolder;
import com.bytedance.android.livesdk.feed.n;
import com.bytedance.android.livesdk.feed.services.d;
import com.bytedance.android.livesdk.feed.viewmodel.FragmentFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.LiveFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.w;
import com.bytedance.android.livesdk.feed.widget.LiveFeedFloatTabView;
import com.bytedance.android.livesdkapi.g.f;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FeedLiveFragment extends BaseTabFeedFragment {
    public static g C = null;
    private static final String D = FeedLiveFragment.class.getCanonicalName();
    public static ChangeQuickRedirect r;
    public Integer A = null;
    public boolean B = true;
    private final RecyclerView.OnScrollListener E = new RecyclerView.OnScrollListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14128a;

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f14128a, false, 8681, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f14128a, false, 8681, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.onScrolled(recyclerView, i, i2);
            if (FeedLiveFragment.this.A != null && Math.abs(i2) >= 10) {
                if (i2 < 0 && FeedLiveFragment.this.A.intValue() >= 0) {
                    if (FeedLiveFragment.this.z.findFirstVisibleItemPosition() >= FeedLiveFragment.this.A.intValue()) {
                        LiveFeedFloatTabView liveFeedFloatTabView = FeedLiveFragment.this.u;
                        if (PatchProxy.isSupport(new Object[0], liveFeedFloatTabView, LiveFeedFloatTabView.f14519a, false, 9044, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], liveFeedFloatTabView, LiveFeedFloatTabView.f14519a, false, 9044, new Class[0], Void.TYPE);
                        } else if (liveFeedFloatTabView.f14520b && !liveFeedFloatTabView.f14523e) {
                            if (liveFeedFloatTabView.f14522d != null && liveFeedFloatTabView.f14522d.isRunning()) {
                                liveFeedFloatTabView.f14522d.cancel();
                            }
                            liveFeedFloatTabView.f14521c = ObjectAnimator.ofFloat(liveFeedFloatTabView, "translationY", new float[]{liveFeedFloatTabView.getTranslationY(), 0.0f});
                            liveFeedFloatTabView.f14521c.addListener(new AnimatorListenerAdapter() {
                                public final void onAnimationStart(Animator animator) {
                                    LiveFeedFloatTabView.this.f14523e = true;
                                }
                            });
                            liveFeedFloatTabView.f14521c.start();
                        }
                    } else {
                        FeedLiveFragment.this.u.b();
                    }
                } else if (i2 > 0 && FeedLiveFragment.this.A.intValue() >= 0) {
                    FeedLiveFragment.this.u.a();
                }
            }
        }
    };
    private final Map<Long, c> F = new HashMap();
    private LiveFeedViewModel G;
    private String H = "";
    private String I = "";
    private LiveFeedRoomPlayComponent J;
    private boolean K = (true ^ com.bytedance.android.livesdk.feed.l.c.a());
    private RecyclerView.OnScrollListener L;
    protected View s;
    protected TextureView t;
    LiveFeedFloatTabView u;
    FeedLiveAdapter v;
    com.bytedance.android.livesdk.feed.g w = d.a().b();
    com.bytedance.android.livesdkapi.depend.d.g x;
    b<c, FeedItem> y;
    public GridLayoutManager z;

    public final BaseFeedAdapter f() {
        return this.v;
    }

    public final long l() {
        if (C != null) {
            return C.f14080b;
        }
        return 1;
    }

    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 8659, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, r, false, 8659, new Class[0], String.class);
        } else if (!StringUtils.isEmpty(this.H)) {
            return this.H;
        } else {
            return super.a();
        }
    }

    public final String b() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 8660, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, r, false, 8660, new Class[0], String.class);
        } else if (!StringUtils.isEmpty(this.I)) {
            return this.I;
        } else {
            return super.b();
        }
    }

    public final RecyclerView.LayoutManager g() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 8663, new Class[0], RecyclerView.LayoutManager.class)) {
            return (RecyclerView.LayoutManager) PatchProxy.accessDispatch(new Object[0], this, r, false, 8663, new Class[0], RecyclerView.LayoutManager.class);
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14132a;

            public int getSpanSize(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f14132a, false, 8685, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f14132a, false, 8685, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
                } else if (FeedLiveFragment.this.v.getItemViewType(i) == C0906R.layout.aj6) {
                    return 1;
                } else {
                    return 2;
                }
            }
        });
        return gridLayoutManager;
    }

    public final int h() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 8656, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, r, false, 8656, new Class[0], Integer.TYPE)).intValue();
        } else if (o()) {
            return 2;
        } else {
            return 1;
        }
    }

    public final boolean o() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, r, false, 8658, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, r, false, 8658, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (C == null) {
            return false;
        } else {
            if (C.a() == 2) {
                z2 = true;
            }
            return z2;
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 8652, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 8652, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        this.h.removeOnScrollListener(this.E);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 8669, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 8669, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 8668, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 8668, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
    }

    public final int d() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, r, false, 8657, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, r, false, 8657, new Class[0], Integer.TYPE)).intValue();
        }
        a aVar = (a) CoreSettingKeys.LIVE_FEED_PRELOAD.a();
        if (aVar != null) {
            if (o()) {
                i = (aVar.f7713b - 1) * 2;
            } else {
                i = aVar.f7712a;
            }
        }
        if (i <= 1) {
            i = super.d();
        }
        return i;
    }

    public final FragmentFeedViewModel e() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 8653, new Class[0], FragmentFeedViewModel.class)) {
            return (FragmentFeedViewModel) PatchProxy.accessDispatch(new Object[0], this, r, false, 8653, new Class[0], FragmentFeedViewModel.class);
        }
        this.l = (TabFeedViewModel) ViewModelProviders.of((Fragment) this, (ViewModelProvider.Factory) this.f14122c.a(l()).a((h) this)).get(TabFeedViewModel.class);
        this.l.f7975d.observe(this, new l(this));
        this.k.setOnRefreshListener(new m(this));
        return this.l;
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 8671, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 8671, new Class[0], Void.TYPE);
            return;
        }
        super.j();
        if (com.bytedance.android.livesdk.feed.l.c.c() && getActivity() != null && (getActivity() instanceof AppCompatActivity)) {
            try {
                if (com.bytedance.android.livesdkapi.h.e() != null) {
                    com.bytedance.android.livesdkapi.h.e().j().a((AppCompatActivity) getActivity());
                }
            } catch (Exception e2) {
                com.bytedance.android.live.core.c.a.a(D, (Throwable) e2);
            }
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 8664, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 8664, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        for (c next : this.F.values()) {
            IFeedRepository iFeedRepository = (IFeedRepository) this.w.a(next);
            if (iFeedRepository != null) {
                this.w.b(next, iFeedRepository);
            }
            if (this.y != null) {
                this.y.b(next);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void p() {
        this.l.a("feed_refresh");
        if (!NetworkUtils.isNetworkAvailable(getContext())) {
            com.bytedance.android.live.uikit.d.a.a(getContext(), (int) C0906R.string.cwz);
        }
        if (com.bytedance.android.livesdk.feed.b.f13987b) {
            ImageTypeRecorder a2 = ImageTypeRecorder.a();
            if (PatchProxy.isSupport(new Object[0], a2, ImageTypeRecorder.f8254a, false, 1394, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], a2, ImageTypeRecorder.f8254a, false, 1394, new Class[0], Void.TYPE);
                return;
            }
            a2.f8256b.clear();
        }
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 8665, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 8665, new Class[0], Void.TYPE);
            return;
        }
        super.k();
        if (com.bytedance.android.livesdk.feed.l.c.c() && getActivity() != null && (getActivity() instanceof AppCompatActivity) && getActivity().getIntent() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("show_type", getActivity().getIntent().getStringExtra("show_type"));
            getActivity().getIntent().removeExtra("show_type");
            if (com.bytedance.android.livesdkapi.h.e() != null) {
                com.bytedance.android.livesdkapi.h.e().j().a((AppCompatActivity) getActivity(), hashMap);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Integer num) {
        if (num != null) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.h.findViewHolderForAdapterPosition(num.intValue());
            if (findViewHolderForAdapterPosition instanceof BaseLiveViewHolder) {
                this.h.postDelayed(new p(this, findViewHolderForAdapterPosition), 500);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(g gVar) {
        if (this.A != null) {
            this.l.i.a(this.A.intValue());
            a(gVar);
        }
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, r, false, 8661, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, r, false, 8661, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        this.s = view.findViewById(C0906R.id.cxf);
        if (Build.VERSION.SDK_INT >= 21) {
            this.s.setBackgroundResource(2130841051);
        }
        this.t = (TextureView) view.findViewById(C0906R.id.cxd);
        this.u = (LiveFeedFloatTabView) view.findViewById(C0906R.id.agk);
        if (!(this.h == null || this.L == null)) {
            this.h.addOnScrollListener(this.L);
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, r, false, 8654, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, r, false, 8654, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        if (com.bytedance.android.livesdkapi.h.e() != null) {
            this.x = com.bytedance.android.livesdkapi.h.e().e();
            this.J = new LiveFeedRoomPlayComponent(new BaseFeedRoomPlayComponent.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f14130a;

                public final RecyclerView a() {
                    return FeedLiveFragment.this.h;
                }

                public final BannerSwipeRefreshLayout c() {
                    return FeedLiveFragment.this.k;
                }

                public final View d() {
                    return FeedLiveFragment.this.s;
                }

                public final TextureView e() {
                    return FeedLiveFragment.this.t;
                }

                public final com.bytedance.android.livesdkapi.depend.d.g f() {
                    return FeedLiveFragment.this.x;
                }

                public final String i() {
                    if (FeedLiveFragment.C != null) {
                        return FeedLiveFragment.C.h;
                    }
                    return "";
                }

                public final BaseFeedAdapter b() {
                    if (!PatchProxy.isSupport(new Object[0], this, f14130a, false, 8682, new Class[0], BaseFeedAdapter.class)) {
                        return FeedLiveFragment.this.f();
                    }
                    return (BaseFeedAdapter) PatchProxy.accessDispatch(new Object[0], this, f14130a, false, 8682, new Class[0], BaseFeedAdapter.class);
                }

                public final Lifecycle g() {
                    if (!PatchProxy.isSupport(new Object[0], this, f14130a, false, 8683, new Class[0], Lifecycle.class)) {
                        return FeedLiveFragment.this.getLifecycle();
                    }
                    return (Lifecycle) PatchProxy.accessDispatch(new Object[0], this, f14130a, false, 8683, new Class[0], Lifecycle.class);
                }

                public final Activity h() {
                    if (!PatchProxy.isSupport(new Object[0], this, f14130a, false, 8684, new Class[0], Activity.class)) {
                        return FeedLiveFragment.this.getActivity();
                    }
                    return (Activity) PatchProxy.accessDispatch(new Object[0], this, f14130a, false, 8684, new Class[0], Activity.class);
                }
            });
            this.J.d(o());
            this.J.a(getUserVisibleHint());
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.isSupport(new Object[]{configuration}, this, r, false, 8650, new Class[]{Configuration.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{configuration}, this, r, false, 8650, new Class[]{Configuration.class}, Void.TYPE);
            return;
        }
        super.onConfigurationChanged(configuration);
        SmallLiveViewHolder.z = -1;
        LargeLiveViewHolder.z = -1;
        this.v.notifyDataSetChanged();
    }

    public void setUserVisibleHint(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, r, false, 8655, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, r, false, 8655, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z2);
        if (this.J != null) {
            this.J.a(z2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(com.bytedance.android.live.core.network.d dVar) {
        boolean z2;
        BannerSwipeRefreshLayout bannerSwipeRefreshLayout = this.k;
        if (dVar == null || !this.B || !dVar.a() || !this.K) {
            z2 = false;
        } else {
            z2 = true;
        }
        bannerSwipeRefreshLayout.setRefreshing(z2);
        this.K = true;
        if (dVar.f7863b.equals(d.a.SUCCESS) && this.J != null) {
            LiveFeedRoomPlayComponent liveFeedRoomPlayComponent = this.J;
            if (PatchProxy.isSupport(new Object[0], liveFeedRoomPlayComponent, LiveFeedRoomPlayComponent.q, false, 8449, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], liveFeedRoomPlayComponent, LiveFeedRoomPlayComponent.q, false, 8449, new Class[0], Void.TYPE);
            } else {
                if (liveFeedRoomPlayComponent.t != null) {
                    liveFeedRoomPlayComponent.t.h();
                }
                if (liveFeedRoomPlayComponent.s != null) {
                    liveFeedRoomPlayComponent.s.h();
                }
            }
        }
        if (this.u != null && this.u.f14523e) {
            this.u.a();
        }
        if (dVar.f7863b != d.a.RUNNING && getActivity() != null && (getActivity() instanceof com.bytedance.android.livesdkapi.g.b)) {
            ((com.bytedance.android.livesdkapi.g.b) getActivity()).a();
        }
    }

    public final void a(g gVar) {
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, r, false, 8662, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2}, this, r, false, 8662, new Class[]{g.class}, Void.TYPE);
            return;
        }
        C = gVar2;
        this.H = gVar2.f14083e;
        this.I = gVar2.h;
        TabFeedViewModel tabFeedViewModel = (TabFeedViewModel) this.i.f13955d;
        if (!this.F.containsKey(Long.valueOf(gVar2.f14080b))) {
            if (this.F.isEmpty()) {
                this.F.put(Long.valueOf(l()), tabFeedViewModel.d());
            }
            this.F.put(Long.valueOf(gVar2.f14080b), c.a(gVar2.h, gVar2.f14083e, l()));
        }
        tabFeedViewModel.B = false;
        tabFeedViewModel.y = this.F.get(Long.valueOf(gVar2.f14080b));
        this.w.a(this.F.get(Long.valueOf(gVar2.f14080b)), (ItemRepository) (IFeedRepository) this.w.a(tabFeedViewModel.d()));
        tabFeedViewModel.a(gVar2.f14083e, gVar2.h);
        tabFeedViewModel.c(this.H);
        tabFeedViewModel.b();
        if (PatchProxy.isSupport(new Object[0], tabFeedViewModel, PagingViewModel.f7972b, false, 596, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], tabFeedViewModel, PagingViewModel.f7972b, false, 596, new Class[0], Void.TYPE);
        } else if (tabFeedViewModel.i != null) {
            tabFeedViewModel.i.h();
        }
        ((IFeedRepository) this.w.a(tabFeedViewModel.d())).a().observeOn(AndroidSchedulers.mainThread()).subscribe(new n(this), o.f14163b);
        if (this.J != null) {
            this.J.d(o());
        }
        this.u.a(gVar2);
    }

    public void onCreate(@Nullable Bundle bundle) {
        FeedLiveAdapter feedLiveAdapter;
        Map map;
        com.bytedance.android.live.core.viewholder.a aVar;
        com.bytedance.android.live.core.viewholder.a aVar2;
        com.bytedance.android.live.core.viewholder.a aVar3;
        com.bytedance.android.live.core.viewholder.a aVar4;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, r, false, 8648, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, r, false, 8648, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        List c2 = com.bytedance.android.livesdk.feed.tab.b.a.d().c();
        if (c2 != null && c2.size() > 0) {
            C = (g) c2.get(0);
            this.H = C.f14083e;
        }
        this.G = (LiveFeedViewModel) ViewModelProviders.of((Fragment) this, (ViewModelProvider.Factory) this.f14122c.a(l())).get(LiveFeedViewModel.class);
        LiveFeedViewModel liveFeedViewModel = this.G;
        if (PatchProxy.isSupport(new Object[0], liveFeedViewModel, LiveFeedViewModel.f14469a, false, 9029, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], liveFeedViewModel, LiveFeedViewModel.f14469a, false, 9029, new Class[0], Void.TYPE);
        } else if (liveFeedViewModel.f14472d == null) {
            liveFeedViewModel.f14472d = new w(liveFeedViewModel);
            liveFeedViewModel.f14470b.e().a(liveFeedViewModel.f14472d);
        }
        com.bytedance.android.livesdk.feed.i.a aVar5 = new com.bytedance.android.livesdk.feed.i.a(this);
        if (PatchProxy.isSupport(new Object[0], aVar5, com.bytedance.android.livesdk.feed.i.a.f14180a, false, 8808, new Class[0], FeedLiveAdapter.class)) {
            feedLiveAdapter = (FeedLiveAdapter) PatchProxy.accessDispatch(new Object[0], aVar5, com.bytedance.android.livesdk.feed.i.a.f14180a, false, 8808, new Class[0], FeedLiveAdapter.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], aVar5, com.bytedance.android.livesdk.feed.i.a.f14180a, false, 8809, new Class[0], Map.class)) {
                map = (Map) PatchProxy.accessDispatch(new Object[0], aVar5, com.bytedance.android.livesdk.feed.i.a.f14180a, false, 8809, new Class[0], Map.class);
            } else {
                map = new HashMap();
                Integer valueOf = Integer.valueOf(C0906R.layout.aj5);
                com.bytedance.android.livesdk.feed.dislike.a aVar6 = aVar5.g;
                com.bytedance.android.livesdk.feed.g gVar = aVar5.f14182c;
                k kVar = aVar5.f14183d;
                f fVar = aVar5.f14184e;
                com.bytedance.android.livesdkapi.depend.d.g gVar2 = aVar5.f14185f;
                com.bytedance.android.livesdkapi.depend.d.g gVar3 = gVar2;
                if (PatchProxy.isSupport(new Object[]{aVar6, gVar, kVar, fVar, gVar2}, aVar5, com.bytedance.android.livesdk.feed.i.a.f14180a, false, 8810, new Class[]{com.bytedance.android.livesdk.feed.dislike.a.class, com.bytedance.android.livesdk.feed.g.class, k.class, f.class, com.bytedance.android.livesdkapi.depend.d.g.class}, com.bytedance.android.live.core.viewholder.a.class)) {
                    com.bytedance.android.livesdk.feed.i.a aVar7 = aVar5;
                    aVar = (com.bytedance.android.live.core.viewholder.a) PatchProxy.accessDispatch(new Object[]{aVar6, gVar, kVar, fVar, gVar3}, aVar7, com.bytedance.android.livesdk.feed.i.a.f14180a, false, 8810, new Class[]{com.bytedance.android.livesdk.feed.dislike.a.class, com.bytedance.android.livesdk.feed.g.class, k.class, f.class, com.bytedance.android.livesdkapi.depend.d.g.class}, com.bytedance.android.live.core.viewholder.a.class);
                } else {
                    com.bytedance.android.livesdk.feed.i.b bVar = new com.bytedance.android.livesdk.feed.i.b(aVar6, gVar, kVar, fVar, gVar3);
                    aVar = bVar;
                }
                map.put(valueOf, aVar);
                Integer valueOf2 = Integer.valueOf(C0906R.layout.aj6);
                com.bytedance.android.livesdk.feed.dislike.a aVar8 = aVar5.g;
                com.bytedance.android.livesdk.feed.g gVar4 = aVar5.f14182c;
                k kVar2 = aVar5.f14183d;
                f fVar2 = aVar5.f14184e;
                com.bytedance.android.livesdkapi.depend.d.g gVar5 = aVar5.f14185f;
                com.bytedance.android.livesdkapi.depend.d.g gVar6 = gVar5;
                com.bytedance.android.livesdkapi.depend.d.g gVar7 = gVar6;
                if (PatchProxy.isSupport(new Object[]{aVar8, gVar4, kVar2, fVar2, gVar5}, aVar5, com.bytedance.android.livesdk.feed.i.a.f14180a, false, 8811, new Class[]{com.bytedance.android.livesdk.feed.dislike.a.class, com.bytedance.android.livesdk.feed.g.class, k.class, f.class, com.bytedance.android.livesdkapi.depend.d.g.class}, com.bytedance.android.live.core.viewholder.a.class)) {
                    com.bytedance.android.livesdk.feed.i.a aVar9 = aVar5;
                    aVar2 = (com.bytedance.android.live.core.viewholder.a) PatchProxy.accessDispatch(new Object[]{aVar8, gVar4, kVar2, fVar2, gVar7}, aVar9, com.bytedance.android.livesdk.feed.i.a.f14180a, false, 8811, new Class[]{com.bytedance.android.livesdk.feed.dislike.a.class, com.bytedance.android.livesdk.feed.g.class, k.class, f.class, com.bytedance.android.livesdkapi.depend.d.g.class}, com.bytedance.android.live.core.viewholder.a.class);
                } else {
                    com.bytedance.android.livesdk.feed.i.c cVar = new com.bytedance.android.livesdk.feed.i.c(aVar8, gVar4, kVar2, fVar2, gVar7);
                    aVar2 = cVar;
                }
                map.put(valueOf2, aVar2);
                Integer valueOf3 = Integer.valueOf(C0906R.layout.amd);
                FeedLiveFragment feedLiveFragment = aVar5.f14181b;
                if (PatchProxy.isSupport(new Object[]{feedLiveFragment}, aVar5, com.bytedance.android.livesdk.feed.i.a.f14180a, false, 8812, new Class[]{FeedLiveFragment.class}, com.bytedance.android.live.core.viewholder.a.class)) {
                    com.bytedance.android.livesdk.feed.i.a aVar10 = aVar5;
                    aVar3 = (com.bytedance.android.live.core.viewholder.a) PatchProxy.accessDispatch(new Object[]{feedLiveFragment}, aVar10, com.bytedance.android.livesdk.feed.i.a.f14180a, false, 8812, new Class[]{FeedLiveFragment.class}, com.bytedance.android.live.core.viewholder.a.class);
                } else {
                    aVar3 = new com.bytedance.android.livesdk.feed.i.d(feedLiveFragment);
                }
                map.put(valueOf3, aVar3);
                Integer valueOf4 = Integer.valueOf(C0906R.layout.ama);
                a.AnonymousClass1 r4 = new n() {
                };
                if (PatchProxy.isSupport(new Object[]{r4}, aVar5, com.bytedance.android.livesdk.feed.i.a.f14180a, false, 8813, new Class[]{n.class}, com.bytedance.android.live.core.viewholder.a.class)) {
                    com.bytedance.android.livesdk.feed.i.a aVar11 = aVar5;
                    aVar4 = (com.bytedance.android.live.core.viewholder.a) PatchProxy.accessDispatch(new Object[]{r4}, aVar11, com.bytedance.android.livesdk.feed.i.a.f14180a, false, 8813, new Class[]{n.class}, com.bytedance.android.live.core.viewholder.a.class);
                } else {
                    aVar4 = new e(r4);
                }
                map.put(valueOf4, aVar4);
                map.put(Integer.valueOf(C0906R.layout.amc), com.bytedance.android.livesdk.feed.i.f.f14204b);
                map.put(Integer.valueOf(C0906R.layout.amb), com.bytedance.android.livesdk.feed.i.g.f14206b);
                map.put(Integer.valueOf(C0906R.layout.aj9), com.bytedance.android.livesdk.feed.i.h.f14208b);
            }
            feedLiveAdapter = new FeedLiveAdapter(map, aVar5.f14182c, aVar5.f14181b);
        }
        this.v = feedLiveAdapter;
        HashMap hashMap = new HashMap();
        hashMap.put("event_type", "click");
        hashMap.put("event_belong", "tab_click");
        hashMap.put("enter_from_merge", "live_merge");
        com.bytedance.android.livesdk.feed.g.b.a().a("live_enter", hashMap);
        if (PatchProxy.isSupport(new Object[]{"onCreate()"}, this, r, false, 8649, new Class[]{String.class}, Void.TYPE)) {
            Object[] objArr = {"onCreate()"};
            PatchProxy.accessDispatch(objArr, this, r, false, 8649, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (getUserVisibleHint()) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("page_name", FeedLiveFragment.class.getName());
            com.bytedance.android.livesdk.feed.g.a.b().b("ttlive_page", (Map<String, Object>) hashMap2);
        }
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, r, false, 8651, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, r, false, 8651, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.i.f13955d.m.observe(this, new i(this));
        this.z = (GridLayoutManager) this.h.getLayoutManager();
        if (this.p.a() != null && !Lists.isEmpty(this.p.a())) {
            this.h.addOnScrollListener(this.E);
            this.u.setTabList(this.p.a());
            this.u.setOnTabClickListener(new j(this));
        }
        if (this.G != null) {
            this.G.f14471c.observe(this, new k(this));
        }
        String string = getString(C0906R.string.cws);
        if (!(this.p == null || this.p.a() == null || this.p.a().size() <= 0 || this.p.a().get(0) == null || com.bytedance.android.livesdk.feed.l.c.e())) {
            string = ((g) this.p.a().get(0)).f14081c;
        }
        if (getActivity() != null && (getActivity() instanceof com.bytedance.android.livesdkapi.g.b)) {
            ((com.bytedance.android.livesdkapi.g.b) getActivity()).a(string);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "tab_click");
        com.bytedance.android.livesdk.feed.g.b.a().a("live_enter", hashMap);
    }
}
