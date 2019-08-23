package com.loc;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public int f25814a = 17;

    /* renamed from: b  reason: collision with root package name */
    private final int f25815b = 37;

    private e a(long j) {
        this.f25814a = (this.f25814a * this.f25815b) + ((int) (j ^ (j >> 32)));
        return this;
    }

    public final e a(Object obj) {
        if (obj != null) {
            if (obj.getClass().isArray()) {
                int i = 0;
                if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    if (jArr != null) {
                        while (i < jArr.length) {
                            a(jArr[i]);
                            i++;
                        }
                    }
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    if (iArr != null) {
                        while (i < iArr.length) {
                            this.f25814a = (this.f25814a * this.f25815b) + iArr[i];
                            i++;
                        }
                    }
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    if (sArr != null) {
                        while (i < sArr.length) {
                            this.f25814a = (this.f25814a * this.f25815b) + sArr[i];
                            i++;
                        }
                    }
                } else if (obj instanceof char[]) {
                    char[] cArr = (char[]) obj;
                    if (cArr != null) {
                        while (i < cArr.length) {
                            this.f25814a = (this.f25814a * this.f25815b) + cArr[i];
                            i++;
                        }
                    }
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    if (bArr != null) {
                        while (i < bArr.length) {
                            this.f25814a = (this.f25814a * this.f25815b) + bArr[i];
                            i++;
                        }
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    if (dArr != null) {
                        while (i < dArr.length) {
                            a(Double.doubleToLongBits(dArr[i]));
                            i++;
                        }
                    }
                } else if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    if (fArr != null) {
                        while (i < fArr.length) {
                            this.f25814a = (this.f25814a * this.f25815b) + Float.floatToIntBits(fArr[i]);
                            i++;
                        }
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    if (zArr != null) {
                        while (i < zArr.length) {
                            this.f25814a = (this.f25814a * this.f25815b) + (zArr[i] ^ true ? 1 : 0);
                            i++;
                        }
                    }
                } else {
                    a((Object[]) obj);
                }
            } else {
                this.f25814a = (this.f25814a * this.f25815b) + obj.hashCode();
            }
            return this;
        }
        this.f25814a *= this.f25815b;
        return this;
    }

    public final e a(Object[] objArr) {
        if (objArr == null) {
            this.f25814a *= this.f25815b;
        } else {
            for (Object a2 : objArr) {
                a(a2);
            }
        }
        return this;
    }

    public final int hashCode() {
        return this.f25814a;
    }
}
