package com.ss.android.ugc.aweme.commercialize.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/event/UserProfileFakeCoverActionEvent;", "", "actionType", "", "downTime", "", "actionTime", "(IJJ)V", "getActionTime", "()J", "getActionType", "()I", "setActionType", "(I)V", "getDownTime", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38516a;

    /* renamed from: b  reason: collision with root package name */
    public int f38517b;

    /* renamed from: c  reason: collision with root package name */
    public final long f38518c;

    /* renamed from: d  reason: collision with root package name */
    public final long f38519d;

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (this.f38517b == hVar.f38517b) {
                    if (this.f38518c == hVar.f38518c) {
                        if (this.f38519d == hVar.f38519d) {
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
        long j = this.f38518c;
        long j2 = this.f38519d;
        return (((this.f38517b * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f38516a, false, 30550, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f38516a, false, 30550, new Class[0], String.class);
        }
        return "UserProfileFakeCoverActionEvent(actionType=" + this.f38517b + ", downTime=" + this.f38518c + ", actionTime=" + this.f38519d + ")";
    }

    public h(int i, long j, long j2) {
        this.f38517b = i;
        this.f38518c = j;
        this.f38519d = j2;
    }
}
