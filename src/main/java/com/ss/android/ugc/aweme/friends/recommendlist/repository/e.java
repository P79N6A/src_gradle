package com.ss.android.ugc.aweme.friends.recommendlist.repository;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJx\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u001c\u0010\u000f¨\u0006-"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/RecommendListRequestParams;", "", "count", "", "cursor", "targetUserId", "", "recommendType", "yellowPointCount", "addressBookAccess", "recImprUsers", "pushUserId", "gpsAccess", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAddressBookAccess", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCount", "getCursor", "getGpsAccess", "setGpsAccess", "(Ljava/lang/Integer;)V", "getPushUserId", "()Ljava/lang/String;", "getRecImprUsers", "getRecommendType", "()I", "getTargetUserId", "getYellowPointCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/RecommendListRequestParams;", "equals", "", "other", "hashCode", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48998a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final Integer f48999b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final Integer f49000c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final String f49001d;

    /* renamed from: e  reason: collision with root package name */
    public final int f49002e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final Integer f49003f;
    @Nullable
    public final Integer g;
    @Nullable
    public final String h;
    @Nullable
    public final String i;
    @Nullable
    public Integer j;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f48998a, false, 46775, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f48998a, false, 46775, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (Intrinsics.areEqual((Object) this.f48999b, (Object) eVar.f48999b) && Intrinsics.areEqual((Object) this.f49000c, (Object) eVar.f49000c) && Intrinsics.areEqual((Object) this.f49001d, (Object) eVar.f49001d)) {
                    if (!(this.f49002e == eVar.f49002e) || !Intrinsics.areEqual((Object) this.f49003f, (Object) eVar.f49003f) || !Intrinsics.areEqual((Object) this.g, (Object) eVar.g) || !Intrinsics.areEqual((Object) this.h, (Object) eVar.h) || !Intrinsics.areEqual((Object) this.i, (Object) eVar.i) || !Intrinsics.areEqual((Object) this.j, (Object) eVar.j)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f48998a, false, 46774, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f48998a, false, 46774, new Class[0], Integer.TYPE)).intValue();
        }
        Integer num = this.f48999b;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f49000c;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.f49001d;
        int hashCode3 = (((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.f49002e) * 31;
        Integer num3 = this.f49003f;
        int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.g;
        int hashCode5 = (hashCode4 + (num4 != null ? num4.hashCode() : 0)) * 31;
        String str2 = this.h;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.i;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num5 = this.j;
        if (num5 != null) {
            i2 = num5.hashCode();
        }
        return hashCode7 + i2;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f48998a, false, 46773, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f48998a, false, 46773, new Class[0], String.class);
        }
        return "RecommendListRequestParams(count=" + this.f48999b + ", cursor=" + this.f49000c + ", targetUserId=" + this.f49001d + ", recommendType=" + this.f49002e + ", yellowPointCount=" + this.f49003f + ", addressBookAccess=" + this.g + ", recImprUsers=" + this.h + ", pushUserId=" + this.i + ", gpsAccess=" + this.j + ")";
    }

    public e(@Nullable Integer num, @Nullable Integer num2, @Nullable String str, int i2, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str2, @Nullable String str3, @Nullable Integer num5) {
        this.f48999b = num;
        this.f49000c = num2;
        this.f49001d = str;
        this.f49002e = i2;
        this.f49003f = num3;
        this.g = num4;
        this.h = str2;
        this.i = str3;
        this.j = num5;
    }
}
