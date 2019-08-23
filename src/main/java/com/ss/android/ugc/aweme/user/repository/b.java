package com.ss.android.ugc.aweme.user.repository;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/user/repository/FollowRequestParam;", "", "userId", "", "secUserId", "type", "", "channelId", "from", "itemId", "fromPreviousPage", "(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;I)V", "getChannelId", "()I", "getFrom", "getFromPreviousPage", "getItemId", "()Ljava/lang/String;", "getSecUserId", "getType", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75364a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final String f75365b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f75366c;

    /* renamed from: d  reason: collision with root package name */
    public final int f75367d;

    /* renamed from: e  reason: collision with root package name */
    public final int f75368e;

    /* renamed from: f  reason: collision with root package name */
    public final int f75369f;
    @Nullable
    public final String g;
    public final int h;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f75364a, false, 87660, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f75364a, false, 87660, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Intrinsics.areEqual((Object) this.f75365b, (Object) bVar.f75365b) && Intrinsics.areEqual((Object) this.f75366c, (Object) bVar.f75366c)) {
                    if (this.f75367d == bVar.f75367d) {
                        if (this.f75368e == bVar.f75368e) {
                            if ((this.f75369f == bVar.f75369f) && Intrinsics.areEqual((Object) this.g, (Object) bVar.g)) {
                                if (this.h == bVar.h) {
                                    return true;
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
        if (PatchProxy.isSupport(new Object[0], this, f75364a, false, 87659, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f75364a, false, 87659, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.f75365b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f75366c;
        int hashCode2 = (((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f75367d) * 31) + this.f75368e) * 31) + this.f75369f) * 31;
        String str3 = this.g;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.h;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f75364a, false, 87658, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f75364a, false, 87658, new Class[0], String.class);
        }
        return "FollowRequestParam(userId=" + this.f75365b + ", secUserId=" + this.f75366c + ", type=" + this.f75367d + ", channelId=" + this.f75368e + ", from=" + this.f75369f + ", itemId=" + this.g + ", fromPreviousPage=" + this.h + ")";
    }

    public b(@NotNull String str, @NotNull String str2, int i, int i2, int i3, @Nullable String str3, int i4) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(str2, "secUserId");
        this.f75365b = str;
        this.f75366c = str2;
        this.f75367d = i;
        this.f75368e = i2;
        this.f75369f = i3;
        this.g = str3;
        this.h = i4;
    }
}
