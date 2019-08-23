package com.bytedance.common.utility;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class StringEncryptUtils {
    public static String encryptBySHA256(String str) {
        return encrypt(str, "SHA-256");
    }

    public static String bytes2Hex(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            for (byte valueOf : bArr) {
                sb.append(String.format("%02x", new Object[]{Byte.valueOf(valueOf)}));
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String encrypt(String str, String str2) {
        byte[] bytes = str.getBytes();
        try {
            if (StringUtils.isEmpty(str2)) {
                str2 = "SHA-256";
            }
            MessageDigest instance = MessageDigest.getInstance(str2);
            instance.update(bytes);
            return bytes2Hex(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }
}
