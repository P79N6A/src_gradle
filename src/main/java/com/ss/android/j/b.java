package com.ss.android.j;

import android.text.TextUtils;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class b {
    public static String a(String str) throws IOException {
        try {
            String c2 = c(str);
            if (TextUtils.isEmpty(c2)) {
                c2 = b(str);
            }
            return c2;
        } catch (Throwable unused) {
            return "";
        }
    }

    private static String c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            return d.a(str, 1903654776);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: finally extract failed */
    private static String b(String str) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            long length = randomAccessFile.length() - 2;
            randomAccessFile.seek(length);
            int read = (randomAccessFile.read() & 255) | ((randomAccessFile.read() & 255) << 8);
            if (read == 0) {
                randomAccessFile.close();
                return null;
            }
            randomAccessFile.seek(length - ((long) read));
            byte[] bArr = new byte[read];
            randomAccessFile.read(bArr);
            String str2 = new String(bArr);
            randomAccessFile.close();
            return str2;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }
}
