package com.ss.android.ugc.aweme.commercialize.feed.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/feed/preload/PreloadDownloadMsg;", "", "siteId", "", "creativeId", "", "logExtra", "(Ljava/lang/String;JLjava/lang/String;)V", "getCreativeId", "()J", "diffType", "", "getDiffType", "()I", "setDiffType", "(I)V", "getLogExtra", "()Ljava/lang/String;", "getSiteId", "startDownloadTime", "getStartDownloadTime", "setStartDownloadTime", "(J)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38819a;

    /* renamed from: b  reason: collision with root package name */
    public long f38820b;

    /* renamed from: c  reason: collision with root package name */
    public int f38821c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final String f38822d;

    /* renamed from: e  reason: collision with root package name */
    public final long f38823e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final String f38824f;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f38819a, false, 30806, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f38819a, false, 30806, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (Intrinsics.areEqual((Object) this.f38822d, (Object) dVar.f38822d)) {
                    if (!(this.f38823e == dVar.f38823e) || !Intrinsics.areEqual((Object) this.f38824f, (Object) dVar.f38824f)) {
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
        if (PatchProxy.isSupport(new Object[0], this, f38819a, false, 30805, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f38819a, false, 30805, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.f38822d;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.f38823e;
        int i2 = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f38824f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f38819a, false, 30804, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f38819a, false, 30804, new Class[0], String.class);
        }
        return "PreloadDownloadMsg(siteId=" + this.f38822d + ", creativeId=" + this.f38823e + ", logExtra=" + this.f38824f + ")";
    }

    public d(@NotNull String str, long j, @Nullable String str2) {
        Intrinsics.checkParameterIsNotNull(str, "siteId");
        this.f38822d = str;
        this.f38823e = j;
        this.f38824f = str2;
        this.f38821c = -1;
    }

    public /* synthetic */ d(String str, long j, String str2, int i) {
        this(str, 0, "");
    }
}
