package com.ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BQ\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JU\u0010\u001f\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u000bHÖ\u0001J\t\u0010%\u001a\u00020\u0004HÖ\u0001R,\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R,\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R&\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/SkuInfo;", "Ljava/io/Serializable;", "skuList", "", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/SkuItem;", "pictureMap", "specificInfoList", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/SpecInfo;", "status", "", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;I)V", "getPictureMap", "()Ljava/util/Map;", "setPictureMap", "(Ljava/util/Map;)V", "getSkuList", "setSkuList", "getSpecificInfoList", "()Ljava/util/List;", "setSpecificInfoList", "(Ljava/util/List;)V", "getStatus", "()I", "setStatus", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class y implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("pic_map")
    @Nullable
    private Map<String, String> pictureMap;
    @SerializedName("sku_list")
    @Nullable
    private Map<String, z> skuList;
    @SerializedName("spec_info")
    @Nullable
    private List<ab> specificInfoList;
    @SerializedName("status")
    private int status;

    public y() {
        this(null, null, null, 0, 15, null);
    }

    public static /* synthetic */ y copy$default(y yVar, Map<String, z> map, Map<String, String> map2, List<ab> list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = yVar.skuList;
        }
        if ((i2 & 2) != 0) {
            map2 = yVar.pictureMap;
        }
        if ((i2 & 4) != 0) {
            list = yVar.specificInfoList;
        }
        if ((i2 & 8) != 0) {
            i = yVar.status;
        }
        return yVar.copy(map, map2, list, i);
    }

    @Nullable
    public final Map<String, z> component1() {
        return this.skuList;
    }

    @Nullable
    public final Map<String, String> component2() {
        return this.pictureMap;
    }

    @Nullable
    public final List<ab> component3() {
        return this.specificInfoList;
    }

    public final int component4() {
        return this.status;
    }

    @NotNull
    public final y copy(@Nullable Map<String, z> map, @Nullable Map<String, String> map2, @Nullable List<ab> list, int i) {
        Map<String, z> map3 = map;
        Map<String, String> map4 = map2;
        List<ab> list2 = list;
        if (!PatchProxy.isSupport(new Object[]{map3, map4, list2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 29881, new Class[]{Map.class, Map.class, List.class, Integer.TYPE}, y.class)) {
            return new y(map3, map4, list2, i);
        }
        return (y) PatchProxy.accessDispatch(new Object[]{map3, map4, list2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 29881, new Class[]{Map.class, Map.class, List.class, Integer.TYPE}, y.class);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 29884, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 29884, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                if (Intrinsics.areEqual((Object) this.skuList, (Object) yVar.skuList) && Intrinsics.areEqual((Object) this.pictureMap, (Object) yVar.pictureMap) && Intrinsics.areEqual((Object) this.specificInfoList, (Object) yVar.specificInfoList)) {
                    if (this.status == yVar.status) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29883, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29883, new Class[0], Integer.TYPE)).intValue();
        }
        Map<String, z> map = this.skuList;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        Map<String, String> map2 = this.pictureMap;
        int hashCode2 = (hashCode + (map2 != null ? map2.hashCode() : 0)) * 31;
        List<ab> list = this.specificInfoList;
        if (list != null) {
            i = list.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.status;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29882, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29882, new Class[0], String.class);
        }
        return "SkuInfo(skuList=" + this.skuList + ", pictureMap=" + this.pictureMap + ", specificInfoList=" + this.specificInfoList + ", status=" + this.status + ")";
    }

    @Nullable
    public final Map<String, String> getPictureMap() {
        return this.pictureMap;
    }

    @Nullable
    public final Map<String, z> getSkuList() {
        return this.skuList;
    }

    @Nullable
    public final List<ab> getSpecificInfoList() {
        return this.specificInfoList;
    }

    public final int getStatus() {
        return this.status;
    }

    public final void setPictureMap(@Nullable Map<String, String> map) {
        this.pictureMap = map;
    }

    public final void setSkuList(@Nullable Map<String, z> map) {
        this.skuList = map;
    }

    public final void setSpecificInfoList(@Nullable List<ab> list) {
        this.specificInfoList = list;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public y(@Nullable Map<String, z> map, @Nullable Map<String, String> map2, @Nullable List<ab> list, int i) {
        this.skuList = map;
        this.pictureMap = map2;
        this.specificInfoList = list;
        this.status = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Map map, Map map2, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new HashMap() : map, (i2 & 2) != 0 ? new HashMap() : map2, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? 2 : i);
    }
}
