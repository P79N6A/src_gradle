package com.ss.android.ugc.aweme.similarvideo.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ad.splash.utils.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.base.b;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.base.widget.RecyclerHeaderViewAdapter;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.common.widget.ZeusFrameLayout;
import com.ss.android.ugc.aweme.discover.mob.k;
import com.ss.android.ugc.aweme.feed.listener.OnGradualScrollListener;
import com.ss.android.ugc.aweme.feed.listener.m;
import com.ss.android.ugc.aweme.feed.listener.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel;
import com.ss.android.ugc.aweme.similarvideo.b.b;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import java.util.List;

public class SimilarVideoFragment extends AmeBaseFragment implements d, LoadMoreRecyclerViewAdapter.a, c<Aweme>, m, n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71529a;

    /* renamed from: b  reason: collision with root package name */
    static String f71530b;

    /* renamed from: c  reason: collision with root package name */
    public a f71531c;

    /* renamed from: d  reason: collision with root package name */
    protected CellFeedFragmentPanel f71532d;

    /* renamed from: e  reason: collision with root package name */
    protected RecyclerHeaderViewAdapter<Aweme> f71533e;

    /* renamed from: f  reason: collision with root package name */
    protected b f71534f;
    @BindView(2131495406)
    ZeusFrameLayout mLayout;
    @BindView(2131495411)
    protected RecyclerView mRecyclerView;
    @BindView(2131496683)
    protected SwipeRefreshLayout mRefreshLayout;
    @BindView(2131497326)
    protected DmtStatusView mStatusView;

    public interface a {
        void a();
    }

    private static String f() {
        return "similar_videos";
    }

    public final void p() {
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f71529a, false, 81666, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71529a, false, 81666, new Class[0], Void.TYPE);
        } else if (this.mRecyclerView.getChildCount() > 0) {
            this.mRefreshLayout.setRefreshing(true);
        } else {
            this.mStatusView.d();
        }
    }

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, f71529a, false, 81669, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71529a, false, 81669, new Class[0], Void.TYPE);
            return;
        }
        new Handler().postDelayed(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71541a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f71541a, false, 81673, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f71541a, false, 81673, new Class[0], Void.TYPE);
                    return;
                }
                if (SimilarVideoFragment.this.isViewValid() && SimilarVideoFragment.this.mRefreshLayout != null) {
                    SimilarVideoFragment.this.mRefreshLayout.setRefreshing(false);
                }
            }
        }, 500);
    }

    public final void I_() {
        if (PatchProxy.isSupport(new Object[0], this, f71529a, false, 81651, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71529a, false, 81651, new Class[0], Void.TYPE);
            return;
        }
        loadMore();
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f71529a, false, 81654, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71529a, false, 81654, new Class[0], Void.TYPE);
            return;
        }
        g();
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f71529a, false, 81665, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71529a, false, 81665, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.f71534f != null) {
            this.f71534f.k();
        }
        this.f71532d.n();
    }

    @NonNull
    public SparseArray<com.ss.android.ugc.common.component.fragment.b> registerComponents() {
        if (PatchProxy.isSupport(new Object[0], this, f71529a, false, 81635, new Class[0], SparseArray.class)) {
            return (SparseArray) PatchProxy.accessDispatch(new Object[0], this, f71529a, false, 81635, new Class[0], SparseArray.class);
        }
        SparseArray<com.ss.android.ugc.common.component.fragment.b> registerComponents = super.registerComponents();
        registerComponents.append(b.a.f34652b, this.f71532d);
        return registerComponents;
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f71529a, false, 81660, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71529a, false, 81660, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.f71533e.showLoadMoreLoading();
        }
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f71529a, false, 81656, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71529a, false, 81656, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            i();
        }
    }

    public final void z_() {
        if (PatchProxy.isSupport(new Object[0], this, f71529a, false, 81663, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71529a, false, 81663, new Class[0], Void.TYPE);
            return;
        }
        g();
    }

    public SimilarVideoFragment() {
        CellFeedFragmentPanel cellFeedFragmentPanel;
        if (PatchProxy.isSupport(new Object[0], this, f71529a, false, 81634, new Class[0], CellFeedFragmentPanel.class)) {
            cellFeedFragmentPanel = (CellFeedFragmentPanel) PatchProxy.accessDispatch(new Object[0], this, f71529a, false, 81634, new Class[0], CellFeedFragmentPanel.class);
        } else {
            if (this.f71532d == null) {
                this.f71532d = new CellFeedFragmentPanel(f(), this, this, 16);
            }
            cellFeedFragmentPanel = this.f71532d;
        }
        this.f71532d = cellFeedFragmentPanel;
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f71529a, false, 81667, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71529a, false, 81667, new Class[0], Void.TYPE);
            return;
        }
        j();
        if (this.f71533e.mShowFooter) {
            this.f71533e.setShowFooter(false);
            this.f71533e.notifyDataSetChanged();
        }
        this.f71533e.setData(null);
        this.mStatusView.e();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f71529a, false, 81646, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71529a, false, 81646, new Class[0], Void.TYPE);
            return;
        }
        if (!NetworkUtils.b(getActivity())) {
            com.ss.android.b.a.a.a.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f71539a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f71539a, false, 81672, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f71539a, false, 81672, new Class[0], Void.TYPE);
                    } else if (SimilarVideoFragment.this.isViewValid()) {
                        SimilarVideoFragment.this.mStatusView.f();
                        com.bytedance.ies.dmt.ui.d.a.b((Context) SimilarVideoFragment.this.getActivity(), (int) C0906R.string.bgf).a();
                    }
                }
            }, 100);
        } else if (this.f71534f != null) {
            a(f71530b);
        }
    }

    public final boolean d() {
        if (!PatchProxy.isSupport(new Object[0], this, f71529a, false, 81649, new Class[0], Boolean.TYPE)) {
            return ((com.ss.android.ugc.aweme.common.f.a) this.f71534f.i()).isHasMore();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f71529a, false, 81649, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f71529a, false, 81652, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71529a, false, 81652, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            if (PatchProxy.isSupport(new Object[0], this, f71529a, false, 81653, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f71529a, false, 81653, new Class[0], Void.TYPE);
                return;
            }
            this.f71534f.a(4, f71530b);
        }
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f71529a, false, 81655, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f71529a, false, 81655, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            a(exc);
        }
    }

    public final void d(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f71529a, false, 81664, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f71529a, false, 81664, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        a(exc);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f71529a, false, 81641, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f71529a, false, 81641, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
    }

    private void a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f71529a, false, 81668, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f71529a, false, 81668, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.api.a.a.a(getContext(), (Throwable) exc2);
        i();
    }

    public final void c(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f71529a, false, 81661, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f71529a, false, 81661, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            if (PatchProxy.isSupport(new Object[0], this, f71529a, false, 81662, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f71529a, false, 81662, new Class[0], Void.TYPE);
                return;
            }
            j();
            this.f71533e.showLoadMoreError();
        }
    }

    private void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f71529a, false, 81647, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f71529a, false, 81647, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f71534f.a(1, str);
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f71529a, false, 81650, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f71529a, false, 81650, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f71532d.a(z);
    }

    public final void b(List<Aweme> list, boolean z) {
        List<Aweme> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f71529a, false, 81658, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z)}, this, f71529a, false, 81658, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f71532d.b(list2, z);
    }

    public final void c(List<Aweme> list, boolean z) {
        List<Aweme> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f71529a, false, 81659, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z)}, this, f71529a, false, 81659, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f71532d.b(list2, z);
    }

    public final void a(List<Aweme> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f71529a, false, 81657, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f71529a, false, 81657, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            this.f71532d.a(list, z);
            this.mStatusView.b();
            if (this.f71531c != null) {
                this.f71531c.a();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        RecyclerView.LayoutManager layoutManager;
        View view2 = view;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{view2, bundle2}, this, f71529a, false, 81638, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle2}, this, f71529a, false, 81638, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f71532d.f(getUserVisibleHint());
        if (PatchProxy.isSupport(new Object[]{view2, bundle2}, this, f71529a, false, 81639, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle2}, this, f71529a, false, 81639, new Class[]{View.class, Bundle.class}, Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f71529a, false, 81642, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f71529a, false, 81642, new Class[0], Void.TYPE);
            } else {
                com.bytedance.ies.dmt.ui.widget.c cVar = new c.a(getContext()).a(2130840144).b((int) C0906R.string.f4486dmt).c(C0906R.string.dmu).f20493a;
                DmtLoadingLayout dmtLoadingLayout = new DmtLoadingLayout(getContext());
                dmtLoadingLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                dmtLoadingLayout.setUseScreenHeight((int) UIUtils.dip2Px(getActivity(), 494.0f));
                this.mStatusView.setBuilder(new DmtStatusView.a(getContext()).a((View) dmtLoadingLayout).a(cVar).a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f71537a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f71537a, false, 81671, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f71537a, false, 81671, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        SimilarVideoFragment.this.b();
                    }
                }));
            }
            RecyclerView recyclerView = this.mRecyclerView;
            if (PatchProxy.isSupport(new Object[0], this, f71529a, false, 81643, new Class[0], RecyclerView.LayoutManager.class)) {
                layoutManager = (RecyclerView.LayoutManager) PatchProxy.accessDispatch(new Object[0], this, f71529a, false, 81643, new Class[0], RecyclerView.LayoutManager.class);
            } else {
                layoutManager = new WrapGridLayoutManager(getContext(), 2, 1, false);
            }
            recyclerView.setLayoutManager(layoutManager);
            this.f71532d.a(view, bundle2);
            if (PatchProxy.isSupport(new Object[0], this, f71529a, false, 81640, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f71529a, false, 81640, new Class[0], Void.TYPE);
            } else {
                this.f71533e = this.f71532d.g();
            }
            this.f71533e.mTextColor = getResources().getColor(C0906R.color.zx);
            this.f71532d.n = 16;
            this.f71532d.a((RecyclerView.OnScrollListener) new OnGradualScrollListener());
            this.f71532d.a((LoadMoreRecyclerViewAdapter.a) this);
            this.f71532d.j = this;
            this.mRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f71535a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f71535a, false, 81670, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f71535a, false, 81670, new Class[0], Void.TYPE);
                        return;
                    }
                    SimilarVideoFragment.this.b();
                }
            });
        }
        if (PatchProxy.isSupport(new Object[0], this, f71529a, false, 81644, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71529a, false, 81644, new Class[0], Void.TYPE);
        } else {
            this.f71534f = new com.ss.android.ugc.aweme.similarvideo.b.b();
            this.f71534f.a(this);
            this.f71534f.a((com.ss.android.ugc.aweme.common.f.d) this.f71532d);
            this.f71534f.a(new com.ss.android.ugc.aweme.similarvideo.b.a());
        }
        if (PatchProxy.isSupport(new Object[0], this, f71529a, false, 81645, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71529a, false, 81645, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && getUserVisibleHint()) {
            b();
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f71529a, false, 81637, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f71529a, false, 81637, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.qb, viewGroup2, false);
        ButterKnife.bind((Object) this, inflate);
        return inflate;
    }

    public final void a(View view, Aweme aweme, String str) {
        View view2 = view;
        Aweme aweme2 = aweme;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{view2, aweme2, str2}, this, f71529a, false, 81648, new Class[]{View.class, Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, aweme2, str2}, this, f71529a, false, 81648, new Class[]{View.class, Aweme.class, String.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            if (aweme2 != null && getActivity() != null) {
                com.ss.android.ugc.aweme.feed.a.a().f44610c = (com.ss.android.ugc.aweme.common.f.a) this.f71534f.i();
                h a2 = h.a();
                FragmentActivity activity = getActivity();
                a2.a((Activity) activity, j.a("aweme://aweme/detail/" + aweme.getAid()).a("refer", str2).a("video_from", "from_search_similar_aweme").a("profile_enterprise_type", aweme.getEnterpriseType()).a("page_type", 16).a(), view2);
                com.ss.android.ugc.aweme.feed.b.b.a(aweme);
                k.a(f(), aweme2);
            }
        }
    }
}
