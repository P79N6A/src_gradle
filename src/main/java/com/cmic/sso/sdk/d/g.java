package com.cmic.sso.sdk.d;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class g {

    /* renamed from: a  reason: collision with root package name */
    static char[] f23069a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes("UTF-8"));
            return a(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        } catch (UnsupportedEncodingException unused2) {
            return null;
        }
    }

    private static String a(byte[] bArr) {
        char[] cArr = new char[32];
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            byte b2 = bArr[i2];
            int i3 = i + 1;
            cArr[i] = f23069a[(b2 >>> 4) & 15];
            i = i3 + 1;
            cArr[i3] = f23069a[b2 & 15];
        }
        return new String(cArr);
    }
}
