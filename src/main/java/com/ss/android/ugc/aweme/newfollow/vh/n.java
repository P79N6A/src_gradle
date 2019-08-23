package com.ss.android.ugc.aweme.newfollow.vh;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.base.activity.h;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.param.IFollowFeedFetchTrigger;
import com.ss.android.ugc.aweme.follow.LiveTagViewModel;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder;
import com.ss.android.ugc.aweme.friends.ui.ak;
import com.ss.android.ugc.aweme.main.story.e;
import com.ss.android.ugc.aweme.message.c.c;
import com.ss.android.ugc.aweme.newfollow.adapter.FeedAdapter;
import com.ss.android.ugc.aweme.newfollow.adapter.FollowFeedAdapter;
import com.ss.android.ugc.aweme.newfollow.d.a;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedFragment;
import com.ss.android.ugc.aweme.newfollow.ui.FriendTabViewModel;
import com.ss.android.ugc.aweme.newfollow.ui.i;
import com.ss.android.ugc.aweme.newfollow.ui.k;
import com.ss.android.ugc.aweme.newfollow.ui.m;
import com.ss.android.ugc.aweme.newfollow.util.FeedImpressionReporter;
import com.ss.android.ugc.aweme.newfollow.util.g;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.u.q;
import com.ss.android.ugc.aweme.u.s;
import com.ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class n extends FlowFeedViewHolder<FollowFeedAdapter, FollowFeed> implements h<User>, RecommendAwemeViewHolder.a, e, i, k {
    private static final int G = ((int) UIUtils.dip2Px(d.a(), 52.0f));

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57731a;
    public static final int q = ((int) UIUtils.dip2Px(d.a(), 16.0f));
    public static final int r = ((int) UIUtils.dip2Px(d.a(), 16.0f));
    public static final int s = ((int) UIUtils.dip2Px(d.a(), 0.5f));
    public static final int t = ((int) UIUtils.dip2Px(d.a(), -10.0f));
    private ak A;
    private int B = -1;
    private boolean C;
    private boolean D;
    private boolean E;
    private LiveTagViewModel F;
    @IFollowFeedFetchTrigger.ILoadMoreType
    private Integer H = 4;

    /* renamed from: b  reason: collision with root package name */
    public IDraftService.DraftListener f57732b;

    /* renamed from: c  reason: collision with root package name */
    public FollowFeedFragment f57733c;

    /* renamed from: d  reason: collision with root package name */
    public String f57734d;

    /* renamed from: e  reason: collision with root package name */
    public String f57735e;

    /* renamed from: f  reason: collision with root package name */
    a f57736f;
    public boolean g;
    public String h;
    public String p;
    public boolean u;
    @IFollowFeedFetchTrigger.IRefreshType
    public Integer v = 3;
    private com.ss.android.ugc.aweme.newfollow.f.e w;
    private boolean x;
    private com.ss.android.ugc.aweme.newfollow.a y;
    private User z;

    public final boolean S_() {
        return false;
    }

    public final void f() {
        this.C = false;
    }

    public final void g() {
        this.C = false;
    }

    public final void h() {
        this.C = false;
    }

    public final void y_() {
        this.C = false;
    }

    public final void a(boolean z2, int i, int i2, boolean z3, boolean z4) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z3 ? (byte) 1 : 0), Byte.valueOf(z4 ? (byte) 1 : 0)}, this, f57731a, false, 62231, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z3), Byte.valueOf(z4)}, this, f57731a, false, 62231, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        m mVar = new m(Boolean.valueOf(z2), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z3), Boolean.valueOf(z4));
        FriendTabViewModel.a(this.f57733c.getActivity()).f57252b.setValue(mVar);
    }

    public final void a(FollowFeedFragment followFeedFragment, View view, com.ss.android.ugc.aweme.newfollow.f.e eVar, com.ss.android.ugc.aweme.newfollow.b.a aVar) {
        FollowFeedFragment followFeedFragment2 = followFeedFragment;
        com.ss.android.ugc.aweme.newfollow.f.e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{followFeedFragment2, view, eVar2, aVar}, this, f57731a, false, 62232, new Class[]{FollowFeedFragment.class, View.class, com.ss.android.ugc.aweme.newfollow.f.e.class, com.ss.android.ugc.aweme.newfollow.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followFeedFragment2, view, eVar2, aVar}, this, f57731a, false, 62232, new Class[]{FollowFeedFragment.class, View.class, com.ss.android.ugc.aweme.newfollow.f.e.class, com.ss.android.ugc.aweme.newfollow.b.a.class}, Void.TYPE);
            return;
        }
        this.w = eVar2;
        this.f57733c = followFeedFragment2;
        a(followFeedFragment, view, eVar, aVar, followFeedFragment2.n, followFeedFragment.e(), "");
        this.F = LiveTagViewModel.a(this.f57733c.getActivity());
        this.mRefreshLayout.a(false, this.mRefreshLayout.getProgressViewStartOffset() + G, this.mRefreshLayout.getProgressViewEndOffset());
        this.mRecyclerView.addItemDecoration(new FollowFeedViewHolder$3(this));
        ((FollowFeedAdapter) this.j).A = this.h;
        ((FollowFeedAdapter) this.j).B = this.E;
        ((FollowFeedAdapter) this.j).K = eVar2;
        ((FollowFeedAdapter) this.j).M = new p(this);
        ((FollowFeedAdapter) this.j).N = this;
        ((FollowFeedAdapter) this.j).O = this;
        this.x = TextUtils.equals(this.f57733c.n, "rec_follow");
        if (this.x) {
            ((FollowFeedAdapter) this.j).g = false;
        }
        ((FollowFeedAdapter) this.j).z = this.f57734d;
        ((FollowFeedAdapter) this.j).D = this.u;
        if (!com.ss.android.g.a.a()) {
            ((FollowFeedAdapter) this.j).setData(null);
        }
        this.y = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createRecommendListPresenter();
        if (this.y != null) {
            this.y.a(2);
            this.y.a((k) this);
        }
        if (PatchProxy.isSupport(new Object[0], this, f57731a, false, 62235, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57731a, false, 62235, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.base.livedata.a.a().a("refresh_immediate", Boolean.class).observe(this.f57733c, new Observer<Boolean>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57742a;

            public final /* synthetic */ void onChanged(@Nullable Object obj) {
                Boolean bool = (Boolean) obj;
                if (PatchProxy.isSupport(new Object[]{bool}, this, f57742a, false, 62298, new Class[]{Boolean.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bool}, this, f57742a, false, 62298, new Class[]{Boolean.class}, Void.TYPE);
                    return;
                }
                if (bool != null && bool.booleanValue() && TextUtils.equals(n.this.f57734d, "extra_follow_type_follow")) {
                    n.this.R_();
                }
            }
        });
    }

    public final void a(List<FollowFeed> list, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f57731a, false, 62239, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z2)}, this, f57731a, false, 62239, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(this.f57735e, "homepage_follow") && this.f57733c.getActivity() != null) {
            FollowPageFirstFrameViewModel.a(this.f57733c.getActivity()).c();
        }
        super.a(list, z2);
        com.ss.android.ugc.aweme.newfollow.g.a.a(com.ss.android.ugc.aweme.newfollow.g.a.a(this.v), true, false);
        x();
        this.D = false;
        com.ss.android.ugc.aweme.newfollow.util.k.a().c();
        w();
        y();
    }

    public final void a(com.ss.android.ugc.aweme.newfollow.c.a aVar) {
        com.ss.android.ugc.aweme.newfollow.c.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f57731a, false, 62252, new Class[]{com.ss.android.ugc.aweme.newfollow.c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f57731a, false, 62252, new Class[]{com.ss.android.ugc.aweme.newfollow.c.a.class}, Void.TYPE);
            return;
        }
        if (this.j != null) {
            if (aVar2.f57079a == 2) {
                FollowFeedAdapter followFeedAdapter = (FollowFeedAdapter) this.j;
                if (PatchProxy.isSupport(new Object[]{(byte) 0}, followFeedAdapter, FollowFeedAdapter.f57068f, false, 61101, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    FollowFeedAdapter followFeedAdapter2 = followFeedAdapter;
                    PatchProxy.accessDispatch(new Object[]{(byte) 0}, followFeedAdapter2, FollowFeedAdapter.f57068f, false, 61101, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else {
                    followFeedAdapter.g = false;
                    if (followFeedAdapter.mItems == null || !followFeedAdapter.mItems.contains(followFeedAdapter.E)) {
                        followFeedAdapter.notifyDataSetChanged();
                    } else {
                        followFeedAdapter.b(followFeedAdapter.mItems.indexOf(followFeedAdapter.E));
                    }
                }
            } else if (aVar2.f57079a == 1) {
                ((FollowFeedAdapter) this.j).b(aVar2.f57080b);
            }
            ((FollowFeedAdapter) this.j).p();
        }
    }

    public final void a(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, f57731a, false, 62253, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, f57731a, false, 62253, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (this.w != null) {
            com.ss.android.ugc.aweme.newfollow.g.a.d(com.ss.android.ugc.aweme.newfollow.g.a.a((Integer) 1));
            this.w.a(1, com.ss.android.ugc.aweme.follow.presenter.d.a(1, 0, 1, FeedImpressionReporter.a("feed").c()).a(Integer.valueOf(this.F.a())).b(str4).c(str5).d(str6).a());
        }
    }

    public final void a(String str, ForwardDetail forwardDetail) {
        if (PatchProxy.isSupport(new Object[]{str, forwardDetail}, this, f57731a, false, 62266, new Class[]{String.class, ForwardDetail.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, forwardDetail}, this, f57731a, false, 62266, new Class[]{String.class, ForwardDetail.class}, Void.TYPE);
        } else if (forwardDetail != null) {
            ((FollowFeedAdapter) this.j).a(str, forwardDetail.getAweme(), ((FollowFeedAdapter) this.j).g ? 1 : 0);
            ((FollowFeedAdapter) this.j).a(str, forwardDetail.getComment());
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f57731a, false, 62267, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f57731a, false, 62267, new Class[]{String.class}, Void.TYPE);
            return;
        }
        int c2 = ((FollowFeedAdapter) this.j).c(str);
        if (c2 >= 0) {
            ((FollowFeedAdapter) this.j).b(c2);
            ((FollowFeedAdapter) this.j).p();
        }
    }

    public final void a(List<User> list, @NonNull List<User> list2, int i, int i2) {
        List list3;
        FollowFeed followFeed;
        if (PatchProxy.isSupport(new Object[]{list, list2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f57731a, false, 62273, new Class[]{List.class, List.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, list2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f57731a, false, 62273, new Class[]{List.class, List.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (User recommendUser : list) {
            FollowFeed followFeed2 = new FollowFeed();
            followFeed2.setRecommendUser(recommendUser);
            followFeed2.setFeedType(65289);
            arrayList.add(followFeed2);
        }
        FollowFeedAdapter followFeedAdapter = (FollowFeedAdapter) this.j;
        byte b2 = i != 0 ? (byte) 1 : 0;
        if (PatchProxy.isSupport(new Object[]{arrayList, Byte.valueOf(b2)}, followFeedAdapter, FollowFeedAdapter.f57068f, false, 61100, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arrayList, Byte.valueOf(b2)}, followFeedAdapter, FollowFeedAdapter.f57068f, false, 61100, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else {
            if (com.ss.android.g.a.c()) {
                followFeedAdapter.g = true;
            }
            if (PatchProxy.isSupport(new Object[]{arrayList, Byte.valueOf(b2)}, followFeedAdapter, FollowFeedAdapter.f57068f, false, 61075, new Class[]{List.class, Boolean.TYPE}, List.class)) {
                list3 = (List) PatchProxy.accessDispatch(new Object[]{arrayList, Byte.valueOf(b2)}, followFeedAdapter, FollowFeedAdapter.f57068f, false, 61075, new Class[]{List.class, Boolean.TYPE}, List.class);
            } else if (b2 != 0) {
                followFeedAdapter.r();
                followFeedAdapter.mItems.addAll(arrayList);
                list3 = followFeedAdapter.mItems;
            } else {
                FollowFeed m = followFeedAdapter.m();
                ArrayList arrayList2 = new ArrayList();
                if (followFeedAdapter.g) {
                    arrayList2.add(m);
                }
                arrayList2.add(followFeedAdapter.n());
                if (PatchProxy.isSupport(new Object[0], followFeedAdapter, FollowFeedAdapter.f57068f, false, 61084, new Class[0], FollowFeed.class)) {
                    followFeed = (FollowFeed) PatchProxy.accessDispatch(new Object[0], followFeedAdapter, FollowFeedAdapter.f57068f, false, 61084, new Class[0], FollowFeed.class);
                } else {
                    if (followFeedAdapter.H == null) {
                        followFeedAdapter.H = new FollowFeed();
                        followFeedAdapter.H.setFeedType(65530);
                    }
                    followFeed = followFeedAdapter.H;
                }
                arrayList2.add(followFeed);
                arrayList2.addAll(arrayList);
                followFeedAdapter.setShowFooter(false);
                followFeedAdapter.b((List<FollowFeed>) arrayList2);
                list3 = arrayList2;
            }
            followFeedAdapter.mItems = list3;
            followFeedAdapter.notifyDataSetChanged();
        }
        this.C = false;
        this.D = true;
    }

    public final void a(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f57731a, false, 62281, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f57731a, false, 62281, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.ag.h a2 = com.ss.android.ugc.aweme.ag.h.a();
        a2.a(j.a("aweme://aweme/detail/" + str2).a("refer", "find_friends").a());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void u() {
        if (this.w != null) {
            R_();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void v() {
        if (this.w != null) {
            R_();
        }
    }

    private void w() {
        if (PatchProxy.isSupport(new Object[0], this, f57731a, false, 62241, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57731a, false, 62241, new Class[0], Void.TYPE);
            return;
        }
        FeedImpressionReporter.a("feed").d();
    }

    private void x() {
        if (PatchProxy.isSupport(new Object[0], this, f57731a, false, 62244, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57731a, false, 62244, new Class[0], Void.TYPE);
            return;
        }
        this.v = 3;
    }

    public final void T_() {
        if (PatchProxy.isSupport(new Object[0], this, f57731a, false, 62275, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57731a, false, 62275, new Class[0], Void.TYPE);
            return;
        }
        ((FollowFeedAdapter) this.j).r();
        this.C = false;
    }

    public final com.ss.android.ugc.aweme.forward.a.a b() {
        if (!PatchProxy.isSupport(new Object[0], this, f57731a, false, 62229, new Class[0], com.ss.android.ugc.aweme.forward.a.a.class)) {
            return new com.ss.android.ugc.aweme.forward.a.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57737a;

                public final String e() {
                    return "key_container_follow";
                }

                public final Object a() {
                    return n.this.j;
                }

                public final boolean b() {
                    boolean z = false;
                    if (PatchProxy.isSupport(new Object[0], this, f57737a, false, 62290, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57737a, false, 62290, new Class[0], Boolean.TYPE)).booleanValue();
                    }
                    if (n.this.f57733c != null && n.this.f57733c.isViewValid()) {
                        z = true;
                    }
                    return z;
                }

                public final Context d() {
                    if (PatchProxy.isSupport(new Object[0], this, f57737a, false, 62292, new Class[0], Context.class)) {
                        return (Context) PatchProxy.accessDispatch(new Object[0], this, f57737a, false, 62292, new Class[0], Context.class);
                    } else if (n.this.f57733c != null) {
                        return n.this.f57733c.getActivity();
                    } else {
                        return n.this.mRecyclerView.getContext();
                    }
                }

                public final boolean c() {
                    if (PatchProxy.isSupport(new Object[0], this, f57737a, false, 62291, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57737a, false, 62291, new Class[0], Boolean.TYPE)).booleanValue();
                    } else if (n.this.f57733c == null || !n.this.f57733c.getLifecycle().getCurrentState().equals(Lifecycle.State.RESUMED) || !n.this.f57733c.getUserVisibleHint()) {
                        return false;
                    } else {
                        return true;
                    }
                }
            };
        }
        return (com.ss.android.ugc.aweme.forward.a.a) PatchProxy.accessDispatch(new Object[0], this, f57731a, false, 62229, new Class[0], com.ss.android.ugc.aweme.forward.a.a.class);
    }

    public final /* synthetic */ FeedAdapter d() {
        if (PatchProxy.isSupport(new Object[0], this, f57731a, false, 62230, new Class[0], FollowFeedAdapter.class)) {
            return (FollowFeedAdapter) PatchProxy.accessDispatch(new Object[0], this, f57731a, false, 62230, new Class[0], FollowFeedAdapter.class);
        }
        FollowFeedAdapter followFeedAdapter = new FollowFeedAdapter(this.mRecyclerView, this.w.g, new g() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57739a;

            /* renamed from: c  reason: collision with root package name */
            private int f57741c;

            public final int a() {
                return 0;
            }

            public final void b(RecyclerView recyclerView, int i) {
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f57739a, false, 62293, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f57739a, false, 62293, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                } else if (AbTestManager.a().aB() == 8 || AbTestManager.a().aB() == 9) {
                    int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                    if (i == 0) {
                        n.this.a(false, this.f57741c, computeVerticalScrollOffset, false, false);
                    }
                }
            }

            public final void a(RecyclerView recyclerView, int i) {
                boolean z;
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f57739a, false, 62294, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f57739a, false, 62294, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                } else if (AbTestManager.a().aB() == 8 || AbTestManager.a().aB() == 9) {
                    this.f57741c = i;
                    int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                    if (i >= 0 || i <= n.t || recyclerView.getScrollState() == 1) {
                        n nVar = n.this;
                        if (recyclerView.getScrollState() == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        nVar.a(true, i, computeVerticalScrollOffset, true, z);
                    }
                }
            }
        }, this, this.f57733c);
        return followFeedAdapter;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f57731a, false, 62276, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57731a, false, 62276, new Class[0], Void.TYPE);
            return;
        }
        ((FollowFeedAdapter) this.j).r();
        this.C = false;
    }

    public Activity getActivity() {
        if (!PatchProxy.isSupport(new Object[0], this, f57731a, false, 62277, new Class[0], Activity.class)) {
            return this.f57733c.getActivity();
        }
        return (Activity) PatchProxy.accessDispatch(new Object[0], this, f57731a, false, 62277, new Class[0], Activity.class);
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f57731a, false, 62278, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57731a, false, 62278, new Class[0], Void.TYPE);
            return;
        }
        this.mRecyclerView.post(new q(this));
        this.C = true;
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f57731a, false, 62240, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57731a, false, 62240, new Class[0], Void.TYPE);
            return;
        }
        super.k();
        FeedImpressionReporter.a("feed").e();
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, f57731a, false, 62262, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57731a, false, 62262, new Class[0], Void.TYPE);
            return;
        }
        a(0, 0);
    }

    public final void r() {
        if (PatchProxy.isSupport(new Object[0], this, f57731a, false, 62279, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57731a, false, 62279, new Class[0], Void.TYPE);
        } else if (this.y != null) {
            this.mRecyclerView.post(new r(this));
            this.C = false;
        }
    }

    private void y() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f57731a, false, 62271, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57731a, false, 62271, new Class[0], Void.TYPE);
            return;
        }
        if (TextUtils.equals(this.f57734d, "extra_follow_type_friend")) {
            i = 51;
        } else if (TextUtils.equals(this.f57734d, "extra_follow_type_follow")) {
            i = 50;
        } else {
            i = -1;
        }
        if (i >= 0 && c.a().d(i)) {
            if (AbTestManager.a().bT() == 2) {
                c.a().a(51);
            }
            c.a().a(i);
            bg.a(new com.ss.android.ugc.aweme.message.b.c(i, -1));
        }
    }

    private String z() {
        if (PatchProxy.isSupport(new Object[0], this, f57731a, false, 62282, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f57731a, false, 62282, new Class[0], String.class);
        } else if (TextUtils.equals(this.f57734d, "extra_follow_type_friend")) {
            return "homepage_friends";
        } else {
            if (TextUtils.equals(this.f57734d, "extra_follow_type_follow")) {
                return "homepage_follow";
            }
            return "";
        }
    }

    public final void a() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f57731a, false, 62246, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57731a, false, 62246, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            if (!NetworkUtils.isNetworkAvailable(this.f57733c.getContext())) {
                b(false);
                if (this.w != null) {
                    this.w.d();
                }
                com.bytedance.ies.dmt.ui.d.a.b(this.f57733c.getContext(), (int) C0906R.string.bgf).a();
                return;
            }
            if (this.v == null) {
                i = 3;
            } else {
                i = this.v.intValue();
            }
            this.v = Integer.valueOf(i);
            if (this.w != null) {
                com.ss.android.ugc.aweme.newfollow.g.a.d(com.ss.android.ugc.aweme.newfollow.g.a.a(this.v));
                R_();
                b(true);
            }
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f57731a, false, 62228, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57731a, false, 62228, new Class[0], Void.TYPE);
            return;
        }
        this.mLoadingStatusView.setBuilder(DmtStatusView.a.a(getContext()).b(com.ss.android.ugc.aweme.views.e.a(getContext(), new o(this))));
        this.mLoadingStatusView.setUseScreenHeight(getContext().getResources().getDimensionPixelSize(C0906R.dimen.lj));
    }

    public boolean p() {
        if (PatchProxy.isSupport(new Object[0], this, f57731a, false, 62257, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57731a, false, 62257, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.g.a.a() || (com.ss.android.g.a.a() && TextUtils.equals(this.f57734d, "extra_follow_type_follow"))) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void t() {
        FollowFeedAdapter followFeedAdapter = (FollowFeedAdapter) this.j;
        if (PatchProxy.isSupport(new Object[0], followFeedAdapter, FollowFeedAdapter.f57068f, false, 61099, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], followFeedAdapter, FollowFeedAdapter.f57068f, false, 61099, new Class[0], Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.c()) {
            followFeedAdapter.g = true;
        }
        if (followFeedAdapter.mItems == null || !followFeedAdapter.mItems.contains(followFeedAdapter.G)) {
            followFeedAdapter.mItems.add(followFeedAdapter.o());
            followFeedAdapter.notifyDataSetChanged();
        }
    }

    public final void R_() {
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f57731a, false, 62247, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57731a, false, 62247, new Class[0], Void.TYPE);
        } else if (this.w != null) {
            if (this.j != null) {
                FollowFeedAdapter followFeedAdapter = (FollowFeedAdapter) this.j;
                if (com.ss.android.g.a.a() || this.x) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                followFeedAdapter.g = z2;
                com.ss.android.ugc.aweme.story.api.b.c cVar = ((FollowFeedAdapter) this.j).h;
                if (cVar != null) {
                    cVar.ai_();
                }
            }
            if (!FeedImpressionReporter.a("feed").b()) {
                FeedImpressionReporter.a("feed").f57392c = new HashSet<>(FeedImpressionReporter.a("feed").f57391b);
            }
            if (this.w != null) {
                this.w.a(1, com.ss.android.ugc.aweme.follow.presenter.d.a(1, 0, 1, FeedImpressionReporter.a("feed").c()).b(this.p).a());
                this.F.f47732b = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void s() {
        List list;
        FollowFeedAdapter followFeedAdapter = (FollowFeedAdapter) this.j;
        if (PatchProxy.isSupport(new Object[0], followFeedAdapter, FollowFeedAdapter.f57068f, false, 61098, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], followFeedAdapter, FollowFeedAdapter.f57068f, false, 61098, new Class[0], Void.TYPE);
        } else {
            if (com.ss.android.g.a.c()) {
                followFeedAdapter.g = true;
            }
            if (PatchProxy.isSupport(new Object[0], followFeedAdapter, FollowFeedAdapter.f57068f, false, 61074, new Class[0], List.class)) {
                list = (List) PatchProxy.accessDispatch(new Object[0], followFeedAdapter, FollowFeedAdapter.f57068f, false, 61074, new Class[0], List.class);
            } else {
                FollowFeed m = followFeedAdapter.m();
                ArrayList arrayList = new ArrayList();
                if (followFeedAdapter.g) {
                    arrayList.add(m);
                }
                arrayList.add(followFeedAdapter.n());
                arrayList.add(followFeedAdapter.o());
                followFeedAdapter.setShowFooter(false);
                followFeedAdapter.b((List<FollowFeed>) arrayList);
                list = arrayList;
            }
            followFeedAdapter.mItems = list;
            followFeedAdapter.notifyDataSetChanged();
        }
        this.y.a();
    }

    public void loadMore() {
        List list;
        if (PatchProxy.isSupport(new Object[0], this, f57731a, false, 62250, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57731a, false, 62250, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            if (3 != this.B || this.C) {
                if (!this.w.i().isDataEmpty() && this.w != null) {
                    com.ss.android.ugc.aweme.newfollow.g.a.d(com.ss.android.ugc.aweme.newfollow.g.a.b(this.H));
                    FeedImpressionReporter a2 = FeedImpressionReporter.a("feed");
                    List<FollowFeed> list2 = this.f57733c.f3650c.g;
                    if (PatchProxy.isSupport(new Object[]{list2}, this, f57731a, false, 62251, new Class[]{List.class}, List.class)) {
                        list = (List) PatchProxy.accessDispatch(new Object[]{list2}, this, f57731a, false, 62251, new Class[]{List.class}, List.class);
                    } else if (list2 == null || list2.size() == 0) {
                        list = null;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (FollowFeed next : list2) {
                            if (next.getFeedType() == 65280) {
                                arrayList.add(next.getAweme().getAid());
                            }
                        }
                        list = arrayList;
                    }
                    a2.a(list);
                    this.w.a(4, com.ss.android.ugc.aweme.follow.presenter.d.a(4, 2, 1, FeedImpressionReporter.a("feed").c()).a(FeedImpressionReporter.a("feed").a()).a());
                }
            } else if (this.y != null) {
                this.y.c();
            }
        }
    }

    public final void g(boolean z2) {
        this.E = z2;
        if (this.j != null) {
            ((FollowFeedAdapter) this.j).B = this.E;
        }
    }

    public final void a(@IFollowFeedFetchTrigger.ILoadMoreType Integer num) {
        Integer num2 = num;
        if (PatchProxy.isSupport(new Object[]{num2}, this, f57731a, false, 62249, new Class[]{Integer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{num2}, this, f57731a, false, 62249, new Class[]{Integer.class}, Void.TYPE);
            return;
        }
        this.H = num2;
        loadMore();
    }

    public final void b_(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f57731a, false, 62269, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f57731a, false, 62269, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.j != null) {
            int l = ((FollowFeedAdapter) this.j).l();
            if (l >= 0) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.mRecyclerView.findViewHolderForAdapterPosition(l);
                if (findViewHolderForAdapterPosition != null && e.class.isAssignableFrom(findViewHolderForAdapterPosition.getClass())) {
                    ((e) findViewHolderForAdapterPosition).b_(z2);
                }
            }
        }
    }

    public final void e(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f57731a, false, 62233, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f57731a, false, 62233, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f57736f == null) {
            this.f57736f = new a(this.mNoticeGuideView);
            this.f57736f.f57090c = this.w;
        }
        this.f57736f.a(z2);
    }

    public final boolean c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57731a, false, 62237, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57731a, false, 62237, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!isViewValid()) {
            return true;
        } else {
            switch (i) {
                case 1:
                    com.ss.android.ugc.aweme.newfollow.g.a.a(com.ss.android.ugc.aweme.newfollow.g.a.b(this.H), false, true);
                    T_();
                    if (this.j != null) {
                        ((FollowFeedAdapter) this.j).showPullUpLoadMore();
                    }
                    return true;
                case 2:
                    if (this.j != null) {
                        ((FollowFeedAdapter) this.j).showLoadMoreLoading();
                    }
                    return true;
                case 3:
                    if (this.j != null) {
                        ((FollowFeedAdapter) this.j).showLoadMoreEmpty();
                    }
                    return true;
                default:
                    return false;
            }
        }
    }

    public final void f(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f57731a, false, 62260, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f57731a, false, 62260, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.j != null && p()) {
            ((FollowFeedAdapter) this.j).a(z2);
            ((FollowFeedAdapter) this.j).p();
            q();
            IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
            if (iAVService != null) {
                iAVService.getPublishService().setUploadRecoverPath(null);
            }
        }
        if (this.f57732b != null) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().unregisterDraftListener(this.f57732b);
            this.f57732b = null;
        }
    }

    public final void a(int i) {
        boolean z2;
        List list;
        FollowFeed followFeed;
        List list2;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57731a, false, 62236, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57731a, false, 62236, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            this.B = i2;
            if (!com.ss.android.g.a.a() && i2 == 1) {
                com.ss.android.ugc.aweme.newfollow.g.a.a(com.ss.android.ugc.aweme.newfollow.g.a.a(this.v), false, true);
                x();
            }
            if (com.ss.android.g.a.a()) {
                super.a(i);
                getActivity();
                return;
            }
            switch (i2) {
                case 2:
                    if (this.j != null) {
                        if (PatchProxy.isSupport(new Object[0], this, f57731a, false, 62238, new Class[0], Boolean.TYPE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57731a, false, 62238, new Class[0], Boolean.TYPE)).booleanValue();
                        } else if (((FollowFeedAdapter) this.j).getItemCount() == 0 || (((FollowFeedAdapter) this.j).getItemCount() == 1 && ((FollowFeedAdapter) this.j).a(0).getFeedType() == 65283)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            if (this.mLoadingStatusView != null) {
                                this.mLoadingStatusView.setVisibility(8);
                            }
                            FollowFeedAdapter followFeedAdapter = (FollowFeedAdapter) this.j;
                            if (PatchProxy.isSupport(new Object[0], followFeedAdapter, FollowFeedAdapter.f57068f, false, 61095, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], followFeedAdapter, FollowFeedAdapter.f57068f, false, 61095, new Class[0], Void.TYPE);
                                break;
                            } else {
                                if (com.ss.android.g.a.c()) {
                                    followFeedAdapter.g = true;
                                }
                                if (PatchProxy.isSupport(new Object[0], followFeedAdapter, FollowFeedAdapter.f57068f, false, 61071, new Class[0], List.class)) {
                                    list = (List) PatchProxy.accessDispatch(new Object[0], followFeedAdapter, FollowFeedAdapter.f57068f, false, 61071, new Class[0], List.class);
                                } else {
                                    FollowFeed m = followFeedAdapter.m();
                                    ArrayList arrayList = new ArrayList();
                                    if (followFeedAdapter.g) {
                                        arrayList.add(m);
                                    }
                                    if (PatchProxy.isSupport(new Object[0], followFeedAdapter, FollowFeedAdapter.f57068f, false, 61080, new Class[0], FollowFeed.class)) {
                                        followFeed = (FollowFeed) PatchProxy.accessDispatch(new Object[0], followFeedAdapter, FollowFeedAdapter.f57068f, false, 61080, new Class[0], FollowFeed.class);
                                    } else {
                                        if (followFeedAdapter.F == null) {
                                            followFeedAdapter.F = new FollowFeed();
                                            followFeedAdapter.F.setFeedType(65534);
                                        }
                                        followFeed = followFeedAdapter.F;
                                    }
                                    arrayList.add(followFeed);
                                    followFeedAdapter.setShowFooter(false);
                                    followFeedAdapter.b((List<FollowFeed>) arrayList);
                                    list = arrayList;
                                }
                                followFeedAdapter.mItems = list;
                                followFeedAdapter.notifyDataSetChanged();
                                return;
                            }
                        }
                    }
                    break;
                case 3:
                    if (this.mLoadingStatusView != null) {
                        this.mLoadingStatusView.setVisibility(8);
                    }
                    if (this.j != null && !this.D) {
                        FollowFeedAdapter followFeedAdapter2 = (FollowFeedAdapter) this.j;
                        if (PatchProxy.isSupport(new Object[0], followFeedAdapter2, FollowFeedAdapter.f57068f, false, 61097, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], followFeedAdapter2, FollowFeedAdapter.f57068f, false, 61097, new Class[0], Void.TYPE);
                        } else {
                            if (com.ss.android.g.a.c()) {
                                followFeedAdapter2.g = true;
                            }
                            if (PatchProxy.isSupport(new Object[0], followFeedAdapter2, FollowFeedAdapter.f57068f, false, 61073, new Class[0], List.class)) {
                                list2 = (List) PatchProxy.accessDispatch(new Object[0], followFeedAdapter2, FollowFeedAdapter.f57068f, false, 61073, new Class[0], List.class);
                            } else {
                                FollowFeed m2 = followFeedAdapter2.m();
                                ArrayList arrayList2 = new ArrayList();
                                if (followFeedAdapter2.g) {
                                    arrayList2.add(m2);
                                }
                                arrayList2.add(followFeedAdapter2.n());
                                followFeedAdapter2.setShowFooter(false);
                                followFeedAdapter2.b((List<FollowFeed>) arrayList2);
                                list2 = arrayList2;
                            }
                            followFeedAdapter2.mItems = list2;
                            followFeedAdapter2.Q = true;
                            followFeedAdapter2.notifyDataSetChanged();
                        }
                    }
                    y();
                    return;
                default:
                    super.a(i);
                    break;
            }
        }
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f57731a, false, 62263, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f57731a, false, 62263, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mRecyclerView != null) {
            ((LinearLayoutManager) this.mRecyclerView.getLayoutManager()).scrollToPositionWithOffset(i, i2);
        }
    }

    public final void b(List<FollowFeed> list, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f57731a, false, 62242, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z2)}, this, f57731a, false, 62242, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.b(list, z2);
        com.ss.android.ugc.aweme.newfollow.g.a.a(com.ss.android.ugc.aweme.newfollow.g.a.b(this.H), true, !z2);
        if (PatchProxy.isSupport(new Object[0], this, f57731a, false, 62248, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57731a, false, 62248, new Class[0], Void.TYPE);
        } else {
            this.H = 4;
        }
        w();
    }

    public final void a(FollowFeed followFeed, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{followFeed, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f57731a, false, 62258, new Class[]{FollowFeed.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followFeed, Byte.valueOf(z2)}, this, f57731a, false, 62258, new Class[]{FollowFeed.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.j != null && p()) {
            ((FollowFeedAdapter) this.j).a(followFeed, z2);
            if (z2) {
                ((FollowFeedAdapter) this.j).q();
            } else {
                ((FollowFeedAdapter) this.j).p();
            }
            q();
        }
    }

    public final /* synthetic */ void a(int i, Object obj, int i2, View view, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i3 = i;
        int i4 = i2;
        String str8 = str;
        User user = (User) obj;
        int i5 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), user, Integer.valueOf(i2), view, str8}, this, f57731a, false, 62280, new Class[]{Integer.TYPE, User.class, Integer.TYPE, View.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), user, Integer.valueOf(i2), view, str8}, this, f57731a, false, 62280, new Class[]{Integer.TYPE, User.class, Integer.TYPE, View.class, String.class}, Void.TYPE);
        } else if (i3 == 101) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("group_id", "");
                jSONObject.put("request_id", this.y.b().rid);
                jSONObject.put("enter_from", "invite_friend");
                jSONObject.put("enter_method", "click_head");
                jSONObject.put("enter_type", "normal_way");
            } catch (Exception unused) {
            }
            r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("find_friends").setValue(user.getUid()).setJsonObject(jSONObject));
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("rec_uid", user.getUid());
                jSONObject2.put("enter_from", z());
                jSONObject2.put("event_type", "enter_profile");
                jSONObject2.put("impr_order", i4);
                jSONObject2.put("req_id", this.y.b().rid);
                jSONObject2.put("trigger_reason", "friend_rec_message");
                jSONObject2.put("rec_reason", user.getRecommendReason());
                if (user.isNewRecommend()) {
                    str7 = "new";
                } else {
                    str7 = "past";
                }
                jSONObject2.put("card_type", str7);
            } catch (Exception unused2) {
            }
            r.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject2));
            r.a("follow_card", jSONObject2);
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", z()).a("to_user_id", user.getUid()).a("group_id", "").a("request_id", this.y.b().rid).a("enter_method", "click_card");
            if (((FollowFeedAdapter) this.j).D) {
                str5 = "empty";
            } else {
                str5 = "nonempty";
            }
            r.a("enter_personal_detail_backup", (Map) a2.a("page_status", str5).f34114b);
            ((q) new q().k(user.getUid()).b("find_friends").a(str8)).l(this.y.b().rid).e();
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("to_user_id", user.getUid());
                jSONObject3.put("request_id", this.y.b().rid);
            } catch (Exception unused3) {
            }
            if ("click_name".equals(str8)) {
                str6 = "name";
            } else {
                str6 = "head";
            }
            r.onEvent(MobClick.obtain().setEventName(str6).setLabelName("find_friends").setValue(user.getUid()).setJsonObject(jSONObject3));
            UserProfileActivity.a(getContext(), ad.a().a("uid", user.getUid()).a("sec_user_id", user.getSecUid()).a("enter_from_request_id", this.y.b().rid).a("enter_from", z()).a("is_cold_launch", 1).a("need_track_compare_recommend_reason", 1).a("previous_recommend_reason", user.getRecommendReason()).a("recommend_from_type", "list").f75487b);
        } else {
            if (i3 == 100 && isViewValid()) {
                if (!NetworkUtils.isNetworkAvailable(this.f57733c.getActivity())) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) this.f57733c.getActivity(), (int) C0906R.string.bgf).a();
                    return;
                }
                this.z = user;
                this.A = (ak) view;
                if (user.getFollowStatus() != 0) {
                    i5 = 1;
                }
                int i6 = i5 ^ 1;
                bg.a(new com.ss.android.ugc.aweme.challenge.a.a(i6, user));
                if (i6 == 0) {
                    r.onEvent(MobClick.obtain().setEventName("invite_friends").setLabelName("follow_cancel").setValue(String.valueOf(user.getUid())));
                } else {
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("request_id", this.y.b().rid);
                    } catch (Exception unused4) {
                    }
                    r.onEvent(MobClick.obtain().setEventName("invite_friends").setLabelName("follow").setValue(String.valueOf(user.getUid())).setJsonObject(jSONObject4));
                    JSONObject jSONObject5 = new JSONObject();
                    try {
                        jSONObject5.put("rec_uid", user.getUid());
                        jSONObject5.put("enter_from", z());
                        jSONObject5.put("event_type", "follow");
                        jSONObject5.put("impr_order", i4);
                        jSONObject5.put("req_id", this.y.b().rid);
                        jSONObject5.put("trigger_reason", "friend_rec_message");
                        jSONObject5.put("rec_reason", user.getRecommendReason());
                        if (user.isNewRecommend()) {
                            str4 = "new";
                        } else {
                            str4 = "past";
                        }
                        jSONObject5.put("card_type", str4);
                    } catch (Exception unused5) {
                    }
                    r.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject5));
                    r.a("follow_card", jSONObject5);
                    r.onEvent(MobClick.obtain().setEventName("follow").setLabelName("find_friends").setValue(String.valueOf(user.getUid())));
                }
                if (i6 == 0) {
                    str2 = "follow_cancel";
                } else {
                    str2 = "follow";
                }
                s b2 = new s(str2).g("other_places").b("homepage_friends");
                if (((FollowFeedAdapter) this.j).D) {
                    str3 = "empty";
                } else {
                    str3 = "nonempty";
                }
                b2.e(str3).c("follow_button").k(user.getRequestId()).h(user.getUid()).e();
            }
        }
    }
}
