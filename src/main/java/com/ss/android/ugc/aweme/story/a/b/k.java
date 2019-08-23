package com.ss.android.ugc.aweme.story.a.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/story/repo/storydetail/StoryStatsParam;", "", "userId", "", "storyId", "relationTyp", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getRelationTyp", "()I", "getStoryId", "()Ljava/lang/String;", "getUserId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71818a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final String f71819b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f71820c;

    /* renamed from: d  reason: collision with root package name */
    public final int f71821d;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f71818a, false, 85070, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f71818a, false, 85070, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof k) {
                k kVar = (k) obj;
                if (Intrinsics.areEqual((Object) this.f71819b, (Object) kVar.f71819b) && Intrinsics.areEqual((Object) this.f71820c, (Object) kVar.f71820c)) {
                    if (this.f71821d == kVar.f71821d) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f71818a, false, 85069, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f71818a, false, 85069, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.f71819b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f71820c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.f71821d;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f71818a, false, 85068, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f71818a, false, 85068, new Class[0], String.class);
        }
        return "StoryStatsParam(userId=" + this.f71819b + ", storyId=" + this.f71820c + ", relationTyp=" + this.f71821d + ")";
    }

    public k(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(str2, "storyId");
        this.f71819b = str;
        this.f71820c = str2;
        this.f71821d = i;
    }
}
