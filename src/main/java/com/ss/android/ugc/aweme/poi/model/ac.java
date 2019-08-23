package com.ss.android.ugc.aweme.poi.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/model/PoiHalfCardInfoResponse;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "poiHalfCardInfo", "Lcom/ss/android/ugc/aweme/poi/model/PoiHalfCardInfoStruct;", "(Lcom/ss/android/ugc/aweme/poi/model/PoiHalfCardInfoStruct;)V", "getPoiHalfCardInfo", "()Lcom/ss/android/ugc/aweme/poi/model/PoiHalfCardInfoStruct;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ac extends BaseResponse {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59862a;
    @SerializedName("poi_half_card_info")
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final ad f59863b;

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f59862a, false, 65120, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof ac) && Intrinsics.areEqual((Object) this.f59863b, (Object) ((ac) obj).f59863b));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f59862a, false, 65120, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f59862a, false, 65119, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f59862a, false, 65119, new Class[0], Integer.TYPE)).intValue();
        }
        ad adVar = this.f59863b;
        if (adVar != null) {
            i = adVar.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f59862a, false, 65118, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f59862a, false, 65118, new Class[0], String.class);
        }
        return "PoiHalfCardInfoResponse(poiHalfCardInfo=" + this.f59863b + ")";
    }
}
