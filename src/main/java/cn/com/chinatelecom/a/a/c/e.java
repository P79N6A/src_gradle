package cn.com.chinatelecom.a.a.c;

import cn.com.chinatelecom.a.a.e.f;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1687a = "e";

    /* renamed from: b  reason: collision with root package name */
    private static byte[] f1688b = {1, 2, 3, 4, 5, 6, 7, 8};

    private static byte[] b(String str) {
        byte[] bArr = new byte[(str.length() / 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            bArr[i] = (byte) ((a(str.substring(i2, i3)) * 16) + a(str.substring(i3, i2 + 2)));
        }
        return bArr;
    }

    private static byte a(String str) {
        if (PushConstants.PUSH_TYPE_NOTIFY.equals(str)) {
            return 0;
        }
        if (PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(str)) {
            return 1;
        }
        if (PushConstants.PUSH_TYPE_UPLOAD_LOG.equals(str)) {
            return 2;
        }
        if ("3".equals(str)) {
            return 3;
        }
        if (PushConstants.PUSH_TYPE_WITHDRAW_NOTIFICATION.equals(str)) {
            return 4;
        }
        if ("5".equals(str)) {
            return 5;
        }
        if ("6".equals(str)) {
            return 6;
        }
        if ("7".equals(str)) {
            return 7;
        }
        if ("8".equals(str)) {
            return 8;
        }
        if ("9".equals(str)) {
            return 9;
        }
        if ("A".equals(str) || "a".equals(str)) {
            return 10;
        }
        if ("B".equals(str) || "b".equals(str)) {
            return 11;
        }
        if ("C".equals(str) || "c".equals(str)) {
            return 12;
        }
        if ("D".equals(str) || "d".equals(str)) {
            return 13;
        }
        if ("E".equals(str) || "e".equals(str)) {
            return 14;
        }
        if ("F".equals(str) || "f".equals(str)) {
            return 15;
        }
        return 0;
    }

    public static String a(String str, String str2) throws Exception {
        try {
            Cipher instance = Cipher.getInstance("DESede/CBC/PKCS5Padding");
            instance.init(1, new SecretKeySpec(b(str2), "DESede"), new IvParameterSpec(f1688b));
            return c.a(instance.doFinal(i.b(str)));
        } catch (Exception e2) {
            f.a(f1687a, "encryptByKey Exception", e2);
            return "";
        }
    }

    public static String b(String str, String str2) throws Exception {
        byte[] bArr;
        try {
            Cipher instance = Cipher.getInstance("DESede/CBC/PKCS5Padding");
            instance.init(2, new SecretKeySpec(b(str2), "DESede"), new IvParameterSpec(f1688b));
            if (str == null) {
                bArr = null;
            } else {
                bArr = b.a(str);
            }
            return new String(instance.doFinal(bArr), "UTF-8");
        } catch (Exception e2) {
            f.a(f1687a, "decryptByKey Exception", e2);
            return "";
        }
    }
}
