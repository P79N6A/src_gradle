package com.ss.android.ugc.aweme.user.repository;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/user/repository/RemarkRequestParam;", "", "userId", "", "remarkName", "(Ljava/lang/String;Ljava/lang/String;)V", "getRemarkName", "()Ljava/lang/String;", "getUserId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75388a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final String f75389b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f75390c;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f75388a, false, 87675, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f75388a, false, 87675, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (!Intrinsics.areEqual((Object) this.f75389b, (Object) eVar.f75389b) || !Intrinsics.areEqual((Object) this.f75390c, (Object) eVar.f75390c)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f75388a, false, 87674, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f75388a, false, 87674, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.f75389b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f75390c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f75388a, false, 87673, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f75388a, false, 87673, new Class[0], String.class);
        }
        return "RemarkRequestParam(userId=" + this.f75389b + ", remarkName=" + this.f75390c + ")";
    }
}
