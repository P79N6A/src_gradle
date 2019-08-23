package com.ss.android.ugc.aweme.poi.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J/\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/model/PoiCouponScopeResponse;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "poiList", "", "Lcom/ss/android/ugc/aweme/feed/model/poi/SimplePoiInfoStruct;", "cursor", "", "hasMore", "", "(Ljava/util/List;JZ)V", "getCursor", "()J", "getHasMore", "()Z", "setHasMore", "(Z)V", "getPoiList", "()Ljava/util/List;", "setPoiList", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class w extends BaseResponse {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59948a;
    @SerializedName("poi_info_list")
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public List<SimplePoiInfoStruct> f59949b;
    @SerializedName("cursor")

    /* renamed from: c  reason: collision with root package name */
    public final long f59950c;
    @SerializedName("has_more")

    /* renamed from: d  reason: collision with root package name */
    public boolean f59951d;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f59948a, false, 65050, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f59948a, false, 65050, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof w) {
                w wVar = (w) obj;
                if (Intrinsics.areEqual((Object) this.f59949b, (Object) wVar.f59949b)) {
                    if (this.f59950c == wVar.f59950c) {
                        if (this.f59951d == wVar.f59951d) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f59948a, false, 65049, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f59948a, false, 65049, new Class[0], Integer.TYPE)).intValue();
        }
        List<SimplePoiInfoStruct> list = this.f59949b;
        if (list != null) {
            i = list.hashCode();
        }
        long j = this.f59950c;
        int i2 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        boolean z = this.f59951d;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f59948a, false, 65048, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f59948a, false, 65048, new Class[0], String.class);
        }
        return "PoiCouponScopeResponse(poiList=" + this.f59949b + ", cursor=" + this.f59950c + ", hasMore=" + this.f59951d + ")";
    }
}
