package com.ss.android.ugc.aweme.favorites.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/favorites/bean/CollectionTabStruct;", "", "collectionType", "", "title", "", "(ILjava/lang/String;)V", "getCollectionType", "()I", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44199a;
    @SerializedName("collection_type")

    /* renamed from: b  reason: collision with root package name */
    public final int f44200b;
    @SerializedName("title")
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f44201c;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f44199a, false, 39439, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f44199a, false, 39439, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (!(this.f44200b == cVar.f44200b) || !Intrinsics.areEqual((Object) this.f44201c, (Object) cVar.f44201c)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f44199a, false, 39438, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f44199a, false, 39438, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.f44200b * 31;
        String str = this.f44201c;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f44199a, false, 39437, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f44199a, false, 39437, new Class[0], String.class);
        }
        return "CollectionTabStruct(collectionType=" + this.f44200b + ", title=" + this.f44201c + ")";
    }
}
