package com.amap.api.services.a;

public class bw {

    /* renamed from: a  reason: collision with root package name */
    private final int f6663a = 37;

    /* renamed from: b  reason: collision with root package name */
    private int f6664b = 17;

    public int a() {
        return this.f6664b;
    }

    public bw a(boolean z) {
        this.f6664b = (this.f6664b * this.f6663a) + (z ^ true ? 1 : 0);
        return this;
    }

    public bw a(boolean[] zArr) {
        if (zArr == null) {
            this.f6664b *= this.f6663a;
        } else {
            for (boolean a2 : zArr) {
                a(a2);
            }
        }
        return this;
    }

    public bw a(byte[] bArr) {
        if (bArr == null) {
            this.f6664b *= this.f6663a;
        } else {
            for (byte a2 : bArr) {
                a(a2);
            }
        }
        return this;
    }

    public bw a(char[] cArr) {
        if (cArr == null) {
            this.f6664b *= this.f6663a;
        } else {
            for (char a2 : cArr) {
                a(a2);
            }
        }
        return this;
    }

    public bw a(double[] dArr) {
        if (dArr == null) {
            this.f6664b *= this.f6663a;
        } else {
            for (double a2 : dArr) {
                a(a2);
            }
        }
        return this;
    }

    public bw a(float[] fArr) {
        if (fArr == null) {
            this.f6664b *= this.f6663a;
        } else {
            for (float a2 : fArr) {
                a(a2);
            }
        }
        return this;
    }

    public bw a(int[] iArr) {
        if (iArr == null) {
            this.f6664b *= this.f6663a;
        } else {
            for (int a2 : iArr) {
                a(a2);
            }
        }
        return this;
    }

    public bw a(long[] jArr) {
        if (jArr == null) {
            this.f6664b *= this.f6663a;
        } else {
            for (long a2 : jArr) {
                a(a2);
            }
        }
        return this;
    }

    public bw a(Object[] objArr) {
        if (objArr == null) {
            this.f6664b *= this.f6663a;
        } else {
            for (Object a2 : objArr) {
                a(a2);
            }
        }
        return this;
    }

    public bw a(short[] sArr) {
        if (sArr == null) {
            this.f6664b *= this.f6663a;
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

    public bw a(byte b2) {
        this.f6664b = (this.f6664b * this.f6663a) + b2;
        return this;
    }

    public bw a(char c2) {
        this.f6664b = (this.f6664b * this.f6663a) + c2;
        return this;
    }

    public bw a(double d2) {
        return a(Double.doubleToLongBits(d2));
    }

    public bw a(float f2) {
        this.f6664b = (this.f6664b * this.f6663a) + Float.floatToIntBits(f2);
        return this;
    }

    public bw a(int i) {
        this.f6664b = (this.f6664b * this.f6663a) + i;
        return this;
    }

    public bw a(long j) {
        this.f6664b = (this.f6664b * this.f6663a) + ((int) (j ^ (j >> 32)));
        return this;
    }

    public bw a(Object obj) {
        if (obj == null) {
            this.f6664b *= this.f6663a;
        } else if (!obj.getClass().isArray()) {
            this.f6664b = (this.f6664b * this.f6663a) + obj.hashCode();
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

    public bw a(short s) {
        this.f6664b = (this.f6664b * this.f6663a) + s;
        return this;
    }
}
