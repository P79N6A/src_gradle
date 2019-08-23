package com.bytedance.scene.b;

import android.support.annotation.NonNull;

public final class f<F, S> {
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    public final F f22083a;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final S f22084b;

    public final int hashCode() {
        return this.f22083a.hashCode() ^ this.f22084b.hashCode();
    }

    public final String toString() {
        return "Pair{" + String.valueOf(this.f22083a) + " " + String.valueOf(this.f22084b) + "}";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!b(fVar.f22083a, this.f22083a) || !b(fVar.f22084b, this.f22084b)) {
            return false;
        }
        return true;
    }

    private f(@NonNull F f2, @NonNull S s) {
        this.f22083a = f2;
        this.f22084b = s;
    }

    @NonNull
    public static <A, B> f<A, B> a(@NonNull A a2, @NonNull B b2) {
        return new f<>(a2, b2);
    }

    private static boolean b(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
