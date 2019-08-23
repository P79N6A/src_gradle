package com.ss.android.socialbase.downloader.e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final char[] f30930a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003b A[SYNTHETIC, Splitter:B:26:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0042 A[SYNTHETIC, Splitter:B:34:0x0042] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.io.File r6) {
        /*
            r0 = 0
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ Exception -> 0x003f, all -> 0x0037 }
            if (r1 != 0) goto L_0x000a
            return r0
        L_0x000a:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x003f, all -> 0x0037 }
            r2.<init>(r6)     // Catch:{ Exception -> 0x003f, all -> 0x0037 }
            r6 = 8192(0x2000, float:1.14794E-41)
            byte[] r3 = new byte[r6]     // Catch:{ Exception -> 0x0040, all -> 0x0035 }
        L_0x0013:
            r4 = 0
            int r5 = r2.read(r3, r4, r6)     // Catch:{ Exception -> 0x0040, all -> 0x0035 }
            if (r5 <= 0) goto L_0x001e
            r1.update(r3, r4, r5)     // Catch:{ Exception -> 0x0040, all -> 0x0035 }
            goto L_0x0013
        L_0x001e:
            byte[] r6 = r1.digest()     // Catch:{ Exception -> 0x0040, all -> 0x0035 }
            if (r6 == 0) goto L_0x002d
            int r1 = r6.length     // Catch:{ Exception -> 0x0040, all -> 0x0035 }
            java.lang.String r6 = a(r6, r4, r1)     // Catch:{ Exception -> 0x0040, all -> 0x0035 }
            r2.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            return r6
        L_0x002d:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0040, all -> 0x0035 }
            java.lang.String r1 = "bytes is null"
            r6.<init>(r1)     // Catch:{ Exception -> 0x0040, all -> 0x0035 }
            throw r6     // Catch:{ Exception -> 0x0040, all -> 0x0035 }
        L_0x0035:
            r6 = move-exception
            goto L_0x0039
        L_0x0037:
            r6 = move-exception
            r2 = r0
        L_0x0039:
            if (r2 == 0) goto L_0x003e
            r2.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            throw r6
        L_0x003f:
            r2 = r0
        L_0x0040:
            if (r2 == 0) goto L_0x0045
            r2.close()     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.e.a.a(java.io.File):java.lang.String");
    }

    private static String a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        } else if (i2 + 0 <= bArr.length) {
            int i3 = i2 * 2;
            char[] cArr = new char[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                byte b2 = bArr[i5 + 0] & 255;
                int i6 = i4 + 1;
                cArr[i4] = f30930a[b2 >> 4];
                i4 = i6 + 1;
                cArr[i6] = f30930a[b2 & 15];
            }
            return new String(cArr, 0, i3);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
