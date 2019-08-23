package com.ss.android.ttve.monitor;

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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Pattern;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static String f31244a;

    public static int c() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new FileFilter() {
                public final boolean accept(File file) {
                    return Pattern.matches("cpu[0-9]", file.getName());
                }
            }).length;
        } catch (Exception unused) {
            return 1;
        }
    }

    public static long e() {
        String str;
        try {
            str = Environment.getExternalStorageDirectory().getAbsolutePath();
        } catch (Exception unused) {
            str = "/sdcard";
        }
        try {
            StatFs statFs = new StatFs(str);
            if (Build.VERSION.SDK_INT >= 18) {
                return (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 1048576;
            }
            return (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 1048576;
        } catch (Exception unused2) {
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (r1 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (r1 != null) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049 A[SYNTHETIC, Splitter:B:16:0x0049] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b() {
        /*
            java.lang.String r0 = ""
            r1 = 2
            r2 = 0
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ IOException -> 0x004d, all -> 0x0045 }
            r3 = 0
            java.lang.String r4 = "/system/bin/cat"
            r1[r3] = r4     // Catch:{ IOException -> 0x004d, all -> 0x0045 }
            r3 = 1
            java.lang.String r4 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"
            r1[r3] = r4     // Catch:{ IOException -> 0x004d, all -> 0x0045 }
            java.lang.ProcessBuilder r3 = new java.lang.ProcessBuilder     // Catch:{ IOException -> 0x004d, all -> 0x0045 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x004d, all -> 0x0045 }
            java.lang.Process r1 = r3.start()     // Catch:{ IOException -> 0x004d, all -> 0x0045 }
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x004d, all -> 0x0045 }
            r2 = 24
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
        L_0x0021:
            int r3 = r1.read(r2)     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
            r4 = -1
            if (r3 == r4) goto L_0x003d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
            r3.<init>()     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
            r3.append(r0)     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
            r3.append(r0)     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
            java.lang.String r0 = r3.toString()     // Catch:{ IOException -> 0x004e, all -> 0x0043 }
            goto L_0x0021
        L_0x003d:
            if (r1 == 0) goto L_0x0053
        L_0x003f:
            r1.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0053
        L_0x0043:
            r0 = move-exception
            goto L_0x0047
        L_0x0045:
            r0 = move-exception
            r1 = r2
        L_0x0047:
            if (r1 == 0) goto L_0x004c
            r1.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            throw r0
        L_0x004d:
            r1 = r2
        L_0x004e:
            java.lang.String r0 = "0"
            if (r1 == 0) goto L_0x0053
            goto L_0x003f
        L_0x0053:
            java.lang.String r0 = r0.trim()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.monitor.b.b():java.lang.String");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0028 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b A[SYNTHETIC, Splitter:B:20:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0040 A[SYNTHETIC, Splitter:B:24:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0047 A[SYNTHETIC, Splitter:B:32:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x004c A[SYNTHETIC, Splitter:B:36:0x004c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long d() {
        /*
            java.lang.String r0 = "/proc/meminfo"
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ IOException -> 0x0044, all -> 0x0035 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0044, all -> 0x0035 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0045, all -> 0x0030 }
            r3 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r2, r3)     // Catch:{ IOException -> 0x0045, all -> 0x0030 }
            java.lang.String r1 = r0.readLine()     // Catch:{ IOException -> 0x002e, all -> 0x002c }
            java.lang.String r3 = "\\s+"
            java.lang.String[] r1 = r1.split(r3)     // Catch:{ IOException -> 0x002e, all -> 0x002c }
            r3 = 1
            r1 = r1[r3]     // Catch:{ IOException -> 0x002e, all -> 0x002c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x002e, all -> 0x002c }
            int r1 = r1.intValue()     // Catch:{ IOException -> 0x002e, all -> 0x002c }
            long r3 = (long) r1
            r0.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            r2.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0051
        L_0x002c:
            r1 = move-exception
            goto L_0x0039
        L_0x002e:
            r1 = r0
            goto L_0x0045
        L_0x0030:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x0039
        L_0x0035:
            r0 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
        L_0x0039:
            if (r0 == 0) goto L_0x003e
            r0.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            if (r2 == 0) goto L_0x0043
            r2.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            throw r1
        L_0x0044:
            r2 = r1
        L_0x0045:
            if (r1 == 0) goto L_0x004a
            r1.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            if (r2 == 0) goto L_0x004f
            r2.close()     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            r3 = 0
        L_0x0051:
            r0 = 1024(0x400, double:5.06E-321)
            long r3 = r3 / r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.monitor.b.d():long");
    }

    @SuppressLint({"infer"})
    public static String a() {
        BufferedReader bufferedReader;
        FileReader fileReader;
        Throwable th;
        if (!TextUtils.isEmpty(f31244a)) {
            return f31244a;
        }
        try {
            fileReader = new FileReader("/proc/cpuinfo");
            try {
                bufferedReader = new BufferedReader(fileReader);
            } catch (IOException unused) {
                bufferedReader = null;
                a((Reader) bufferedReader);
                a((Reader) fileReader);
                return null;
            } catch (Throwable th2) {
                Throwable th3 = th2;
                bufferedReader = null;
                th = th3;
                a((Reader) bufferedReader);
                a((Reader) fileReader);
                throw th;
            }
            try {
                String readLine = bufferedReader.readLine();
                while (true) {
                    if (readLine == null) {
                        break;
                    }
                    if (readLine.startsWith("Hardware") && readLine.contains(":")) {
                        String substring = readLine.substring(readLine.indexOf(":") + 1);
                        if (!TextUtils.isEmpty(substring)) {
                            f31244a = substring.trim();
                            break;
                        }
                    }
                    readLine = bufferedReader.readLine();
                }
                if (TextUtils.isEmpty(f31244a)) {
                    f31244a = a("ro.board.platform");
                }
                String str = f31244a;
                a((Reader) bufferedReader);
                a((Reader) fileReader);
                return str;
            } catch (IOException unused2) {
                a((Reader) bufferedReader);
                a((Reader) fileReader);
                return null;
            } catch (Throwable th4) {
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

    private static void a(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String b(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        } catch (Exception unused) {
            return "";
        }
    }

    public static int a(Context context) {
        int i = 0;
        if (context == null) {
            return 0;
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
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

    private static String a(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class, String.class}).invoke(cls, new Object[]{str, "unknown"});
        } catch (Exception unused) {
            return "unknown";
        }
    }
}
