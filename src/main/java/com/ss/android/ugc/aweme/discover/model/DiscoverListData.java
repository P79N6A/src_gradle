package com.ss.android.ugc.aweme.discover.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J7\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0010\"\u0004\b\u0013\u0010\u0012R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/DiscoverListData;", "Ljava/io/Serializable;", "itemList", "", "Lcom/ss/android/ugc/aweme/discover/model/DiscoverItemData;", "cursor", "", "hasMore", "", "isCache", "(Ljava/util/List;IZZ)V", "getCursor", "()I", "setCursor", "(I)V", "getHasMore", "()Z", "setHasMore", "(Z)V", "setCache", "getItemList", "()Ljava/util/List;", "setItemList", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DiscoverListData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int cursor;
    private boolean hasMore;
    private boolean isCache;
    @NotNull
    private List<DiscoverItemData> itemList;

    public static /* synthetic */ DiscoverListData copy$default(DiscoverListData discoverListData, List<DiscoverItemData> list, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = discoverListData.itemList;
        }
        if ((i2 & 2) != 0) {
            i = discoverListData.cursor;
        }
        if ((i2 & 4) != 0) {
            z = discoverListData.hasMore;
        }
        if ((i2 & 8) != 0) {
            z2 = discoverListData.isCache;
        }
        return discoverListData.copy(list, i, z, z2);
    }

    @NotNull
    public final List<DiscoverItemData> component1() {
        return this.itemList;
    }

    public final int component2() {
        return this.cursor;
    }

    public final boolean component3() {
        return this.hasMore;
    }

    public final boolean component4() {
        return this.isCache;
    }

    @NotNull
    public final DiscoverListData copy(@NotNull List<DiscoverItemData> list, int i, boolean z, boolean z2) {
        List<DiscoverItemData> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 37023, new Class[]{List.class, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, DiscoverListData.class)) {
            return (DiscoverListData) PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i), Byte.valueOf(z), Byte.valueOf(z2)}, this, changeQuickRedirect, false, 37023, new Class[]{List.class, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, DiscoverListData.class);
        }
        Intrinsics.checkParameterIsNotNull(list2, "itemList");
        return new DiscoverListData(list2, i, z, z2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 37026, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 37026, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof DiscoverListData) {
                DiscoverListData discoverListData = (DiscoverListData) obj;
                if (Intrinsics.areEqual((Object) this.itemList, (Object) discoverListData.itemList)) {
                    if (this.cursor == discoverListData.cursor) {
                        if (this.hasMore == discoverListData.hasMore) {
                            if (this.isCache == discoverListData.isCache) {
                                return true;
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
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37025, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37025, new Class[0], Integer.TYPE)).intValue();
        }
        List<DiscoverItemData> list = this.itemList;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = ((i * 31) + this.cursor) * 31;
        boolean z = this.hasMore;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.isCache;
        if (z2) {
            z2 = true;
        }
        return i3 + (z2 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37024, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37024, new Class[0], String.class);
        }
        return "DiscoverListData(itemList=" + this.itemList + ", cursor=" + this.cursor + ", hasMore=" + this.hasMore + ", isCache=" + this.isCache + ")";
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    @NotNull
    public final List<DiscoverItemData> getItemList() {
        return this.itemList;
    }

    public final boolean isCache() {
        return this.isCache;
    }

    public final void setCache(boolean z) {
        this.isCache = z;
    }

    public final void setCursor(int i) {
        this.cursor = i;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setItemList(@NotNull List<DiscoverItemData> list) {
        List<DiscoverItemData> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, changeQuickRedirect, false, 37022, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, changeQuickRedirect, false, 37022, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "<set-?>");
        this.itemList = list2;
    }

    public DiscoverListData(@NotNull List<DiscoverItemData> list, int i, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(list, "itemList");
        this.itemList = list;
        this.cursor = i;
        this.hasMore = z;
        this.isCache = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DiscoverListData(List list, int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i, z, (i2 & 8) != 0 ? false : z2);
    }
}
