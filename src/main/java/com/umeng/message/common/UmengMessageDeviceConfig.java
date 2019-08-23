package com.umeng.message.common;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ta.utdid2.device.UTDevice;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.PushAgent;
import com.umeng.message.proguard.c;
import com.umeng.message.proguard.h;
import com.umeng.message.util.a;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.NetworkInterface;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.microedition.khronos.opengles.GL10;

public class UmengMessageDeviceConfig {

    /* renamed from: b  reason: collision with root package name */
    private static final String f81145b = "UmengMessageDeviceConfig";

    /* renamed from: e  reason: collision with root package name */
    private static boolean f81146e;

    public static boolean isSdCardWrittenable() {
        if (Environment.getExternalStorageState().equals("mounted")) {
            return true;
        }
        return false;
    }

    public static String getToday() {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date());
    }

    public static boolean isMiui8() {
        try {
            String a2 = a.g().a("ro.miui.ui.version.name");
            if (a2 == null || !a2.contains("8")) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String getSerial_number() {
        String str;
        if (Build.VERSION.SDK_INT <= 25) {
            str = Build.SERIAL;
        } else {
            try {
                Class<?> cls = Class.forName("android.os.Build");
                str = (String) cls.getMethod("getSerial", new Class[0]).invoke(cls, new Object[0]);
            } catch (Throwable unused) {
                str = "";
            }
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public static boolean isMIUI() {
        try {
            a g = a.g();
            if (g.a("ro.miui.ui.version.code", null) == null && g.a("ro.miui.ui.version.name", null) == null && g.a("ro.miui.internal.storage", null) == null) {
                return false;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getCPU() {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ FileNotFoundException -> 0x0038 }
            java.lang.String r5 = "/proc/cpuinfo"
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0038 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0024 }
            r6 = 1024(0x400, float:1.435E-42)
            r5.<init>(r4, r6)     // Catch:{ IOException -> 0x0024 }
            java.lang.String r6 = r5.readLine()     // Catch:{ IOException -> 0x0024 }
            r5.close()     // Catch:{ IOException -> 0x0020, FileNotFoundException -> 0x001d }
            r4.close()     // Catch:{ IOException -> 0x0020, FileNotFoundException -> 0x001d }
            goto L_0x004b
        L_0x001d:
            r3 = move-exception
            r4 = r3
            goto L_0x003a
        L_0x0020:
            r3 = move-exception
            r4 = r3
            r3 = r6
            goto L_0x0025
        L_0x0024:
            r4 = move-exception
        L_0x0025:
            java.lang.String r5 = f81145b     // Catch:{ FileNotFoundException -> 0x0038 }
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ FileNotFoundException -> 0x0038 }
            java.lang.String r7 = "Could not read from file /proc/cpuinfo"
            r6[r2] = r7     // Catch:{ FileNotFoundException -> 0x0038 }
            java.lang.String r4 = r4.getMessage()     // Catch:{ FileNotFoundException -> 0x0038 }
            r6[r1] = r4     // Catch:{ FileNotFoundException -> 0x0038 }
            com.umeng.commonsdk.debug.UMLog.mutlInfo((java.lang.String) r5, (int) r2, (java.lang.String[]) r6)     // Catch:{ FileNotFoundException -> 0x0038 }
            r6 = r3
            goto L_0x004b
        L_0x0038:
            r4 = move-exception
            r6 = r3
        L_0x003a:
            java.lang.String r3 = f81145b
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r5 = "Could not open file /proc/cpuinfo"
            r0[r2] = r5
            java.lang.String r4 = r4.getMessage()
            r0[r1] = r4
            com.umeng.commonsdk.debug.UMLog.mutlInfo((java.lang.String) r3, (int) r2, (java.lang.String[]) r0)
        L_0x004b:
            if (r6 == 0) goto L_0x005c
            r0 = 58
            int r0 = r6.indexOf(r0)
            int r0 = r0 + r1
            java.lang.String r0 = r6.substring(r0)
            java.lang.String r6 = r0.trim()
        L_0x005c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.common.UmengMessageDeviceConfig.getCPU():java.lang.String");
    }

    private static String b(Context context) {
        return UMUtils.getUMId(context);
    }

    public static String getAppkey(Context context) {
        return getMetaData(context, "UMENG_APPKEY");
    }

    public static String getPackageName(Context context) {
        return context.getPackageName();
    }

    public static String getAndroidId(Context context) {
        String string = Settings.System.getString(context.getContentResolver(), "android_id");
        if (string == null) {
            return "";
        }
        return string;
    }

    public static String getDeviceIdMD5(Context context) {
        return h.a(getDeviceId(context));
    }

    public static String getDeviceIdUmengMD5(Context context) {
        return h.b(getDeviceId(context));
    }

    public static String getTimeString(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(date);
    }

    public static String getUmid(Context context) {
        String b2 = b(context);
        if (b2 == null) {
            return "";
        }
        return b2;
    }

    public static boolean isDebug(Context context) {
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isScreenPortrait(Context context) {
        if (context.getResources().getConfiguration().orientation == 1) {
            return true;
        }
        return false;
    }

    public static boolean isWiFiAvailable(Context context) {
        return "Wi-Fi".equals(getNetworkAccessMode(context)[0]);
    }

    public static Date toTime(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getAppLabel(Context context) {
        ApplicationInfo applicationInfo;
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        if (applicationInfo != null) {
            obj = packageManager.getApplicationLabel(applicationInfo);
        } else {
            obj = "";
        }
        return (String) obj;
    }

    public static String getAppVersionCode(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            return "Unknown";
        }
    }

    public static String getAppVersionName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "Unknown";
        }
    }

    public static String getApplicationLable(Context context) {
        return context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
    }

    public static String getNetworkOperatorName(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return "Unknown";
            }
            return telephonyManager.getNetworkOperatorName();
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    public static boolean isChinese(Context context) {
        return context.getResources().getConfiguration().locale.toString().equals(Locale.CHINA.toString());
    }

    public static boolean isOnline(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnectedOrConnecting();
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    private static Locale a(Context context) {
        Locale locale;
        try {
            Configuration configuration = new Configuration();
            Settings.System.getConfiguration(context.getContentResolver(), configuration);
            locale = configuration.locale;
        } catch (Exception unused) {
            UMLog.mutlInfo(f81145b, 0, "fail to read user config locale");
            locale = null;
        }
        if (locale == null) {
            return Locale.getDefault();
        }
        return locale;
    }

    public static String getDIN(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            UMLog.mutlInfo(f81145b, 1, "No IMEI.");
        }
        try {
            if (checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                String deviceId = telephonyManager.getDeviceId();
                if (!TextUtils.isEmpty(deviceId)) {
                    return deviceId;
                }
            }
        } catch (Exception e2) {
            UMLog.mutlInfo(f81145b, 1, "No IMEI.", e2.getMessage());
        }
        return "";
    }

    public static String getDisplayResolution(Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            return String.valueOf(i2) + "*" + String.valueOf(i);
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    public static String[] getGPU(GL10 gl10) {
        try {
            return new String[]{gl10.glGetString(7936), gl10.glGetString(7937)};
        } catch (Exception e2) {
            UMLog.mutlInfo(f81145b, 0, "Could not read gpu infor:", e2.getMessage());
            return new String[0];
        }
    }

    public static String getOperator(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
        } catch (Exception e2) {
            UMLog.mutlInfo(f81145b, 2, "read carrier fail", e2.getMessage());
            return "Unknown";
        }
    }

    public static int getTimeZone(Context context) {
        try {
            Calendar instance = Calendar.getInstance(a(context));
            if (instance != null) {
                return instance.getTimeZone().getRawOffset() / 3600000;
            }
        } catch (Exception e2) {
            UMLog.mutlInfo(f81145b, 2, "error in getTimeZone", e2.getMessage());
        }
        return 8;
    }

    public static String getUtdid(Context context) {
        try {
            return UTDevice.getUtdid(context);
        } catch (Throwable th) {
            String str = f81145b;
            UMLog.mutlInfo(str, 0, "获取utdid失败. " + th.getMessage());
            return "";
        }
    }

    public static String getChannel(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                Object obj = applicationInfo.metaData.get("UMENG_CHANNEL");
                if (obj != null) {
                    String obj2 = obj.toString();
                    if (obj2 != null) {
                        return obj2;
                    }
                    UMLog.mutlInfo(f81145b, 2, "在AndroidManifest.xml中读取不到UMENG_CHANNEL meta-data");
                }
            }
        } catch (Exception unused) {
            UMLog.mutlInfo(f81145b, 2, "在AndroidManifest.xml中读取不到UMENG_CHANNEL meta-data");
        }
        return "Unknown";
    }

    public static String getDINAes(Context context) {
        String str;
        try {
            str = getDIN(context);
            try {
                String messageAppkey = PushAgent.getInstance(context).getMessageAppkey();
                if (messageAppkey == null || 24 != messageAppkey.length()) {
                    return c.a(str, "utf-8");
                }
                return c.a(str, "utf-8", messageAppkey.substring(0, 16));
            } catch (Exception e2) {
                e = e2;
                String str2 = f81145b;
                UMLog.mutlInfo(str2, 1, "getDINAes:" + e.getMessage());
                return str;
            }
        } catch (Exception e3) {
            e = e3;
            str = "";
            String str22 = f81145b;
            UMLog.mutlInfo(str22, 1, "getDINAes:" + e.getMessage());
            return str;
        }
    }

    public static String[] getLocaleInfo(Context context) {
        String[] strArr = new String[2];
        try {
            Locale a2 = a(context);
            if (a2 != null) {
                strArr[0] = a2.getCountry();
                strArr[1] = a2.getLanguage();
            }
            if (TextUtils.isEmpty(strArr[0])) {
                strArr[0] = "Unknown";
            }
            if (TextUtils.isEmpty(strArr[1])) {
                strArr[1] = "Unknown";
            }
            return strArr;
        } catch (Exception e2) {
            UMLog.mutlInfo(f81145b, 0, "error in getLocaleInfo", e2.getMessage());
            return strArr;
        }
    }

    public static String[] getNetworkAccessMode(Context context) {
        String[] strArr = {"Unknown", "Unknown"};
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
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
        } catch (Exception unused) {
        }
    }

    public static String getResolution(Context context) {
        int i;
        int i2;
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            if ((context.getApplicationInfo().flags & 8192) == 0) {
                i = a(displayMetrics, "noncompatWidthPixels");
                i2 = a(displayMetrics, "noncompatHeightPixels");
            } else {
                i = -1;
                i2 = 0;
            }
            if (i == -1 || i2 == -1) {
                i = displayMetrics.widthPixels;
                i2 = displayMetrics.heightPixels;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(i);
            stringBuffer.append("*");
            stringBuffer.append(i2);
            return stringBuffer.toString();
        } catch (Exception e2) {
            UMLog.mutlInfo(f81145b, 0, "read resolution fail", e2.getMessage());
            return "Unknown";
        }
    }

    public static boolean getDataData(String str) {
        boolean exists = new File("/data/app/" + str + "-1.apk").exists();
        if (!exists) {
            exists = new File("/data/app/" + str + "-2.apk").exists();
        }
        if (!exists) {
            exists = new File("/data/app/" + str + ".apk").exists();
        }
        if (!exists) {
            exists = new File("/data/app/" + str + "-1").exists();
        }
        if (exists) {
            return exists;
        }
        return new File("/data/app/" + str + "-2").exists();
    }

    public static String getDeviceId(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            UMLog.mutlInfo(f81145b, 1, "No IMEI.");
        }
        String str = "";
        try {
            if (checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                str = telephonyManager.getDeviceId();
            }
        } catch (Exception e2) {
            UMLog.mutlInfo(f81145b, 1, "No IMEI.", e2.getMessage());
        }
        if (TextUtils.isEmpty(str)) {
            UMLog.mutlInfo(f81145b, 1, "No IMEI.");
            str = getMac(context);
            if (TextUtils.isEmpty(str)) {
                UMLog.mutlInfo(f81145b, 1, "Failed to take mac as IMEI. Try to use Secure.ANDROID_ID instead.");
                str = Settings.Secure.getString(context.getContentResolver(), "android_id");
                String str2 = f81145b;
                UMLog.mutlInfo(str2, 2, "getDeviceId: Secure.ANDROID_ID: " + str);
                if (TextUtils.isEmpty(str)) {
                    UMLog.mutlInfo(f81145b, 1, "Failed to take Secure.ANDROID_ID as IMEI. Try to use Serial_number instead.");
                    String serial_number = getSerial_number();
                    String str3 = f81145b;
                    UMLog.mutlInfo(str3, 2, "getDeviceId: Serial_number: " + serial_number);
                    return serial_number;
                }
            }
        }
        return str;
    }

    public static Location getLocation(Context context) {
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            if (checkPermission(context, "android.permission.ACCESS_FINE_LOCATION")) {
                Location lastKnownLocation = locationManager.getLastKnownLocation("gps");
                if (lastKnownLocation != null) {
                    String str = f81145b;
                    UMLog.mutlInfo(str, 2, "get location from gps:" + lastKnownLocation.getLatitude() + "," + lastKnownLocation.getLongitude());
                    return lastKnownLocation;
                }
            }
            if (checkPermission(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                Location lastKnownLocation2 = locationManager.getLastKnownLocation("network");
                if (lastKnownLocation2 != null) {
                    String str2 = f81145b;
                    UMLog.mutlInfo(str2, 2, "get location from network:" + lastKnownLocation2.getLatitude() + "," + lastKnownLocation2.getLongitude());
                    return lastKnownLocation2;
                }
            }
            UMLog.mutlInfo(f81145b, 2, "Could not get location from GPS or Cell-id, lack ACCESS_COARSE_LOCATION or ACCESS_COARSE_LOCATION permission?");
            return null;
        } catch (Exception e2) {
            UMLog.mutlInfo(f81145b, 0, e2.getMessage());
            return null;
        }
    }

    public static String getMac(Context context) {
        if (Build.VERSION.SDK_INT <= 22) {
            try {
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                if (checkPermission(context, "android.permission.ACCESS_WIFI_STATE")) {
                    return wifiManager.getConnectionInfo().getMacAddress();
                }
                UMLog.mutlInfo(f81145b, 1, "Could not get mac address.[no permission android.permission.ACCESS_WIFI_STATE");
            } catch (Exception e2) {
                UMLog.mutlInfo(f81145b, 1, "Could not get mac address." + e2.toString());
            }
        } else {
            try {
                for (T t : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                    if (t.getName().equalsIgnoreCase("wlan0")) {
                        byte[] hardwareAddress = t.getHardwareAddress();
                        if (hardwareAddress == null) {
                            return "";
                        }
                        StringBuilder sb = new StringBuilder();
                        for (byte valueOf : hardwareAddress) {
                            sb.append(String.format("%02X:", new Object[]{Byte.valueOf(valueOf)}));
                        }
                        if (sb.length() > 0) {
                            sb.deleteCharAt(sb.length() - 1);
                        }
                        return sb.toString();
                    }
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static String isNotificationEnabled(Context context) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                String packageName = context.getApplicationContext().getPackageName();
                int i = applicationInfo.uid;
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                if (((Integer) cls.getMethod("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(appOpsManager)).intValue()), Integer.valueOf(i), packageName})).intValue() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                return String.valueOf(z);
            } catch (Exception unused) {
                UMLog.mutlInfo(f81145b, 0, "通知开关是否打开异常");
            }
        }
        return "unknown";
    }

    public static boolean isAppInstalled(String str, Context context) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private static int a(Object obj, String str) {
        try {
            Field declaredField = DisplayMetrics.class.getDeclaredField(str);
            if (declaredField != null) {
                declaredField.setAccessible(true);
                return declaredField.getInt(obj);
            }
        } catch (Exception unused) {
        }
        return -1;
    }

    public static boolean checkPermission(Context context, String str) {
        if (context.getPackageManager().checkPermission(str, context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }

    public static int getIntervalSeconds(Date date, Date date2) {
        if (date.after(date2)) {
            Date date3 = date2;
            date2 = date;
            date = date3;
        }
        return (int) ((date2.getTime() - date.getTime()) / 1000);
    }

    public static String getMetaData(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f);
            if (applicationInfo != null) {
                String string = applicationInfo.metaData.getString(str);
                if (string != null) {
                    return string.trim();
                }
            }
        } catch (Exception unused) {
        }
        UMLog.mutlInfo(f81145b, 0, String.format("Could not read meta-data %s from AndroidManifest.xml.", new Object[]{str}));
        return null;
    }

    public static boolean isIntentExist(Context context, String str, String str2) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0);
        if (queryIntentActivities.isEmpty()) {
            return false;
        }
        for (int i = 0; i < queryIntentActivities.size(); i++) {
            if (queryIntentActivities.get(i).activityInfo.packageName.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    public static String getServiceName(Context context, String str, String str2) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent();
        intent.setAction(str);
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        ArrayList arrayList = new ArrayList();
        if (queryIntentServices != null && queryIntentServices.size() > 0) {
            for (ResolveInfo next : queryIntentServices) {
                if (next.serviceInfo.packageName.equals(str2)) {
                    arrayList.add(next);
                }
            }
        }
        if (arrayList.size() > 0) {
            return ((ResolveInfo) arrayList.get(0)).serviceInfo.name;
        }
        return null;
    }

    public static boolean isServiceWork(Context context, String str, String str2) {
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningServices(Integer.MAX_VALUE);
        boolean z = false;
        if (runningServices.size() <= 0) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= runningServices.size()) {
                break;
            }
            String str3 = runningServices.get(i).service.getClassName().toString();
            String str4 = runningServices.get(i).service.getPackageName().toString();
            if (str3.equals(str) && str4.equals(str2)) {
                z = true;
                break;
            }
            i++;
        }
        return z;
    }
}
