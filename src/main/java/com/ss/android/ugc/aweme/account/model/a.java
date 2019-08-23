package com.ss.android.ugc.aweme.account.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/account/model/AccountBackOpe;", "", "isFinish", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32740a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f32741b = false;

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                if (this.f32741b == ((a) obj).f32741b) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f32741b;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f32740a, false, 20903, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f32740a, false, 20903, new Class[0], String.class);
        }
        return "AccountBackOpe(isFinish=" + this.f32741b + ")";
    }

    public a(boolean z) {
    }
}
