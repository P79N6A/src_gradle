package com.xiaomi.push;

import android.content.Context;

public class ag {

    /* renamed from: a  reason: collision with root package name */
    static final char[] f81822a = "0123456789ABCDEF".toCharArray();

    public static String a(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder(i2 * 2);
        for (int i3 = 0; i3 < i2; i3++) {
            byte b2 = bArr[i + i3] & 255;
            sb.append(f81822a[b2 >> 4]);
            sb.append(f81822a[b2 & 15]);
        }
        return sb.toString();
    }

    public static boolean a(Context context) {
        return af.f146a;
    }
}
