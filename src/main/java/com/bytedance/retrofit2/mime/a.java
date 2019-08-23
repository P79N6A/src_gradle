package com.bytedance.retrofit2.mime;

import java.io.InputStream;
import java.security.MessageDigest;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f21913a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(byte[] bArr) {
        try {
            return new String(a(MessageDigest.getInstance("MD5").digest(bArr), f21913a));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(InputStream inputStream) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1024];
            int read = inputStream.read(bArr, 0, 1024);
            while (read >= 0) {
                instance.update(bArr, 0, read);
                read = inputStream.read(bArr, 0, 1024);
            }
            return new String(a(instance.digest(), f21913a));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static char[] a(byte[] bArr, char[] cArr) {
        int length = bArr.length;
        char[] cArr2 = new char[(length << 1)];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr2[i] = cArr[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr2[i3] = cArr[bArr[i2] & 15];
        }
        return cArr2;
    }
}
