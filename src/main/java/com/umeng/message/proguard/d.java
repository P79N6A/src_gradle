package com.umeng.message.proguard;

import java.math.BigInteger;

public class d extends e {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f81264a = {13, 10};
    private static final byte[] p = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] q = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] r = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    private final byte[] t;
    private final byte[] u;
    private final byte[] v;
    private final int w;
    private final int x;
    private int y;

    public d() {
        this(0);
    }

    public boolean a() {
        if (this.t == q) {
            return true;
        }
        return false;
    }

    public static boolean a(byte[] bArr) {
        return b(bArr);
    }

    public static byte[] c(byte[] bArr) {
        return a(bArr, false);
    }

    public static byte[] e(byte[] bArr) {
        return a(bArr, false, true);
    }

    public static byte[] g(byte[] bArr) {
        return a(bArr, true);
    }

    public d(int i) {
        this(i, f81264a);
    }

    public static boolean a(String str) {
        return b(b.f(str));
    }

    public static byte[] b(String str) {
        return new d().c(str);
    }

    public static String d(byte[] bArr) {
        return b.f(a(bArr, false));
    }

    public static String f(byte[] bArr) {
        return b.f(a(bArr, false, true));
    }

    public static byte[] h(byte[] bArr) {
        return new d().k(bArr);
    }

    public static BigInteger i(byte[] bArr) {
        return new BigInteger(1, h(bArr));
    }

    public static boolean a(byte b2) {
        if (b2 == 61 || (b2 >= 0 && b2 < r.length && r[b2] != -1)) {
            return true;
        }
        return false;
    }

    public static boolean b(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (!a(bArr[i]) && !c(bArr[i])) {
                return false;
            }
        }
        return true;
    }

    public d(boolean z) {
        this(76, f81264a, z);
    }

    public static byte[] a(BigInteger bigInteger) {
        if (bigInteger != null) {
            return a(b(bigInteger), false);
        }
        throw new NullPointerException("encodeInteger called with null parameter");
    }

    static byte[] b(BigInteger bigInteger) {
        int bitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == bitLength / 8) {
            return byteArray;
        }
        int i = 0;
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            length--;
            i = 1;
        }
        int i2 = bitLength / 8;
        int i3 = i2 - length;
        byte[] bArr = new byte[i2];
        System.arraycopy(byteArray, i, bArr, i3, length);
        return bArr;
    }

    /* access modifiers changed from: protected */
    public boolean b(byte b2) {
        if (b2 < 0 || b2 >= this.u.length || this.u[b2] == -1) {
            return false;
        }
        return true;
    }

    public d(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    public static byte[] a(byte[] bArr, boolean z) {
        return a(bArr, z, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(int r5, byte[] r6, boolean r7) {
        /*
            r4 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0005
            r1 = 0
            goto L_0x0006
        L_0x0005:
            int r1 = r6.length
        L_0x0006:
            r2 = 4
            r3 = 3
            r4.<init>(r3, r2, r5, r1)
            byte[] r1 = r
            r4.u = r1
            r1 = 0
            if (r6 == 0) goto L_0x004c
            boolean r3 = r4.n(r6)
            if (r3 != 0) goto L_0x002f
            if (r5 <= 0) goto L_0x002a
            int r5 = r6.length
            int r5 = r5 + r2
            r4.x = r5
            int r5 = r6.length
            byte[] r5 = new byte[r5]
            r4.v = r5
            byte[] r5 = r4.v
            int r1 = r6.length
            java.lang.System.arraycopy(r6, r0, r5, r0, r1)
            goto L_0x0050
        L_0x002a:
            r4.x = r2
            r4.v = r1
            goto L_0x0050
        L_0x002f:
            java.lang.String r5 = com.umeng.message.proguard.b.f((byte[]) r6)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "lineSeparator must not contain base64 characters: ["
            r7.<init>(r0)
            r7.append(r5)
            java.lang.String r5 = "]"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L_0x004c:
            r4.x = r2
            r4.v = r1
        L_0x0050:
            int r5 = r4.x
            int r5 = r5 + -1
            r4.w = r5
            if (r7 == 0) goto L_0x005b
            byte[] r5 = q
            goto L_0x005d
        L_0x005b:
            byte[] r5 = p
        L_0x005d:
            r4.t = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.proguard.d.<init>(int, byte[], boolean):void");
    }

    public static byte[] a(byte[] bArr, boolean z, boolean z2) {
        return a(bArr, z, z2, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    public void b(byte[] bArr, int i, int i2) {
        if (!this.j) {
            if (i2 < 0) {
                this.j = true;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                a(this.w);
                int i4 = i + 1;
                byte b2 = bArr[i];
                if (b2 == 61) {
                    this.j = true;
                    break;
                }
                if (b2 >= 0 && b2 < r.length) {
                    byte b3 = r[b2];
                    if (b3 >= 0) {
                        this.l = (this.l + 1) % 4;
                        this.y = (this.y << 6) + b3;
                        if (this.l == 0) {
                            byte[] bArr2 = this.h;
                            int i5 = this.i;
                            this.i = i5 + 1;
                            bArr2[i5] = (byte) ((this.y >> 16) & 255);
                            byte[] bArr3 = this.h;
                            int i6 = this.i;
                            this.i = i6 + 1;
                            bArr3[i6] = (byte) ((this.y >> 8) & 255);
                            byte[] bArr4 = this.h;
                            int i7 = this.i;
                            this.i = i7 + 1;
                            bArr4[i7] = (byte) (this.y & 255);
                        }
                    }
                }
                i3++;
                i = i4;
            }
            if (this.j && this.l != 0) {
                a(this.w);
                switch (this.l) {
                    case 2:
                        this.y >>= 4;
                        byte[] bArr5 = this.h;
                        int i8 = this.i;
                        this.i = i8 + 1;
                        bArr5[i8] = (byte) (this.y & 255);
                        return;
                    case 3:
                        this.y >>= 2;
                        byte[] bArr6 = this.h;
                        int i9 = this.i;
                        this.i = i9 + 1;
                        bArr6[i9] = (byte) ((this.y >> 8) & 255);
                        byte[] bArr7 = this.h;
                        int i10 = this.i;
                        this.i = i10 + 1;
                        bArr7[i10] = (byte) (this.y & 255);
                        break;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(byte[] r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.j
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r1 = 1
            if (r10 >= 0) goto L_0x00d8
            r7.j = r1
            int r8 = r7.l
            if (r8 != 0) goto L_0x0014
            int r8 = r7.g
            if (r8 != 0) goto L_0x0014
            return
        L_0x0014:
            int r8 = r7.x
            r7.a((int) r8)
            int r8 = r7.i
            int r9 = r7.l
            r10 = 61
            switch(r9) {
                case 1: goto L_0x0071;
                case 2: goto L_0x0024;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x00b3
        L_0x0024:
            byte[] r9 = r7.h
            int r1 = r7.i
            int r2 = r1 + 1
            r7.i = r2
            byte[] r2 = r7.t
            int r3 = r7.y
            int r3 = r3 >> 10
            r3 = r3 & 63
            byte r2 = r2[r3]
            r9[r1] = r2
            byte[] r9 = r7.h
            int r1 = r7.i
            int r2 = r1 + 1
            r7.i = r2
            byte[] r2 = r7.t
            int r3 = r7.y
            int r3 = r3 >> 4
            r3 = r3 & 63
            byte r2 = r2[r3]
            r9[r1] = r2
            byte[] r9 = r7.h
            int r1 = r7.i
            int r2 = r1 + 1
            r7.i = r2
            byte[] r2 = r7.t
            int r3 = r7.y
            int r3 = r3 << 2
            r3 = r3 & 63
            byte r2 = r2[r3]
            r9[r1] = r2
            byte[] r9 = r7.t
            byte[] r1 = p
            if (r9 != r1) goto L_0x00b3
            byte[] r9 = r7.h
            int r1 = r7.i
            int r2 = r1 + 1
            r7.i = r2
            r9[r1] = r10
            goto L_0x00b3
        L_0x0071:
            byte[] r9 = r7.h
            int r1 = r7.i
            int r2 = r1 + 1
            r7.i = r2
            byte[] r2 = r7.t
            int r3 = r7.y
            int r3 = r3 >> 2
            r3 = r3 & 63
            byte r2 = r2[r3]
            r9[r1] = r2
            byte[] r9 = r7.h
            int r1 = r7.i
            int r2 = r1 + 1
            r7.i = r2
            byte[] r2 = r7.t
            int r3 = r7.y
            int r3 = r3 << 4
            r3 = r3 & 63
            byte r2 = r2[r3]
            r9[r1] = r2
            byte[] r9 = r7.t
            byte[] r1 = p
            if (r9 != r1) goto L_0x00b3
            byte[] r9 = r7.h
            int r1 = r7.i
            int r2 = r1 + 1
            r7.i = r2
            r9[r1] = r10
            byte[] r9 = r7.h
            int r1 = r7.i
            int r2 = r1 + 1
            r7.i = r2
            r9[r1] = r10
        L_0x00b3:
            int r9 = r7.k
            int r10 = r7.i
            int r10 = r10 - r8
            int r9 = r9 + r10
            r7.k = r9
            int r8 = r7.g
            if (r8 <= 0) goto L_0x00d7
            int r8 = r7.k
            if (r8 <= 0) goto L_0x00d7
            byte[] r8 = r7.v
            byte[] r9 = r7.h
            int r10 = r7.i
            byte[] r1 = r7.v
            int r1 = r1.length
            java.lang.System.arraycopy(r8, r0, r9, r10, r1)
            int r8 = r7.i
            byte[] r9 = r7.v
            int r9 = r9.length
            int r8 = r8 + r9
            r7.i = r8
        L_0x00d7:
            return
        L_0x00d8:
            r2 = r9
            r9 = 0
        L_0x00da:
            if (r9 >= r10) goto L_0x0174
            int r3 = r7.x
            r7.a((int) r3)
            int r3 = r7.l
            int r3 = r3 + r1
            int r3 = r3 % 3
            r7.l = r3
            int r3 = r2 + 1
            byte r2 = r8[r2]
            if (r2 >= 0) goto L_0x00f0
            int r2 = r2 + 256
        L_0x00f0:
            int r4 = r7.y
            int r4 = r4 << 8
            int r4 = r4 + r2
            r7.y = r4
            int r2 = r7.l
            if (r2 != 0) goto L_0x016f
            byte[] r2 = r7.h
            int r4 = r7.i
            int r5 = r4 + 1
            r7.i = r5
            byte[] r5 = r7.t
            int r6 = r7.y
            int r6 = r6 >> 18
            r6 = r6 & 63
            byte r5 = r5[r6]
            r2[r4] = r5
            byte[] r2 = r7.h
            int r4 = r7.i
            int r5 = r4 + 1
            r7.i = r5
            byte[] r5 = r7.t
            int r6 = r7.y
            int r6 = r6 >> 12
            r6 = r6 & 63
            byte r5 = r5[r6]
            r2[r4] = r5
            byte[] r2 = r7.h
            int r4 = r7.i
            int r5 = r4 + 1
            r7.i = r5
            byte[] r5 = r7.t
            int r6 = r7.y
            int r6 = r6 >> 6
            r6 = r6 & 63
            byte r5 = r5[r6]
            r2[r4] = r5
            byte[] r2 = r7.h
            int r4 = r7.i
            int r5 = r4 + 1
            r7.i = r5
            byte[] r5 = r7.t
            int r6 = r7.y
            r6 = r6 & 63
            byte r5 = r5[r6]
            r2[r4] = r5
            int r2 = r7.k
            int r2 = r2 + 4
            r7.k = r2
            int r2 = r7.g
            if (r2 <= 0) goto L_0x016f
            int r2 = r7.g
            int r4 = r7.k
            if (r2 > r4) goto L_0x016f
            byte[] r2 = r7.v
            byte[] r4 = r7.h
            int r5 = r7.i
            byte[] r6 = r7.v
            int r6 = r6.length
            java.lang.System.arraycopy(r2, r0, r4, r5, r6)
            int r2 = r7.i
            byte[] r4 = r7.v
            int r4 = r4.length
            int r2 = r2 + r4
            r7.i = r2
            r7.k = r0
        L_0x016f:
            int r9 = r9 + 1
            r2 = r3
            goto L_0x00da
        L_0x0174:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.proguard.d.a(byte[], int, int):void");
    }

    public static byte[] a(byte[] bArr, boolean z, boolean z2, int i) {
        d dVar;
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        if (z) {
            dVar = new d(z2);
        } else {
            dVar = new d(0, f81264a, z2);
        }
        long o = dVar.o(bArr);
        if (o <= ((long) i)) {
            return dVar.l(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + o + ") than the specified maximum size of " + i);
    }
}
