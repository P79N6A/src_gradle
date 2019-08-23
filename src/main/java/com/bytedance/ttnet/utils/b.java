package com.bytedance.ttnet.utils;

import com.bytedance.common.utility.Logger;
import com.bytedance.ttnet.hostmonitor.f;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f22665a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        return a(bArr, bArr2, "HmacSHA256");
    }

    public static byte[] a(int i, String str) {
        byte[] bArr = {72, 75, 50, 65, 33, 53, 60, 42, 44, 46, 35, 50, 42, 63, 55, 48};
        try {
            byte[] encoded = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec("TtTokenConfig".toCharArray(), "[B@3d4eac69".getBytes(), i, SearchJediMixFeedAdapter.f42517f)).getEncoded();
            SecretKeySpec secretKeySpec = new SecretKeySpec(encoded, str);
            byte[] bArr2 = new byte[encoded.length];
            try {
                for (byte valueOf : secretKeySpec.getEncoded()) {
                    int abs = (Math.abs(Integer.parseInt(String.format("%d", new Object[]{Byte.valueOf(valueOf)}))) % 54) + 40;
                    if (abs == 47) {
                        abs = 33;
                    } else if (abs == 61 || abs == 92) {
                        abs = 35;
                    }
                    bArr2[0] = (byte) abs;
                }
                if (!Logger.debug()) {
                    return bArr2;
                }
                f.b("TtTokenEncrypt", "generateSecretKey for " + str + " key = " + bArr2);
                return bArr2;
            } catch (Throwable unused) {
                return bArr2;
            }
        } catch (Throwable unused2) {
            return bArr;
        }
    }

    private static byte[] a(byte[] bArr, byte[] bArr2, String str) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0) {
            return null;
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, str);
            Mac instance = Mac.getInstance(str);
            instance.init(secretKeySpec);
            return instance.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, String str, String str2, byte[] bArr3, boolean z) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0) {
            return null;
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, str);
            Cipher instance = Cipher.getInstance(str2);
            int i = 2;
            if (bArr3 != null) {
                if (bArr3.length != 0) {
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
                    if (z) {
                        i = 1;
                    }
                    instance.init(i, secretKeySpec, ivParameterSpec);
                    return instance.doFinal(bArr);
                }
            }
            if (z) {
                i = 1;
            }
            instance.init(i, secretKeySpec);
            return instance.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }
}
