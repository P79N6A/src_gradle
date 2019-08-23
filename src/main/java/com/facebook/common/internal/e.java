package com.facebook.common.internal;

public final class e {
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(java.io.File r6) throws java.io.IOException {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x004c }
            r1.<init>(r6)     // Catch:{ all -> 0x004c }
            java.nio.channels.FileChannel r6 = r1.getChannel()     // Catch:{ all -> 0x004a }
            long r2 = r6.size()     // Catch:{ all -> 0x004a }
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0031
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0028
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x004a }
            r6.<init>()     // Catch:{ all -> 0x004a }
            com.facebook.common.internal.b.a((java.io.InputStream) r1, (java.io.OutputStream) r6)     // Catch:{ all -> 0x004a }
            byte[] r6 = r6.toByteArray()     // Catch:{ all -> 0x004a }
            goto L_0x002d
        L_0x0028:
            int r6 = (int) r2     // Catch:{ all -> 0x004a }
            byte[] r6 = com.facebook.common.internal.b.a((java.io.InputStream) r1, (int) r6)     // Catch:{ all -> 0x004a }
        L_0x002d:
            r1.close()
            return r6
        L_0x0031:
            java.lang.OutOfMemoryError r6 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x004a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            java.lang.String r4 = "file is too large to fit in a byte array: "
            r0.<init>(r4)     // Catch:{ all -> 0x004a }
            r0.append(r2)     // Catch:{ all -> 0x004a }
            java.lang.String r2 = " bytes"
            r0.append(r2)     // Catch:{ all -> 0x004a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x004a }
            r6.<init>(r0)     // Catch:{ all -> 0x004a }
            throw r6     // Catch:{ all -> 0x004a }
        L_0x004a:
            r6 = move-exception
            goto L_0x004e
        L_0x004c:
            r6 = move-exception
            r1 = r0
        L_0x004e:
            if (r1 == 0) goto L_0x0053
            r1.close()
        L_0x0053:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.internal.e.a(java.io.File):byte[]");
    }
}
