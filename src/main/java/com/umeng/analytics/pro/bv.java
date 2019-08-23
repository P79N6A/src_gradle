package com.umeng.analytics.pro;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.a;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Properties;
import javax.microedition.khronos.opengles.GL10;

public class bv {

    /* renamed from: a  reason: collision with root package name */
    protected static final String f80539a = "com.umeng.analytics.pro.bv";
    private static String mCustomVersion;
    private static int mCustomVersionCode;
    private static String mUmengChannel;

    public static String getCustomVerison() {
        return mCustomVersion;
    }

    public static int getCustomVerisonCode() {
        return mCustomVersionCode;
    }

    public static String getUmengChannel() {
        return mUmengChannel;
    }

    private static String d() {
        if (Build.VERSION.SDK_INT >= 9) {
            return Build.SERIAL;
        }
        return "";
    }

    private static boolean f() {
        try {
            Build.class.getMethod("hasSmartBar", new Class[0]);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static String c() {
        try {
            int i = 0;
            String[] strArr = {"/sys/class/net/wlan0/address", "/sys/class/net/eth0/address", "/sys/devices/virtual/net/wlan0/address"};
            while (i < 3) {
                try {
                    String a2 = a(strArr[i]);
                    if (a2 != null) {
                        return a2;
                    }
                    i++;
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[SYNTHETIC, Splitter:B:13:0x0027] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002f A[SYNTHETIC, Splitter:B:19:0x002f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Properties e() {
        /*
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x002d, all -> 0x0024 }
            java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x002d, all -> 0x0024 }
            java.io.File r4 = android.os.Environment.getRootDirectory()     // Catch:{ Throwable -> 0x002d, all -> 0x0024 }
            java.lang.String r5 = "build.prop"
            r3.<init>(r4, r5)     // Catch:{ Throwable -> 0x002d, all -> 0x0024 }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x002d, all -> 0x0024 }
            r0.load(r2)     // Catch:{ Throwable -> 0x0022, all -> 0x001f }
            java.io.FileInputStream r2 = (java.io.FileInputStream) r2     // Catch:{ Throwable -> 0x0034 }
            r2.close()     // Catch:{ Throwable -> 0x0034 }
            goto L_0x0034
        L_0x001f:
            r0 = move-exception
            r1 = r2
            goto L_0x0025
        L_0x0022:
            r1 = r2
            goto L_0x002d
        L_0x0024:
            r0 = move-exception
        L_0x0025:
            if (r1 == 0) goto L_0x002c
            java.io.FileInputStream r1 = (java.io.FileInputStream) r1     // Catch:{ Throwable -> 0x002c }
            r1.close()     // Catch:{ Throwable -> 0x002c }
        L_0x002c:
            throw r0
        L_0x002d:
            if (r1 == 0) goto L_0x0034
            java.io.FileInputStream r1 = (java.io.FileInputStream) r1     // Catch:{ Throwable -> 0x0034 }
            r1.close()     // Catch:{ Throwable -> 0x0034 }
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.bv.e():java.util.Properties");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a() {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ FileNotFoundException -> 0x002b }
            java.lang.String r2 = "/proc/cpuinfo"
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x002b }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0021 }
            r3 = 1024(0x400, float:1.435E-42)
            r2.<init>(r1, r3)     // Catch:{ Throwable -> 0x0021 }
            java.lang.String r3 = r2.readLine()     // Catch:{ Throwable -> 0x0021 }
            r2.close()     // Catch:{ Throwable -> 0x001d, FileNotFoundException -> 0x001a }
            r1.close()     // Catch:{ Throwable -> 0x001d, FileNotFoundException -> 0x001a }
            goto L_0x0034
        L_0x001a:
            r0 = move-exception
            r1 = r0
            goto L_0x002d
        L_0x001d:
            r0 = move-exception
            r1 = r0
            r0 = r3
            goto L_0x0022
        L_0x0021:
            r1 = move-exception
        L_0x0022:
            java.lang.String r2 = f80539a     // Catch:{ FileNotFoundException -> 0x002b }
            java.lang.String r3 = "Could not read from file /proc/cpuinfo"
            com.umeng.analytics.pro.by.e((java.lang.String) r2, (java.lang.String) r3, (java.lang.Throwable) r1)     // Catch:{ FileNotFoundException -> 0x002b }
            r3 = r0
            goto L_0x0034
        L_0x002b:
            r1 = move-exception
            r3 = r0
        L_0x002d:
            java.lang.String r0 = f80539a
            java.lang.String r2 = "Could not open file /proc/cpuinfo"
            com.umeng.analytics.pro.by.e((java.lang.String) r0, (java.lang.String) r2, (java.lang.Throwable) r1)
        L_0x0034:
            if (r3 == 0) goto L_0x0047
            r0 = 58
            int r0 = r3.indexOf(r0)
            int r0 = r0 + 1
            java.lang.String r0 = r3.substring(r0)
            java.lang.String r0 = r0.trim()
            return r0
        L_0x0047:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.bv.a():java.lang.String");
    }

    private static String b() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (!"wlan0".equals(nextElement.getName())) {
                    if ("eth0".equals(nextElement.getName())) {
                    }
                }
                byte[] hardwareAddress = nextElement.getHardwareAddress();
                if (hardwareAddress != null) {
                    if (hardwareAddress.length != 0) {
                        StringBuilder sb = new StringBuilder();
                        for (byte valueOf : hardwareAddress) {
                            sb.append(String.format("%02X:", new Object[]{Byte.valueOf(valueOf)}));
                        }
                        if (sb.length() > 0) {
                            sb.deleteCharAt(sb.length() - 1);
                        }
                        return sb.toString().toLowerCase(Locale.getDefault());
                    }
                }
                return null;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static void setCustomVersion(String str) {
        mCustomVersion = str;
    }

    public static void setCustomVersionCode(int i) {
        mCustomVersionCode = i;
    }

    public static void setUmengChannel(String str) {
        mUmengChannel = str;
    }

    public static String t(Context context) {
        return context.getPackageName();
    }

    private static String a(Properties properties) {
        String property = properties.getProperty("ro.yunos.version");
        if (!TextUtils.isEmpty(property)) {
            return property;
        }
        return null;
    }

    public static boolean k(Context context) {
        return "Wi-Fi".equals(j(context)[0]);
    }

    private static String C(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (a(context, "android.permission.ACCESS_WIFI_STATE")) {
                return wifiManager.getConnectionInfo().getMacAddress();
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    private static String F(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            if (a(context, "android.permission.READ_PHONE_STATE")) {
                return telephonyManager.getDeviceId();
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String b(Context context) {
        String str = mCustomVersion;
        if (str != null && str.length() > 0) {
            return str;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static String d(Context context) {
        return bw.b(c(context));
    }

    public static String f(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (a(context, "android.permission.READ_PHONE_STATE")) {
            return telephonyManager.getSubscriberId();
        }
        return null;
    }

    public static String g(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (a(context, "android.permission.READ_PHONE_STATE")) {
            return telephonyManager.getNetworkOperator();
        }
        return null;
    }

    public static String h(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (a(context, "android.permission.READ_PHONE_STATE") && telephonyManager != null) {
                return telephonyManager.getNetworkOperatorName();
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static boolean l(Context context) {
        try {
            if (a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        return activeNetworkInfo.isConnectedOrConnecting();
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static String v(Context context) {
        return context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
    }

    public static String w(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.loadLabel(context.getPackageManager()).toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String z(Context context) {
        String str;
        if (context == null) {
            return "Phone";
        }
        if ((context.getResources().getConfiguration().screenLayout & 15) >= 3) {
            str = "Tablet";
        } else {
            str = "Phone";
        }
        return str;
    }

    public static String A(Context context) {
        String str = null;
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null && a(context, "android.permission.READ_PHONE_STATE")) {
                str = telephonyManager.getDeviceId();
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            try {
                if (TextUtils.isEmpty(string) && Build.VERSION.SDK_INT >= 9) {
                    return Build.SERIAL;
                }
            } catch (Throwable unused) {
            }
            return string;
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static Locale B(Context context) {
        Locale locale;
        try {
            Configuration configuration = new Configuration();
            configuration.setToDefaults();
            Settings.System.getConfiguration(context.getContentResolver(), configuration);
            locale = configuration.locale;
        } catch (Throwable unused) {
            by.c(f80539a, "fail to read user config locale");
            locale = null;
        }
        if (locale == null) {
            return Locale.getDefault();
        }
        return locale;
    }

    public static String a(Context context) {
        int i = mCustomVersionCode;
        if (i > 0) {
            return String.valueOf(i);
        }
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    private static String b(Properties properties) {
        try {
            String lowerCase = properties.getProperty("ro.build.display.id").toLowerCase(Locale.getDefault());
            if (lowerCase.contains("flyme os")) {
                return lowerCase.split(" ")[2];
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String i(Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            return String.valueOf(displayMetrics.heightPixels) + "*" + String.valueOf(displayMetrics.widthPixels);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int m(Context context) {
        try {
            Calendar instance = Calendar.getInstance(B(context));
            if (instance != null) {
                return instance.getTimeZone().getRawOffset() / 3600000;
            }
        } catch (Throwable th) {
            by.c(f80539a, "error in getTimeZone", th);
        }
        return 8;
    }

    public static String[] o(Context context) {
        String[] strArr = new String[2];
        try {
            Locale B = B(context);
            if (B != null) {
                strArr[0] = B.getCountry();
                strArr[1] = B.getLanguage();
            }
            if (TextUtils.isEmpty(strArr[0])) {
                strArr[0] = "Unknown";
            }
            if (TextUtils.isEmpty(strArr[1])) {
                strArr[1] = "Unknown";
            }
            return strArr;
        } catch (Throwable th) {
            by.e(f80539a, "error in getLocaleInfo", th);
            return strArr;
        }
    }

    public static String p(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f);
            if (applicationInfo != null) {
                String string = applicationInfo.metaData.getString("UMENG_APPKEY");
                if (string != null) {
                    return string.trim();
                }
                by.c(f80539a, "getAppkey failed. the applicationinfo is null!");
            }
        } catch (Throwable th) {
            by.e(f80539a, "Could not read UMENG_APPKEY meta-data from AndroidManifest.xml.", th);
        }
        return null;
    }

    public static String q(Context context) {
        String b2;
        if (Build.VERSION.SDK_INT < 23) {
            return C(context);
        }
        if (Build.VERSION.SDK_INT == 23) {
            b2 = b();
            if (TextUtils.isEmpty(b2)) {
                if (a.f80289d) {
                    return c();
                }
                return C(context);
            }
        } else {
            b2 = b();
            if (TextUtils.isEmpty(b2)) {
                return C(context);
            }
        }
        return b2;
    }

    public static String s(Context context) {
        String str = mUmengChannel;
        if (str != null && str.length() > 0) {
            return str;
        }
        String str2 = "Unknown";
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                Object obj = applicationInfo.metaData.get("UMENG_CHANNEL");
                if (obj != null) {
                    String obj2 = obj.toString();
                    if (obj2 != null) {
                        str2 = obj2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return str2;
    }

    public static String u(Context context) {
        try {
            return a(MessageDigest.getInstance("MD5").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(t(context), 64).signatures[0].toByteArray()))).getEncoded()));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String x(Context context) {
        Properties e2 = e();
        try {
            String property = e2.getProperty("ro.miui.ui.version.name");
            if (!TextUtils.isEmpty(property)) {
                property = "MIUI";
            } else if (f()) {
                return "Flyme";
            } else {
                if (!TextUtils.isEmpty(a(e2))) {
                    return "YunOS";
                }
            }
            return property;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String y(Context context) {
        String str;
        Properties e2 = e();
        try {
            str = e2.getProperty("ro.miui.ui.version.name");
            if (TextUtils.isEmpty(str)) {
                if (!f()) {
                    return a(e2);
                }
                try {
                    return b(e2);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            str = null;
        }
        return str;
    }

    public static String c(Context context) {
        if (MobclickAgent.EScenarioType.E_UM_ANALYTICS_OEM.toValue() == AnalyticsConfig.getVerticalType(context) || MobclickAgent.EScenarioType.E_UM_GAME_OEM.toValue() == AnalyticsConfig.getVerticalType(context)) {
            return E(context);
        }
        return D(context);
    }

    public static String e(Context context) {
        if (f(context) == null) {
            return null;
        }
        int i = context.getResources().getConfiguration().mcc;
        int i2 = context.getResources().getConfiguration().mnc;
        if (i == 0) {
            return null;
        }
        String valueOf = String.valueOf(i2);
        if (i2 < 10) {
            valueOf = String.format("%02d", new Object[]{Integer.valueOf(i2)});
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(String.valueOf(i));
        stringBuffer.append(valueOf);
        return stringBuffer.toString();
    }

    public static String[] j(Context context) {
        String[] strArr = {"", ""};
        try {
            if (!a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                strArr[0] = "";
                return strArr;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                strArr[0] = "";
                return strArr;
            }
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
            if (networkInfo == null || networkInfo.getState() != NetworkInfo.State.CONNECTED) {
                NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
                if (networkInfo2 != null && networkInfo2.getState() == NetworkInfo.State.CONNECTED) {
                    strArr[0] = "2G/3G";
                    strArr[1] = networkInfo2.getSubtypeName();
                    return strArr;
                }
                return strArr;
            }
            strArr[0] = "Wi-Fi";
            return strArr;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean n(android.content.Context r4) {
        /*
            com.umeng.analytics.pro.af r0 = com.umeng.analytics.pro.af.a((android.content.Context) r4)
            com.umeng.analytics.pro.af$a r0 = r0.b()
            java.lang.String r1 = ""
            java.lang.String r0 = r0.e(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x001b
            java.lang.String r4 = "cn"
            boolean r4 = r0.equals(r4)
            return r4
        L_0x001b:
            java.lang.String r0 = f(r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0038
            java.lang.String[] r4 = o(r4)
            r4 = r4[r2]
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = "cn"
            boolean r4 = r4.equalsIgnoreCase(r0)
            if (r4 == 0) goto L_0x0062
            return r1
        L_0x0038:
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.mcc
            r3 = 460(0x1cc, float:6.45E-43)
            if (r0 == r3) goto L_0x0063
            r3 = 461(0x1cd, float:6.46E-43)
            if (r0 != r3) goto L_0x004b
            goto L_0x0063
        L_0x004b:
            if (r0 != 0) goto L_0x0062
            java.lang.String[] r4 = o(r4)
            r4 = r4[r2]
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = "cn"
            boolean r4 = r4.equalsIgnoreCase(r0)
            if (r4 == 0) goto L_0x0062
            return r1
        L_0x0062:
            return r2
        L_0x0063:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.bv.n(android.content.Context):boolean");
    }

    public static int[] r(Context context) {
        int i;
        int i2;
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            if ((context.getApplicationInfo().flags & 8192) == 0) {
                i = a((Object) displayMetrics, "noncompatWidthPixels");
                i2 = a((Object) displayMetrics, "noncompatHeightPixels");
            } else {
                i = -1;
                i2 = 0;
            }
            if (i == -1 || i2 == -1) {
                i = displayMetrics.widthPixels;
                i2 = displayMetrics.heightPixels;
            }
            int[] iArr = new int[2];
            if (i > i2) {
                iArr[0] = i2;
                iArr[1] = i;
            } else {
                iArr[0] = i;
                iArr[1] = i2;
            }
            return iArr;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String D(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            String F = F(context);
            if (!TextUtils.isEmpty(F)) {
                return F;
            }
            String C = C(context);
            if (!TextUtils.isEmpty(C)) {
                return C;
            }
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (TextUtils.isEmpty(string)) {
                return d();
            }
            return string;
        } else if (Build.VERSION.SDK_INT == 23) {
            String F2 = F(context);
            if (!TextUtils.isEmpty(F2)) {
                return F2;
            }
            String b2 = b();
            if (TextUtils.isEmpty(b2)) {
                if (a.f80289d) {
                    b2 = c();
                } else {
                    b2 = C(context);
                }
            }
            if (!TextUtils.isEmpty(b2)) {
                return b2;
            }
            String string2 = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (TextUtils.isEmpty(string2)) {
                return d();
            }
            return string2;
        } else {
            String F3 = F(context);
            if (!TextUtils.isEmpty(F3)) {
                return F3;
            }
            String d2 = d();
            if (!TextUtils.isEmpty(d2)) {
                return d2;
            }
            String string3 = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (!TextUtils.isEmpty(string3)) {
                return string3;
            }
            String b3 = b();
            if (TextUtils.isEmpty(b3)) {
                return C(context);
            }
            return b3;
        }
    }

    private static String E(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            String C = C(context);
            if (!TextUtils.isEmpty(C)) {
                return C;
            }
            String d2 = d();
            if (TextUtils.isEmpty(d2)) {
                return F(context);
            }
            return d2;
        } else if (Build.VERSION.SDK_INT == 23) {
            String string2 = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (!TextUtils.isEmpty(string2)) {
                return string2;
            }
            String b2 = b();
            if (TextUtils.isEmpty(b2)) {
                if (a.f80289d) {
                    b2 = c();
                } else {
                    b2 = C(context);
                }
            }
            if (!TextUtils.isEmpty(b2)) {
                return b2;
            }
            String d3 = d();
            if (TextUtils.isEmpty(d3)) {
                return F(context);
            }
            return d3;
        } else {
            String string3 = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (!TextUtils.isEmpty(string3)) {
                return string3;
            }
            String d4 = d();
            if (!TextUtils.isEmpty(d4)) {
                return d4;
            }
            String F = F(context);
            if (!TextUtils.isEmpty(F)) {
                return F;
            }
            String b3 = b();
            if (TextUtils.isEmpty(b3)) {
                return C(context);
            }
            return b3;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|(2:16|17)|(2:20|21)|22|23) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0025 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0014 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0022 A[SYNTHETIC, Splitter:B:20:0x0022] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.String r3) {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ Throwable -> 0x0026 }
            r1.<init>(r3)     // Catch:{ Throwable -> 0x0026 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x001b }
            r2 = 1024(0x400, float:1.435E-42)
            r3.<init>(r1, r2)     // Catch:{ all -> 0x001b }
            java.lang.String r2 = r3.readLine()     // Catch:{ all -> 0x0019 }
            r1.close()     // Catch:{ Throwable -> 0x0014 }
        L_0x0014:
            r3.close()     // Catch:{ Throwable -> 0x0017 }
        L_0x0017:
            r0 = r2
            goto L_0x0026
        L_0x0019:
            r2 = move-exception
            goto L_0x001d
        L_0x001b:
            r2 = move-exception
            r3 = r0
        L_0x001d:
            r1.close()     // Catch:{ Throwable -> 0x0020 }
        L_0x0020:
            if (r3 == 0) goto L_0x0025
            r3.close()     // Catch:{ Throwable -> 0x0025 }
        L_0x0025:
            throw r2     // Catch:{ Throwable -> 0x0026 }
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.bv.a(java.lang.String):java.lang.String");
    }

    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i]);
            int length = hexString.length();
            if (length == 1) {
                hexString = PushConstants.PUSH_TYPE_NOTIFY + hexString;
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb.append(hexString.toUpperCase(Locale.getDefault()));
            if (i < bArr.length - 1) {
                sb.append(':');
            }
        }
        return sb.toString();
    }

    public static String[] a(GL10 gl10) {
        try {
            return new String[]{gl10.glGetString(7936), gl10.glGetString(7937)};
        } catch (Throwable unused) {
            return new String[0];
        }
    }

    private static int a(Object obj, String str) {
        try {
            Field declaredField = DisplayMetrics.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.getInt(obj);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static boolean a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                if (((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", new Class[]{String.class}).invoke(context, new Object[]{str})).intValue() == 0) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        } else if (context.getPackageManager().checkPermission(str, context.getPackageName()) == 0) {
            return true;
        }
        return false;
    }
}
