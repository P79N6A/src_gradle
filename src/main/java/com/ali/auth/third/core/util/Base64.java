package com.ali.auth.third.core.util;

import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public final class Base64 {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f4983a = new byte[SearchJediMixFeedAdapter.f42517f];

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f4984b = new char[64];

    static {
        int i;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < 128; i4++) {
            f4983a[i4] = -1;
        }
        for (int i5 = 90; i5 >= 65; i5--) {
            f4983a[i5] = (byte) (i5 - 65);
        }
        int i6 = 122;
        while (true) {
            i = 26;
            if (i6 < 97) {
                break;
            }
            f4983a[i6] = (byte) ((i6 - 97) + 26);
            i6--;
        }
        int i7 = 57;
        while (true) {
            i2 = 52;
            if (i7 < 48) {
                break;
            }
            f4983a[i7] = (byte) ((i7 - 48) + 52);
            i7--;
        }
        f4983a[43] = 62;
        f4983a[47] = 63;
        for (int i8 = 0; i8 <= 25; i8++) {
            f4984b[i8] = (char) (i8 + 65);
        }
        int i9 = 0;
        while (i <= 51) {
            f4984b[i] = (char) (i9 + 97);
            i++;
            i9++;
        }
        while (i2 <= 61) {
            f4984b[i2] = (char) (i3 + 48);
            i2++;
            i3++;
        }
        f4984b[62] = '+';
        f4984b[63] = '/';
    }

    private static int a(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!a(cArr[i2])) {
                cArr[i] = cArr[i2];
                i++;
            }
        }
        return i;
    }

    private static boolean a(char c2) {
        return c2 == ' ' || c2 == 13 || c2 == 10 || c2 == 9;
    }

    private static boolean b(char c2) {
        return c2 == '=';
    }

    private static boolean c(char c2) {
        return c2 < 128 && f4983a[c2] != -1;
    }

    public static byte[] decode(String str) {
        byte[] bArr = null;
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int a2 = a(charArray);
        if (a2 % 4 != 0) {
            return null;
        }
        int i = a2 / 4;
        if (i == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[(i * 3)];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < i - 1) {
            int i5 = i3 + 1;
            char c2 = charArray[i3];
            if (c(c2)) {
                int i6 = i5 + 1;
                char c3 = charArray[i5];
                if (c(c3)) {
                    int i7 = i6 + 1;
                    char c4 = charArray[i6];
                    if (c(c4)) {
                        int i8 = i7 + 1;
                        char c5 = charArray[i7];
                        if (c(c5)) {
                            byte b2 = f4983a[c2];
                            byte b3 = f4983a[c3];
                            byte b4 = f4983a[c4];
                            byte b5 = f4983a[c5];
                            int i9 = i4 + 1;
                            bArr2[i4] = (byte) ((b2 << 2) | (b3 >> 4));
                            int i10 = i9 + 1;
                            bArr2[i9] = (byte) (((b3 & 15) << 4) | ((b4 >> 2) & 15));
                            i4 = i10 + 1;
                            bArr2[i10] = (byte) ((b4 << 6) | b5);
                            i2++;
                            i3 = i8;
                        }
                    }
                }
            }
            return null;
        }
        int i11 = i3 + 1;
        char c6 = charArray[i3];
        if (c(c6)) {
            int i12 = i11 + 1;
            char c7 = charArray[i11];
            if (c(c7)) {
                byte b6 = f4983a[c6];
                byte b7 = f4983a[c7];
                int i13 = i12 + 1;
                char c8 = charArray[i12];
                char c9 = charArray[i13];
                if (c(c8) && c(c9)) {
                    byte b8 = f4983a[c8];
                    byte b9 = f4983a[c9];
                    int i14 = i4 + 1;
                    bArr2[i4] = (byte) ((b6 << 2) | (b7 >> 4));
                    bArr2[i14] = (byte) (((b7 & 15) << 4) | ((b8 >> 2) & 15));
                    bArr2[i14 + 1] = (byte) (b9 | (b8 << 6));
                    return bArr2;
                } else if (!b(c8) || !b(c9)) {
                    if (!b(c8) && b(c9)) {
                        byte b10 = f4983a[c8];
                        if ((b10 & 3) != 0) {
                            return null;
                        }
                        int i15 = i2 * 3;
                        bArr = new byte[(i15 + 2)];
                        System.arraycopy(bArr2, 0, bArr, 0, i15);
                        bArr[i4] = (byte) ((b6 << 2) | (b7 >> 4));
                        bArr[i4 + 1] = (byte) (((b10 >> 2) & 15) | ((b7 & 15) << 4));
                    }
                } else if ((b7 & 15) != 0) {
                    return null;
                } else {
                    int i16 = i2 * 3;
                    byte[] bArr3 = new byte[(i16 + 1)];
                    System.arraycopy(bArr2, 0, bArr3, 0, i16);
                    bArr3[i4] = (byte) ((b6 << 2) | (b7 >> 4));
                    return bArr3;
                }
            }
        }
        return bArr;
    }

    public static String encode(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length * 8;
        if (length == 0) {
            return "";
        }
        int i = length % 24;
        int i2 = length / 24;
        char[] cArr = new char[((i != 0 ? i2 + 1 : i2) * 4)];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i2) {
            int i6 = i4 + 1;
            byte b2 = bArr[i4];
            int i7 = i6 + 1;
            byte b3 = bArr[i6];
            int i8 = i7 + 1;
            byte b4 = bArr[i7];
            byte b5 = (byte) (b3 & 15);
            byte b6 = (byte) (b2 & 3);
            byte b7 = (byte) ((b2 & Byte.MIN_VALUE) == 0 ? b2 >> 2 : (b2 >> 2) ^ 192);
            byte b8 = (byte) ((b3 & Byte.MIN_VALUE) == 0 ? b3 >> 4 : (b3 >> 4) ^ 240);
            byte b9 = (byte) ((b4 & Byte.MIN_VALUE) == 0 ? b4 >> 6 : (b4 >> 6) ^ 252);
            int i9 = i5 + 1;
            cArr[i5] = f4984b[b7];
            int i10 = i9 + 1;
            cArr[i9] = f4984b[b8 | (b6 << 4)];
            int i11 = i10 + 1;
            cArr[i10] = f4984b[(b5 << 2) | b9];
            cArr[i11] = f4984b[b4 & 63];
            i3++;
            i5 = i11 + 1;
            i4 = i8;
        }
        if (i == 8) {
            byte b10 = bArr[i4];
            byte b11 = (byte) (b10 & 3);
            int i12 = i5 + 1;
            cArr[i5] = f4984b[(byte) ((b10 & Byte.MIN_VALUE) == 0 ? b10 >> 2 : (b10 >> 2) ^ 192)];
            int i13 = i12 + 1;
            cArr[i12] = f4984b[b11 << 4];
            cArr[i13] = '=';
            cArr[i13 + 1] = '=';
        } else if (i == 16) {
            byte b12 = bArr[i4];
            byte b13 = bArr[i4 + 1];
            byte b14 = (byte) (b13 & 15);
            byte b15 = (byte) (b12 & 3);
            byte b16 = (byte) ((b12 & Byte.MIN_VALUE) == 0 ? b12 >> 2 : (b12 >> 2) ^ 192);
            byte b17 = (byte) ((b13 & Byte.MIN_VALUE) == 0 ? b13 >> 4 : (b13 >> 4) ^ 240);
            int i14 = i5 + 1;
            cArr[i5] = f4984b[b16];
            int i15 = i14 + 1;
            cArr[i14] = f4984b[b17 | (b15 << 4)];
            cArr[i15] = f4984b[b14 << 2];
            cArr[i15 + 1] = '=';
        }
        return new String(cArr);
    }
}
