package com.xiaomi.push;

import java.util.Random;

public class hs {

    /* renamed from: a  reason: collision with root package name */
    private static Random f82197a = new Random();

    /* renamed from: a  reason: collision with other field name */
    private static final char[] f500a = "&quot;".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f82198b = "&apos;".toCharArray();

    /* renamed from: c  reason: collision with root package name */
    private static final char[] f82199c = "&amp;".toCharArray();

    /* renamed from: d  reason: collision with root package name */
    private static final char[] f82200d = "&lt;".toCharArray();

    /* renamed from: e  reason: collision with root package name */
    private static final char[] f82201e = "&gt;".toCharArray();

    /* renamed from: f  reason: collision with root package name */
    private static char[] f82202f = "0123456789abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public static String a(int i) {
        if (i <= 0) {
            return null;
        }
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < cArr.length; i2++) {
            cArr[i2] = f82202f[f82197a.nextInt(71)];
        }
        return new String(cArr);
    }

    public static String a(String str) {
        char[] cArr;
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        double d2 = (double) length;
        Double.isNaN(d2);
        StringBuilder sb = new StringBuilder((int) (d2 * 1.3d));
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 <= '>') {
                if (c2 == '<') {
                    if (i > i2) {
                        sb.append(charArray, i2, i - i2);
                    }
                    i2 = i + 1;
                    cArr = f82200d;
                } else if (c2 == '>') {
                    if (i > i2) {
                        sb.append(charArray, i2, i - i2);
                    }
                    i2 = i + 1;
                    cArr = f82201e;
                } else if (c2 == '&') {
                    if (i > i2) {
                        sb.append(charArray, i2, i - i2);
                    }
                    int i3 = i + 5;
                    if (length <= i3 || charArray[i + 1] != '#' || !Character.isDigit(charArray[i + 2]) || !Character.isDigit(charArray[i + 3]) || !Character.isDigit(charArray[i + 4]) || charArray[i3] != ';') {
                        i2 = i + 1;
                        cArr = f82199c;
                    }
                } else if (c2 == '\"') {
                    if (i > i2) {
                        sb.append(charArray, i2, i - i2);
                    }
                    i2 = i + 1;
                    cArr = f500a;
                } else if (c2 == '\'') {
                    if (i > i2) {
                        sb.append(charArray, i2, i - i2);
                    }
                    i2 = i + 1;
                    cArr = f82198b;
                }
                sb.append(cArr);
            }
            i++;
        }
        if (i2 == 0) {
            return str;
        }
        if (i > i2) {
            sb.append(charArray, i2, i - i2);
        }
        return sb.toString();
    }

    public static final String a(String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(str2, 0);
        if (indexOf < 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        char[] charArray2 = str3.toCharArray();
        int length = str2.length();
        StringBuilder sb = new StringBuilder(charArray.length);
        sb.append(charArray, 0, indexOf);
        sb.append(charArray2);
        int i = indexOf + length;
        while (true) {
            int indexOf2 = str.indexOf(str2, i);
            if (indexOf2 > 0) {
                sb.append(charArray, i, indexOf2 - i);
                sb.append(charArray2);
                i = indexOf2 + length;
            } else {
                sb.append(charArray, i, charArray.length - i);
                return sb.toString();
            }
        }
    }

    public static String a(byte[] bArr) {
        return String.valueOf(aw.a(bArr));
    }

    public static final String b(String str) {
        return a(a(a(a(a(str, "&lt;", "<"), "&gt;", ">"), "&quot;", "\""), "&apos;", "'"), "&amp;", "&");
    }
}
