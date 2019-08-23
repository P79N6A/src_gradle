package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.base.b;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.a;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.feed.h.ae;
import com.ss.android.ugc.aweme.feed.h.g;
import com.ss.android.ugc.aweme.feed.listener.OnGradualScrollListener;
import com.ss.android.ugc.aweme.feed.listener.m;
import com.ss.android.ugc.aweme.feed.listener.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.ss.android.ugc.aweme.main.bk;
import com.ss.android.ugc.aweme.main.c.c;
import com.ss.android.ugc.common.component.fragment.b;
import org.greenrobot.eventbus.Subscribe;

public class FeedTimeLineFragment extends FeedFragment implements d, LoadMoreRecyclerViewAdapter.a, m, n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3202a;

    /* renamed from: b  reason: collision with root package name */
    a f3203b;

    /* renamed from: c  reason: collision with root package name */
    public View f3204c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.feed.h.m f3205d;

    /* renamed from: e  reason: collision with root package name */
    private CellFeedFragmentPanel f3206e = new CellFeedFragmentPanel("homepage_fresh", this, this, 2);
    @BindView(2131494326)
    ViewGroup mFlRootContanier;
    @BindView(2131496683)
    FeedSwipeRefreshLayout mRefreshLayout;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    @BindView(2131498412)
    View mVTabBg;

    public boolean isRegisterEventBus() {
        return true;
    }

    @Subscribe
    public void onMainSwipeRefreshABChangedEvent(c cVar) {
    }

    public final void I_() {
        if (PatchProxy.isSupport(new Object[0], this, f3202a, false, 42749, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3202a, false, 42749, new Class[0], Void.TYPE);
            return;
        }
        loadMore();
    }

    public final boolean d() {
        if (!PatchProxy.isSupport(new Object[0], this, f3202a, false, 42747, new Class[0], Boolean.TYPE)) {
            return this.f3205d.d();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3202a, false, 42747, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3202a, false, 42743, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3202a, false, 42743, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.f3205d != null) {
            this.f3205d.k();
        }
        this.f3206e.n();
    }

    @NonNull
    public SparseArray<b> registerComponents() {
        if (PatchProxy.isSupport(new Object[0], this, f3202a, false, 42736, new Class[0], SparseArray.class)) {
            return (SparseArray) PatchProxy.accessDispatch(new Object[0], this, f3202a, false, 42736, new Class[0], SparseArray.class);
        }
        SparseArray<b> registerComponents = super.registerComponents();
        registerComponents.append(b.a.f34652b, this.f3206e);
        return registerComponents;
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f3202a, false, 42746, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3202a, false, 42746, new Class[0], Void.TYPE);
            return;
        }
        this.f3205d.a(4, 2, 2);
    }

    public final void p() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3202a, false, 42750, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3202a, false, 42750, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.feed.h.m mVar = this.f3205d;
        if (PatchProxy.isSupport(new Object[0], mVar, com.ss.android.ugc.aweme.feed.h.m.f45509a, false, 42048, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], mVar, com.ss.android.ugc.aweme.feed.h.m.f45509a, false, 42048, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (mVar.f2978e != null && ((g) mVar.f2978e).a()) {
            z = true;
        }
        if (!z) {
            com.bytedance.ies.dmt.ui.d.a.c(getContext(), (int) C0906R.string.bhp).a();
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3202a, false, 42740, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3202a, false, 42740, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (getUserVisibleHint() && isViewValid()) {
            super.a(z);
            this.f3206e.m();
            e(true);
            g(false);
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3202a, false, 42748, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3202a, false, 42748, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f3206e.a(z);
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3202a, false, 42741, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3202a, false, 42741, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.c(z);
        this.f3206e.o();
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3202a, false, 42744, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3202a, false, 42744, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        this.f3206e.f(z);
    }

    public final boolean d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3202a, false, 42742, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3202a, false, 42742, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!isViewValid()) {
            return false;
        } else {
            if (!NetworkUtils.isNetworkAvailable(getActivity())) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
                this.f3203b.setRefreshing(false);
                return false;
            } else if (this.f3205d.m()) {
                return false;
            } else {
                this.f3205d.a(z);
                this.f3205d.a(1, 2, 1);
                return true;
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3202a, false, 42739, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3202a, false, 42739, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f3206e.a(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f3202a, false, 42738, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3202a, false, 42738, new Class[0], Void.TYPE);
        } else {
            TextView textView = (TextView) LayoutInflater.from(getActivity()).inflate(C0906R.layout.aqm, null);
            textView.setText(C0906R.string.aas);
            textView.setPadding(0, (((int) (((float) UIUtils.getScreenHeight(getActivity())) - UIUtils.dip2Px(getActivity(), 83.0f))) * 3) / 8, 0, 0);
            this.mStatusView.setBuilder(DmtStatusView.a.a((Context) getActivity()).b((View) textView));
            this.mRefreshLayout.a(false, (int) UIUtils.dip2Px(getActivity(), 49.0f), (int) UIUtils.dip2Px(getActivity(), 113.0f));
            this.mRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46189a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f46189a, false, 42752, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f46189a, false, 42752, new Class[0], Void.TYPE);
                        return;
                    }
                    FeedTimeLineFragment.this.d(false);
                }
            });
            this.f3204c = getActivity().findViewById(C0906R.id.mt);
            this.f3206e.b("timeline_list");
            this.f3203b = new bk(this.mRefreshLayout);
        }
        this.f3206e.a((RecyclerView.OnScrollListener) new OnGradualScrollListener());
        this.f3206e.a((LoadMoreRecyclerViewAdapter.a) this);
        this.f3206e.j = this;
        this.f3205d = new com.ss.android.ugc.aweme.feed.h.m();
        this.f3205d.a(this.f3206e);
        this.f3205d.a(new ae(20));
        this.f3205d.a(1, 2, 0);
        this.m = -1;
        this.f3206e.a((RecyclerView.OnScrollListener) new RecyclerView.OnScrollListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46191a;

            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f46191a, false, 42753, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f46191a, false, 42753, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    AwemeAppData.p().ai = false;
                }
            }
        });
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3202a, false, 42737, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.qz, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3202a, false, 42737, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }

    public final void a(View view, Aweme aweme, String str) {
        View view2 = view;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{view2, aweme, str2}, this, f3202a, false, 42745, new Class[]{View.class, Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, aweme, str2}, this, f3202a, false, 42745, new Class[]{View.class, Aweme.class, String.class}, Void.TYPE);
            return;
        }
        if (aweme != null && getActivity() != null) {
            com.ss.android.ugc.aweme.feed.a.a().f44610c = (com.ss.android.ugc.aweme.common.f.a) this.f3205d.i();
            h a2 = h.a();
            FragmentActivity activity = getActivity();
            a2.a((Activity) activity, j.a("aweme://aweme/detail/" + aweme.getAid()).a("refer", str2).a("video_from", "from_time_line").a("profile_enterprise_type", aweme.getEnterpriseType()).a(), view2);
            com.ss.android.ugc.aweme.feed.b.b.a(aweme);
        }
    }
}
