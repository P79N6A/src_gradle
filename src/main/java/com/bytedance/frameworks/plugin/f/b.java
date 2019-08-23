package com.bytedance.frameworks.plugin.f;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static String f2252a = "DES/ECB/NoPadding";

    /* renamed from: b  reason: collision with root package name */
    public static String f2253b = "DESede/ECB/NoPadding";

    /* renamed from: c  reason: collision with root package name */
    public static String f2254c = "AES/ECB/NoPadding";

    /* renamed from: d  reason: collision with root package name */
    private static final char[] f2255d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(File file) {
        return a(b(file));
    }

    private static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        char[] cArr = new char[(length << 1)];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr[i] = f2255d[(bArr[i2] >>> 4) & 15];
            i = i3 + 1;
            cArr[i3] = f2255d[bArr[i2] & 15];
        }
        return new String(cArr);
    }

    private static byte[] b(File file) {
        FileInputStream fileInputStream;
        if (file == null) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                DigestInputStream digestInputStream = new DigestInputStream(fileInputStream, MessageDigest.getInstance("MD5"));
                do {
                } while (digestInputStream.read(new byte[262144]) > 0);
                byte[] digest = digestInputStream.getMessageDigest().digest();
                f.a(fileInputStream);
                return digest;
            } catch (IOException | NoSuchAlgorithmException unused) {
                f.a(fileInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                f.a(fileInputStream);
                throw th;
            }
        } catch (IOException | NoSuchAlgorithmException unused2) {
            fileInputStream = null;
            f.a(fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            f.a(fileInputStream);
            throw th;
        }
    }
}
