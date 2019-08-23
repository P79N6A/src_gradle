package com.facebook.imagepipeline.image;

public final class c implements d {
    public static final d FULL_QUALITY = of(Integer.MAX_VALUE, true, true);

    /* renamed from: a  reason: collision with root package name */
    int f23939a;

    /* renamed from: b  reason: collision with root package name */
    boolean f23940b;

    /* renamed from: c  reason: collision with root package name */
    boolean f23941c;

    public final int getQuality() {
        return this.f23939a;
    }

    public final boolean isOfFullQuality() {
        return this.f23941c;
    }

    public final boolean isOfGoodEnoughQuality() {
        return this.f23940b;
    }

    public final int hashCode() {
        int i;
        int i2 = this.f23939a;
        int i3 = 0;
        if (this.f23940b) {
            i = 4194304;
        } else {
            i = 0;
        }
        int i4 = i2 ^ i;
        if (this.f23941c) {
            i3 = 8388608;
        }
        return i4 ^ i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f23939a == cVar.f23939a && this.f23940b == cVar.f23940b && this.f23941c == cVar.f23941c) {
            return true;
        }
        return false;
    }

    public static d of(int i, boolean z, boolean z2) {
        return new c(i, z, z2);
    }

    private c(int i, boolean z, boolean z2) {
        this.f23939a = i;
        this.f23940b = z;
        this.f23941c = z2;
    }
}
