package com.ss.android.ugc.aweme.feed.model.poi;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/model/poi/PoiBannerTagStruct;", "", "tagName", "", "tagCode", "", "(Ljava/lang/String;J)V", "getTagCode", "()J", "getTagName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PoiBannerTagStruct {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("tag_code")
    public final long tagCode;
    @SerializedName("tag_name")
    @NotNull
    public final String tagName;

    public static /* synthetic */ PoiBannerTagStruct copy$default(PoiBannerTagStruct poiBannerTagStruct, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = poiBannerTagStruct.tagName;
        }
        if ((i & 2) != 0) {
            j = poiBannerTagStruct.tagCode;
        }
        return poiBannerTagStruct.copy(str, j);
    }

    @NotNull
    public final PoiBannerTagStruct copy(@NotNull String str, long j) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, changeQuickRedirect, false, 41497, new Class[]{String.class, Long.TYPE}, PoiBannerTagStruct.class)) {
            return (PoiBannerTagStruct) PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, changeQuickRedirect, false, 41497, new Class[]{String.class, Long.TYPE}, PoiBannerTagStruct.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "tagName");
        return new PoiBannerTagStruct(str2, j2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 41500, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 41500, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof PoiBannerTagStruct) {
                PoiBannerTagStruct poiBannerTagStruct = (PoiBannerTagStruct) obj;
                if (Intrinsics.areEqual((Object) this.tagName, (Object) poiBannerTagStruct.tagName)) {
                    if (this.tagCode == poiBannerTagStruct.tagCode) {
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41499, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41499, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.tagName;
        if (str != null) {
            i = str.hashCode();
        }
        long j = this.tagCode;
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41498, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41498, new Class[0], String.class);
        }
        return "PoiBannerTagStruct(tagName=" + this.tagName + ", tagCode=" + this.tagCode + ")";
    }

    public PoiBannerTagStruct(@NotNull String str, long j) {
        Intrinsics.checkParameterIsNotNull(str, "tagName");
        this.tagName = str;
        this.tagCode = j;
    }
}
