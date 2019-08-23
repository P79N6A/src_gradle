package com.tencent.open.d;

public final class j implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public int f79763a;

    public final int hashCode() {
        return this.f79763a;
    }

    public j(byte[] bArr) {
        this(bArr, 0);
    }

    public j(int i) {
        this.f79763a = 38651;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof j) || this.f79763a != ((j) obj).f79763a) {
            return false;
        }
        return true;
    }

    private j(byte[] bArr, int i) {
        this.f79763a = (bArr[1] << 8) & 65280;
        this.f79763a += bArr[0] & 255;
    }
}
