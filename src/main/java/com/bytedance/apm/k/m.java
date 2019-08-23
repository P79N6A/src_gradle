package com.bytedance.apm.k;

import android.support.annotation.Nullable;

public final class m<F, S> {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final F f19039a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final S f19040b;

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (this.f19039a == null) {
            i = 0;
        } else {
            i = this.f19039a.hashCode();
        }
        if (this.f19040b != null) {
            i2 = this.f19040b.hashCode();
        }
        return i ^ i2;
    }

    public final String toString() {
        return "Pair{" + String.valueOf(this.f19039a) + " " + this.f19040b + "}";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!l.a(mVar.f19039a, this.f19039a) || !l.a(mVar.f19040b, this.f19040b)) {
            return false;
        }
        return true;
    }

    public m(@Nullable F f2, @Nullable S s) {
        this.f19039a = f2;
        this.f19040b = s;
    }
}
