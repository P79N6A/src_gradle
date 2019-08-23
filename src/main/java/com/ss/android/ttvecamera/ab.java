package com.ss.android.ttvecamera;

public final class ab {

    /* renamed from: a  reason: collision with root package name */
    public int f31332a;

    /* renamed from: b  reason: collision with root package name */
    public int f31333b;

    /* renamed from: c  reason: collision with root package name */
    public int f31334c = 1;

    public final int hashCode() {
        return (this.f31332a * 65537) + 1 + this.f31333b;
    }

    public final int[] a() {
        return new int[]{this.f31332a / this.f31334c, this.f31333b / this.f31334c};
    }

    public final String toString() {
        return "[" + (this.f31332a / this.f31334c) + ":" + (this.f31333b / this.f31334c) + "]";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        if (this.f31332a == abVar.f31332a && this.f31333b == abVar.f31333b) {
            return true;
        }
        return false;
    }

    public ab(int i, int i2) {
        this.f31332a = i;
        this.f31333b = 30;
        this.f31334c = 1;
    }
}
