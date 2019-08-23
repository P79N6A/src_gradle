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
import butterknife.BindView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.a;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.base.b;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.h.ae;
import com.ss.android.ugc.aweme.feed.h.g;
import com.ss.android.ugc.aweme.feed.listener.OnGradualScrollListener;
import com.ss.android.ugc.aweme.feed.listener.m;
import com.ss.android.ugc.aweme.feed.listener.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel;
import com.ss.android.ugc.aweme.main.c.c;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.common.component.fragment.b;
import org.greenrobot.eventbus.Subscribe;

public abstract class BaseCellFeedFragment extends FeedFragment implements d, LoadMoreRecyclerViewAdapter.a, m, n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3189a;

    /* renamed from: b  reason: collision with root package name */
    public View f3190b;

    /* renamed from: c  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.feed.h.m f3191c;

    /* renamed from: d  reason: collision with root package name */
    protected CellFeedFragmentPanel f3192d = a();
    @BindView(2131494326)
    ViewGroup mFlRootContanier;
    @BindView(2131496683)
    SwipeRefreshLayout mRefreshLayout;
    @BindView(2131497340)
    DmtStatusView mStatusView;

    public abstract CellFeedFragmentPanel a();

    public abstract int e();

    public abstract String f();

    public void i() {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public abstract int j();

    @NonNull
    public abstract String k();

    public abstract String l();

    @Subscribe
    public void onMainSwipeRefreshABChangedEvent(c cVar) {
    }

    public final void p() {
    }

    public final void I_() {
        if (PatchProxy.isSupport(new Object[0], this, f3189a, false, 42432, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3189a, false, 42432, new Class[0], Void.TYPE);
            return;
        }
        loadMore();
    }

    public g c() {
        if (!PatchProxy.isSupport(new Object[0], this, f3189a, false, 42421, new Class[0], g.class)) {
            return new ae(20);
        }
        return (g) PatchProxy.accessDispatch(new Object[0], this, f3189a, false, 42421, new Class[0], g.class);
    }

    public final boolean d() {
        if (!PatchProxy.isSupport(new Object[0], this, f3189a, false, 42430, new Class[0], Boolean.TYPE)) {
            return this.f3191c.d();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3189a, false, 42430, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public com.ss.android.ugc.aweme.feed.h.m g() {
        if (!PatchProxy.isSupport(new Object[0], this, f3189a, false, 42422, new Class[0], com.ss.android.ugc.aweme.feed.h.m.class)) {
            return new com.ss.android.ugc.aweme.feed.h.m();
        }
        return (com.ss.android.ugc.aweme.feed.h.m) PatchProxy.accessDispatch(new Object[0], this, f3189a, false, 42422, new Class[0], com.ss.android.ugc.aweme.feed.h.m.class);
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3189a, false, 42426, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3189a, false, 42426, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.f3191c != null) {
            this.f3191c.k();
        }
        this.f3192d.n();
    }

    @NonNull
    public SparseArray<b> registerComponents() {
        if (PatchProxy.isSupport(new Object[0], this, f3189a, false, 42417, new Class[0], SparseArray.class)) {
            return (SparseArray) PatchProxy.accessDispatch(new Object[0], this, f3189a, false, 42417, new Class[0], SparseArray.class);
        }
        SparseArray<b> registerComponents = super.registerComponents();
        registerComponents.append(b.a.f34652b, this.f3192d);
        return registerComponents;
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f3189a, false, 42429, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3189a, false, 42429, new Class[0], Void.TYPE);
            return;
        }
        this.f3191c.a(4, Integer.valueOf(this.o), 2, Integer.valueOf(j()));
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3189a, false, 42419, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3189a, false, 42419, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.ies.dmt.ui.widget.c cVar = new c.a(getActivity()).a(2130840142).b((int) C0906R.string.dmm).c(C0906R.string.dml).a(a.BORDER, C0906R.string.dms, new c(this)).f20493a;
        com.bytedance.ies.dmt.ui.widget.c cVar2 = new c.a(getActivity()).b((int) C0906R.string.bol).c(C0906R.string.bow).a(a.BORDER, C0906R.string.dms, new d(this)).f20493a;
        if (e() == 11) {
            this.mStatusView.setBuilder(DmtStatusView.a.a((Context) getActivity()).a(cVar2).b(cVar));
        } else {
            this.mStatusView.setBuilder(DmtStatusView.a.a((Context) getActivity()).a((int) C0906R.string.aas).b(cVar));
        }
        this.mStatusView.setUseScreenHeight(getContext().getResources().getDimensionPixelSize(C0906R.dimen.lj));
        this.mRefreshLayout.a(false, (int) UIUtils.dip2Px(getActivity(), 49.0f), (int) UIUtils.dip2Px(getActivity(), 113.0f));
        this.mRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46075a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f46075a, false, 42437, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f46075a, false, 42437, new Class[0], Void.TYPE);
                    return;
                }
                aa.f75006c = "refresh";
                BaseCellFeedFragment.this.d(false);
                BaseCellFeedFragment.this.i();
            }
        });
        this.f3190b = getActivity().findViewById(C0906R.id.mt);
    }

    public final void e(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3189a, false, 42433, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3189a, false, 42433, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.e(z);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3189a, false, 42423, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3189a, false, 42423, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (getUserVisibleHint() && isViewValid()) {
            super.a(z);
            this.f3192d.m();
            e(true);
            if (this.f3192d.j()) {
                d(false);
            }
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3189a, false, 42431, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3189a, false, 42431, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f3192d.a(z);
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3189a, false, 42424, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3189a, false, 42424, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.c(z);
        this.f3192d.o();
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3189a, false, 42427, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3189a, false, 42427, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        this.f3192d.f(z);
    }

    public boolean d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3189a, false, 42425, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3189a, false, 42425, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!isViewValid()) {
            return false;
        } else {
            if (!NetworkUtils.isNetworkAvailable(getActivity())) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
                this.mRefreshLayout.setRefreshing(false);
                return false;
            } else if (this.f3191c.m()) {
                return false;
            } else {
                this.f3191c.a(z);
                this.f3191c.a(1, Integer.valueOf(this.o), 1, Integer.valueOf(j()));
                return true;
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3189a, false, 42420, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3189a, false, 42420, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        b();
        this.f3192d.n = this.o + 0;
        this.f3192d.a(view, bundle);
        this.f3192d.a((RecyclerView.OnScrollListener) new OnGradualScrollListener());
        this.f3192d.a((LoadMoreRecyclerViewAdapter.a) this);
        this.f3192d.j = this;
        this.f3191c = g();
        this.f3191c.a(this.f3192d);
        this.f3191c.a((com.ss.android.ugc.aweme.common.f.d) this.f3192d);
        this.f3191c.a(c());
        this.f3191c.a(1, Integer.valueOf(this.o), 0, Integer.valueOf(j()));
        this.m = -1;
        this.f3192d.b(f());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3189a, false, 42418, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.qz, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3189a, false, 42418, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }

    public void a(View view, Aweme aweme, String str) {
        View view2 = view;
        Aweme aweme2 = aweme;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{view2, aweme2, str2}, this, f3189a, false, 42428, new Class[]{View.class, Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, aweme2, str2}, this, f3189a, false, 42428, new Class[]{View.class, Aweme.class, String.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            if (aweme2 != null && getActivity() != null) {
                com.ss.android.ugc.aweme.feed.a.a().f44610c = (com.ss.android.ugc.aweme.common.f.a) this.f3191c.i();
                h a2 = h.a();
                FragmentActivity activity = getActivity();
                a2.a((Activity) activity, j.a("aweme://aweme/detail/" + aweme.getAid()).a("refer", str2).a("video_from", k()).a("profile_enterprise_type", aweme.getEnterpriseType()).a("page_type", e()).a(), view2);
                com.ss.android.ugc.aweme.feed.b.b.a(aweme);
                r.onEvent(MobClick.obtain().setEventName("feed_enter").setLabelName(l()).setValue(aweme.getAid()).setJsonObject(com.ss.android.ugc.aweme.feed.a.a().b(aweme2, e())));
            }
        }
    }
}
