package com.ss.android.ugc.aweme.notification;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ad.splash.utils.NetworkUtils;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;
import com.ss.android.ugc.aweme.notification.adapter.NotificationAdapter;
import com.ss.android.ugc.aweme.notification.b.o;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.model.NoticeModel;
import com.ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import com.ss.android.ugc.aweme.notification.widget.RecyclerItemDecoration;
import java.util.List;

public class NotificationDetailFragment extends AmeBaseFragment implements SwipeRefreshLayout.OnRefreshListener, LoadMoreRecyclerViewAdapter.a, c<BaseNotice> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57832a;

    /* renamed from: b  reason: collision with root package name */
    public DmtStatusView f57833b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f57834c;

    /* renamed from: d  reason: collision with root package name */
    private int f57835d;

    /* renamed from: e  reason: collision with root package name */
    private int f57836e;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView f57837f;
    private SwipeRefreshLayout g;
    private NotificationAdapter h;
    private o i;
    private com.bytedance.ies.dmt.ui.widget.c j;

    public final void c(List<BaseNotice> list, boolean z) {
    }

    public final void d(Exception exc) {
    }

    public final void n_() {
    }

    public final void z_() {
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f57832a, false, 62879, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57832a, false, 62879, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.i != null) {
            this.i.k();
        }
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f57832a, false, 62876, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57832a, false, 62876, new Class[0], Void.TYPE);
            return;
        }
        this.h.showLoadMoreLoading();
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f57832a, false, 62872, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57832a, false, 62872, new Class[0], Void.TYPE);
            return;
        }
        this.i.a(4, Integer.valueOf(this.f57836e), null);
    }

    public void onRefresh() {
        if (PatchProxy.isSupport(new Object[0], this, f57832a, false, 62871, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57832a, false, 62871, new Class[0], Void.TYPE);
        } else if (NetworkUtils.b(getActivity())) {
            if (this.h.getItemCount() == 0) {
                this.f57833b.d();
            }
            this.i.a(1, Integer.valueOf(this.f57836e), null);
        } else {
            if (this.h.getItemCount() == 0) {
                a.a(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f57840a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f57840a, false, 62881, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f57840a, false, 62881, new Class[0], Void.TYPE);
                        } else if (NotificationDetailFragment.this.isViewValid()) {
                            NotificationDetailFragment.this.f57833b.f();
                            com.bytedance.ies.dmt.ui.d.a.b((Context) NotificationDetailFragment.this.getActivity(), (int) C0906R.string.bgf).a();
                        }
                    }
                }, 100);
            }
        }
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f57832a, false, 62874, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57832a, false, 62874, new Class[0], Void.TYPE);
            return;
        }
        if (this.h.mShowFooter) {
            this.h.setShowFooter(false);
            this.h.notifyDataSetChanged();
            this.h.showLoadMoreEmpty();
        }
        this.g.setRefreshing(false);
        if (this.h.getItemCount() == 0) {
            this.f57833b.e();
        }
    }

    public final void c(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f57832a, false, 62877, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f57832a, false, 62877, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.h.showPullUpLoadMore();
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f57832a, false, 62873, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f57832a, false, 62873, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.h.mShowFooter) {
            this.h.setShowFooter(false);
            this.h.notifyDataSetChanged();
        }
        this.g.setRefreshing(false);
        if (this.h.getItemCount() == 0) {
            this.f57833b.f();
        }
    }

    public final void a(List<BaseNotice> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f57832a, false, 62875, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f57832a, false, 62875, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.h.setShowFooter(true);
        if (this.f57834c) {
            this.h.a();
        }
        this.f57834c = true;
        if (!z) {
            this.h.showLoadMoreEmpty();
        } else {
            this.h.resetLoadMoreState();
        }
        this.g.setRefreshing(false);
        this.h.setData(list);
        this.f57833b.b();
    }

    public final void b(List<BaseNotice> list, boolean z) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f57832a, false, 62878, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f57832a, false, 62878, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (list != null && !list.isEmpty()) {
            z2 = z;
        }
        if (!z2) {
            this.h.showLoadMoreEmpty();
        } else {
            this.h.resetLoadMoreState();
        }
        this.h.setDataAfterLoadMore(list);
    }

    public void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f57832a, false, 62866, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f57832a, false, 62866, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f57835d = getArguments().getInt("from_where", -1);
        if (PatchProxy.isSupport(new Object[]{view2}, this, f57832a, false, 62869, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f57832a, false, 62869, new Class[]{View.class}, Void.TYPE);
        } else {
            this.f57833b = (DmtStatusView) view2.findViewById(C0906R.id.cvd);
            if (PatchProxy.isSupport(new Object[0], this, f57832a, false, 62870, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f57832a, false, 62870, new Class[0], Void.TYPE);
            } else {
                this.j = new c.a(getActivity()).b((int) C0906R.string.b5r).b("").f20493a;
                this.f57833b.setBuilder(DmtStatusView.a.a((Context) getActivity()).a().a(this.j).a(2130840142, C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f57838a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f57838a, false, 62880, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f57838a, false, 62880, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        NotificationDetailFragment.this.onRefresh();
                    }
                }));
            }
            this.g = (SwipeRefreshLayout) view2.findViewById(C0906R.id.btv);
            this.f57837f = (RecyclerView) view2.findViewById(C0906R.id.bti);
            this.h = new NotificationAdapter(this.f57835d, getActivity(), 0, "message");
            this.i = new o();
            RecyclerItemDecoration recyclerItemDecoration = new RecyclerItemDecoration(1, (int) UIUtils.dip2Px(getActivity(), 1.0f), 0);
            this.f57837f.setLayoutManager(new FixedLinearlayoutManager(getActivity()));
            this.f57837f.addItemDecoration(recyclerItemDecoration);
        }
        if (PatchProxy.isSupport(new Object[0], this, f57832a, false, 62868, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57832a, false, 62868, new Class[0], Void.TYPE);
        } else {
            this.g.setOnRefreshListener(this);
            this.f57837f.addOnScrollListener(new FrescoRecycleViewScrollListener(getActivity()));
            this.i.a(new NoticeModel());
            this.i.a(this);
            this.h.setLoadMoreListener(this);
            this.h.setShowFooter(true);
            this.h.showLoadMoreEmpty();
            this.f57837f.setAdapter(this.h);
            this.f57833b.d();
        }
        if (PatchProxy.isSupport(new Object[0], this, f57832a, false, 62867, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57832a, false, 62867, new Class[0], Void.TYPE);
            return;
        }
        this.f57836e = 17;
        onRefresh();
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f57832a, false, 62865, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.p4, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f57832a, false, 62865, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
