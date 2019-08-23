package com.ss.android.ugc.aweme.poi.nearby.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.ss.android.ugc.aweme.poi.model.l;
import com.ss.android.ugc.aweme.poi.model.v;
import com.ss.android.ugc.aweme.poi.nearby.adapter.PoiTypeDetailAdapter;
import com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\nH\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0014J \u0010\u0015\u001a\u00020\u00122\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J \u0010\u001a\u001a\u00020\u00122\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001c\u0010\u001b\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u001e\u001a\u00020\u0012H\u0002J \u0010\u001f\u001a\u00020\u00122\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010 \u001a\u00020\u0012H\u0014J\b\u0010!\u001a\u00020\u0012H\u0016J\u0018\u0010\"\u001a\u00020\u00122\u000e\u0010#\u001a\n\u0018\u00010$j\u0004\u0018\u0001`%H\u0016J\u0018\u0010&\u001a\u00020\u00122\u000e\u0010#\u001a\n\u0018\u00010$j\u0004\u0018\u0001`%H\u0016J\b\u0010'\u001a\u00020\u0012H\u0016J\u0018\u0010(\u001a\u00020\u00122\u000e\u0010#\u001a\n\u0018\u00010$j\u0004\u0018\u0001`%H\u0016J\b\u0010)\u001a\u00020\u0012H\u0016J\b\u0010*\u001a\u00020\u0012H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/nearby/ui/PoiCouponScopeActivity;", "Lcom/ss/android/ugc/aweme/base/activity/AmeBaseActivity;", "Lcom/ss/android/ugc/aweme/poi/nearby/adapter/PoiTypeDetailAdapter$OnPoiTypeDetailItemClickListener;", "Lcom/ss/android/ugc/aweme/common/adapter/LoadMoreRecyclerViewAdapter$ILoadMore;", "Lcom/ss/android/ugc/aweme/common/presenter/IBaseListView;", "Lcom/ss/android/ugc/aweme/feed/model/poi/SimplePoiInfoStruct;", "()V", "codeId", "", "couponId", "", "Ljava/lang/Integer;", "mAdapter", "Lcom/ss/android/ugc/aweme/poi/nearby/adapter/PoiTypeDetailAdapter;", "mPresenter", "Lcom/ss/android/ugc/aweme/poi/presenter/PoiCouponScopePresenter;", "getLayout", "init", "", "loadMore", "onDestroy", "onLoadLatestResult", "list", "", "hasMore", "", "onLoadMoreResult", "onPoiTypeDetailItemClick", "simplePoiInfoStruct", "isCoupon", "onRefresh", "onRefreshResult", "setStatusBarColor", "showLoadEmpty", "showLoadError", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "showLoadLatestError", "showLoadLatestLoading", "showLoadMoreError", "showLoadMoreLoading", "showLoading", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PoiCouponScopeActivity extends AmeBaseActivity implements LoadMoreRecyclerViewAdapter.a, com.ss.android.ugc.aweme.common.f.c<SimplePoiInfoStruct>, PoiTypeDetailAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60038a;

    /* renamed from: b  reason: collision with root package name */
    private Integer f60039b = 0;

    /* renamed from: c  reason: collision with root package name */
    private String f60040c = "";

    /* renamed from: d  reason: collision with root package name */
    private PoiTypeDetailAdapter f60041d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.poi.d.a f60042e;

    /* renamed from: f  reason: collision with root package name */
    private HashMap f60043f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/poi/nearby/ui/PoiCouponScopeActivity$init$1", "Lcom/bytedance/ies/dmt/ui/titlebar/listener/OnTitleBarClickListener;", "onBackClick", "", "view", "Landroid/view/View;", "onEndBtnClick", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60044a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PoiCouponScopeActivity f60045b;

        public final void b(@Nullable View view) {
        }

        a(PoiCouponScopeActivity poiCouponScopeActivity) {
            this.f60045b = poiCouponScopeActivity;
        }

        public final void a(@Nullable View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f60044a, false, 65273, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f60044a, false, 65273, new Class[]{View.class}, Void.TYPE);
                return;
            }
            this.f60045b.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60046a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PoiCouponScopeActivity f60047b;

        b(PoiCouponScopeActivity poiCouponScopeActivity) {
            this.f60047b = poiCouponScopeActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f60046a, false, 65274, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f60046a, false, 65274, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f60047b.h();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60048a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PoiCouponScopeActivity f60049b;

        c(PoiCouponScopeActivity poiCouponScopeActivity) {
            this.f60049b = poiCouponScopeActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f60048a, false, 65275, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f60048a, false, 65275, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f60049b.h();
        }
    }

    private View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60038a, false, 65268, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60038a, false, 65268, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f60043f == null) {
            this.f60043f = new HashMap();
        }
        View view = (View) this.f60043f.get(Integer.valueOf(i));
        if (view == null) {
            view = findViewById(i);
            this.f60043f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final int a() {
        return C0906R.layout.d1;
    }

    public final void c(@Nullable List<SimplePoiInfoStruct> list, boolean z) {
    }

    public final void d(@Nullable Exception exc) {
    }

    public final void n_() {
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f60038a, false, 65270, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f60038a, false, 65270, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.nearby.ui.PoiCouponScopeActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.nearby.ui.PoiCouponScopeActivity", "onCreate", false);
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f60038a, false, 65271, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60038a, false, 65271, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.nearby.ui.PoiCouponScopeActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.nearby.ui.PoiCouponScopeActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f60038a, false, 65272, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f60038a, false, 65272, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.nearby.ui.PoiCouponScopeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void z_() {
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f60038a, false, 65258, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60038a, false, 65258, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.poi.d.a aVar = this.f60042e;
        if (aVar != null) {
            aVar.k();
        }
        super.onDestroy();
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f60038a, false, 65262, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60038a, false, 65262, new Class[0], Void.TYPE);
            return;
        }
        PoiTypeDetailAdapter poiTypeDetailAdapter = this.f60041d;
        if (poiTypeDetailAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        poiTypeDetailAdapter.showLoadMoreLoading();
    }

    public final void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f60038a, false, 65257, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60038a, false, 65257, new Class[0], Void.TYPE);
            return;
        }
        super.setStatusBarColor();
        StatusBarUtils.setTransparent(this);
    }

    public final void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f60038a, false, 65261, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60038a, false, 65261, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.poi.d.a aVar = this.f60042e;
        if (aVar != null) {
            aVar.a(4, this.f60039b, this.f60040c);
        }
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f60038a, false, 65263, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60038a, false, 65263, new Class[0], Void.TYPE);
            return;
        }
        PoiTypeDetailAdapter poiTypeDetailAdapter = this.f60041d;
        if (poiTypeDetailAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        if (poiTypeDetailAdapter.mShowFooter) {
            PoiTypeDetailAdapter poiTypeDetailAdapter2 = this.f60041d;
            if (poiTypeDetailAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            poiTypeDetailAdapter2.setShowFooter(false);
            PoiTypeDetailAdapter poiTypeDetailAdapter3 = this.f60041d;
            if (poiTypeDetailAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            poiTypeDetailAdapter3.notifyDataSetChanged();
            PoiTypeDetailAdapter poiTypeDetailAdapter4 = this.f60041d;
            if (poiTypeDetailAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            poiTypeDetailAdapter4.showLoadMoreEmpty();
        }
        PoiTypeDetailAdapter poiTypeDetailAdapter5 = this.f60041d;
        if (poiTypeDetailAdapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        poiTypeDetailAdapter5.clearData();
        ((DmtStatusView) a(C0906R.id.cvd)).e();
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f60038a, false, 65260, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60038a, false, 65260, new Class[0], Void.TYPE);
            return;
        }
        Integer num = this.f60039b;
        if ((num == null || num.intValue() != 0) && !TextUtils.isEmpty(this.f60040c)) {
            if (this.f60042e == null) {
                this.f60042e = new com.ss.android.ugc.aweme.poi.d.a();
                com.ss.android.ugc.aweme.poi.d.a aVar = this.f60042e;
                if (aVar != null) {
                    aVar.a(new v());
                }
                com.ss.android.ugc.aweme.poi.d.a aVar2 = this.f60042e;
                if (aVar2 != null) {
                    aVar2.a(this);
                }
            }
            PoiTypeDetailAdapter poiTypeDetailAdapter = this.f60041d;
            if (poiTypeDetailAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            if (poiTypeDetailAdapter.getItemCount() == 0) {
                ((DmtStatusView) a(C0906R.id.cvd)).d();
            }
            com.ss.android.ugc.aweme.poi.d.a aVar3 = this.f60042e;
            if (aVar3 != null) {
                aVar3.a(1, this.f60039b, this.f60040c);
            }
        }
    }

    public final void b() {
        Integer num;
        if (PatchProxy.isSupport(new Object[0], this, f60038a, false, 65256, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60038a, false, 65256, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        Intent intent = getIntent();
        String str = null;
        if (intent != null) {
            num = Integer.valueOf(intent.getIntExtra("poi_coupon_id", 0));
        } else {
            num = null;
        }
        this.f60039b = num;
        Intent intent2 = getIntent();
        if (intent2 != null) {
            str = intent2.getStringExtra("poi_coupon_code_id");
        }
        this.f60040c = str;
        ((TextTitleBar) a(C0906R.id.d3m)).setTitle((int) C0906R.string.a2y);
        ((TextTitleBar) a(C0906R.id.d3m)).setOnTitleBarClickListener(new a(this));
        if (Build.VERSION.SDK_INT >= 19) {
            View a2 = a(C0906R.id.cv0);
            Intrinsics.checkExpressionValueIsNotNull(a2, "status_bar");
            a2.getLayoutParams().height = StatusBarUtils.getStatusBarHeight(this);
        }
        Context context = this;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.f60041d = new PoiTypeDetailAdapter(this, false);
        PoiTypeDetailAdapter poiTypeDetailAdapter = this.f60041d;
        if (poiTypeDetailAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        poiTypeDetailAdapter.setLoadMoreListener(this);
        RecyclerView recyclerView = (RecyclerView) a(C0906R.id.c01);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "poi_coupon_scope_recycler");
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) a(C0906R.id.c01);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "poi_coupon_scope_recycler");
        PoiTypeDetailAdapter poiTypeDetailAdapter2 = this.f60041d;
        if (poiTypeDetailAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        recyclerView2.setAdapter(poiTypeDetailAdapter2);
        ((DmtStatusView) a(C0906R.id.cvd)).setBuilder(DmtStatusView.a.a(context).a().a(new c.a(context).b((int) C0906R.string.bol).c(C0906R.string.bow).a(com.bytedance.ies.dmt.ui.widget.a.BORDER, C0906R.string.dms, new c(this)).f20493a).a(2130840142, C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new b(this)));
        h();
    }

    public final void b(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f60038a, false, 65265, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f60038a, false, 65265, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        PoiTypeDetailAdapter poiTypeDetailAdapter = this.f60041d;
        if (poiTypeDetailAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        if (poiTypeDetailAdapter.mShowFooter) {
            PoiTypeDetailAdapter poiTypeDetailAdapter2 = this.f60041d;
            if (poiTypeDetailAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            poiTypeDetailAdapter2.setShowFooter(false);
            PoiTypeDetailAdapter poiTypeDetailAdapter3 = this.f60041d;
            if (poiTypeDetailAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            poiTypeDetailAdapter3.notifyDataSetChanged();
        }
        ((DmtStatusView) a(C0906R.id.cvd)).f();
    }

    public final void c(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f60038a, false, 65266, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f60038a, false, 65266, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        PoiTypeDetailAdapter poiTypeDetailAdapter = this.f60041d;
        if (poiTypeDetailAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        poiTypeDetailAdapter.showLoadMoreError();
    }

    public final void a(@Nullable SimplePoiInfoStruct simplePoiInfoStruct, @Nullable String str) {
        String str2;
        SimplePoiInfoStruct simplePoiInfoStruct2 = simplePoiInfoStruct;
        if (PatchProxy.isSupport(new Object[]{simplePoiInfoStruct2, str}, this, f60038a, false, 65259, new Class[]{SimplePoiInfoStruct.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{simplePoiInfoStruct2, str}, this, f60038a, false, 65259, new Class[]{SimplePoiInfoStruct.class, String.class}, Void.TYPE);
            return;
        }
        l.a aVar = new l.a();
        String str3 = null;
        if (simplePoiInfoStruct2 != null) {
            str2 = simplePoiInfoStruct2.poiId;
        } else {
            str2 = null;
        }
        l.a c2 = aVar.c(str2);
        if (simplePoiInfoStruct2 != null) {
            str3 = simplePoiInfoStruct2.poiName;
        }
        PoiDetailActivity.a(this, c2.g(str3).a(simplePoiInfoStruct2).l("click_coupon_restaurant").i("coupon_detail").a());
    }

    public final void b(@Nullable List<SimplePoiInfoStruct> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f60038a, false, 65264, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f60038a, false, 65264, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (list == null || list.isEmpty() || !z) {
            PoiTypeDetailAdapter poiTypeDetailAdapter = this.f60041d;
            if (poiTypeDetailAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            poiTypeDetailAdapter.showLoadMoreEmpty();
        } else {
            PoiTypeDetailAdapter poiTypeDetailAdapter2 = this.f60041d;
            if (poiTypeDetailAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            poiTypeDetailAdapter2.resetLoadMoreState();
        }
        PoiTypeDetailAdapter poiTypeDetailAdapter3 = this.f60041d;
        if (poiTypeDetailAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        poiTypeDetailAdapter3.setDataAfterLoadMore(list);
    }

    public final void a(@Nullable List<SimplePoiInfoStruct> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f60038a, false, 65267, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f60038a, false, 65267, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        PoiTypeDetailAdapter poiTypeDetailAdapter = this.f60041d;
        if (poiTypeDetailAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        poiTypeDetailAdapter.setShowFooter(true);
        if (!z) {
            PoiTypeDetailAdapter poiTypeDetailAdapter2 = this.f60041d;
            if (poiTypeDetailAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            poiTypeDetailAdapter2.showLoadMoreEmpty();
        } else {
            PoiTypeDetailAdapter poiTypeDetailAdapter3 = this.f60041d;
            if (poiTypeDetailAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            poiTypeDetailAdapter3.resetLoadMoreState();
        }
        PoiTypeDetailAdapter poiTypeDetailAdapter4 = this.f60041d;
        if (poiTypeDetailAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        poiTypeDetailAdapter4.setData(list);
        ((DmtStatusView) a(C0906R.id.cvd)).b();
    }
}
