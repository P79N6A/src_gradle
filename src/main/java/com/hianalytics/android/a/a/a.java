package com.hianalytics.android.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final char[] f24906a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b  reason: collision with root package name */
    private static boolean f24907b = true;

    /* renamed from: c  reason: collision with root package name */
    private static Long f24908c = 30L;

    /* renamed from: d  reason: collision with root package name */
    private static Long f24909d = 86400L;

    /* renamed from: e  reason: collision with root package name */
    private static Long f24910e = 1000L;

    /* renamed from: f  reason: collision with root package name */
    private static Long f24911f = 1800L;
    private static int g = Integer.MAX_VALUE;
    private static HandlerThread h;
    private static HandlerThread i;
    private static Handler j;
    private static Handler k;

    static {
        HandlerThread handlerThread = new HandlerThread("HiAnalytics_messageThread");
        h = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = new HandlerThread("HiAnalytics_sessionThread");
        i = handlerThread2;
        handlerThread2.start();
    }

    public static long a(String str) {
        long j2;
        try {
            Date parse = new SimpleDateFormat("yyyyMMddHHmmss").parse(str);
            if (parse != null) {
                j2 = parse.getTime();
                return j2 / 1000;
            }
        } catch (ParseException unused) {
        }
        j2 = 0;
        return j2 / 1000;
    }

    public static Long a() {
        return f24908c;
    }

    public static String a(Context context) {
        String str = "";
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f);
            if (applicationInfo != null) {
                Object obj = applicationInfo.metaData.get("APPKEY");
                if (obj != null) {
                    str = obj.toString();
                }
            }
        } catch (Exception unused) {
        }
        return (str == null || str.trim().length() == 0) ? context.getPackageName() : str;
    }

    public static void a(int i2) {
        g = i2;
    }

    public static void a(Long l) {
        f24908c = l;
    }

    public static void a(boolean z) {
        f24907b = z;
    }

    public static boolean a(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0033 A[SYNTHETIC, Splitter:B:23:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0043 A[SYNTHETIC, Splitter:B:31:0x0043] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(byte[] r3) {
        /*
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x002b, all -> 0x0028 }
            r1.<init>()     // Catch:{ Exception -> 0x002b, all -> 0x0028 }
            java.util.zip.DeflaterOutputStream r2 = new java.util.zip.DeflaterOutputStream     // Catch:{ Exception -> 0x0025, all -> 0x0023 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0025, all -> 0x0023 }
            r2.write(r3)     // Catch:{ Exception -> 0x0021 }
            r2.close()     // Catch:{ Exception -> 0x0021 }
            byte[] r3 = r1.toByteArray()     // Catch:{ Exception -> 0x0021 }
            r2.close()     // Catch:{ IOException -> 0x001c }
            r1.close()     // Catch:{ IOException -> 0x001c }
            goto L_0x0020
        L_0x001c:
            r0 = move-exception
            com.google.a.a.a.a.a.a.b(r0)
        L_0x0020:
            return r3
        L_0x0021:
            r3 = move-exception
            goto L_0x002e
        L_0x0023:
            r3 = move-exception
            goto L_0x0041
        L_0x0025:
            r3 = move-exception
            r2 = r0
            goto L_0x002e
        L_0x0028:
            r3 = move-exception
            r1 = r0
            goto L_0x0041
        L_0x002b:
            r3 = move-exception
            r1 = r0
            r2 = r1
        L_0x002e:
            com.google.a.a.a.a.a.a.b(r3)     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x003e
            r2.close()     // Catch:{ IOException -> 0x003a }
            r1.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x003e
        L_0x003a:
            r3 = move-exception
            com.google.a.a.a.a.a.a.b(r3)
        L_0x003e:
            return r0
        L_0x003f:
            r3 = move-exception
            r0 = r2
        L_0x0041:
            if (r0 == 0) goto L_0x004e
            r0.close()     // Catch:{ IOException -> 0x004a }
            r1.close()     // Catch:{ IOException -> 0x004a }
            goto L_0x004e
        L_0x004a:
            r0 = move-exception
            com.google.a.a.a.a.a.a.b(r0)
        L_0x004e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hianalytics.android.a.a.a.a(byte[]):byte[]");
    }

    public static Long b() {
        return f24909d;
    }

    public static String b(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                Object obj = applicationInfo.metaData.get("CHANNEL");
                if (obj != null) {
                    return obj.toString();
                }
            }
        } catch (Exception e2) {
            com.google.a.a.a.a.a.a.b(e2);
        }
        return "Unknown";
    }

    public static String b(String str) {
        return (str == null || str.equals("")) ? "000000000000000" : str;
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(f24906a[(b2 & 240) >> 4]);
            sb.append(f24906a[b2 & 15]);
        }
        return sb.toString();
    }

    public static void b(Long l) {
        f24909d = l;
    }

    public static Long c() {
        return f24911f;
    }

    public static void c(Long l) {
        f24910e = l;
    }

    public static String[] c(Context context) {
        String[] strArr = {"Unknown", "Unknown"};
        if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
            strArr[0] = "Unknown";
            return strArr;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            strArr[0] = "Unknown";
            return strArr;
        } else if (connectivityManager.getNetworkInfo(1).getState() == NetworkInfo.State.CONNECTED) {
            strArr[0] = "Wi-Fi";
            return strArr;
        } else {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
            if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                strArr[0] = "2G/3G";
                strArr[1] = networkInfo.getSubtypeName();
            }
            return strArr;
        }
    }

    public static int d() {
        return g;
    }

    public static void d(Long l) {
        f24911f = l;
    }

    public static boolean d(Context context) {
        String packageName;
        if (f24910e.longValue() < 0) {
            return false;
        }
        StringBuilder sb = new StringBuilder("/data/data/");
        sb.append(packageName);
        sb.append("/shared_prefs/");
        sb.append("hianalytics_state_" + packageName + ".xml");
        return new File(sb.toString()).length() > f24910e.longValue();
    }

    public static String e(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
        } catch (PackageManager.NameNotFoundException unused) {
            return "unknown";
        }
    }

    public static boolean e() {
        return f24907b;
    }

    public static Handler f() {
        if (j == null) {
            Looper looper = h.getLooper();
            if (looper == null) {
                return null;
            }
            j = new Handler(looper);
        }
        return j;
    }

    public static boolean f(Context context) {
        SharedPreferences a2 = c.a(context, "flag");
        String str = Build.DISPLAY;
        String string = a2.getString("rom_version", "");
        StringBuilder sb = new StringBuilder("currentRom=");
        sb.append(str);
        sb.append(",lastRom=");
        sb.append(string);
        return "".equals(string) || !string.equals(str);
    }

    public static Handler g() {
        if (k == null) {
            Looper looper = i.getLooper();
            if (looper == null) {
                return null;
            }
            k = new Handler(looper);
        }
        return k;
    }

    public static void h() {
    }

    public static String i() {
        "URL = ".concat(String.valueOf("http://data.hicloud.com:8089/sdkv1"));
        return "http://data.hicloud.com:8089/sdkv1";
    }
}
