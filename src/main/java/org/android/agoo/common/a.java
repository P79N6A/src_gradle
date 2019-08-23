package org.android.agoo.common;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static byte[] f83990a = {82, 22, 50, 44, -16, 124, -40, -114, -87, -40, 37, 23, -56, 23, -33, 75};

    /* renamed from: b  reason: collision with root package name */
    private static ThreadLocal<Cipher> f83991b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    private static final AlgorithmParameterSpec f83992c = new IvParameterSpec(f83990a);

    private static final Cipher a() {
        Cipher cipher = f83991b.get();
        if (cipher == null) {
            try {
                cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                f83991b.set(cipher);
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException("get Chipher error:" + e2.getMessage(), e2);
            } catch (NoSuchPaddingException e3) {
                throw new RuntimeException("get Chipher error:" + e3.getMessage(), e3);
            }
        }
        return cipher;
    }

    public static final byte[] a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            return instance.digest();
        } catch (Throwable th) {
            throw new RuntimeException("md5 value Throwable", th);
        }
    }

    public static byte[] a(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "HmacSHA1");
        try {
            Mac instance = Mac.getInstance("HmacSHA1");
            instance.init(secretKeySpec);
            return instance.doFinal(bArr2);
        } catch (Throwable th) {
            throw new RuntimeException("HmacSHA1 Throwable", th);
        }
    }

    private static final Cipher a(SecretKeySpec secretKeySpec, byte[] bArr, int i) {
        Cipher a2 = a();
        try {
            a2.init(i, secretKeySpec, new IvParameterSpec(bArr));
            return a2;
        } catch (InvalidKeyException e2) {
            throw new RuntimeException("init Chipher error:" + e2.getMessage(), e2);
        } catch (InvalidAlgorithmParameterException e3) {
            throw new RuntimeException("init Chipher error:" + e3.getMessage(), e3);
        } catch (IllegalArgumentException e4) {
            throw new RuntimeException("init Chipher error:" + e4.getMessage(), e4);
        }
    }

    public static final byte[] a(byte[] bArr, SecretKeySpec secretKeySpec, byte[] bArr2) throws IllegalArgumentException {
        try {
            return a(secretKeySpec, bArr2, 2).doFinal(bArr);
        } catch (IllegalBlockSizeException e2) {
            throw new IllegalArgumentException("AES decrypt error:" + e2.getMessage(), e2);
        } catch (BadPaddingException e3) {
            throw new IllegalArgumentException("AES decrypt error:" + e3.getMessage(), e3);
        }
    }
}
