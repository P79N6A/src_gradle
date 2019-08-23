package com.ss.android.ttve.common;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public int f31180a = 720;

    /* renamed from: b  reason: collision with root package name */
    public int f31181b = 1280;

    public final int hashCode() {
        return (this.f31180a * 65537) + 1 + this.f31181b;
    }

    public final String toString() {
        return this.f31180a + "x" + this.f31181b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f31180a == gVar.f31180a && this.f31181b == gVar.f31181b) {
            return true;
        }
        return false;
    }
}
