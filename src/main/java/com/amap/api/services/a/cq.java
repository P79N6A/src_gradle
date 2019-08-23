package com.amap.api.services.a;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.a.cu;
import dalvik.system.DexFile;
import java.io.File;
import java.util.List;

public class cq {

    public static class a {
        public static cu a(ce ceVar, String str) {
            List<cu> b2 = ceVar.b(cu.b(str), cu.class);
            if (b2 == null || b2.size() <= 0) {
                return null;
            }
            return b2.get(0);
        }

        public static void a(ce ceVar, cu cuVar, String str) {
            ceVar.a((Object) cuVar, str);
        }

        public static List<cu> a(ce ceVar, String str, String str2) {
            return ceVar.b(cu.b(str, str2), cu.class);
        }
    }

    static void a(ce ceVar, Context context, String str) {
        List<cu> a2 = a.a(ceVar, str, "used");
        if (a2 != null && a2.size() > 0) {
            for (cu next : a2) {
                if (next != null && next.c().equals(str)) {
                    a(context, ceVar, next.a());
                    List<cu> b2 = ceVar.b(cu.a(str, next.e()), cu.class);
                    if (b2 != null && b2.size() > 0) {
                        cu cuVar = b2.get(0);
                        cuVar.c("errorstatus");
                        a.a(ceVar, cuVar, cu.b(cuVar.a()));
                        File file = new File(a(context, cuVar.a()));
                        if (file.exists()) {
                            file.delete();
                        }
                    }
                }
            }
        }
    }

    static void a(Context context, File file, bn bnVar) {
        File parentFile = file.getParentFile();
        if (!file.exists() && parentFile != null && parentFile.exists()) {
            c(context, bnVar.a(), bnVar.b());
        }
    }

    private static void a(Context context, File file, String str, bn bnVar) {
        ce ceVar = new ce(context, ct.c());
        cu a2 = a.a(ceVar, file.getName());
        String e2 = a2 != null ? a2.e() : null;
        File file2 = new File(str);
        if (!TextUtils.isEmpty(e2) && file2.exists()) {
            String a3 = bl.a(str);
            String name = file2.getName();
            cu.a aVar = new cu.a(name, a3, bnVar.a(), bnVar.b(), e2);
            a.a(ceVar, aVar.a("useod").a(), cu.b(name));
        }
    }

    static String a(Context context) {
        return context.getFilesDir().getAbsolutePath() + File.separator + "pngex";
    }

    static String a(String str) {
        return str + ".o";
    }

    public static String a(Context context, String str) {
        return a(context) + File.separator + str;
    }

    static void b(Context context, String str) {
        ce ceVar = new ce(context, ct.c());
        List<cu> a2 = a.a(ceVar, str, "copy");
        cv.a(a2);
        if (a2 != null) {
            if (a2.size() > 1) {
                int size = a2.size();
                for (int i = 1; i < size; i++) {
                    c(context, ceVar, a2.get(i).a());
                }
            }
        }
    }

    public static void a(Context context, bn bnVar) {
        try {
            String b2 = b(context, bnVar.a(), bnVar.b());
            if (!TextUtils.isEmpty(b2)) {
                File file = new File(b2);
                File parentFile = file.getParentFile();
                if (!file.exists()) {
                    if (parentFile != null && parentFile.exists()) {
                        c(context, bnVar.a(), bnVar.b());
                    }
                    return;
                }
                String a2 = a(context, a(file.getName()));
                DexFile loadDex = DexFile.loadDex(b2, a2, 0);
                if (loadDex != null) {
                    loadDex.close();
                    a(context, file, a2, bnVar);
                }
            }
        } catch (Throwable th) {
            cv.a(th, "BaseClassLoader", "getInstanceByThread()");
        }
    }

    static void a(Context context, ce ceVar, String str) {
        c(context, ceVar, str);
        c(context, ceVar, a(str));
    }

    static String b(Context context, String str, String str2) {
        return a(context, a(context, str, str2));
    }

