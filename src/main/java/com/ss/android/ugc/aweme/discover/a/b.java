package com.ss.android.ugc.aweme.discover.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/event/InnerSearchEvent;", "", "param", "Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "(Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;)V", "getParam", "()Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "setParam", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41486a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public SearchResultParam f41487b;

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f41486a, false, 36276, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof b) && Intrinsics.areEqual((Object) this.f41487b, (Object) ((b) obj).f41487b));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f41486a, false, 36276, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f41486a, false, 36275, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f41486a, false, 36275, new Class[0], Integer.TYPE)).intValue();
        }
        SearchResultParam searchResultParam = this.f41487b;
        if (searchResultParam != null) {
            i = searchResultParam.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f41486a, false, 36274, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f41486a, false, 36274, new Class[0], String.class);
        }
        return "InnerSearchEvent(param=" + this.f41487b + ")";
    }

    public b(@NotNull SearchResultParam searchResultParam) {
        Intrinsics.checkParameterIsNotNull(searchResultParam, "param");
        this.f41487b = searchResultParam;
    }
}
