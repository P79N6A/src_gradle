package com.ss.android.ugc.aweme.poi.nearby.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ad.splash.utils.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSlideBaseActivity;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.poi.PoiClassFilterOptionStruct;
import com.ss.android.ugc.aweme.feed.model.poi.PoiFilterOptionResponse;
import com.ss.android.ugc.aweme.feed.model.poi.PoiOptionStruct;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.ss.android.ugc.aweme.poi.model.ab;
import com.ss.android.ugc.aweme.poi.model.au;
import com.ss.android.ugc.aweme.poi.model.l;
import com.ss.android.ugc.aweme.poi.nearby.adapter.PoiFilterAdapter;
import com.ss.android.ugc.aweme.poi.nearby.adapter.PoiFilterDetailAdapter;
import com.ss.android.ugc.aweme.poi.nearby.adapter.PoiTypeDetailAdapter;
import com.ss.android.ugc.aweme.poi.nearby.b.d;
import com.ss.android.ugc.aweme.poi.nearby.b.o;
import com.ss.android.ugc.aweme.poi.nearby.widget.a;
import com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PoiTypeFilterDetailActivity extends AmeSlideBaseActivity implements SwipeRefreshLayout.OnRefreshListener, LoadMoreRecyclerViewAdapter.a, c<SimplePoiInfoStruct>, PoiFilterAdapter.a, PoiFilterDetailAdapter.a, PoiTypeDetailAdapter.a, d {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f60075b;
    private int A;
    private String B;
    private String C;
    private int D;
    private int E;
    private String F = "";
    private String G = "";
    private String H = "";
    private String I = "";
    private long J;
    private String K = "";
    private String L = "";
    private boolean M;
    private boolean N;
    private long O;
    private long P;
    private long Q;
    private long R;
    private String S;
    private boolean T;

    /* renamed from: c  reason: collision with root package name */
    PoiFilterAdapter f60076c;

    /* renamed from: d  reason: collision with root package name */
    private PoiTypeDetailAdapter f60077d;

    /* renamed from: e  reason: collision with root package name */
    private a f60078e;

    /* renamed from: f  reason: collision with root package name */
    private com.ss.android.ugc.aweme.poi.nearby.b.c f60079f;
    private o g;
    @BindView(2131496280)
    RecyclerView mPoiFilterRecycler;
    @BindView(2131496368)
    RecyclerView mPoiTypeDetailRecycler;
    @BindView(2131497328)
    View mStatusBarView;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    @BindView(2131497415)
    SwipeRefreshLayout mSwipeRefreshLayout;
    @BindView(2131497604)
    TextTitleBar mTitleBar;
    private List<PoiClassFilterOptionStruct> u;
    private List<PoiOptionStruct> v;
    private List<SimplePoiInfoStruct> w;
    private boolean x;
    private boolean y = true;
    private String z;

    public final int a() {
        return C0906R.layout.d2;
    }

    public final void c(List<SimplePoiInfoStruct> list, boolean z2) {
    }

    public final void d(Exception exc) {
    }

    public final void n_() {
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f60075b, false, 65351, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f60075b, false, 65351, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.nearby.ui.PoiTypeFilterDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.nearby.ui.PoiTypeFilterDetailActivity", "onCreate", false);
    }

    public void onWindowFocusChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f60075b, false, 65352, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f60075b, false, 65352, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.nearby.ui.PoiTypeFilterDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    public final void z_() {
    }

    public final void a(List<SimplePoiInfoStruct> list, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f60075b, false, 65341, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z2)}, this, f60075b, false, 65341, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.R = System.currentTimeMillis();
        this.N = true;
        this.S = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        this.w = list;
        this.x = z2;
        h();
        i();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f60075b, false, 65348, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60075b, false, 65348, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.f60079f != null) {
            this.f60079f.k();
        }
        if (this.g != null) {
            this.g.k();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f60075b, false, 65330, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60075b, false, 65330, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.nearby.ui.PoiTypeFilterDetailActivity", "onResume", true);
        super.onResume();
        this.J = System.currentTimeMillis();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.nearby.ui.PoiTypeFilterDetailActivity", "onResume", false);
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f60075b, false, 65342, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60075b, false, 65342, new Class[0], Void.TYPE);
            return;
        }
        this.f60077d.showLoadMoreLoading();
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f60075b, false, 65350, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60075b, false, 65350, new Class[0], Void.TYPE);
            return;
        }
        super.setStatusBarColor();
        StatusBarUtils.setTransparent(this);
    }

    private void i() {
        long j;
        long j2;
        if (PatchProxy.isSupport(new Object[0], this, f60075b, false, 65346, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60075b, false, 65346, new Class[0], Void.TYPE);
        } else if (!this.T && this.M && this.N) {
            this.T = true;
            if (!TextUtils.isEmpty(this.z) || this.O <= 0) {
                j = 0;
            } else {
                j = this.P - this.O;
            }
            if (this.Q > 0) {
                j2 = this.R - this.Q;
            } else {
                j2 = 0;
            }
            if (j2 <= j) {
                j2 = j;
            }
            com.ss.android.ugc.aweme.poi.e.o.a("poi_filter", j2, this.S);
        }
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f60075b, false, 65333, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60075b, false, 65333, new Class[0], Void.TYPE);
            return;
        }
        this.g.a(4, 20, this.G, this.H, this.I, this.F, Integer.valueOf(this.D), this.z, Integer.valueOf(this.A));
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f60075b, false, 65349, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60075b, false, 65349, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        r.a("stay_time", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "recommend_city_poi").a("enter_method", this.L).a("poi_channel", aa.b()).a("city_info", aa.a()).a("duration", System.currentTimeMillis() - this.J).f34114b);
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f60075b, false, 65345, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60075b, false, 65345, new Class[0], Void.TYPE);
        } else if (this.u != null && this.w != null) {
            if (this.y) {
                for (PoiClassFilterOptionStruct next : this.u) {
                    if (!CollectionUtils.isEmpty(next.optionStructList)) {
                        next.optionStructList.get(0).setSelected(true);
                    }
                }
            }
            this.y = false;
            this.f60076c.a(this.u);
            this.f60077d.setShowFooter(true);
            if (!this.x) {
                this.f60077d.showLoadMoreEmpty();
            } else {
                this.f60077d.resetLoadMoreState();
            }
            this.mSwipeRefreshLayout.setRefreshing(false);
            this.f60077d.setData(this.w);
            this.mStatusView.b();
            this.mPoiTypeDetailRecycler.scrollToPosition(0);
        }
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f60075b, false, 65340, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60075b, false, 65340, new Class[0], Void.TYPE);
            return;
        }
        this.R = System.currentTimeMillis();
        this.N = true;
        this.S = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        this.y = false;
        if (this.f60077d.mShowFooter) {
            this.f60077d.setShowFooter(false);
            this.f60077d.notifyDataSetChanged();
            this.f60077d.showLoadMoreEmpty();
        }
        this.mSwipeRefreshLayout.setRefreshing(false);
        this.f60077d.clearData();
        this.mStatusView.e();
        i();
        if (PatchProxy.isSupport(new Object[0], this, f60075b, false, 65347, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60075b, false, 65347, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.d.c a2 = com.ss.android.ugc.aweme.app.d.c.a();
        a2.a("citycode", aa.a());
        a2.a("classcode", this.I);
        a2.a("businessarea", this.G);
        a2.a("sorttype,", this.H);
        a2.a("poichannel", aa.f75005b);
        com.ss.android.ugc.aweme.poi.e.o.a("poi_empty_filter", a2.b());
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f60075b, false, 65331, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60075b, false, 65331, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        Intent intent = getIntent();
        if (intent != null) {
            if (intent.hasExtra("id")) {
                this.z = intent.getStringExtra("id");
            }
            if (intent.hasExtra("recommend_type")) {
                this.A = intent.getIntExtra("recommend_type", 0);
            }
            if (intent.hasExtra("recommend_title")) {
                this.B = intent.getStringExtra("recommend_title");
            }
            if (intent.hasExtra("content_type")) {
                this.C = intent.getStringExtra("content_type");
            }
            if (intent.hasExtra("poi_class_code")) {
                this.D = intent.getIntExtra("poi_class_code", 0);
            }
            if (intent.hasExtra("enter_from")) {
                this.K = intent.getStringExtra("enter_from");
            }
            if (intent.hasExtra("enter_method")) {
                this.L = intent.getStringExtra("enter_method");
            }
        }
        if (!TextUtils.isEmpty(this.B)) {
            this.mTitleBar.setTitle((CharSequence) this.B);
        }
        this.mTitleBar.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60080a;

            public final void b(View view) {
            }

            public final void a(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f60080a, false, 65356, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f60080a, false, 65356, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                PoiTypeFilterDetailActivity.this.finish();
            }
        });
        if (Build.VERSION.SDK_INT >= 19) {
            this.mStatusBarView.getLayoutParams().height = StatusBarUtils.getStatusBarHeight(this);
        }
        this.mSwipeRefreshLayout.setOnRefreshListener(this);
        this.mPoiFilterRecycler.setLayoutManager(new WrapLinearLayoutManager(this, 0, false));
        this.f60076c = new PoiFilterAdapter(this);
        this.mPoiFilterRecycler.setAdapter(this.f60076c);
        this.mPoiTypeDetailRecycler.setLayoutManager(new WrapLinearLayoutManager(this, 1, false));
        this.f60077d = new PoiTypeDetailAdapter(this, true);
        this.f60077d.setLoadMoreListener(this);
        this.mPoiTypeDetailRecycler.setAdapter(this.f60077d);
        this.f60079f = new com.ss.android.ugc.aweme.poi.nearby.b.c();
        this.f60079f.a(new ab());
        this.f60079f.a(this);
        this.g = new o();
        this.g.a(new au());
        this.g.a(this);
        this.mStatusView.setBuilder(DmtStatusView.a.a((Context) this).a().a(new c.a(this).b((int) C0906R.string.bol).c(C0906R.string.bow).a(com.bytedance.ies.dmt.ui.widget.a.BORDER, C0906R.string.dms, new f(this)).f20493a).a(2130840142, C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new g(this)));
        this.F = com.ss.android.ugc.aweme.feed.c.a();
        if (TextUtils.isEmpty(this.F)) {
            this.F = com.ss.android.ugc.aweme.feed.c.d();
        }
        onRefresh();
    }

    public void onRefresh() {
        if (PatchProxy.isSupport(new Object[0], this, f60075b, false, 65332, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60075b, false, 65332, new Class[0], Void.TYPE);
        } else if (!NetworkUtils.b(this)) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bgf).a();
            if (this.f60077d.getItemCount() == 0) {
                this.mStatusView.f();
            }
            this.mSwipeRefreshLayout.setRefreshing(false);
        } else {
            if (this.f60077d == null || this.f60077d.getItemCount() != 0 || this.mStatusView == null) {
                this.mSwipeRefreshLayout.setRefreshing(true);
            } else {
                this.mStatusView.d();
            }
            if (this.u == null) {
                if (TextUtils.isEmpty(this.z)) {
                    this.f60079f.a(this.F, Integer.valueOf(this.D));
                    this.O = System.currentTimeMillis();
                } else {
                    this.u = new ArrayList();
                    this.M = true;
                    this.S = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                    this.mPoiFilterRecycler.setVisibility(8);
                }
            }
            o oVar = this.g;
            if (PatchProxy.isSupport(new Object[0], oVar, o.f60034a, false, 65251, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], oVar, o.f60034a, false, 65251, new Class[0], Void.TYPE);
            } else {
                ((au) oVar.f2978e).mIsLoading = false;
            }
            this.g.a(1, 20, this.G, this.H, this.I, this.F, Integer.valueOf(this.D), this.z, Integer.valueOf(this.A));
            this.Q = System.currentTimeMillis();
        }
    }

    public final void c(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f60075b, false, 65343, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f60075b, false, 65343, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.f60077d.showLoadMoreError();
    }

    public final void a(PoiFilterOptionResponse poiFilterOptionResponse) {
        if (PatchProxy.isSupport(new Object[]{poiFilterOptionResponse}, this, f60075b, false, 65337, new Class[]{PoiFilterOptionResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiFilterOptionResponse}, this, f60075b, false, 65337, new Class[]{PoiFilterOptionResponse.class}, Void.TYPE);
            return;
        }
        this.P = System.currentTimeMillis();
        this.M = true;
        this.S = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        if (poiFilterOptionResponse != null && poiFilterOptionResponse.poiFilterOptionStruct != null) {
            this.mTitleBar.setTitle((CharSequence) poiFilterOptionResponse.poiFilterOptionStruct.title);
            this.u = poiFilterOptionResponse.poiFilterOptionStruct.filterOptionStructList;
            h();
            i();
        }
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f60075b, false, 65339, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f60075b, false, 65339, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.R = System.currentTimeMillis();
        this.N = true;
        this.S = PushConstants.PUSH_TYPE_NOTIFY;
        this.y = false;
        if (this.f60077d.mShowFooter) {
            this.f60077d.setShowFooter(false);
            this.f60077d.notifyDataSetChanged();
        }
        this.mSwipeRefreshLayout.setRefreshing(false);
        this.mStatusView.f();
        i();
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f60075b, false, 65338, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f60075b, false, 65338, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.P = System.currentTimeMillis();
        this.M = true;
        this.S = PushConstants.PUSH_TYPE_NOTIFY;
        if (this.mStatusView != null) {
            this.mStatusView.f();
        }
        i();
    }

    public final void a(int i, PoiOptionStruct poiOptionStruct) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), poiOptionStruct}, this, f60075b, false, 65335, new Class[]{Integer.TYPE, PoiOptionStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), poiOptionStruct}, this, f60075b, false, 65335, new Class[]{Integer.TYPE, PoiOptionStruct.class}, Void.TYPE);
            return;
        }
        if (this.f60078e != null) {
            this.f60078e.dismiss();
        }
        if (!NetworkUtils.b(this)) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bgf).a();
            return;
        }
        if (i == 0) {
            this.u.get(this.E).subTitle = "";
        } else {
            this.u.get(this.E).subTitle = poiOptionStruct.getName();
        }
        for (PoiOptionStruct next : this.v) {
            if (next.getCode() == poiOptionStruct.getCode()) {
                next.setSelected(true);
            } else {
                next.setSelected(false);
            }
        }
        int size = this.u.size();
        if (size == 3) {
            if (this.E == 0) {
                this.G = String.valueOf(poiOptionStruct.getCode());
            } else if (this.E == 1) {
                this.H = String.valueOf(poiOptionStruct.getCode());
            } else {
                this.I = String.valueOf(poiOptionStruct.getCode());
            }
        } else if (size == 2) {
            if (this.E == 0) {
                this.H = String.valueOf(poiOptionStruct.getCode());
            } else {
                this.I = String.valueOf(poiOptionStruct.getCode());
            }
        }
        onRefresh();
    }

    public final void b(List<SimplePoiInfoStruct> list, boolean z2) {
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f60075b, false, 65344, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z2)}, this, f60075b, false, 65344, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (list != null && !list.isEmpty()) {
            z3 = z2;
        }
        if (!z3) {
            this.f60077d.showLoadMoreEmpty();
        } else {
            this.f60077d.resetLoadMoreState();
        }
        this.f60077d.setDataAfterLoadMore(list);
    }

    public final void a(PoiClassFilterOptionStruct poiClassFilterOptionStruct, int i) {
        if (PatchProxy.isSupport(new Object[]{poiClassFilterOptionStruct, Integer.valueOf(i)}, this, f60075b, false, 65334, new Class[]{PoiClassFilterOptionStruct.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiClassFilterOptionStruct, Integer.valueOf(i)}, this, f60075b, false, 65334, new Class[]{PoiClassFilterOptionStruct.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.E = i;
        if (this.f60078e == null) {
            this.f60078e = new a(this, this);
            this.f60078e.setOnDismissListener(new h(this));
        }
        this.v = this.u.get(i).optionStructList;
        if (this.v != null && this.v.size() != 0) {
            this.f60078e.a(this.v);
            this.f60078e.showAsDropDown(this.mPoiFilterRecycler, 0, 1);
            String str = "";
            int size = this.u.size();
            if (size == 3) {
                str = i == 0 ? "shopping_district" : i == 1 ? "smart_sorting" : "poi_type";
            } else if (size == 2) {
                if (i == 0) {
                    str = "smart_sorting";
                } else if (i == 1) {
                    str = "poi_type";
                }
            }
            r.a("click_filtered_poi_sorting", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_method", str).a("poi_channel", this.D).a("enter_from", this.K).a("city_info", aa.a()).f34114b);
        }
    }

    public final void a(SimplePoiInfoStruct simplePoiInfoStruct, String str) {
        if (PatchProxy.isSupport(new Object[]{simplePoiInfoStruct, str}, this, f60075b, false, 65336, new Class[]{SimplePoiInfoStruct.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{simplePoiInfoStruct, str}, this, f60075b, false, 65336, new Class[]{SimplePoiInfoStruct.class, String.class}, Void.TYPE);
            return;
        }
        PoiDetailActivity.a(this, new l.a().c(simplePoiInfoStruct.poiId).g(simplePoiInfoStruct.poiName).a(simplePoiInfoStruct).i("recommend_city_poi").l(this.L).m(String.valueOf(this.D)).o(str).s(this.C).a());
    }
}
