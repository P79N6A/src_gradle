package cn.com.chinatelecom.a.a.c;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static byte[] f1683a = "0000000000000000".getBytes();

    public static String a() {
        try {
            String uuid = UUID.randomUUID().toString();
            if (TextUtils.isEmpty(uuid)) {
                return "";
            }
            String replace = uuid.replace("-", "");
            try {
                if (replace.length() >= 16) {
                    return replace.substring(0, 16);
                }
            } catch (Exception unused) {
            }
            return replace;
        } catch (Exception unused2) {
            return "";
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append("0123456789ABCDEF".charAt((b2 >> 4) & 15));
            sb.append("0123456789ABCDEF".charAt(b2 & 15));
        }
        return sb.toString();
    }

    public static String b(String str, String str2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f1683a);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            byte[] bytes = str.getBytes("utf-8");
            instance.init(1, secretKeySpec, ivParameterSpec);
            return i.a(instance.doFinal(bytes));
        } catch (UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            return null;
        }
    }

    public static String c(String str, String str2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f1683a);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, ivParameterSpec);
            return new String(instance.doFinal(i.a(str)));
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            return null;
        }
    }

    public static String a(String str, String str2) throws Exception {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        byte[] encoded = a(str, str.getBytes("utf-8"), 32).getEncoded();
        int length = str2.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str2.substring(i2, i2 + 2), 16).byteValue();
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(encoded, "AES");
        Cipher instance = Cipher.getInstance("AES");
        instance.init(2, secretKeySpec);
        return i.b(instance.doFinal(bArr));
    }

    public static SecretKey a(String str, byte[] bArr, int i) {
        byte[] bArr2;
        int i2 = 32;
        if (bArr == null) {
            bArr2 = new byte[32];
        } else {
            byte[] bArr3 = new byte[32];
            if (bArr.length - 0 <= 32) {
                i2 = bArr.length - 0;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                bArr3[i3 + 0] = bArr[i3];
            }
            bArr2 = bArr3;
        }
        try {
            return new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(str.toCharArray(), bArr2, 100, 256)).getEncoded(), "AES");
        } catch (Exception e2) {
            throw new RuntimeException("Deal with exceptions properly!", e2);
        }
    }
}
