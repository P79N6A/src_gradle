package com.amap.api.mapcore2d;

public class dc {

    /* renamed from: a  reason: collision with root package name */
    private final int f5923a = 37;

    /* renamed from: b  reason: collision with root package name */
    private int f5924b = 17;

    public int a() {
        return this.f5924b;
    }

    public dc a(boolean z) {
        this.f5924b = (this.f5924b * this.f5923a) + (z ^ true ? 1 : 0);
        return this;
    }

    public dc a(boolean[] zArr) {
        if (zArr == null) {
            this.f5924b *= this.f5923a;
        } else {
            for (boolean a2 : zArr) {
                a(a2);
            }
        }
        return this;
    }

    public dc a(byte[] bArr) {
        if (bArr == null) {
            this.f5924b *= this.f5923a;
        } else {
            for (byte a2 : bArr) {
                a(a2);
            }
        }
        return this;
    }

    public dc a(char[] cArr) {
        if (cArr == null) {
            this.f5924b *= this.f5923a;
        } else {
            for (char a2 : cArr) {
                a(a2);
            }
        }
        return this;
    }

    public dc a(double[] dArr) {
        if (dArr == null) {
            this.f5924b *= this.f5923a;
        } else {
            for (double a2 : dArr) {
                a(a2);
            }
        }
        return this;
    }

    public dc a(float[] fArr) {
        if (fArr == null) {
            this.f5924b *= this.f5923a;
        } else {
            for (float a2 : fArr) {
                a(a2);
            }
        }
        return this;
    }

    public dc a(int[] iArr) {
        if (iArr == null) {
            this.f5924b *= this.f5923a;
        } else {
            for (int a2 : iArr) {
                a(a2);
            }
        }
        return this;
    }

    public dc a(long[] jArr) {
        if (jArr == null) {
            this.f5924b *= this.f5923a;
        } else {
            for (long a2 : jArr) {
                a(a2);
            }
        }
        return this;
    }

    public dc a(Object[] objArr) {
        if (objArr == null) {
            this.f5924b *= this.f5923a;
        } else {
            for (Object a2 : objArr) {
                a(a2);
            }
        }
        return this;
    }

    public dc a(short[] sArr) {
        if (sArr == null) {
            this.f5924b *= this.f5923a;
        } else {
            for (short a2 : sArr) {
                a(a2);
            }
        }
        return this;
    }

    public int hashCode() {
        return a();
    }

    public dc a(byte b2) {
        this.f5924b = (this.f5924b * this.f5923a) + b2;
        return this;
    }

    public dc a(char c2) {
        this.f5924b = (this.f5924b * this.f5923a) + c2;
        return this;
    }

    public dc a(double d2) {
        return a(Double.doubleToLongBits(d2));
    }

    public dc a(float f2) {
        this.f5924b = (this.f5924b * this.f5923a) + Float.floatToIntBits(f2);
        return this;
    }

    public dc a(int i) {
        this.f5924b = (this.f5924b * this.f5923a) + i;
        return this;
    }

    public dc a(long j) {
        this.f5924b = (this.f5924b * this.f5923a) + ((int) (j ^ (j >> 32)));
        return this;
    }

    public dc a(Object obj) {
        if (obj == null) {
            this.f5924b *= this.f5923a;
        } else if (!obj.getClass().isArray()) {
            this.f5924b = (this.f5924b * this.f5923a) + obj.hashCode();
        } else if (obj instanceof long[]) {
            a((long[]) obj);
        } else if (obj instanceof int[]) {
            a((int[]) obj);
        } else if (obj instanceof short[]) {
            a((short[]) obj);
        } else if (obj instanceof char[]) {
            a((char[]) obj);
        } else if (obj instanceof byte[]) {
            a((byte[]) obj);
        } else if (obj instanceof double[]) {
            a((double[]) obj);
        } else if (obj instanceof float[]) {
            a((float[]) obj);
        } else if (obj instanceof boolean[]) {
            a((boolean[]) obj);
        } else {
            a((Object[]) obj);
        }
        return this;
    }

    public dc a(short s) {
        this.f5924b = (this.f5924b * this.f5923a) + s;
        return this;
    }
}
