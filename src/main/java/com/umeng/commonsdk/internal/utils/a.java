package com.umeng.commonsdk.internal.utils;

import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.taobao.android.dexposed.ClassUtils;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.ULog;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class a {

    /* renamed from: com.umeng.commonsdk.internal.utils.a$a  reason: collision with other inner class name */
    public static class C0860a {

        /* renamed from: a  reason: collision with root package name */
        public String f80749a;

        /* renamed from: b  reason: collision with root package name */
        public String f80750b;
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f80751a;

        /* renamed from: b  reason: collision with root package name */
        public int f80752b = -1;

        /* renamed from: c  reason: collision with root package name */
        public String f80753c;
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f80754a;

        /* renamed from: b  reason: collision with root package name */
        public String f80755b;

        /* renamed from: c  reason: collision with root package name */
        public String f80756c;

        /* renamed from: d  reason: collision with root package name */
        public int f80757d;

        /* renamed from: e  reason: collision with root package name */
        public int f80758e;

        /* renamed from: f  reason: collision with root package name */
        public int f80759f;
        public int g;
        public String h;
        public int i;
        public int j;
        public int k;
        public long l;
    }

    public static String r(Context context) {
        return context == null ? null : null;
    }

    public static String s(Context context) {
        return null;
    }

    public static boolean a() {
        return h.a();
    }

    public static String b() {
        return new SimpleDateFormat().format(new Date());
    }

    public static String e() {
        return g.a("df");
    }

    public static long f() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    public static long c() {
        if (!j() || Build.VERSION.SDK_INT < 9) {
            return 0;
        }
        return Environment.getExternalStorageDirectory().getFreeSpace();
    }

    public static long d() {
        if (!j() || Build.VERSION.SDK_INT < 9) {
            return 0;
        }
        return Environment.getExternalStorageDirectory().getTotalSpace();
    }

    private static boolean j() {
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) {
            return true;
        }
        return false;
    }

    public static long h() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static long i() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String g() {
        String str = null;
        try {
            Method declaredMethod = Build.class.getDeclaredMethod("getString", new Class[]{String.class});
            declaredMethod.setAccessible(true);
            String obj = declaredMethod.invoke(null, new Object[]{"net.hostname"}).toString();
            if (obj != null) {
                try {
                    if (!obj.equalsIgnoreCase("")) {
                        return HelperUtils.getUmengMD5(obj);
                    }
                } catch (Exception e2) {
                    String str2 = obj;
                    e = e2;
                    str = str2;
                    ULog.e("getHostName:" + e.getMessage());
                    return str;
                }
            }
            return obj;
        } catch (Exception e3) {
            e = e3;
            ULog.e("getHostName:" + e.getMessage());
            return str;
        }
    }

    public static void f(Context context) {
        if (context != null) {
            f.c(context);
        }
    }

    public static DisplayMetrics j(Context context) {
        if (context == null) {
            return null;
        }
        return context.getResources().getDisplayMetrics();
    }

    public static JSONObject o(Context context) {
        if (context == null) {
            return null;
        }
        return f.a(context);
    }

    public static JSONArray e(Context context) {
        if (context == null) {
            return null;
        }
        return f.b(context);
    }

    public static int g(Context context) {
        int i = -1;
        if (context == null) {
            return -1;
        }
        if (DeviceConfig.checkPermission(context, "android.permission.ACCESS_WIFI_STATE")) {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager != null) {
                i = wifiManager.getWifiState();
            }
        }
        return i;
    }

    public static int h(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
    }

    public static int i(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    public static String k(Context context) {
        String str = null;
        if (context == null) {
            return null;
        }
        if (DeviceConfig.checkPermission(context, "android.permission.READ_PHONE_STATE")) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                str = telephonyManager.getSubscriberId();
            }
        }
        return str;
    }

    public static List<InputMethodInfo> m(Context context) {
        if (context == null) {
            return null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager == null) {
            return null;
        }
        return inputMethodManager.getInputMethodList();
    }

    public static ActivityManager.MemoryInfo q(Context context) {
        if (context == null) {
            return null;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
        if (activityManager == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    public static float a(Context context) {
        float f2;
        if (context == null) {
            return 0.0f;
        }
        Configuration configuration = new Configuration();
        try {
            configuration.updateFrom(context.getResources().getConfiguration());
            f2 = configuration.fontScale;
        } catch (Exception e2) {
            ULog.e("getFontSize:" + e2.getMessage());
            f2 = 0.0f;
        }
        return f2;
    }

    public static WifiInfo c(Context context) {
        WifiInfo wifiInfo = null;
        if (context == null) {
            return null;
        }
        if (DeviceConfig.checkPermission(context, "android.permission.ACCESS_WIFI_STATE")) {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager != null) {
                wifiInfo = wifiManager.getConnectionInfo();
            }
        }
        return wifiInfo;
    }

    public static String l(Context context) {
        String str = null;
        if (context == null) {
            return null;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return null;
        }
        if (DeviceConfig.checkPermission(context, "android.permission.READ_PHONE_STATE") && telephonyManager != null) {
            if (Build.VERSION.SDK_INT < 26) {
                str = telephonyManager.getDeviceId();
            } else {
                try {
                    String t = t(context);
                    try {
                        if (TextUtils.isEmpty(t)) {
                            str = telephonyManager.getDeviceId();
                        }
                    } catch (Throwable unused) {
                    }
                    str = t;
                } catch (Throwable unused2) {
                }
            }
        }
        return str;
    }

    private static String t(Context context) {
        String str = null;
        if (context == null) {
            return null;
        }
        try {
            Object invoke = Class.forName("android.telephony.TelephonyManager").getMethod("getMeid", new Class[0]).invoke(null, new Object[0]);
            if (invoke != null && (invoke instanceof String)) {
                str = (String) invoke;
            }
        } catch (Exception e2) {
            ULog.e("meid:" + e2.getMessage());
        }
        return str;
    }

    public static List<ScanResult> b(Context context) {
        List<ScanResult> list = null;
        if (context == null) {
            return null;
        }
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        if (wifiManager == null) {
            return null;
        }
        if (DeviceConfig.checkPermission(context, "android.permission.ACCESS_WIFI_STATE") && (DeviceConfig.checkPermission(context, "android.permission.ACCESS_COARSE_LOCATION") || DeviceConfig.checkPermission(context, "android.permission.ACCESS_FINE_LOCATION"))) {
            list = wifiManager.getScanResults();
            if (list == null || list.size() == 0) {
                return list;
            }
        }
        return list;
    }

    public static void n(Context context) {
        if (context != null) {
            try {
                if (DeviceConfig.checkPermission(context, "android.permission.BLUETOOTH")) {
                    BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                    b bVar = new b();
                    if (defaultAdapter.isEnabled()) {
                        bVar.f80752b = defaultAdapter.getState();
                        if (Build.VERSION.SDK_INT < 23) {
                            bVar.f80751a = defaultAdapter.getAddress();
                        } else {
                            bVar.f80751a = a(defaultAdapter);
                        }
                        bVar.f80753c = defaultAdapter.getName();
                        UMWorkDispatch.sendEvent(context, 32773, com.umeng.commonsdk.internal.b.a(context).a(), bVar);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static List<C0860a> p(Context context) {
        if (context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(Environment.getExternalStorageDirectory() + "/Android/data/");
            if (file.isDirectory()) {
                String[] list = file.list();
                if (list != null && list.length > 0) {
                    for (String str : list) {
                        if (str != null && !str.startsWith(ClassUtils.PACKAGE_SEPARATOR)) {
                            C0860a aVar = new C0860a();
                            aVar.f80749a = str;
                            aVar.f80750b = e(context, str);
                            arrayList.add(aVar);
                        }
                    }
                }
            }
        } catch (Exception e2) {
            ULog.e("getAppList:" + e2.getMessage());
        }
        return arrayList;
    }

    private static String a(BluetoothAdapter bluetoothAdapter) {
        if (bluetoothAdapter == null) {
            return null;
        }
        Class<?> cls = bluetoothAdapter.getClass();
        try {
            Class<?> cls2 = Class.forName("android.bluetooth.IBluetooth");
            Field declaredField = cls.getDeclaredField("mService");
            declaredField.setAccessible(true);
            Method method = cls2.getMethod("getAddress", new Class[0]);
            method.setAccessible(true);
            return (String) method.invoke(declaredField.get(bluetoothAdapter), new Object[0]);
        } catch (Exception unused) {
            return bluetoothAdapter.getAddress();
        }
    }

    public static void d(Context context) {
        if (context != null) {
            WifiInfo c2 = c(context);
            if (c2 != null) {
                c cVar = new c();
                cVar.f80754a = c2.describeContents();
                cVar.f80755b = c2.getBSSID();
                cVar.f80756c = c2.getSSID();
                if (Build.VERSION.SDK_INT >= 21) {
                    cVar.f80757d = c2.getFrequency();
                } else {
                    cVar.f80757d = -1;
                }
                boolean z = false;
                if (c2.getHiddenSSID()) {
                    cVar.f80758e = 1;
                } else {
                    cVar.f80758e = 0;
                }
                cVar.f80759f = c2.getIpAddress();
                cVar.g = c2.getLinkSpeed();
                cVar.h = DeviceConfig.getMac(context);
                cVar.i = c2.getNetworkId();
                cVar.j = c2.getRssi();
                cVar.k = g(context);
                cVar.l = System.currentTimeMillis();
                if (c2 != null) {
                    try {
                        JSONArray b2 = f.b(context);
                        if (b2 != null && b2.length() > 0) {
                            int i = 0;
                            while (true) {
                                if (i >= b2.length()) {
                                    break;
                                }
                                String optString = b2.optJSONObject(i).optString("ssid", null);
                                if (optString != null && optString.equals(cVar.f80756c)) {
                                    z = true;
                                    break;
                                }
                                i++;
                            }
                        }
                        if (!z) {
                            f.a(context, cVar);
                        }
                    } catch (Exception e2) {
                        ULog.e("wifiChange:" + e2.getMessage());
                    }
                }
            }
        }
    }

    public static long b(Context context, String str) {
        long j = 0;
        if (context == null) {
            return 0;
        }
        try {
            j = context.getPackageManager().getPackageInfo(str, 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e2) {
            UMCrashManager.reportCrash(context, e2);
            ULog.e("getAppLastUpdateTime:" + e2.getMessage());
        }
        return j;
    }

    public static int d(Context context, String str) {
        int i;
        if (context == null) {
            return 0;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(str, 0).applicationInfo;
            if (applicationInfo != null) {
                i = applicationInfo.uid;
            } else {
                i = 0;
            }
            return i;
        } catch (PackageManager.NameNotFoundException e2) {
            UMCrashManager.reportCrash(context, e2);
            ULog.e("getAppUid:" + e2.getMessage());
            return 0;
        }
    }

    private static String e(Context context, String str) {
        String str2 = null;
        if (context == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, SearchJediMixFeedAdapter.f42517f);
            if (applicationInfo != null) {
                str2 = (String) applicationInfo.loadLabel(context.getPackageManager());
            }
        } catch (Exception e2) {
            ULog.e("getLabel:" + e2.getMessage());
        }
        return str2;
    }

    public static long a(Context context, String str) {
        long j = 0;
        if (context == null) {
            return 0;
        }
        try {
            j = context.getPackageManager().getPackageInfo(str, 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e2) {
            UMCrashManager.reportCrash(context, e2);
            ULog.e("getAppFirstInstallTime" + e2.getMessage());
        }
        return j;
    }

    public static String c(Context context, String str) {
        try {
            return context.getPackageManager().getInstallerPackageName(str);
        } catch (Exception e2) {
            UMCrashManager.reportCrash(context, e2);
            ULog.e("getAppInstaller:" + e2.getMessage());
            return null;
        }
    }
}
