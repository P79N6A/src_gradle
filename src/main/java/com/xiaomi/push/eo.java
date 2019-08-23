package com.xiaomi.push;

public class eo {
    private static void a(byte[] bArr) {
        if (bArr.length >= 2) {
            bArr[0] = 99;
            bArr[1] = 100;
        }
    }

    public static byte[] a(String str, byte[] bArr) {
        byte[] a2 = aw.a(str);
        try {
            a(a2);
            return i.a(a2, bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] b(String str, byte[] bArr) {
        byte[] a2 = aw.a(str);
        try {
            a(a2);
            return i.b(a2, bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
