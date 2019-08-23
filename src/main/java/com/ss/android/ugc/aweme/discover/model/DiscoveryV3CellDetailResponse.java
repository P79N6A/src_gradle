package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J/\u0010\u0019\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/DiscoveryV3CellDetailResponse;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "awemeList", "", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "hasMore", "", "logPb", "Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;", "(Ljava/util/List;ZLcom/ss/android/ugc/aweme/feed/model/LogPbBean;)V", "getAwemeList", "()Ljava/util/List;", "setAwemeList", "(Ljava/util/List;)V", "getHasMore", "()Z", "setHasMore", "(Z)V", "getLogPb", "()Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;", "setLogPb", "(Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;)V", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DiscoveryV3CellDetailResponse extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("aweme_list")
    @Nullable
    public List<? extends Aweme> awemeList;
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("log_pb")
    @NotNull
    public LogPbBean logPb;

    public static /* synthetic */ DiscoveryV3CellDetailResponse copy$default(DiscoveryV3CellDetailResponse discoveryV3CellDetailResponse, List<? extends Aweme> list, boolean z, LogPbBean logPbBean, int i, Object obj) {
        if ((i & 1) != 0) {
            list = discoveryV3CellDetailResponse.awemeList;
        }
        if ((i & 2) != 0) {
            z = discoveryV3CellDetailResponse.hasMore;
        }
        if ((i & 4) != 0) {
            logPbBean = discoveryV3CellDetailResponse.logPb;
        }
        return discoveryV3CellDetailResponse.copy(list, z, logPbBean);
    }

    @NotNull
    public final DiscoveryV3CellDetailResponse copy(@Nullable List<? extends Aweme> list, boolean z, @NotNull LogPbBean logPbBean) {
        List<? extends Aweme> list2 = list;
        LogPbBean logPbBean2 = logPbBean;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0), logPbBean2}, this, changeQuickRedirect, false, 37037, new Class[]{List.class, Boolean.TYPE, LogPbBean.class}, DiscoveryV3CellDetailResponse.class)) {
            return (DiscoveryV3CellDetailResponse) PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z), logPbBean2}, this, changeQuickRedirect, false, 37037, new Class[]{List.class, Boolean.TYPE, LogPbBean.class}, DiscoveryV3CellDetailResponse.class);
        }
        Intrinsics.checkParameterIsNotNull(logPbBean2, "logPb");
        return new DiscoveryV3CellDetailResponse(list2, z, logPbBean2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 37040, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 37040, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof DiscoveryV3CellDetailResponse) {
                DiscoveryV3CellDetailResponse discoveryV3CellDetailResponse = (DiscoveryV3CellDetailResponse) obj;
                if (Intrinsics.areEqual((Object) this.awemeList, (Object) discoveryV3CellDetailResponse.awemeList)) {
                    if (!(this.hasMore == discoveryV3CellDetailResponse.hasMore) || !Intrinsics.areEqual((Object) this.logPb, (Object) discoveryV3CellDetailResponse.logPb)) {
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37039, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37039, new Class[0], Integer.TYPE)).intValue();
        }
        List<? extends Aweme> list = this.awemeList;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.hasMore;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37038, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37038, new Class[0], String.class);
        }
        return "DiscoveryV3CellDetailResponse(awemeList=" + this.awemeList + ", hasMore=" + this.hasMore + ", logPb=" + this.logPb + ")";
    }

    public final void setLogPb(@NotNull LogPbBean logPbBean) {
        LogPbBean logPbBean2 = logPbBean;
        if (PatchProxy.isSupport(new Object[]{logPbBean2}, this, changeQuickRedirect, false, 37036, new Class[]{LogPbBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{logPbBean2}, this, changeQuickRedirect, false, 37036, new Class[]{LogPbBean.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(logPbBean2, "<set-?>");
        this.logPb = logPbBean2;
    }

    public DiscoveryV3CellDetailResponse(@Nullable List<? extends Aweme> list, boolean z, @NotNull LogPbBean logPbBean) {
        Intrinsics.checkParameterIsNotNull(logPbBean, "logPb");
        this.awemeList = list;
        this.hasMore = z;
        this.logPb = logPbBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DiscoveryV3CellDetailResponse(List list, boolean z, LogPbBean logPbBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? true : z, logPbBean);
    }
}
