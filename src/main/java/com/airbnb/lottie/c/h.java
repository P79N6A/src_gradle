package com.airbnb.lottie.c;

import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.v4.util.Pair;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class h<T> {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public T f4799a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public T f4800b;

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (this.f4799a == null) {
            i = 0;
        } else {
            i = this.f4799a.hashCode();
        }
        if (this.f4800b != null) {
            i2 = this.f4800b.hashCode();
        }
        return i ^ i2;
    }

    public final String toString() {
        return "Pair{" + String.valueOf(this.f4799a) + " " + String.valueOf(this.f4800b) + "}";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (!a(pair.first, this.f4799a) || !a(pair.second, this.f4800b)) {
            return false;
        }
        return true;
    }

    private static boolean a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
