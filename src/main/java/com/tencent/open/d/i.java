package com.tencent.open.d;

public final class i implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public long f79762a = 101010256;

    public final int hashCode() {
        return (int) this.f79762a;
    }

    public i(long j) {
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof i) || this.f79762a != ((i) obj).f79762a) {
            return false;
        }
        return true;
    }
}
