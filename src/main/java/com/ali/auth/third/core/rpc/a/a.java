package com.ali.auth.third.core.rpc.a;

import com.ali.auth.third.core.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f4947a = "DESede/ECB/PKCS5Padding";

    public static String a(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "DESede");
            Cipher instance = Cipher.getInstance(f4947a);
            instance.init(1, secretKeySpec);
            return Base64.encode(instance.doFinal(str2.getBytes()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b(String str, String str2) {
        String trim = str2.trim();
        int intValue = Integer.valueOf(trim.substring(0, 8), 16).intValue();
        String substring = intValue == trim.length() - 8 ? trim.substring(8) : trim.substring(8, intValue + 8);
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "DESede");
            Cipher instance = Cipher.getInstance(f4947a);
            instance.init(2, secretKeySpec);
            return new String(instance.doFinal(Base64.decode(substring)));
        } catch (Exception unused) {
            return null;
        }
    }
}
