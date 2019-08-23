package com.ss.sys.ces.a;

import java.io.BufferedInputStream;

public final class e {
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ab, code lost:
        if (r8.length() == 0) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b0, code lost:
        return r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String a(android.content.Context r8) {
        /*
            java.lang.Class<com.ss.sys.ces.a.e> r0 = com.ss.sys.ces.a.e.class
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00a3 }
            r1.<init>()     // Catch:{ Throwable -> 0x00a3 }
            java.io.File r2 = r8.getFilesDir()     // Catch:{ Throwable -> 0x00a3 }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ Throwable -> 0x00a3 }
            r1.append(r2)     // Catch:{ Throwable -> 0x00a3 }
            java.lang.String r2 = "/cid"
            r1.append(r2)     // Catch:{ Throwable -> 0x00a3 }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x00a3 }
            java.io.File r2 = new java.io.File     // Catch:{ Throwable -> 0x00a3 }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x00a3 }
            boolean r2 = r2.exists()     // Catch:{ Throwable -> 0x00a3 }
            if (r2 == 0) goto L_0x0035
            java.lang.String r2 = a((java.lang.String) r1)     // Catch:{ Throwable -> 0x00a3 }
            if (r2 == 0) goto L_0x0035
            int r3 = r2.length()     // Catch:{ Throwable -> 0x00a3 }
            if (r3 <= 0) goto L_0x0035
            monitor-exit(r0)
            return r2
        L_0x0035:
            android.content.res.Resources r8 = r8.getResources()     // Catch:{ Throwable -> 0x00a3 }
            android.content.res.AssetManager r8 = r8.getAssets()     // Catch:{ Throwable -> 0x00a3 }
            java.lang.String r2 = "cid"
            java.io.InputStream r8 = r8.open(r2)     // Catch:{ Throwable -> 0x00a3 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x00a3 }
            r2.<init>()     // Catch:{ Throwable -> 0x00a3 }
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r3]     // Catch:{ Throwable -> 0x00a3 }
        L_0x004c:
            r5 = 0
            int r6 = r8.read(r4, r5, r3)     // Catch:{ Throwable -> 0x00a3 }
            r7 = -1
            if (r6 == r7) goto L_0x0058
            r2.write(r4, r5, r6)     // Catch:{ Throwable -> 0x00a3 }
            goto L_0x004c
        L_0x0058:
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x00a3 }
            r8.<init>(r1)     // Catch:{ Throwable -> 0x00a3 }
            byte[] r2 = r2.toByteArray()     // Catch:{ Throwable -> 0x00a3 }
            r8.write(r2)     // Catch:{ Throwable -> 0x00a3 }
            r8.close()     // Catch:{ Throwable -> 0x00a3 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00a3 }
            java.lang.String r2 = "chmod 777 "
            r8.<init>(r2)     // Catch:{ Throwable -> 0x00a3 }
            r8.append(r1)     // Catch:{ Throwable -> 0x00a3 }
            java.lang.String r8 = r8.toString()     // Catch:{ Throwable -> 0x00a3 }
            a((java.lang.String) r8)     // Catch:{ Throwable -> 0x00a3 }
            java.lang.String r8 = a((java.lang.String) r1)     // Catch:{ Throwable -> 0x00a3 }
            if (r8 == 0) goto L_0x0084
            int r2 = r8.length()     // Catch:{ Throwable -> 0x00a3 }
            if (r2 != 0) goto L_0x00a5
        L_0x0084:
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch:{ Throwable -> 0x00a3 }
            java.lang.String r2 = "rw"
            r8.<init>(r1, r2)     // Catch:{ Throwable -> 0x00a3 }
            r2 = 1
            byte[] r2 = new byte[r2]     // Catch:{ Throwable -> 0x00a3 }
            r3 = 2
            r2[r5] = r3     // Catch:{ Throwable -> 0x00a3 }
            r3 = 16
            r8.seek(r3)     // Catch:{ Throwable -> 0x00a3 }
            r8.write(r2)     // Catch:{ Throwable -> 0x00a3 }
            r8.close()     // Catch:{ Throwable -> 0x00a3 }
            java.lang.String r8 = a((java.lang.String) r1)     // Catch:{ Throwable -> 0x00a3 }
            goto L_0x00a5
        L_0x00a1:
            r8 = move-exception
            goto L_0x00b1
        L_0x00a3:
            java.lang.String r8 = "0[<!>]EXCEPTION[<!>]"
        L_0x00a5:
            if (r8 == 0) goto L_0x00ad
            int r1 = r8.length()     // Catch:{ all -> 0x00a1 }
            if (r1 != 0) goto L_0x00af
        L_0x00ad:
            java.lang.String r8 = "0[<!>]ERROR[<!>]"
        L_0x00af:
            monitor-exit(r0)
            return r8
        L_0x00b1:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.sys.ces.a.e.a(android.content.Context):java.lang.String");
    }

    private static String a(BufferedInputStream bufferedInputStream) {
        int read;
        byte[] bArr = new byte[4096];
        StringBuilder sb = new StringBuilder();
        do {
            try {
                read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    sb.append(new String(bArr, 0, read));
                    continue;
                }
            } catch (Exception unused) {
            }
        } while (read >= 4096);
        return sb.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.io.BufferedOutputStream} */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:5|6|7|8|9|10|11|12|(2:15|55)(1:54)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0039 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0055 A[SYNTHETIC, Splitter:B:29:0x0055] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005c A[SYNTHETIC, Splitter:B:33:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x006c A[SYNTHETIC, Splitter:B:43:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0073 A[SYNTHETIC, Splitter:B:47:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.String r5) {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x0067, all -> 0x0050 }
            java.lang.String r2 = "sh"
            java.lang.Process r1 = r1.exec(r2)     // Catch:{ Exception -> 0x0067, all -> 0x0050 }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x004e, all -> 0x004b }
            java.io.OutputStream r3 = r1.getOutputStream()     // Catch:{ Exception -> 0x004e, all -> 0x004b }
            r2.<init>(r3)     // Catch:{ Exception -> 0x004e, all -> 0x004b }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            java.io.InputStream r4 = r1.getInputStream()     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            byte[] r5 = r5.getBytes()     // Catch:{ Exception -> 0x0045, all -> 0x0042 }
            r2.write(r5)     // Catch:{ Exception -> 0x0045, all -> 0x0042 }
            r5 = 10
            r2.write(r5)     // Catch:{ Exception -> 0x0045, all -> 0x0042 }
            r2.flush()     // Catch:{ Exception -> 0x0045, all -> 0x0042 }
            r2.close()     // Catch:{ Exception -> 0x0045, all -> 0x0042 }
            r1.waitFor()     // Catch:{ Exception -> 0x0045, all -> 0x0042 }
            java.lang.String r5 = a((java.io.BufferedInputStream) r3)     // Catch:{ Exception -> 0x0045, all -> 0x0042 }
            r2.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            r3.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            if (r1 == 0) goto L_0x007e
            r1.destroy()
            goto L_0x007e
        L_0x0042:
            r5 = move-exception
            r0 = r3
            goto L_0x0053
        L_0x0045:
            goto L_0x006a
        L_0x0047:
            r5 = move-exception
            goto L_0x0053
        L_0x0049:
            r3 = r0
            goto L_0x006a
        L_0x004b:
            r5 = move-exception
            r2 = r0
            goto L_0x0053
        L_0x004e:
            r2 = r0
            goto L_0x0069
        L_0x0050:
            r5 = move-exception
            r1 = r0
            r2 = r1
        L_0x0053:
            if (r2 == 0) goto L_0x005a
            r2.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005a
        L_0x0059:
        L_0x005a:
            if (r0 == 0) goto L_0x0061
            r0.close()     // Catch:{ IOException -> 0x0060 }
            goto L_0x0061
        L_0x0060:
        L_0x0061:
            if (r1 == 0) goto L_0x0066
            r1.destroy()
        L_0x0066:
            throw r5
        L_0x0067:
            r1 = r0
            r2 = r1
        L_0x0069:
            r3 = r2
        L_0x006a:
            if (r2 == 0) goto L_0x0071
            r2.close()     // Catch:{ IOException -> 0x0070 }
            goto L_0x0071
        L_0x0070:
        L_0x0071:
            if (r3 == 0) goto L_0x0078
            r3.close()     // Catch:{ IOException -> 0x0077 }
            goto L_0x0078
        L_0x0077:
        L_0x0078:
            if (r1 == 0) goto L_0x007d
            r1.destroy()
        L_0x007d:
            r5 = r0
        L_0x007e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.sys.ces.a.e.a(java.lang.String):java.lang.String");
    }
}
