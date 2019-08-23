package com.coloros.mcssdk.c;

import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;

public final class b {
    private static String a() {
        byte[] c2 = c("com.nearme.mcs");
        int length = c2.length % 2 == 0 ? c2.length : c2.length - 1;
        for (int i = 0; i < length; i += 2) {
            byte b2 = c2[i];
            int i2 = i + 1;
            c2[i] = c2[i2];
            c2[i2] = b2;
        }
        return c2 != null ? new String(c2, Charset.forName("UTF-8")) : "";
    }

    public static String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return c.b(str, a());
            } catch (Exception e2) {
                d.b("desDecrypt-" + e2.getMessage());
            }
        }
        return "";
    }

    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                hexString = PushConstants.PUSH_TYPE_NOTIFY.concat(String.valueOf(hexString));
            }
            sb.append(hexString.toUpperCase(Locale.getDefault()));
        }
        return sb.toString();
    }

    private static byte[] b(String str) {
        if (str.length() <= 0) {
            return null;
        }
        byte[] bArr = new byte[(str.length() / 2)];
        for (int i = 0; i < str.length() / 2; i++) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            bArr[i] = (byte) ((Integer.parseInt(str.substring(i2, i3), 16) * 16) + Integer.parseInt(str.substring(i3, i2 + 2), 16));
        }
        return bArr;
    }

    private static byte[] b(byte[] bArr) {
        int length = bArr.length % 2 == 0 ? bArr.length : bArr.length - 1;
        for (int i = 0; i < length; i += 2) {
            byte b2 = bArr[i];
            int i2 = i + 1;
            bArr[i] = bArr[i2];
            bArr[i2] = b2;
        }
        return bArr;
    }

    private static byte[] c(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new byte[0];
        }
    }

    private static String d(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return c.a(str, a());
            } catch (Exception e2) {
                d.b("desEncrypt-" + e2.getMessage());
            }
        }
        return "";
    }
}
