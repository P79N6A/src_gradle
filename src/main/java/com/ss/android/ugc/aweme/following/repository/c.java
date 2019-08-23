package com.ss.android.ugc.aweme.following.repository;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/aweme/following/repository/FollowRelationQueryParam;", "", "userId", "", "maxTime", "", "count", "", "offset", "sourceType", "addressBookAccess", "gpsAccess", "(Ljava/lang/String;JIIIII)V", "getAddressBookAccess", "()I", "getCount", "getGpsAccess", "getMaxTime", "()J", "getOffset", "getSourceType", "getUserId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47924a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final String f47925b;

    /* renamed from: c  reason: collision with root package name */
    public final long f47926c;

    /* renamed from: d  reason: collision with root package name */
    public final int f47927d;

    /* renamed from: e  reason: collision with root package name */
    public final int f47928e;

    /* renamed from: f  reason: collision with root package name */
    public final int f47929f;
    public final int g;
    public final int h;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f47924a, false, 44810, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f47924a, false, 44810, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (Intrinsics.areEqual((Object) this.f47925b, (Object) cVar.f47925b)) {
                    if (this.f47926c == cVar.f47926c) {
                        if (this.f47927d == cVar.f47927d) {
                            if (this.f47928e == cVar.f47928e) {
                                if (this.f47929f == cVar.f47929f) {
                                    if (this.g == cVar.g) {
                                        if (this.h == cVar.h) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f47924a, false, 44809, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f47924a, false, 44809, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.f47925b;
        if (str != null) {
            i = str.hashCode();
        }
        long j = this.f47926c;
        return (((((((((((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f47927d) * 31) + this.f47928e) * 31) + this.f47929f) * 31) + this.g) * 31) + this.h;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f47924a, false, 44808, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f47924a, false, 44808, new Class[0], String.class);
        }
        return "FollowRelationQueryParam(userId=" + this.f47925b + ", maxTime=" + this.f47926c + ", count=" + this.f47927d + ", offset=" + this.f47928e + ", sourceType=" + this.f47929f + ", addressBookAccess=" + this.g + ", gpsAccess=" + this.h + ")";
    }

    public c(@NotNull String str, long j, int i, int i2, int i3, int i4, int i5) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        this.f47925b = str;
        this.f47926c = j;
        this.f47927d = i;
        this.f47928e = i2;
        this.f47929f = i3;
        this.g = i4;
        this.h = i5;
    }
}
