package com.loc;

import android.content.Context;
import android.text.TextUtils;
import com.loc.aa;
import com.loc.ab;
import dalvik.system.DexFile;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class w {

    public static class a {
        static aa a(n nVar, String str) {
            List<aa> b2 = nVar.b(aa.a(str), aa.class);
            if (b2 == null || b2.size() <= 0) {
                return null;
            }
            return b2.get(0);
        }

        public static List<aa> a(n nVar, String str, String str2) {
            return nVar.b(aa.b(str, str2), aa.class);
        }
    }

    static String a(Context context) {
        return context.getFilesDir().getAbsolutePath() + File.separator + "pngex";
    }

    static String a(Context context, n nVar, dh dhVar) {
        List<aa> b2 = nVar.b(aa.b(dhVar.a(), "copy"), aa.class);
        if (b2 == null || b2.size() == 0) {
            return null;
        }
        ac.a(b2);
        int i = 0;
        while (i < b2.size()) {
            aa aaVar = b2.get(i);
            String str = aaVar.f25392a;
            if (ac.a(nVar, str, a(context, str), dhVar)) {
                try {
                    a(context, nVar, dhVar, a(context, aaVar.f25392a), aaVar.f25396e);
                    return aaVar.f25396e;
                } catch (Throwable th) {
                    f.a(th, "FileManager", "loadAvailableD");
                }
            } else {
                c(context, nVar, aaVar.f25392a);
                i++;
            }
        }
        return null;
    }

    public static String a(Context context, String str) {
        return a(context) + File.separator + str;
    }

    static String a(Context context, String str, String str2) {
        String u = dc.u(context);
        return de.b(str + str2 + u) + ".jar";
    }

    static String a(String str) {
        return str + ".o";
    }

    static void a(Context context, dh dhVar) {
        try {
            ab.a a2 = ab.b().a(dhVar);
            if (a2 != null && a2.f25409a) {
                synchronized (a2) {
                    a2.wait();
                }
            }
            a2.f25410b = true;
            String b2 = b(context, dhVar.a(), dhVar.f25797a);
            if (!TextUtils.isEmpty(b2)) {
                File file = new File(b2);
                File parentFile = file.getParentFile();
                if (!file.exists()) {
                    if (parentFile != null && parentFile.exists()) {
                        c(context, dhVar.a(), dhVar.f25797a);
                    }
                    return;
                }
                String a3 = a(context, a(file.getName()));
                DexFile loadDex = DexFile.loadDex(b2, a3, 0);
                if (loadDex != null) {
                    loadDex.close();
                    String str = null;
                    n nVar = new n(context, y.b());
                    aa a4 = a.a(nVar, file.getName());
                    if (a4 != null) {
                        str = a4.f25396e;
                    }
                    String str2 = str;
                    File file2 = new File(a3);
                    if (!TextUtils.isEmpty(str2) && file2.exists()) {
                        String a5 = de.a(a3);
                        String name = file2.getName();
                        aa.a aVar = new aa.a(name, a5, dhVar.a(), dhVar.f25797a, str2);
                        nVar.a((Object) aVar.a("useod").a(), aa.a(name));
                    }
                }
                a2.f25410b = false;
            }
        } catch (Throwable th) {
            f.a(th, "BaseLoader", "getInstanceByThread()");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ea A[SYNTHETIC, Splitter:B:71:0x00ea] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(android.content.Context r16, com.loc.n r17, com.loc.dh r18, java.lang.String r19, java.lang.String r20) throws java.lang.Throwable {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = 0
            r4 = 0
            java.lang.String r8 = r18.a()     // Catch:{ Throwable -> 0x00ce, all -> 0x00c9 }
            com.loc.ab r5 = com.loc.ab.b()     // Catch:{ Throwable -> 0x00ce, all -> 0x00c9 }
            com.loc.ab$a r11 = r5.a(r2)     // Catch:{ Throwable -> 0x00ce, all -> 0x00c9 }
            if (r11 == 0) goto L_0x002c
            boolean r5 = r11.f25409a     // Catch:{ Throwable -> 0x0028, all -> 0x0023 }
            if (r5 == 0) goto L_0x002c
            monitor-enter(r11)     // Catch:{ Throwable -> 0x0028, all -> 0x0023 }
            r11.wait()     // Catch:{ all -> 0x0020 }
            monitor-exit(r11)     // Catch:{ all -> 0x0020 }
            goto L_0x002c
        L_0x0020:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ Throwable -> 0x0028, all -> 0x0023 }
            throw r0     // Catch:{ Throwable -> 0x0028, all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            r1 = r0
            r12 = r3
            goto L_0x00d6
        L_0x0028:
            r0 = move-exception
            r13 = r3
            goto L_0x00d1
        L_0x002c:
            r5 = 1
            r11.f25410b = r5     // Catch:{ Throwable -> 0x0028, all -> 0x0023 }
            java.lang.String r5 = r2.f25797a     // Catch:{ Throwable -> 0x0028, all -> 0x0023 }
            java.lang.String r6 = a((android.content.Context) r0, (java.lang.String) r8, (java.lang.String) r5)     // Catch:{ Throwable -> 0x0028, all -> 0x0023 }
            a((android.content.Context) r0, (com.loc.n) r1, (java.lang.String) r6)     // Catch:{ Throwable -> 0x0028, all -> 0x0023 }
            java.io.File r5 = new java.io.File     // Catch:{ Throwable -> 0x0028, all -> 0x0023 }
            r7 = r19
            r5.<init>(r7)     // Catch:{ Throwable -> 0x0028, all -> 0x0023 }
            java.io.FileInputStream r12 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0028, all -> 0x0023 }
            r12.<init>(r5)     // Catch:{ Throwable -> 0x0028, all -> 0x0023 }
            r5 = 32
            byte[] r5 = new byte[r5]     // Catch:{ Throwable -> 0x00c5, all -> 0x00c2 }
            r12.read(r5)     // Catch:{ Throwable -> 0x00c5, all -> 0x00c2 }
            java.io.File r5 = new java.io.File     // Catch:{ Throwable -> 0x00c5, all -> 0x00c2 }
            java.lang.String r7 = r2.f25797a     // Catch:{ Throwable -> 0x00c5, all -> 0x00c2 }
            java.lang.String r0 = b((android.content.Context) r0, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ Throwable -> 0x00c5, all -> 0x00c2 }
            r5.<init>(r0)     // Catch:{ Throwable -> 0x00c5, all -> 0x00c2 }
            java.io.RandomAccessFile r13 = new java.io.RandomAccessFile     // Catch:{ Throwable -> 0x00c5, all -> 0x00c2 }
            java.lang.String r0 = "rw"
            r13.<init>(r5, r0)     // Catch:{ Throwable -> 0x00c5, all -> 0x00c2 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r0]     // Catch:{ Throwable -> 0x00c0, all -> 0x00bd }
            r7 = 0
        L_0x0062:
            int r9 = r12.read(r3)     // Catch:{ Throwable -> 0x00c0, all -> 0x00bd }
            if (r9 <= 0) goto L_0x0080
            if (r9 != r0) goto L_0x0072
            long r14 = (long) r7     // Catch:{ Throwable -> 0x00c0, all -> 0x00bd }
            r13.seek(r14)     // Catch:{ Throwable -> 0x00c0, all -> 0x00bd }
            r13.write(r3)     // Catch:{ Throwable -> 0x00c0, all -> 0x00bd }
            goto L_0x007e
        L_0x0072:
            byte[] r10 = new byte[r9]     // Catch:{ Throwable -> 0x00c0, all -> 0x00bd }
            java.lang.System.arraycopy(r3, r4, r10, r4, r9)     // Catch:{ Throwable -> 0x00c0, all -> 0x00bd }
            long r14 = (long) r7     // Catch:{ Throwable -> 0x00c0, all -> 0x00bd }
            r13.seek(r14)     // Catch:{ Throwable -> 0x00c0, all -> 0x00bd }
            r13.write(r10)     // Catch:{ Throwable -> 0x00c0, all -> 0x00bd }
        L_0x007e:
            int r7 = r7 + r9
            goto L_0x0062
        L_0x0080:
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ Throwable -> 0x00c0, all -> 0x00bd }
            java.lang.String r7 = com.loc.de.a((java.lang.String) r0)     // Catch:{ Throwable -> 0x00c0, all -> 0x00bd }
            com.loc.aa$a r0 = new com.loc.aa$a     // Catch:{ Throwable -> 0x00c0, all -> 0x00bd }
            java.lang.String r9 = r2.f25797a     // Catch:{ Throwable -> 0x00c0, all -> 0x00bd }
            r5 = r0
            r10 = r20
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ Throwable -> 0x00c0, all -> 0x00bd }
            java.lang.String r2 = "used"
            com.loc.aa$a r0 = r0.a(r2)     // Catch:{ Throwable -> 0x00c0, all -> 0x00bd }
            com.loc.aa r0 = r0.a()     // Catch:{ Throwable -> 0x00c0, all -> 0x00bd }
            java.lang.String r2 = r0.f25392a     // Catch:{ Throwable -> 0x00c0, all -> 0x00bd }
            java.lang.String r2 = com.loc.aa.a(r2)     // Catch:{ Throwable -> 0x00c0, all -> 0x00bd }
            r1.a((java.lang.Object) r0, (java.lang.String) r2)     // Catch:{ Throwable -> 0x00c0, all -> 0x00bd }
            com.loc.ac.a((java.io.Closeable) r12)     // Catch:{ Throwable -> 0x00a9 }
            goto L_0x00ae
        L_0x00a9:
            r0 = move-exception
            r1 = r0
            com.google.a.a.a.a.a.a.b(r1)
        L_0x00ae:
            com.loc.ac.a((java.io.Closeable) r13)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x00b7
        L_0x00b2:
            r0 = move-exception
            r1 = r0
            com.google.a.a.a.a.a.a.b(r1)
        L_0x00b7:
            if (r11 == 0) goto L_0x00bc
            r11.f25410b = r4     // Catch:{ Throwable -> 0x00bc }
        L_0x00bc:
            return
        L_0x00bd:
            r0 = move-exception
            r1 = r0
            goto L_0x00d5
        L_0x00c0:
            r0 = move-exception
            goto L_0x00c7
        L_0x00c2:
            r0 = move-exception
            r1 = r0
            goto L_0x00d6
        L_0x00c5:
            r0 = move-exception
            r13 = r3
        L_0x00c7:
            r3 = r12
            goto L_0x00d1
        L_0x00c9:
            r0 = move-exception
            r1 = r0
            r11 = r3
            r12 = r11
            goto L_0x00d6
        L_0x00ce:
            r0 = move-exception
            r11 = r3
            r13 = r11
        L_0x00d1:
            throw r0     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            r0 = move-exception
            r1 = r0
            r12 = r3
        L_0x00d5:
            r3 = r13
        L_0x00d6:
            com.loc.ac.a((java.io.Closeable) r12)     // Catch:{ Throwable -> 0x00da }
            goto L_0x00df
        L_0x00da:
            r0 = move-exception
            r2 = r0
            com.google.a.a.a.a.a.a.b(r2)
        L_0x00df:
            com.loc.ac.a((java.io.Closeable) r3)     // Catch:{ Throwable -> 0x00e3 }
            goto L_0x00e8
        L_0x00e3:
            r0 = move-exception
            r2 = r0
            com.google.a.a.a.a.a.a.b(r2)
        L_0x00e8:
            if (r11 == 0) goto L_0x00ec
            r11.f25410b = r4     // Catch:{ Throwable -> 0x00ec }
        L_0x00ec:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.w.a(android.content.Context, com.loc.n, com.loc.dh, java.lang.String, java.lang.String):void");
    }

    static void a(Context context, n nVar, String str) {
        c(context, nVar, a(str));
        c(context, nVar, str);
    }

    static void a(Context context, File file, dh dhVar) {
        File parentFile = file.getParentFile();
        if (!file.exists() && parentFile != null && parentFile.exists()) {
            c(context, dhVar.a(), dhVar.f25797a);
        }
    }

    static void a(n nVar, Context context, String str) {
        List<aa> a2 = a.a(nVar, str, "used");
        if (a2 != null && a2.size() > 0) {
            for (aa next : a2) {
                if (next != null && next.f25394c.equals(str)) {
                    a(context, nVar, next.f25392a);
                    List<aa> b2 = nVar.b(aa.a(str, next.f25396e), aa.class);
                    if (b2 != null && b2.size() > 0) {
                        aa aaVar = b2.get(0);
                        aaVar.f25397f = "errorstatus";
                        nVar.a((Object) aaVar, aa.a(aaVar.f25392a));
                        File file = new File(a(context, aaVar.f25392a));
                        if (file.exists()) {
                            file.delete();
                        }
                    }
                }
            }
        }
    }

    static String b(Context context, String str, String str2) {
        return a(context, a(context, str, str2));
    }

    static void b(Context context, String str) {
        n nVar = new n(context, y.b());
        List<aa> a2 = a.a(nVar, str, "copy");
        ac.a(a2);
        if (a2 != null) {
            if (a2.size() > 1) {
                int size = a2.size();
                for (int i = 1; i < size; i++) {
                    c(context, nVar, a2.get(i).f25392a);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static void c(Context context, n nVar, String str) {
        File file = new File(a(context, str));
        if (file.exists()) {
            file.delete();
        }
        nVar.a(aa.a(str), aa.class);
    }

    private static void c(final Context context, final String str, final String str2) {
        try {
            ab.b().a().submit(new Runnable() {
                public final void run() {
                    try {
                        n nVar = new n(context, y.b());
                        String str = str;
                        HashMap hashMap = new HashMap();
                        hashMap.put("sname", str);
                        List<aa> b2 = nVar.b(n.a((Map<String, String>) hashMap), aa.class);
                        if (b2 != null && b2.size() > 0) {
                            for (aa next : b2) {
                                if (!str2.equalsIgnoreCase(next.f25395d)) {
                                    w.c(context, nVar, next.f25392a);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        f.a(th, "FileManager", "clearUnSuitableV");
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }
}
