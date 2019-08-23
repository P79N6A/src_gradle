package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J9\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R&\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/DiscoveryV3CellListResponse;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "nextCursor", "", "cells", "", "Lcom/ss/android/ugc/aweme/discover/model/DiscoveryCellStructV3;", "hasMore", "logPb", "Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;", "(ILjava/util/List;ILcom/ss/android/ugc/aweme/feed/model/LogPbBean;)V", "getCells", "()Ljava/util/List;", "setCells", "(Ljava/util/List;)V", "getHasMore", "()I", "setHasMore", "(I)V", "getLogPb", "()Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;", "setLogPb", "(Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;)V", "getNextCursor", "setNextCursor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DiscoveryV3CellListResponse extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cells")
    @Nullable
    public List<DiscoveryCellStructV3> cells;
    @SerializedName("has_more")
    public int hasMore;
    @SerializedName("log_pb")
    @NotNull
    public LogPbBean logPb;
    @SerializedName("next_cursor")
    public int nextCursor;

    public static /* synthetic */ DiscoveryV3CellListResponse copy$default(DiscoveryV3CellListResponse discoveryV3CellListResponse, int i, List<DiscoveryCellStructV3> list, int i2, LogPbBean logPbBean, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = discoveryV3CellListResponse.nextCursor;
        }
        if ((i3 & 2) != 0) {
            list = discoveryV3CellListResponse.cells;
        }
        if ((i3 & 4) != 0) {
            i2 = discoveryV3CellListResponse.hasMore;
        }
        if ((i3 & 8) != 0) {
            logPbBean = discoveryV3CellListResponse.logPb;
        }
        return discoveryV3CellListResponse.copy(i, list, i2, logPbBean);
    }

    @NotNull
    public final DiscoveryV3CellListResponse copy(int i, @Nullable List<DiscoveryCellStructV3> list, int i2, @NotNull LogPbBean logPbBean) {
        List<DiscoveryCellStructV3> list2 = list;
        LogPbBean logPbBean2 = logPbBean;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), list2, Integer.valueOf(i2), logPbBean2}, this, changeQuickRedirect, false, 37042, new Class[]{Integer.TYPE, List.class, Integer.TYPE, LogPbBean.class}, DiscoveryV3CellListResponse.class)) {
            return (DiscoveryV3CellListResponse) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), list2, Integer.valueOf(i2), logPbBean2}, this, changeQuickRedirect, false, 37042, new Class[]{Integer.TYPE, List.class, Integer.TYPE, LogPbBean.class}, DiscoveryV3CellListResponse.class);
        }
        Intrinsics.checkParameterIsNotNull(logPbBean2, "logPb");
        return new DiscoveryV3CellListResponse(i, list2, i2, logPbBean2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 37045, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 37045, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof DiscoveryV3CellListResponse) {
                DiscoveryV3CellListResponse discoveryV3CellListResponse = (DiscoveryV3CellListResponse) obj;
                if ((this.nextCursor == discoveryV3CellListResponse.nextCursor) && Intrinsics.areEqual((Object) this.cells, (Object) discoveryV3CellListResponse.cells)) {
                    if (!(this.hasMore == discoveryV3CellListResponse.hasMore) || !Intrinsics.areEqual((Object) this.logPb, (Object) discoveryV3CellListResponse.logPb)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37044, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37044, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.nextCursor * 31;
        List<DiscoveryCellStructV3> list = this.cells;
        int hashCode = (((i2 + (list != null ? list.hashCode() : 0)) * 31) + this.hasMore) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37043, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37043, new Class[0], String.class);
        }
        return "DiscoveryV3CellListResponse(nextCursor=" + this.nextCursor + ", cells=" + this.cells + ", hasMore=" + this.hasMore + ", logPb=" + this.logPb + ")";
    }

    public final void setLogPb(@NotNull LogPbBean logPbBean) {
        LogPbBean logPbBean2 = logPbBean;
        if (PatchProxy.isSupport(new Object[]{logPbBean2}, this, changeQuickRedirect, false, 37041, new Class[]{LogPbBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{logPbBean2}, this, changeQuickRedirect, false, 37041, new Class[]{LogPbBean.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(logPbBean2, "<set-?>");
        this.logPb = logPbBean2;
    }

    public DiscoveryV3CellListResponse(int i, @Nullable List<DiscoveryCellStructV3> list, int i2, @NotNull LogPbBean logPbBean) {
        Intrinsics.checkParameterIsNotNull(logPbBean, "logPb");
        this.nextCursor = i;
        this.cells = list;
        this.hasMore = i2;
        this.logPb = logPbBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DiscoveryV3CellListResponse(int i, List list, int i2, LogPbBean logPbBean, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, (i3 & 4) != 0 ? 1 : i2, logPbBean);
    }
}
