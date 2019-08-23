package com.ss.android.ugc.aweme.account.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/account/bean/PlatformInfo;", "", "name", "", "iconResID", "", "type", "(Ljava/lang/String;ILjava/lang/String;)V", "getIconResID", "()I", "getName", "()Ljava/lang/String;", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "accountapi_release"}, k = 1, mv = {1, 1, 13})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31811a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final String f31812b;

    /* renamed from: c  reason: collision with root package name */
    public final int f31813c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final String f31814d;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f31811a, false, 19833, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f31811a, false, 19833, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (Intrinsics.areEqual((Object) this.f31812b, (Object) aVar.f31812b)) {
                    if (!(this.f31813c == aVar.f31813c) || !Intrinsics.areEqual((Object) this.f31814d, (Object) aVar.f31814d)) {
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
        if (PatchProxy.isSupport(new Object[0], this, f31811a, false, 19832, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f31811a, false, 19832, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.f31812b;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f31813c) * 31;
        String str2 = this.f31814d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f31811a, false, 19831, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f31811a, false, 19831, new Class[0], String.class);
        }
        return "PlatformInfo(name=" + this.f31812b + ", iconResID=" + this.f31813c + ", type=" + this.f31814d + ")";
    }

    public a(@NotNull String str, int i, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(str2, "type");
        this.f31812b = str;
        this.f31813c = i;
        this.f31814d = str2;
    }
}
