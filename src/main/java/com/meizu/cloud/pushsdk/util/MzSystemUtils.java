package com.meizu.cloud.pushsdk.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.a.a;
import com.meizu.cloud.pushsdk.base.c;
import com.meizu.cloud.pushsdk.base.k;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class MzSystemUtils {
    private static final String TAG = "MzSystemUtils";

    public static boolean compareVersion(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int min = Math.min(split.length, split2.length);
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            i = split[i2].length() - split2[i2].length();
            if (i != 0) {
                break;
            }
            i = split[i2].compareTo(split2[i2]);
            if (i != 0) {
                break;
            }
        }
        if (i == 0) {
            i = split.length - split2.length;
        }
        return i >= 0;
    }

    public static boolean compatApi(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    public static String findReceiver(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Intent intent = new Intent(str);
            intent.setPackage(str2);
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                return queryBroadcastReceivers.get(0).activityInfo.name;
            }
        }
        return null;
    }

    public static int getAppVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static String getAppVersionName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static String getAppVersionName(Context context, String str) {
        try {
            String str2 = context.getPackageManager().getPackageInfo(str, 0).versionName;
            if (str2 != null) {
                if (str2.length() > 0) {
                    return str2;
                }
            }
            return "";
        } catch (Exception e2) {
            DebugLogger.e("VersionInfo", "Exception message " + e2.getMessage());
            return "";
        }
    }

    public static String getBSSID(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager == null) {
                return null;
            }
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo != null) {
                return connectionInfo.getBSSID();
            }
            return null;
        } catch (Exception e2) {
            DebugLogger.e(TAG, "getOperator error " + e2.getMessage());
            return null;
        }
    }

    public static String getCurrentLanguage() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception e2) {
            DebugLogger.e(TAG, "getCurrentLanguage error " + e2.getMessage());
            return null;
        }
    }

    public static String getDeviceId(Context context) {
        try {
            return c.a(context);
        } catch (Exception e2) {
            DebugLogger.e(TAG, "getDeviceId error " + e2.getMessage());
            return null;
        }
    }

    public static String getDeviceId(Context context, int i) {
        Object phoneInfo = getPhoneInfo(context, i, "getDeviceId");
        return phoneInfo != null ? (String) phoneInfo : "";
    }

    public static List<String> getInstalledPackage(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
                if (installedPackages != null) {
                    for (PackageInfo packageInfo : installedPackages) {
                        arrayList.add(packageInfo.packageName);
                    }
                }
            }
        } catch (Exception e2) {
            DebugLogger.e(TAG, "getInstalledPackage error " + e2.getMessage());
        }
        return arrayList;
    }

    public static String getLineNumber(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return telephonyManager.getLine1Number();
            }
            return null;
        } catch (Exception e2) {
            DebugLogger.e(TAG, "getLineNumber error " + e2.getMessage());
            return null;
        }
    }

    public static Class[] getMethodParamTypes(String str) {
        Class[] clsArr = null;
        try {
            Method[] declaredMethods = TelephonyManager.class.getDeclaredMethods();
            for (int i = 0; i < declaredMethods.length; i++) {
                if (str.equals(declaredMethods[i].getName())) {
                    Class[] parameterTypes = declaredMethods[i].getParameterTypes();
                    try {
                        if (parameterTypes.length > 0) {
                            DebugLogger.d(TAG, "getMethodParamTypes " + parameterTypes.length);
                            return parameterTypes;
                        }
                        clsArr = parameterTypes;
                    } catch (Exception e2) {
                        e = e2;
                        clsArr = parameterTypes;
                        DebugLogger.d(TAG, "getMethodParamTypes " + e.toString());
                        return clsArr;
                    }
                }
            }
            return clsArr;
        } catch (Exception e3) {
            e = e3;
            DebugLogger.d(TAG, "getMethodParamTypes " + e.toString());
            return clsArr;
        }
    }

    public static String getMzPushServicePackageName(Context context) {
        String packageName = context.getPackageName();
        try {
            String servicesByPackageName = getServicesByPackageName(context, "com.meizu.cloud");
            if (!TextUtils.isEmpty(servicesByPackageName) && servicesByPackageName.contains("mzservice_v1")) {
                return "com.meizu.cloud";
            }
        } catch (Exception unused) {
        }
        DebugLogger.i("SystemUtils", "startservice package name " + packageName);
        return packageName;
    }

    public static String getNetWorkType(Context context) {
        String str;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                if (type == 7) {
                    return "BLUETOOTH";
                }
                if (type == 9) {
                    return "ETHERNET";
                }
                switch (type) {
                    case 0:
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                            case 4:
                            case e.l /*?: ONE_ARG  (7 int)*/:
                            case 11:
                                str = "MOBILE_2G";
                                break;
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                            case 14:
                            case 15:
                                str = "MOBILE_3G";
                                break;
                            case 13:
                                str = "MOBILE_4G";
                                break;
                            default:
                                str = "MOBILE_XG";
                                break;
                        }
                        String str2 = str;
                        break;
                    case 1:
                        return "WIFI";
                }
                return "OTHER";
            }
        } catch (SecurityException e2) {
            DebugLogger.e(TAG, "Security exception checking connection: " + e2.getMessage());
        }
        return "";
    }

    public static String getOperator(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return telephonyManager.getSimOperator();
            }
            return null;
        } catch (Exception e2) {
            DebugLogger.e(TAG, "getOperator error " + e2.getMessage());
            return null;
        }
    }

    public static Object getPhoneInfo(Context context, int i, String str) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            Method method = telephonyManager.getClass().getMethod(str, getMethodParamTypes(str));
            if (i < 0) {
                return null;
            }
            return method.invoke(telephonyManager, new Object[]{Integer.valueOf(i)});
        } catch (Exception e2) {
            DebugLogger.d(TAG, e2.toString());
            return null;
        }
    }

    public static String getProcessName(Context context) {
        try {
            int myPid = Process.myPid();
            String str = "";
            Iterator<ActivityManager.RunningAppProcessInfo> it2 = ((ActivityManager) context.getApplicationContext().getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it2.next();
                DebugLogger.i(TAG, "processName " + next.processName);
                if (next.pid == myPid) {
                    str = next.processName;
                    break;
                }
            }
            return str;
        } catch (Exception e2) {
            DebugLogger.e(TAG, "getProcessName error " + e2.getMessage());
            return null;
        }
    }

    public static List<String> getRunningProcess(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses()) {
                arrayList.add(runningAppProcessInfo.processName);
            }
        } catch (Exception unused) {
            DebugLogger.e(TAG, "can not get running process info so set running true");
        }
        return arrayList;
    }

    private static String getServicesByPackageName(Context context, String str) {
        ServiceInfo[] serviceInfoArr;
        try {
            serviceInfoArr = context.getPackageManager().getPackageInfo(str, 4).services;
        } catch (PackageManager.NameNotFoundException unused) {
            serviceInfoArr = null;
        }
        if (serviceInfoArr == null) {
            return null;
        }
        for (int i = 0; i < serviceInfoArr.length; i++) {
            if ("com.meizu.cloud.pushsdk.pushservice.MzPushService".equals(serviceInfoArr[i].name)) {
                return serviceInfoArr[i].processName;
            }
        }
        return null;
    }

    public static String getSn() {
        String a2 = k.a("ro.serialno");
        return !TextUtils.isEmpty(a2) ? a2 : Build.SERIAL;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getSubId(android.content.Context r8, int r9) {
        /*
            r0 = 0
            java.lang.String r1 = "content://telephony/siminfo"
            android.net.Uri r3 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x004e }
            android.content.ContentResolver r2 = r8.getContentResolver()     // Catch:{ Exception -> 0x004e }
            r8 = 2
            java.lang.String[] r4 = new java.lang.String[r8]     // Catch:{ Exception -> 0x004e }
            java.lang.String r8 = "_id"
            r1 = 0
            r4[r1] = r8     // Catch:{ Exception -> 0x004e }
            java.lang.String r8 = "sim_id"
            r5 = 1
            r4[r5] = r8     // Catch:{ Exception -> 0x004e }
            java.lang.String r8 = "sim_id = ?"
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ Exception -> 0x004e }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x004e }
            r6[r1] = r9     // Catch:{ Exception -> 0x004e }
            r7 = 0
            r5 = r8
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x004e }
            if (r8 == 0) goto L_0x0046
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            if (r9 == 0) goto L_0x0046
            java.lang.String r9 = "_id"
            int r9 = r8.getColumnIndex(r9)     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            int r9 = r8.getInt(r9)     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            if (r8 == 0) goto L_0x003f
            r8.close()
        L_0x003f:
            return r9
        L_0x0040:
            r9 = move-exception
            r0 = r8
            goto L_0x006d
        L_0x0043:
            r9 = move-exception
            r0 = r8
            goto L_0x004f
        L_0x0046:
            if (r8 == 0) goto L_0x006b
            r8.close()
            goto L_0x006b
        L_0x004c:
            r9 = move-exception
            goto L_0x006d
        L_0x004e:
            r9 = move-exception
        L_0x004f:
            java.lang.String r8 = "MzSystemUtils"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            java.lang.String r2 = "getSubId "
            r1.<init>(r2)     // Catch:{ all -> 0x004c }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x004c }
            r1.append(r9)     // Catch:{ all -> 0x004c }
            java.lang.String r9 = r1.toString()     // Catch:{ all -> 0x004c }
            com.meizu.cloud.pushinternal.DebugLogger.d(r8, r9)     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x006b
            r0.close()
        L_0x006b:
            r8 = -1
            return r8
        L_0x006d:
            if (r0 == 0) goto L_0x0072
            r0.close()
        L_0x0072:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.util.MzSystemUtils.getSubId(android.content.Context, int):int");
    }

    public static String getSubscriberId(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return telephonyManager.getSubscriberId();
            }
            return null;
        } catch (Exception e2) {
            DebugLogger.e(TAG, "getSubscribeId error " + e2.getMessage());
            return null;
        }
    }

    public static String getSubscriberId(Context context, int i) {
        Object phoneInfo = getPhoneInfo(context, i, "getSubscriberId");
        return phoneInfo != null ? (String) phoneInfo : "";
    }

    public static String getWifiMac(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager == null) {
                return null;
            }
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo != null) {
                return connectionInfo.getMacAddress();
            }
            return null;
        } catch (Exception e2) {
            DebugLogger.e(TAG, "getWifiMac error " + e2.getMessage());
            return null;
        }
    }

    public static boolean isApplicationDebug(Context context) {
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isBrandMeizu(Context context) {
        boolean z = !TextUtils.isEmpty(k.a("ro.meizu.product.model")) || "meizu".equalsIgnoreCase(Build.BRAND) || "22c4185e".equalsIgnoreCase(Build.BRAND);
        if (!z) {
            a.b(context.getApplicationContext());
        }
        return z;
    }

    public static boolean isHuaWei() {
        String a2 = k.a("ro.build.version.emui");
        DebugLogger.e(TAG, "huawei eui " + a2);
        return !TextUtils.isEmpty(a2);
    }

    public static boolean isIndiaLocal() {
        return "india".equals(k.a("ro.meizu.locale.region"));
    }

    public static boolean isInternational() {
        if (com.meizu.cloud.pushsdk.base.a.a().f27048a) {
            return ((Boolean) com.meizu.cloud.pushsdk.base.a.a().f27049b).booleanValue();
        }
        return false;
    }

    public static boolean isMeizu(Context context) {
        return isBrandMeizu(context);
    }

    public static boolean isPackageInstalled(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean isRunningProcess(Context context, String str) {
        try {
            boolean z = false;
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses()) {
                z = runningAppProcessInfo.processName.contains(str);
                if (z) {
                    break;
                }
            }
            DebugLogger.i(TAG, str + " is running " + z);
            return z;
        } catch (Exception unused) {
            DebugLogger.e(TAG, "can not get running process info so set running true");
            return true;
        }
    }

    public static boolean isXiaoMi() {
        return "Xiaomi".equals(Build.MODEL) || "Xiaomi".equals(Build.MANUFACTURER);
    }

    public static void sendMessageFromBroadcast(Context context, Intent intent, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            intent.setAction(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.setPackage(str2);
        }
        String findReceiver = findReceiver(context, str, str2);
        if (!TextUtils.isEmpty(findReceiver)) {
            intent.setClassName(str2, findReceiver);
        }
        context.sendBroadcast(intent);
    }
}
