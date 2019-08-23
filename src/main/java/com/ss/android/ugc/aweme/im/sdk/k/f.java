package com.ss.android.ugc.aweme.im.sdk.k;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class f implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51731a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f51732b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f51733c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f51734d;

    /* renamed from: e  reason: collision with root package name */
    boolean f51735e;

    public final int hashCode() {
        return (((((((this.f51734d ? 1 : 0) * true) + (this.f51735e ? 1 : 0)) * 13) + (this.f51732b ? 1 : 0)) * 7) + (this.f51733c ? 1 : 0)) * 3;
    }

    public final Object clone() {
        if (PatchProxy.isSupport(new Object[0], this, f51731a, false, 54236, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f51731a, false, 54236, new Class[0], Object.class);
        }
        try {
            return super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException("GeneralPurposeBit is not Cloneable?", e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (fVar.f51734d == this.f51734d && fVar.f51735e == this.f51735e && fVar.f51732b == this.f51732b && fVar.f51733c == this.f51733c) {
            return true;
        }
        return false;
    }
}
