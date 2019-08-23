package com.loc;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import com.amap.api.location.AMapLocation;
import com.autonavi.aps.amapapi.model.AMapLocationServer;
import com.google.a.a.a.a.a.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import org.json.JSONObject;

public final class cn {

    /* renamed from: a  reason: collision with root package name */
    static Hashtable<String, Long> f25682a = new Hashtable<>();

    /* renamed from: b  reason: collision with root package name */
    static SparseArray<String> f25683b = null;

    /* renamed from: c  reason: collision with root package name */
    static WifiManager f25684c = null;

    /* renamed from: d  reason: collision with root package name */
    static boolean f25685d = false;

    /* renamed from: e  reason: collision with root package name */
    private static int f25686e;

    /* renamed from: f  reason: collision with root package name */
    private static String[] f25687f;
    private static String[] g = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};

    public static double a(double d2) {
        double d3 = (double) ((long) (d2 * 1000000.0d));
        Double.isNaN(d3);
        return d3 / 1000000.0d;
    }

    public static float a(float f2) {
        double d2 = (double) f2;
        Double.isNaN(d2);
        double d3 = (double) ((long) (d2 * 100.0d));
        Double.isNaN(d3);
        return (float) (d3 / 100.0d);
    }

    public static float a(AMapLocation aMapLocation, AMapLocation aMapLocation2) {
        return a(new double[]{aMapLocation.getLatitude(), aMapLocation.getLongitude(), aMapLocation2.getLatitude(), aMapLocation2.getLongitude()});
    }

    public static float a(double[] dArr) {
        float[] fArr = new float[1];
        Location.distanceBetween(dArr[0], dArr[1], dArr[2], dArr[3], fArr);
        return fArr[0];
    }

    public static int a(int i) {
        return (i * 2) - 113;
    }

    public static int a(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnected()) {
            return networkInfo.getType();
        }
        return -1;
    }

    public static long a() {
        return System.currentTimeMillis();
    }

    public static Object a(Context context, String str) {
        Object obj;
        if (context == null) {
            return null;
        }
        try {
            obj = context.getApplicationContext().getSystemService(str);
        } catch (Throwable th) {
            ce.a(th, "Utils", "getServ");
            obj = null;
        }
        return obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(long r4, java.lang.String r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x0008
            java.lang.String r6 = "yyyy-MM-dd HH:mm:ss"
        L_0x0008:
            r0 = 0
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch:{ Throwable -> 0x0016 }
            java.util.Locale r2 = java.util.Locale.CHINA     // Catch:{ Throwable -> 0x0016 }
            r1.<init>(r6, r2)     // Catch:{ Throwable -> 0x0016 }
            r1.applyPattern(r6)     // Catch:{ Throwable -> 0x0014 }
            goto L_0x001f
        L_0x0014:
            r6 = move-exception
            goto L_0x0018
        L_0x0016:
            r6 = move-exception
            r1 = r0
        L_0x0018:
            java.lang.String r0 = "Utils"
            java.lang.String r2 = "formatUTC"
            com.loc.ce.a(r6, r0, r2)
        L_0x001f:
            r2 = 0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x0029
            long r4 = java.lang.System.currentTimeMillis()
        L_0x0029:
            if (r1 != 0) goto L_0x002e
            java.lang.String r4 = "NULL"
            return r4
        L_0x002e:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = r1.format(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.cn.a(long, java.lang.String):java.lang.String");
    }

    public static boolean a(long j, long j2) {
        String a2 = a(j, "yyyyMMddHH");
        String a3 = a(j2, "yyyyMMddHH");
        if ("NULL".equals(a2) || "NULL".equals(a3)) {
            return false;
        }
        return a2.equals(a3);
    }

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return c() < 17 ? c(context, "android.provider.Settings$System") : c(context, "android.provider.Settings$Global");
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.database.sqlite.SQLiteDatabase r6, java.lang.String r7) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r0 = "2.0.201501131131"
            java.lang.String r2 = "."
            java.lang.String r3 = ""
            java.lang.String r0 = r0.replace(r2, r3)
            if (r6 == 0) goto L_0x006e
            r2 = 1
            r3 = 0
            boolean r4 = r6.isOpen()     // Catch:{ Throwable -> 0x0066, all -> 0x005f }
            if (r4 != 0) goto L_0x001d
            goto L_0x006e
        L_0x001d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0066, all -> 0x005f }
            r4.<init>()     // Catch:{ Throwable -> 0x0066, all -> 0x005f }
            java.lang.String r5 = "SELECT count(*) as c FROM sqlite_master WHERE type = 'table' AND name = '"
            r4.append(r5)     // Catch:{ Throwable -> 0x0066, all -> 0x005f }
            java.lang.String r7 = r7.trim()     // Catch:{ Throwable -> 0x0066, all -> 0x005f }
            r4.append(r7)     // Catch:{ Throwable -> 0x0066, all -> 0x005f }
            r4.append(r0)     // Catch:{ Throwable -> 0x0066, all -> 0x005f }
            java.lang.String r7 = "' "
            r4.append(r7)     // Catch:{ Throwable -> 0x0066, all -> 0x005f }
            java.lang.String r7 = r4.toString()     // Catch:{ Throwable -> 0x0066, all -> 0x005f }
            android.database.Cursor r6 = r6.rawQuery(r7, r3)     // Catch:{ Throwable -> 0x0066, all -> 0x005f }
            if (r6 == 0) goto L_0x0051
            boolean r7 = r6.moveToFirst()     // Catch:{ Throwable -> 0x0067, all -> 0x004e }
            if (r7 == 0) goto L_0x0051
            int r7 = r6.getInt(r1)     // Catch:{ Throwable -> 0x0067, all -> 0x004e }
            if (r7 <= 0) goto L_0x0051
            r7 = 1
            goto L_0x0052
        L_0x004e:
            r7 = move-exception
            r3 = r6
            goto L_0x0060
        L_0x0051:
            r7 = 0
        L_0x0052:
            int r0 = r4.length()     // Catch:{ Throwable -> 0x0067, all -> 0x004e }
            r4.delete(r1, r0)     // Catch:{ Throwable -> 0x0067, all -> 0x004e }
            if (r6 == 0) goto L_0x006d
            r6.close()
            goto L_0x006d
        L_0x005f:
            r7 = move-exception
        L_0x0060:
            if (r3 == 0) goto L_0x0065
            r3.close()
        L_0x0065:
            throw r7
        L_0x0066:
            r6 = r3
        L_0x0067:
            if (r6 == 0) goto L_0x006c
            r6.close()
        L_0x006c:
            r7 = 1
        L_0x006d:
            return r7
        L_0x006e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.cn.a(android.database.sqlite.SQLiteDatabase, java.lang.String):boolean");
    }

    public static boolean a(AMapLocation aMapLocation) {
        if (aMapLocation != null && aMapLocation.getErrorCode() == 0) {
            return b(aMapLocation);
        }
        return false;
    }

    public static boolean a(AMapLocationServer aMapLocationServer) {
        if (aMapLocationServer != null && !"8".equals(aMapLocationServer.d()) && !"5".equals(aMapLocationServer.d()) && !"6".equals(aMapLocationServer.d())) {
            return b((AMapLocation) aMapLocationServer);
        }
        return false;
    }

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && !"00:00:00:00:00:00".equals(str) && !str.contains(" :");
    }

    public static boolean a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            ArrayList<String> d2 = d(str);
            String[] split = str2.toString().split("#");
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < split.length; i3++) {
                if (split[i3].contains(",nb") || split[i3].contains(",access")) {
                    i++;
                    if (d2.contains(split[i3])) {
                        i2++;
                    }
                }
            }
            double size = (double) (d2.size() + i);
            Double.isNaN(size);
            if (((double) (i2 * 2)) >= size * 0.618d) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(JSONObject jSONObject, String str) {
        return di.a(jSONObject, str);
    }

    public static byte[] a(int i, byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            bArr = new byte[2];
        }
        bArr[0] = (byte) (i & 255);
        bArr[1] = (byte) ((i & 65280) >> 8);
        return bArr;
    }

    public static byte[] a(long j) {
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) ((int) ((j >> (i * 8)) & 255));
        }
        return bArr;
    }

    public static byte[] a(byte[] bArr) {
        try {
            return di.b(bArr);
        } catch (Throwable th) {
            ce.a(th, "Utils", "gz");
            return null;
        }
    }

    public static String[] a(TelephonyManager telephonyManager) {
        int i;
        String networkOperator = telephonyManager != null ? telephonyManager.getNetworkOperator() : null;
        String[] strArr = {PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_NOTIFY};
        if (!TextUtils.isEmpty(networkOperator) && TextUtils.isDigitsOnly(networkOperator) && networkOperator.length() > 4) {
            strArr[0] = networkOperator.substring(0, 3);
            char[] charArray = networkOperator.substring(3).toCharArray();
            int i2 = 0;
            while (i2 < charArray.length && Character.isDigit(charArray[i2])) {
                i2++;
            }
            strArr[1] = networkOperator.substring(3, i2 + 3);
        }
        try {
            i = Integer.parseInt(strArr[0]);
        } catch (Throwable th) {
            ce.a(th, "Utils", "getMccMnc");
            i = 0;
        }
        if (i == 0) {
            strArr[0] = PushConstants.PUSH_TYPE_NOTIFY;
        }
        if (PushConstants.PUSH_TYPE_NOTIFY.equals(strArr[0]) || PushConstants.PUSH_TYPE_NOTIFY.equals(strArr[1])) {
            return (!PushConstants.PUSH_TYPE_NOTIFY.equals(strArr[0]) || !PushConstants.PUSH_TYPE_NOTIFY.equals(strArr[1]) || f25687f == null) ? strArr : f25687f;
        }
        f25687f = strArr;
        return strArr;
    }

    public static double b(double d2) {
        double d3 = (double) ((long) (d2 * 100.0d));
        Double.isNaN(d3);
        return d3 / 100.0d;
    }

    public static long b() {
        return SystemClock.elapsedRealtime();
    }

    public static String b(Context context) {
        PackageInfo packageInfo;
        if (!TextUtils.isEmpty(ce.g)) {
            return ce.g;
        }
        CharSequence charSequence = null;
        if (context == null) {
            return null;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(cy.c(context), 64);
        } catch (Throwable th) {
            ce.a(th, "Utils", "getAppName part");
            packageInfo = null;
        }
        try {
            if (TextUtils.isEmpty(ce.h)) {
                ce.h = null;
            }
        } catch (Throwable th2) {
            ce.a(th2, "Utils", "getAppName");
        }
        StringBuilder sb = new StringBuilder();
        if (packageInfo != null) {
            if (packageInfo.applicationInfo != null) {
                charSequence = packageInfo.applicationInfo.loadLabel(context.getPackageManager());
            }
            if (charSequence != null) {
                sb.append(charSequence.toString());
            }
            if (!TextUtils.isEmpty(packageInfo.versionName)) {
                sb.append(packageInfo.versionName);
            }
        }
        String c2 = cy.c(context);
        if (!TextUtils.isEmpty(c2)) {
            sb.append(",");
            sb.append(c2);
        }
        if (!TextUtils.isEmpty(ce.h)) {
            sb.append(",");
            sb.append(ce.h);
        }
        String sb2 = sb.toString();
        ce.g = sb2;
        return sb2;
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.zip.ZipInputStream] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:24|(1:26)|27|(4:28|29|30|(1:32)(1:77))|33|34|35|75|72) */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ae, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00af, code lost:
        r0 = r7;
        r7 = r8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00a2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037 A[LOOP:0: B:11:0x0037->B:72:0x0037, LOOP_START, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009f A[SYNTHETIC, Splitter:B:40:0x009f] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ae A[ExcHandler: all (r8v4 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:34:0x0095] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0037 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.lang.String r7, java.lang.String r8) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ Throwable -> 0x00b9 }
            r1.<init>(r7)     // Catch:{ Throwable -> 0x00b9 }
            boolean r7 = r1.exists()     // Catch:{ Throwable -> 0x00b9 }
            if (r7 == 0) goto L_0x00b6
            boolean r7 = r1.isDirectory()     // Catch:{ Throwable -> 0x00b9 }
            if (r7 == 0) goto L_0x0014
            goto L_0x00b6
        L_0x0014:
            java.lang.String r7 = java.io.File.separator     // Catch:{ Throwable -> 0x00b9 }
            boolean r7 = r8.endsWith(r7)     // Catch:{ Throwable -> 0x00b9 }
            if (r7 != 0) goto L_0x002d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00b9 }
            r7.<init>()     // Catch:{ Throwable -> 0x00b9 }
            r7.append(r8)     // Catch:{ Throwable -> 0x00b9 }
            java.lang.String r8 = java.io.File.separator     // Catch:{ Throwable -> 0x00b9 }
            r7.append(r8)     // Catch:{ Throwable -> 0x00b9 }
            java.lang.String r8 = r7.toString()     // Catch:{ Throwable -> 0x00b9 }
        L_0x002d:
            java.util.zip.ZipInputStream r7 = new java.util.zip.ZipInputStream     // Catch:{ Throwable -> 0x00b9 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x00b9 }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x00b9 }
            r7.<init>(r2)     // Catch:{ Throwable -> 0x00b9 }
        L_0x0037:
            java.util.zip.ZipEntry r1 = r7.getNextEntry()     // Catch:{ Throwable -> 0x00b2, all -> 0x00ae }
            if (r1 == 0) goto L_0x00a7
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r2]     // Catch:{ Exception -> 0x00a3, all -> 0x009c }
            java.lang.String r4 = r1.getName()     // Catch:{ Exception -> 0x00a3, all -> 0x009c }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x00a3, all -> 0x009c }
            if (r5 != 0) goto L_0x00a7
            java.lang.String r5 = "../"
            boolean r5 = r4.contains(r5)     // Catch:{ Exception -> 0x00a3, all -> 0x009c }
            if (r5 == 0) goto L_0x0054
            goto L_0x00a7
        L_0x0054:
            boolean r1 = r1.isDirectory()     // Catch:{ Exception -> 0x00a3, all -> 0x009c }
            if (r1 == 0) goto L_0x005b
            goto L_0x0037
        L_0x005b:
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x00a3, all -> 0x009c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a3, all -> 0x009c }
            r5.<init>()     // Catch:{ Exception -> 0x00a3, all -> 0x009c }
            r5.append(r8)     // Catch:{ Exception -> 0x00a3, all -> 0x009c }
            r5.append(r4)     // Catch:{ Exception -> 0x00a3, all -> 0x009c }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x00a3, all -> 0x009c }
            r1.<init>(r4)     // Catch:{ Exception -> 0x00a3, all -> 0x009c }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x00a3, all -> 0x009c }
            java.lang.String r5 = r1.getParent()     // Catch:{ Exception -> 0x00a3, all -> 0x009c }
            r4.<init>(r5)     // Catch:{ Exception -> 0x00a3, all -> 0x009c }
            boolean r5 = r4.exists()     // Catch:{ Exception -> 0x00a3, all -> 0x009c }
            if (r5 != 0) goto L_0x0081
            r4.mkdirs()     // Catch:{ Exception -> 0x00a3, all -> 0x009c }
        L_0x0081:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00a3, all -> 0x009c }
            r4.<init>(r1)     // Catch:{ Exception -> 0x00a3, all -> 0x009c }
        L_0x0086:
            r1 = 0
            int r5 = r7.read(r3, r1, r2)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            r6 = -1
            if (r5 == r6) goto L_0x0092
            r4.write(r3, r1, r5)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            goto L_0x0086
        L_0x0092:
            r4.flush()     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
        L_0x0095:
            r4.close()     // Catch:{ Throwable -> 0x0037, all -> 0x00ae }
            goto L_0x0037
        L_0x0099:
            r8 = move-exception
            r0 = r4
            goto L_0x009d
        L_0x009c:
            r8 = move-exception
        L_0x009d:
            if (r0 == 0) goto L_0x00a2
            r0.close()     // Catch:{ Throwable -> 0x00a2, all -> 0x00ae }
        L_0x00a2:
            throw r8     // Catch:{ Throwable -> 0x00b2, all -> 0x00ae }
        L_0x00a3:
            r4 = r0
        L_0x00a4:
            if (r4 == 0) goto L_0x0037
            goto L_0x0095
        L_0x00a7:
            r7.closeEntry()     // Catch:{ Throwable -> 0x00ad }
            r7.close()     // Catch:{ Throwable -> 0x00ad }
        L_0x00ad:
            return
        L_0x00ae:
            r8 = move-exception
            r0 = r7
            r7 = r8
            goto L_0x00ca
        L_0x00b2:
            r8 = move-exception
            r0 = r7
            r7 = r8
            goto L_0x00ba
        L_0x00b6:
            return
        L_0x00b7:
            r7 = move-exception
            goto L_0x00ca
        L_0x00b9:
            r7 = move-exception
        L_0x00ba:
            java.lang.String r8 = "Utils"
            java.lang.String r1 = "unZip"
            com.loc.ce.a(r7, r8, r1)     // Catch:{ all -> 0x00b7 }
            if (r0 == 0) goto L_0x00c9
            r0.closeEntry()     // Catch:{ Throwable -> 0x00c9 }
            r0.close()     // Catch:{ Throwable -> 0x00c9 }
        L_0x00c9:
            return
        L_0x00ca:
            if (r0 == 0) goto L_0x00d2
            r0.closeEntry()     // Catch:{ Throwable -> 0x00d2 }
            r0.close()     // Catch:{ Throwable -> 0x00d2 }
        L_0x00d2:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.cn.b(java.lang.String, java.lang.String):void");
    }

    public static boolean b(long j, long j2) {
        String a2 = a(j, "yyyyMMdd");
        String a3 = a(j2, "yyyyMMdd");
        if ("NULL".equals(a2) || "NULL".equals(a3)) {
            return false;
        }
        return a2.equals(a3);
    }

    public static boolean b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean b(AMapLocation aMapLocation) {
        double longitude = aMapLocation.getLongitude();
        double latitude = aMapLocation.getLatitude();
        return !(longitude == 0.0d && latitude == 0.0d) && longitude <= 180.0d && latitude <= 90.0d && longitude >= -180.0d && latitude >= -90.0d;
    }

    public static byte[] b(int i, byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            bArr = new byte[4];
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = (byte) ((i >> (i2 * 8)) & 255);
        }
        return bArr;
    }

    public static byte[] b(String str) {
        return a(Integer.parseInt(str), (byte[]) null);
    }

    public static double c(double d2) {
        double d3 = (double) ((long) (d2 * 1000000.0d));
        Double.isNaN(d3);
        return d3 / 1000000.0d;
    }

    public static int c() {
        if (f25686e > 0) {
            return f25686e;
        }
        int i = 0;
        try {
            i = ch.b("android.os.Build$VERSION", "SDK_INT");
        } catch (Throwable unused) {
        }
        return i;
    }

    public static NetworkInfo c(Context context) {
        try {
            return dc.r(context);
        } catch (Throwable th) {
            ce.a(th, "Utils", "getNetWorkInfo");
            return null;
        }
    }

    private static boolean c(Context context, String str) throws Throwable {
        return ((Integer) ch.a(str, "getInt", new Object[]{context.getContentResolver(), ((String) ch.a(str, "AIRPLANE_MODE_ON")).toString()}, (Class<?>[]) new Class[]{ContentResolver.class, String.class})).intValue() == 1;
    }

    public static boolean c(String str, String str2) {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            return false;
        }
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory() && file2.getName().equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] c(String str) {
        return b(Integer.parseInt(str), (byte[]) null);
    }

    public static String d() {
        try {
            return dd.b("S128DF1572465B890OE3F7A13167KLEI".getBytes("UTF-8")).substring(20);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static ArrayList<String> d(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("#");
            for (int i = 0; i < split.length; i++) {
                if (split[i].contains(",nb") || split[i].contains(",access")) {
                    arrayList.add(split[i]);
                }
            }
        }
        return arrayList;
    }

    public static boolean d(Context context) {
        try {
            NetworkInfo c2 = c(context);
            if (c2 != null && c2.isConnectedOrConnecting()) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static String e() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return null;
        }
        return Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "amap" + File.separator + "openamaplocationsdk" + File.separator;
    }

    public static void e(String str) {
        try {
            if (!str.endsWith(File.separator)) {
                str = str + File.separator;
            }
            File file = new File(str);
            if (file.exists()) {
                if (file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        if (file2.isDirectory()) {
                            e(file2.getAbsolutePath());
                        } else {
                            file2.delete();
                        }
                    }
                    file.delete();
                }
            }
        } catch (Throwable th) {
            a.b(th);
        }
    }

    public static boolean e(Context context) {
        try {
            Iterator<ActivityManager.RunningAppProcessInfo> it2 = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it2.next();
                if (next.processName.equals(cy.c(context))) {
                    if (next.importance != 100) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            ce.a(th, "Utils", "isApplicationBroughtToBackground");
            return true;
        }
    }

    public static double f(String str) throws NumberFormatException {
        return Double.parseDouble(str);
    }

    public static boolean f(Context context) {
        int i;
        if (Build.VERSION.SDK_INT < 23 || context.getApplicationInfo().targetSdkVersion < 23) {
            for (String checkCallingOrSelfPermission : g) {
                if (context.checkCallingOrSelfPermission(checkCallingOrSelfPermission) != 0) {
                    return false;
                }
            }
        } else {
            Application application = (Application) context;
            for (String str : g) {
                try {
                    i = ch.b(application.getBaseContext(), "checkSelfPermission", str);
                } catch (Throwable unused) {
                    i = 0;
                }
                if (i != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int g(String str) throws NumberFormatException {
        return Integer.parseInt(str);
    }

    @SuppressLint({"NewApi"})
    public static boolean g(Context context) {
        boolean z;
        boolean z2;
        if (context == null) {
            return true;
        }
        if (f25684c == null) {
            f25684c = (WifiManager) a(context, "wifi");
        }
        try {
            z = f25684c.isWifiEnabled();
        } catch (Throwable unused) {
            z = false;
        }
        if (!z && c() > 17) {
            try {
                z2 = "true".equals(String.valueOf(ch.a(f25684c, "isScanAlwaysAvailable", new Object[0])));
            } catch (Throwable unused2) {
            }
            return z2;
        }
        z2 = z;
        return z2;
    }
}
