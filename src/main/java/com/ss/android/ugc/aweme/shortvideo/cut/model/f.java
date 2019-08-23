package com.ss.android.ugc.aweme.shortvideo.cut.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/model/SwapStateWrapper;", "", "state", "", "from", "to", "(III)V", "getFrom", "()I", "isSelectedChanged", "", "()Z", "setSelectedChanged", "(Z)V", "getState", "getTo", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66489a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f66490b;

    /* renamed from: c  reason: collision with root package name */
    public final int f66491c;

    /* renamed from: d  reason: collision with root package name */
    public final int f66492d;

    /* renamed from: e  reason: collision with root package name */
    public final int f66493e;

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.f66491c == fVar.f66491c) {
                    if (this.f66492d == fVar.f66492d) {
                        if (this.f66493e == fVar.f66493e) {
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
        return (((this.f66491c * 31) + this.f66492d) * 31) + this.f66493e;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f66489a, false, 75852, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f66489a, false, 75852, new Class[0], String.class);
        }
        return "SwapStateWrapper(state=" + this.f66491c + ", from=" + this.f66492d + ", to=" + this.f66493e + ")";
    }

    public f(int i, int i2, int i3) {
        this.f66491c = i;
        this.f66492d = i2;
        this.f66493e = i3;
    }
}
