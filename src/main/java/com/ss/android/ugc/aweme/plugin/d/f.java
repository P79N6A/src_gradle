package com.ss.android.ugc.aweme.plugin.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59293a;

    /* renamed from: b  reason: collision with root package name */
    private static List<String> f59294b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private static Pattern f59295c = Pattern.compile("lib\\w+\\.so");

    private static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f59293a, true, 64628, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f59293a, true, 64628, new Class[]{String.class}, String.class);
        }
        if (!f59295c.matcher(str2).matches()) {
            str2 = System.mapLibraryName(str);
        }
        return str2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:19|20|21|22|(1:24)|25|(1:27)(3:30|31|32)) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c2, code lost:
        return true;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0088 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c3 A[SYNTHETIC, Splitter:B:30:0x00c3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean a(java.lang.String r20, java.lang.String r21) throws java.lang.IllegalArgumentException {
        /*
            r0 = r20
            r1 = r21
            java.lang.Class<com.ss.android.ugc.aweme.plugin.d.f> r2 = com.ss.android.ugc.aweme.plugin.d.f.class
            monitor-enter(r2)
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0103 }
            r11 = 0
            r4[r11] = r0     // Catch:{ all -> 0x0103 }
            r12 = 1
            r4[r12] = r1     // Catch:{ all -> 0x0103 }
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = f59293a     // Catch:{ all -> 0x0103 }
            r7 = 1
            r8 = 64627(0xfc73, float:9.0562E-41)
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ all -> 0x0103 }
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r9[r11] = r10     // Catch:{ all -> 0x0103 }
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r9[r12] = r10     // Catch:{ all -> 0x0103 }
            java.lang.Class r10 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0103 }
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0103 }
            if (r4 == 0) goto L_0x0051
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ all -> 0x0103 }
            r13[r11] = r0     // Catch:{ all -> 0x0103 }
            r13[r12] = r1     // Catch:{ all -> 0x0103 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f59293a     // Catch:{ all -> 0x0103 }
            r16 = 1
            r17 = 64627(0xfc73, float:9.0562E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x0103 }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1     // Catch:{ all -> 0x0103 }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1     // Catch:{ all -> 0x0103 }
            java.lang.Class r19 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0103 }
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0103 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0103 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0103 }
            monitor-exit(r2)
            return r0
        L_0x0051:
            java.util.List<java.lang.String> r3 = f59294b     // Catch:{ all -> 0x0103 }
            boolean r3 = r3.contains(r1)     // Catch:{ all -> 0x0103 }
            if (r3 == 0) goto L_0x005b
            monitor-exit(r2)
            return r12
        L_0x005b:
            boolean r3 = android.text.TextUtils.isEmpty(r20)     // Catch:{ all -> 0x0103 }
            if (r3 != 0) goto L_0x00fb
            boolean r3 = com.bytedance.frameworks.plugin.pm.c.b(r20)     // Catch:{ all -> 0x0103 }
            if (r3 == 0) goto L_0x00e7
            com.bytedance.frameworks.plugin.pm.c.g(r20)     // Catch:{ UnsatisfiedLinkError -> 0x0088 }
            int r3 = com.bytedance.frameworks.plugin.pm.c.c(r20)     // Catch:{ UnsatisfiedLinkError -> 0x0088 }
            java.lang.String r3 = com.bytedance.frameworks.plugin.b.e.c(r0, r3)     // Catch:{ UnsatisfiedLinkError -> 0x0088 }
            java.io.File r4 = new java.io.File     // Catch:{ UnsatisfiedLinkError -> 0x0088 }
            java.lang.String r5 = a(r21)     // Catch:{ UnsatisfiedLinkError -> 0x0088 }
            r4.<init>(r3, r5)     // Catch:{ UnsatisfiedLinkError -> 0x0088 }
            java.lang.String r3 = r4.getPath()     // Catch:{ UnsatisfiedLinkError -> 0x0088 }
            java.lang.System.load(r3)     // Catch:{ UnsatisfiedLinkError -> 0x0088 }
            java.util.List<java.lang.String> r3 = f59294b     // Catch:{ UnsatisfiedLinkError -> 0x0088 }
            r3.add(r1)     // Catch:{ UnsatisfiedLinkError -> 0x0088 }
            goto L_0x00c1
        L_0x0088:
            int r3 = com.bytedance.frameworks.plugin.pm.c.c(r20)     // Catch:{ all -> 0x0103 }
            java.lang.String r4 = com.bytedance.frameworks.plugin.b.e.c(r0, r3)     // Catch:{ all -> 0x0103 }
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x0103 }
            java.lang.String r6 = a(r21)     // Catch:{ all -> 0x0103 }
            r5.<init>(r4, r6)     // Catch:{ all -> 0x0103 }
            boolean r4 = r5.exists()     // Catch:{ all -> 0x0103 }
            if (r4 == 0) goto L_0x00a2
            r5.delete()     // Catch:{ all -> 0x0103 }
        L_0x00a2:
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0103 }
            java.lang.String r0 = com.bytedance.frameworks.plugin.b.e.a(r0, r3)     // Catch:{ all -> 0x0103 }
            r4.<init>(r0)     // Catch:{ all -> 0x0103 }
            java.lang.String r0 = a(r21)     // Catch:{ all -> 0x0103 }
            boolean r0 = a(r4, r0, r5)     // Catch:{ all -> 0x0103 }
            if (r0 == 0) goto L_0x00c3
            java.lang.String r0 = r5.getPath()     // Catch:{ all -> 0x0103 }
            java.lang.System.load(r0)     // Catch:{ all -> 0x0103 }
            java.util.List<java.lang.String> r0 = f59294b     // Catch:{ all -> 0x0103 }
            r0.add(r1)     // Catch:{ all -> 0x0103 }
        L_0x00c1:
            monitor-exit(r2)
            return r12
        L_0x00c3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0103 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0103 }
            java.lang.String r5 = "unpackLibrary failed "
            r3.<init>(r5)     // Catch:{ all -> 0x0103 }
            java.lang.String r4 = r4.getPath()     // Catch:{ all -> 0x0103 }
            r3.append(r4)     // Catch:{ all -> 0x0103 }
            java.lang.String r4 = " lib "
            r3.append(r4)     // Catch:{ all -> 0x0103 }
            java.lang.String r1 = a(r21)     // Catch:{ all -> 0x0103 }
            r3.append(r1)     // Catch:{ all -> 0x0103 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0103 }
            r0.<init>(r1)     // Catch:{ all -> 0x0103 }
            throw r0     // Catch:{ all -> 0x0103 }
        L_0x00e7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0103 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0103 }
            java.lang.String r4 = "not installed "
            r3.<init>(r4)     // Catch:{ all -> 0x0103 }
            r3.append(r0)     // Catch:{ all -> 0x0103 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0103 }
            r1.<init>(r0)     // Catch:{ all -> 0x0103 }
            throw r1     // Catch:{ all -> 0x0103 }
        L_0x00fb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0103 }
            java.lang.String r1 = "package name is null"
            r0.<init>(r1)     // Catch:{ all -> 0x0103 }
            throw r0     // Catch:{ all -> 0x0103 }
        L_0x0103:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.plugin.d.f.a(java.lang.String, java.lang.String):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.io.InputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fb A[SYNTHETIC, Splitter:B:55:0x00fb] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010d A[SYNTHETIC, Splitter:B:66:0x010d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.io.File r21, java.lang.String r22, java.io.File r23) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f59293a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.io.File> r5 = java.io.File.class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<java.io.File> r5 = java.io.File.class
            r9[r13] = r5
            java.lang.Class r10 = java.lang.Boolean.TYPE
            r5 = 0
            r7 = 1
            r8 = 64629(0xfc75, float:9.0565E-41)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x005c
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f59293a
            r17 = 1
            r18 = 64629(0xfc75, float:9.0565E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<java.io.File> r1 = java.io.File.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<java.io.File> r1 = java.io.File.class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Boolean.TYPE
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x005c:
            r3 = 0
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch:{ Throwable -> 0x00ff, all -> 0x00ec }
            r4.<init>(r0, r12)     // Catch:{ Throwable -> 0x00ff, all -> 0x00ec }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            java.lang.String r5 = "lib/"
            r0.<init>(r5)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            java.lang.String r5 = android.os.Build.CPU_ABI     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            r0.append(r5)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            java.lang.String r5 = "/"
            r0.append(r5)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            r0.append(r1)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            java.util.zip.ZipEntry r0 = r4.getEntry(r0)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            if (r0 != 0) goto L_0x00b7
            java.lang.String r0 = android.os.Build.CPU_ABI     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            r5 = 45
            int r0 = r0.indexOf(r5)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            java.lang.String r6 = "lib/"
            r5.<init>(r6)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            java.lang.String r6 = android.os.Build.CPU_ABI     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            if (r0 <= 0) goto L_0x0094
            goto L_0x009a
        L_0x0094:
            java.lang.String r0 = android.os.Build.CPU_ABI     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            int r0 = r0.length()     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        L_0x009a:
            java.lang.String r0 = r6.substring(r11, r0)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            r5.append(r0)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            java.lang.String r0 = "/"
            r5.append(r0)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            r5.append(r1)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            java.lang.String r0 = r5.toString()     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            java.util.zip.ZipEntry r0 = r4.getEntry(r0)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            if (r0 != 0) goto L_0x00b7
            r4.close()     // Catch:{ Exception -> 0x00b6 }
        L_0x00b6:
            return r11
        L_0x00b7:
            r23.createNewFile()     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            java.io.InputStream r1 = r4.getInputStream(r0)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x00e5, all -> 0x00e1 }
            r5.<init>(r2)     // Catch:{ Throwable -> 0x00e5, all -> 0x00e1 }
            r0 = 16384(0x4000, float:2.2959E-41)
            byte[] r0 = new byte[r0]     // Catch:{ Throwable -> 0x00df, all -> 0x00dd }
        L_0x00c7:
            int r2 = r1.read(r0)     // Catch:{ Throwable -> 0x00df, all -> 0x00dd }
            if (r2 <= 0) goto L_0x00d1
            r5.write(r0, r11, r2)     // Catch:{ Throwable -> 0x00df, all -> 0x00dd }
            goto L_0x00c7
        L_0x00d1:
            if (r1 == 0) goto L_0x00d6
            com.bytedance.frameworks.plugin.f.f.a(r1)
        L_0x00d6:
            com.bytedance.frameworks.plugin.f.f.a(r5)
            r4.close()     // Catch:{ Exception -> 0x00dc }
        L_0x00dc:
            return r12
        L_0x00dd:
            r0 = move-exception
            goto L_0x00e3
        L_0x00df:
            r3 = r5
            goto L_0x0101
        L_0x00e1:
            r0 = move-exception
            r5 = r3
        L_0x00e3:
            r3 = r1
            goto L_0x00ef
        L_0x00e5:
            goto L_0x0101
        L_0x00e7:
            r0 = move-exception
            r5 = r3
            goto L_0x00ef
        L_0x00ea:
            r1 = r3
            goto L_0x0101
        L_0x00ec:
            r0 = move-exception
            r4 = r3
            r5 = r4
        L_0x00ef:
            if (r3 == 0) goto L_0x00f4
            com.bytedance.frameworks.plugin.f.f.a(r3)
        L_0x00f4:
            if (r5 == 0) goto L_0x00f9
            com.bytedance.frameworks.plugin.f.f.a(r5)
        L_0x00f9:
            if (r4 == 0) goto L_0x00fe
            r4.close()     // Catch:{ Exception -> 0x00fe }
        L_0x00fe:
            throw r0
        L_0x00ff:
            r1 = r3
            r4 = r1
        L_0x0101:
            if (r1 == 0) goto L_0x0106
            com.bytedance.frameworks.plugin.f.f.a(r1)
        L_0x0106:
            if (r3 == 0) goto L_0x010b
            com.bytedance.frameworks.plugin.f.f.a(r3)
        L_0x010b:
            if (r4 == 0) goto L_0x0110
            r4.close()     // Catch:{ Exception -> 0x0110 }
        L_0x0110:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.plugin.d.f.a(java.io.File, java.lang.String, java.io.File):boolean");
    }
}
