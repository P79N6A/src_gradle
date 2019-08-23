package com.amap.api.mapcore2d;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.mapcore2d.ei;
import dalvik.system.DexFile;
import java.io.File;
import java.util.List;

public class ee {

    public static class a {
        public static ei a(dm dmVar, String str) {
            List<ei> b2 = dmVar.b(ei.b(str), ei.class);
            if (b2 == null || b2.size() <= 0) {
                return null;
            }
            return b2.get(0);
        }

        public static void a(dm dmVar, ei eiVar, String str) {
            dmVar.a((Object) eiVar, str);
        }

        public static List<ei> a(dm dmVar, String str, String str2) {
            return dmVar.b(ei.b(str, str2), ei.class);
        }
    }

    static void a(dm dmVar, Context context, String str) {
        List<ei> a2 = a.a(dmVar, str, "used");
        if (a2 != null && a2.size() > 0) {
            for (ei next : a2) {
                if (next != null && next.c().equals(str)) {
                    a(context, dmVar, next.a());
                    List<ei> b2 = dmVar.b(ei.a(str, next.e()), ei.class);
                    if (b2 != null && b2.size() > 0) {
                        ei eiVar = b2.get(0);
                        eiVar.c("errorstatus");
                        a.a(dmVar, eiVar, ei.b(eiVar.a()));
                        File file = new File(a(context, eiVar.a()));
                        if (file.exists()) {
                            file.delete();
                        }
                    }
                }
            }
        }
    }

    static void a(Context context, File file, cy cyVar) {
        File parentFile = file.getParentFile();
        if (!file.exists() && parentFile != null && parentFile.exists()) {
            c(context, cyVar.a(), cyVar.b());
        }
    }

    private static void a(Context context, File file, String str, cy cyVar) {
        dm dmVar = new dm(context, eg.c());
        ei a2 = a.a(dmVar, file.getName());
        String e2 = a2 != null ? a2.e() : null;
        File file2 = new File(str);
        if (!TextUtils.isEmpty(e2) && file2.exists()) {
            String a3 = cv.a(str);
            String name = file2.getName();
            ei.a aVar = new ei.a(name, a3, cyVar.a(), cyVar.b(), e2);
            a.a(dmVar, aVar.a("useod").a(), ei.b(name));
        }
    }

    static String a(Context context) {
        return context.getFilesDir().getAbsolutePath() + File.separator + "pngex";
    }

    static String a(String str) {
        return str + ".o";
    }

    static String a(Context context, String str) {
        return a(context) + File.separator + str;
    }

    static void b(Context context, String str) {
        dm dmVar = new dm(context, eg.c());
        List<ei> a2 = a.a(dmVar, str, "copy");
        ek.a(a2);
        if (a2 != null) {
            if (a2.size() > 1) {
                int size = a2.size();
                for (int i = 1; i < size; i++) {
                    c(context, dmVar, a2.get(i).a());
                }
            }
        }
    }

    static void a(Context context, cy cyVar) {
        try {
            String b2 = b(context, cyVar.a(), cyVar.b());
            if (!TextUtils.isEmpty(b2)) {
                File file = new File(b2);
                File parentFile = file.getParentFile();
                if (!file.exists()) {
                    if (parentFile != null && parentFile.exists()) {
                        c(context, cyVar.a(), cyVar.b());
                    }
                    return;
                }
                String a2 = a(context, a(file.getName()));
                DexFile loadDex = DexFile.loadDex(b2, a2, 0);
                if (loadDex != null) {
                    loadDex.close();
                    a(context, file, a2, cyVar);
                }
            }
        } catch (Throwable th) {
            ek.a(th, "BaseLoader", "getInstanceByThread()");
        }
    }

    static void a(Context context, dm dmVar, String str) {
        c(context, dmVar, str);
        c(context, dmVar, a(str));
    }

    static String b(Context context, String str, String str2) {
        return a(context, a(context, str, str2));
    }

