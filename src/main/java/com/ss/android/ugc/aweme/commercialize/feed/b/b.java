package com.ss.android.ugc.aweme.commercialize.feed.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/feed/preload/PreloadAdWebStateMsg;", "", "siteId", "", "clickTime", "", "startLoadTime", "(Ljava/lang/String;JJ)V", "getClickTime", "()J", "setClickTime", "(J)V", "getSiteId", "()Ljava/lang/String;", "getStartLoadTime", "setStartLoadTime", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38815a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final String f38816b;

    /* renamed from: c  reason: collision with root package name */
    public long f38817c;

    /* renamed from: d  reason: collision with root package name */
    public long f38818d;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f38815a, false, 30802, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f38815a, false, 30802, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Intrinsics.areEqual((Object) this.f38816b, (Object) bVar.f38816b)) {
                    if (this.f38817c == bVar.f38817c) {
                        if (this.f38818d == bVar.f38818d) {
                            return true;
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
        if (PatchProxy.isSupport(new Object[0], this, f38815a, false, 30801, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f38815a, false, 30801, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.f38816b;
        if (str != null) {
            i = str.hashCode();
        }
        long j = this.f38817c;
        long j2 = this.f38818d;
        return (((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f38815a, false, 30800, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f38815a, false, 30800, new Class[0], String.class);
        }
        return "PreloadAdWebStateMsg(siteId=" + this.f38816b + ", clickTime=" + this.f38817c + ", startLoadTime=" + this.f38818d + ")";
    }
}
