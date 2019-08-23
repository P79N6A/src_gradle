package com.cmic.sso.sdk.d;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class a {
    public static String a(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, secretKeySpec, new IvParameterSpec(new byte[instance.getBlockSize()]));
            return b.a(instance.doFinal(str2.getBytes("UTF-8")));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b(String str, String str2) {
        try {
            byte[] a2 = b.a(str2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, new IvParameterSpec(new byte[instance.getBlockSize()]));
            return new String(instance.doFinal(a2), "UTF-8");
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(byte[] bArr, String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, secretKeySpec, new IvParameterSpec(new byte[instance.getBlockSize()]));
            return b.a(instance.doFinal(str.getBytes("UTF-8")));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b(byte[] bArr, String str) {
        try {
            byte[] a2 = b.a(str);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, new IvParameterSpec(new byte[instance.getBlockSize()]));
            return new String(instance.doFinal(a2), "UTF-8");
        } catch (Exception unused) {
            return null;
        }
    }
}
