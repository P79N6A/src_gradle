package com.ss.android.ugc.aweme.crossplatform.params;

import android.annotation.SuppressLint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\bj\b\b\u0018\u00002\u00020\u0001B\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\t\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0007¢\u0006\u0002\u0010\u001eJ\t\u0010V\u001a\u00020\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010Y\u001a\u00020\tHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010[\u001a\u00020\tHÆ\u0003J\t\u0010\\\u001a\u00020\tHÆ\u0003J\t\u0010]\u001a\u00020\tHÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010c\u001a\u00020\u0007HÆ\u0003J\t\u0010d\u001a\u00020\u0007HÆ\u0003J\t\u0010e\u001a\u00020\tHÆ\u0003J\t\u0010f\u001a\u00020\u0007HÆ\u0003J\t\u0010g\u001a\u00020\u0007HÆ\u0003J\t\u0010h\u001a\u00020\tHÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0002\u0010n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\u0007HÆ\u0001J\u0013\u0010o\u001a\u00020\t2\b\u0010p\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010q\u001a\u00020\u0007HÖ\u0001J\t\u0010r\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u001a\u0010\u0015\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R\u001a\u0010\u0011\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010$\"\u0004\b8\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010$\"\u0004\b:\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010$\"\u0004\b<\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010$\"\u0004\b>\u0010&R\u001a\u0010\u0014\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010.\"\u0004\b@\u00100R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010$\"\u0004\bB\u0010&R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010$\"\u0004\bD\u0010&R\u001a\u0010\u001c\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010.\"\u0004\bF\u00100R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010.\"\u0004\bG\u00100R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010$\"\u0004\bI\u0010&R\u001a\u0010\u001a\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010(\"\u0004\bK\u0010*R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010$\"\u0004\bM\u0010&R\u001a\u0010\u0013\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010.\"\u0004\bO\u00100R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010$\"\u0004\bQ\u0010&R\u001a\u0010\u001b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010(\"\u0004\bS\u0010*R\u001a\u0010\u001d\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010(\"\u0004\bU\u0010*¨\u0006s"}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/params/CommerceInfo;", "", "adId", "", "adType", "", "adSystemOrigin", "", "isFromAppAd", "", "downloadUrl", "downloadAppName", "downloadPkgName", "downloadAppExtra", "logExtra", "gdLabel", "gdExtJson", "disableDownloadDialog", "creativeId", "showDownloadStatusBar", "forbidJump", "canSendStat", "adJsUrl", "douPlusMonitorUrl", "quickAppUrl", "siteId", "preloadWeb", "useWebUrl", "interceptEPlatform", "webType", "(JLjava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZI)V", "getAdId", "()J", "setAdId", "(J)V", "getAdJsUrl", "()Ljava/lang/String;", "setAdJsUrl", "(Ljava/lang/String;)V", "getAdSystemOrigin", "()I", "setAdSystemOrigin", "(I)V", "getAdType", "setAdType", "getCanSendStat", "()Z", "setCanSendStat", "(Z)V", "getCreativeId", "setCreativeId", "getDisableDownloadDialog", "setDisableDownloadDialog", "getDouPlusMonitorUrl", "setDouPlusMonitorUrl", "getDownloadAppExtra", "setDownloadAppExtra", "getDownloadAppName", "setDownloadAppName", "getDownloadPkgName", "setDownloadPkgName", "getDownloadUrl", "setDownloadUrl", "getForbidJump", "setForbidJump", "getGdExtJson", "setGdExtJson", "getGdLabel", "setGdLabel", "getInterceptEPlatform", "setInterceptEPlatform", "setFromAppAd", "getLogExtra", "setLogExtra", "getPreloadWeb", "setPreloadWeb", "getQuickAppUrl", "setQuickAppUrl", "getShowDownloadStatusBar", "setShowDownloadStatusBar", "getSiteId", "setSiteId", "getUseWebUrl", "setUseWebUrl", "getWebType", "setWebType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"TooManyMethodParam"})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40799a;

    /* renamed from: b  reason: collision with root package name */
    public long f40800b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public String f40801c;

    /* renamed from: d  reason: collision with root package name */
    public int f40802d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f40803e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public String f40804f;
    @Nullable
    public String g;
    @Nullable
    public String h;
    @Nullable
    public String i;
    @Nullable
    public String j;
    @Nullable
    public String k;
    @Nullable
    public String l;
    public boolean m;
    @Nullable
    public String n;
    public boolean o;
    public boolean p;
    public boolean q;
    @Nullable
    public String r;
    @Nullable
    public String s;
    @Nullable
    public String t;
    @Nullable
    public String u;
    public int v;
    public int w;
    public boolean x;
    public int y;

    public b() {
        this(0, null, 0, false, null, null, null, null, null, null, null, false, null, false, false, false, null, null, null, null, 0, 0, false, 0, 16777215);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f40799a, false, 34301, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f40799a, false, 34301, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if ((this.f40800b == bVar.f40800b) && Intrinsics.areEqual((Object) this.f40801c, (Object) bVar.f40801c)) {
                    if (this.f40802d == bVar.f40802d) {
                        if ((this.f40803e == bVar.f40803e) && Intrinsics.areEqual((Object) this.f40804f, (Object) bVar.f40804f) && Intrinsics.areEqual((Object) this.g, (Object) bVar.g) && Intrinsics.areEqual((Object) this.h, (Object) bVar.h) && Intrinsics.areEqual((Object) this.i, (Object) bVar.i) && Intrinsics.areEqual((Object) this.j, (Object) bVar.j) && Intrinsics.areEqual((Object) this.k, (Object) bVar.k) && Intrinsics.areEqual((Object) this.l, (Object) bVar.l)) {
                            if ((this.m == bVar.m) && Intrinsics.areEqual((Object) this.n, (Object) bVar.n)) {
                                if (this.o == bVar.o) {
                                    if (this.p == bVar.p) {
                                        if ((this.q == bVar.q) && Intrinsics.areEqual((Object) this.r, (Object) bVar.r) && Intrinsics.areEqual((Object) this.s, (Object) bVar.s) && Intrinsics.areEqual((Object) this.t, (Object) bVar.t) && Intrinsics.areEqual((Object) this.u, (Object) bVar.u)) {
                                            if (this.v == bVar.v) {
                                                if (this.w == bVar.w) {
                                                    if (this.x == bVar.x) {
                                                        if (this.y == bVar.y) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
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
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f40799a, false, 34300, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f40799a, false, 34300, new Class[0], Integer.TYPE)).intValue();
        }
        long j2 = this.f40800b;
        int i3 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        String str = this.f40801c;
        int hashCode = (((i3 + (str != null ? str.hashCode() : 0)) * 31) + this.f40802d) * 31;
        boolean z = this.f40803e;
        if (z) {
            z = true;
        }
        int i4 = (hashCode + (z ? 1 : 0)) * 31;
        String str2 = this.f40804f;
        int hashCode2 = (i4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.g;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.h;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.i;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.j;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.k;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.l;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        boolean z2 = this.m;
        if (z2) {
            z2 = true;
        }
        int i5 = (hashCode8 + (z2 ? 1 : 0)) * 31;
        String str9 = this.n;
        int hashCode9 = (i5 + (str9 != null ? str9.hashCode() : 0)) * 31;
        boolean z3 = this.o;
        if (z3) {
            z3 = true;
        }
        int i6 = (hashCode9 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.p;
        if (z4) {
            z4 = true;
        }
        int i7 = (i6 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.q;
        if (z5) {
            z5 = true;
        }
        int i8 = (i7 + (z5 ? 1 : 0)) * 31;
        String str10 = this.r;
        int hashCode10 = (i8 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.s;
        int hashCode11 = (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.t;
        int hashCode12 = (hashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.u;
        if (str13 != null) {
            i2 = str13.hashCode();
        }
        int i9 = (((((hashCode12 + i2) * 31) + this.v) * 31) + this.w) * 31;
        boolean z6 = this.x;
        if (z6) {
            z6 = true;
        }
        return ((i9 + (z6 ? 1 : 0)) * 31) + this.y;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f40799a, false, 34299, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f40799a, false, 34299, new Class[0], String.class);
        }
        return "CommerceInfo(adId=" + this.f40800b + ", adType=" + this.f40801c + ", adSystemOrigin=" + this.f40802d + ", isFromAppAd=" + this.f40803e + ", downloadUrl=" + this.f40804f + ", downloadAppName=" + this.g + ", downloadPkgName=" + this.h + ", downloadAppExtra=" + this.i + ", logExtra=" + this.j + ", gdLabel=" + this.k + ", gdExtJson=" + this.l + ", disableDownloadDialog=" + this.m + ", creativeId=" + this.n + ", showDownloadStatusBar=" + this.o + ", forbidJump=" + this.p + ", canSendStat=" + this.q + ", adJsUrl=" + this.r + ", douPlusMonitorUrl=" + this.s + ", quickAppUrl=" + this.t + ", siteId=" + this.u + ", preloadWeb=" + this.v + ", useWebUrl=" + this.w + ", interceptEPlatform=" + this.x + ", webType=" + this.y + ")";
    }

    private b(long j2, @Nullable String str, int i2, boolean z, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, boolean z2, @Nullable String str9, boolean z3, boolean z4, boolean z5, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, int i3, int i4, boolean z6, int i5) {
        this.f40800b = j2;
        this.f40801c = str;
        this.f40802d = i2;
        this.f40803e = z;
        this.f40804f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = z2;
        this.n = str9;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.r = str10;
        this.s = str11;
        this.t = str12;
        this.u = str13;
        this.v = i3;
        this.w = i4;
        this.x = z6;
        this.y = i5;
    }

    private /* synthetic */ b(long j2, String str, int i2, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z2, String str9, boolean z3, boolean z4, boolean z5, String str10, String str11, String str12, String str13, int i3, int i4, boolean z6, int i5, int i6) {
        this(0, "", 0, false, null, null, null, null, null, null, null, true, null, false, false, false, null, null, null, null, 0, 0, false, 0);
    }
}
