package com.ss.android.ugc.aweme.detail.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/detail/ui/ClearPageAboveLiveEvent;", "", "pageId", "", "(J)V", "getPageId", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41364a;

    /* renamed from: b  reason: collision with root package name */
    public final long f41365b;

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                if (this.f41365b == ((a) obj).f41365b) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f41365b;
        return (int) (j ^ (j >>> 32));
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f41364a, false, 35025, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f41364a, false, 35025, new Class[0], String.class);
        }
        return "ClearPageAboveLiveEvent(pageId=" + this.f41365b + ")";
    }
}
