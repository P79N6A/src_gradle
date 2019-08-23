package com.unicom.xiaowo.login.a;

import android.text.TextUtils;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f81412a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    private static byte[] f81413b = "0000000000000000".getBytes();

    static {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public static String a() {
        String str = "";
        try {
            String uuid = UUID.randomUUID().toString();
            if (TextUtils.isEmpty(uuid)) {
                return str;
            }
            String replace = uuid.replace("-", "");
            try {
                return replace.length() >= 16 ? replace.substring(0, 16) : replace;
            } catch (Exception e2) {
                String str2 = replace;
                e = e2;
                str = str2;
                com.google.a.a.a.a.a.a.b(e);
                return str;
            }
        } catch (Exception e3) {
            e = e3;
            com.google.a.a.a.a.a.a.b(e);
            return str;
        }
    }

    public static String a(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, secretKeySpec, new IvParameterSpec(new byte[instance.getBlockSize()]));
            return a(instance.doFinal(str.getBytes("UTF-8")));
        } catch (Exception e2) {
            com.google.a.a.a.a.a.a.b(e2);
            return null;
        }
    }

    private static String a(byte[] bArr) {
        String str;
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer((bArr.length * 3) / 2);
        int i = length - 3;
        int i2 = 0;
        loop0:
        while (true) {
            int i3 = 0;
            while (i2 <= i) {
                byte b2 = ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8) | (bArr[i2 + 2] & 255);
                stringBuffer.append(f81412a[(b2 >> 18) & 63]);
                stringBuffer.append(f81412a[(b2 >> 12) & 63]);
                stringBuffer.append(f81412a[(b2 >> 6) & 63]);
                stringBuffer.append(f81412a[b2 & 63]);
                i2 += 3;
                int i4 = i3 + 1;
                if (i3 >= 14) {
                    stringBuffer.append(" ");
                } else {
                    i3 = i4;
                }
            }
            break loop0;
        }
        int i5 = length + 0;
        if (i2 == i5 - 2) {
            int i6 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            stringBuffer.append(f81412a[(i6 >> 18) & 63]);
            stringBuffer.append(f81412a[(i6 >> 12) & 63]);
            stringBuffer.append(f81412a[(i6 >> 6) & 63]);
            str = "=";
        } else {
            if (i2 == i5 - 1) {
                int i7 = (bArr[i2] & 255) << 16;
                stringBuffer.append(f81412a[(i7 >> 18) & 63]);
                stringBuffer.append(f81412a[(i7 >> 12) & 63]);
                str = "==";
            }
            return stringBuffer.toString();
        }
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    private static byte[] a(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            int digit = Character.digit(charArray[i2 + 1], 16) | (Character.digit(charArray[i2], 16) << 4);
            if (digit > 127) {
                digit -= 256;
            }
            bArr[i] = (byte) digit;
        }
        return bArr;
    }

    public static String b(String str, String str2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f81413b);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, ivParameterSpec);
            return new String(instance.doFinal(a(str)));
        } catch (Exception unused) {
            return null;
        }
    }
}
