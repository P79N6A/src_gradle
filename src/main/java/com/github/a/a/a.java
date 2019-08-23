package com.github.a.a;

public final class a {
    public static String a(char c2) {
        boolean z;
        if ((19968 > c2 || c2 > 40869 || b(c2) <= 0) && 12295 != c2) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return String.valueOf(c2);
        }
        if (c2 == 12295) {
            return "LING";
        }
        return e.f24369b[b(c2)];
    }

    private static int b(char c2) {
        int i = c2 - 19968;
        if (i >= 0 && i < 7000) {
            return a(b.f24362a, b.f24363b, i);
        }
        if (7000 > i || i >= 14000) {
            return a(d.f24366a, d.f24367b, i - 14000);
        }
        return a(c.f24364a, c.f24365b, i - 7000);
    }

    private static short a(byte[] bArr, byte[] bArr2, int i) {
        int i2 = i % 8;
        short s = (short) (bArr2[i] & 255);
        if ((bArr[i / 8] & e.f24368a[i2]) != 0) {
            return (short) (s | 256);
        }
        return s;
    }
}
