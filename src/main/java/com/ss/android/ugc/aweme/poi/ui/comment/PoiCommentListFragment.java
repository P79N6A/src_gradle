package com.ss.android.ugc.aweme.poi.ui.comment;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.a;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.poi.adapter.PoiAwemeFeedAdapter;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.model.q;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;

public class PoiCommentListFragment extends AbsPoiCommentFragment {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f60568d;

    /* renamed from: e  reason: collision with root package name */
    protected PoiCommentVH f60569e;

    /* renamed from: f  reason: collision with root package name */
    protected b f60570f;
    private q g;
    private int h;
    @BindView(2131497340)
    DmtStatusView mStatusView;

    public final String a() {
        return "poi_comment";
    }

    /* renamed from: b */
    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f60568d, false, 66271, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60568d, false, 66271, new Class[0], Void.TYPE);
        } else if (!NetworkUtils.isNetworkAvailable(getContext())) {
            if (!this.f60569e.f60599f) {
                this.mStatusView.f();
            }
        } else {
            this.f60569e.b();
        }
    }

    @OnClick({2131493213})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60568d, false, 66272, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60568d, false, 66272, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view.getId() == C0906R.id.ix) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f60568d, false, 66270, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f60568d, false, 66270, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (PatchProxy.isSupport(new Object[]{arguments}, this, f60568d, false, 66268, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arguments}, this, f60568d, false, 66268, new Class[]{Bundle.class}, Void.TYPE);
        } else if (arguments != null) {
            this.f60546c = (c) arguments.getSerializable("EXTRA_POI_BUNDLE");
            this.h = arguments.getInt("EXTRA_COMMENT_POSITION");
        }
        com.bytedance.ies.dmt.ui.widget.c cVar = new c.a(getActivity()).a(2130840142).b((int) C0906R.string.dmm).c(C0906R.string.dml).a(a.BORDER, C0906R.string.dms, new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60571a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f60571a, false, 66274, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f60571a, false, 66274, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                PoiCommentListFragment.this.c();
            }
        }).f20493a;
        this.mStatusView.setBuilder(DmtStatusView.a.a(getContext()).b(cVar).a(new c.a(getActivity()).b((int) C0906R.string.b5r).c(C0906R.string.b6y).a(a.BORDER, C0906R.string.dms, new a(this)).f20493a));
        this.f60569e = new PoiCommentVH(this.h);
        this.f60570f = new b(this);
        this.f60570f.a(this.f60569e);
        PoiCommentVH poiCommentVH = this.f60569e;
        com.ss.android.ugc.aweme.poi.c cVar2 = this.f60546c;
        if (PatchProxy.isSupport(new Object[]{cVar2}, poiCommentVH, PoiCommentVH.f60594a, false, 66293, new Class[]{com.ss.android.ugc.aweme.poi.c.class}, Void.TYPE)) {
            PoiCommentVH poiCommentVH2 = poiCommentVH;
            PatchProxy.accessDispatch(new Object[]{cVar2}, poiCommentVH2, PoiCommentVH.f60594a, false, 66293, new Class[]{com.ss.android.ugc.aweme.poi.c.class}, Void.TYPE);
        } else {
            poiCommentVH.i = cVar2;
            poiCommentVH.h = cVar2.getPoiId();
        }
        PoiCommentVH poiCommentVH3 = this.f60569e;
        b bVar = this.f60570f;
        if (PatchProxy.isSupport(new Object[]{this, view2, bVar}, poiCommentVH3, PoiCommentVH.f60594a, false, 66294, new Class[]{PoiCommentListFragment.class, View.class, b.class}, Void.TYPE)) {
            PoiCommentVH poiCommentVH4 = poiCommentVH3;
            PatchProxy.accessDispatch(new Object[]{this, view2, bVar}, poiCommentVH4, PoiCommentVH.f60594a, false, 66294, new Class[]{PoiCommentListFragment.class, View.class, b.class}, Void.TYPE);
        } else {
            poiCommentVH3.f60596c = this;
            poiCommentVH3.f60598e = bVar;
            ButterKnife.bind((Object) poiCommentVH3, view2);
            poiCommentVH3.f60595b = new WrapLinearLayoutManager(poiCommentVH3.f60596c.getContext());
            poiCommentVH3.f60595b.setOrientation(1);
            poiCommentVH3.mRecyclerView.setLayoutManager(poiCommentVH3.f60595b);
            if (PatchProxy.isSupport(new Object[0], poiCommentVH3, PoiCommentVH.f60594a, false, 66295, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], poiCommentVH3, PoiCommentVH.f60594a, false, 66295, new Class[0], Void.TYPE);
            } else {
                poiCommentVH3.f60597d = new PoiAwemeFeedAdapter(poiCommentVH3.mRecyclerView, null, null);
                poiCommentVH3.f60597d.h = poiCommentVH3.i;
                poiCommentVH3.f60597d.B = 9;
                poiCommentVH3.f60597d.z = poiCommentVH3.f60596c;
                poiCommentVH3.f60597d.r = new com.ss.android.ugc.aweme.forward.a.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f60603a;

                    public final Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f60603a, false, 66310, new Class[0], Object.class)) {
                            return null;
                        }
                        return PatchProxy.accessDispatch(new Object[0], this, f60603a, false, 66310, new Class[0], Object.class);
                    }

                    public final String e() {
                        return "key_container_poi";
                    }

                    public final boolean b() {
                        boolean z = false;
                        if (PatchProxy.isSupport(new Object[0], this, f60603a, false, 66307, new Class[0], Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f60603a, false, 66307, new Class[0], Boolean.TYPE)).booleanValue();
                        }
                        if (PoiCommentVH.this.f60596c != null && PoiCommentVH.this.f60596c.isViewValid()) {
                            z = true;
                        }
                        return z;
                    }

                    public final Context d() {
                        if (PatchProxy.isSupport(new Object[0], this, f60603a, false, 66309, new Class[0], Context.class)) {
                            return (Context) PatchProxy.accessDispatch(new Object[0], this, f60603a, false, 66309, new Class[0], Context.class);
                        } else if (PoiCommentVH.this.f60596c != null) {
                            return PoiCommentVH.this.f60596c.getActivity();
                        } else {
                            return PoiCommentVH.this.mRecyclerView.getContext();
                        }
                    }

                    public final boolean c() {
                        boolean z = false;
                        if (PatchProxy.isSupport(new Object[0], this, f60603a, false, 66308, new Class[0], Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f60603a, false, 66308, new Class[0], Boolean.TYPE)).booleanValue();
                        }
                        if (PoiCommentVH.this.f60596c != null && PoiCommentVH.this.f60596c.getLifecycle().getCurrentState().equals(Lifecycle.State.RESUMED)) {
                            z = true;
                        }
                        return z;
                    }
                };
                poiCommentVH3.f60597d.setLoadMoreListener(poiCommentVH3);
            }
            poiCommentVH3.mRecyclerView.setAdapter(poiCommentVH3.f60597d);
            poiCommentVH3.mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f60600a;

                /* renamed from: b  reason: collision with root package name */
                boolean f60601b;

                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f60600a, false, 66305, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f60600a, false, 66305, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    if (this.f60601b && PoiCommentVH.this.f60595b.findLastVisibleItemPosition() >= PoiCommentVH.this.f60595b.getItemCount() - 5) {
                        PoiCommentVH.this.loadMore();
                    }
                }

                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    boolean z = false;
                    if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f60600a, false, 66306, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f60600a, false, 66306, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    super.onScrolled(recyclerView, i, i2);
                    if (i2 > 0) {
                        z = true;
                    }
                    this.f60601b = z;
                }
            });
        }
        this.g = new q();
        this.f60570f.a(this.g);
        c();
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f60568d, false, 66269, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.pi, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f60568d, false, 66269, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
