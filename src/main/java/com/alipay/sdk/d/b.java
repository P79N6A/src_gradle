package com.alipay.sdk.d;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class b {
    public static String a(int i, String str, String str2) {
        byte[] bArr;
        String str3;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "DES");
            Cipher instance = Cipher.getInstance("DES");
            instance.init(i, secretKeySpec);
            if (i == 2) {
                bArr = a.a(str);
            } else {
                bArr = str.getBytes("UTF-8");
            }
            byte[] doFinal = instance.doFinal(bArr);
            if (i == 2) {
                str3 = new String(doFinal);
            } else {
                str3 = a.a(doFinal);
            }
            return str3;
        } catch (Exception unused) {
            return null;
        }
    }
}
