package com.ss.android.ugc.aweme.poi.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/model/PoiTagStruct;", "", "tagName", "", "tagType", "", "(Ljava/lang/String;I)V", "getTagName", "()Ljava/lang/String;", "getTagType", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class at {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59890a;
    @SerializedName("tag_name")
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final String f59891b;
    @SerializedName("tag_type")

    /* renamed from: c  reason: collision with root package name */
    public final int f59892c;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f59890a, false, 65165, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f59890a, false, 65165, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof at) {
                at atVar = (at) obj;
                if (Intrinsics.areEqual((Object) this.f59891b, (Object) atVar.f59891b)) {
                    if (this.f59892c == atVar.f59892c) {
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
        if (PatchProxy.isSupport(new Object[0], this, f59890a, false, 65164, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f59890a, false, 65164, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.f59891b;
        if (str != null) {
            i = str.hashCode();
        }
        return (i * 31) + this.f59892c;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f59890a, false, 65163, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f59890a, false, 65163, new Class[0], String.class);
        }
        return "PoiTagStruct(tagName=" + this.f59891b + ", tagType=" + this.f59892c + ")";
    }
}
