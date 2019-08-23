package com.ss.android.ugc.aweme.commercialize.model;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0001\u001dB!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0006\u0010\u001b\u001a\u00020\u0003J\b\u0010\u001c\u001a\u00020\u0003H\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/model/OpenAppBackLogParams;", "Ljava/io/Serializable;", "tag", "", "startTime", "", "awemeRawAd", "Lcom/ss/android/ugc/aweme/feed/model/AwemeRawAd;", "(Ljava/lang/String;JLcom/ss/android/ugc/aweme/feed/model/AwemeRawAd;)V", "getAwemeRawAd", "()Lcom/ss/android/ugc/aweme/feed/model/AwemeRawAd;", "getStartTime", "()J", "setStartTime", "(J)V", "getTag", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toJson", "toString", "Builder", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class l implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private final AwemeRawAd awemeRawAd;
    private long startTime;
    @NotNull
    private final String tag;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/model/OpenAppBackLogParams$Builder;", "", "()V", "awemeRawAd", "Lcom/ss/android/ugc/aweme/feed/model/AwemeRawAd;", "getAwemeRawAd", "()Lcom/ss/android/ugc/aweme/feed/model/AwemeRawAd;", "setAwemeRawAd", "(Lcom/ss/android/ugc/aweme/feed/model/AwemeRawAd;)V", "startTime", "", "getStartTime", "()J", "setStartTime", "(J)V", "tag", "", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "build", "Lcom/ss/android/ugc/aweme/commercialize/model/OpenAppBackLogParams;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39390a;
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public String f39391b = "";

        /* renamed from: c  reason: collision with root package name */
        public long f39392c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public AwemeRawAd f39393d;

        @NotNull
        public final l a() {
            if (PatchProxy.isSupport(new Object[0], this, f39390a, false, 31918, new Class[0], l.class)) {
                return (l) PatchProxy.accessDispatch(new Object[0], this, f39390a, false, 31918, new Class[0], l.class);
            }
            l lVar = new l(this.f39391b, this.f39392c, this.f39393d, null);
            return lVar;
        }

        @NotNull
        public final a a(long j) {
            a aVar = this;
            aVar.f39392c = j;
            return aVar;
        }

        @NotNull
        public final a a(@Nullable AwemeRawAd awemeRawAd) {
            a aVar = this;
            aVar.f39393d = awemeRawAd;
            return aVar;
        }

        @NotNull
        public final a a(@NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f39390a, false, 31917, new Class[]{String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str2}, this, f39390a, false, 31917, new Class[]{String.class}, a.class);
            }
            Intrinsics.checkParameterIsNotNull(str2, "tag");
            a aVar = this;
            aVar.f39391b = str2;
            return aVar;
        }
    }

    public static /* synthetic */ l copy$default(l lVar, String str, long j, AwemeRawAd awemeRawAd2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lVar.tag;
        }
        if ((i & 2) != 0) {
            j = lVar.startTime;
        }
        if ((i & 4) != 0) {
            awemeRawAd2 = lVar.awemeRawAd;
        }
        return lVar.copy(str, j, awemeRawAd2);
    }

    @NotNull
    public final String component1() {
        return this.tag;
    }

    public final long component2() {
        return this.startTime;
    }

    @Nullable
    public final AwemeRawAd component3() {
        return this.awemeRawAd;
    }

    @NotNull
    public final l copy(@NotNull String str, long j, @Nullable AwemeRawAd awemeRawAd2) {
        String str2 = str;
        long j2 = j;
        AwemeRawAd awemeRawAd3 = awemeRawAd2;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2), awemeRawAd3}, this, changeQuickRedirect, false, 31913, new Class[]{String.class, Long.TYPE, AwemeRawAd.class}, l.class)) {
            return (l) PatchProxy.accessDispatch(new Object[]{str2, new Long(j2), awemeRawAd3}, this, changeQuickRedirect, false, 31913, new Class[]{String.class, Long.TYPE, AwemeRawAd.class}, l.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "tag");
        return new l(str2, j2, awemeRawAd3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 31915, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 31915, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (Intrinsics.areEqual((Object) this.tag, (Object) lVar.tag)) {
                    if (!(this.startTime == lVar.startTime) || !Intrinsics.areEqual((Object) this.awemeRawAd, (Object) lVar.awemeRawAd)) {
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31914, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31914, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.tag;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.startTime;
        int i2 = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        AwemeRawAd awemeRawAd2 = this.awemeRawAd;
        if (awemeRawAd2 != null) {
            i = awemeRawAd2.hashCode();
        }
        return i2 + i;
    }

    @Nullable
    public final AwemeRawAd getAwemeRawAd() {
        return this.awemeRawAd;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final String toJson() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31911, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31911, new Class[0], String.class);
        }
        String json = new Gson().toJson((Object) this);
        Intrinsics.checkExpressionValueIsNotNull(json, "Gson().toJson(this)");
        return json;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31912, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31912, new Class[0], String.class);
        }
        return "tag=" + this.tag + ", startTime=" + this.startTime + ", awemeRawAd=" + this.awemeRawAd;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    private l(String str, long j, AwemeRawAd awemeRawAd2) {
        this.tag = str;
        this.startTime = j;
        this.awemeRawAd = awemeRawAd2;
    }

    public /* synthetic */ l(String str, long j, AwemeRawAd awemeRawAd2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, awemeRawAd2);
    }
}
