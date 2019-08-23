package com.umeng.message.proguard;

import java.io.UnsupportedEncodingException;

public class b {
    public static String a(byte[] bArr) {
        return a(bArr, "ISO-8859-1");
    }

    public static String b(byte[] bArr) {
        return a(bArr, "US-ASCII");
    }

    public static String c(byte[] bArr) {
        return a(bArr, "UTF-16");
    }

    public static String d(byte[] bArr) {
        return a(bArr, "UTF-16BE");
    }

    public static String e(byte[] bArr) {
        return a(bArr, "UTF-16LE");
    }

    public static String f(byte[] bArr) {
        return a(bArr, "UTF-8");
    }

    public static byte[] b(String str) {
        return a(str, "US-ASCII");
    }

    public static byte[] c(String str) {
        return a(str, "UTF-16");
    }

    public static byte[] d(String str) {
        return a(str, "UTF-16BE");
    }

    public static byte[] e(String str) {
        return a(str, "UTF-16LE");
    }

    public static byte[] f(String str) {
        return a(str, "UTF-8");
    }

    public static byte[] a(String str) {
        return a(str, "ISO-8859-1");
    }

    public static String a(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException e2) {
            throw a(str, e2);
        }
    }

    private static IllegalStateException a(String str, UnsupportedEncodingException unsupportedEncodingException) {
        return new IllegalStateException(str + ": " + unsupportedEncodingException);
    }

    public static byte[] a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException e2) {
            throw a(str2, e2);
        }
    }
}
