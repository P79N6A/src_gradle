package com.tencent.bugly.crashreport.common.info;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static String f79280a;

    /* renamed from: b  reason: collision with root package name */
    private static String f79281b;

    public static String a() {
        try {
            return Build.MODEL;
        } catch (Throwable th) {
            x.a(th);
            return "fail";
        }
    }

    public static String b() {
        try {
            return Build.VERSION.RELEASE;
        } catch (Throwable th) {
            x.a(th);
            return "fail";
        }
    }

    public static int c() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Throwable th) {
            x.a(th);
            return -1;
        }
    }

    public static String d() {
        try {
            return Build.SERIAL;
        } catch (Throwable unused) {
            x.a("Failed to get hardware serial number.", new Object[0]);
            return "fail";
        }
    }

    public static String l() {
        try {
            return Build.BRAND;
        } catch (Throwable th) {
            x.a(th);
            return "fail";
        }
    }

    public static String k() {
        try {
            return Locale.getDefault().getCountry();
        } catch (Throwable th) {
            x.a(th);
            return "fail";
        }
    }

    private static boolean p() {
        try {
            if (Environment.getExternalStorageState().equals("mounted")) {
                return true;
            }
        } catch (Throwable th) {
            x.a(th);
        }
        return false;
    }

    public static long e() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable th) {
            x.a(th);
            return -1;
        }
    }

    public static long f() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable th) {
            x.a(th);
            return -1;
        }
    }

    public static long i() {
        if (!p()) {
            return 0;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable th) {
            x.a(th);
            return -2;
        }
    }

    public static long j() {
        if (!p()) {
            return 0;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable th) {
            x.a(th);
            return -2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042 A[SYNTHETIC, Splitter:B:20:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a A[SYNTHETIC, Splitter:B:26:0x004a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long o() {
        /*
            r0 = 0
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0039, all -> 0x0036 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Throwable -> 0x0039, all -> 0x0036 }
            java.lang.String r4 = "/proc/uptime"
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0039, all -> 0x0036 }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x0039, all -> 0x0036 }
            java.lang.String r1 = r2.readLine()     // Catch:{ Throwable -> 0x0034 }
            if (r1 == 0) goto L_0x002b
            java.lang.String r3 = " "
            java.lang.String[] r1 = r1.split(r3)     // Catch:{ Throwable -> 0x0034 }
            r3 = 0
            r1 = r1[r3]     // Catch:{ Throwable -> 0x0034 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0034 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            float r3 = (float) r3     // Catch:{ Throwable -> 0x0034 }
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ Throwable -> 0x0034 }
            float r3 = r3 - r1
            r0 = r3
        L_0x002b:
            r2.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0045
        L_0x002f:
            r1 = move-exception
            com.tencent.bugly.proguard.x.a(r1)
            goto L_0x0045
        L_0x0034:
            r1 = move-exception
            goto L_0x003d
        L_0x0036:
            r0 = move-exception
            r2 = r1
            goto L_0x0048
        L_0x0039:
            r2 = move-exception
            r7 = r2
            r2 = r1
            r1 = r7
        L_0x003d:
            com.tencent.bugly.proguard.x.a(r1)     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x0045
            r2.close()     // Catch:{ IOException -> 0x002f }
        L_0x0045:
            long r0 = (long) r0
            return r0
        L_0x0047:
            r0 = move-exception
        L_0x0048:
            if (r2 == 0) goto L_0x0052
            r2.close()     // Catch:{ IOException -> 0x004e }
            goto L_0x0052
        L_0x004e:
            r1 = move-exception
            com.tencent.bugly.proguard.x.a(r1)
        L_0x0052:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.common.info.b.o():long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0074 A[SYNTHETIC, Splitter:B:43:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x007e A[SYNTHETIC, Splitter:B:48:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x008c A[SYNTHETIC, Splitter:B:56:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0096 A[SYNTHETIC, Splitter:B:61:0x0096] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long g() {
        /*
            java.lang.String r0 = "/proc/meminfo"
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ Throwable -> 0x006b, all -> 0x0066 }
            r2.<init>(r0)     // Catch:{ Throwable -> 0x006b, all -> 0x0066 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0061, all -> 0x005c }
            r3 = 2048(0x800, float:2.87E-42)
            r0.<init>(r2, r3)     // Catch:{ Throwable -> 0x0061, all -> 0x005c }
            java.lang.String r1 = r0.readLine()     // Catch:{ Throwable -> 0x005a }
            if (r1 != 0) goto L_0x0028
            r0.close()     // Catch:{ IOException -> 0x0019 }
            goto L_0x001d
        L_0x0019:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x001d:
            r2.close()     // Catch:{ IOException -> 0x0021 }
            goto L_0x0025
        L_0x0021:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x0025:
            r0 = -1
            return r0
        L_0x0028:
            java.lang.String r3 = ":\\s+"
            r4 = 2
            java.lang.String[] r1 = r1.split(r3, r4)     // Catch:{ Throwable -> 0x005a }
            r3 = 1
            r1 = r1[r3]     // Catch:{ Throwable -> 0x005a }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ Throwable -> 0x005a }
            java.lang.String r3 = "kb"
            java.lang.String r4 = ""
            java.lang.String r1 = r1.replace(r3, r4)     // Catch:{ Throwable -> 0x005a }
            java.lang.String r1 = r1.trim()     // Catch:{ Throwable -> 0x005a }
            long r3 = java.lang.Long.parseLong(r1)     // Catch:{ Throwable -> 0x005a }
            r1 = 10
            long r3 = r3 << r1
            r0.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x0051
        L_0x004d:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x0051:
            r2.close()     // Catch:{ IOException -> 0x0055 }
            goto L_0x0059
        L_0x0055:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x0059:
            return r3
        L_0x005a:
            r1 = move-exception
            goto L_0x006f
        L_0x005c:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x008a
        L_0x0061:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x006f
        L_0x0066:
            r0 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
            goto L_0x008a
        L_0x006b:
            r0 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
        L_0x006f:
            com.tencent.bugly.proguard.x.a(r1)     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x007c
            r0.close()     // Catch:{ IOException -> 0x0078 }
            goto L_0x007c
        L_0x0078:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x007c:
            if (r2 == 0) goto L_0x0086
            r2.close()     // Catch:{ IOException -> 0x0082 }
            goto L_0x0086
        L_0x0082:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x0086:
            r0 = -2
            return r0
        L_0x0089:
            r1 = move-exception
        L_0x008a:
            if (r0 == 0) goto L_0x0094
            r0.close()     // Catch:{ IOException -> 0x0090 }
            goto L_0x0094
        L_0x0090:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x0094:
            if (r2 == 0) goto L_0x009e
            r2.close()     // Catch:{ IOException -> 0x009a }
            goto L_0x009e
        L_0x009a:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x009e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.common.info.b.g():long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x009e A[SYNTHETIC, Splitter:B:47:0x009e] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00aa A[SYNTHETIC, Splitter:B:55:0x00aa] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m() {
        /*
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00a7, all -> 0x0099 }
            r1.<init>()     // Catch:{ Throwable -> 0x00a7, all -> 0x0099 }
            java.io.File r2 = new java.io.File     // Catch:{ Throwable -> 0x00a7, all -> 0x0099 }
            java.lang.String r3 = "/sys/block/mmcblk0/device/type"
            r2.<init>(r3)     // Catch:{ Throwable -> 0x00a7, all -> 0x0099 }
            boolean r2 = r2.exists()     // Catch:{ Throwable -> 0x00a7, all -> 0x0099 }
            if (r2 == 0) goto L_0x002c
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x00a7, all -> 0x0099 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Throwable -> 0x00a7, all -> 0x0099 }
            java.lang.String r4 = "/sys/block/mmcblk0/device/type"
            r3.<init>(r4)     // Catch:{ Throwable -> 0x00a7, all -> 0x0099 }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x00a7, all -> 0x0099 }
            java.lang.String r3 = r2.readLine()     // Catch:{ Throwable -> 0x0095, all -> 0x0097 }
            if (r3 == 0) goto L_0x0028
            r1.append(r3)     // Catch:{ Throwable -> 0x0095, all -> 0x0097 }
        L_0x0028:
            r2.close()     // Catch:{ Throwable -> 0x0095, all -> 0x0097 }
            goto L_0x002d
        L_0x002c:
            r2 = r0
        L_0x002d:
            java.lang.String r3 = ","
            r1.append(r3)     // Catch:{ Throwable -> 0x0095, all -> 0x0097 }
            java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x0095, all -> 0x0097 }
            java.lang.String r4 = "/sys/block/mmcblk0/device/name"
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0095, all -> 0x0097 }
            boolean r3 = r3.exists()     // Catch:{ Throwable -> 0x0095, all -> 0x0097 }
            if (r3 == 0) goto L_0x005e
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0095, all -> 0x0097 }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ Throwable -> 0x0095, all -> 0x0097 }
            java.lang.String r5 = "/sys/block/mmcblk0/device/name"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0095, all -> 0x0097 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0095, all -> 0x0097 }
            java.lang.String r2 = r3.readLine()     // Catch:{ Throwable -> 0x005c, all -> 0x0059 }
            if (r2 == 0) goto L_0x0054
            r1.append(r2)     // Catch:{ Throwable -> 0x005c, all -> 0x0059 }
        L_0x0054:
            r3.close()     // Catch:{ Throwable -> 0x005c, all -> 0x0059 }
            r2 = r3
            goto L_0x005e
        L_0x0059:
            r0 = move-exception
            r2 = r3
            goto L_0x009c
        L_0x005c:
            r2 = r3
            goto L_0x00a8
        L_0x005e:
            java.lang.String r3 = ","
            r1.append(r3)     // Catch:{ Throwable -> 0x0095, all -> 0x0097 }
            java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x0095, all -> 0x0097 }
            java.lang.String r4 = "/sys/block/mmcblk0/device/cid"
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0095, all -> 0x0097 }
            boolean r3 = r3.exists()     // Catch:{ Throwable -> 0x0095, all -> 0x0097 }
            if (r3 == 0) goto L_0x0086
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0095, all -> 0x0097 }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ Throwable -> 0x0095, all -> 0x0097 }
            java.lang.String r5 = "/sys/block/mmcblk0/device/cid"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0095, all -> 0x0097 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0095, all -> 0x0097 }
            java.lang.String r2 = r3.readLine()     // Catch:{ Throwable -> 0x005c, all -> 0x0059 }
            if (r2 == 0) goto L_0x0085
            r1.append(r2)     // Catch:{ Throwable -> 0x005c, all -> 0x0059 }
        L_0x0085:
            r2 = r3
        L_0x0086:
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x0095, all -> 0x0097 }
            if (r2 == 0) goto L_0x0094
            r2.close()     // Catch:{ IOException -> 0x0090 }
            goto L_0x0094
        L_0x0090:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x0094:
            return r1
        L_0x0095:
            goto L_0x00a8
        L_0x0097:
            r0 = move-exception
            goto L_0x009c
        L_0x0099:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x009c:
            if (r2 == 0) goto L_0x00a6
            r2.close()     // Catch:{ IOException -> 0x00a2 }
            goto L_0x00a6
        L_0x00a2:
            r1 = move-exception
            com.tencent.bugly.proguard.x.a(r1)
        L_0x00a6:
            throw r0
        L_0x00a7:
            r2 = r0
        L_0x00a8:
            if (r2 == 0) goto L_0x00b2
            r2.close()     // Catch:{ IOException -> 0x00ae }
            goto L_0x00b2
        L_0x00ae:
            r1 = move-exception
            com.tencent.bugly.proguard.x.a(r1)
        L_0x00b2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.common.info.b.m():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b3 A[SYNTHETIC, Splitter:B:43:0x00b3] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00be A[SYNTHETIC, Splitter:B:49:0x00be] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String n() {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ Throwable -> 0x00ae, all -> 0x00b0 }
            java.lang.String r3 = "/sys/class/power_supply/ac/online"
            r2.<init>(r3)     // Catch:{ Throwable -> 0x00ae, all -> 0x00b0 }
            boolean r2 = r2.exists()     // Catch:{ Throwable -> 0x00ae, all -> 0x00b0 }
            if (r2 == 0) goto L_0x003e
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x00ae, all -> 0x00b0 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Throwable -> 0x00ae, all -> 0x00b0 }
            java.lang.String r4 = "/sys/class/power_supply/ac/online"
            r3.<init>(r4)     // Catch:{ Throwable -> 0x00ae, all -> 0x00b0 }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x00ae, all -> 0x00b0 }
            java.lang.String r1 = r2.readLine()     // Catch:{ Throwable -> 0x003b, all -> 0x0037 }
            if (r1 == 0) goto L_0x0032
            java.lang.String r3 = "ac_online"
            r0.append(r3)     // Catch:{ Throwable -> 0x003b, all -> 0x0037 }
            java.lang.String r3 = "|"
            r0.append(r3)     // Catch:{ Throwable -> 0x003b, all -> 0x0037 }
            r0.append(r1)     // Catch:{ Throwable -> 0x003b, all -> 0x0037 }
        L_0x0032:
            r2.close()     // Catch:{ Throwable -> 0x003b, all -> 0x0037 }
            r1 = r2
            goto L_0x003e
        L_0x0037:
            r0 = move-exception
            r1 = r2
            goto L_0x00b1
        L_0x003b:
            r1 = r2
            goto L_0x00bc
        L_0x003e:
            java.lang.String r2 = "\n"
            r0.append(r2)     // Catch:{ Throwable -> 0x00ae, all -> 0x00b0 }
            java.io.File r2 = new java.io.File     // Catch:{ Throwable -> 0x00ae, all -> 0x00b0 }
            java.lang.String r3 = "/sys/class/power_supply/usb/online"
            r2.<init>(r3)     // Catch:{ Throwable -> 0x00ae, all -> 0x00b0 }
            boolean r2 = r2.exists()     // Catch:{ Throwable -> 0x00ae, all -> 0x00b0 }
            if (r2 == 0) goto L_0x0073
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x00ae, all -> 0x00b0 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Throwable -> 0x00ae, all -> 0x00b0 }
            java.lang.String r4 = "/sys/class/power_supply/usb/online"
            r3.<init>(r4)     // Catch:{ Throwable -> 0x00ae, all -> 0x00b0 }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x00ae, all -> 0x00b0 }
            java.lang.String r1 = r2.readLine()     // Catch:{ Throwable -> 0x003b, all -> 0x0037 }
            if (r1 == 0) goto L_0x006f
            java.lang.String r3 = "usb_online"
            r0.append(r3)     // Catch:{ Throwable -> 0x003b, all -> 0x0037 }
            java.lang.String r3 = "|"
            r0.append(r3)     // Catch:{ Throwable -> 0x003b, all -> 0x0037 }
            r0.append(r1)     // Catch:{ Throwable -> 0x003b, all -> 0x0037 }
        L_0x006f:
            r2.close()     // Catch:{ Throwable -> 0x003b, all -> 0x0037 }
            r1 = r2
        L_0x0073:
            java.lang.String r2 = "\n"
            r0.append(r2)     // Catch:{ Throwable -> 0x00ae, all -> 0x00b0 }
            java.io.File r2 = new java.io.File     // Catch:{ Throwable -> 0x00ae, all -> 0x00b0 }
            java.lang.String r3 = "/sys/class/power_supply/battery/capacity"
            r2.<init>(r3)     // Catch:{ Throwable -> 0x00ae, all -> 0x00b0 }
            boolean r2 = r2.exists()     // Catch:{ Throwable -> 0x00ae, all -> 0x00b0 }
            if (r2 == 0) goto L_0x00a8
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x00ae, all -> 0x00b0 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Throwable -> 0x00ae, all -> 0x00b0 }
            java.lang.String r4 = "/sys/class/power_supply/battery/capacity"
            r3.<init>(r4)     // Catch:{ Throwable -> 0x00ae, all -> 0x00b0 }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x00ae, all -> 0x00b0 }
            java.lang.String r1 = r2.readLine()     // Catch:{ Throwable -> 0x003b, all -> 0x0037 }
            if (r1 == 0) goto L_0x00a4
            java.lang.String r3 = "battery_capacity"
            r0.append(r3)     // Catch:{ Throwable -> 0x003b, all -> 0x0037 }
            java.lang.String r3 = "|"
            r0.append(r3)     // Catch:{ Throwable -> 0x003b, all -> 0x0037 }
            r0.append(r1)     // Catch:{ Throwable -> 0x003b, all -> 0x0037 }
        L_0x00a4:
            r2.close()     // Catch:{ Throwable -> 0x003b, all -> 0x0037 }
            r1 = r2
        L_0x00a8:
            if (r1 == 0) goto L_0x00c6
            r1.close()     // Catch:{ IOException -> 0x00c2 }
            goto L_0x00c6
        L_0x00ae:
            goto L_0x00bc
        L_0x00b0:
            r0 = move-exception
        L_0x00b1:
            if (r1 == 0) goto L_0x00bb
            r1.close()     // Catch:{ IOException -> 0x00b7 }
            goto L_0x00bb
        L_0x00b7:
            r1 = move-exception
            com.tencent.bugly.proguard.x.a(r1)
        L_0x00bb:
            throw r0
        L_0x00bc:
            if (r1 == 0) goto L_0x00c6
            r1.close()     // Catch:{ IOException -> 0x00c2 }
            goto L_0x00c6
        L_0x00c2:
            r1 = move-exception
            com.tencent.bugly.proguard.x.a(r1)
        L_0x00c6:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.common.info.b.n():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x006e A[SYNTHETIC, Splitter:B:40:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0078 A[SYNTHETIC, Splitter:B:45:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0084 A[SYNTHETIC, Splitter:B:52:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x008e A[SYNTHETIC, Splitter:B:57:0x008e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String q() {
        /*
            java.lang.String r0 = "/system/build.prop"
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ Throwable -> 0x0066, all -> 0x0061 }
            r2.<init>(r0)     // Catch:{ Throwable -> 0x0066, all -> 0x0061 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x005e, all -> 0x0059 }
            r3 = 2048(0x800, float:2.87E-42)
            r0.<init>(r2, r3)     // Catch:{ Throwable -> 0x005e, all -> 0x0059 }
        L_0x000f:
            java.lang.String r3 = r0.readLine()     // Catch:{ Throwable -> 0x0057 }
            r4 = 0
            if (r3 == 0) goto L_0x003b
            java.lang.String r5 = "="
            r6 = 2
            java.lang.String[] r3 = r3.split(r5, r6)     // Catch:{ Throwable -> 0x0057 }
            int r5 = r3.length     // Catch:{ Throwable -> 0x0057 }
            if (r5 != r6) goto L_0x000f
            r5 = r3[r4]     // Catch:{ Throwable -> 0x0057 }
            java.lang.String r6 = "ro.product.cpu.abilist"
            boolean r5 = r5.equals(r6)     // Catch:{ Throwable -> 0x0057 }
            r6 = 1
            if (r5 == 0) goto L_0x002e
            r3 = r3[r6]     // Catch:{ Throwable -> 0x0057 }
            goto L_0x003c
        L_0x002e:
            r5 = r3[r4]     // Catch:{ Throwable -> 0x0057 }
            java.lang.String r7 = "ro.product.cpu.abi"
            boolean r5 = r5.equals(r7)     // Catch:{ Throwable -> 0x0057 }
            if (r5 == 0) goto L_0x000f
            r3 = r3[r6]     // Catch:{ Throwable -> 0x0057 }
            goto L_0x003c
        L_0x003b:
            r3 = r1
        L_0x003c:
            if (r3 == 0) goto L_0x0046
            java.lang.String r5 = ","
            java.lang.String[] r3 = r3.split(r5)     // Catch:{ Throwable -> 0x0057 }
            r3 = r3[r4]     // Catch:{ Throwable -> 0x0057 }
        L_0x0046:
            r0.close()     // Catch:{ IOException -> 0x004a }
            goto L_0x004e
        L_0x004a:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x004e:
            r2.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x0056:
            return r3
        L_0x0057:
            r3 = move-exception
            goto L_0x0069
        L_0x0059:
            r0 = move-exception
            r8 = r1
            r1 = r0
            r0 = r8
            goto L_0x0082
        L_0x005e:
            r3 = move-exception
            r0 = r1
            goto L_0x0069
        L_0x0061:
            r0 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
            goto L_0x0082
        L_0x0066:
            r3 = move-exception
            r0 = r1
            r2 = r0
        L_0x0069:
            com.tencent.bugly.proguard.x.a(r3)     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x0076
            r0.close()     // Catch:{ IOException -> 0x0072 }
            goto L_0x0076
        L_0x0072:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x0076:
            if (r2 == 0) goto L_0x0080
            r2.close()     // Catch:{ IOException -> 0x007c }
            goto L_0x0080
        L_0x007c:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x0080:
            return r1
        L_0x0081:
            r1 = move-exception
        L_0x0082:
            if (r0 == 0) goto L_0x008c
            r0.close()     // Catch:{ IOException -> 0x0088 }
            goto L_0x008c
        L_0x0088:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x008c:
            if (r2 == 0) goto L_0x0096
            r2.close()     // Catch:{ IOException -> 0x0092 }
            goto L_0x0096
        L_0x0092:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x0096:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.common.info.b.q():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e4 A[SYNTHETIC, Splitter:B:69:0x00e4] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ee A[SYNTHETIC, Splitter:B:74:0x00ee] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00fc A[SYNTHETIC, Splitter:B:82:0x00fc] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0106 A[SYNTHETIC, Splitter:B:87:0x0106] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long h() {
        /*
            java.lang.String r0 = "/proc/meminfo"
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ Throwable -> 0x00db, all -> 0x00d6 }
            r2.<init>(r0)     // Catch:{ Throwable -> 0x00db, all -> 0x00d6 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x00d1, all -> 0x00cc }
            r3 = 2048(0x800, float:2.87E-42)
            r0.<init>(r2, r3)     // Catch:{ Throwable -> 0x00d1, all -> 0x00cc }
            r0.readLine()     // Catch:{ Throwable -> 0x00ca }
            java.lang.String r1 = r0.readLine()     // Catch:{ Throwable -> 0x00ca }
            r3 = -1
            if (r1 != 0) goto L_0x002b
            r0.close()     // Catch:{ IOException -> 0x001e }
            goto L_0x0022
        L_0x001e:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x0022:
            r2.close()     // Catch:{ IOException -> 0x0026 }
            goto L_0x002a
        L_0x0026:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x002a:
            return r3
        L_0x002b:
            java.lang.String r5 = ":\\s+"
            r6 = 2
            java.lang.String[] r1 = r1.split(r5, r6)     // Catch:{ Throwable -> 0x00ca }
            r5 = 1
            r1 = r1[r5]     // Catch:{ Throwable -> 0x00ca }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ Throwable -> 0x00ca }
            java.lang.String r7 = "kb"
            java.lang.String r8 = ""
            java.lang.String r1 = r1.replace(r7, r8)     // Catch:{ Throwable -> 0x00ca }
            java.lang.String r1 = r1.trim()     // Catch:{ Throwable -> 0x00ca }
            r7 = 0
            long r9 = java.lang.Long.parseLong(r1)     // Catch:{ Throwable -> 0x00ca }
            r1 = 10
            long r9 = r9 << r1
            long r9 = r9 + r7
            java.lang.String r7 = r0.readLine()     // Catch:{ Throwable -> 0x00ca }
            if (r7 != 0) goto L_0x0066
            r0.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x005d:
            r2.close()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0065
        L_0x0061:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x0065:
            return r3
        L_0x0066:
            java.lang.String r8 = ":\\s+"
            java.lang.String[] r7 = r7.split(r8, r6)     // Catch:{ Throwable -> 0x00ca }
            r7 = r7[r5]     // Catch:{ Throwable -> 0x00ca }
            java.lang.String r7 = r7.toLowerCase()     // Catch:{ Throwable -> 0x00ca }
            java.lang.String r8 = "kb"
            java.lang.String r11 = ""
            java.lang.String r7 = r7.replace(r8, r11)     // Catch:{ Throwable -> 0x00ca }
            java.lang.String r7 = r7.trim()     // Catch:{ Throwable -> 0x00ca }
            long r7 = java.lang.Long.parseLong(r7)     // Catch:{ Throwable -> 0x00ca }
            long r7 = r7 << r1
            long r9 = r9 + r7
            java.lang.String r7 = r0.readLine()     // Catch:{ Throwable -> 0x00ca }
            if (r7 != 0) goto L_0x009b
            r0.close()     // Catch:{ IOException -> 0x008e }
            goto L_0x0092
        L_0x008e:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x0092:
            r2.close()     // Catch:{ IOException -> 0x0096 }
            goto L_0x009a
        L_0x0096:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x009a:
            return r3
        L_0x009b:
            java.lang.String r3 = ":\\s+"
            java.lang.String[] r3 = r7.split(r3, r6)     // Catch:{ Throwable -> 0x00ca }
            r3 = r3[r5]     // Catch:{ Throwable -> 0x00ca }
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ Throwable -> 0x00ca }
            java.lang.String r4 = "kb"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.replace(r4, r5)     // Catch:{ Throwable -> 0x00ca }
            java.lang.String r3 = r3.trim()     // Catch:{ Throwable -> 0x00ca }
            long r3 = java.lang.Long.parseLong(r3)     // Catch:{ Throwable -> 0x00ca }
            long r3 = r3 << r1
            long r9 = r9 + r3
            r0.close()     // Catch:{ IOException -> 0x00bd }
            goto L_0x00c1
        L_0x00bd:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x00c1:
            r2.close()     // Catch:{ IOException -> 0x00c5 }
            goto L_0x00c9
        L_0x00c5:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x00c9:
            return r9
        L_0x00ca:
            r1 = move-exception
            goto L_0x00df
        L_0x00cc:
            r0 = move-exception
            r12 = r1
            r1 = r0
            r0 = r12
            goto L_0x00fa
        L_0x00d1:
            r0 = move-exception
            r12 = r1
            r1 = r0
            r0 = r12
            goto L_0x00df
        L_0x00d6:
            r0 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
            goto L_0x00fa
        L_0x00db:
            r0 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
        L_0x00df:
            com.tencent.bugly.proguard.x.a(r1)     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x00ec
            r0.close()     // Catch:{ IOException -> 0x00e8 }
            goto L_0x00ec
        L_0x00e8:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x00ec:
            if (r2 == 0) goto L_0x00f6
            r2.close()     // Catch:{ IOException -> 0x00f2 }
            goto L_0x00f6
        L_0x00f2:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x00f6:
            r0 = -2
            return r0
        L_0x00f9:
            r1 = move-exception
        L_0x00fa:
            if (r0 == 0) goto L_0x0104
            r0.close()     // Catch:{ IOException -> 0x0100 }
            goto L_0x0104
        L_0x0100:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x0104:
            if (r2 == 0) goto L_0x010e
            r2.close()     // Catch:{ IOException -> 0x010a }
            goto L_0x010e
        L_0x010a:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x010e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.common.info.b.h():long");
    }

    public static String h(Context context) {
        return z.a(context, "ro.board.platform");
    }

    public static String a(boolean z) {
        String str = null;
        if (z) {
            try {
                str = q();
            } catch (Throwable th) {
                x.a(th);
                return "fail";
            }
        }
        if (str == null) {
            str = System.getProperty("os.arch");
        }
        return String.valueOf(str);
    }

    public static String a(Context context) {
        String str = null;
        if (context == null) {
            return null;
        }
        if (!AppInfo.a(context, "android.permission.READ_PHONE_STATE")) {
            x.d("no READ_PHONE_STATE permission to get IMEI", new Object[0]);
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                String deviceId = telephonyManager.getDeviceId();
                if (deviceId != null) {
                    try {
                        str = deviceId.toLowerCase();
                    } catch (Throwable unused) {
                        str = deviceId;
                        x.a("Failed to get IMEI.", new Object[0]);
                        return str;
                    }
                } else {
                    str = deviceId;
                }
            }
        } catch (Throwable unused2) {
            x.a("Failed to get IMEI.", new Object[0]);
            return str;
        }
        return str;
    }

    public static String b(Context context) {
        String str = null;
        if (context == null) {
            return null;
        }
        if (!AppInfo.a(context, "android.permission.READ_PHONE_STATE")) {
            x.d("no READ_PHONE_STATE permission to get IMSI", new Object[0]);
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                String subscriberId = telephonyManager.getSubscriberId();
                if (subscriberId != null) {
                    try {
                        str = subscriberId.toLowerCase();
                    } catch (Throwable unused) {
                        str = subscriberId;
                        x.a("Failed to get IMSI.", new Object[0]);
                        return str;
                    }
                } else {
                    str = subscriberId;
                }
            }
        } catch (Throwable unused2) {
            x.a("Failed to get IMSI.", new Object[0]);
            return str;
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c(android.content.Context r3) {
        /*
            java.lang.String r0 = "fail"
            if (r3 != 0) goto L_0x0005
            return r0
        L_0x0005:
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ Throwable -> 0x001e }
            java.lang.String r1 = "android_id"
            java.lang.String r3 = android.provider.Settings.Secure.getString(r3, r1)     // Catch:{ Throwable -> 0x001e }
            if (r3 != 0) goto L_0x0019
            java.lang.String r0 = "null"
            goto L_0x002d
        L_0x0014:
            r0 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
            goto L_0x001f
        L_0x0019:
            java.lang.String r0 = r3.toLowerCase()     // Catch:{ Throwable -> 0x0014 }
            goto L_0x002d
        L_0x001e:
            r3 = move-exception
        L_0x001f:
            boolean r3 = com.tencent.bugly.proguard.x.a(r3)
            if (r3 != 0) goto L_0x002d
            java.lang.String r3 = "Failed to get Android ID."
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.a(r3, r1)
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.common.info.b.c(android.content.Context):java.lang.String");
    }

    public static String l(Context context) {
        StringBuilder sb = new StringBuilder();
        String a2 = z.a(context, "gsm.sim.state");
        if (a2 != null) {
            sb.append("gsm.sim.state");
            sb.append("|");
            sb.append(a2);
        }
        sb.append("\n");
        String a3 = z.a(context, "gsm.sim.state2");
        if (a3 != null) {
            sb.append("gsm.sim.state2");
            sb.append("|");
            sb.append(a3);
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String d(android.content.Context r5) {
        /*
            java.lang.String r0 = "fail"
            if (r5 != 0) goto L_0x0005
            return r0
        L_0x0005:
            r1 = 0
            r2 = 1
            java.lang.String r3 = "wifi"
            java.lang.Object r3 = r5.getSystemService(r3)     // Catch:{ Throwable -> 0x0059 }
            android.net.wifi.WifiManager r3 = (android.net.wifi.WifiManager) r3     // Catch:{ Throwable -> 0x0059 }
            if (r3 == 0) goto L_0x005d
            android.net.wifi.WifiInfo r3 = r3.getConnectionInfo()     // Catch:{ Throwable -> 0x0059 }
            if (r3 == 0) goto L_0x005d
            java.lang.String r3 = r3.getMacAddress()     // Catch:{ Throwable -> 0x0059 }
            if (r3 == 0) goto L_0x0029
            java.lang.String r0 = "02:00:00:00:00:00"
            boolean r0 = r3.equals(r0)     // Catch:{ Throwable -> 0x0026 }
            if (r0 == 0) goto L_0x0057
            goto L_0x0029
        L_0x0026:
            r5 = move-exception
            r0 = r3
            goto L_0x005a
        L_0x0029:
            java.lang.String r0 = "wifi.interface"
            java.lang.String r5 = com.tencent.bugly.proguard.z.a((android.content.Context) r5, (java.lang.String) r0)     // Catch:{ Throwable -> 0x0026 }
            java.lang.String r0 = "MAC interface: %s"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x0026 }
            r4[r1] = r5     // Catch:{ Throwable -> 0x0026 }
            com.tencent.bugly.proguard.x.c(r0, r4)     // Catch:{ Throwable -> 0x0026 }
            java.net.NetworkInterface r5 = java.net.NetworkInterface.getByName(r5)     // Catch:{ Throwable -> 0x0026 }
            if (r5 != 0) goto L_0x0044
            java.lang.String r5 = "wlan0"
            java.net.NetworkInterface r5 = java.net.NetworkInterface.getByName(r5)     // Catch:{ Throwable -> 0x0026 }
        L_0x0044:
            if (r5 != 0) goto L_0x004c
            java.lang.String r5 = "eth0"
            java.net.NetworkInterface r5 = java.net.NetworkInterface.getByName(r5)     // Catch:{ Throwable -> 0x0026 }
        L_0x004c:
            if (r5 == 0) goto L_0x0057
            byte[] r5 = r5.getHardwareAddress()     // Catch:{ Throwable -> 0x0026 }
            java.lang.String r0 = com.tencent.bugly.proguard.z.d(r5)     // Catch:{ Throwable -> 0x0026 }
            goto L_0x005d
        L_0x0057:
            r0 = r3
            goto L_0x005d
        L_0x0059:
            r5 = move-exception
        L_0x005a:
            com.tencent.bugly.proguard.x.a(r5)
        L_0x005d:
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = "null"
        L_0x0061:
            java.lang.String r5 = "MAC address: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            com.tencent.bugly.proguard.x.c(r5, r2)
            java.lang.String r5 = r0.toLowerCase()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.common.info.b.d(android.content.Context):java.lang.String");
    }

    public static String e(Context context) {
        String str = "fail";
        if (context == null) {
            return str;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                String simSerialNumber = telephonyManager.getSimSerialNumber();
                str = simSerialNumber == null ? "null" : simSerialNumber;
            }
        } catch (Throwable unused) {
            x.a("Failed to get SIM serial number.", new Object[0]);
        }
        return str;
    }

    public static boolean i(Context context) {
        boolean z;
        boolean z2;
        boolean z3;
        try {
            z = new File("/system/app/Superuser.apk").exists();
        } catch (Throwable th) {
            x.b(th);
            z = false;
        }
        Boolean bool = null;
        ArrayList<String> a2 = z.a(context, new String[]{"/system/bin/sh", "-c", "type su"});
        if (a2 != null && a2.size() > 0) {
            Iterator<String> it2 = a2.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                x.c(next, new Object[0]);
                if (next.contains("not found")) {
                    bool = Boolean.FALSE;
                }
            }
            if (bool == null) {
                bool = Boolean.TRUE;
            }
        }
        if (bool == null) {
            z2 = false;
        } else {
            z2 = bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(z2);
        if (Build.TAGS == null || !Build.TAGS.contains("test-keys")) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3 || z || valueOf.booleanValue()) {
            return true;
        }
        return false;
    }

    public static String j(Context context) {
        StringBuilder sb = new StringBuilder();
        String a2 = z.a(context, "ro.genymotion.version");
        if (a2 != null) {
            sb.append("ro.genymotion.version");
            sb.append("|");
            sb.append(a2);
            sb.append("\n");
        }
        String a3 = z.a(context, "androVM.vbox_dpi");
        if (a3 != null) {
            sb.append("androVM.vbox_dpi");
            sb.append("|");
            sb.append(a3);
            sb.append("\n");
        }
        String a4 = z.a(context, "qemu.sf.fake_camera");
        if (a4 != null) {
            sb.append("qemu.sf.fake_camera");
            sb.append("|");
            sb.append(a4);
        }
        return sb.toString();
    }

    public static String f(Context context) {
        String str;
        String str2 = "unknown";
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 1) {
                str = "WIFI";
            } else {
                if (activeNetworkInfo.getType() == 0) {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager != null) {
                        switch (telephonyManager.getNetworkType()) {
                            case 1:
                                str = "GPRS";
                                break;
                            case 2:
                                str = "EDGE";
                                break;
                            case 3:
                                str = "UMTS";
                                break;
                            case 4:
                                str = "CDMA";
                                break;
                            case 5:
                                str = "EVDO_0";
                                break;
                            case 6:
                                str = "EVDO_A";
                                break;
                            case e.l:
                                str = "1xRTT";
                                break;
                            case 8:
                                str = "HSDPA";
                                break;
                            case 9:
                                str = "HSUPA";
                                break;
                            case 10:
                                str = "HSPA";
                                break;
                            case 11:
                                str = "iDen";
                                break;
                            case SearchNilInfo.HIT_TYPE_SENSITIVE:
                                str = "EVDO_B";
                                break;
                            case 13:
                                str = "LTE";
                                break;
                            case 14:
                                str = "eHRPD";
                                break;
                            case 15:
                                str = "HSPA+";
                                break;
                            default:
                                str2 = "MOBILE(" + r4 + ")";
                                break;
                        }
                    }
                }
                str = str2;
            }
            return str;
        } catch (Exception e2) {
            x.a(e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x009d A[SYNTHETIC, Splitter:B:36:0x009d] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ad A[SYNTHETIC, Splitter:B:44:0x00ad] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String k(android.content.Context r5) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = f79280a
            if (r1 != 0) goto L_0x0011
            java.lang.String r1 = "ro.secure"
            java.lang.String r1 = com.tencent.bugly.proguard.z.a((android.content.Context) r5, (java.lang.String) r1)
            f79280a = r1
        L_0x0011:
            java.lang.String r1 = f79280a
            if (r1 == 0) goto L_0x0029
            java.lang.String r1 = "ro.secure"
            r0.append(r1)
            java.lang.String r1 = "|"
            r0.append(r1)
            java.lang.String r1 = f79280a
            r0.append(r1)
            java.lang.String r1 = "\n"
            r0.append(r1)
        L_0x0029:
            java.lang.String r1 = f79281b
            if (r1 != 0) goto L_0x0035
            java.lang.String r1 = "ro.debuggable"
            java.lang.String r5 = com.tencent.bugly.proguard.z.a((android.content.Context) r5, (java.lang.String) r1)
            f79281b = r5
        L_0x0035:
            java.lang.String r5 = f79281b
            if (r5 == 0) goto L_0x004d
            java.lang.String r5 = "ro.debuggable"
            r0.append(r5)
            java.lang.String r5 = "|"
            r0.append(r5)
            java.lang.String r5 = f79281b
            r0.append(r5)
            java.lang.String r5 = "\n"
            r0.append(r5)
        L_0x004d:
            r5 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0094, all -> 0x0090 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ Throwable -> 0x0094, all -> 0x0090 }
            java.lang.String r3 = "/proc/self/status"
            r2.<init>(r3)     // Catch:{ Throwable -> 0x0094, all -> 0x0090 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0094, all -> 0x0090 }
        L_0x005a:
            java.lang.String r5 = r1.readLine()     // Catch:{ Throwable -> 0x008e }
            if (r5 == 0) goto L_0x0068
            java.lang.String r2 = "TracerPid:"
            boolean r2 = r5.startsWith(r2)     // Catch:{ Throwable -> 0x008e }
            if (r2 == 0) goto L_0x005a
        L_0x0068:
            if (r5 == 0) goto L_0x0081
            r2 = 10
            java.lang.String r5 = r5.substring(r2)     // Catch:{ Throwable -> 0x008e }
            java.lang.String r5 = r5.trim()     // Catch:{ Throwable -> 0x008e }
            java.lang.String r2 = "tracer_pid"
            r0.append(r2)     // Catch:{ Throwable -> 0x008e }
            java.lang.String r2 = "|"
            r0.append(r2)     // Catch:{ Throwable -> 0x008e }
            r0.append(r5)     // Catch:{ Throwable -> 0x008e }
        L_0x0081:
            java.lang.String r5 = r0.toString()     // Catch:{ Throwable -> 0x008e }
            r1.close()     // Catch:{ IOException -> 0x0089 }
            goto L_0x008d
        L_0x0089:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x008d:
            return r5
        L_0x008e:
            r5 = move-exception
            goto L_0x0098
        L_0x0090:
            r0 = move-exception
            r1 = r5
            r5 = r0
            goto L_0x00ab
        L_0x0094:
            r1 = move-exception
            r4 = r1
            r1 = r5
            r5 = r4
        L_0x0098:
            com.tencent.bugly.proguard.x.a(r5)     // Catch:{ all -> 0x00aa }
            if (r1 == 0) goto L_0x00a5
            r1.close()     // Catch:{ IOException -> 0x00a1 }
            goto L_0x00a5
        L_0x00a1:
            r5 = move-exception
            com.tencent.bugly.proguard.x.a(r5)
        L_0x00a5:
            java.lang.String r5 = r0.toString()
            return r5
        L_0x00aa:
            r5 = move-exception
        L_0x00ab:
            if (r1 == 0) goto L_0x00b5
            r1.close()     // Catch:{ IOException -> 0x00b1 }
            goto L_0x00b5
        L_0x00b1:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x00b5:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.common.info.b.k(android.content.Context):java.lang.String");
    }

    public static String g(Context context) {
        String a2 = z.a(context, "ro.miui.ui.version.name");
        if (!z.a(a2) && !a2.equals("fail")) {
            return "XiaoMi/MIUI/".concat(String.valueOf(a2));
        }
        String a3 = z.a(context, "ro.build.version.emui");
        if (!z.a(a3) && !a3.equals("fail")) {
            return "HuaWei/EMOTION/".concat(String.valueOf(a3));
        }
        String a4 = z.a(context, "ro.lenovo.series");
        if (!z.a(a4) && !a4.equals("fail")) {
            return "Lenovo/VIBE/".concat(String.valueOf(z.a(context, "ro.build.version.incremental")));
        }
        String a5 = z.a(context, "ro.build.nubia.rom.name");
        if (z.a(a5) || a5.equals("fail")) {
            String a6 = z.a(context, "ro.meizu.product.model");
            if (z.a(a6) || a6.equals("fail")) {
                String a7 = z.a(context, "ro.build.version.opporom");
                if (!z.a(a7) && !a7.equals("fail")) {
                    return "Oppo/COLOROS/".concat(String.valueOf(a7));
                }
                String a8 = z.a(context, "ro.vivo.os.build.display.id");
                if (!z.a(a8) && !a8.equals("fail")) {
                    return "vivo/FUNTOUCH/".concat(String.valueOf(a8));
                }
                String a9 = z.a(context, "ro.aa.romver");
                if (z.a(a9) || a9.equals("fail")) {
                    String a10 = z.a(context, "ro.lewa.version");
                    if (z.a(a10) || a10.equals("fail")) {
                        String a11 = z.a(context, "ro.gn.gnromvernumber");
                        if (z.a(a11) || a11.equals("fail")) {
                            String a12 = z.a(context, "ro.build.tyd.kbstyle_version");
                            if (!z.a(a12) && !a12.equals("fail")) {
                                return "dido/".concat(String.valueOf(a12));
                            }
                            return z.a(context, "ro.build.fingerprint") + "/" + z.a(context, "ro.build.rom.id");
                        }
                        return "amigo/" + a11 + "/" + z.a(context, "ro.build.display.id");
                    }
                    return "tcl/" + a10 + "/" + z.a(context, "ro.build.display.id");
                }
                return "htc/" + a9 + "/" + z.a(context, "ro.build.description");
            }
            return "Meizu/FLYME/" + z.a(context, "ro.build.display.id");
        }
        return "Zte/NUBIA/" + a5 + "_" + z.a(context, "ro.build.nubia.rom.code");
    }
}
