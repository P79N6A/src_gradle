package com.ss.android.ugc.aweme.story.a.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.base.Constant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/story/repo/storydetail/StoryDetailBatchParam;", "", "userId", "", "ids", "loadCount", "", "reqType", "startPos", "endPos", "(Ljava/lang/String;Ljava/lang/String;IIII)V", "getEndPos", "()I", "getIds", "()Ljava/lang/String;", "getLoadCount", "getReqType", "getStartPos", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71796a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final String f71797b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f71798c;

    /* renamed from: d  reason: collision with root package name */
    public final int f71799d;

    /* renamed from: e  reason: collision with root package name */
    public final int f71800e;

    /* renamed from: f  reason: collision with root package name */
    public final int f71801f;
    public final int g;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f71796a, false, 85048, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f71796a, false, 85048, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (Intrinsics.areEqual((Object) this.f71797b, (Object) dVar.f71797b) && Intrinsics.areEqual((Object) this.f71798c, (Object) dVar.f71798c)) {
                    if (this.f71799d == dVar.f71799d) {
                        if (this.f71800e == dVar.f71800e) {
                            if (this.f71801f == dVar.f71801f) {
                                if (this.g == dVar.g) {
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
        if (PatchProxy.isSupport(new Object[0], this, f71796a, false, 85047, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f71796a, false, 85047, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.f71797b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f71798c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((((hashCode + i) * 31) + this.f71799d) * 31) + this.f71800e) * 31) + this.f71801f) * 31) + this.g;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f71796a, false, 85046, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f71796a, false, 85046, new Class[0], String.class);
        }
        return "StoryDetailBatchParam(userId=" + this.f71797b + ", ids=" + this.f71798c + ", loadCount=" + this.f71799d + ", reqType=" + this.f71800e + ", startPos=" + this.f71801f + ", endPos=" + this.g + ")";
    }

    public d(@NotNull String str, @NotNull String str2, int i, @Constant.IRequestType int i2, int i3, int i4) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(str2, "ids");
        this.f71797b = str;
        this.f71798c = str2;
        this.f71799d = i;
        this.f71800e = i2;
        this.f71801f = i3;
        this.g = i4;
    }
}
