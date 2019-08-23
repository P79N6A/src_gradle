package com.amap.api.services.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class bj {

    /* renamed from: a  reason: collision with root package name */
    static String f6634a = "";

    /* renamed from: b  reason: collision with root package name */
    static String f6635b = "";

    /* renamed from: c  reason: collision with root package name */
    static String f6636c = "";

    /* renamed from: d  reason: collision with root package name */
    static boolean f6637d = false;

    /* renamed from: e  reason: collision with root package name */
    static int f6638e = -1;

    /* renamed from: f  reason: collision with root package name */
    static String f6639f = "";
    static String g = "";
    private static String h = null;
    private static boolean i = false;
    private static String j = "";
    private static String k = "";
    private static String l = "";
    private static String m = "";
    private static String n = "";
    private static boolean o = false;
    private static String p = "";

    public static String a() {
        return h;
    }

    public static void b() {
        try {
            if (Build.VERSION.SDK_INT > 14) {
                TrafficStats.class.getDeclaredMethod("setThreadStatsTag", new Class[]{Integer.TYPE}).invoke(null, new Object[]{40964});
            }
        } catch (Throwable th) {
            ca.c(th, "dI", "sag");
        }
    }

    public static String c() {
        if (!TextUtils.isEmpty(k)) {
            return k;
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                return (String) bo.a(Build.class, "MZ2V0U2VyaWFs", (Class<?>[]) new Class[0]).invoke(Build.class, new Object[0]);
            }
            if (Build.VERSION.SDK_INT >= 9) {
                k = Build.SERIAL;
            }
            if (k == null) {
                return "";
            }
            return k;
        } catch (Throwable unused) {
        }
    }

    private static String d() {
        try {
            for (T t : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (t.getName().equalsIgnoreCase("wlan0")) {
                    byte[] bArr = null;
                    if (Build.VERSION.SDK_INT >= 9) {
                        bArr = t.getHardwareAddress();
                    }
                    if (bArr == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte b2 : bArr) {
                        String upperCase = Integer.toHexString(b2 & 255).toUpperCase();
                        if (upperCase.length() == 1) {
                            sb.append(PushConstants.PUSH_TYPE_NOTIFY);
                        }
                        sb.append(upperCase);
                        sb.append(":");
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
        } catch (Exception e2) {
            ca.c(e2, "dI", "gMr");
        }
        return "";
    }

    public static String c(Context context) {
        try {
            return y(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String d(Context context) {
        try {
            return B(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int e(Context context) {
        try {
            return C(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int f(Context context) {
        try {
            return z(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String g(Context context) {
        try {
            return x(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    private static ConnectivityManager A(Context context) {
        return (ConnectivityManager) context.getSystemService("connectivity");
    }

    private static TelephonyManager D(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static int o(Context context) {
        try {
            return C(context);
        } catch (Throwable th) {
            ca.c(th, "dI", "gNT");
            return -1;
        }
    }

    public static int p(Context context) {
        try {
            return z(context);
        } catch (Throwable th) {
            bx.a(th, "dI", "gAT");
            return -1;
        }
    }

    public static String u(Context context) {
        try {
            return x(context);
        } catch (Throwable th) {
            bx.a(th, "dI", "gSd");
            return "";
        }
    }

    static String v(Context context) {
        try {
            return y(context);
        } catch (Throwable th) {
            ca.c(th, "dI", "gNNa");
            return "";
        }
    }

    private static String B(Context context) {
        String u = u(context);
        if (u == null || u.length() < 5) {
            return "";
        }
        return u.substring(3, 5);
    }

    private static int C(Context context) {
        if (!a(context, bo.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
            return -1;
        }
        TelephonyManager D = D(context);
        if (D == null) {
            return -1;
        }
        return D.getNetworkType();
    }

    public static NetworkInfo q(Context context) {
        if (!a(context, bo.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF"))) {
            return null;
        }
        ConnectivityManager A = A(context);
        if (A == null) {
            return null;
        }
        return A.getActiveNetworkInfo();
    }

    static String r(Context context) {
        String str;
        try {
            NetworkInfo q = q(context);
            if (q == null) {
                return null;
            }
            str = q.getExtraInfo();
            return str;
        } catch (Throwable th) {
            ca.c(th, "dI", "gne");
            str = null;
        }
    }

    private static List<ScanResult> a(List<ScanResult> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size - 1; i2++) {
            for (int i3 = 1; i3 < size - i2; i3++) {
                int i4 = i3 - 1;
                if (list.get(i4).level > list.get(i3).level) {
                    list.set(i4, list.get(i3));
                    list.set(i3, list.get(i4));
                }
            }
        }
        return list;
    }

    public static String i(Context context) {
        if (!TextUtils.isEmpty(j)) {
            return j;
        }
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), bo.c(new String(bv.a(13))));
            j = string;
            if (string == null) {
                return "";
            }
            return j;
        } catch (Throwable unused) {
            return j;
        }
    }

    static String j(Context context) {
        String str = "";
        if (context != null) {
            try {
                if (a(context, bo.c("WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF"))) {
                    WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                    if (wifiManager == null) {
                        return str;
                    }
                    if (wifiManager.isWifiEnabled()) {
                        str = wifiManager.getConnectionInfo().getBSSID();
                    }
                    return str;
                }
            } catch (Throwable th) {
                bx.a(th, "dI", "gcW");
            }
        }
        return str;
    }

    static String n(Context context) {
        String str;
        try {
            if (!a(context, bo.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
                return "";
            }
            TelephonyManager D = D(context);
            if (D == null) {
                return "";
            }
            String networkOperator = D.getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator)) {
                if (networkOperator.length() >= 3) {
                    str = networkOperator.substring(3);
                    return str;
                }
            }
            return "";
        } catch (Throwable th) {
            ca.c(th, "dI", "gNC");
            str = "";
        }
    }

    private static String y(Context context) {
        if (!a(context, bo.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
            return null;
        }
        TelephonyManager D = D(context);
        if (D == null) {
            return "";
        }
        String simOperatorName = D.getSimOperatorName();
        if (TextUtils.isEmpty(simOperatorName)) {
            simOperatorName = D.getNetworkOperatorName();
        }
        return simOperatorName;
    }

    private static int z(Context context) {
        if (context == null || !a(context, bo.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF"))) {
            return -1;
        }
        ConnectivityManager A = A(context);
        if (A == null) {
            return -1;
        }
        NetworkInfo activeNetworkInfo = A.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return -1;
        }
        return activeNetworkInfo.getType();
    }

    public static String a(Context context) {
        try {
            if (!TextUtils.isEmpty(f6636c)) {
                return f6636c;
            }
            bn a2 = bv.a();
            if (cm.a(context, a2)) {
                Class a3 = cm.a(context, a2, bo.c("WY29tLmFtYXAuYXBpLmFpdW5ldC5OZXRSZXVlc3RQYXJhbQ"));
                if (a3 != null) {
                    f6636c = (String) a3.getMethod("getAdiuExtras", new Class[0]).invoke(a3, new Object[0]);
                }
                return f6636c;
            }
            return "";
        } catch (Throwable th) {
            ca.c(th, "dI", "aiuEx");
        }
    }

    public static String b(final Context context) {
        try {
            if (!TextUtils.isEmpty(f6635b)) {
                return f6635b;
            }
            bn a2 = bv.a();
            if (a2 == null) {
                return null;
            }
            if (cm.a(context, a2)) {
                final Class a3 = cm.a(context, a2, bo.c("WY29tLmFtYXAuYXBpLmFpdW5ldC5OZXRSZXVlc3RQYXJhbQ"));
                if (a3 == null) {
                    return f6635b;
                }
                String str = (String) a3.getMethod("getADIU", new Class[]{Context.class}).invoke(a3, new Object[]{context});
                if (!TextUtils.isEmpty(str)) {
                    f6635b = str;
                    return str;
                } else if (!i) {
                    i = true;
                    ca.c().submit(new Runnable() {
                        public final void run() {
                            try {
                                Map map = (Map) a3.getMethod("getGetParams", new Class[0]).invoke(a3, new Object[0]);
                                if (map != null) {
                                    String str = (String) a3.getMethod("getPostParam", new Class[]{String.class, String.class, String.class, String.class}).invoke(a3, new Object[]{bj.h(context), bj.t(context), bj.l(context), bj.u(context)});
                                    if (!TextUtils.isEmpty(str)) {
                                        byte[] a2 = db.a().a(new da(str.getBytes(), map));
                                        a3.getMethod("parseResult", new Class[]{Context.class, String.class}).invoke(a3, new Object[]{context, new String(a2)});
                                    }
                                }
                            } catch (Throwable th) {
                                ca.c(th, "dI", "aiun");
                            }
                        }
                    });
                }
            }
            return "";
        } catch (Throwable th) {
            ca.c(th, "dI", "aiu");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:7|(1:9)|10|(2:14|15)|16|17|18|(2:21|22)(2:23|24)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0036 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String h(android.content.Context r2) {
        /*
            java.lang.String r0 = f6634a     // Catch:{ Throwable -> 0x0036 }
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = ""
            java.lang.String r1 = f6634a     // Catch:{ Throwable -> 0x0036 }
            boolean r0 = r0.equals(r1)     // Catch:{ Throwable -> 0x0036 }
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = f6634a     // Catch:{ Throwable -> 0x0036 }
            return r0
        L_0x0011:
            java.lang.String r0 = "android.permission.WRITE_SETTINGS"
            boolean r0 = a(r2, r0)     // Catch:{ Throwable -> 0x0036 }
            if (r0 == 0) goto L_0x0025
            android.content.ContentResolver r0 = r2.getContentResolver()     // Catch:{ Throwable -> 0x0036 }
            java.lang.String r1 = "mqBRboGZkQPcAkyk"
            java.lang.String r0 = android.provider.Settings.System.getString(r0, r1)     // Catch:{ Throwable -> 0x0036 }
            f6634a = r0     // Catch:{ Throwable -> 0x0036 }
        L_0x0025:
            java.lang.String r0 = f6634a     // Catch:{ Throwable -> 0x0036 }
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = ""
            java.lang.String r1 = f6634a     // Catch:{ Throwable -> 0x0036 }
            boolean r0 = r0.equals(r1)     // Catch:{ Throwable -> 0x0036 }
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = f6634a     // Catch:{ Throwable -> 0x0036 }
            return r0
        L_0x0036:
            java.lang.String r2 = w(r2)     // Catch:{ Throwable -> 0x003c }
            f6634a = r2     // Catch:{ Throwable -> 0x003c }
        L_0x003c:
            java.lang.String r2 = f6634a
            if (r2 != 0) goto L_0x0043
            java.lang.String r2 = ""
            return r2
        L_0x0043:
            java.lang.String r2 = f6634a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.a.bj.h(android.content.Context):java.lang.String");
    }

    static String k(Context context) {
        StringBuilder sb = new StringBuilder();
        if (context != null) {
            try {
                if (a(context, bo.c("WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF"))) {
                    WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                    if (wifiManager == null) {
                        return "";
                    }
                    if (wifiManager.isWifiEnabled()) {
                        List<ScanResult> scanResults = wifiManager.getScanResults();
                        if (scanResults != null) {
                            if (scanResults.size() != 0) {
                                List<ScanResult> a2 = a(scanResults);
                                int i2 = 0;
                                boolean z = true;
                                while (i2 < a2.size() && i2 < 7) {
                                    ScanResult scanResult = a2.get(i2);
                                    if (z) {
                                        z = false;
                                    } else {
                                        sb.append(";");
                                    }
                                    sb.append(scanResult.BSSID);
                                    i2++;
                                }
                            }
                        }
                        return sb.toString();
                    }
                    return sb.toString();
                }
            } catch (Throwable th) {
                ca.c(th, "dI", "gWs");
            }
        }
        return sb.toString();
    }

    public static String l(Context context) {
        try {
            if (l != null && !"".equals(l)) {
                return l;
            }
            if (!a(context, bo.c("WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF"))) {
                return l;
            }
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager == null) {
                return "";
            }
            l = wifiManager.getConnectionInfo().getMacAddress();
            if (bo.c("YMDI6MDA6MDA6MDA6MDA6MDA").equals(l) || bo.c("YMDA6MDA6MDA6MDA6MDA6MDA").equals(l)) {
                l = d();
            }
            return l;
        } catch (Throwable th) {
            ca.c(th, "dI", "gDc");
        }
    }

    static String s(Context context) {
        StringBuilder sb;
        try {
            if (m != null && !"".equals(m)) {
                return m;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null) {
                return "";
            }
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            int i2 = displayMetrics.widthPixels;
            int i3 = displayMetrics.heightPixels;
            if (i3 > i2) {
                sb = new StringBuilder();
                sb.append(i2);
                sb.append("*");
                sb.append(i3);
            } else {
                sb = new StringBuilder();
                sb.append(i3);
                sb.append("*");
                sb.append(i2);
            }
            m = sb.toString();
            return m;
        } catch (Throwable th) {
            ca.c(th, "dI", "gR");
        }
    }

    public static String t(Context context) {
        try {
            if (n != null && !"".equals(n)) {
                return n;
            }
            if (!a(context, bo.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
                return n;
            }
            TelephonyManager D = D(context);
            if (D == null) {
                return "";
            }
            Method a2 = bo.a((Class) D.getClass(), "QZ2V0RGV2aWNlSWQ", (Class<?>[]) new Class[0]);
            if (a2 != null) {
                n = (String) a2.invoke(D, new Object[0]);
            }
            if (n == null) {
                n = "";
            }
            return n;
        } catch (Throwable th) {
            ca.c(th, "dI", "gd");
        }
    }

    private static String x(Context context) throws InvocationTargetException, IllegalAccessException {
        if (p != null && !"".equals(p)) {
            return p;
        }
        if (!a(context, bo.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
            return p;
        }
        TelephonyManager D = D(context);
        if (D == null) {
            return "";
        }
        Method a2 = bo.a((Class) D.getClass(), "UZ2V0U3Vic2NyaWJlcklk", (Class<?>[]) new Class[0]);
        if (a2 != null) {
            p = (String) a2.invoke(D, new Object[0]);
        }
        if (p == null) {
            p = "";
        }
        return p;
    }

    static String[] m(Context context) {
        try {
            if (a(context, bo.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
                if (a(context, bo.c("EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04="))) {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager == null) {
                        return new String[]{"", ""};
                    }
                    CellLocation cellLocation = telephonyManager.getCellLocation();
                    if (cellLocation instanceof GsmCellLocation) {
                        GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                        int cid = gsmCellLocation.getCid();
                        int lac = gsmCellLocation.getLac();
                        return new String[]{lac + "||" + cid, "gsm"};
                    }
                    if (cellLocation instanceof CdmaCellLocation) {
                        CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                        int systemId = cdmaCellLocation.getSystemId();
                        int networkId = cdmaCellLocation.getNetworkId();
                        int baseStationId = cdmaCellLocation.getBaseStationId();
                        return new String[]{systemId + "||" + networkId + "||" + baseStationId, "cdma"};
                    }
                    return new String[]{"", ""};
                }
            }
            return new String[]{"", ""};
        } catch (Throwable th) {
            bx.a(th, "dI", "cf");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008f, code lost:
        if (r0 != null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009c, code lost:
        if (r0 != null) goto L_0x0091;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0098 A[SYNTHETIC, Splitter:B:45:0x0098] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String w(android.content.Context r8) {
        /*
            r0 = 0
            java.lang.String r1 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r8 = com.amap.api.services.a.bo.a((android.content.Context) r8, (java.lang.String) r1)     // Catch:{ Throwable -> 0x009c, all -> 0x0095 }
            if (r8 == 0) goto L_0x008f
            java.lang.String r8 = "mounted"
            java.lang.String r1 = android.os.Environment.getExternalStorageState()     // Catch:{ Throwable -> 0x009c, all -> 0x0095 }
            boolean r8 = r8.equals(r1)     // Catch:{ Throwable -> 0x009c, all -> 0x0095 }
            if (r8 == 0) goto L_0x008f
            java.io.File r8 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Throwable -> 0x009c, all -> 0x0095 }
            java.lang.String r8 = r8.getAbsolutePath()     // Catch:{ Throwable -> 0x009c, all -> 0x0095 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x009c, all -> 0x0095 }
            r1.<init>()     // Catch:{ Throwable -> 0x009c, all -> 0x0095 }
            r1.append(r8)     // Catch:{ Throwable -> 0x009c, all -> 0x0095 }
            java.lang.String r8 = "/.UTSystemConfig/Global/Alvin2.xml"
            r1.append(r8)     // Catch:{ Throwable -> 0x009c, all -> 0x0095 }
            java.lang.String r8 = r1.toString()     // Catch:{ Throwable -> 0x009c, all -> 0x0095 }
            java.io.File r1 = new java.io.File     // Catch:{ Throwable -> 0x009c, all -> 0x0095 }
            r1.<init>(r8)     // Catch:{ Throwable -> 0x009c, all -> 0x0095 }
            org.xmlpull.v1.XmlPullParser r8 = android.util.Xml.newPullParser()     // Catch:{ Throwable -> 0x009c, all -> 0x0095 }
            int r2 = r8.getEventType()     // Catch:{ Throwable -> 0x009c, all -> 0x0095 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x009c, all -> 0x0095 }
            r3.<init>(r1)     // Catch:{ Throwable -> 0x009c, all -> 0x0095 }
            java.lang.String r0 = "utf-8"
            r8.setInput(r3, r0)     // Catch:{ Throwable -> 0x008d, all -> 0x008a }
            r0 = 0
            r1 = 0
        L_0x0047:
            r4 = 1
            if (r4 == r2) goto L_0x0088
            if (r2 == 0) goto L_0x0083
            switch(r2) {
                case 2: goto L_0x005c;
                case 3: goto L_0x005a;
                case 4: goto L_0x0050;
                default: goto L_0x004f;
            }     // Catch:{ Throwable -> 0x008d, all -> 0x008a }
        L_0x004f:
            goto L_0x0083
        L_0x0050:
            if (r1 == 0) goto L_0x0083
            java.lang.String r8 = r8.getText()     // Catch:{ Throwable -> 0x008d, all -> 0x008a }
            r3.close()     // Catch:{ Throwable -> 0x0059 }
        L_0x0059:
            return r8
        L_0x005a:
            r1 = 0
            goto L_0x0083
        L_0x005c:
            int r2 = r8.getAttributeCount()     // Catch:{ Throwable -> 0x008d, all -> 0x008a }
            if (r2 <= 0) goto L_0x0083
            int r2 = r8.getAttributeCount()     // Catch:{ Throwable -> 0x008d, all -> 0x008a }
            r5 = r1
            r1 = 0
        L_0x0068:
            if (r1 >= r2) goto L_0x0082
            java.lang.String r6 = r8.getAttributeValue(r1)     // Catch:{ Throwable -> 0x008d, all -> 0x008a }
            java.lang.String r7 = "UTDID2"
            boolean r7 = r7.equals(r6)     // Catch:{ Throwable -> 0x008d, all -> 0x008a }
            if (r7 != 0) goto L_0x007e
            java.lang.String r7 = "UTDID"
            boolean r6 = r7.equals(r6)     // Catch:{ Throwable -> 0x008d, all -> 0x008a }
            if (r6 == 0) goto L_0x007f
        L_0x007e:
            r5 = 1
        L_0x007f:
            int r1 = r1 + 1
            goto L_0x0068
        L_0x0082:
            r1 = r5
        L_0x0083:
            int r2 = r8.next()     // Catch:{ Throwable -> 0x008d, all -> 0x008a }
            goto L_0x0047
        L_0x0088:
            r0 = r3
            goto L_0x008f
        L_0x008a:
            r8 = move-exception
            r0 = r3
            goto L_0x0096
        L_0x008d:
            r0 = r3
            goto L_0x009c
        L_0x008f:
            if (r0 == 0) goto L_0x009f
        L_0x0091:
            r0.close()     // Catch:{ Throwable -> 0x009f }
            goto L_0x009f
        L_0x0095:
            r8 = move-exception
        L_0x0096:
            if (r0 == 0) goto L_0x009b
            r0.close()     // Catch:{ Throwable -> 0x009b }
        L_0x009b:
            throw r8
        L_0x009c:
            if (r0 == 0) goto L_0x009f
            goto L_0x0091
        L_0x009f:
            java.lang.String r8 = ""
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.a.bj.w(android.content.Context):java.lang.String");
    }

    private static boolean a(Context context, String str) {
        if (context == null || context.checkCallingOrSelfPermission(str) != 0) {
            return false;
        }
        return true;
    }
}
