package com.sina.weibo.sdk.utils;

public final class Base64 {
    private static char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();
    private static byte[] codes = new byte[256];

    static {
        for (int i = 0; i < 256; i++) {
            codes[i] = -1;
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            codes[i2] = (byte) (i2 - 65);
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            codes[i3] = (byte) ((i3 + 26) - 97);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            codes[i4] = (byte) ((i4 + 52) - 48);
        }
        codes[43] = 62;
        codes[47] = 63;
    }

    public static byte[] decode(byte[] bArr) {
        int length = ((bArr.length + 3) / 4) * 3;
        if (bArr.length > 0 && bArr[bArr.length - 1] == 61) {
            length--;
        }
        if (bArr.length > 1 && bArr[bArr.length - 2] == 61) {
            length--;
        }
        byte[] bArr2 = new byte[length];
        int i = 0;
        byte b2 = 0;
        int i2 = 0;
        for (byte b3 : bArr) {
            byte b4 = codes[b3 & 255];
            if (b4 >= 0) {
                i2 += 6;
                b2 = (b2 << 6) | b4;
                if (i2 >= 8) {
                    i2 -= 8;
                    bArr2[i] = (byte) ((b2 >> i2) & 255);
                    i++;
                }
            }
        }
        if (i == bArr2.length) {
            return bArr2;
        }
        throw new RuntimeException("miscalculated data length!");
    }

    public static char[] encode(byte[] bArr) {
        boolean z;
        int i;
        char[] cArr = new char[(((bArr.length + 2) / 3) * 4)];
        int i2 = 0;
        int i3 = 0;
        while (i2 < bArr.length) {
            int i4 = (bArr[i2] & 255) << 8;
            int i5 = i2 + 1;
            boolean z2 = true;
            if (i5 < bArr.length) {
                i4 |= bArr[i5] & 255;
                z = true;
            } else {
                z = false;
            }
            int i6 = i4 << 8;
            int i7 = i2 + 2;
            if (i7 < bArr.length) {
                i6 |= bArr[i7] & 255;
            } else {
                z2 = false;
            }
            int i8 = i3 + 3;
            char[] cArr2 = alphabet;
            int i9 = 64;
            if (z2) {
                i = i6 & 63;
            } else {
                i = 64;
            }
            cArr[i8] = cArr2[i];
            int i10 = i6 >> 6;
            int i11 = i3 + 2;
            char[] cArr3 = alphabet;
            if (z) {
                i9 = i10 & 63;
            }
            cArr[i11] = cArr3[i9];
            int i12 = i10 >> 6;
            cArr[i3 + 1] = alphabet[i12 & 63];
            cArr[i3 + 0] = alphabet[(i12 >> 6) & 63];
            i2 += 3;
            i3 += 4;
        }
        return cArr;
    }

    public static byte[] encodebyte(byte[] bArr) {
        boolean z;
        int i;
        byte[] bArr2 = new byte[(((bArr.length + 2) / 3) * 4)];
        int i2 = 0;
        int i3 = 0;
        while (i2 < bArr.length) {
            int i4 = (bArr[i2] & 255) << 8;
            int i5 = i2 + 1;
            boolean z2 = true;
            if (i5 < bArr.length) {
                i4 |= bArr[i5] & 255;
                z = true;
            } else {
                z = false;
            }
            int i6 = i4 << 8;
            int i7 = i2 + 2;
            if (i7 < bArr.length) {
                i6 |= bArr[i7] & 255;
            } else {
                z2 = false;
            }
            int i8 = i3 + 3;
            char[] cArr = alphabet;
            int i9 = 64;
            if (z2) {
                i = i6 & 63;
            } else {
                i = 64;
            }
            bArr2[i8] = (byte) cArr[i];
            int i10 = i6 >> 6;
            int i11 = i3 + 2;
            char[] cArr2 = alphabet;
            if (z) {
                i9 = i10 & 63;
            }
            bArr2[i11] = (byte) cArr2[i9];
            int i12 = i10 >> 6;
            bArr2[i3 + 1] = (byte) alphabet[i12 & 63];
            bArr2[i3 + 0] = (byte) alphabet[(i12 >> 6) & 63];
            i2 += 3;
            i3 += 4;
        }
        return bArr2;
    }
}
