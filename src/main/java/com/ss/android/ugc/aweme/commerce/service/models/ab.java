package com.ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/SpecInfo;", "Ljava/io/Serializable;", "name", "", "list", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/SpecInfoItem;", "(Ljava/lang/String;Ljava/util/List;)V", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class ab implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("list")
    @NotNull
    private List<ac> list;
    @SerializedName("name")
    @NotNull
    private String name;

    public static /* synthetic */ ab copy$default(ab abVar, String str, List<ac> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = abVar.name;
        }
        if ((i & 2) != 0) {
            list2 = abVar.list;
        }
        return abVar.copy(str, list2);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @NotNull
    public final List<ac> component2() {
        return this.list;
    }

    @NotNull
    public final ab copy(@NotNull String str, @NotNull List<ac> list2) {
        String str2 = str;
        List<ac> list3 = list2;
        if (PatchProxy.isSupport(new Object[]{str2, list3}, this, changeQuickRedirect, false, 29892, new Class[]{String.class, List.class}, ab.class)) {
            return (ab) PatchProxy.accessDispatch(new Object[]{str2, list3}, this, changeQuickRedirect, false, 29892, new Class[]{String.class, List.class}, ab.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(list3, "list");
        return new ab(str2, list3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 29895, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 29895, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof ab) {
                ab abVar = (ab) obj;
                if (!Intrinsics.areEqual((Object) this.name, (Object) abVar.name) || !Intrinsics.areEqual((Object) this.list, (Object) abVar.list)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29894, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29894, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.name;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<ac> list2 = this.list;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29893, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29893, new Class[0], String.class);
        }
        return "SpecInfo(name=" + this.name + ", list=" + this.list + ")";
    }

    @NotNull
    public final List<ac> getList() {
        return this.list;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void setList(@NotNull List<ac> list2) {
        List<ac> list3 = list2;
        if (PatchProxy.isSupport(new Object[]{list3}, this, changeQuickRedirect, false, 29891, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3}, this, changeQuickRedirect, false, 29891, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list3, "<set-?>");
        this.list = list3;
    }

    public final void setName(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 29890, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 29890, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.name = str2;
    }

    public ab(@NotNull String str, @NotNull List<ac> list2) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(list2, "list");
        this.name = str;
        this.list = list2;
    }
}
