package com.ss.android.ugc.aweme.discover.model;

import android.arch.lifecycle.ViewModel;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000bJ\u0006\u0010\u0019\u001a\u00020\u0016J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u000fR!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048FX\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\f\u0010\u0007R!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048FX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0010\u0010\u0007R!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/SearchIntermediateViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "intermediateState", "Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;", "", "getIntermediateState", "()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;", "intermediateState$delegate", "Lkotlin/Lazy;", "openSearchParam", "Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "getOpenSearchParam", "openSearchParam$delegate", "searchKeyword", "", "getSearchKeyword", "searchKeyword$delegate", "searchTabIndex", "getSearchTabIndex", "searchTabIndex$delegate", "hideIntermediate", "", "openSearch", "param", "openSearchSquare", "openSearchSug", "keyword", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchIntermediateViewModel extends ViewModel {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SearchIntermediateViewModel.class), "searchKeyword", "getSearchKeyword()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SearchIntermediateViewModel.class), "intermediateState", "getIntermediateState()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SearchIntermediateViewModel.class), "openSearchParam", "getOpenSearchParam()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SearchIntermediateViewModel.class), "searchTabIndex", "getSearchTabIndex()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;"))};
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final Lazy intermediateState$delegate = SearchIntermediateViewModelKt.lazy(SearchIntermediateViewModel$intermediateState$2.INSTANCE);
    @NotNull
    private final Lazy openSearchParam$delegate = SearchIntermediateViewModelKt.lazy(SearchIntermediateViewModel$openSearchParam$2.INSTANCE);
    @NotNull
    private final Lazy searchKeyword$delegate = SearchIntermediateViewModelKt.lazy(SearchIntermediateViewModel$searchKeyword$2.INSTANCE);
    @NotNull
    private final Lazy searchTabIndex$delegate = SearchIntermediateViewModelKt.lazy(SearchIntermediateViewModel$searchTabIndex$2.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/SearchIntermediateViewModel$Companion;", "", "()V", "INTERMEDIATE_STATE_HIDE", "", "INTERMEDIATE_STATE_SQUARE", "INTERMEDIATE_STATE_SUG", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @NotNull
    public final b<Integer> getIntermediateState() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37092, new Class[0], b.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37092, new Class[0], b.class);
        } else {
            value = this.intermediateState$delegate.getValue();
        }
        return (b) value;
    }

    @NotNull
    public final b<SearchResultParam> getOpenSearchParam() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37093, new Class[0], b.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37093, new Class[0], b.class);
        } else {
            value = this.openSearchParam$delegate.getValue();
        }
        return (b) value;
    }

    @NotNull
    public final b<String> getSearchKeyword() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37091, new Class[0], b.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37091, new Class[0], b.class);
        } else {
            value = this.searchKeyword$delegate.getValue();
        }
        return (b) value;
    }

    @NotNull
    public final b<Integer> getSearchTabIndex() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37094, new Class[0], b.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37094, new Class[0], b.class);
        } else {
            value = this.searchTabIndex$delegate.getValue();
        }
        return (b) value;
    }

    public final void hideIntermediate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37098, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37098, new Class[0], Void.TYPE);
            return;
        }
        getIntermediateState().setValue(0);
    }

    public final void openSearchSquare() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37095, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37095, new Class[0], Void.TYPE);
            return;
        }
        getIntermediateState().setValue(1);
    }

    public final void openSearch(@NotNull SearchResultParam searchResultParam) {
        SearchResultParam searchResultParam2 = searchResultParam;
        if (PatchProxy.isSupport(new Object[]{searchResultParam2}, this, changeQuickRedirect, false, 37097, new Class[]{SearchResultParam.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchResultParam2}, this, changeQuickRedirect, false, 37097, new Class[]{SearchResultParam.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(searchResultParam2, "param");
        if (!TextUtils.isEmpty(searchResultParam.getKeyword())) {
            getOpenSearchParam().setValue(searchResultParam2);
            hideIntermediate();
        }
    }

    public final void openSearchSug(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 37096, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 37096, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "keyword");
        Integer num = (Integer) getIntermediateState().getValue();
        if (num == null || num.intValue() != 2 || !TextUtils.equals(str2, (CharSequence) getSearchKeyword().getValue())) {
            getSearchKeyword().setValue(str2);
            getIntermediateState().setValue(2);
        }
    }
}
