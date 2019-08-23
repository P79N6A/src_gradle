package com.ss.android.ugc.aweme.poi.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0018J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u000eHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00106\u001a\u00020\u000eHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010=\u001a\u00020\nHÆ\u0003J\t\u0010>\u001a\u00020\nHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u000eHÆ\u0003J¹\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\u000eHÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0012\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0016\u0010\u0014\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001a¨\u0006G"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/model/PoiHalfCardInfoStruct;", "", "poiId", "", "poiName", "cover", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "longitude", "latitude", "rating", "", "cost", "poiSubtitle", "poiSubtitleType", "", "collectStat", "poiActivityInfo", "Lcom/ss/android/ugc/aweme/poi/model/PoiActivityInfo;", "coverType", "telephone", "source", "poiCommodity", "Lcom/ss/android/ugc/aweme/poi/model/PoiCommodity;", "backendTypeName", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/ugc/aweme/base/model/UrlModel;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;IILcom/ss/android/ugc/aweme/poi/model/PoiActivityInfo;ILjava/lang/String;ILcom/ss/android/ugc/aweme/poi/model/PoiCommodity;Ljava/lang/String;)V", "getBackendTypeName", "()Ljava/lang/String;", "getCollectStat", "()I", "setCollectStat", "(I)V", "getCost", "()D", "getCover", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getCoverType", "getLatitude", "getLongitude", "getPoiActivityInfo", "()Lcom/ss/android/ugc/aweme/poi/model/PoiActivityInfo;", "getPoiCommodity", "()Lcom/ss/android/ugc/aweme/poi/model/PoiCommodity;", "getPoiId", "getPoiName", "getPoiSubtitle", "getPoiSubtitleType", "getRating", "getSource", "getTelephone", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59864a;
    @SerializedName("poi_id")
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final String f59865b;
    @SerializedName("poi_name")
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f59866c;
    @SerializedName("cover")
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final UrlModel f59867d;
    @SerializedName("longitude")
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final String f59868e;
    @SerializedName("latitude")
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final String f59869f;
    @SerializedName("rating")
    public final double g;
    @SerializedName("cost")
    public final double h;
    @SerializedName("subtitle")
    @Nullable
    public final String i;
    @SerializedName("subtitle_type")
    public final int j;
    @SerializedName("collect_stat")
    public int k;
    @SerializedName("poi_activity_info")
    @Nullable
    public final d l;
    @SerializedName("cover_type")
    public final int m;
    @SerializedName("telephone")
    @Nullable
    public final String n;
    @SerializedName("biz_src")
    public final int o;
    @SerializedName("commodity")
    @Nullable
    public final r p;
    @SerializedName("backend_type_name")
    @Nullable
    public final String q;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f59864a, false, 65124, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f59864a, false, 65124, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof ad) {
                ad adVar = (ad) obj;
                if (Intrinsics.areEqual((Object) this.f59865b, (Object) adVar.f59865b) && Intrinsics.areEqual((Object) this.f59866c, (Object) adVar.f59866c) && Intrinsics.areEqual((Object) this.f59867d, (Object) adVar.f59867d) && Intrinsics.areEqual((Object) this.f59868e, (Object) adVar.f59868e) && Intrinsics.areEqual((Object) this.f59869f, (Object) adVar.f59869f) && Double.compare(this.g, adVar.g) == 0 && Double.compare(this.h, adVar.h) == 0 && Intrinsics.areEqual((Object) this.i, (Object) adVar.i)) {
                    if (this.j == adVar.j) {
                        if ((this.k == adVar.k) && Intrinsics.areEqual((Object) this.l, (Object) adVar.l)) {
                            if ((this.m == adVar.m) && Intrinsics.areEqual((Object) this.n, (Object) adVar.n)) {
                                if (!(this.o == adVar.o) || !Intrinsics.areEqual((Object) this.p, (Object) adVar.p) || !Intrinsics.areEqual((Object) this.q, (Object) adVar.q)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f59864a, false, 65123, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f59864a, false, 65123, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.f59865b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f59866c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        UrlModel urlModel = this.f59867d;
        int hashCode3 = (hashCode2 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str3 = this.f59868e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f59869f;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.g);
        long doubleToLongBits2 = Double.doubleToLongBits(this.h);
        int i3 = (((((hashCode4 + hashCode5) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31;
        String str5 = this.i;
        int hashCode6 = (((((i3 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.j) * 31) + this.k) * 31;
        d dVar = this.l;
        int hashCode7 = (((hashCode6 + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.m) * 31;
        String str6 = this.n;
        int hashCode8 = (((hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.o) * 31;
        r rVar = this.p;
        int hashCode9 = (hashCode8 + (rVar != null ? rVar.hashCode() : 0)) * 31;
        String str7 = this.q;
        if (str7 != null) {
            i2 = str7.hashCode();
        }
        return hashCode9 + i2;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f59864a, false, 65122, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f59864a, false, 65122, new Class[0], String.class);
        }
        return "PoiHalfCardInfoStruct(poiId=" + this.f59865b + ", poiName=" + this.f59866c + ", cover=" + this.f59867d + ", longitude=" + this.f59868e + ", latitude=" + this.f59869f + ", rating=" + this.g + ", cost=" + this.h + ", poiSubtitle=" + this.i + ", poiSubtitleType=" + this.j + ", collectStat=" + this.k + ", poiActivityInfo=" + this.l + ", coverType=" + this.m + ", telephone=" + this.n + ", source=" + this.o + ", poiCommodity=" + this.p + ", backendTypeName=" + this.q + ")";
    }
}
