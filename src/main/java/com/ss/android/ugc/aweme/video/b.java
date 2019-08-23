package com.ss.android.ugc.aweme.video;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.ec;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4305a;

    /* renamed from: b  reason: collision with root package name */
    static Context f4306b;

    @Deprecated
    public static File a() {
        return b(f4306b);
    }

    @Deprecated
    public static File e() {
        return c(f4306b);
    }

    @Deprecated
    public static String b() {
        return b(f4306b).getPath();
    }

    public static String f() {
        if (PatchProxy.isSupport(new Object[0], null, f4305a, true, 88873, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f4305a, true, 88873, new Class[0], String.class);
        }
        return c(f4306b).getPath();
    }

    public static boolean h() {
        if (PatchProxy.isSupport(new Object[0], null, f4305a, true, 88887, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f4305a, true, 88887, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    public static File c() {
        if (PatchProxy.isSupport(new Object[0], null, f4305a, true, 88868, new Class[0], File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[0], null, f4305a, true, 88868, new Class[0], File.class);
        }
        if (!g() || !h()) {
            return null;
        }
        File file = new File(a(), "video");
        a(file);
        return file;
    }

    public static File d() {
        if (PatchProxy.isSupport(new Object[0], null, f4305a, true, 88869, new Class[0], File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[0], null, f4305a, true, 88869, new Class[0], File.class);
        }
        if (!g() || !h()) {
            return null;
        }
        File file = new File(a(), "picture");
        a(file);
        return file;
    }

    public static boolean g() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f4305a, true, 88886, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f4305a, true, 88886, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            String externalStorageState = Environment.getExternalStorageState();
            if ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) {
                z = true;
            }
        } catch (Exception unused) {
            z = ec.a().b();
        }
        return z;
    }

    public static long i() {
        long j;
        if (PatchProxy.isSupport(new Object[0], null, f4305a, true, 88888, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], null, f4305a, true, 88888, new Class[0], Long.TYPE)).longValue();
        }
        if (!g()) {
            return 0;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            j = statFs.getAvailableBytes();
        } else {
            j = ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
        }
        return j;
    }

    public static void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f4305a, true, 88866, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, null, f4305a, true, 88866, new Class[]{Context.class}, Void.TYPE);
        } else if (context != null) {
            f4306b = context;
        } else {
            throw new NullPointerException();
        }
    }

    public static File b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f4305a, true, 88867, new Class[]{Context.class}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{context}, null, f4305a, true, 88867, new Class[]{Context.class}, File.class);
        }
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        return externalCacheDir;
    }

    public static void b(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, null, f4305a, true, 88894, new Class[]{File.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{file}, null, f4305a, true, 88894, new Class[]{File.class}, Void.TYPE);
            return;
        }
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            if (file2.isDirectory()) {
                                b(file2);
                            } else {
                                file2.delete();
                            }
                        }
                        file.delete();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void e(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f4305a, true, 88895, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f4305a, true, 88895, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            File file = new File(str2);
            if (file.exists() && file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            b(file2);
                        } else {
                            file2.delete();
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066 A[SYNTHETIC, Splitter:B:23:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006d A[SYNTHETIC, Splitter:B:31:0x006d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String f(java.lang.String r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f4305a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 88900(0x15b44, float:1.24575E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f4305a
            r13 = 1
            r14 = 88900(0x15b44, float:1.24575E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0037:
            boolean r1 = android.text.TextUtils.isEmpty(r17)
            r2 = 0
            if (r1 == 0) goto L_0x003f
            return r2
        L_0x003f:
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ Exception -> 0x006a, all -> 0x0062 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x006a, all -> 0x0062 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006b, all -> 0x0060 }
            r0.<init>()     // Catch:{ Exception -> 0x006b, all -> 0x0060 }
            r3 = 1024(0x400, float:1.435E-42)
            char[] r3 = new char[r3]     // Catch:{ Exception -> 0x006b, all -> 0x0060 }
        L_0x004d:
            int r4 = r1.read(r3)     // Catch:{ Exception -> 0x006b, all -> 0x0060 }
            r5 = -1
            if (r4 == r5) goto L_0x0058
            r0.append(r3, r9, r4)     // Catch:{ Exception -> 0x006b, all -> 0x0060 }
            goto L_0x004d
        L_0x0058:
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x006b, all -> 0x0060 }
            r1.close()     // Catch:{ IOException -> 0x005f }
        L_0x005f:
            return r0
        L_0x0060:
            r0 = move-exception
            goto L_0x0064
        L_0x0062:
            r0 = move-exception
            r1 = r2
        L_0x0064:
            if (r1 == 0) goto L_0x0069
            r1.close()     // Catch:{ IOException -> 0x0069 }
        L_0x0069:
            throw r0
        L_0x006a:
            r1 = r2
        L_0x006b:
            if (r1 == 0) goto L_0x0070
            r1.close()     // Catch:{ IOException -> 0x0070 }
        L_0x0070:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.b.f(java.lang.String):java.lang.String");
    }

    public static File a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f4305a, true, 88870, new Class[]{String.class}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{str2}, null, f4305a, true, 88870, new Class[]{String.class}, File.class);
        } else if (!g() || !h() || TextUtils.isEmpty(str)) {
            return null;
        } else {
            File file = new File(a(), str2);
            a(file);
            return file;
        }
    }

    public static File c(Context context) {
        File file;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f4305a, true, 88872, new Class[]{Context.class}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{context2}, null, f4305a, true, 88872, new Class[]{Context.class}, File.class);
        }
        if (!Environment.isExternalStorageEmulated()) {
            file = context2.getExternalFilesDir(null);
            if (file != null) {
                a(file);
                return file;
            }
        }
        file = context.getFilesDir();
        return file;
    }

    public static long d(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f4305a, true, 88892, new Class[]{String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{str2}, null, f4305a, true, 88892, new Class[]{String.class}, Long.TYPE)).longValue();
        }
        long j = 0;
        try {
            if (h()) {
                if (!TextUtils.isEmpty(str)) {
                    File file = new File(str2);
                    if (file.exists()) {
                        if (file.isDirectory()) {
                            File[] listFiles = file.listFiles();
                            if (listFiles == null) {
                                return 0;
                            }
                            for (File file2 : listFiles) {
                                if (file2.isFile()) {
                                    j += file2.length();
                                } else if (file2.isDirectory()) {
                                    j += d(file2.getAbsolutePath());
                                }
                            }
                            return j;
                        }
                    }
                    return 0;
                }
            }
            return 0;
        } catch (Exception unused) {
        }
    }

    public static boolean b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f4305a, true, 88884, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f4305a, true, 88884, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str)) {
            return false;
        } else {
            return new File(str2).exists();
        }
    }

    public static boolean c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f4305a, true, 88891, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f4305a, true, 88891, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str) || !h()) {
            return false;
        } else {
            File file = new File(str2);
            if (!file.exists() || !file.delete()) {
                return false;
            }
            return true;
        }
    }

    public static void a(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, null, f4305a, true, 88885, new Class[]{File.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{file}, null, f4305a, true, 88885, new Class[]{File.class}, Void.TYPE);
            return;
        }
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static File a(File file, String str) {
        File file2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{file, str2}, null, f4305a, true, 88871, new Class[]{File.class, String.class}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{file, str2}, null, f4305a, true, 88871, new Class[]{File.class, String.class}, File.class);
        } else if (!g() || !h() || TextUtils.isEmpty(str)) {
            return null;
        } else {
            if (file == null) {
                file2 = a();
            } else {
                file2 = file;
            }
            File file3 = new File(file2, str2);
            a(file3);
            return file3;
        }
    }

    public static void b(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f4305a, true, 88902, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f4305a, true, 88902, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        a(str3, str4, false);
    }

    public static File a(String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f4305a, true, 88898, new Class[]{String.class, Boolean.TYPE}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, null, f4305a, true, 88898, new Class[]{String.class, Boolean.TYPE}, File.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            File file = new File(str2);
            if (!file.exists()) {
                if (!z) {
                    file.mkdirs();
                } else {
                    try {
                        File parentFile = file.getParentFile();
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                        file.createNewFile();
                    } catch (IOException unused) {
                    }
                }
            }
            return file;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: java.io.FileOutputStream} */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r4v9, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a3 A[SYNTHETIC, Splitter:B:56:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a8 A[Catch:{ IOException -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ad A[Catch:{ IOException -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00b2 A[Catch:{ IOException -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00bb A[SYNTHETIC, Splitter:B:70:0x00bb] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00c0 A[Catch:{ IOException -> 0x00cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00c5 A[Catch:{ IOException -> 0x00cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ca A[Catch:{ IOException -> 0x00cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00d3 A[SYNTHETIC, Splitter:B:84:0x00d3] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00d8 A[Catch:{ IOException -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00dd A[Catch:{ IOException -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00e2 A[Catch:{ IOException -> 0x00e5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean d(java.lang.String r19, java.lang.String r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f4305a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = 0
            r6 = 1
            r7 = 88890(0x15b3a, float:1.24561E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x004c
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f4305a
            r15 = 1
            r16 = 88890(0x15b3a, float:1.24561E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x004c:
            boolean r2 = h()
            if (r2 != 0) goto L_0x0053
            return r10
        L_0x0053:
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00ce, IOException -> 0x00b6, all -> 0x009d }
            r3.<init>(r0)     // Catch:{ FileNotFoundException -> 0x00ce, IOException -> 0x00b6, all -> 0x009d }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x009b, IOException -> 0x0099, all -> 0x0096 }
            r4.<init>(r1)     // Catch:{ FileNotFoundException -> 0x009b, IOException -> 0x0099, all -> 0x0096 }
            java.nio.channels.FileChannel r1 = r3.getChannel()     // Catch:{ FileNotFoundException -> 0x0094, IOException -> 0x0092, all -> 0x008f }
            java.nio.channels.FileChannel r5 = r4.getChannel()     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0089, all -> 0x0085 }
            r13 = 0
            long r15 = r1.size()     // Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x008a, all -> 0x0083 }
            r12 = r1
            r17 = r5
            r12.transferTo(r13, r15, r17)     // Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x008a, all -> 0x0083 }
            r3.close()     // Catch:{ IOException -> 0x0082 }
            if (r1 == 0) goto L_0x007a
            r1.close()     // Catch:{ IOException -> 0x0082 }
        L_0x007a:
            r4.close()     // Catch:{ IOException -> 0x0082 }
            if (r5 == 0) goto L_0x0082
            r5.close()     // Catch:{ IOException -> 0x0082 }
        L_0x0082:
            return r11
        L_0x0083:
            r0 = move-exception
            goto L_0x0087
        L_0x0085:
            r0 = move-exception
            r5 = r2
        L_0x0087:
            r2 = r1
            goto L_0x00a1
        L_0x0089:
            r5 = r2
        L_0x008a:
            r2 = r1
            goto L_0x00b9
        L_0x008c:
            r5 = r2
        L_0x008d:
            r2 = r1
            goto L_0x00d1
        L_0x008f:
            r0 = move-exception
            r5 = r2
            goto L_0x00a1
        L_0x0092:
            r5 = r2
            goto L_0x00b9
        L_0x0094:
            r5 = r2
            goto L_0x00d1
        L_0x0096:
            r0 = move-exception
            r4 = r2
            goto L_0x00a0
        L_0x0099:
            r4 = r2
            goto L_0x00b8
        L_0x009b:
            r4 = r2
            goto L_0x00d0
        L_0x009d:
            r0 = move-exception
            r3 = r2
            r4 = r3
        L_0x00a0:
            r5 = r4
        L_0x00a1:
            if (r3 == 0) goto L_0x00a6
            r3.close()     // Catch:{ IOException -> 0x00b5 }
        L_0x00a6:
            if (r2 == 0) goto L_0x00ab
            r2.close()     // Catch:{ IOException -> 0x00b5 }
        L_0x00ab:
            if (r4 == 0) goto L_0x00b0
            r4.close()     // Catch:{ IOException -> 0x00b5 }
        L_0x00b0:
            if (r5 == 0) goto L_0x00b5
            r5.close()     // Catch:{ IOException -> 0x00b5 }
        L_0x00b5:
            throw r0
        L_0x00b6:
            r3 = r2
            r4 = r3
        L_0x00b8:
            r5 = r4
        L_0x00b9:
            if (r3 == 0) goto L_0x00be
            r3.close()     // Catch:{ IOException -> 0x00cd }
        L_0x00be:
            if (r2 == 0) goto L_0x00c3
            r2.close()     // Catch:{ IOException -> 0x00cd }
        L_0x00c3:
            if (r4 == 0) goto L_0x00c8
            r4.close()     // Catch:{ IOException -> 0x00cd }
        L_0x00c8:
            if (r5 == 0) goto L_0x00cd
            r5.close()     // Catch:{ IOException -> 0x00cd }
        L_0x00cd:
            return r10
        L_0x00ce:
            r3 = r2
            r4 = r3
        L_0x00d0:
            r5 = r4
        L_0x00d1:
            if (r3 == 0) goto L_0x00d6
            r3.close()     // Catch:{ IOException -> 0x00e5 }
        L_0x00d6:
            if (r2 == 0) goto L_0x00db
            r2.close()     // Catch:{ IOException -> 0x00e5 }
        L_0x00db:
            if (r4 == 0) goto L_0x00e0
            r4.close()     // Catch:{ IOException -> 0x00e5 }
        L_0x00e0:
            if (r5 == 0) goto L_0x00e5
            r5.close()     // Catch:{ IOException -> 0x00e5 }
        L_0x00e5:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.b.d(java.lang.String, java.lang.String):boolean");
    }

    public static boolean c(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f4305a, true, 88905, new Class[]{String.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f4305a, true, 88905, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !new File(str3).exists()) {
            return false;
        } else {
            a(str4, true);
            return d(str, str2);
        }
    }

    public static boolean a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f4305a, true, 88899, new Class[]{String.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f4305a, true, 88899, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return true;
        } else {
            try {
                FileWriter fileWriter = new FileWriter(str3, false);
                fileWriter.write(str4);
                fileWriter.flush();
                fileWriter.close();
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static void a(String str, String str2, boolean z) {
        String str3 = str;
        String str4 = str2;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Byte.valueOf(z ? (byte) 1 : 0)}, null, f4305a, true, 88904, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, Byte.valueOf(z)}, null, f4305a, true, 88904, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            File file = new File(str3);
            if (file.exists() && file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length != 0) {
                    File file2 = new File(str4);
                    if (!file2.exists() || !file2.isDirectory()) {
                        file2.mkdirs();
                    }
                    for (File file3 : listFiles) {
                        if (!z2 || !file3.isDirectory()) {
                            d(file3.getPath(), str4 + file3.getName());
                        } else {
                            a(file3.getPath(), str4 + file3.getName() + File.separator, z2);
                        }
                    }
                }
            }
        }
    }
}
