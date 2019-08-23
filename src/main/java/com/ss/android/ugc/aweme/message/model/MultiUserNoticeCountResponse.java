package com.ss.android.ugc.aweme.message.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/message/model/MultiUserNoticeCountResponse;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "noticeLists", "", "Lcom/ss/android/ugc/aweme/message/model/NoticeList;", "(Ljava/util/List;)V", "getNoticeLists", "()Ljava/util/List;", "setNoticeLists", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class MultiUserNoticeCountResponse extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("data")
    @Nullable
    public List<? extends NoticeList> noticeLists;

    public MultiUserNoticeCountResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ MultiUserNoticeCountResponse copy$default(MultiUserNoticeCountResponse multiUserNoticeCountResponse, List<? extends NoticeList> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = multiUserNoticeCountResponse.noticeLists;
        }
        return multiUserNoticeCountResponse.copy(list);
    }

    @NotNull
    public final MultiUserNoticeCountResponse copy(@Nullable List<? extends NoticeList> list) {
        List<? extends NoticeList> list2 = list;
        if (!PatchProxy.isSupport(new Object[]{list2}, this, changeQuickRedirect, false, 58731, new Class[]{List.class}, MultiUserNoticeCountResponse.class)) {
            return new MultiUserNoticeCountResponse(list2);
        }
        return (MultiUserNoticeCountResponse) PatchProxy.accessDispatch(new Object[]{list2}, this, changeQuickRedirect, false, 58731, new Class[]{List.class}, MultiUserNoticeCountResponse.class);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 58734, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof MultiUserNoticeCountResponse) && Intrinsics.areEqual((Object) this.noticeLists, (Object) ((MultiUserNoticeCountResponse) obj).noticeLists));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 58734, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 58733, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 58733, new Class[0], Integer.TYPE)).intValue();
        }
        List<? extends NoticeList> list = this.noticeLists;
        if (list != null) {
            i = list.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 58732, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 58732, new Class[0], String.class);
        }
        return "MultiUserNoticeCountResponse(noticeLists=" + this.noticeLists + ")";
    }

    public MultiUserNoticeCountResponse(@Nullable List<? extends NoticeList> list) {
        this.noticeLists = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MultiUserNoticeCountResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