    static void c(final Context context, final String str, final String str2) {
        dg.c().submit(new Runnable() {
            public final void run() {
                try {
                    dm dmVar = new dm(context, eg.c());
                    List<ei> b2 = dmVar.b(ei.a(str), ei.class);
                    if (b2 != null && b2.size() > 0) {
                        for (ei next : b2) {
                            if (!str2.equalsIgnoreCase(next.d())) {
                                ee.c(context, dmVar, next.a());
                            }
                        }
                    }
                } catch (Throwable th) {
                    ek.a(th, "FileManager", "clearUnSuitableV");
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public static void c(Context context, dm dmVar, String str) {
        File file = new File(a(context, str));
        if (file.exists()) {
            file.delete();
        }
        dmVar.a(ei.b(str), ei.class);
    }

    static String a(Context context, dm dmVar, cy cyVar) {
        List<ei> b2 = dmVar.b(ei.b(cyVar.a(), "copy"), ei.class);
        String str = null;
        if (b2 == null || b2.size() == 0) {
            return null;
        }
        ek.a(b2);
        int i = 0;
        while (true) {
            if (i >= b2.size()) {
                break;
            }
            ei eiVar = b2.get(i);
            if (ek.a(context, dmVar, eiVar.a(), cyVar)) {
                try {
                    a(context, dmVar, cyVar, a(context, eiVar.a()), eiVar.e());
                    str = eiVar.e();
                    break;
                } catch (Throwable th) {
                    ek.a(th, "FileManager", "loadAvailableD");
                }
            } else {
                c(context, dmVar, eiVar.a());
                i++;
            }
        }
        return str;
    }

    static String a(Context context, String str, String str2) {
        String q = ct.q(context);
        return cv.b(str + str2 + q) + ".jar";
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0084 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(android.content.Context r11, com.amap.api.mapcore2d.dm r12, com.amap.api.mapcore2d.cy r13, java.lang.String r14, java.lang.String r15) throws java.lang.Throwable {
        /*
            r0 = 0
            java.lang.String r4 = r13.a()     // Catch:{ Throwable -> 0x0098, all -> 0x0094 }
            java.lang.String r1 = r13.b()     // Catch:{ Throwable -> 0x0098, all -> 0x0094 }
            java.lang.String r2 = a((android.content.Context) r11, (java.lang.String) r4, (java.lang.String) r1)     // Catch:{ Throwable -> 0x0098, all -> 0x0094 }
            a((android.content.Context) r11, (com.amap.api.mapcore2d.dm) r12, (java.lang.String) r2)     // Catch:{ Throwable -> 0x0098, all -> 0x0094 }
            java.io.File r1 = new java.io.File     // Catch:{ Throwable -> 0x0098, all -> 0x0094 }
            r1.<init>(r14)     // Catch:{ Throwable -> 0x0098, all -> 0x0094 }
            java.io.FileInputStream r14 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0098, all -> 0x0094 }
            r14.<init>(r1)     // Catch:{ Throwable -> 0x0098, all -> 0x0094 }
            r1 = 32
            byte[] r1 = new byte[r1]     // Catch:{ Throwable -> 0x0090, all -> 0x008d }
            r14.read(r1)     // Catch:{ Throwable -> 0x0090, all -> 0x008d }
            java.io.File r1 = new java.io.File     // Catch:{ Throwable -> 0x0090, all -> 0x008d }
            java.lang.String r3 = r13.b()     // Catch:{ Throwable -> 0x0090, all -> 0x008d }
            java.lang.String r11 = b((android.content.Context) r11, (java.lang.String) r4, (java.lang.String) r3)     // Catch:{ Throwable -> 0x0090, all -> 0x008d }
            r1.<init>(r11)     // Catch:{ Throwable -> 0x0090, all -> 0x008d }
            java.io.RandomAccessFile r11 = new java.io.RandomAccessFile     // Catch:{ Throwable -> 0x0090, all -> 0x008d }
            java.lang.String r3 = "rw"
            r11.<init>(r1, r3)     // Catch:{ Throwable -> 0x0090, all -> 0x008d }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r0]     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            r5 = 0
            r6 = 0
        L_0x003b:
            int r7 = r14.read(r3)     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            if (r7 <= 0) goto L_0x0059
            if (r7 != r0) goto L_0x004b
            long r8 = (long) r6     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            r11.seek(r8)     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            r11.write(r3)     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            goto L_0x0057
        L_0x004b:
            byte[] r8 = new byte[r7]     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            java.lang.System.arraycopy(r3, r5, r8, r5, r7)     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            long r9 = (long) r6     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            r11.seek(r9)     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            r11.write(r8)     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
        L_0x0057:
            int r6 = r6 + r7
            goto L_0x003b
        L_0x0059:
            java.lang.String r0 = r1.getAbsolutePath()     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            java.lang.String r3 = com.amap.api.mapcore2d.cv.a((java.lang.String) r0)     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            com.amap.api.mapcore2d.ei$a r0 = new com.amap.api.mapcore2d.ei$a     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            java.lang.String r5 = r13.b()     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            r1 = r0
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            java.lang.String r13 = "used"
            com.amap.api.mapcore2d.ei$a r13 = r0.a((java.lang.String) r13)     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            com.amap.api.mapcore2d.ei r13 = r13.a()     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            java.lang.String r15 = r13.a()     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            java.lang.String r15 = com.amap.api.mapcore2d.ei.b(r15)     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            com.amap.api.mapcore2d.ee.a.a((com.amap.api.mapcore2d.dm) r12, (com.amap.api.mapcore2d.ei) r13, (java.lang.String) r15)     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            com.amap.api.mapcore2d.ek.a((java.io.Closeable) r14)     // Catch:{ Throwable -> 0x0084 }
        L_0x0084:
            com.amap.api.mapcore2d.ek.a((java.io.Closeable) r11)     // Catch:{ Throwable -> 0x0088 }
            return
        L_0x0088:
            return
        L_0x0089:
            r12 = move-exception
            goto L_0x009d
        L_0x008b:
            r12 = move-exception
            goto L_0x0092
        L_0x008d:
            r12 = move-exception
            r11 = r0
            goto L_0x009d
        L_0x0090:
            r12 = move-exception
            r11 = r0
        L_0x0092:
            r0 = r14
            goto L_0x009a
        L_0x0094:
            r12 = move-exception
            r11 = r0
            r14 = r11
            goto L_0x009d
        L_0x0098:
            r12 = move-exception
            r11 = r0
        L_0x009a:
            throw r12     // Catch:{ all -> 0x009b }
        L_0x009b:
            r12 = move-exception
            r14 = r0
        L_0x009d:
            com.amap.api.mapcore2d.ek.a((java.io.Closeable) r14)     // Catch:{ Throwable -> 0x00a0 }
        L_0x00a0:
            com.amap.api.mapcore2d.ek.a((java.io.Closeable) r11)     // Catch:{ Throwable -> 0x00a3 }
        L_0x00a3:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.ee.a(android.content.Context, com.amap.api.mapcore2d.dm, com.amap.api.mapcore2d.cy, java.lang.String, java.lang.String):void");
    }
}
