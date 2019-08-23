package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ad.splash.utils.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.adapter.SearchCommodityAdapter;
import com.ss.android.ugc.aweme.discover.adapter.s;
import com.ss.android.ugc.aweme.discover.model.SearchCommodity;
import com.ss.android.ugc.aweme.discover.presenter.k;
import com.ss.android.ugc.aweme.discover.presenter.n;
import com.ss.android.ugc.aweme.discover.presenter.o;
import com.ss.android.ugc.aweme.discover.ui.SearchBaseFragment;
import com.ss.android.ugc.aweme.feed.model.poi.PoiClassFilterOptionStruct;
import com.ss.android.ugc.aweme.feed.model.poi.PoiOptionStruct;
import com.ss.android.ugc.aweme.poi.nearby.adapter.PoiFilterAdapter;
import com.ss.android.ugc.aweme.poi.nearby.adapter.PoiFilterDetailAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u001a\u001a\u00020\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0014J\u001a\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&H\u0014J\b\u0010'\u001a\u00020\u001bH\u0014J\b\u0010(\u001a\u00020\u001bH\u0014J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0012H\u0002J\u0018\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u0010H\u0016J\b\u0010.\u001a\u00020\u001bH\u0016J\b\u0010/\u001a\u00020\u001bH\u0002J\u0018\u00100\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u0010H\u0014J\b\u00104\u001a\u00020\u001bH\u0002J\u0010\u00105\u001a\u00020\u001b2\u0006\u00106\u001a\u00020\u0012H\u0014J\u0010\u00107\u001a\u00020&2\u0006\u00108\u001a\u00020&H\u0016J\u0014\u00109\u001a\u00020\u001b2\n\u0010:\u001a\u00060;j\u0002`<H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/SearchCommodityFragment;", "Lcom/ss/android/ugc/aweme/discover/ui/SearchOriginalFragment;", "Lcom/ss/android/ugc/aweme/discover/model/SearchCommodity;", "Lcom/ss/android/ugc/aweme/poi/nearby/adapter/PoiFilterAdapter$OnPoiFilterItemClickListener;", "Lcom/ss/android/ugc/aweme/poi/nearby/adapter/PoiFilterDetailAdapter$OnPoiFilterDetailItemClickListener;", "()V", "classFilterOptionStructList", "", "Lcom/ss/android/ugc/aweme/feed/model/poi/PoiClassFilterOptionStruct;", "classFilterRes", "", "filterAdapter", "Lcom/ss/android/ugc/aweme/poi/nearby/adapter/PoiFilterAdapter;", "filterRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "filterType", "", "labelName", "", "getLabelName", "()Ljava/lang/String;", "mCurrentFilterClassItem", "popWindow", "Lcom/ss/android/ugc/aweme/poi/nearby/widget/PoiFilterListPopWindow;", "priceClassFilterRes", "sort", "initAdapter", "", "initFilterData", "initFilterRecyclerView", "initPresenter", "initView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "invokeRefreshResult", "hasMore", "", "invokeShowLoadEmpty", "loadMoreData", "mobEvent", "clickType", "onClickFilterItem", "struct", "position", "onDestroy", "onFilter", "onPoiFilterDetailItemClick", "Lcom/ss/android/ugc/aweme/feed/model/poi/PoiOptionStruct;", "refresh", "refreshType", "resetFilterState", "setKeyword", "keyword", "shouldShowSearchAdH5", "inI18n", "showLoadError", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchCommodityFragment extends SearchOriginalFragment<SearchCommodity> implements PoiFilterAdapter.a, PoiFilterDetailAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42973a;
    private com.ss.android.ugc.aweme.poi.nearby.widget.a I;
    private final int[] J = {C0906R.string.b1x, C0906R.string.bql};
    private final int[] K = {C0906R.string.bqh, C0906R.string.bqi};
    private int L;
    private int M;
    private int N;
    private HashMap O;

    /* renamed from: b  reason: collision with root package name */
    public PoiFilterAdapter f42974b;

    /* renamed from: c  reason: collision with root package name */
    private RecyclerView f42975c;

    /* renamed from: d  reason: collision with root package name */
    private List<PoiClassFilterOptionStruct> f42976d = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onDismiss"}, k = 3, mv = {1, 1, 15})
    static final class a implements PopupWindow.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42977a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchCommodityFragment f42978b;

        a(SearchCommodityFragment searchCommodityFragment) {
            this.f42978b = searchCommodityFragment;
        }

        public final void onDismiss() {
            if (PatchProxy.isSupport(new Object[0], this, f42977a, false, 37817, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42977a, false, 37817, new Class[0], Void.TYPE);
                return;
            }
            PoiFilterAdapter poiFilterAdapter = this.f42978b.f42974b;
            if (poiFilterAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filterAdapter");
            }
            poiFilterAdapter.notifyDataSetChanged();
        }
    }

    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.ame)}, this, f42973a, false, 37815, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.ame)}, this, f42973a, false, 37815, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.O == null) {
            this.O = new HashMap();
        }
        View view = (View) this.O.get(Integer.valueOf(C0906R.id.ame));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(C0906R.id.ame);
            this.O.put(Integer.valueOf(C0906R.id.ame), view);
        }
        return view;
    }

    public final boolean a(boolean z) {
        return false;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f42973a, false, 37816, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42973a, false, 37816, new Class[0], Void.TYPE);
            return;
        }
        if (this.O != null) {
            this.O.clear();
        }
    }

    @NotNull
    public final String i() {
        return "ecommerce";
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        g();
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f42973a, false, 37805, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42973a, false, 37805, new Class[0], Void.TYPE);
            return;
        }
        a((BaseAdapter<D>) new SearchCommodityAdapter<D>(new s(false), this.h));
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f42973a, false, 37814, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42973a, false, 37814, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        com.ss.android.ugc.aweme.poi.nearby.widget.a aVar = this.I;
        if (aVar != null && aVar.isShowing()) {
            com.ss.android.ugc.aweme.poi.nearby.widget.a aVar2 = this.I;
            if (aVar2 != null) {
                aVar2.dismiss();
            }
        }
    }

    private final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f42973a, false, 37808, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42973a, false, 37808, new Class[0], Void.TYPE);
        } else if (!NetworkUtils.b(getContext())) {
            com.bytedance.ies.dmt.ui.d.a.b(getContext(), (int) C0906R.string.bgf).a();
        } else {
            c(1);
        }
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f42973a, false, 37804, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42973a, false, 37804, new Class[0], Void.TYPE);
            return;
        }
        a((k<?>) new o<Object>());
        k<?> E = E();
        if (E != null) {
            ((o) E).a(new n());
            E().a(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchCommodityPresenter");
    }

    public final void x_() {
        if (PatchProxy.isSupport(new Object[0], this, f42973a, false, 37812, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42973a, false, 37812, new Class[0], Void.TYPE);
            return;
        }
        super.x_();
        com.ss.android.ugc.aweme.poi.nearby.widget.a aVar = this.I;
        if (aVar != null && aVar.isShowing()) {
            com.ss.android.ugc.aweme.poi.nearby.widget.a aVar2 = this.I;
            if (aVar2 != null) {
                aVar2.dismiss();
            }
        }
        t().setVisibility(8);
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f42973a, false, 37810, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42973a, false, 37810, new Class[0], Void.TYPE);
            return;
        }
        if ((this.k == 2 || this.k == 5) && TextUtils.equals(this.h, this.i)) {
            E().b(SearchBaseFragment.a.a());
        } else {
            E().b(0);
        }
        E().a(4, D(), Integer.valueOf(this.M), Integer.valueOf(this.N), 1, Integer.valueOf(this.o));
    }

    private final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f42973a, false, 37803, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f42973a, false, 37803, new Class[]{String.class}, Void.TYPE);
            return;
        }
        r.a("click_ecommerce_search_sort", (Map) d.a().a("click_type", str2).f34114b);
    }

    public final void c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f42973a, false, 37809, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f42973a, false, 37809, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        E().a(1, this.h, Integer.valueOf(this.M), Integer.valueOf(this.N), Integer.valueOf(i), Integer.valueOf(this.o));
    }

    public final void b(@NotNull Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f42973a, false, 37811, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f42973a, false, 37811, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(exc, "e");
        super.b(exc);
        if (isViewValid()) {
            com.ss.android.ugc.aweme.poi.nearby.widget.a aVar = this.I;
            if (aVar != null && aVar.isShowing()) {
                com.ss.android.ugc.aweme.poi.nearby.widget.a aVar2 = this.I;
                if (aVar2 != null) {
                    aVar2.dismiss();
                }
            }
            t().setVisibility(8);
        }
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f42973a, false, 37813, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f42973a, false, 37813, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        t().setVisibility(0);
        super.c(z);
    }

    public final void a(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f42973a, false, 37806, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f42973a, false, 37806, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "keyword");
        if (PatchProxy.isSupport(new Object[0], this, f42973a, false, 37807, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42973a, false, 37807, new Class[0], Void.TYPE);
        } else {
            int size = this.f42976d.size();
            for (int i = 0; i < size; i++) {
                PoiClassFilterOptionStruct poiClassFilterOptionStruct = this.f42976d.get(i);
                poiClassFilterOptionStruct.subTitle = "";
                if (i == 0) {
                    poiClassFilterOptionStruct.singleSelected = true;
                } else if (i == 1) {
                    for (PoiOptionStruct next : poiClassFilterOptionStruct.optionStructList) {
                        Intrinsics.checkExpressionValueIsNotNull(next, "option");
                        next.setSelected(false);
                    }
                }
            }
            PoiFilterAdapter poiFilterAdapter = this.f42974b;
            if (poiFilterAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filterAdapter");
            }
            poiFilterAdapter.notifyDataSetChanged();
        }
        this.M = 0;
        this.N = 0;
    }

    public final void a(int i, @NotNull PoiOptionStruct poiOptionStruct) {
        boolean z;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), poiOptionStruct}, this, f42973a, false, 37801, new Class[]{Integer.TYPE, PoiOptionStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), poiOptionStruct}, this, f42973a, false, 37801, new Class[]{Integer.TYPE, PoiOptionStruct.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(poiOptionStruct, "struct");
        this.f42976d.get(this.L).subTitle = poiOptionStruct.getName();
        for (PoiOptionStruct next : this.f42976d.get(this.L).optionStructList) {
            Intrinsics.checkExpressionValueIsNotNull(next, "item");
            if (next.getCode() == poiOptionStruct.getCode()) {
                z = true;
            } else {
                z = false;
            }
            next.setSelected(z);
        }
        if (this.L == 1) {
            this.f42976d.get(0).singleSelected = false;
            this.M = 2;
            if (i == 0) {
                b("price_sort_asc");
            } else {
                b("price_sort_desc");
                i2 = 1;
            }
            this.N = i2;
            h();
        }
        com.ss.android.ugc.aweme.poi.nearby.widget.a aVar = this.I;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    public final void a(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f42973a, false, 37798, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f42973a, false, 37798, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.a(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f42973a, false, 37799, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42973a, false, 37799, new Class[0], Void.TYPE);
        } else {
            for (int i = 0; i <= 1; i++) {
                PoiClassFilterOptionStruct poiClassFilterOptionStruct = new PoiClassFilterOptionStruct();
                poiClassFilterOptionStruct.title = getResources().getString(this.J[i]);
                this.f42976d.add(poiClassFilterOptionStruct);
                if (i == 0) {
                    poiClassFilterOptionStruct.singleSelected = true;
                } else {
                    List<PoiOptionStruct> arrayList = new ArrayList<>();
                    for (int i2 = 0; i2 <= 1; i2++) {
                        PoiOptionStruct poiOptionStruct = new PoiOptionStruct();
                        poiOptionStruct.setCode((long) i2);
                        poiOptionStruct.setName(getResources().getString(this.K[i2]));
                        arrayList.add(poiOptionStruct);
                    }
                    poiClassFilterOptionStruct.optionStructList = arrayList;
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f42973a, false, 37800, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42973a, false, 37800, new Class[0], Void.TYPE);
            return;
        }
        Context context = getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        this.f42975c = new RecyclerView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, u.a(40.5d));
        layoutParams.leftMargin = u.a(16.0d);
        layoutParams.rightMargin = u.a(16.0d);
        FrameLayout t = t();
        RecyclerView recyclerView = this.f42975c;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterRecyclerView");
        }
        t.addView(recyclerView, layoutParams);
        View view2 = new View(getContext());
        view2.setBackgroundResource(C0906R.color.zf);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, u.a(0.5d));
        layoutParams2.gravity = 80;
        t().addView(view2, layoutParams2);
        RecyclerView recyclerView2 = this.f42975c;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterRecyclerView");
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f42974b = new PoiFilterAdapter(this);
        PoiFilterAdapter poiFilterAdapter = this.f42974b;
        if (poiFilterAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterAdapter");
        }
        poiFilterAdapter.a(this.f42976d);
        RecyclerView recyclerView3 = this.f42975c;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterRecyclerView");
        }
        PoiFilterAdapter poiFilterAdapter2 = this.f42974b;
        if (poiFilterAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterAdapter");
        }
        recyclerView3.setAdapter(poiFilterAdapter2);
    }

    public final void a(@NotNull PoiClassFilterOptionStruct poiClassFilterOptionStruct, int i) {
        if (PatchProxy.isSupport(new Object[]{poiClassFilterOptionStruct, Integer.valueOf(i)}, this, f42973a, false, 37802, new Class[]{PoiClassFilterOptionStruct.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiClassFilterOptionStruct, Integer.valueOf(i)}, this, f42973a, false, 37802, new Class[]{PoiClassFilterOptionStruct.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(poiClassFilterOptionStruct, "struct");
        if (this.I == null) {
            this.I = new com.ss.android.ugc.aweme.poi.nearby.widget.a(getContext(), this);
            com.ss.android.ugc.aweme.poi.nearby.widget.a aVar = this.I;
            if (aVar != null) {
                aVar.setOnDismissListener(new a(this));
            }
        }
        this.L = i;
        List<PoiOptionStruct> list = this.f42976d.get(i).optionStructList;
        if (i == 0) {
            if (!this.f42976d.get(i).singleSelected) {
                this.f42976d.get(i).singleSelected = true;
                List<PoiOptionStruct> list2 = this.f42976d.get(1).optionStructList;
                this.f42976d.get(1).subTitle = "";
                for (PoiOptionStruct next : list2) {
                    Intrinsics.checkExpressionValueIsNotNull(next, "item");
                    next.setSelected(false);
                }
                PoiFilterAdapter poiFilterAdapter = this.f42974b;
                if (poiFilterAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("filterAdapter");
                }
                poiFilterAdapter.notifyDataSetChanged();
            }
            b("general_sort");
            this.M = 0;
            this.N = 0;
            h();
            return;
        }
        com.ss.android.ugc.aweme.poi.nearby.widget.a aVar2 = this.I;
        if (aVar2 != null) {
            aVar2.a(list);
        }
        com.ss.android.ugc.aweme.poi.nearby.widget.a aVar3 = this.I;
        if (aVar3 != null) {
            RecyclerView recyclerView = this.f42975c;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filterRecyclerView");
            }
            aVar3.showAsDropDown(recyclerView, 0, 0);
        }
    }
}
