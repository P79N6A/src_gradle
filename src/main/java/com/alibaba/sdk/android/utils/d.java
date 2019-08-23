package com.alibaba.sdk.android.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f5139a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void a(double d2) {
        try {
            Thread.sleep((long) (d2 * 1000.0d));
        } catch (InterruptedException unused) {
        }
    }

    public static String a(String str) throws NoSuchAlgorithmException {
        return a(MessageDigest.getInstance("MD5").digest(str.getBytes()));
    }

    public static String b(String str) throws NoSuchAlgorithmException {
        return a(MessageDigest.getInstance("SHA-1").digest(str.getBytes()));
    }

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(f5139a[(bArr[i] & 240) >>> 4]);
            sb.append(f5139a[bArr[i] & 15]);
        }
        return sb.toString();
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m12a(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }
}