    static void c(final Context context, final String str, final String str2) {
        ca.c().submit(new Runnable() {
            public final void run() {
                try {
                    ce ceVar = new ce(context, ct.c());
                    List<cu> b2 = ceVar.b(cu.a(str), cu.class);
                    if (b2 != null && b2.size() > 0) {
                        for (cu next : b2) {
                            if (!str2.equalsIgnoreCase(next.d())) {
                                cq.c(context, ceVar, next.a());
                            }
                        }
                    }
                } catch (Throwable th) {
                    cv.a(th, "FileManager", "clearUnSuitableV");
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public static void c(Context context, ce ceVar, String str) {
        File file = new File(a(context, str));
        if (file.exists()) {
            file.delete();
        }
        ceVar.a(cu.b(str), cu.class);
    }

    static String a(Context context, ce ceVar, bn bnVar) {
        List<cu> b2 = ceVar.b(cu.b(bnVar.a(), "copy"), cu.class);
        String str = null;
        if (b2 == null || b2.size() == 0) {
            return null;
        }
        cv.a(b2);
        int i = 0;
        while (true) {
            if (i >= b2.size()) {
                break;
            }
            cu cuVar = b2.get(i);
            if (cv.a(context, ceVar, cuVar.a(), bnVar)) {
                try {
                    a(context, ceVar, bnVar, a(context, cuVar.a()), cuVar.e());
                    str = cuVar.e();
                    break;
                } catch (Throwable th) {
                    cv.a(th, "FileManager", "loadAvailableD");
                }
            } else {
                c(context, ceVar, cuVar.a());
                i++;
            }
        }
        return str;
    }

    static String a(Context context, String str, String str2) {
        String t = bj.t(context);
        return bl.b(str + str2 + t) + ".jar";
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0084 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r11, com.amap.api.services.a.ce r12, com.amap.api.services.a.bn r13, java.lang.String r14, java.lang.String r15) throws java.lang.Throwable {
        /*
            r0 = 0
            java.lang.String r4 = r13.a()     // Catch:{ Throwable -> 0x0098, all -> 0x0094 }
            java.lang.String r1 = r13.b()     // Catch:{ Throwable -> 0x0098, all -> 0x0094 }
            java.lang.String r2 = a((android.content.Context) r11, (java.lang.String) r4, (java.lang.String) r1)     // Catch:{ Throwable -> 0x0098, all -> 0x0094 }
            a((android.content.Context) r11, (com.amap.api.services.a.ce) r12, (java.lang.String) r2)     // Catch:{ Throwable -> 0x0098, all -> 0x0094 }
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
            java.lang.String r3 = com.amap.api.services.a.bl.a((java.lang.String) r0)     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            com.amap.api.services.a.cu$a r0 = new com.amap.api.services.a.cu$a     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            java.lang.String r5 = r13.b()     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            r1 = r0
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            java.lang.String r13 = "used"
            com.amap.api.services.a.cu$a r13 = r0.a((java.lang.String) r13)     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            com.amap.api.services.a.cu r13 = r13.a()     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            java.lang.String r15 = r13.a()     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            java.lang.String r15 = com.amap.api.services.a.cu.b(r15)     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            com.amap.api.services.a.cq.a.a((com.amap.api.services.a.ce) r12, (com.amap.api.services.a.cu) r13, (java.lang.String) r15)     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            com.amap.api.services.a.cv.a((java.io.Closeable) r14)     // Catch:{ Throwable -> 0x0084 }
        L_0x0084:
            com.amap.api.services.a.cv.a((java.io.Closeable) r11)     // Catch:{ Throwable -> 0x0088 }
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
            com.amap.api.services.a.cv.a((java.io.Closeable) r14)     // Catch:{ Throwable -> 0x00a0 }
        L_0x00a0:
            com.amap.api.services.a.cv.a((java.io.Closeable) r11)     // Catch:{ Throwable -> 0x00a3 }
        L_0x00a3:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.a.cq.a(android.content.Context, com.amap.api.services.a.ce, com.amap.api.services.a.bn, java.lang.String, java.lang.String):void");
    }
}
