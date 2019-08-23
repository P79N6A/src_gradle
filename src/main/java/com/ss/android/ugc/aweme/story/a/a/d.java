package com.ss.android.ugc.aweme.story.a.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/story/repo/lifefeed/LifeFeedRequestParam;", "", "cursor", "", "count", "", "tabType", "insertUserId", "", "(JIILjava/lang/String;)V", "getCount", "()I", "getCursor", "()J", "getInsertUserId", "()Ljava/lang/String;", "getTabType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71786a;

    /* renamed from: b  reason: collision with root package name */
    public final long f71787b;

    /* renamed from: c  reason: collision with root package name */
    public final int f71788c;

    /* renamed from: d  reason: collision with root package name */
    public final int f71789d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final String f71790e;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f71786a, false, 85038, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f71786a, false, 85038, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f71787b == dVar.f71787b) {
                    if (this.f71788c == dVar.f71788c) {
                        if (!(this.f71789d == dVar.f71789d) || !Intrinsics.areEqual((Object) this.f71790e, (Object) dVar.f71790e)) {
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
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f71786a, false, 85037, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f71786a, false, 85037, new Class[0], Integer.TYPE)).intValue();
        }
        long j = this.f71787b;
        int i2 = ((((((int) (j ^ (j >>> 32))) * 31) + this.f71788c) * 31) + this.f71789d) * 31;
        String str = this.f71790e;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f71786a, false, 85036, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f71786a, false, 85036, new Class[0], String.class);
        }
        return "LifeFeedRequestParam(cursor=" + this.f71787b + ", count=" + this.f71788c + ", tabType=" + this.f71789d + ", insertUserId=" + this.f71790e + ")";
    }

    public d(long j, int i, int i2, @NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "insertUserId");
        this.f71787b = j;
        this.f71788c = i;
        this.f71789d = i2;
        this.f71790e = str;
    }
}
