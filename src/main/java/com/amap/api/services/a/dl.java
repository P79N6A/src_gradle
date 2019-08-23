package com.amap.api.services.a;

import java.io.File;

public class dl {
    private static void a(cw cwVar) {
        if (cwVar != null) {
            try {
                cwVar.d();
            } catch (Throwable th) {
                ca.c(th, "ofm", "dlo");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0075 A[SYNTHETIC, Splitter:B:37:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007b A[SYNTHETIC, Splitter:B:42:0x007b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.amap.api.services.a.dk r5) {
        /*
            r0 = 0
            com.amap.api.services.a.ec r1 = r5.f6828f     // Catch:{ Throwable -> 0x006b }
            boolean r1 = r1.b()     // Catch:{ Throwable -> 0x006b }
            if (r1 == 0) goto L_0x0062
            com.amap.api.services.a.ec r1 = r5.f6828f     // Catch:{ Throwable -> 0x006b }
            r2 = 1
            r1.a(r2)     // Catch:{ Throwable -> 0x006b }
            java.io.File r1 = new java.io.File     // Catch:{ Throwable -> 0x006b }
            java.lang.String r3 = r5.f6823a     // Catch:{ Throwable -> 0x006b }
            r1.<init>(r3)     // Catch:{ Throwable -> 0x006b }
            long r3 = r5.f6824b     // Catch:{ Throwable -> 0x006b }
            com.amap.api.services.a.cw r1 = com.amap.api.services.a.cw.a(r1, r2, r2, r3)     // Catch:{ Throwable -> 0x006b }
            com.amap.api.services.a.dx r3 = r5.g     // Catch:{ Throwable -> 0x005f, all -> 0x005d }
            byte[] r3 = a((com.amap.api.services.a.cw) r1, (com.amap.api.services.a.dx) r3)     // Catch:{ Throwable -> 0x005f, all -> 0x005d }
            if (r3 == 0) goto L_0x0057
            int r4 = r3.length     // Catch:{ Throwable -> 0x005f, all -> 0x005d }
            if (r4 != 0) goto L_0x0028
            goto L_0x0057
        L_0x0028:
            com.amap.api.services.a.bz r4 = new com.amap.api.services.a.bz     // Catch:{ Throwable -> 0x005f, all -> 0x005d }
            java.lang.String r5 = r5.f6825c     // Catch:{ Throwable -> 0x005f, all -> 0x005d }
            r4.<init>(r3, r5)     // Catch:{ Throwable -> 0x005f, all -> 0x005d }
            com.amap.api.services.a.db r5 = com.amap.api.services.a.db.a()     // Catch:{ Throwable -> 0x005f, all -> 0x005d }
            byte[] r5 = r5.b(r4)     // Catch:{ Throwable -> 0x005f, all -> 0x005d }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x005f, all -> 0x005d }
            java.lang.String r4 = new java.lang.String     // Catch:{ Throwable -> 0x005f, all -> 0x005d }
            r4.<init>(r5)     // Catch:{ Throwable -> 0x005f, all -> 0x005d }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x005f, all -> 0x005d }
            java.lang.String r5 = "code"
            boolean r5 = r3.has(r5)     // Catch:{ Throwable -> 0x005f, all -> 0x005d }
            if (r5 == 0) goto L_0x0055
            java.lang.String r5 = "code"
            int r5 = r3.getInt(r5)     // Catch:{ Throwable -> 0x005f, all -> 0x005d }
            if (r5 != r2) goto L_0x0055
            a((com.amap.api.services.a.cw) r1)     // Catch:{ Throwable -> 0x005f, all -> 0x005d }
            goto L_0x0062
        L_0x0055:
            r0 = r1
            goto L_0x0062
        L_0x0057:
            if (r1 == 0) goto L_0x005c
            r1.close()     // Catch:{ Throwable -> 0x005c }
        L_0x005c:
            return
        L_0x005d:
            r5 = move-exception
            goto L_0x0079
        L_0x005f:
            r5 = move-exception
            r0 = r1
            goto L_0x006c
        L_0x0062:
            if (r0 == 0) goto L_0x0067
            r0.close()     // Catch:{ Throwable -> 0x0067 }
        L_0x0067:
            return
        L_0x0068:
            r5 = move-exception
            r1 = r0
            goto L_0x0079
        L_0x006b:
            r5 = move-exception
        L_0x006c:
            java.lang.String r1 = "leg"
            java.lang.String r2 = "uts"
            com.amap.api.services.a.ca.c(r5, r1, r2)     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0078
            r0.close()     // Catch:{ Throwable -> 0x0078 }
        L_0x0078:
            return
        L_0x0079:
            if (r1 == 0) goto L_0x007e
            r1.close()     // Catch:{ Throwable -> 0x007e }
        L_0x007e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.a.dl.a(com.amap.api.services.a.dk):void");
    }

    private static boolean a(String str, String str2) {
        try {
            return new File(str, str2 + ".0").exists();
        } catch (Throwable th) {
            ca.c(th, "leg", "fet");
            return false;
        }
    }

    private static byte[] a(cw cwVar, dx dxVar) {
        new StringBuilder();
        try {
            File b2 = cwVar.b();
            if (b2 != null && b2.exists()) {
                for (String str : b2.list()) {
                    if (str.contains(".0")) {
                        dxVar.b(dq.a(cwVar, str.split("\\.")[0], false));
                    }
                }
                return dxVar.a();
            }
        } catch (Throwable th) {
            ca.c(th, "leg", "gCo");
        }
        return new byte[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0054 A[SYNTHETIC, Splitter:B:28:0x0054] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005b A[SYNTHETIC, Splitter:B:32:0x005b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r5, byte[] r6, com.amap.api.services.a.dk r7) throws java.io.IOException, java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, java.security.InvalidKeyException, java.security.spec.InvalidKeySpecException {
        /*
            r0 = 0
            java.lang.String r1 = r7.f6823a     // Catch:{ all -> 0x0050 }
            boolean r1 = a((java.lang.String) r1, (java.lang.String) r5)     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x000a
            return
        L_0x000a:
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = r7.f6823a     // Catch:{ all -> 0x0050 }
            r1.<init>(r2)     // Catch:{ all -> 0x0050 }
            boolean r2 = r1.exists()     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x001a
            r1.mkdirs()     // Catch:{ all -> 0x0050 }
        L_0x001a:
            long r2 = r7.f6824b     // Catch:{ all -> 0x0050 }
            r4 = 1
            com.amap.api.services.a.cw r1 = com.amap.api.services.a.cw.a(r1, r4, r4, r2)     // Catch:{ all -> 0x0050 }
            int r2 = r7.f6826d     // Catch:{ all -> 0x004e }
            r1.a((int) r2)     // Catch:{ all -> 0x004e }
            com.amap.api.services.a.br r7 = r7.f6827e     // Catch:{ all -> 0x004e }
            byte[] r6 = r7.b(r6)     // Catch:{ all -> 0x004e }
            com.amap.api.services.a.cw$a r5 = r1.b((java.lang.String) r5)     // Catch:{ all -> 0x004e }
            r7 = 0
            java.io.OutputStream r7 = r5.a((int) r7)     // Catch:{ all -> 0x004e }
            r7.write(r6)     // Catch:{ all -> 0x004b }
            r5.a()     // Catch:{ all -> 0x004b }
            r1.c()     // Catch:{ all -> 0x004b }
            if (r7 == 0) goto L_0x0045
            r7.close()     // Catch:{ Throwable -> 0x0044 }
            goto L_0x0045
        L_0x0044:
        L_0x0045:
            if (r1 == 0) goto L_0x004a
            r1.close()     // Catch:{ Throwable -> 0x004a }
        L_0x004a:
            return
        L_0x004b:
            r5 = move-exception
            r0 = r7
            goto L_0x0052
        L_0x004e:
            r5 = move-exception
            goto L_0x0052
        L_0x0050:
            r5 = move-exception
            r1 = r0
        L_0x0052:
            if (r0 == 0) goto L_0x0059
            r0.close()     // Catch:{ Throwable -> 0x0058 }
            goto L_0x0059
        L_0x0058:
        L_0x0059:
            if (r1 == 0) goto L_0x005e
            r1.close()     // Catch:{ Throwable -> 0x005e }
        L_0x005e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.a.dl.a(java.lang.String, byte[], com.amap.api.services.a.dk):void");
    }
}
