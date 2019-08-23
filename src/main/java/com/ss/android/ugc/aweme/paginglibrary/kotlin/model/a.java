package com.ss.android.ugc.aweme.paginglibrary.kotlin.model;

import android.arch.lifecycle.LiveData;
import android.arch.paging.PagedList;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BQ\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\rJ\u0015\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003Je\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/paginglibrary/kotlin/model/Listing;", "T", "", "pagedList", "Landroid/arch/lifecycle/LiveData;", "Landroid/arch/paging/PagedList;", "networkState", "Lcom/ss/android/ugc/aweme/paginglibrary/kotlin/model/NetworkState;", "refreshState", "refresh", "Lkotlin/Function0;", "", "retry", "(Landroid/arch/lifecycle/LiveData;Landroid/arch/lifecycle/LiveData;Landroid/arch/lifecycle/LiveData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getNetworkState", "()Landroid/arch/lifecycle/LiveData;", "getPagedList", "getRefresh", "()Lkotlin/jvm/functions/Function0;", "getRefreshState", "getRetry", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "paginglibrary_release"}, k = 1, mv = {1, 1, 10})
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58446a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final LiveData<PagedList<T>> f58447b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final LiveData<Object> f58448c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final LiveData<Object> f58449d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final Function0<Unit> f58450e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final Function0<Unit> f58451f;

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f58446a, false, 63519, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f58446a, false, 63519, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!Intrinsics.areEqual((Object) this.f58447b, (Object) aVar.f58447b) || !Intrinsics.areEqual((Object) this.f58448c, (Object) aVar.f58448c) || !Intrinsics.areEqual((Object) this.f58449d, (Object) aVar.f58449d) || !Intrinsics.areEqual((Object) this.f58450e, (Object) aVar.f58450e) || !Intrinsics.areEqual((Object) this.f58451f, (Object) aVar.f58451f)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f58446a, false, 63518, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f58446a, false, 63518, new Class[0], Integer.TYPE)).intValue();
        }
        LiveData<PagedList<T>> liveData = this.f58447b;
        int hashCode = (liveData != null ? liveData.hashCode() : 0) * 31;
        LiveData<Object> liveData2 = this.f58448c;
        int hashCode2 = (hashCode + (liveData2 != null ? liveData2.hashCode() : 0)) * 31;
        LiveData<Object> liveData3 = this.f58449d;
        int hashCode3 = (hashCode2 + (liveData3 != null ? liveData3.hashCode() : 0)) * 31;
        Function0<Unit> function0 = this.f58450e;
        int hashCode4 = (hashCode3 + (function0 != null ? function0.hashCode() : 0)) * 31;
        Function0<Unit> function02 = this.f58451f;
        if (function02 != null) {
            i = function02.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f58446a, false, 63517, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f58446a, false, 63517, new Class[0], String.class);
        }
        return "Listing(pagedList=" + this.f58447b + ", networkState=" + this.f58448c + ", refreshState=" + this.f58449d + ", refresh=" + this.f58450e + ", retry=" + this.f58451f + ")";
    }
}
