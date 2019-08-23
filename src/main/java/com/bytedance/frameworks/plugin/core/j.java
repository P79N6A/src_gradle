package com.bytedance.frameworks.plugin.core;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static List<String> f20023a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private static Pattern f20024b = Pattern.compile("lib\\w+\\.so");

    private static String a(String str) {
        if (!f20024b.matcher(str).matches()) {
            return System.mapLibraryName(str);
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007f, code lost:
        return false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e A[SYNTHETIC, Splitter:B:26:0x006e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean a(java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.Class<com.bytedance.frameworks.plugin.core.j> r0 = com.bytedance.frameworks.plugin.core.j.class
            monitor-enter(r0)
            java.util.List<java.lang.String> r1 = f20023a     // Catch:{ all -> 0x0080 }
            boolean r1 = r1.contains(r8)     // Catch:{ all -> 0x0080 }
            r2 = 1
            if (r1 == 0) goto L_0x000e
            monitor-exit(r0)
            return r2
        L_0x000e:
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0080 }
            r3 = 0
            if (r1 != 0) goto L_0x007e
            boolean r1 = com.bytedance.frameworks.plugin.pm.c.b(r7)     // Catch:{ all -> 0x0080 }
            if (r1 != 0) goto L_0x001c
            goto L_0x007e
        L_0x001c:
            com.bytedance.frameworks.plugin.pm.c.g(r7)     // Catch:{ UnsatisfiedLinkError -> 0x003f, Throwable -> 0x003d }
            int r1 = com.bytedance.frameworks.plugin.pm.c.c(r7)     // Catch:{ UnsatisfiedLinkError -> 0x003f, Throwable -> 0x003d }
            java.lang.String r1 = com.bytedance.frameworks.plugin.b.e.c(r7, r1)     // Catch:{ UnsatisfiedLinkError -> 0x003f, Throwable -> 0x003d }
            java.io.File r4 = new java.io.File     // Catch:{ UnsatisfiedLinkError -> 0x003f, Throwable -> 0x003d }
            java.lang.String r5 = a(r8)     // Catch:{ UnsatisfiedLinkError -> 0x003f, Throwable -> 0x003d }
            r4.<init>(r1, r5)     // Catch:{ UnsatisfiedLinkError -> 0x003f, Throwable -> 0x003d }
            java.lang.String r1 = r4.getPath()     // Catch:{ UnsatisfiedLinkError -> 0x003f, Throwable -> 0x003d }
            java.lang.System.load(r1)     // Catch:{ UnsatisfiedLinkError -> 0x003f, Throwable -> 0x003d }
            java.util.List<java.lang.String> r1 = f20023a     // Catch:{ UnsatisfiedLinkError -> 0x003f, Throwable -> 0x003d }
            r1.add(r8)     // Catch:{ UnsatisfiedLinkError -> 0x003f, Throwable -> 0x003d }
            goto L_0x007a
        L_0x003d:
            monitor-exit(r0)
            return r3
        L_0x003f:
            int r1 = com.bytedance.frameworks.plugin.pm.c.c(r7)     // Catch:{ all -> 0x0080 }
            java.lang.String r4 = com.bytedance.frameworks.plugin.b.e.c(r7, r1)     // Catch:{ all -> 0x0080 }
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x0080 }
            java.lang.String r6 = a(r8)     // Catch:{ all -> 0x0080 }
            r5.<init>(r4, r6)     // Catch:{ all -> 0x0080 }
            boolean r4 = r5.exists()     // Catch:{ all -> 0x0080 }
            if (r4 == 0) goto L_0x0059
            r5.delete()     // Catch:{ all -> 0x0080 }
        L_0x0059:
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0080 }
            java.lang.String r7 = com.bytedance.frameworks.plugin.b.e.a(r7, r1)     // Catch:{ all -> 0x0080 }
            r4.<init>(r7)     // Catch:{ all -> 0x0080 }
            java.lang.String r7 = a(r8)     // Catch:{ all -> 0x0080 }
            boolean r7 = a(r4, r7, r5)     // Catch:{ all -> 0x0080 }
            if (r7 != 0) goto L_0x006e
            monitor-exit(r0)
            return r3
        L_0x006e:
            java.lang.String r7 = r5.getPath()     // Catch:{ Throwable -> 0x007c }
            java.lang.System.load(r7)     // Catch:{ Throwable -> 0x007c }
            java.util.List<java.lang.String> r7 = f20023a     // Catch:{ Throwable -> 0x007c }
            r7.add(r8)     // Catch:{ Throwable -> 0x007c }
        L_0x007a:
            monitor-exit(r0)
            return r2
        L_0x007c:
            monitor-exit(r0)
            return r3
        L_0x007e:
            monitor-exit(r0)
            return r3
        L_0x0080:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.j.a(java.lang.String, java.lang.String):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.io.InputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a5 A[SYNTHETIC, Splitter:B:51:0x00a5] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00b7 A[SYNTHETIC, Splitter:B:62:0x00b7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.io.File r7, java.lang.String r8, java.io.File r9) {
        /*
            r0 = 0
            r1 = 0
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch:{ Throwable -> 0x00a9, all -> 0x0096 }
            r3 = 1
            r2.<init>(r7, r3)     // Catch:{ Throwable -> 0x00a9, all -> 0x0096 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0094, all -> 0x0091 }
            java.lang.String r4 = "lib/"
            r7.<init>(r4)     // Catch:{ Throwable -> 0x0094, all -> 0x0091 }
            java.lang.String r4 = android.os.Build.CPU_ABI     // Catch:{ Throwable -> 0x0094, all -> 0x0091 }
            r7.append(r4)     // Catch:{ Throwable -> 0x0094, all -> 0x0091 }
            java.lang.String r4 = "/"
            r7.append(r4)     // Catch:{ Throwable -> 0x0094, all -> 0x0091 }
            r7.append(r8)     // Catch:{ Throwable -> 0x0094, all -> 0x0091 }
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x0094, all -> 0x0091 }
            java.util.zip.ZipEntry r7 = r2.getEntry(r7)     // Catch:{ Throwable -> 0x0094, all -> 0x0091 }
            if (r7 != 0) goto L_0x005d
            java.lang.String r7 = android.os.Build.CPU_ABI     // Catch:{ Throwable -> 0x0094, all -> 0x0091 }
            r4 = 45
            int r7 = r7.indexOf(r4)     // Catch:{ Throwable -> 0x0094, all -> 0x0091 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0094, all -> 0x0091 }
            java.lang.String r5 = "lib/"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0094, all -> 0x0091 }
            java.lang.String r5 = android.os.Build.CPU_ABI     // Catch:{ Throwable -> 0x0094, all -> 0x0091 }
            if (r7 <= 0) goto L_0x003a
            goto L_0x0040
        L_0x003a:
            java.lang.String r7 = android.os.Build.CPU_ABI     // Catch:{ Throwable -> 0x0094, all -> 0x0091 }
            int r7 = r7.length()     // Catch:{ Throwable -> 0x0094, all -> 0x0091 }
        L_0x0040:
            java.lang.String r7 = r5.substring(r1, r7)     // Catch:{ Throwable -> 0x0094, all -> 0x0091 }
            r4.append(r7)     // Catch:{ Throwable -> 0x0094, all -> 0x0091 }
            java.lang.String r7 = "/"
            r4.append(r7)     // Catch:{ Throwable -> 0x0094, all -> 0x0091 }
            r4.append(r8)     // Catch:{ Throwable -> 0x0094, all -> 0x0091 }
            java.lang.String r7 = r4.toString()     // Catch:{ Throwable -> 0x0094, all -> 0x0091 }
            java.util.zip.ZipEntry r7 = r2.getEntry(r7)     // Catch:{ Throwable -> 0x0094, all -> 0x0091 }
            if (r7 != 0) goto L_0x005d
            r2.close()     // Catch:{ Exception -> 0x005c }
        L_0x005c:
            return r1
        L_0x005d:
            r9.createNewFile()     // Catch:{ Throwable -> 0x0094, all -> 0x0091 }
            java.io.InputStream r7 = r2.getInputStream(r7)     // Catch:{ Throwable -> 0x0094, all -> 0x0091 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x008f, all -> 0x0089 }
            r8.<init>(r9)     // Catch:{ Throwable -> 0x008f, all -> 0x0089 }
            r9 = 16384(0x4000, float:2.2959E-41)
            byte[] r9 = new byte[r9]     // Catch:{ Throwable -> 0x0087, all -> 0x0083 }
        L_0x006d:
            int r0 = r7.read(r9)     // Catch:{ Throwable -> 0x0087, all -> 0x0083 }
            if (r0 <= 0) goto L_0x0077
            r8.write(r9, r1, r0)     // Catch:{ Throwable -> 0x0087, all -> 0x0083 }
            goto L_0x006d
        L_0x0077:
            if (r7 == 0) goto L_0x007c
            com.bytedance.frameworks.plugin.f.f.a(r7)
        L_0x007c:
            com.bytedance.frameworks.plugin.f.f.a(r8)
            r2.close()     // Catch:{ Exception -> 0x0082 }
        L_0x0082:
            return r3
        L_0x0083:
            r9 = move-exception
            r0 = r7
            r7 = r9
            goto L_0x0099
        L_0x0087:
            r0 = r8
            goto L_0x00ab
        L_0x0089:
            r8 = move-exception
            r6 = r0
            r0 = r7
            r7 = r8
            r8 = r6
            goto L_0x0099
        L_0x008f:
            goto L_0x00ab
        L_0x0091:
            r7 = move-exception
            r8 = r0
            goto L_0x0099
        L_0x0094:
            r7 = r0
            goto L_0x00ab
        L_0x0096:
            r7 = move-exception
            r8 = r0
            r2 = r8
        L_0x0099:
            if (r0 == 0) goto L_0x009e
            com.bytedance.frameworks.plugin.f.f.a(r0)
        L_0x009e:
            if (r8 == 0) goto L_0x00a3
            com.bytedance.frameworks.plugin.f.f.a(r8)
        L_0x00a3:
            if (r2 == 0) goto L_0x00a8
            r2.close()     // Catch:{ Exception -> 0x00a8 }
        L_0x00a8:
            throw r7
        L_0x00a9:
            r7 = r0
            r2 = r7
        L_0x00ab:
            if (r7 == 0) goto L_0x00b0
            com.bytedance.frameworks.plugin.f.f.a(r7)
        L_0x00b0:
            if (r0 == 0) goto L_0x00b5
            com.bytedance.frameworks.plugin.f.f.a(r0)
        L_0x00b5:
            if (r2 == 0) goto L_0x00ba
            r2.close()     // Catch:{ Exception -> 0x00ba }
        L_0x00ba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.j.a(java.io.File, java.lang.String, java.io.File):boolean");
    }
}
