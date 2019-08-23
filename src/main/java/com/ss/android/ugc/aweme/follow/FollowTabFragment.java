package com.ss.android.ugc.aweme.follow;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.b;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.listener.m;
import com.ss.android.ugc.aweme.feed.listener.n;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.d;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.story.e;
import com.ss.android.ugc.aweme.newfollow.util.FeedImpressionReporter;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.views.FpsRecyclerView;
import com.ss.android.ugc.common.component.fragment.b;
import org.greenrobot.eventbus.Subscribe;

public class FollowTabFragment extends FeedFragment implements LoadMoreRecyclerViewAdapter.a, m, n, e, e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3255a;

    /* renamed from: b  reason: collision with root package name */
    public View f3256b;

    /* renamed from: c  reason: collision with root package name */
    protected FollowCellFeedFragmentPanel f3257c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.follow.presenter.e f3258d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3259e;

    /* renamed from: f  reason: collision with root package name */
    private AnalysisStayTimeFragmentComponent f3260f;
    @BindView(2131494326)
    ViewGroup mFlRootContanier;
    @BindView(2131496683)
    SwipeRefreshLayout mRefreshLayout;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    @BindView(2131498412)
    View mVTabBg;

    public final void L_() {
    }

    public final int e() {
        return 1;
    }

    public final void h() {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public final void I_() {
        if (PatchProxy.isSupport(new Object[0], this, f3255a, false, 44595, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3255a, false, 44595, new Class[0], Void.TYPE);
            return;
        }
        loadMore();
    }

    public Analysis getAnalysis() {
        if (!PatchProxy.isSupport(new Object[0], this, f3255a, false, 44604, new Class[0], Analysis.class)) {
            return new Analysis().setLabelName("homepage_follow");
        }
        return (Analysis) PatchProxy.accessDispatch(new Object[0], this, f3255a, false, 44604, new Class[0], Analysis.class);
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3255a, false, 44587, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3255a, false, 44587, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.f3258d != null) {
            this.f3258d.k();
        }
        this.f3257c.n();
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f3255a, false, 44588, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3255a, false, 44588, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        FeedImpressionReporter.a("feed").e();
    }

    @NonNull
    public SparseArray<b> registerComponents() {
        if (PatchProxy.isSupport(new Object[0], this, f3255a, false, 44577, new Class[0], SparseArray.class)) {
            return (SparseArray) PatchProxy.accessDispatch(new Object[0], this, f3255a, false, 44577, new Class[0], SparseArray.class);
        }
        SparseArray<b> registerComponents = super.registerComponents();
        registerComponents.append(b.a.f34652b, this.f3257c);
        return registerComponents;
    }

    public FollowTabFragment() {
        FollowCellFeedFragmentPanel followCellFeedFragmentPanel;
        if (PatchProxy.isSupport(new Object[0], this, f3255a, false, 44578, new Class[0], FollowCellFeedFragmentPanel.class)) {
            followCellFeedFragmentPanel = (FollowCellFeedFragmentPanel) PatchProxy.accessDispatch(new Object[0], this, f3255a, false, 44578, new Class[0], FollowCellFeedFragmentPanel.class);
        } else {
            if (this.f3257c == null) {
                this.f3257c = new FollowCellFeedFragmentPanel("homepage_follow", this, this, e());
            }
            followCellFeedFragmentPanel = this.f3257c;
        }
        this.f3257c = followCellFeedFragmentPanel;
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f3255a, false, 44593, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3255a, false, 44593, new Class[0], Boolean.TYPE)).booleanValue();
        }
        com.ss.android.ugc.aweme.follow.presenter.e eVar = this.f3258d;
        if (PatchProxy.isSupport(new Object[0], eVar, com.ss.android.ugc.aweme.follow.presenter.e.f47789a, false, 44684, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], eVar, com.ss.android.ugc.aweme.follow.presenter.e.f47789a, false, 44684, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (eVar.f2978e == null || !((com.ss.android.ugc.aweme.follow.presenter.b) eVar.f2978e).isHasMore()) {
            return false;
        } else {
            return true;
        }
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f3255a, false, 44592, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3255a, false, 44592, new Class[0], Void.TYPE);
            return;
        }
        this.f3258d.a(4, d.a(4, 2, 1, FeedImpressionReporter.a("feed").c()).a(FeedImpressionReporter.a("feed").a()).a());
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3255a, false, 44589, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3255a, false, 44589, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.f3259e && this.f3258d != null) {
            this.f3258d.a(1, d.a(1, 0, 1, FeedImpressionReporter.a("feed").c()).a());
        }
    }

    public final void p() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3255a, false, 44596, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3255a, false, 44596, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.follow.presenter.e eVar = this.f3258d;
        if (eVar.f2978e != null && ((com.ss.android.ugc.aweme.follow.presenter.b) eVar.f2978e).i) {
            z = true;
        }
        if (!z && isVisible()) {
            a.c(getContext(), (int) C0906R.string.bhp).a();
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.main.c.b bVar) {
        if (bVar.f54680a == 1) {
            this.f3259e = true;
        }
    }

    public final void e(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3255a, false, 44598, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3255a, false, 44598, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.e(z);
    }

    public final void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f3255a, false, 44582, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f3255a, false, 44582, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        if (!(this.f3258d == null || this.f3258d.i() == null)) {
            ((com.ss.android.ugc.aweme.follow.presenter.b) this.f3258d.i()).f47768e = j;
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3255a, false, 44594, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3255a, false, 44594, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f3257c.b(z);
    }

    public final void b_(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3255a, false, 44602, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3255a, false, 44602, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f3257c != null) {
            this.f3257c.b_(z);
        }
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3255a, false, 44584, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3255a, false, 44584, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.c(z);
        this.f3257c.f();
    }

    @Subscribe
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, f3255a, false, 44600, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, f3255a, false, 44600, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        if (isViewValid() && followStatus.followStatus == 1 && this.f3257c.g()) {
            this.f3258d.a(1, d.a(1, 0, 1, FeedImpressionReporter.a("feed").c()).a());
        }
    }

    public void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3255a, false, 44603, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3255a, false, 44603, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        b_(!z);
        if (this.f3260f != null) {
            this.f3260f.a(z);
        }
    }

    @Subscribe
    public void onResizeStatusViewEvent(com.ss.android.ugc.aweme.follow.b.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f3255a, false, 44597, new Class[]{com.ss.android.ugc.aweme.follow.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f3255a, false, 44597, new Class[]{com.ss.android.ugc.aweme.follow.b.b.class}, Void.TYPE);
        } else if (bVar != null && this.mStatusView != null) {
            u.a(105.0d);
            if (Build.VERSION.SDK_INT >= 19) {
                UIUtils.getStatusBarHeight(com.ss.android.ugc.aweme.base.utils.d.a());
            }
        }
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3255a, false, 44590, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3255a, false, 44590, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        this.f3257c.f(z);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3255a, false, 44583, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3255a, false, 44583, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (getUserVisibleHint() && isViewValid()) {
            super.a(z);
            this.f3257c.b();
            e(true);
        }
    }

    public final boolean d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3255a, false, 44585, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3255a, false, 44585, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!isViewValid()) {
            return false;
        } else {
            if (!NetworkUtils.isNetworkAvailable(getActivity())) {
                a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
                this.mRefreshLayout.setRefreshing(false);
                return false;
            } else if (this.f3258d.m()) {
                return false;
            } else {
                com.ss.android.ugc.aweme.follow.presenter.e eVar = this.f3258d;
                ((com.ss.android.ugc.aweme.follow.presenter.b) eVar.f2978e).f47767d = z;
                eVar.g = z;
                this.f3258d.a(1, d.a(1, 0, 1, FeedImpressionReporter.a("feed").c()).a());
                return true;
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{view2, bundle2}, this, f3255a, false, 44581, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle2}, this, f3255a, false, 44581, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f3255a, false, 44580, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3255a, false, 44580, new Class[0], Void.TYPE);
        } else {
            this.mRefreshLayout.a(false, (int) UIUtils.dip2Px(getActivity(), 49.0f), (int) UIUtils.dip2Px(getActivity(), 113.0f));
            this.mRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f47724a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f47724a, false, 44606, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f47724a, false, 44606, new Class[0], Void.TYPE);
                        return;
                    }
                    FollowTabFragment.this.d(false);
                }
            });
            this.f3256b = getActivity().findViewById(C0906R.id.mt);
            this.mStatusView.setBuilder(DmtStatusView.a.a((Context) getActivity()).a(new c.a(getActivity()).a(2130840139).b((int) C0906R.string.agd).c(C0906R.string.ag6).f20493a).c(1).b(new c.a(getActivity()).a(2130840142).b((int) C0906R.string.dmm).c(C0906R.string.dml).a(com.bytedance.ies.dmt.ui.widget.a.BORDER, C0906R.string.dms, new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f47726a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f47726a, false, 44607, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f47726a, false, 44607, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    FollowTabFragment.this.d(false);
                }
            }).f20493a));
            this.mStatusView.setUseScreenHeight(getContext().getResources().getDimensionPixelSize(C0906R.dimen.lj));
        }
        this.f3257c.h = this.o + 0;
        this.f3257c.a(view2, bundle2);
        FollowCellFeedFragmentPanel followCellFeedFragmentPanel = this.f3257c;
        if (PatchProxy.isSupport(new Object[]{this}, followCellFeedFragmentPanel, FollowCellFeedFragmentPanel.f3249a, false, 44509, new Class[]{LoadMoreRecyclerViewAdapter.a.class}, Void.TYPE)) {
            FollowCellFeedFragmentPanel followCellFeedFragmentPanel2 = followCellFeedFragmentPanel;
            PatchProxy.accessDispatch(new Object[]{this}, followCellFeedFragmentPanel2, FollowCellFeedFragmentPanel.f3249a, false, 44509, new Class[]{LoadMoreRecyclerViewAdapter.a.class}, Void.TYPE);
        } else if (followCellFeedFragmentPanel.f3251c != null) {
            followCellFeedFragmentPanel.f3251c.setLoadMoreListener(this);
        }
        this.f3257c.f3252d = this;
        this.f3258d = new com.ss.android.ugc.aweme.follow.presenter.e();
        this.f3258d.a(this.f3257c);
        this.f3258d.a((com.ss.android.ugc.aweme.common.f.d) this.f3257c);
        this.f3258d.a(new com.ss.android.ugc.aweme.follow.presenter.b());
        ((com.ss.android.ugc.aweme.follow.presenter.b) this.f3258d.i()).f47768e = System.currentTimeMillis();
        this.f3258d.a(1, d.a(1, 0, 1, FeedImpressionReporter.a("feed").c()).a());
        this.m = -1;
        FollowCellFeedFragmentPanel followCellFeedFragmentPanel3 = this.f3257c;
        if (PatchProxy.isSupport(new Object[]{""}, followCellFeedFragmentPanel3, FollowCellFeedFragmentPanel.f3249a, false, 44541, new Class[]{String.class}, Void.TYPE)) {
            FollowCellFeedFragmentPanel followCellFeedFragmentPanel4 = followCellFeedFragmentPanel3;
            PatchProxy.accessDispatch(new Object[]{""}, followCellFeedFragmentPanel4, FollowCellFeedFragmentPanel.f3249a, false, 44541, new Class[]{String.class}, Void.TYPE);
        } else {
            if (followCellFeedFragmentPanel3.mListView != null && (followCellFeedFragmentPanel3.mListView instanceof FpsRecyclerView)) {
                ((FpsRecyclerView) followCellFeedFragmentPanel3.mListView).setLabel("");
            }
            if (followCellFeedFragmentPanel3.f3251c != null && (followCellFeedFragmentPanel3.f3251c instanceof LoadMoreRecyclerViewAdapter)) {
                followCellFeedFragmentPanel3.f3251c.mLabel = "";
            }
        }
        this.mVTabBg.setVisibility(4);
        if (getActivity() instanceof MainActivity) {
            ((MainActivity) getActivity()).getPushAwemeId();
            ((MainActivity) getActivity()).getPushAwemeIds();
            ((MainActivity) getActivity()).getPushParams();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f3255a, false, 44605, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f3255a, false, 44605, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            d(false);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3255a, false, 44579, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3255a, false, 44579, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.nv, viewGroup2, false);
        this.f3260f = new AnalysisStayTimeFragmentComponent(this, true);
        return inflate;
    }

    public final void a(View view, FollowFeed followFeed, String str) {
        View view2 = view;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{view2, followFeed, str2}, this, f3255a, false, 44591, new Class[]{View.class, FollowFeed.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, followFeed, str2}, this, f3255a, false, 44591, new Class[]{View.class, FollowFeed.class, String.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.c.a.a.a(view) && getActivity() != null) {
            if (followFeed.getFeedType() == 65280) {
                com.ss.android.ugc.aweme.feed.a.a().f44610c = (com.ss.android.ugc.aweme.common.f.a) this.f3258d.i();
                h a2 = h.a();
                FragmentActivity activity = getActivity();
                a2.a((Activity) activity, j.a("aweme://aweme/detail/" + followFeed.getAweme().getAid()).a("refer", str2).a("video_from", "from_follow_tab").a("page_type", e()).a("profile_enterprise_type", followFeed.getAweme().getEnterpriseType()).a(), view2);
                com.ss.android.ugc.aweme.feed.b.b.a(followFeed.getAweme());
                r.onEvent(MobClick.obtain().setEventName("feed_enter").setLabelName("homepage_follow").setValue(followFeed.getAweme().getAid()).setJsonObject(com.ss.android.ugc.aweme.feed.a.a().b(followFeed.getAweme(), e())));
            }
        }
    }
}
