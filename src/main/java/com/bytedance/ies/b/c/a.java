package com.bytedance.ies.b.c;

import android.content.Context;
import android.content.pm.Signature;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public final class a {
    private static String a(byte[] bArr) {
        int i;
        int i2;
        int length = bArr.length;
        char[] cArr = new char[(length * 2)];
        for (int i3 = 0; i3 < length; i3++) {
            byte b2 = bArr[i3];
            int i4 = (b2 >> 4) & 15;
            int i5 = i3 * 2;
            if (i4 >= 10) {
                i = (i4 + 97) - 10;
            } else {
                i = i4 + 48;
            }
            cArr[i5] = (char) i;
            byte b3 = b2 & 15;
            int i6 = i5 + 1;
            if (b3 >= 10) {
                i2 = (b3 + 97) - 10;
            } else {
                i2 = b3 + 48;
            }
            cArr[i6] = (char) i2;
        }
        return new String(cArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a A[SYNTHETIC, Splitter:B:21:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0050 A[SYNTHETIC, Splitter:B:27:0x0050] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> a(java.lang.String r6) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r1 = 0
            java.util.jar.JarFile r2 = new java.util.jar.JarFile     // Catch:{ Exception -> 0x004e, all -> 0x0046 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x004e, all -> 0x0046 }
            java.lang.String r0 = "classes.dex"
            java.util.jar.JarEntry r0 = r2.getJarEntry(r0)     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            r1 = 8192(0x2000, float:1.14794E-41)
            byte[] r1 = new byte[r1]     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            java.security.cert.Certificate[] r0 = a(r2, r0, r1)     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            if (r0 == 0) goto L_0x003e
            int r1 = r0.length     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            r3 = 0
        L_0x0022:
            if (r3 >= r1) goto L_0x003e
            r4 = r0[r3]     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            byte[] r4 = r4.getEncoded()     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            java.lang.String r4 = a((byte[]) r4)     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            if (r5 != 0) goto L_0x003b
            java.lang.String r4 = r4.toLowerCase()     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            r6.add(r4)     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
        L_0x003b:
            int r3 = r3 + 1
            goto L_0x0022
        L_0x003e:
            r2.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0053
        L_0x0042:
            r6 = move-exception
            goto L_0x0048
        L_0x0044:
            r1 = r2
            goto L_0x004e
        L_0x0046:
            r6 = move-exception
            r2 = r1
        L_0x0048:
            if (r2 == 0) goto L_0x004d
            r2.close()     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            throw r6
        L_0x004e:
            if (r1 == 0) goto L_0x0053
            r1.close()     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.b.c.a.a(java.lang.String):java.util.List");
    }

    public static List<String> a(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            for (Signature signature : context.getPackageManager().getPackageInfo(str, 64).signatures) {
                if (!TextUtils.isEmpty(signature.toCharsString())) {
                    arrayList.add(signature.toCharsString().toLowerCase());
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    private static Certificate[] a(JarFile jarFile, JarEntry jarEntry, byte[] bArr) {
        try {
            InputStream inputStream = jarFile.getInputStream(jarEntry);
            do {
            } while (inputStream.read(bArr, 0, 8192) != -1);
            inputStream.close();
            if (jarEntry != null) {
                return jarEntry.getCertificates();
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }
}
