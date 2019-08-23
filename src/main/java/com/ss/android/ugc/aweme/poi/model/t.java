package com.ss.android.ugc.aweme.poi.model;

import com.bytedance.common.utility.StringUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0006\u0010\u0012\u001a\u00020\rJ\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/model/PoiCouponActivityStruct;", "Ljava/io/Serializable;", "id", "", "title", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "isValid", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class t implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("id")
    @NotNull
    private final String id;
    @SerializedName("title")
    @NotNull
    private final String title;

    public static /* synthetic */ t copy$default(t tVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tVar.id;
        }
        if ((i & 2) != 0) {
            str2 = tVar.title;
        }
        return tVar.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final t copy(@NotNull String str, @NotNull String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, changeQuickRedirect, false, 65036, new Class[]{String.class, String.class}, t.class)) {
            return (t) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, changeQuickRedirect, false, 65036, new Class[]{String.class, String.class}, t.class);
        }
        Intrinsics.checkParameterIsNotNull(str3, "id");
        Intrinsics.checkParameterIsNotNull(str4, PushConstants.TITLE);
        return new t(str3, str4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 65039, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 65039, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof t) {
                t tVar = (t) obj;
                if (!Intrinsics.areEqual((Object) this.id, (Object) tVar.id) || !Intrinsics.areEqual((Object) this.title, (Object) tVar.title)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65038, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65038, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.id;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65037, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65037, new Class[0], String.class);
        }
        return "PoiCouponActivityStruct(id=" + this.id + ", title=" + this.title + ")";
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final boolean isValid() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65035, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65035, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!StringUtils.isEmpty(this.id)) {
            z = true;
        }
        return z;
    }

    public t(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, PushConstants.TITLE);
        this.id = str;
        this.title = str2;
    }
}
