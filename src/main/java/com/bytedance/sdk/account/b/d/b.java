package com.bytedance.sdk.account.b.d;

import java.security.MessageDigest;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f22268a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(String str) {
        try {
            return a(str.getBytes());
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] digest = instance.digest();
            char[] cArr = new char[32];
            int i = 0;
            for (int i2 = 0; i2 < 16; i2++) {
                byte b2 = digest[i2];
                int i3 = i + 1;
                cArr[i] = f22268a[(b2 >>> 4) & 15];
                i = i3 + 1;
                cArr[i3] = f22268a[b2 & 15];
            }
            return new String(cArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
