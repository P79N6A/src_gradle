package com.airbnb.lottie;

import android.support.annotation.Nullable;
import java.util.Arrays;

public final class j<V> {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final V f4882a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f4883b;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4882a, this.f4883b});
    }

    public j(V v) {
        this.f4882a = v;
    }

    public j(Throwable th) {
        this.f4883b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f4882a != null && this.f4882a.equals(jVar.f4882a)) {
            return true;
        }
        if (this.f4883b == null || jVar.f4883b == null) {
            return false;
        }
        return this.f4883b.toString().equals(this.f4883b.toString());
    }
}
