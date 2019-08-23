package com.alipay.sdk.d;

import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f5482a = new byte[SearchJediMixFeedAdapter.f42517f];

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f5483b = new char[64];

    private static boolean a(char c2) {
        return c2 == '=';
    }

    static {
        int i;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < 128; i4++) {
            f5482a[i4] = -1;
        }
        for (int i5 = 90; i5 >= 65; i5--) {
            f5482a[i5] = (byte) (i5 - 65);
        }
        int i6 = 122;
        while (true) {
            i = 26;
            if (i6 < 97) {
                break;
            }
            f5482a[i6] = (byte) ((i6 - 97) + 26);
            i6--;
        }
        int i7 = 57;
        while (true) {
            i2 = 52;
            if (i7 < 48) {
                break;
            }
            f5482a[i7] = (byte) ((i7 - 48) + 52);
            i7--;
        }
        f5482a[43] = 62;
        f5482a[47] = 63;
        for (int i8 = 0; i8 <= 25; i8++) {
            f5483b[i8] = (char) (i8 + 65);
        }
        int i9 = 0;
        while (i <= 51) {
            f5483b[i] = (char) (i9 + 97);
            i++;
            i9++;
        }
        while (i2 <= 61) {
            f5483b[i2] = (char) (i3 + 48);
            i2++;
            i3++;
        }
        f5483b[62] = '+';
        f5483b[63] = '/';
    }

    private static boolean b(char c2) {
        if (c2 >= 128 || f5482a[c2] == -1) {
            return false;
        }
        return true;
    }

    public static String a(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length * 8;
        if (length == 0) {
            return "";
        }
        int i8 = length % 24;
        int i9 = length / 24;
        if (i8 != 0) {
            i = i9 + 1;
        } else {
            i = i9;
        }
        char[] cArr = new char[(i * 4)];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < i9) {
            int i13 = i11 + 1;
            byte b2 = bArr[i11];
            int i14 = i13 + 1;
            byte b3 = bArr[i13];
            int i15 = i14 + 1;
            byte b4 = bArr[i14];
            byte b5 = (byte) (b3 & 15);
            byte b6 = (byte) (b2 & 3);
            if ((b2 & Byte.MIN_VALUE) == 0) {
                i5 = b2 >> 2;
            } else {
                i5 = (b2 >> 2) ^ 192;
            }
            byte b7 = (byte) i5;
            if ((b3 & Byte.MIN_VALUE) == 0) {
                i6 = b3 >> 4;
            } else {
                i6 = (b3 >> 4) ^ 240;
            }
            byte b8 = (byte) i6;
            if ((b4 & Byte.MIN_VALUE) == 0) {
                i7 = b4 >> 6;
            } else {
                i7 = (b4 >> 6) ^ 252;
            }
            byte b9 = (byte) i7;
            int i16 = i12 + 1;
            cArr[i12] = f5483b[b7];
            int i17 = i16 + 1;
            cArr[i16] = f5483b[b8 | (b6 << 4)];
            int i18 = i17 + 1;
            cArr[i17] = f5483b[(b5 << 2) | b9];
            cArr[i18] = f5483b[b4 & 63];
            i10++;
            i12 = i18 + 1;
            i11 = i15;
        }
        if (i8 == 8) {
            byte b10 = bArr[i11];
            byte b11 = (byte) (b10 & 3);
            if ((b10 & Byte.MIN_VALUE) == 0) {
                i4 = b10 >> 2;
            } else {
                i4 = (b10 >> 2) ^ 192;
            }
            int i19 = i12 + 1;
            cArr[i12] = f5483b[(byte) i4];
            int i20 = i19 + 1;
            cArr[i19] = f5483b[b11 << 4];
            cArr[i20] = '=';
            cArr[i20 + 1] = '=';
        } else if (i8 == 16) {
            byte b12 = bArr[i11];
            byte b13 = bArr[i11 + 1];
            byte b14 = (byte) (b13 & 15);
            byte b15 = (byte) (b12 & 3);
            if ((b12 & Byte.MIN_VALUE) == 0) {
                i2 = b12 >> 2;
            } else {
                i2 = (b12 >> 2) ^ 192;
            }
            byte b16 = (byte) i2;
            if ((b13 & Byte.MIN_VALUE) == 0) {
                i3 = b13 >> 4;
            } else {
                i3 = (b13 >> 4) ^ 240;
            }
            byte b17 = (byte) i3;
            int i21 = i12 + 1;
            cArr[i12] = f5483b[b16];
            int i22 = i21 + 1;
            cArr[i21] = f5483b[b17 | (b15 << 4)];
            cArr[i22] = f5483b[b14 << 2];
            cArr[i22 + 1] = '=';
        }
        return new String(cArr);
    }

    public static byte[] a(String str) {
        int i;
        boolean z;
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        if (charArray == null) {
            i = 0;
        } else {
            int length = charArray.length;
            i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char c2 = charArray[i2];
                if (c2 == ' ' || c2 == 13 || c2 == 10 || c2 == 9) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    charArray[i] = charArray[i2];
                    i++;
                }
            }
        }
        if (i % 4 != 0) {
            return null;
        }
        int i3 = i / 4;
        if (i3 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[(i3 * 3)];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i3 - 1) {
            int i7 = i5 + 1;
            char c3 = charArray[i5];
            if (b(c3)) {
                int i8 = i7 + 1;
                char c4 = charArray[i7];
                if (b(c4)) {
                    int i9 = i8 + 1;
                    char c5 = charArray[i8];
                    if (b(c5)) {
                        int i10 = i9 + 1;
                        char c6 = charArray[i9];
                        if (b(c6)) {
                            byte b2 = f5482a[c3];
                            byte b3 = f5482a[c4];
                            byte b4 = f5482a[c5];
                            byte b5 = f5482a[c6];
                            int i11 = i6 + 1;
                            bArr[i6] = (byte) ((b2 << 2) | (b3 >> 4));
                            int i12 = i11 + 1;
                            bArr[i11] = (byte) (((b3 & 15) << 4) | ((b4 >> 2) & 15));
                            i6 = i12 + 1;
                            bArr[i12] = (byte) ((b4 << 6) | b5);
                            i4++;
                            i5 = i10;
                        }
                    }
                }
            }
            return null;
        }
        int i13 = i5 + 1;
        char c7 = charArray[i5];
        if (b(c7)) {
            int i14 = i13 + 1;
            char c8 = charArray[i13];
            if (b(c8)) {
                byte b6 = f5482a[c7];
                byte b7 = f5482a[c8];
                int i15 = i14 + 1;
                char c9 = charArray[i14];
                char c10 = charArray[i15];
                if (b(c9) && b(c10)) {
                    byte b8 = f5482a[c9];
                    byte b9 = f5482a[c10];
                    int i16 = i6 + 1;
                    bArr[i6] = (byte) ((b6 << 2) | (b7 >> 4));
                    bArr[i16] = (byte) (((b7 & 15) << 4) | ((b8 >> 2) & 15));
                    bArr[i16 + 1] = (byte) (b9 | (b8 << 6));
                    return bArr;
                } else if (!a(c9) || !a(c10)) {
                    if (a(c9) || !a(c10)) {
                        return null;
                    }
                    byte b10 = f5482a[c9];
                    if ((b10 & 3) != 0) {
                        return null;
                    }
                    int i17 = i4 * 3;
                    byte[] bArr2 = new byte[(i17 + 2)];
                    System.arraycopy(bArr, 0, bArr2, 0, i17);
                    bArr2[i6] = (byte) ((b6 << 2) | (b7 >> 4));
                    bArr2[i6 + 1] = (byte) (((b10 >> 2) & 15) | ((b7 & 15) << 4));
                    return bArr2;
                } else if ((b7 & 15) != 0) {
                    return null;
                } else {
                    int i18 = i4 * 3;
                    byte[] bArr3 = new byte[(i18 + 1)];
                    System.arraycopy(bArr, 0, bArr3, 0, i18);
                    bArr3[i6] = (byte) ((b6 << 2) | (b7 >> 4));
                    return bArr3;
                }
            }
        }
        return null;
    }
}
