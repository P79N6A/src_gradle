package com.amap.api.mapcore2d;

import android.content.Context;
import java.io.File;
import java.util.Date;

public class fd {
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x003a, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x003b, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x003d, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x003e, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x003d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:21:0x0021] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0053 A[SYNTHETIC, Splitter:B:51:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0058 A[SYNTHETIC, Splitter:B:55:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x005f A[SYNTHETIC, Splitter:B:61:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0064 A[SYNTHETIC, Splitter:B:65:0x0064] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static byte[] a(com.amap.api.mapcore2d.el r4, java.lang.String r5, boolean r6) {
        /*
            r0 = 0
            byte[] r1 = new byte[r0]
            r2 = 0
            com.amap.api.mapcore2d.el$b r3 = r4.a((java.lang.String) r5)     // Catch:{ Throwable -> 0x0048, all -> 0x0045 }
            if (r3 != 0) goto L_0x0010
            if (r3 == 0) goto L_0x000f
            r3.close()     // Catch:{ Throwable -> 0x000f }
        L_0x000f:
            return r1
        L_0x0010:
            java.io.InputStream r0 = r3.a(r0)     // Catch:{ Throwable -> 0x0043 }
            if (r0 != 0) goto L_0x0021
            if (r0 == 0) goto L_0x001b
            r0.close()     // Catch:{ Throwable -> 0x001b }
        L_0x001b:
            if (r3 == 0) goto L_0x0020
            r3.close()     // Catch:{ Throwable -> 0x0020 }
        L_0x0020:
            return r1
        L_0x0021:
            int r2 = r0.available()     // Catch:{ Throwable -> 0x0040, all -> 0x003d }
            byte[] r2 = new byte[r2]     // Catch:{ Throwable -> 0x0040, all -> 0x003d }
            r0.read(r2)     // Catch:{ Throwable -> 0x003a, all -> 0x003d }
            if (r6 == 0) goto L_0x002f
            r4.c((java.lang.String) r5)     // Catch:{ Throwable -> 0x003a, all -> 0x003d }
        L_0x002f:
            if (r0 == 0) goto L_0x0034
            r0.close()     // Catch:{ Throwable -> 0x0034 }
        L_0x0034:
            if (r3 == 0) goto L_0x0039
            r3.close()     // Catch:{ Throwable -> 0x0039 }
        L_0x0039:
            return r2
        L_0x003a:
            r4 = move-exception
            r1 = r2
            goto L_0x0041
        L_0x003d:
            r4 = move-exception
            r2 = r0
            goto L_0x005d
        L_0x0040:
            r4 = move-exception
        L_0x0041:
            r2 = r0
            goto L_0x004a
        L_0x0043:
            r4 = move-exception
            goto L_0x004a
        L_0x0045:
            r4 = move-exception
            r3 = r2
            goto L_0x005d
        L_0x0048:
            r4 = move-exception
            r3 = r2
        L_0x004a:
            java.lang.String r5 = "Utils"
            java.lang.String r6 = "readSingleLog"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r4, (java.lang.String) r5, (java.lang.String) r6)     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0056
            r2.close()     // Catch:{ Throwable -> 0x0056 }
        L_0x0056:
            if (r3 == 0) goto L_0x005b
            r3.close()     // Catch:{ Throwable -> 0x005b }
        L_0x005b:
            return r1
        L_0x005c:
            r4 = move-exception
        L_0x005d:
            if (r2 == 0) goto L_0x0062
            r2.close()     // Catch:{ Throwable -> 0x0062 }
        L_0x0062:
            if (r3 == 0) goto L_0x0067
            r3.close()     // Catch:{ Throwable -> 0x0067 }
        L_0x0067:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.fd.a(com.amap.api.mapcore2d.el, java.lang.String, boolean):byte[]");
    }

    public static String a() {
        return cz.a(new Date().getTime());
    }

    static byte[] a(el elVar, String str) {
        return a(elVar, str, true);
    }

    public static int a(Context context, String str) {
        int i;
        try {
            File file = new File(de.a(context, str));
            if (!file.exists()) {
                return 0;
            }
            i = file.list().length;
            return i;
        } catch (Throwable th) {
            dd.a(th, "Statistics.Utils", "getFileNum");
            i = 0;
        }
    }

    public static String a(Context context, cy cyVar) {
        StringBuilder sb = new StringBuilder();
        try {
            String e2 = ct.e(context);
            sb.append("\"sim\":\"");
            sb.append(e2);
            sb.append("\",\"sdkversion\":\"");
            sb.append(cyVar.c());
            sb.append("\",\"product\":\"");
            sb.append(cyVar.a());
            sb.append("\",\"ed\":\"");
            sb.append(cyVar.e());
            sb.append("\",\"nt\":\"");
            sb.append(ct.c(context));
            sb.append("\",\"np\":\"");
            sb.append(ct.a(context));
            sb.append("\",\"mnc\":\"");
            sb.append(ct.b(context));
            sb.append("\",\"ant\":\"");
            sb.append(ct.d(context));
            sb.append("\"");
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        if (r2 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0068, code lost:
        if (r2 != null) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0048 A[Catch:{ Throwable -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005d A[Catch:{ FileNotFoundException -> 0x005e, IOException -> 0x0051, Throwable -> 0x0037, all -> 0x0033, all -> 0x006c }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x006f A[SYNTHETIC, Splitter:B:45:0x006f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long b(android.content.Context r6, java.lang.String r7) {
        /*
            java.lang.String r6 = com.amap.api.mapcore2d.de.a((android.content.Context) r6, (java.lang.String) r7)
            java.io.File r7 = new java.io.File
            r7.<init>(r6)
            boolean r6 = r7.exists()
            r0 = 0
            if (r6 != 0) goto L_0x0012
            return r0
        L_0x0012:
            r6 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x005e, IOException -> 0x0051, Throwable -> 0x0037, all -> 0x0033 }
            r2.<init>(r7)     // Catch:{ FileNotFoundException -> 0x005e, IOException -> 0x0051, Throwable -> 0x0037, all -> 0x0033 }
            int r6 = r2.available()     // Catch:{ FileNotFoundException -> 0x0031, IOException -> 0x002f, Throwable -> 0x002d }
            byte[] r6 = new byte[r6]     // Catch:{ FileNotFoundException -> 0x0031, IOException -> 0x002f, Throwable -> 0x002d }
            r2.read(r6)     // Catch:{ FileNotFoundException -> 0x0031, IOException -> 0x002f, Throwable -> 0x002d }
            java.lang.String r6 = com.amap.api.mapcore2d.cz.a((byte[]) r6)     // Catch:{ FileNotFoundException -> 0x0031, IOException -> 0x002f, Throwable -> 0x002d }
            long r3 = java.lang.Long.parseLong(r6)     // Catch:{ FileNotFoundException -> 0x0031, IOException -> 0x002f, Throwable -> 0x002d }
            r2.close()     // Catch:{ Throwable -> 0x002c }
        L_0x002c:
            return r3
        L_0x002d:
            r6 = move-exception
            goto L_0x003b
        L_0x002f:
            r6 = move-exception
            goto L_0x0054
        L_0x0031:
            r6 = move-exception
            goto L_0x0061
        L_0x0033:
            r7 = move-exception
            r2 = r6
            r6 = r7
            goto L_0x006d
        L_0x0037:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L_0x003b:
            java.lang.String r3 = "StatisticsManager"
            java.lang.String r4 = "getUpdateTime"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r6, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x006c }
            boolean r6 = r7.exists()     // Catch:{ Throwable -> 0x004b }
            if (r6 == 0) goto L_0x004b
            r7.delete()     // Catch:{ Throwable -> 0x004b }
        L_0x004b:
            if (r2 == 0) goto L_0x006b
        L_0x004d:
            r2.close()     // Catch:{ Throwable -> 0x006b }
            goto L_0x006b
        L_0x0051:
            r7 = move-exception
            r2 = r6
            r6 = r7
        L_0x0054:
            java.lang.String r7 = "StatisticsManager"
            java.lang.String r3 = "getUpdateTime"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r6, (java.lang.String) r7, (java.lang.String) r3)     // Catch:{ all -> 0x006c }
            if (r2 == 0) goto L_0x006b
            goto L_0x004d
        L_0x005e:
            r7 = move-exception
            r2 = r6
            r6 = r7
        L_0x0061:
            java.lang.String r7 = "StatisticsManager"
            java.lang.String r3 = "getUpdateTime"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r6, (java.lang.String) r7, (java.lang.String) r3)     // Catch:{ all -> 0x006c }
            if (r2 == 0) goto L_0x006b
            goto L_0x004d
        L_0x006b:
            return r0
        L_0x006c:
            r6 = move-exception
        L_0x006d:
            if (r2 == 0) goto L_0x0072
            r2.close()     // Catch:{ Throwable -> 0x0072 }
        L_0x0072:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.fd.b(android.content.Context, java.lang.String):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003a A[SYNTHETIC, Splitter:B:20:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0040 A[SYNTHETIC, Splitter:B:26:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0046 A[SYNTHETIC, Splitter:B:32:0x0046] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r1, long r2, java.lang.String r4) {
        /*
            java.lang.String r1 = com.amap.api.mapcore2d.de.a((android.content.Context) r1, (java.lang.String) r4)
            java.io.File r4 = new java.io.File
            r4.<init>(r1)
            java.io.File r1 = r4.getParentFile()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x001a
            java.io.File r1 = r4.getParentFile()
            r1.mkdirs()
        L_0x001a:
            r1 = 0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0044, IOException -> 0x003e, all -> 0x0035 }
            r0.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0044, IOException -> 0x003e, all -> 0x0035 }
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ FileNotFoundException -> 0x0033, IOException -> 0x0031, all -> 0x002f }
            byte[] r1 = com.amap.api.mapcore2d.cz.a((java.lang.String) r1)     // Catch:{ FileNotFoundException -> 0x0033, IOException -> 0x0031, all -> 0x002f }
            r0.write(r1)     // Catch:{ FileNotFoundException -> 0x0033, IOException -> 0x0031, all -> 0x002f }
            r0.close()     // Catch:{ Throwable -> 0x002e }
        L_0x002e:
            return
        L_0x002f:
            r1 = move-exception
            goto L_0x0038
        L_0x0031:
            r1 = r0
            goto L_0x003e
        L_0x0033:
            r1 = r0
            goto L_0x0044
        L_0x0035:
            r2 = move-exception
            r0 = r1
            r1 = r2
        L_0x0038:
            if (r0 == 0) goto L_0x003d
            r0.close()     // Catch:{ Throwable -> 0x003d }
        L_0x003d:
            throw r1
        L_0x003e:
            if (r1 == 0) goto L_0x004a
            r1.close()     // Catch:{ Throwable -> 0x0043 }
        L_0x0043:
            return
        L_0x0044:
            if (r1 == 0) goto L_0x004a
            r1.close()     // Catch:{ Throwable -> 0x0049 }
        L_0x0049:
            return
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.fd.a(android.content.Context, long, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006a, code lost:
        if (r7 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007b, code lost:
        if (r7 != null) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0085 A[SYNTHETIC, Splitter:B:51:0x0085] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(android.content.Context r6, java.lang.String r7, int r8) {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            byte[] r2 = new byte[r1]
            java.lang.String r6 = com.amap.api.mapcore2d.de.a((android.content.Context) r6, (java.lang.String) r7)
            r7 = 0
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x0070, Throwable -> 0x005f }
            r3.<init>(r6)     // Catch:{ IOException -> 0x0070, Throwable -> 0x005f }
            long r4 = (long) r8     // Catch:{ IOException -> 0x0070, Throwable -> 0x005f }
            r8 = 1
            com.amap.api.mapcore2d.el r8 = com.amap.api.mapcore2d.el.a(r3, r8, r8, r4)     // Catch:{ IOException -> 0x0070, Throwable -> 0x005f }
            java.io.File r7 = new java.io.File     // Catch:{ IOException -> 0x0059, Throwable -> 0x0056, all -> 0x0054 }
            r7.<init>(r6)     // Catch:{ IOException -> 0x0059, Throwable -> 0x0056, all -> 0x0054 }
            boolean r6 = r7.exists()     // Catch:{ IOException -> 0x0059, Throwable -> 0x0056, all -> 0x0054 }
            if (r6 == 0) goto L_0x0047
            java.lang.String[] r6 = r7.list()     // Catch:{ IOException -> 0x0059, Throwable -> 0x0056, all -> 0x0054 }
            int r7 = r6.length     // Catch:{ IOException -> 0x0059, Throwable -> 0x0056, all -> 0x0054 }
            r3 = 0
        L_0x0029:
            if (r3 >= r7) goto L_0x0047
            r4 = r6[r3]     // Catch:{ IOException -> 0x0059, Throwable -> 0x0056, all -> 0x0054 }
            java.lang.String r5 = ".0"
            boolean r5 = r4.contains(r5)     // Catch:{ IOException -> 0x0059, Throwable -> 0x0056, all -> 0x0054 }
            if (r5 == 0) goto L_0x0044
            java.lang.String r5 = "\\."
            java.lang.String[] r4 = r4.split(r5)     // Catch:{ IOException -> 0x0059, Throwable -> 0x0056, all -> 0x0054 }
            r4 = r4[r1]     // Catch:{ IOException -> 0x0059, Throwable -> 0x0056, all -> 0x0054 }
            byte[] r4 = a((com.amap.api.mapcore2d.el) r8, (java.lang.String) r4)     // Catch:{ IOException -> 0x0059, Throwable -> 0x0056, all -> 0x0054 }
            r0.write(r4)     // Catch:{ IOException -> 0x0059, Throwable -> 0x0056, all -> 0x0054 }
        L_0x0044:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x0047:
            byte[] r6 = r0.toByteArray()     // Catch:{ IOException -> 0x0059, Throwable -> 0x0056, all -> 0x0054 }
            r0.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            if (r8 == 0) goto L_0x007f
            r8.close()     // Catch:{ Throwable -> 0x007f }
            goto L_0x007f
        L_0x0054:
            r6 = move-exception
            goto L_0x0080
        L_0x0056:
            r6 = move-exception
            r7 = r8
            goto L_0x0060
        L_0x0059:
            r6 = move-exception
            r7 = r8
            goto L_0x0071
        L_0x005c:
            r6 = move-exception
            r8 = r7
            goto L_0x0080
        L_0x005f:
            r6 = move-exception
        L_0x0060:
            java.lang.String r8 = "Statistics.Utils"
            java.lang.String r1 = "getContent"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r6, (java.lang.String) r8, (java.lang.String) r1)     // Catch:{ all -> 0x005c }
            r0.close()     // Catch:{ IOException -> 0x006a }
        L_0x006a:
            if (r7 == 0) goto L_0x007e
        L_0x006c:
            r7.close()     // Catch:{ Throwable -> 0x007e }
            goto L_0x007e
        L_0x0070:
            r6 = move-exception
        L_0x0071:
            java.lang.String r8 = "Statistics.Utils"
            java.lang.String r1 = "getContent"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r6, (java.lang.String) r8, (java.lang.String) r1)     // Catch:{ all -> 0x005c }
            r0.close()     // Catch:{ IOException -> 0x007b }
        L_0x007b:
            if (r7 == 0) goto L_0x007e
            goto L_0x006c
        L_0x007e:
            r6 = r2
        L_0x007f:
            return r6
        L_0x0080:
            r0.close()     // Catch:{ IOException -> 0x0083 }
        L_0x0083:
            if (r8 == 0) goto L_0x0088
            r8.close()     // Catch:{ Throwable -> 0x0088 }
        L_0x0088:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.fd.a(android.content.Context, java.lang.String, int):byte[]");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:38|39|40) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:41|(0)|(0)|49|50) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        if (r5 == null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007a, code lost:
        if (r5 == null) goto L_0x007d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x007d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x008c */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0075 A[SYNTHETIC, Splitter:B:34:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082 A[SYNTHETIC, Splitter:B:43:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0089 A[SYNTHETIC, Splitter:B:47:0x0089] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:49:0x008c=Splitter:B:49:0x008c, B:38:0x007d=Splitter:B:38:0x007d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r5, java.lang.String r6, int r7, byte[] r8) {
        /*
            if (r8 == 0) goto L_0x0090
            int r0 = r8.length
            if (r0 != 0) goto L_0x0007
            goto L_0x0090
        L_0x0007:
            java.lang.Class<com.amap.api.mapcore2d.fd> r0 = com.amap.api.mapcore2d.fd.class
            monitor-enter(r0)
            java.util.Random r1 = new java.util.Random     // Catch:{ all -> 0x008d }
            r1.<init>()     // Catch:{ all -> 0x008d }
            r2 = 0
            java.lang.String r5 = com.amap.api.mapcore2d.de.a((android.content.Context) r5, (java.lang.String) r6)     // Catch:{ Throwable -> 0x006a, all -> 0x0067 }
            java.io.File r6 = new java.io.File     // Catch:{ Throwable -> 0x006a, all -> 0x0067 }
            r6.<init>(r5)     // Catch:{ Throwable -> 0x006a, all -> 0x0067 }
            long r3 = (long) r7     // Catch:{ Throwable -> 0x006a, all -> 0x0067 }
            r5 = 1
            com.amap.api.mapcore2d.el r5 = com.amap.api.mapcore2d.el.a(r6, r5, r5, r3)     // Catch:{ Throwable -> 0x006a, all -> 0x0067 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0065 }
            r6.<init>()     // Catch:{ Throwable -> 0x0065 }
            r7 = 100
            int r7 = r1.nextInt(r7)     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ Throwable -> 0x0065 }
            r6.append(r7)     // Catch:{ Throwable -> 0x0065 }
            long r3 = java.lang.System.nanoTime()     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r7 = java.lang.Long.toString(r3)     // Catch:{ Throwable -> 0x0065 }
            r6.append(r7)     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r6 = r6.toString()     // Catch:{ Throwable -> 0x0065 }
            com.amap.api.mapcore2d.el$a r6 = r5.b((java.lang.String) r6)     // Catch:{ Throwable -> 0x0065 }
            r7 = 0
            java.io.OutputStream r7 = r6.a((int) r7)     // Catch:{ Throwable -> 0x0065 }
            r7.write(r8)     // Catch:{ Throwable -> 0x0062, all -> 0x005f }
            r6.a()     // Catch:{ Throwable -> 0x0062, all -> 0x005f }
            r5.e()     // Catch:{ Throwable -> 0x0062, all -> 0x005f }
            if (r7 == 0) goto L_0x0059
            r7.close()     // Catch:{ Throwable -> 0x0058 }
            goto L_0x0059
        L_0x0058:
        L_0x0059:
            if (r5 == 0) goto L_0x007d
        L_0x005b:
            r5.close()     // Catch:{ Throwable -> 0x007d }
            goto L_0x007d
        L_0x005f:
            r6 = move-exception
            r2 = r7
            goto L_0x0080
        L_0x0062:
            r6 = move-exception
            r2 = r7
            goto L_0x006c
        L_0x0065:
            r6 = move-exception
            goto L_0x006c
        L_0x0067:
            r6 = move-exception
            r5 = r2
            goto L_0x0080
        L_0x006a:
            r6 = move-exception
            r5 = r2
        L_0x006c:
            java.lang.String r7 = "Statistics.Utils"
            java.lang.String r8 = "writeToDiskLruCache"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r6, (java.lang.String) r7, (java.lang.String) r8)     // Catch:{ all -> 0x007f }
            if (r2 == 0) goto L_0x007a
            r2.close()     // Catch:{ Throwable -> 0x0079 }
            goto L_0x007a
        L_0x0079:
        L_0x007a:
            if (r5 == 0) goto L_0x007d
            goto L_0x005b
        L_0x007d:
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            return
        L_0x007f:
            r6 = move-exception
        L_0x0080:
            if (r2 == 0) goto L_0x0087
            r2.close()     // Catch:{ Throwable -> 0x0086 }
            goto L_0x0087
        L_0x0086:
        L_0x0087:
            if (r5 == 0) goto L_0x008c
            r5.close()     // Catch:{ Throwable -> 0x008c }
        L_0x008c:
            throw r6     // Catch:{ all -> 0x008d }
        L_0x008d:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            throw r5
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.fd.a(android.content.Context, java.lang.String, int, byte[]):void");
    }

    public static String a(String str, String str2, String str3, int i, String str4, String str5) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str2);
        stringBuffer.append(",\"timestamp\":\"");
        stringBuffer.append(str3);
        stringBuffer.append("\",\"et\":\"");
        stringBuffer.append(i);
        stringBuffer.append("\",\"classname\":\"");
        stringBuffer.append(str4);
        stringBuffer.append("\",");
        stringBuffer.append("\"detail\":\"");
        stringBuffer.append(str5);
        stringBuffer.append("\"");
        return stringBuffer.toString();
    }
}
