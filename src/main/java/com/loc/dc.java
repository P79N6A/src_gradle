package com.loc;

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
import com.google.a.a.a.a.a.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class dc {

    /* renamed from: a  reason: collision with root package name */
    static String f25780a = "";

    /* renamed from: b  reason: collision with root package name */
    static String f25781b = "";

    /* renamed from: c  reason: collision with root package name */
    static String f25782c = "";

    /* renamed from: d  reason: collision with root package name */
    static int f25783d = -1;

    /* renamed from: e  reason: collision with root package name */
    static String f25784e = "";

    /* renamed from: f  reason: collision with root package name */
    static String f25785f = "";
    private static String g = null;
    private static boolean h = false;
    private static String i = "";
    private static String j = "";
    private static String k = "";
    private static String l = "";
    private static String m = "";
    private static String n = "";

    private static int A(Context context) {
        if (context == null || !a(context, di.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF"))) {
            return -1;
        }
        ConnectivityManager B = B(context);
        if (B == null) {
            return -1;
        }
        NetworkInfo activeNetworkInfo = B.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return -1;
        }
        return activeNetworkInfo.getType();
    }

    private static ConnectivityManager B(Context context) {
        return (ConnectivityManager) context.getSystemService("connectivity");
    }

    private static int C(Context context) {
        if (!a(context, di.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
            return -1;
        }
        TelephonyManager D = D(context);
        if (D == null) {
            return -1;
        }
        return D.getNetworkType();
    }

    private static TelephonyManager D(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static String a() {
        return g;
    }

    public static String a(Context context) {
        try {
            if (!TextUtils.isEmpty(f25782c)) {
                return f25782c;
            }
            dh a2 = d.a();
            if (t.b(context, a2)) {
                Class a3 = t.a(context, a2, di.c("WY29tLmFtYXAuYXBpLmFpdW5ldC5OZXRSZXVlc3RQYXJhbQ"));
                if (a3 != null) {
                    f25782c = (String) a3.getMethod("getAdiuExtras", new Class[0]).invoke(a3, new Object[0]);
                }
                return f25782c;
            }
            return "";
        } catch (Throwable th) {
            i.b(th, "dI", "aiuEx");
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

    public static void a(String str) {
        g = str;
    }

    private static boolean a(Context context, String str) {
        return context != null && context.checkCallingOrSelfPermission(str) == 0;
    }

    public static String b(final Context context) {
        try {
            if (!TextUtils.isEmpty(f25781b)) {
                return f25781b;
            }
            dh a2 = d.a();
            if (a2 == null) {
                return null;
            }
            if (t.b(context, a2)) {
                final Class a3 = t.a(context, a2, di.c("WY29tLmFtYXAuYXBpLmFpdW5ldC5OZXRSZXVlc3RQYXJhbQ"));
                if (a3 == null) {
                    return f25781b;
                }
                String str = (String) a3.getMethod("getADIU", new Class[]{Context.class}).invoke(a3, new Object[]{context});
                if (!TextUtils.isEmpty(str)) {
                    f25781b = str;
                    return str;
                } else if (!h) {
                    h = true;
                    i.d().submit(new Runnable() {
                        public final void run() {
                            try {
                                Map map = (Map) a3.getMethod("getGetParams", new Class[0]).invoke(a3, new Object[0]);
                                if (map != null) {
                                    String str = (String) a3.getMethod("getPostParam", new Class[]{String.class, String.class, String.class, String.class}).invoke(a3, new Object[]{dc.h(context), dc.u(context), dc.l(context), dc.v(context)});
                                    if (!TextUtils.isEmpty(str)) {
                                        ah.a();
                                        byte[] a2 = ah.a(new ag(str.getBytes(), map));
                                        a3.getMethod("parseResult", new Class[]{Context.class, String.class}).invoke(a3, new Object[]{context, new String(a2)});
                                    }
                                }
                            } catch (Throwable th) {
                                i.b(th, "dI", "aiun");
                            }
                        }
                    });
                }
            }
            return "";
        } catch (Throwable th) {
            i.b(th, "dI", "aiu");
        }
    }

    public static void b() {
        try {
            if (Build.VERSION.SDK_INT > 14) {
                TrafficStats.class.getDeclaredMethod("setThreadStatsTag", new Class[]{Integer.TYPE}).invoke(null, new Object[]{40964});
            }
        } catch (Throwable th) {
            i.b(th, "dI", "sag");
        }
    }

    public static String c() {
        if (!TextUtils.isEmpty(j)) {
            return j;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                return (String) di.a(Build.class, "MZ2V0U2VyaWFs", (Class<?>[]) new Class[0]).invoke(Build.class, new Object[0]);
            }
            if (Build.VERSION.SDK_INT >= 9) {
                j = Build.SERIAL;
            }
            return j == null ? "" : j;
        } catch (Throwable unused) {
        }
    }

    public static String c(Context context) {
        try {
            return z(context);
        } catch (Throwable th) {
            a.b(th);
            return "";
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
            i.b((Throwable) e2, "dI", "gMr");
        }
        return "";
    }

    public static String d(Context context) {
        try {
            String v = v(context);
            if (v != null) {
                if (v.length() >= 5) {
                    return v.substring(3, 5);
                }
            }
            return "";
        } catch (Throwable th) {
            a.b(th);
            return "";
        }
    }

    public static int e(Context context) {
        try {
            return C(context);
        } catch (Throwable th) {
            a.b(th);
            return -1;
        }
    }

    public static int f(Context context) {
        try {
            return A(context);
        } catch (Throwable th) {
            a.b(th);
            return -1;
        }
    }

    public static String g(Context context) {
        try {
            return y(context);
        } catch (Throwable th) {
            a.b(th);
            return "";
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
            java.lang.String r0 = f25780a     // Catch:{ Throwable -> 0x0036 }
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = ""
            java.lang.String r1 = f25780a     // Catch:{ Throwable -> 0x0036 }
            boolean r0 = r0.equals(r1)     // Catch:{ Throwable -> 0x0036 }
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = f25780a     // Catch:{ Throwable -> 0x0036 }
            return r0
        L_0x0011:
            java.lang.String r0 = "android.permission.WRITE_SETTINGS"
            boolean r0 = a(r2, r0)     // Catch:{ Throwable -> 0x0036 }
            if (r0 == 0) goto L_0x0025
            android.content.ContentResolver r0 = r2.getContentResolver()     // Catch:{ Throwable -> 0x0036 }
            java.lang.String r1 = "mqBRboGZkQPcAkyk"
            java.lang.String r0 = android.provider.Settings.System.getString(r0, r1)     // Catch:{ Throwable -> 0x0036 }
            f25780a = r0     // Catch:{ Throwable -> 0x0036 }
        L_0x0025:
            java.lang.String r0 = f25780a     // Catch:{ Throwable -> 0x0036 }
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = ""
            java.lang.String r1 = f25780a     // Catch:{ Throwable -> 0x0036 }
            boolean r0 = r0.equals(r1)     // Catch:{ Throwable -> 0x0036 }
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = f25780a     // Catch:{ Throwable -> 0x0036 }
            return r0
        L_0x0036:
            java.lang.String r2 = x(r2)     // Catch:{ Throwable -> 0x003c }
            f25780a = r2     // Catch:{ Throwable -> 0x003c }
        L_0x003c:
            java.lang.String r2 = f25780a
            if (r2 != 0) goto L_0x0043
            java.lang.String r2 = ""
            return r2
        L_0x0043:
            java.lang.String r2 = f25780a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.dc.h(android.content.Context):java.lang.String");
    }

    public static String i(Context context) {
        if (!TextUtils.isEmpty(i)) {
            return i;
        }
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), di.c(new String(d.a(13))));
            i = string;
            return string == null ? "" : i;
        } catch (Throwable unused) {
            return i;
        }
    }

    static String j(Context context) {
        String str = "";
        if (context != null) {
            try {
                if (a(context, di.c("WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF"))) {
                    WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                    if (wifiManager == null) {
                        return str;
                    }
                    if (wifiManager.isWifiEnabled()) {
                        str = wifiManager.getConnectionInfo().getBSSID();
                    }
                }
            } catch (Throwable th) {
                f.a(th, "dI", "gcW");
            }
        }
        return str;
    }

    static String k(Context context) {
        StringBuilder sb = new StringBuilder();
        if (context != null) {
            try {
                if (a(context, di.c("WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF"))) {
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
                i.b(th, "dI", "gWs");
            }
        }
        return sb.toString();
    }

    public static String l(Context context) {
        try {
            if (k != null && !"".equals(k)) {
                return k;
            }
            if (!a(context, di.c("WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF"))) {
                return k;
            }
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager == null) {
                return "";
            }
            k = wifiManager.getConnectionInfo().getMacAddress();
            if (di.c("YMDI6MDA6MDA6MDA6MDA6MDA").equals(k) || di.c("YMDA6MDA6MDA6MDA6MDA6MDA").equals(k)) {
                k = d();
            }
            return k;
        } catch (Throwable th) {
            i.b(th, "dI", "gDc");
        }
    }

    static String[] m(Context context) {
        try {
            if (a(context, di.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
                if (a(context, di.c("EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04="))) {
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
            f.a(th, "dI", "cf");
        }
    }

    static String n(Context context) {
        String str;
        try {
            if (!a(context, di.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
                return "";
            }
            TelephonyManager D = D(context);
            if (D == null) {
                return "";
            }
            String networkOperator = D.getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator)) {
                if (networkOperator.length() >= 3) {
                    str = networkOperator.substring(0, 3);
                    return str;
                }
            }
            return "";
        } catch (Throwable th) {
            i.b(th, "dI1", "gNC");
            str = "";
        }
    }

    static String o(Context context) {
        String str;
        try {
            if (!a(context, di.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
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
            i.b(th, "dI", "gNC");
            str = "";
        }
    }

    public static int p(Context context) {
        try {
            return C(context);
        } catch (Throwable th) {
            i.b(th, "dI", "gNT");
            return -1;
        }
    }

    public static int q(Context context) {
        try {
            return A(context);
        } catch (Throwable th) {
            f.a(th, "dI", "gAT");
            return -1;
        }
    }

    public static NetworkInfo r(Context context) {
        if (!a(context, di.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF"))) {
            return null;
        }
        ConnectivityManager B = B(context);
        if (B == null) {
            return null;
        }
        return B.getActiveNetworkInfo();
    }

    static String s(Context context) {
        String str;
        try {
            NetworkInfo r = r(context);
            if (r == null) {
                return null;
            }
            str = r.getExtraInfo();
            return str;
        } catch (Throwable th) {
            i.b(th, "dI", "gne");
            str = null;
        }
    }

    static String t(Context context) {
        StringBuilder sb;
        try {
            if (l != null && !"".equals(l)) {
                return l;
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
            l = sb.toString();
            return l;
        } catch (Throwable th) {
            i.b(th, "dI", "gR");
        }
    }

    public static String u(Context context) {
        try {
            if (m != null && !"".equals(m)) {
                return m;
            }
            if (!a(context, di.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
                return m;
            }
            TelephonyManager D = D(context);
            if (D == null) {
                return "";
            }
            Method a2 = di.a((Class) D.getClass(), "QZ2V0RGV2aWNlSWQ", (Class<?>[]) new Class[0]);
            if (a2 != null) {
                m = (String) a2.invoke(D, new Object[0]);
            }
            if (m == null) {
                m = "";
            }
            return m;
        } catch (Throwable th) {
            i.b(th, "dI", "gd");
        }
    }

    public static String v(Context context) {
        try {
            return y(context);
        } catch (Throwable th) {
            f.a(th, "dI", "gSd");
            return "";
        }
    }

    static String w(Context context) {
        try {
            return z(context);
        } catch (Throwable th) {
            i.b(th, "dI", "gNNa");
            return "";
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
    private static java.lang.String x(android.content.Context r8) {
        /*
            r0 = 0
            java.lang.String r1 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r8 = com.loc.di.a((android.content.Context) r8, (java.lang.String) r1)     // Catch:{ Throwable -> 0x009c, all -> 0x0095 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.loc.dc.x(android.content.Context):java.lang.String");
    }

    private static String y(Context context) throws InvocationTargetException, IllegalAccessException {
        if (n != null && !"".equals(n)) {
            return n;
        }
        if (!a(context, di.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
            return n;
        }
        TelephonyManager D = D(context);
        if (D == null) {
            return "";
        }
        Method a2 = di.a((Class) D.getClass(), "UZ2V0U3Vic2NyaWJlcklk", (Class<?>[]) new Class[0]);
        if (a2 != null) {
            n = (String) a2.invoke(D, new Object[0]);
        }
        if (n == null) {
            n = "";
        }
        return n;
    }

    private static String z(Context context) {
        if (!a(context, di.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
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
}
