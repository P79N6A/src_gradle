package com.ss.android.ugc.aweme.discover.hitrank;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.message.model.SimpleUser;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J#\u0010\u000b\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R.\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hitrank/HitNotice;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "userList", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/message/model/SimpleUser;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getUserList", "()Ljava/util/ArrayList;", "setUserList", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HitNotice extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("user_list")
    @NotNull
    private ArrayList<SimpleUser> userList;

    public static /* synthetic */ HitNotice copy$default(HitNotice hitNotice, ArrayList<SimpleUser> arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = hitNotice.userList;
        }
        return hitNotice.copy(arrayList);
    }

    @NotNull
    public final ArrayList<SimpleUser> component1() {
        return this.userList;
    }

    @NotNull
    public final HitNotice copy(@NotNull ArrayList<SimpleUser> arrayList) {
        ArrayList<SimpleUser> arrayList2 = arrayList;
        if (PatchProxy.isSupport(new Object[]{arrayList2}, this, changeQuickRedirect, false, 36373, new Class[]{ArrayList.class}, HitNotice.class)) {
            return (HitNotice) PatchProxy.accessDispatch(new Object[]{arrayList2}, this, changeQuickRedirect, false, 36373, new Class[]{ArrayList.class}, HitNotice.class);
        }
        Intrinsics.checkParameterIsNotNull(arrayList2, "userList");
        return new HitNotice(arrayList2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 36376, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof HitNotice) && Intrinsics.areEqual((Object) this.userList, (Object) ((HitNotice) obj).userList));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 36376, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 36375, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 36375, new Class[0], Integer.TYPE)).intValue();
        }
        ArrayList<SimpleUser> arrayList = this.userList;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 36374, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 36374, new Class[0], String.class);
        }
        return "HitNotice(userList=" + this.userList + ")";
    }

    @NotNull
    public final ArrayList<SimpleUser> getUserList() {
        return this.userList;
    }

    public HitNotice(@NotNull ArrayList<SimpleUser> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "userList");
        this.userList = arrayList;
    }

    public final void setUserList(@NotNull ArrayList<SimpleUser> arrayList) {
        ArrayList<SimpleUser> arrayList2 = arrayList;
        if (PatchProxy.isSupport(new Object[]{arrayList2}, this, changeQuickRedirect, false, 36372, new Class[]{ArrayList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arrayList2}, this, changeQuickRedirect, false, 36372, new Class[]{ArrayList.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(arrayList2, "<set-?>");
        this.userList = arrayList2;
    }
}
