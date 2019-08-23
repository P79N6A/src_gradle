package com.cmic.sso.sdk.d;

import java.security.MessageDigest;

public class c {

    /* renamed from: a  reason: collision with root package name */
    protected static char[] f23053a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b  reason: collision with root package name */
    protected static MessageDigest f23054b;

    /* renamed from: c  reason: collision with root package name */
    private static final char[] f23055c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        try {
            f23054b = MessageDigest.getInstance("MD5");
        } catch (Exception unused) {
        }
    }

    private static String b(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static String a(byte[] bArr) {
        f23054b.update(bArr);
        return b(f23054b.digest());
    }

    private static void a(byte b2, StringBuffer stringBuffer) {
        char c2 = f23053a[(b2 & 240) >> 4];
        char c3 = f23053a[b2 & 15];
        stringBuffer.append(c2);
        stringBuffer.append(c3);
    }

    private static String a(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer(i2 * 2);
        int i3 = i2 + i;
        while (i < i3) {
            a(bArr[i], stringBuffer);
            i++;
        }
        return stringBuffer.toString();
    }
}
