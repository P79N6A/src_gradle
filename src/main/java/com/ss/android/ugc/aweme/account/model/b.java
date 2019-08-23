package com.ss.android.ugc.aweme.account.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/account/model/BindMobileFinishOpe;", "", "phone", "", "response", "(Ljava/lang/String;Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "setPhone", "(Ljava/lang/String;)V", "getResponse", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32742a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public String f32743b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f32744c;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f32742a, false, 20908, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f32742a, false, 20908, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!Intrinsics.areEqual((Object) this.f32743b, (Object) bVar.f32743b) || !Intrinsics.areEqual((Object) this.f32744c, (Object) bVar.f32744c)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f32742a, false, 20907, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f32742a, false, 20907, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.f32743b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f32744c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f32742a, false, 20906, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f32742a, false, 20906, new Class[0], String.class);
        }
        return "BindMobileFinishOpe(phone=" + this.f32743b + ", response=" + this.f32744c + ")";
    }

    public b(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, "phone");
        Intrinsics.checkParameterIsNotNull(str2, "response");
        this.f32743b = str;
        this.f32744c = str2;
    }
}
