package com.ss.android.ugc.aweme.requestcombine.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.message.model.NoticeList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/requestcombine/model/NoticeCountCombineModel;", "Lcom/ss/android/ugc/aweme/requestcombine/model/BaseCombineMode;", "noticeList", "Lcom/ss/android/ugc/aweme/message/model/NoticeList;", "(Lcom/ss/android/ugc/aweme/message/model/NoticeList;)V", "getNoticeList", "()Lcom/ss/android/ugc/aweme/message/model/NoticeList;", "setNoticeList", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class NoticeCountCombineModel extends BaseCombineMode {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("body")
    @NotNull
    private NoticeList noticeList;

    public static /* synthetic */ NoticeCountCombineModel copy$default(NoticeCountCombineModel noticeCountCombineModel, NoticeList noticeList2, int i, Object obj) {
        if ((i & 1) != 0) {
            noticeList2 = noticeCountCombineModel.noticeList;
        }
        return noticeCountCombineModel.copy(noticeList2);
    }

    @NotNull
    public final NoticeList component1() {
        return this.noticeList;
    }

    @NotNull
    public final NoticeCountCombineModel copy(@NotNull NoticeList noticeList2) {
        NoticeList noticeList3 = noticeList2;
        if (PatchProxy.isSupport(new Object[]{noticeList3}, this, changeQuickRedirect, false, 70741, new Class[]{NoticeList.class}, NoticeCountCombineModel.class)) {
            return (NoticeCountCombineModel) PatchProxy.accessDispatch(new Object[]{noticeList3}, this, changeQuickRedirect, false, 70741, new Class[]{NoticeList.class}, NoticeCountCombineModel.class);
        }
        Intrinsics.checkParameterIsNotNull(noticeList3, "noticeList");
        return new NoticeCountCombineModel(noticeList3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 70744, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof NoticeCountCombineModel) && Intrinsics.areEqual((Object) this.noticeList, (Object) ((NoticeCountCombineModel) obj).noticeList));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 70744, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70743, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70743, new Class[0], Integer.TYPE)).intValue();
        }
        NoticeList noticeList2 = this.noticeList;
        if (noticeList2 != null) {
            i = noticeList2.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70742, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70742, new Class[0], String.class);
        }
        return "NoticeCountCombineModel(noticeList=" + this.noticeList + ")";
    }

    @NotNull
    public final NoticeList getNoticeList() {
        return this.noticeList;
    }

    public NoticeCountCombineModel(@NotNull NoticeList noticeList2) {
        Intrinsics.checkParameterIsNotNull(noticeList2, "noticeList");
        this.noticeList = noticeList2;
    }

    public final void setNoticeList(@NotNull NoticeList noticeList2) {
        NoticeList noticeList3 = noticeList2;
        if (PatchProxy.isSupport(new Object[]{noticeList3}, this, changeQuickRedirect, false, 70740, new Class[]{NoticeList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{noticeList3}, this, changeQuickRedirect, false, 70740, new Class[]{NoticeList.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(noticeList3, "<set-?>");
        this.noticeList = noticeList3;
    }
}
