package com.ss.android.ugc.aweme.follow.presenter;

import android.annotation.SuppressLint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jr\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u0006+"}, d2 = {"Lcom/ss/android/ugc/aweme/follow/presenter/FollowFeedParam;", "", "listQueryType", "", "pullType", "followFeedStyle", "impressionIds", "", "lastFeedsId", "liveTagShow", "insertAwemeId", "pushAids", "pushParams", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFollowFeedStyle", "()I", "getImpressionIds", "()Ljava/lang/String;", "getInsertAwemeId", "getLastFeedsId", "getListQueryType", "getLiveTagShow", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPullType", "getPushAids", "getPushParams", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ss/android/ugc/aweme/follow/presenter/FollowFeedParam;", "equals", "", "other", "hashCode", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"TooManyMethodParam"})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47776a;

    /* renamed from: b  reason: collision with root package name */
    public final int f47777b;

    /* renamed from: c  reason: collision with root package name */
    public final int f47778c;

    /* renamed from: d  reason: collision with root package name */
    public final int f47779d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final String f47780e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final String f47781f;
    @Nullable
    public final Integer g;
    @Nullable
    public final String h;
    @Nullable
    public final String i;
    @Nullable
    public final String j;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f47776a, false, 44673, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f47776a, false, 44673, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f47777b == cVar.f47777b) {
                    if (this.f47778c == cVar.f47778c) {
                        if (!(this.f47779d == cVar.f47779d) || !Intrinsics.areEqual((Object) this.f47780e, (Object) cVar.f47780e) || !Intrinsics.areEqual((Object) this.f47781f, (Object) cVar.f47781f) || !Intrinsics.areEqual((Object) this.g, (Object) cVar.g) || !Intrinsics.areEqual((Object) this.h, (Object) cVar.h) || !Intrinsics.areEqual((Object) this.i, (Object) cVar.i) || !Intrinsics.areEqual((Object) this.j, (Object) cVar.j)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f47776a, false, 44672, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f47776a, false, 44672, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = ((((this.f47777b * 31) + this.f47778c) * 31) + this.f47779d) * 31;
        String str = this.f47780e;
        int hashCode = (i3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f47781f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.g;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.h;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.i;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.j;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode5 + i2;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f47776a, false, 44671, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f47776a, false, 44671, new Class[0], String.class);
        }
        return "FollowFeedParam(listQueryType=" + this.f47777b + ", pullType=" + this.f47778c + ", followFeedStyle=" + this.f47779d + ", impressionIds=" + this.f47780e + ", lastFeedsId=" + this.f47781f + ", liveTagShow=" + this.g + ", insertAwemeId=" + this.h + ", pushAids=" + this.i + ", pushParams=" + this.j + ")";
    }

    public c(int i2, int i3, int i4, @NotNull String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        Intrinsics.checkParameterIsNotNull(str, "impressionIds");
        this.f47777b = i2;
        this.f47778c = i3;
        this.f47779d = i4;
        this.f47780e = str;
        this.f47781f = str2;
        this.g = num;
        this.h = str3;
        this.i = str4;
        this.j = str5;
    }
}
