package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public final class ay {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75549a;

    /* renamed from: b  reason: collision with root package name */
    private static final FileFilter f75550b = new FileFilter() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75551a;

        public final boolean accept(File file) {
            if (PatchProxy.isSupport(new Object[]{file}, this, f75551a, false, 88205, new Class[]{File.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{file}, this, f75551a, false, 88205, new Class[]{File.class}, Boolean.TYPE)).booleanValue();
            }
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    };

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f75552a;

        /* renamed from: b  reason: collision with root package name */
        public int f75553b;

        /* renamed from: c  reason: collision with root package name */
        public int f75554c;
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public long f75555a;

        /* renamed from: b  reason: collision with root package name */
        public long f75556b;
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f75557a;

        /* renamed from: b  reason: collision with root package name */
        public int f75558b;

        /* renamed from: c  reason: collision with root package name */
        public int f75559c;
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public long f75560a;

        /* renamed from: b  reason: collision with root package name */
        public long f75561b;

        /* renamed from: c  reason: collision with root package name */
        public long f75562c;

        /* renamed from: d  reason: collision with root package name */
        public long f75563d;

        /* renamed from: e  reason: collision with root package name */
        public long f75564e;
    }

    static class e {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75565a;

        /* renamed from: b  reason: collision with root package name */
        static final a f75566b;

        static class a {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75567a;

            private a() {
            }

            public String a() {
                if (PatchProxy.isSupport(new Object[0], this, f75567a, false, 88207, new Class[0], String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[0], this, f75567a, false, 88207, new Class[0], String.class);
                }
                return Build.CPU_ABI + "_" + Build.CPU_ABI2;
            }

            /* synthetic */ a(byte b2) {
                this();
            }
        }

        static class b extends a {

            /* renamed from: b  reason: collision with root package name */
            public static ChangeQuickRedirect f75568b;

            private b() {
                super((byte) 0);
            }

            @RequiresApi(api = 21)
            public final String a() {
                if (PatchProxy.isSupport(new Object[0], this, f75568b, false, 88208, new Class[0], String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[0], this, f75568b, false, 88208, new Class[0], String.class);
                } else if (Build.SUPPORTED_ABIS == null) {
                    return "";
                } else {
                    String str = "";
                    for (String str2 : Build.SUPPORTED_ABIS) {
                        str = str + str2 + "_";
                    }
                    return str;
                }
            }

            /* synthetic */ b(byte b2) {
                this();
            }
        }

        static {
            if (Build.VERSION.SDK_INT >= 21) {
                f75566b = new b((byte) 0);
            } else {
                f75566b = new a((byte) 0);
            }
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public long f75569a = -1;

        /* renamed from: b  reason: collision with root package name */
        public long f75570b = -1;

        /* renamed from: c  reason: collision with root package name */
        public long f75571c = -1;

        /* renamed from: d  reason: collision with root package name */
        public long f75572d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f75573e = -1;
    }

    static boolean c() {
        if (PatchProxy.isSupport(new Object[0], null, f75549a, true, 88189, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f75549a, true, 88189, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return Environment.getExternalStorageState().equals("mounted");
    }

    static String d() {
        BufferedReader bufferedReader;
        if (PatchProxy.isSupport(new Object[0], null, f75549a, true, 88190, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f75549a, true, 88190, new Class[0], String.class);
        }
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else if (readLine.contains(":")) {
                        String[] split = readLine.split(":");
                        if (split[0].contains("Hardware")) {
                            String str = split[1];
                            a((Closeable) bufferedReader);
                            return str;
                        }
                    }
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th = th;
                    a((Closeable) bufferedReader);
                    throw th;
                }
            }
        } catch (IOException unused2) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            a((Closeable) bufferedReader);
            throw th;
        }
        a((Closeable) bufferedReader);
        return null;
    }

    public static boolean f() {
        if (PatchProxy.isSupport(new Object[0], null, f75549a, true, 88203, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f75549a, true, 88203, new Class[0], Boolean.TYPE)).booleanValue();
        }
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        try {
            if (new File("/system/app/Superuser.apk").exists()) {
                return true;
            }
        } catch (Exception unused) {
        }
        if (d("/system/xbin/which su") || d("/system/bin/which su") || d("which su") || d("busybox which su")) {
            return true;
        }
        return false;
    }

    private static int g() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, f75549a, true, 88198, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f75549a, true, 88198, new Class[0], Integer.TYPE)).intValue();
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/" + Process.myPid() + "/status");
            try {
                i = a("VmPeak", fileInputStream2);
                a((Closeable) fileInputStream2);
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                a((Closeable) fileInputStream);
                i = -1;
                return i;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                a((Closeable) fileInputStream);
                throw th;
            }
        } catch (Exception unused2) {
            a((Closeable) fileInputStream);
            i = -1;
            return i;
        } catch (Throwable th2) {
            th = th2;
            a((Closeable) fileInputStream);
            throw th;
        }
        return i;
    }

    private static int h() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, f75549a, true, 88199, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f75549a, true, 88199, new Class[0], Integer.TYPE)).intValue();
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/" + Process.myPid() + "/status");
            try {
                i = a("VmSize", fileInputStream2);
                a((Closeable) fileInputStream2);
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                a((Closeable) fileInputStream);
                i = -1;
                return i;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                a((Closeable) fileInputStream);
                throw th;
            }
        } catch (Exception unused2) {
            a((Closeable) fileInputStream);
            i = -1;
            return i;
        } catch (Throwable th2) {
            th = th2;
            a((Closeable) fileInputStream);
            throw th;
        }
        return i;
    }

    private static int i() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, f75549a, true, 88201, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f75549a, true, 88201, new Class[0], Integer.TYPE)).intValue();
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/" + Process.myPid() + "/status");
            try {
                i = a("Threads", fileInputStream2);
                a((Closeable) fileInputStream2);
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                a((Closeable) fileInputStream);
                i = -1;
                return i;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                a((Closeable) fileInputStream);
                throw th;
            }
        } catch (Exception unused2) {
            a((Closeable) fileInputStream);
            i = -1;
            return i;
        } catch (Throwable th2) {
            th = th2;
            a((Closeable) fileInputStream);
            throw th;
        }
        return i;
    }

    private static int j() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, f75549a, true, 88202, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f75549a, true, 88202, new Class[0], Integer.TYPE)).intValue();
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/" + Process.myPid() + "/limits");
            try {
                i = a("Max open files", fileInputStream2);
                a((Closeable) fileInputStream2);
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                a((Closeable) fileInputStream);
                i = -1;
                return i;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                a((Closeable) fileInputStream);
                throw th;
            }
        } catch (Exception unused2) {
            a((Closeable) fileInputStream);
            i = -1;
            return i;
        } catch (Throwable th2) {
            th = th2;
            a((Closeable) fileInputStream);
            throw th;
        }
        return i;
    }

    public static int a() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, f75549a, true, 88172, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f75549a, true, 88172, new Class[0], Integer.TYPE)).intValue();
        }
        if (Build.VERSION.SDK_INT <= 10) {
            return 1;
        }
        int i2 = -1;
        try {
            int c2 = c("/sys/devices/system/cpu/possible");
            if (c2 == -1) {
                c2 = c("/sys/devices/system/cpu/present");
            }
            if (c2 == -1) {
                if (PatchProxy.isSupport(new Object[0], null, f75549a, true, 88175, new Class[0], Integer.TYPE)) {
                    i = ((Integer) PatchProxy.accessDispatch(new Object[0], null, f75549a, true, 88175, new Class[0], Integer.TYPE)).intValue();
                } else {
                    i = new File("/sys/devices/system/cpu/").listFiles(f75550b).length;
                }
                i2 = i;
            } else {
                i2 = c2;
            }
        } catch (NullPointerException | SecurityException unused) {
        }
        return i2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0085 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b() {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f75549a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Integer.TYPE
            r2 = 0
            r4 = 1
            r5 = 88176(0x15870, float:1.23561E-40)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f75549a
            r5 = 1
            r6 = 88176(0x15870, float:1.23561E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Integer.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x002c:
            r1 = -1
            r2 = 0
            r3 = -1
        L_0x002f:
            int r4 = a()     // Catch:{ IOException -> 0x00ae }
            if (r2 >= r4) goto L_0x0091
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ae }
            java.lang.String r5 = "/sys/devices/system/cpu/cpu"
            r4.<init>(r5)     // Catch:{ IOException -> 0x00ae }
            r4.append(r2)     // Catch:{ IOException -> 0x00ae }
            java.lang.String r5 = "/cpufreq/cpuinfo_max_freq"
            r4.append(r5)     // Catch:{ IOException -> 0x00ae }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x00ae }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x00ae }
            r5.<init>(r4)     // Catch:{ IOException -> 0x00ae }
            boolean r4 = r5.exists()     // Catch:{ IOException -> 0x00ae }
            if (r4 == 0) goto L_0x008e
            r4 = 128(0x80, float:1.794E-43)
            byte[] r6 = new byte[r4]     // Catch:{ IOException -> 0x00ae }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00ae }
            r7.<init>(r5)     // Catch:{ IOException -> 0x00ae }
            r7.read(r6)     // Catch:{ NumberFormatException -> 0x0085, all -> 0x0089 }
            r5 = 0
        L_0x0060:
            byte r8 = r6[r5]     // Catch:{ NumberFormatException -> 0x0085, all -> 0x0089 }
            boolean r8 = java.lang.Character.isDigit(r8)     // Catch:{ NumberFormatException -> 0x0085, all -> 0x0089 }
            if (r8 == 0) goto L_0x006d
            if (r5 >= r4) goto L_0x006d
            int r5 = r5 + 1
            goto L_0x0060
        L_0x006d:
            java.lang.String r4 = new java.lang.String     // Catch:{ NumberFormatException -> 0x0085, all -> 0x0089 }
            r4.<init>(r6, r0, r5)     // Catch:{ NumberFormatException -> 0x0085, all -> 0x0089 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x0085, all -> 0x0089 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0085, all -> 0x0089 }
            int r5 = r4.intValue()     // Catch:{ NumberFormatException -> 0x0085, all -> 0x0089 }
            if (r5 <= r3) goto L_0x0085
            int r4 = r4.intValue()     // Catch:{ NumberFormatException -> 0x0085, all -> 0x0089 }
            r3 = r4
        L_0x0085:
            r7.close()     // Catch:{ IOException -> 0x00ae }
            goto L_0x008e
        L_0x0089:
            r2 = move-exception
            r7.close()     // Catch:{ IOException -> 0x00ae }
            throw r2     // Catch:{ IOException -> 0x00ae }
        L_0x008e:
            int r2 = r2 + 1
            goto L_0x002f
        L_0x0091:
            if (r3 != r1) goto L_0x00af
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00ae }
            java.lang.String r4 = "/proc/cpuinfo"
            r2.<init>(r4)     // Catch:{ IOException -> 0x00ae }
            java.lang.String r4 = "cpu MHz"
            int r4 = a(r4, r2)     // Catch:{ all -> 0x00a9 }
            int r4 = r4 * 1000
            if (r4 <= r3) goto L_0x00a5
            r3 = r4
        L_0x00a5:
            r2.close()     // Catch:{ IOException -> 0x00ae }
            goto L_0x00af
        L_0x00a9:
            r3 = move-exception
            r2.close()     // Catch:{ IOException -> 0x00ae }
            throw r3     // Catch:{ IOException -> 0x00ae }
        L_0x00ae:
            r3 = -1
        L_0x00af:
            java.lang.String r1 = java.lang.String.valueOf(r3)
            int r1 = r1.length()
            r2 = 6
            if (r1 < r2) goto L_0x00bb
            r0 = 1
        L_0x00bb:
            if (r0 == 0) goto L_0x00bf
            int r3 = r3 / 1000
        L_0x00bf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.ay.b():int");
    }

    public static f e() {
        if (PatchProxy.isSupport(new Object[0], null, f75549a, true, 88197, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], null, f75549a, true, 88197, new Class[0], f.class);
        }
        f fVar = new f();
        try {
            fVar.f75569a = (long) g();
            fVar.f75570b = (long) h();
            int i = -1;
            if (PatchProxy.isSupport(new Object[0], null, f75549a, true, 88200, new Class[0], Integer.TYPE)) {
                i = ((Integer) PatchProxy.accessDispatch(new Object[0], null, f75549a, true, 88200, new Class[0], Integer.TYPE)).intValue();
            } else {
                File file = new File("/proc/" + Process.myPid() + "/fd");
                if (file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        i = listFiles.length;
                    }
                }
            }
            fVar.f75572d = (long) i;
            fVar.f75573e = i();
            fVar.f75571c = (long) j();
            return fVar;
        } catch (Exception unused) {
            return null;
        }
    }

    private static void a(Closeable closeable) {
        if (PatchProxy.isSupport(new Object[]{closeable}, null, f75549a, true, 88191, new Class[]{Closeable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{closeable}, null, f75549a, true, 88191, new Class[]{Closeable.class}, Void.TYPE);
            return;
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    private static long a(File file) {
        long j;
        if (PatchProxy.isSupport(new Object[]{file}, null, f75549a, true, 88188, new Class[]{File.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{file}, null, f75549a, true, 88188, new Class[]{File.class}, Long.TYPE)).longValue();
        }
        File[] listFiles = file.listFiles();
        long j2 = 0;
        if (listFiles == null) {
            return 0;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                j = a(file2);
            } else {
                j = file2.length();
            }
            j2 += j;
        }
        return j2;
    }

    static long b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f75549a, true, 88187, new Class[]{String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{str2}, null, f75549a, true, 88187, new Class[]{String.class}, Long.TYPE)).longValue();
        }
        try {
            StatFs statFs = new StatFs(str2);
            if (Build.VERSION.SDK_INT >= 18) {
                return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
            }
            return ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ae A[SYNTHETIC, Splitter:B:27:0x00ae] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b4 A[SYNTHETIC, Splitter:B:33:0x00b4] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int c(java.lang.String r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f75549a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Integer.TYPE
            r3 = 0
            r5 = 1
            r6 = 88173(0x1586d, float:1.23557E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f75549a
            r13 = 1
            r14 = 88173(0x1586d, float:1.23557E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Integer.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x003b:
            r2 = 0
            r3 = -1
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00b2, all -> 0x00aa }
            r4.<init>(r0)     // Catch:{ IOException -> 0x00b2, all -> 0x00aa }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            java.lang.String r0 = r0.readLine()     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            r10[r9] = r0     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f75549a     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            r13 = 1
            r14 = 88174(0x1586e, float:1.23558E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r15[r9] = r2     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            java.lang.Class r16 = java.lang.Integer.TYPE     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            if (r2 == 0) goto L_0x0088
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            r10[r9] = r0     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f75549a     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            r13 = 1
            r14 = 88174(0x1586e, float:1.23558E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            java.lang.Class r16 = java.lang.Integer.TYPE     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            int r0 = r0.intValue()     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            r3 = r0
            goto L_0x00a2
        L_0x0088:
            if (r0 == 0) goto L_0x00a2
            java.lang.String r2 = "0-[\\d]+$"
            boolean r2 = r0.matches(r2)     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            if (r2 != 0) goto L_0x0093
            goto L_0x00a2
        L_0x0093:
            r2 = 2
            java.lang.String r0 = r0.substring(r2)     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            int r0 = r0.intValue()     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            int r3 = r0 + 1
        L_0x00a2:
            r4.close()     // Catch:{ IOException -> 0x00a5 }
        L_0x00a5:
            return r3
        L_0x00a6:
            r0 = move-exception
            goto L_0x00ac
        L_0x00a8:
            r2 = r4
            goto L_0x00b2
        L_0x00aa:
            r0 = move-exception
            r4 = r2
        L_0x00ac:
            if (r4 == 0) goto L_0x00b1
            r4.close()     // Catch:{ IOException -> 0x00b1 }
        L_0x00b1:
            throw r0
        L_0x00b2:
            if (r2 == 0) goto L_0x00b7
            r2.close()     // Catch:{ IOException -> 0x00b7 }
        L_0x00b7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.ay.c(java.lang.String):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean d(java.lang.String r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f75549a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = 0
            r5 = 1
            r6 = 88204(0x1588c, float:1.236E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f75549a
            r13 = 1
            r14 = 88204(0x1588c, float:1.236E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003b:
            r2 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x006c, all -> 0x0064 }
            java.lang.Process r3 = r3.exec(r0)     // Catch:{ Exception -> 0x006c, all -> 0x0064 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0062, all -> 0x0060 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0062, all -> 0x0060 }
            java.io.InputStream r4 = r3.getInputStream()     // Catch:{ Exception -> 0x0062, all -> 0x0060 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x0062, all -> 0x0060 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0062, all -> 0x0060 }
            java.lang.String r0 = r0.readLine()     // Catch:{ Exception -> 0x0062, all -> 0x0060 }
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            if (r3 == 0) goto L_0x005f
            r3.destroy()
        L_0x005f:
            return r1
        L_0x0060:
            r0 = move-exception
            goto L_0x0066
        L_0x0062:
            r2 = r3
            goto L_0x006c
        L_0x0064:
            r0 = move-exception
            r3 = r2
        L_0x0066:
            if (r3 == 0) goto L_0x006b
            r3.destroy()
        L_0x006b:
            throw r0
        L_0x006c:
            if (r2 == 0) goto L_0x0071
            r2.destroy()
        L_0x0071:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.ay.d(java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005d  */
    @android.annotation.TargetApi(16)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long b(android.content.Context r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f75549a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Long.TYPE
            r3 = 0
            r5 = 1
            r6 = 88178(0x15872, float:1.23564E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f75549a
            r13 = 1
            r14 = 88178(0x15872, float:1.23564E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Long.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L_0x003b:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            r3 = -1
            if (r1 < r2) goto L_0x0058
            android.app.ActivityManager$MemoryInfo r1 = new android.app.ActivityManager$MemoryInfo
            r1.<init>()
            java.lang.String r2 = "activity"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            if (r0 == 0) goto L_0x0058
            r0.getMemoryInfo(r1)
            long r0 = r1.availMem
            goto L_0x0059
        L_0x0058:
            r0 = r3
        L_0x0059:
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0081
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x007e, all -> 0x0079 }
            java.lang.String r4 = "/proc/meminfo"
            r3.<init>(r4)     // Catch:{ Exception -> 0x007e, all -> 0x0079 }
            java.lang.String r2 = "MemAvailable"
            int r2 = a(r2, r3)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            long r0 = (long) r2
            r4 = 1024(0x400, double:5.06E-321)
            long r0 = r0 * r4
            a((java.io.Closeable) r3)
            goto L_0x0081
        L_0x0074:
            r0 = move-exception
            r2 = r3
            goto L_0x007a
        L_0x0077:
            r2 = r3
            goto L_0x007e
        L_0x0079:
            r0 = move-exception
        L_0x007a:
            a((java.io.Closeable) r2)
            throw r0
        L_0x007e:
            a((java.io.Closeable) r2)
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.ay.b(android.content.Context):long");
    }

    public static long c(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f75549a, true, 88185, new Class[]{Context.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{context}, null, f75549a, true, 88185, new Class[]{Context.class}, Long.TYPE)).longValue();
        } else if (context == null) {
            return -1;
        } else {
            try {
                String packageName = context.getPackageName();
                if (TextUtils.isEmpty(packageName)) {
                    return -1;
                }
                File file = new File("/data/data/" + packageName);
                if (!file.exists()) {
                    return -1;
                }
                long a2 = a(file);
                File file2 = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + packageName);
                long j = 0;
                if (file2.exists()) {
                    j = a(file2);
                }
                return a2 + j;
            } catch (Throwable unused) {
                return -1;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005d  */
    @android.annotation.TargetApi(16)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long a(android.content.Context r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f75549a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Long.TYPE
            r3 = 0
            r5 = 1
            r6 = 88177(0x15871, float:1.23562E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f75549a
            r13 = 1
            r14 = 88177(0x15871, float:1.23562E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Long.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L_0x003b:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            r3 = -1
            if (r1 < r2) goto L_0x0058
            android.app.ActivityManager$MemoryInfo r1 = new android.app.ActivityManager$MemoryInfo
            r1.<init>()
            java.lang.String r2 = "activity"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            if (r0 == 0) goto L_0x0058
            r0.getMemoryInfo(r1)
            long r0 = r1.totalMem
            goto L_0x0059
        L_0x0058:
            r0 = r3
        L_0x0059:
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0081
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x007e, all -> 0x0079 }
            java.lang.String r4 = "/proc/meminfo"
            r3.<init>(r4)     // Catch:{ Exception -> 0x007e, all -> 0x0079 }
            java.lang.String r2 = "MemTotal"
            int r2 = a(r2, r3)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            long r0 = (long) r2
            r4 = 1024(0x400, double:5.06E-321)
            long r0 = r0 * r4
            a((java.io.Closeable) r3)
            goto L_0x0081
        L_0x0074:
            r0 = move-exception
            r2 = r3
            goto L_0x007a
        L_0x0077:
            r2 = r3
            goto L_0x007e
        L_0x0079:
            r0 = move-exception
        L_0x007a:
            a((java.io.Closeable) r2)
            throw r0
        L_0x007e:
            a((java.io.Closeable) r2)
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.ay.a(android.content.Context):long");
    }

    static long a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f75549a, true, 88186, new Class[]{String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{str2}, null, f75549a, true, 88186, new Class[]{String.class}, Long.TYPE)).longValue();
        }
        try {
            StatFs statFs = new StatFs(str2);
            if (Build.VERSION.SDK_INT >= 18) {
                return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
            }
            return ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    private static int a(String str, FileInputStream fileInputStream) {
        String str2 = str;
        FileInputStream fileInputStream2 = fileInputStream;
        if (PatchProxy.isSupport(new Object[]{str2, fileInputStream2}, null, f75549a, true, 88179, new Class[]{String.class, FileInputStream.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, fileInputStream2}, null, f75549a, true, 88179, new Class[]{String.class, FileInputStream.class}, Integer.TYPE)).intValue();
        }
        byte[] bArr = new byte[1024];
        try {
            int read = fileInputStream2.read(bArr);
            int i = 0;
            while (i < read) {
                if (bArr[i] == 10 || i == 0) {
                    if (bArr[i] == 10) {
                        i++;
                    }
                    int i2 = i;
                    while (i2 < read) {
                        int i3 = i2 - i;
                        if (bArr[i2] != str2.charAt(i3)) {
                            continue;
                            break;
                        } else if (i3 == str.length() - 1) {
                            if (PatchProxy.isSupport(new Object[]{bArr, Integer.valueOf(i2)}, null, f75549a, true, 88180, new Class[]{byte[].class, Integer.TYPE}, Integer.TYPE)) {
                                return ((Integer) PatchProxy.accessDispatch(new Object[]{bArr, Integer.valueOf(i2)}, null, f75549a, true, 88180, new Class[]{byte[].class, Integer.TYPE}, Integer.TYPE)).intValue();
                            }
                            while (i2 < 1024 && bArr[i2] != 10) {
                                if (Character.isDigit(bArr[i2])) {
                                    int i4 = i2 + 1;
                                    while (i4 < 1024 && Character.isDigit(bArr[i4])) {
                                        i4++;
                                    }
                                    return Integer.parseInt(new String(bArr, 0, i2, i4 - i2));
                                }
                                i2++;
                            }
                            return -1;
                        } else {
                            i2++;
                        }
                    }
                    continue;
                }
                i++;
            }
        } catch (IOException | NumberFormatException unused) {
        }
        return -1;
    }
}
