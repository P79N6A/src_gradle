package com.loc;

import java.io.File;
import java.util.List;

public final class aq {
    private static void a(ad adVar, List<String> list) {
        if (adVar != null) {
            try {
                for (String c2 : list) {
                    adVar.c(c2);
                }
                adVar.close();
            } catch (Throwable th) {
                i.b(th, "ofm", "dlo");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008a, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00b5, code lost:
        com.google.a.a.a.a.a.a.b(r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0088 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:5:0x001c] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b0 A[SYNTHETIC, Splitter:B:57:0x00b0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.loc.an r8) {
        /*
            r0 = 0
            com.loc.bj r1 = r8.f25481f     // Catch:{ Throwable -> 0x009b }
            boolean r1 = r1.c()     // Catch:{ Throwable -> 0x009b }
            if (r1 == 0) goto L_0x008d
            com.loc.bj r1 = r8.f25481f     // Catch:{ Throwable -> 0x009b }
            r2 = 1
            r1.a((boolean) r2)     // Catch:{ Throwable -> 0x009b }
            java.io.File r1 = new java.io.File     // Catch:{ Throwable -> 0x009b }
            java.lang.String r3 = r8.f25476a     // Catch:{ Throwable -> 0x009b }
            r1.<init>(r3)     // Catch:{ Throwable -> 0x009b }
            long r3 = r8.f25477b     // Catch:{ Throwable -> 0x009b }
            com.loc.ad r1 = com.loc.ad.a((java.io.File) r1, (long) r3)     // Catch:{ Throwable -> 0x009b }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Throwable -> 0x008a, all -> 0x0088 }
            r3.<init>()     // Catch:{ Throwable -> 0x008a, all -> 0x0088 }
            byte[] r4 = a((com.loc.ad) r1, (com.loc.an) r8, (java.util.List<java.lang.String>) r3)     // Catch:{ Throwable -> 0x008a, all -> 0x0088 }
            if (r4 == 0) goto L_0x007d
            int r5 = r4.length     // Catch:{ Throwable -> 0x008a, all -> 0x0088 }
            if (r5 != 0) goto L_0x002b
            goto L_0x007d
        L_0x002b:
            com.loc.h r5 = new com.loc.h     // Catch:{ Throwable -> 0x008a, all -> 0x0088 }
            java.lang.String r6 = r8.f25478c     // Catch:{ Throwable -> 0x008a, all -> 0x0088 }
            r5.<init>(r4, r6)     // Catch:{ Throwable -> 0x008a, all -> 0x0088 }
            com.loc.ah.a()     // Catch:{ Throwable -> 0x008a, all -> 0x0088 }
            byte[] r5 = com.loc.ah.b(r5)     // Catch:{ Throwable -> 0x008a, all -> 0x0088 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Throwable -> 0x008a, all -> 0x0088 }
            java.lang.String r7 = new java.lang.String     // Catch:{ Throwable -> 0x008a, all -> 0x0088 }
            r7.<init>(r5)     // Catch:{ Throwable -> 0x008a, all -> 0x0088 }
            r6.<init>(r7)     // Catch:{ Throwable -> 0x008a, all -> 0x0088 }
            java.lang.String r5 = "code"
            boolean r5 = r6.has(r5)     // Catch:{ Throwable -> 0x008a, all -> 0x0088 }
            if (r5 == 0) goto L_0x007b
            java.lang.String r5 = "code"
            int r5 = r6.getInt(r5)     // Catch:{ Throwable -> 0x008a, all -> 0x0088 }
            if (r5 != r2) goto L_0x007b
            com.loc.bj r2 = r8.f25481f     // Catch:{ Throwable -> 0x008a, all -> 0x0088 }
            if (r2 == 0) goto L_0x005f
            if (r4 == 0) goto L_0x005f
            com.loc.bj r2 = r8.f25481f     // Catch:{ Throwable -> 0x008a, all -> 0x0088 }
            int r4 = r4.length     // Catch:{ Throwable -> 0x008a, all -> 0x0088 }
            r2.a((int) r4)     // Catch:{ Throwable -> 0x008a, all -> 0x0088 }
        L_0x005f:
            com.loc.bj r8 = r8.f25481f     // Catch:{ Throwable -> 0x008a, all -> 0x0088 }
            int r8 = r8.b()     // Catch:{ Throwable -> 0x008a, all -> 0x0088 }
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r8 >= r2) goto L_0x006e
            a((com.loc.ad) r1, (java.util.List<java.lang.String>) r3)     // Catch:{ Throwable -> 0x008a, all -> 0x0088 }
            goto L_0x008d
        L_0x006e:
            r1.e()     // Catch:{ Throwable -> 0x0072, all -> 0x0088 }
            goto L_0x008d
        L_0x0072:
            r8 = move-exception
            java.lang.String r2 = "ofm"
            java.lang.String r3 = "dlo"
            com.loc.i.b((java.lang.Throwable) r8, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ Throwable -> 0x008a, all -> 0x0088 }
            goto L_0x008d
        L_0x007b:
            r0 = r1
            goto L_0x008d
        L_0x007d:
            if (r1 == 0) goto L_0x0087
            r1.close()     // Catch:{ Throwable -> 0x0083 }
            goto L_0x0087
        L_0x0083:
            r8 = move-exception
            com.google.a.a.a.a.a.a.b(r8)
        L_0x0087:
            return
        L_0x0088:
            r8 = move-exception
            goto L_0x00ae
        L_0x008a:
            r8 = move-exception
            r0 = r1
            goto L_0x009c
        L_0x008d:
            if (r0 == 0) goto L_0x0097
            r0.close()     // Catch:{ Throwable -> 0x0093 }
            goto L_0x0097
        L_0x0093:
            r8 = move-exception
            com.google.a.a.a.a.a.a.b(r8)
        L_0x0097:
            return
        L_0x0098:
            r8 = move-exception
            r1 = r0
            goto L_0x00ae
        L_0x009b:
            r8 = move-exception
        L_0x009c:
            java.lang.String r1 = "leg"
            java.lang.String r2 = "uts"
            com.loc.i.b((java.lang.Throwable) r8, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x00ad
            r0.close()     // Catch:{ Throwable -> 0x00a9 }
            goto L_0x00ad
        L_0x00a9:
            r8 = move-exception
            com.google.a.a.a.a.a.a.b(r8)
        L_0x00ad:
            return
        L_0x00ae:
            if (r1 == 0) goto L_0x00b8
            r1.close()     // Catch:{ Throwable -> 0x00b4 }
            goto L_0x00b8
        L_0x00b4:
            r0 = move-exception
            com.google.a.a.a.a.a.a.b(r0)
        L_0x00b8:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.aq.a(com.loc.an):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x005a A[SYNTHETIC, Splitter:B:30:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064 A[SYNTHETIC, Splitter:B:35:0x0064] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r4, byte[] r5, com.loc.an r6) throws java.io.IOException, java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, java.security.InvalidKeyException, java.security.spec.InvalidKeySpecException {
        /*
            r0 = 0
            java.lang.String r1 = r6.f25476a     // Catch:{ all -> 0x0056 }
            boolean r1 = a((java.lang.String) r1, (java.lang.String) r4)     // Catch:{ all -> 0x0056 }
            if (r1 == 0) goto L_0x000a
            return
        L_0x000a:
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0056 }
            java.lang.String r2 = r6.f25476a     // Catch:{ all -> 0x0056 }
            r1.<init>(r2)     // Catch:{ all -> 0x0056 }
            boolean r2 = r1.exists()     // Catch:{ all -> 0x0056 }
            if (r2 != 0) goto L_0x001a
            r1.mkdirs()     // Catch:{ all -> 0x0056 }
        L_0x001a:
            long r2 = r6.f25477b     // Catch:{ all -> 0x0056 }
            com.loc.ad r1 = com.loc.ad.a((java.io.File) r1, (long) r2)     // Catch:{ all -> 0x0056 }
            int r2 = r6.f25479d     // Catch:{ all -> 0x0054 }
            r1.a((int) r2)     // Catch:{ all -> 0x0054 }
            com.loc.dm r6 = r6.f25480e     // Catch:{ all -> 0x0054 }
            byte[] r5 = r6.b(r5)     // Catch:{ all -> 0x0054 }
            com.loc.ad$a r4 = r1.b((java.lang.String) r4)     // Catch:{ all -> 0x0054 }
            java.io.OutputStream r6 = r4.a()     // Catch:{ all -> 0x0054 }
            r6.write(r5)     // Catch:{ all -> 0x0051 }
            r4.b()     // Catch:{ all -> 0x0051 }
            r1.c()     // Catch:{ all -> 0x0051 }
            if (r6 == 0) goto L_0x0046
            r6.close()     // Catch:{ Throwable -> 0x0042 }
            goto L_0x0046
        L_0x0042:
            r4 = move-exception
            com.google.a.a.a.a.a.a.b(r4)
        L_0x0046:
            if (r1 == 0) goto L_0x0050
            r1.close()     // Catch:{ Throwable -> 0x004c }
            goto L_0x0050
        L_0x004c:
            r4 = move-exception
            com.google.a.a.a.a.a.a.b(r4)
        L_0x0050:
            return
        L_0x0051:
            r4 = move-exception
            r0 = r6
            goto L_0x0058
        L_0x0054:
            r4 = move-exception
            goto L_0x0058
        L_0x0056:
            r4 = move-exception
            r1 = r0
        L_0x0058:
            if (r0 == 0) goto L_0x0062
            r0.close()     // Catch:{ Throwable -> 0x005e }
            goto L_0x0062
        L_0x005e:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x0062:
            if (r1 == 0) goto L_0x006c
            r1.close()     // Catch:{ Throwable -> 0x0068 }
            goto L_0x006c
        L_0x0068:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x006c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.aq.a(java.lang.String, byte[], com.loc.an):void");
    }

    private static boolean a(String str, String str2) {
        try {
            return new File(str, str2 + ".0").exists();
        } catch (Throwable th) {
            i.b(th, "leg", "fet");
            return false;
        }
    }

    private static byte[] a(ad adVar, an anVar, List<String> list) {
        try {
            File file = adVar.f25423b;
            if (file != null && file.exists()) {
                int i = 0;
                for (String str : file.list()) {
                    if (str.contains(".0")) {
                        String str2 = str.split("\\.")[0];
                        byte[] a2 = aw.a(adVar, str2);
                        i += a2.length;
                        list.add(str2);
                        if (i > anVar.f25481f.b()) {
                            break;
                        }
                        anVar.g.b(a2);
                    }
                }
                return anVar.g.a();
            }
        } catch (Throwable th) {
            i.b(th, "leg", "gCo");
        }
        return new byte[0];
    }
}
