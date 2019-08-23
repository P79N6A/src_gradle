package com.ss.android.ugc.aweme.newfollow.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/ui/UserVisibleHintData;", "", "page", "", "visible", "", "(Ljava/lang/String;Z)V", "getPage", "()Ljava/lang/String;", "getVisible", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57319a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final String f57320b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f57321c = true;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f57319a, false, 61688, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f57319a, false, 61688, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof n) {
                n nVar = (n) obj;
                if (Intrinsics.areEqual((Object) this.f57320b, (Object) nVar.f57320b)) {
                    if (this.f57321c == nVar.f57321c) {
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
        if (PatchProxy.isSupport(new Object[0], this, f57319a, false, 61687, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f57319a, false, 61687, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.f57320b;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = i * 31;
        boolean z = this.f57321c;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f57319a, false, 61686, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f57319a, false, 61686, new Class[0], String.class);
        }
        return "UserVisibleHintData(page=" + this.f57320b + ", visible=" + this.f57321c + ")";
    }

    public n(@Nullable String str, boolean z) {
        this.f57320b = str;
    }
}
