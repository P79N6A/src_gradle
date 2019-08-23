package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;

public final class h {
    private static short e(InputStream inputStream) throws IOException {
        return (short) (inputStream.read() & 255);
    }

    private static byte f(InputStream inputStream) throws IOException {
        return (byte) (inputStream.read() & 255);
    }

    private static int c(InputStream inputStream) throws IOException {
        return ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255);
    }

    private static int d(InputStream inputStream) throws IOException {
        byte f2 = f(inputStream);
        return ((f(inputStream) << 16) & 16711680) | ((f(inputStream) << 8) & 65280) | (f2 & 255);
    }

    private static int b(InputStream inputStream) throws IOException {
        return ((((byte) inputStream.read()) << 24) & -16777216) | ((((byte) inputStream.read()) << 16) & 16711680) | ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0104, code lost:
        if (r7 != null) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0112, code lost:
        if (r7 == null) goto L_0x0115;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007f A[SYNTHETIC, Splitter:B:32:0x007f] */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> a(java.io.InputStream r7) {
        /*
            r0 = 4
            byte[] r1 = new byte[r0]
            r2 = 0
            r7.read(r1)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            java.lang.String r3 = "RIFF"
            boolean r3 = a(r1, r3)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            if (r3 != 0) goto L_0x0015
            if (r7 == 0) goto L_0x0014
            r7.close()     // Catch:{ IOException -> 0x0014 }
        L_0x0014:
            return r2
        L_0x0015:
            b(r7)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            r7.read(r1)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            java.lang.String r3 = "WEBP"
            boolean r3 = a(r1, r3)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            if (r3 != 0) goto L_0x0029
            if (r7 == 0) goto L_0x0028
            r7.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            return r2
        L_0x0029:
            r7.read(r1)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            r3.<init>()     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            r4 = 0
        L_0x0032:
            if (r4 >= r0) goto L_0x003d
            byte r5 = r1[r4]     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            char r5 = (char) r5     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            r3.append(r5)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            int r4 = r4 + 1
            goto L_0x0032
        L_0x003d:
            java.lang.String r0 = r3.toString()     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            java.lang.String r1 = "VP8 "
            boolean r1 = r1.equals(r0)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            r3 = 1
            if (r1 == 0) goto L_0x0083
            r0 = 7
            r7.skip(r0)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            short r0 = e(r7)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            short r1 = e(r7)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            short r4 = e(r7)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            r5 = 157(0x9d, float:2.2E-43)
            if (r0 != r5) goto L_0x007c
            if (r1 != r3) goto L_0x007c
            r0 = 42
            if (r4 == r0) goto L_0x0066
            goto L_0x007c
        L_0x0066:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            int r1 = c(r7)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            int r3 = c(r7)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            r0.<init>(r1, r3)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            goto L_0x007d
        L_0x007c:
            r0 = r2
        L_0x007d:
            if (r7 == 0) goto L_0x0082
            r7.close()     // Catch:{ IOException -> 0x0082 }
        L_0x0082:
            return r0
        L_0x0083:
            java.lang.String r1 = "VP8L"
            boolean r1 = r1.equals(r0)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            if (r1 == 0) goto L_0x00da
            b(r7)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            byte r0 = f(r7)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            r1 = 47
            if (r0 == r1) goto L_0x0097
            goto L_0x00d4
        L_0x0097:
            int r0 = r7.read()     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            byte r0 = (byte) r0     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r7.read()     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            byte r1 = (byte) r1     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r4 = r7.read()     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            byte r4 = (byte) r4     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r5 = r7.read()     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            byte r5 = (byte) r5     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = r1 & 63
            int r6 = r6 << 8
            r0 = r0 | r6
            int r0 = r0 + r3
            r5 = r5 & 15
            int r5 = r5 << 10
            int r4 = r4 << 2
            r4 = r4 | r5
            r1 = r1 & 192(0xc0, float:2.69E-43)
            int r1 = r1 >> 6
            r1 = r1 | r4
            int r1 = r1 + r3
            android.util.Pair r3 = new android.util.Pair     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            r3.<init>(r0, r1)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            r2 = r3
        L_0x00d4:
            if (r7 == 0) goto L_0x00d9
            r7.close()     // Catch:{ IOException -> 0x00d9 }
        L_0x00d9:
            return r2
        L_0x00da:
            java.lang.String r1 = "VP8X"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            if (r0 == 0) goto L_0x0104
            r0 = 8
            r7.skip(r0)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            int r1 = d(r7)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            int r1 = r1 + r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            int r4 = d(r7)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            int r4 = r4 + r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            r0.<init>(r1, r3)     // Catch:{ IOException -> 0x0111, all -> 0x010a }
            if (r7 == 0) goto L_0x0103
            r7.close()     // Catch:{ IOException -> 0x0103 }
        L_0x0103:
            return r0
        L_0x0104:
            if (r7 == 0) goto L_0x0115
        L_0x0106:
            r7.close()     // Catch:{ IOException -> 0x0115 }
            goto L_0x0115
        L_0x010a:
            r0 = move-exception
            if (r7 == 0) goto L_0x0110
            r7.close()     // Catch:{ IOException -> 0x0110 }
        L_0x0110:
            throw r0
        L_0x0111:
            if (r7 == 0) goto L_0x0115
            goto L_0x0106
        L_0x0115:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imageutils.h.a(java.io.InputStream):android.util.Pair");
    }

    private static boolean a(byte[] bArr, String str) {
        if (4 != str.length()) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (str.charAt(i) != bArr[i]) {
                return false;
            }
        }
        return true;
    }
}
