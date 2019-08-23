package com.ss.android.ugc.aweme;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/BindMobileFinishData;", "", "phone", "", "response", "(Ljava/lang/String;Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "getResponse", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "accountapi_release"}, k = 1, mv = {1, 1, 13})
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50721a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final String f50722b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f50723c;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f50721a, false, 19446, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f50721a, false, 19446, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (!Intrinsics.areEqual((Object) this.f50722b, (Object) jVar.f50722b) || !Intrinsics.areEqual((Object) this.f50723c, (Object) jVar.f50723c)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f50721a, false, 19445, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50721a, false, 19445, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.f50722b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f50723c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f50721a, false, 19444, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f50721a, false, 19444, new Class[0], String.class);
        }
        return "BindMobileFinishData(phone=" + this.f50722b + ", response=" + this.f50723c + ")";
    }

    public j(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, "phone");
        Intrinsics.checkParameterIsNotNull(str2, "response");
        this.f50722b = str;
        this.f50723c = str2;
    }
}
