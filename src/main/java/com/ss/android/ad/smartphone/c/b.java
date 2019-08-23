package com.ss.android.ad.smartphone.c;

import android.text.TextUtils;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class b {
    public static String a(String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String format = String.format("auth-v1/%s/%d/%d", new Object[]{"4b84eca04238efc6c4ffb4b797ad1494", Long.valueOf(System.currentTimeMillis() / 1000), 1800});
        return String.format("%s/%s", new Object[]{format, a(a("d1b0973d6fec41e693c00611e45c19a9", format.getBytes()), str.getBytes())});
    }

    private static String a(String str, byte[] bArr) throws Exception {
        Mac instance = Mac.getInstance("HmacSHA256");
        instance.init(new SecretKeySpec(str.getBytes(), "HmacSHA256"));
        byte[] doFinal = instance.doFinal(bArr);
        byte[] bArr2 = new byte[(doFinal.length * 2)];
        for (int i = 0; i < doFinal.length; i++) {
            byte[] bytes = String.format("%02x", new Object[]{Integer.valueOf(doFinal[i] & 255)}).getBytes();
            int i2 = i * 2;
            bArr2[i2] = bytes[0];
            bArr2[i2 + 1] = bytes[1];
        }
        return new String(bArr2);
    }
}
