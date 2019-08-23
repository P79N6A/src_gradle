package com.xiaomi.push;

import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public class aw {

    /* renamed from: a  reason: collision with root package name */
    private static final String f81847a = System.getProperty("line.separator");

    /* renamed from: a  reason: collision with other field name */
    private static byte[] f165a = new byte[SearchJediMixFeedAdapter.f42517f];

    /* renamed from: a  reason: collision with other field name */
    private static char[] f166a = new char[64];

    static {
        char c2 = 'A';
        int i = 0;
        while (c2 <= 'Z') {
            f166a[i] = c2;
            c2 = (char) (c2 + 1);
            i++;
        }
        char c3 = 'a';
        while (c3 <= 'z') {
            f166a[i] = c3;
            c3 = (char) (c3 + 1);
            i++;
        }
        char c4 = '0';
        while (c4 <= '9') {
            f166a[i] = c4;
            c4 = (char) (c4 + 1);
            i++;
        }
        f166a[i] = '+';
        f166a[i + 1] = '/';
        for (int i2 = 0; i2 < f165a.length; i2++) {
            f165a[i2] = -1;
        }
        for (int i3 = 0; i3 < 64; i3++) {
            f165a[f166a[i3]] = (byte) i3;
        }
    }

    public static byte[] a(String str) {
        return a(str.toCharArray());
    }

    public static byte[] a(char[] cArr) {
        return a(cArr, 0, cArr.length);
    }

    public static byte[] a(char[] cArr, int i, int i2) {
        char c2;
        if (i2 % 4 == 0) {
            while (i2 > 0 && cArr[(i + i2) - 1] == '=') {
                i2--;
            }
            int i3 = (i2 * 3) / 4;
            byte[] bArr = new byte[i3];
            int i4 = i2 + i;
            int i5 = 0;
            while (i < i4) {
                int i6 = i + 1;
                char c3 = cArr[i];
                int i7 = i6 + 1;
                char c4 = cArr[i6];
                char c5 = 'A';
                if (i7 < i4) {
                    c2 = cArr[i7];
                    i7++;
                } else {
                    c2 = 'A';
                }
                if (i7 < i4) {
                    c5 = cArr[i7];
                    i7++;
                }
                if (c3 > 127 || c4 > 127 || c2 > 127 || c5 > 127) {
                    throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
                }
                byte b2 = f165a[c3];
                byte b3 = f165a[c4];
                byte b4 = f165a[c2];
                byte b5 = f165a[c5];
                if (b2 < 0 || b3 < 0 || b4 < 0 || b5 < 0) {
                    throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
                }
                int i8 = i5 + 1;
                bArr[i5] = (byte) ((b2 << 2) | (b3 >>> 4));
                if (i8 < i3) {
                    bArr[i8] = (byte) (((b3 & 15) << 4) | (b4 >>> 2));
                    i5 = i8 + 1;
                } else {
                    i5 = i8;
                }
                if (i5 < i3) {
                    bArr[i5] = (byte) (((b4 & 3) << 6) | b5);
                    i5++;
                }
                i = i7;
            }
            return bArr;
        }
        throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
    }

    public static char[] a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static char[] a(byte[] bArr, int i, int i2) {
        byte b2;
        int i3;
        byte b3;
        int i4 = ((i2 * 4) + 2) / 3;
        char[] cArr = new char[(((i2 + 2) / 3) * 4)];
        int i5 = i2 + i;
        int i6 = 0;
        while (i < i5) {
            int i7 = i + 1;
            byte b4 = bArr[i] & 255;
            if (i7 < i5) {
                b2 = bArr[i7] & 255;
                i7++;
            } else {
                b2 = 0;
            }
            if (i7 < i5) {
                i3 = i7 + 1;
                b3 = bArr[i7] & 255;
            } else {
                i3 = i7;
                b3 = 0;
            }
            int i8 = i6 + 1;
            cArr[i6] = f166a[b4 >>> 2];
            int i9 = i8 + 1;
            cArr[i8] = f166a[((b4 & 3) << 4) | (b2 >>> 4)];
            char c2 = '=';
            cArr[i9] = i9 < i4 ? f166a[((b2 & 15) << 2) | (b3 >>> 6)] : '=';
            int i10 = i9 + 1;
            if (i10 < i4) {
                c2 = f166a[b3 & 63];
            }
            cArr[i10] = c2;
            i6 = i10 + 1;
            i = i3;
        }
        return cArr;
    }
}
