package com.ss.android.ugc.aweme.friends.recommendlist.repository;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/SearchUserRequestParam;", "", "cursor", "", "keyword", "", "count", "", "type", "pullRefresh", "hotSearch", "source", "(JLjava/lang/String;IIIILjava/lang/String;)V", "getCount", "()I", "getCursor", "()J", "getHotSearch", "getKeyword", "()Ljava/lang/String;", "getPullRefresh", "getSource", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49010a;

    /* renamed from: b  reason: collision with root package name */
    public final long f49011b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f49012c;

    /* renamed from: d  reason: collision with root package name */
    public final int f49013d;

    /* renamed from: e  reason: collision with root package name */
    public final int f49014e;

    /* renamed from: f  reason: collision with root package name */
    public final int f49015f;
    public final int g;
    @NotNull
    public final String h;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f49010a, false, 46793, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f49010a, false, 46793, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof i) {
                i iVar = (i) obj;
                if ((this.f49011b == iVar.f49011b) && Intrinsics.areEqual((Object) this.f49012c, (Object) iVar.f49012c)) {
                    if (this.f49013d == iVar.f49013d) {
                        if (this.f49014e == iVar.f49014e) {
                            if (this.f49015f == iVar.f49015f) {
                                if (!(this.g == iVar.g) || !Intrinsics.areEqual((Object) this.h, (Object) iVar.h)) {
                                    return false;
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
        if (PatchProxy.isSupport(new Object[0], this, f49010a, false, 46792, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f49010a, false, 46792, new Class[0], Integer.TYPE)).intValue();
        }
        long j = this.f49011b;
        int i2 = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f49012c;
        int hashCode = (((((((((i2 + (str != null ? str.hashCode() : 0)) * 31) + this.f49013d) * 31) + this.f49014e) * 31) + this.f49015f) * 31) + this.g) * 31;
        String str2 = this.h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f49010a, false, 46791, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f49010a, false, 46791, new Class[0], String.class);
        }
        return "SearchUserRequestParam(cursor=" + this.f49011b + ", keyword=" + this.f49012c + ", count=" + this.f49013d + ", type=" + this.f49014e + ", pullRefresh=" + this.f49015f + ", hotSearch=" + this.g + ", source=" + this.h + ")";
    }

    public i(long j, @NotNull String str, int i, int i2, int i3, int i4, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, "keyword");
        Intrinsics.checkParameterIsNotNull(str2, "source");
        this.f49011b = j;
        this.f49012c = str;
        this.f49013d = i;
        this.f49014e = i2;
        this.f49015f = i3;
        this.g = i4;
        this.h = str2;
    }
}
