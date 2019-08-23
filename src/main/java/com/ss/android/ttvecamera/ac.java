package com.ss.android.ttvecamera;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public int f31335a = 720;

    /* renamed from: b  reason: collision with root package name */
    public int f31336b = 1280;

    public ac() {
    }

    public final boolean a() {
        if (this.f31335a <= 0 || this.f31336b <= 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f31335a * 65537) + 1 + this.f31336b;
    }

    public final String toString() {
        return this.f31335a + "x" + this.f31336b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        if (this.f31335a == acVar.f31335a && this.f31336b == acVar.f31336b) {
            return true;
        }
        return false;
    }

    public ac(int i, int i2) {
        this.f31335a = i;
        this.f31336b = i2;
    }
}
