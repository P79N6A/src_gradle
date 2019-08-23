package com.umeng.commonsdk.statistics.common;

import android.content.Context;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.utils.UMUtils;
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

public class DeviceConfig {
    protected static final String LOG_TAG = "com.umeng.commonsdk.statistics.common.DeviceConfig";

    private static boolean isFlyMe() {
        try {
            Build.class.getMethod("hasSmartBar", new Class[0]);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025 A[SYNTHETIC, Splitter:B:13:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002b A[SYNTHETIC, Splitter:B:19:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Properties getBuildProp() {
        /*
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0029, all -> 0x0022 }
            java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x0029, all -> 0x0022 }
            java.io.File r4 = android.os.Environment.getRootDirectory()     // Catch:{ Throwable -> 0x0029, all -> 0x0022 }
            java.lang.String r5 = "build.prop"
            r3.<init>(r4, r5)     // Catch:{ Throwable -> 0x0029, all -> 0x0022 }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x0029, all -> 0x0022 }
            r0.load(r2)     // Catch:{ Throwable -> 0x0020, all -> 0x001d }
            r2.close()     // Catch:{ Throwable -> 0x002e }
            goto L_0x002e
        L_0x001d:
            r0 = move-exception
            r1 = r2
            goto L_0x0023
        L_0x0020:
            r1 = r2
            goto L_0x0029
        L_0x0022:
            r0 = move-exception
        L_0x0023:
            if (r1 == 0) goto L_0x0028
            r1.close()     // Catch:{ Throwable -> 0x0028 }
        L_0x0028:
            throw r0
        L_0x0029:
            if (r1 == 0) goto L_0x002e
            r1.close()     // Catch:{ Throwable -> 0x002e }
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.getBuildProp():java.util.Properties");
    }

    private static String getMacShell() {
        try {
            String[] strArr = {"/sys/class/net/wlan0/address", "/sys/class/net/eth0/address", "/sys/devices/virtual/net/wlan0/address"};
            for (int i = 0; i < 3; i++) {
                String reaMac = reaMac(strArr[i]);
                if (reaMac != null) {
                    return reaMac;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String getSerial() {
        String str = null;
        if (Build.VERSION.SDK_INT < 9) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Class<?> cls = Class.forName("android.os.Build");
                str = (String) cls.getMethod("getSerial", new Class[0]).invoke(cls, new Object[0]);
            } catch (Throwable unused) {
            }
        } else {
            str = Build.SERIAL;
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getCPU() {
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
            java.lang.String r2 = LOG_TAG     // Catch:{ FileNotFoundException -> 0x002b }
            java.lang.String r3 = "Could not read from file /proc/cpuinfo"
            com.umeng.commonsdk.statistics.common.MLog.e((java.lang.String) r2, (java.lang.String) r3, (java.lang.Throwable) r1)     // Catch:{ FileNotFoundException -> 0x002b }
            r3 = r0
            goto L_0x0034
        L_0x002b:
            r1 = move-exception
            r3 = r0
        L_0x002d:
            java.lang.String r0 = LOG_TAG
            java.lang.String r2 = "Could not open file /proc/cpuinfo"
            com.umeng.commonsdk.statistics.common.MLog.e((java.lang.String) r0, (java.lang.String) r2, (java.lang.Throwable) r1)
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
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.getCPU():java.lang.String");
    }

    private static String getMacByJavaAPI() {
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

    private static String getSerialNo() {
        String str = "";
        if (Build.VERSION.SDK_INT >= 9) {
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    Class<?> cls = Class.forName("android.os.Build");
                    str = (String) cls.getMethod("getSerial", new Class[0]).invoke(cls, new Object[0]);
                } catch (Throwable unused) {
                }
            } else {
                str = Build.SERIAL;
            }
        }
        if (AnalyticsConstants.UM_DEBUG) {
            String str2 = LOG_TAG;
            MLog.i(str2, "getDeviceId, serial no: " + str);
        }
        return str;
    }

    public static String getAppVersionCode(Context context) {
        return UMUtils.getAppVersionCode(context);
    }

    public static String getAppVersionName(Context context) {
        return UMUtils.getAppVersionName(context);
    }

    public static String getDeviceIdUmengMD5(Context context) {
        return HelperUtils.getUmengMD5(getDeviceId(context));
    }

    private static String getEmuiVersion(Properties properties) {
        try {
            return properties.getProperty("ro.build.hw_emui_api_level", null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getPackageName(Context context) {
        if (context == null) {
            return null;
        }
        return context.getPackageName();
    }

    private static String getYunOSVersion(Properties properties) {
        String property = properties.getProperty("ro.yunos.version");
        if (!TextUtils.isEmpty(property)) {
            return property;
        }
        return null;
    }

    private static boolean isEmui(Properties properties) {
        try {
            if (properties.getProperty("ro.build.hw_emui_api_level", null) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String getAndroidId(Context context) {
        if (context != null) {
            try {
                return Settings.Secure.getString(context.getContentResolver(), "android_id");
            } catch (Exception unused) {
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.w("can't read android id");
                }
            }
        }
        return null;
    }

    public static String getApplicationLable(Context context) {
        if (context == null) {
            return "";
        }
        return context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
    }

    public static String getDeviceId(Context context) {
        if (AnalyticsConstants.getDeviceType() == 2) {
            return getDeviceIdForBox(context);
        }
        return getDeviceIdForGeneral(context);
    }

    public static String getDeviceType(Context context) {
        boolean z;
        String str;
        if (context == null) {
            return "Phone";
        }
        if ((context.getResources().getConfiguration().screenLayout & 15) >= 3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "Tablet";
        } else {
            str = "Phone";
        }
        return str;
    }

    public static String getImsi(Context context) {
        String str = null;
        if (context == null) {
            return null;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (checkPermission(context, "android.permission.READ_PHONE_STATE") && telephonyManager != null) {
            str = telephonyManager.getSubscriberId();
        }
        return str;
    }

    public static String getNetworkOperatorName(Context context) {
        if (context == null) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (checkPermission(context, "android.permission.READ_PHONE_STATE") && telephonyManager != null) {
                return telephonyManager.getNetworkOperatorName();
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static String getRegisteredOperator(Context context) {
        String str = null;
        if (context == null) {
            return null;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (checkPermission(context, "android.permission.READ_PHONE_STATE") && telephonyManager != null) {
            str = telephonyManager.getNetworkOperator();
        }
        return str;
    }

    public static boolean isWiFiAvailable(Context context) {
        if (context == null) {
            return false;
        }
        return "Wi-Fi".equals(getNetworkAccessMode(context)[0]);
    }

    public static String getAppHashKey(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(getPackageName(context), 64).signatures;
            if (signatureArr.length > 0) {
                Signature signature = signatureArr[0];
                MessageDigest instance = MessageDigest.getInstance("SHA");
                instance.update(signature.toByteArray());
                return Base64.encodeToString(instance.digest(), 0).trim();
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String getAppName(Context context) {
        String str;
        if (context == null) {
            return null;
        }
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.loadLabel(context.getPackageManager()).toString();
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.i(LOG_TAG, th);
            }
            str = null;
        }
        return str;
    }

    public static String getAppSHA1Key(Context context) {
        try {
            return byte2HexFormatted(MessageDigest.getInstance("SHA1").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(getPackageName(context), 64).signatures[0].toByteArray()))).getEncoded()));
        } catch (Exception unused) {
            return null;
        }
    }

    private static String getFlymeVersion(Properties properties) {
        try {
            String lowerCase = properties.getProperty("ro.build.display.id").toLowerCase(Locale.getDefault());
            if (lowerCase.contains("flyme os")) {
                return lowerCase.split(" ")[2];
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String[] getGPU(GL10 gl10) {
        try {
            return new String[]{gl10.glGetString(7936), gl10.glGetString(7937)};
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.e(LOG_TAG, "Could not read gpu infor:", th);
            }
            return new String[0];
        }
    }

    public static String getImei(Context context) {
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null || !checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                return null;
            }
            return telephonyManager.getDeviceId();
        } catch (Exception e2) {
            if (!AnalyticsConstants.UM_DEBUG) {
                return null;
            }
            MLog.w("No IMEI.", (Throwable) e2);
            return null;
        }
    }

    private static Locale getLocale(Context context) {
        Locale locale;
        if (context == null) {
            return Locale.getDefault();
        }
        try {
            Configuration configuration = new Configuration();
            configuration.setToDefaults();
            Settings.System.getConfiguration(context.getContentResolver(), configuration);
            locale = configuration.locale;
        } catch (Throwable unused) {
            MLog.e(LOG_TAG, "fail to read user config locale");
            locale = null;
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return locale;
    }

    public static String getMac(Context context) {
        String str;
        String macByJavaAPI;
        if (context == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT < 23) {
            str = getMacBySystemInterface(context);
        } else {
            if (Build.VERSION.SDK_INT == 23) {
                macByJavaAPI = getMacByJavaAPI();
                if (TextUtils.isEmpty(macByJavaAPI)) {
                    if (AnalyticsConstants.CHECK_DEVICE) {
                        str = getMacShell();
                    } else {
                        str = getMacBySystemInterface(context);
                    }
                }
            } else {
                macByJavaAPI = getMacByJavaAPI();
                if (TextUtils.isEmpty(macByJavaAPI)) {
                    str = getMacBySystemInterface(context);
                }
            }
            str = macByJavaAPI;
        }
        return str;
    }

    public static String getSubOSName(Context context) {
        Properties buildProp = getBuildProp();
        try {
            String property = buildProp.getProperty("ro.miui.ui.version.name");
            if (!TextUtils.isEmpty(property)) {
                property = "MIUI";
            } else if (isFlyMe()) {
                return "Flyme";
            } else {
                if (isEmui(buildProp)) {
                    return "Emui";
                }
                if (!TextUtils.isEmpty(getYunOSVersion(buildProp))) {
                    return "YunOS";
                }
            }
            return property;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getSubOSVersion(Context context) {
        String str;
        Properties buildProp = getBuildProp();
        try {
            str = buildProp.getProperty("ro.miui.ui.version.name");
            if (TextUtils.isEmpty(str)) {
                if (isFlyMe()) {
                    try {
                        return getFlymeVersion(buildProp);
                    } catch (Throwable unused) {
                    }
                } else if (isEmui(buildProp)) {
                    return getEmuiVersion(buildProp);
                } else {
                    return getYunOSVersion(buildProp);
                }
            }
        } catch (Throwable unused2) {
            str = null;
        }
        return str;
    }

    public static int getTimeZone(Context context) {
        if (context == null) {
            return 8;
        }
        try {
            Calendar instance = Calendar.getInstance(getLocale(context));
            if (instance != null) {
                return instance.getTimeZone().getRawOffset() / 3600000;
            }
        } catch (Throwable th) {
            MLog.i(LOG_TAG, "error in getTimeZone", th);
        }
        return 8;
    }

    public static boolean isOnline(Context context) {
        if (context == null) {
            return false;
        }
        try {
            if (checkPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
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

    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|(2:16|17)|(2:20|21)|22|23) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0025 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0014 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0022 A[SYNTHETIC, Splitter:B:20:0x0022] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String reaMac(java.lang.String r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.reaMac(java.lang.String):java.lang.String");
    }

    private static String byte2HexFormatted(byte[] bArr) {
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

    public static String getAppMD5Signature(Context context) {
        String str;
        if (context == null) {
            return null;
        }
        try {
            str = byte2HexFormatted(MessageDigest.getInstance("MD5").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(getPackageName(context), 64).signatures[0].toByteArray()))).getEncoded()));
        } catch (Throwable unused) {
            str = null;
        }
        return str;
    }

    public static String getDBencryptID(Context context) {
        String str = null;
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null && checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                    str = telephonyManager.getDeviceId();
                }
                if (TextUtils.isEmpty(str)) {
                    String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                    try {
                        if (!TextUtils.isEmpty(string) || Build.VERSION.SDK_INT < 9) {
                            return string;
                        }
                        if (Build.VERSION.SDK_INT >= 26) {
                            Class<?> cls = Class.forName("android.os.Build");
                            str = (String) cls.getMethod("getSerial", new Class[0]).invoke(cls, new Object[0]);
                        } else {
                            str = Build.SERIAL;
                        }
                    } catch (Throwable unused) {
                        return string;
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        return str;
    }

    public static String getDisplayResolution(Context context) {
        if (context == null) {
            return "";
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null) {
                return "";
            }
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            return String.valueOf(i2) + "*" + String.valueOf(i);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getIMEI(android.content.Context r6) {
        /*
            java.lang.String r0 = ""
            if (r6 != 0) goto L_0x0005
            return r0
        L_0x0005:
            java.lang.String r1 = "phone"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            if (r1 == 0) goto L_0x004b
            java.lang.String r2 = "android.permission.READ_PHONE_STATE"
            boolean r6 = checkPermission(r6, r2)     // Catch:{ Throwable -> 0x003b }
            if (r6 == 0) goto L_0x004b
            java.lang.String r6 = r1.getDeviceId()     // Catch:{ Throwable -> 0x003b }
            boolean r0 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch:{ Throwable -> 0x0039 }
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = LOG_TAG     // Catch:{ Throwable -> 0x0039 }
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x0039 }
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0039 }
            java.lang.String r4 = "getDeviceId, IMEI: "
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0039 }
            r3.append(r6)     // Catch:{ Throwable -> 0x0039 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x0039 }
            r1[r2] = r3     // Catch:{ Throwable -> 0x0039 }
            com.umeng.commonsdk.statistics.common.MLog.i((java.lang.String) r0, (java.lang.Object[]) r1)     // Catch:{ Throwable -> 0x0039 }
            goto L_0x004a
        L_0x0039:
            r0 = move-exception
            goto L_0x003f
        L_0x003b:
            r6 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
        L_0x003f:
            boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r1 == 0) goto L_0x004a
            java.lang.String r1 = LOG_TAG
            java.lang.String r2 = "No IMEI."
            com.umeng.commonsdk.statistics.common.MLog.w((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)
        L_0x004a:
            r0 = r6
        L_0x004b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.getIMEI(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:11|12|13|14|15|(2:17|25)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0035 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b A[Catch:{ Exception -> 0x0045 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getImeiNew(android.content.Context r5) {
        /*
            r0 = 0
            if (r5 == 0) goto L_0x004f
            java.lang.String r1 = "phone"
            java.lang.Object r1 = r5.getSystemService(r1)     // Catch:{ Exception -> 0x0045 }
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch:{ Exception -> 0x0045 }
            if (r1 == 0) goto L_0x004f
            java.lang.String r2 = "android.permission.READ_PHONE_STATE"
            boolean r5 = checkPermission(r5, r2)     // Catch:{ Exception -> 0x0045 }
            if (r5 == 0) goto L_0x004f
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0045 }
            r2 = 26
            if (r5 < r2) goto L_0x0040
            java.lang.Class r5 = r1.getClass()     // Catch:{ Exception -> 0x0035 }
            java.lang.String r2 = "getImei"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0035 }
            java.lang.reflect.Method r5 = r5.getMethod(r2, r4)     // Catch:{ Exception -> 0x0035 }
            r2 = 1
            r5.setAccessible(r2)     // Catch:{ Exception -> 0x0035 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0035 }
            java.lang.Object r5 = r5.invoke(r1, r2)     // Catch:{ Exception -> 0x0035 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0035 }
            r0 = r5
        L_0x0035:
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0045 }
            if (r5 == 0) goto L_0x004f
            java.lang.String r5 = r1.getDeviceId()     // Catch:{ Exception -> 0x0045 }
            goto L_0x0050
        L_0x0040:
            java.lang.String r5 = r1.getDeviceId()     // Catch:{ Exception -> 0x0045 }
            goto L_0x0050
        L_0x0045:
            r5 = move-exception
            boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r1 == 0) goto L_0x004f
            java.lang.String r1 = "No IMEI."
            com.umeng.commonsdk.statistics.common.MLog.w((java.lang.String) r1, (java.lang.Throwable) r5)
        L_0x004f:
            r5 = r0
        L_0x0050:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.getImeiNew(android.content.Context):java.lang.String");
    }

    public static String[] getLocaleInfo(Context context) {
        String[] strArr = {"Unknown", "Unknown"};
        if (context == null) {
            return strArr;
        }
        try {
            Locale locale = getLocale(context);
            if (locale != null) {
                strArr[0] = locale.getCountry();
                strArr[1] = locale.getLanguage();
            }
            if (TextUtils.isEmpty(strArr[0])) {
                strArr[0] = "Unknown";
            }
            if (TextUtils.isEmpty(strArr[1])) {
                strArr[1] = "Unknown";
            }
            return strArr;
        } catch (Throwable th) {
            MLog.e(LOG_TAG, "error in getLocaleInfo", th);
            return strArr;
        }
    }

    public static String getMCCMNC(Context context) {
        if (context == null || getImsi(context) == null) {
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

    private static String getMacBySystemInterface(Context context) {
        if (context == null) {
            return "";
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (!checkPermission(context, "android.permission.ACCESS_WIFI_STATE")) {
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.w(LOG_TAG, "Could not get mac address.[no permission android.permission.ACCESS_WIFI_STATE");
                }
                return "";
            } else if (wifiManager != null) {
                return wifiManager.getConnectionInfo().getMacAddress();
            } else {
                return "";
            }
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str = LOG_TAG;
                MLog.w(str, "Could not get mac address." + th.toString());
            }
            return "";
        }
    }

    public static String[] getNetworkAccessMode(Context context) {
        String[] strArr = {"", ""};
        if (context == null) {
            return strArr;
        }
        try {
            if (!checkPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
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

    public static int[] getResolutionArray(Context context) {
        int i;
        int i2;
        if (context == null) {
            return null;
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null) {
                return null;
            }
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            if ((context.getApplicationInfo().flags & 8192) == 0) {
                i = reflectMetrics(displayMetrics, "noncompatWidthPixels");
                i2 = reflectMetrics(displayMetrics, "noncompatHeightPixels");
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
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.e(LOG_TAG, "read resolution fail", th);
            }
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isChineseAera(android.content.Context r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "country"
            java.lang.String r2 = ""
            java.lang.String r1 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r4, r1, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 1
            if (r2 != 0) goto L_0x001d
            java.lang.String r4 = "cn"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x001c
            return r3
        L_0x001c:
            return r0
        L_0x001d:
            java.lang.String r1 = getImsi(r4)
            if (r1 != 0) goto L_0x0038
            java.lang.String[] r4 = getLocaleInfo(r4)
            r4 = r4[r0]
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x0062
            java.lang.String r1 = "cn"
            boolean r4 = r4.equalsIgnoreCase(r1)
            if (r4 == 0) goto L_0x0062
            return r3
        L_0x0038:
            android.content.res.Resources r1 = r4.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.mcc
            r2 = 460(0x1cc, float:6.45E-43)
            if (r1 == r2) goto L_0x0063
            r2 = 461(0x1cd, float:6.46E-43)
            if (r1 != r2) goto L_0x004b
            goto L_0x0063
        L_0x004b:
            if (r1 != 0) goto L_0x0062
            java.lang.String[] r4 = getLocaleInfo(r4)
            r4 = r4[r0]
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x0062
            java.lang.String r1 = "cn"
            boolean r4 = r4.equalsIgnoreCase(r1)
            if (r4 == 0) goto L_0x0062
            return r3
        L_0x0062:
            return r0
        L_0x0063:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.isChineseAera(android.content.Context):boolean");
    }

    public static String getDeviceIdForBox(Context context) {
        String str;
        if (context == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT < 23) {
            str = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (AnalyticsConstants.UM_DEBUG) {
                String str2 = LOG_TAG;
                MLog.i(str2, "getDeviceId, ANDROID_ID: " + str);
            }
            if (TextUtils.isEmpty(str)) {
                str = getMacBySystemInterface(context);
                if (AnalyticsConstants.UM_DEBUG) {
                    String str3 = LOG_TAG;
                    MLog.i(str3, "getDeviceId, MAC: " + str);
                }
                if (TextUtils.isEmpty(str)) {
                    str = getSerialNo();
                    if (TextUtils.isEmpty(str)) {
                        str = getIMEI(context);
                    }
                }
            }
        } else if (Build.VERSION.SDK_INT == 23) {
            str = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (AnalyticsConstants.UM_DEBUG) {
                String str4 = LOG_TAG;
                MLog.i(str4, "getDeviceId, ANDROID_ID: " + str);
            }
            if (TextUtils.isEmpty(str)) {
                str = getMacByJavaAPI();
                if (TextUtils.isEmpty(str)) {
                    if (AnalyticsConstants.CHECK_DEVICE) {
                        str = getMacShell();
                    } else {
                        str = getMacBySystemInterface(context);
                    }
                }
                if (AnalyticsConstants.UM_DEBUG) {
                    String str5 = LOG_TAG;
                    MLog.i(str5, "getDeviceId, MAC: " + str);
                }
                if (TextUtils.isEmpty(str)) {
                    str = getSerialNo();
                    if (TextUtils.isEmpty(str)) {
                        str = getIMEI(context);
                    }
                }
            }
        } else {
            str = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (AnalyticsConstants.UM_DEBUG) {
                String str6 = LOG_TAG;
                MLog.i(str6, "getDeviceId: ANDROID_ID: " + str);
            }
            if (TextUtils.isEmpty(str)) {
                str = getSerialNo();
                if (TextUtils.isEmpty(str)) {
                    str = getIMEI(context);
                    if (TextUtils.isEmpty(str)) {
                        str = getMacByJavaAPI();
                        if (TextUtils.isEmpty(str)) {
                            str = getMacBySystemInterface(context);
                            if (AnalyticsConstants.UM_DEBUG) {
                                String str7 = LOG_TAG;
                                MLog.i(str7, "getDeviceId, MAC: " + str);
                            }
                        }
                    }
                }
            }
        }
        return str;
    }

    public static String getDeviceIdForGeneral(Context context) {
        String str;
        if (context == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT < 23) {
            str = getIMEI(context);
            if (TextUtils.isEmpty(str)) {
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.w(LOG_TAG, "No IMEI.");
                }
                str = getMacBySystemInterface(context);
                if (TextUtils.isEmpty(str)) {
                    str = Settings.Secure.getString(context.getContentResolver(), "android_id");
                    if (AnalyticsConstants.UM_DEBUG) {
                        String str2 = LOG_TAG;
                        MLog.i(str2, "getDeviceId, ANDROID_ID: " + str);
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = getSerialNo();
                    }
                }
            }
        } else if (Build.VERSION.SDK_INT == 23) {
            str = getIMEI(context);
            if (TextUtils.isEmpty(str)) {
                str = getMacByJavaAPI();
                if (TextUtils.isEmpty(str)) {
                    if (AnalyticsConstants.CHECK_DEVICE) {
                        str = getMacShell();
                    } else {
                        str = getMacBySystemInterface(context);
                    }
                }
                if (AnalyticsConstants.UM_DEBUG) {
                    String str3 = LOG_TAG;
                    MLog.i(str3, "getDeviceId, MAC: " + str);
                }
                if (TextUtils.isEmpty(str)) {
                    str = Settings.Secure.getString(context.getContentResolver(), "android_id");
                    if (AnalyticsConstants.UM_DEBUG) {
                        String str4 = LOG_TAG;
                        MLog.i(str4, "getDeviceId, ANDROID_ID: " + str);
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = getSerialNo();
                    }
                }
            }
        } else {
            str = getIMEI(context);
            if (TextUtils.isEmpty(str)) {
                str = getSerialNo();
                if (TextUtils.isEmpty(str)) {
                    str = Settings.Secure.getString(context.getContentResolver(), "android_id");
                    if (AnalyticsConstants.UM_DEBUG) {
                        String str5 = LOG_TAG;
                        MLog.i(str5, "getDeviceId, ANDROID_ID: " + str);
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = getMacByJavaAPI();
                        if (TextUtils.isEmpty(str)) {
                            str = getMacBySystemInterface(context);
                            if (AnalyticsConstants.UM_DEBUG) {
                                String str6 = LOG_TAG;
                                MLog.i(str6, "getDeviceId, MAC: " + str);
                            }
                        }
                    }
                }
            }
        }
        return str;
    }

    private static int reflectMetrics(Object obj, String str) {
        try {
            Field declaredField = DisplayMetrics.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.getInt(obj);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r6.getPackageManager().checkPermission(r7, r6.getPackageName()) == 0) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (((java.lang.Integer) java.lang.Class.forName("android.content.Context").getMethod("checkSelfPermission", new java.lang.Class[]{java.lang.String.class}).invoke(r6, new java.lang.Object[]{r7})).intValue() == 0) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean checkPermission(android.content.Context r6, java.lang.String r7) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            r3 = 1
            if (r1 < r2) goto L_0x002e
            java.lang.String r1 = "android.content.Context"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Throwable -> 0x003d }
            java.lang.String r2 = "checkSelfPermission"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Throwable -> 0x003d }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r0] = r5     // Catch:{ Throwable -> 0x003d }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch:{ Throwable -> 0x003d }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x003d }
            r2[r0] = r7     // Catch:{ Throwable -> 0x003d }
            java.lang.Object r6 = r1.invoke(r6, r2)     // Catch:{ Throwable -> 0x003d }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Throwable -> 0x003d }
            int r6 = r6.intValue()     // Catch:{ Throwable -> 0x003d }
            if (r6 != 0) goto L_0x003d
            goto L_0x003c
        L_0x002e:
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            java.lang.String r6 = r6.getPackageName()
            int r6 = r1.checkPermission(r7, r6)
            if (r6 != 0) goto L_0x003d
        L_0x003c:
            r0 = 1
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.checkPermission(android.content.Context, java.lang.String):boolean");
    }
}
