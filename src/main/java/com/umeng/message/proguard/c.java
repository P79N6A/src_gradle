package com.umeng.message.proguard;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static byte[] f81262a = "uLi4/f4+Pb39.T19".getBytes();

    /* renamed from: b  reason: collision with root package name */
    private static byte[] f81263b = ("nmeug" + ".f9/" + "Om+L823").getBytes();

    public static String a(String str) throws Exception {
        if ("uLi4/f4+Pb39.T19".length() == 16) {
            f81262a = "uLi4/f4+Pb39.T19".getBytes();
        }
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(1, new SecretKeySpec(f81262a, "AES"), new IvParameterSpec(f81263b));
        return d.d(instance.doFinal(str.getBytes("UTF-8")));
    }

    public static String a(String... strArr) throws Exception {
        String str;
        String str2;
        String str3 = null;
        if (strArr.length == 2) {
            str2 = strArr[0];
            str = strArr[1];
        } else if (strArr.length == 3) {
            String str4 = strArr[0];
            String str5 = strArr[1];
            String str6 = str4;
            str3 = strArr[2];
            str = str5;
            str2 = str6;
        } else {
            str = null;
            str2 = null;
        }
        if (str3 != null && str3.length() == 16) {
            f81262a = str3.getBytes();
        }
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(1, new SecretKeySpec(f81262a, "AES"), new IvParameterSpec(f81263b));
        return d.d(instance.doFinal(str2.getBytes(str)));
    }

    public static String a(String str, String str2) throws Exception {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(2, new SecretKeySpec(f81262a, "AES"), new IvParameterSpec(f81263b));
        return new String(instance.doFinal(d.b(str)), str2);
    }
}
