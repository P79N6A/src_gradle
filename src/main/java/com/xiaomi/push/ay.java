package com.xiaomi.push;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ay {
    private static String a(byte b2) {
        int i = (b2 & Byte.MAX_VALUE) + (b2 < 0 ? (byte) 128 : 0);
        StringBuilder sb = new StringBuilder();
        sb.append(i < 16 ? PushConstants.PUSH_TYPE_NOTIFY : "");
        sb.append(Integer.toHexString(i).toLowerCase());
        return sb.toString();
    }

    public static String a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            StringBuffer stringBuffer = new StringBuffer();
            instance.update(str.getBytes(), 0, str.length());
            byte[] digest = instance.digest();
            for (byte a2 : digest) {
                stringBuffer.append(a(a2));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String b(String str) {
        return a(str).subSequence(8, 24).toString();
    }
}
