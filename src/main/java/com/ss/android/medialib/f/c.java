package com.ss.android.medialib.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.vesdk.y;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Pattern;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29661a;

    /* renamed from: b  reason: collision with root package name */
    private static String f29662b;

    public static int c() {
        if (PatchProxy.isSupport(new Object[0], null, f29661a, true, 17800, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f29661a, true, 17800, new Class[0], Integer.TYPE)).intValue();
        }
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new FileFilter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29663a;

                public final boolean accept(File file) {
                    if (!PatchProxy.isSupport(new Object[]{file}, this, f29663a, false, 17810, new Class[]{File.class}, Boolean.TYPE)) {
                        return Pattern.matches("cpu[0-9]", file.getName());
                    }
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{file}, this, f29663a, false, 17810, new Class[]{File.class}, Boolean.TYPE)).booleanValue();
                }
            }).length;
        } catch (Exception unused) {
            return 1;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:4|5|6|7|8|9|10|11|12|13|14|15|40|42) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0073, code lost:
        if (r4 == null) goto L_0x0076;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0054 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064 A[SYNTHETIC, Splitter:B:24:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0069 A[SYNTHETIC, Splitter:B:28:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070 A[SYNTHETIC, Splitter:B:36:0x0070] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long d() {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f29661a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Long.TYPE
            r2 = 0
            r4 = 1
            r5 = 17801(0x4589, float:2.4945E-41)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002a
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f29661a
            r5 = 1
            r6 = 17801(0x4589, float:2.4945E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Long.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L_0x002a:
            java.lang.String r0 = "/proc/meminfo"
            r1 = 0
            r3 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ IOException -> 0x006d, all -> 0x005f }
            r4.<init>(r0)     // Catch:{ IOException -> 0x006d, all -> 0x005f }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ IOException -> 0x006e, all -> 0x005c }
            r5 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r4, r5)     // Catch:{ IOException -> 0x006e, all -> 0x005c }
            java.lang.String r3 = r0.readLine()     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            java.lang.String r5 = "\\s+"
            java.lang.String[] r3 = r3.split(r5)     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            r5 = 1
            r3 = r3[r5]     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            int r3 = r3.intValue()     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            long r1 = (long) r3
            r0.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            r4.close()     // Catch:{ IOException -> 0x0076 }
            goto L_0x0076
        L_0x0058:
            r1 = move-exception
            goto L_0x0062
        L_0x005a:
            r3 = r0
            goto L_0x006e
        L_0x005c:
            r1 = move-exception
            r0 = r3
            goto L_0x0062
        L_0x005f:
            r1 = move-exception
            r0 = r3
            r4 = r0
        L_0x0062:
            if (r0 == 0) goto L_0x0067
            r0.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            if (r4 == 0) goto L_0x006c
            r4.close()     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            throw r1
        L_0x006d:
            r4 = r3
        L_0x006e:
            if (r3 == 0) goto L_0x0073
            r3.close()     // Catch:{ IOException -> 0x0073 }
        L_0x0073:
            if (r4 == 0) goto L_0x0076
            goto L_0x0054
        L_0x0076:
            r3 = 1024(0x400, double:5.06E-321)
            long r1 = r1 / r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.f.c.d():long");
    }

    @SuppressLint({"infer"})
    public static String a() {
        BufferedReader bufferedReader;
        FileReader fileReader;
        Throwable th;
        if (PatchProxy.isSupport(new Object[0], null, f29661a, true, 17798, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f29661a, true, 17798, new Class[0], String.class);
        }
        if (!TextUtils.isEmpty(f29662b)) {
            return f29662b;
        }
        try {
            fileReader = new FileReader("/proc/cpuinfo");
            try {
                bufferedReader = new BufferedReader(fileReader);
                try {
                    String readLine = bufferedReader.readLine();
                    while (true) {
                        if (readLine == null) {
                            break;
                        }
                        if (readLine.startsWith("Hardware") && readLine.contains(":")) {
                            String substring = readLine.substring(readLine.indexOf(":") + 1);
                            if (!TextUtils.isEmpty(substring)) {
                                f29662b = substring.trim();
                                break;
                            }
                        }
                        readLine = bufferedReader.readLine();
                    }
                    String str = f29662b;
                    a((Reader) bufferedReader);
                    a((Reader) fileReader);
                    return str;
                } catch (IOException unused) {
                    a((Reader) bufferedReader);
                    a((Reader) fileReader);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    a((Reader) bufferedReader);
                    a((Reader) fileReader);
                    throw th;
                }
            } catch (IOException unused2) {
                bufferedReader = null;
                a((Reader) bufferedReader);
                a((Reader) fileReader);
                return null;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                bufferedReader = null;
                th = th4;
                a((Reader) bufferedReader);
                a((Reader) fileReader);
                throw th;
            }
        } catch (IOException unused3) {
            fileReader = null;
            bufferedReader = null;
            a((Reader) bufferedReader);
            a((Reader) fileReader);
            return null;
        } catch (Throwable th5) {
            bufferedReader = null;
            th = th5;
            fileReader = null;
            a((Reader) bufferedReader);
            a((Reader) fileReader);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0062, code lost:
        if (r0 != null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0075, code lost:
        if (r0 != null) goto L_0x0064;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e A[SYNTHETIC, Splitter:B:20:0x006e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b() {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f29661a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2 = 0
            r4 = 1
            r5 = 17799(0x4587, float:2.4942E-41)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f29661a
            r5 = 1
            r6 = 17799(0x4587, float:2.4942E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0026:
            java.lang.String r1 = ""
            r2 = 0
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ IOException -> 0x0072, all -> 0x006a }
            java.lang.String r4 = "/system/bin/cat"
            r3[r0] = r4     // Catch:{ IOException -> 0x0072, all -> 0x006a }
            r0 = 1
            java.lang.String r4 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"
            r3[r0] = r4     // Catch:{ IOException -> 0x0072, all -> 0x006a }
            java.lang.ProcessBuilder r0 = new java.lang.ProcessBuilder     // Catch:{ IOException -> 0x0072, all -> 0x006a }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0072, all -> 0x006a }
            java.lang.Process r0 = r0.start()     // Catch:{ IOException -> 0x0072, all -> 0x006a }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0072, all -> 0x006a }
            r2 = 24
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x0073, all -> 0x0068 }
        L_0x0046:
            int r3 = r0.read(r2)     // Catch:{ IOException -> 0x0073, all -> 0x0068 }
            r4 = -1
            if (r3 == r4) goto L_0x0062
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0073, all -> 0x0068 }
            r3.<init>()     // Catch:{ IOException -> 0x0073, all -> 0x0068 }
            r3.append(r1)     // Catch:{ IOException -> 0x0073, all -> 0x0068 }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0073, all -> 0x0068 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0073, all -> 0x0068 }
            r3.append(r1)     // Catch:{ IOException -> 0x0073, all -> 0x0068 }
            java.lang.String r1 = r3.toString()     // Catch:{ IOException -> 0x0073, all -> 0x0068 }
            goto L_0x0046
        L_0x0062:
            if (r0 == 0) goto L_0x0078
        L_0x0064:
            r0.close()     // Catch:{ IOException -> 0x0078 }
            goto L_0x0078
        L_0x0068:
            r1 = move-exception
            goto L_0x006c
        L_0x006a:
            r1 = move-exception
            r0 = r2
        L_0x006c:
            if (r0 == 0) goto L_0x0071
            r0.close()     // Catch:{ IOException -> 0x0071 }
        L_0x0071:
            throw r1
        L_0x0072:
            r0 = r2
        L_0x0073:
            java.lang.String r1 = "N/A"
            if (r0 == 0) goto L_0x0078
            goto L_0x0064
        L_0x0078:
            java.lang.String r0 = r1.trim()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.f.c.b():java.lang.String");
    }

    private static void a(Reader reader) {
        if (PatchProxy.isSupport(new Object[]{reader}, null, f29661a, true, 17804, new Class[]{Reader.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{reader}, null, f29661a, true, 17804, new Class[]{Reader.class}, Void.TYPE);
            return;
        }
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long a(Context context) {
        String str;
        long j;
        if (PatchProxy.isSupport(new Object[]{context}, null, f29661a, true, 17803, new Class[]{Context.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{context}, null, f29661a, true, 17803, new Class[]{Context.class}, Long.TYPE)).longValue();
        }
        try {
            str = Environment.getExternalStorageDirectory().getAbsolutePath();
        } catch (Exception unused) {
            str = "/sdcard";
        }
        try {
            StatFs statFs = new StatFs(str);
            if (Build.VERSION.SDK_INT >= 18) {
                j = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 1048576;
            } else {
                j = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 1048576;
            }
        } catch (Exception unused2) {
            j = -1;
        }
        return j;
    }

    public static int b(Context context) {
        Context context2 = context;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f29661a, true, 17807, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, null, f29661a, true, 17807, new Class[]{Context.class}, Integer.TYPE)).intValue();
        } else if (context2 == null) {
            return 0;
        } else {
            Display defaultDisplay = ((WindowManager) context2.getSystemService("window")).getDefaultDisplay();
            if (Build.VERSION.SDK_INT >= 17) {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                i = point.y;
            } else {
                try {
                    i = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
            return i;
        }
    }

    public static String c(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f29661a, true, 17808, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, f29661a, true, 17808, new Class[]{Context.class}, String.class);
        }
        try {
            return ((TelephonyManager) context2.getSystemService("phone")).getSimOperator();
        } catch (Exception unused) {
            y.c("DeviceInfoUtils", "No permission");
            return "";
        }
    }
}
