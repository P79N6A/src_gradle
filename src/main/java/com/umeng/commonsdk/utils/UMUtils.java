package com.umeng.commonsdk.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.MLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.microedition.khronos.opengles.GL10;

public class UMUtils {
    private static final Pattern pattern = Pattern.compile("UTDID\">([^<]+)");
    private static Object spLock = new Object();

    private static boolean isFlyMe() {
        try {
            Build.class.getMethod("hasSmartBar", new Class[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isSdCardWrittenable() {
        if (Environment.getExternalStorageState().equals("mounted")) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025 A[SYNTHETIC, Splitter:B:13:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002b A[SYNTHETIC, Splitter:B:19:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Properties getBuildProp() {
        /*
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0029, all -> 0x0022 }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x0029, all -> 0x0022 }
            java.io.File r4 = android.os.Environment.getRootDirectory()     // Catch:{ IOException -> 0x0029, all -> 0x0022 }
            java.lang.String r5 = "build.prop"
            r3.<init>(r4, r5)     // Catch:{ IOException -> 0x0029, all -> 0x0022 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0029, all -> 0x0022 }
            r0.load(r2)     // Catch:{ IOException -> 0x0020, all -> 0x001d }
            r2.close()     // Catch:{ IOException -> 0x002e }
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
            r1.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            throw r0
        L_0x0029:
            if (r1 == 0) goto L_0x002e
            r1.close()     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.getBuildProp():java.util.Properties");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getCPU() {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{  }
            java.lang.String r2 = "/proc/cpuinfo"
            r1.<init>(r2)     // Catch:{  }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x001c }
            r3 = 1024(0x400, float:1.435E-42)
            r2.<init>(r1, r3)     // Catch:{ FileNotFoundException -> 0x001c }
            java.lang.String r3 = r2.readLine()     // Catch:{ FileNotFoundException -> 0x001c }
            r2.close()     // Catch:{ FileNotFoundException | IOException -> 0x001a }
            r1.close()     // Catch:{ FileNotFoundException | IOException -> 0x001a }
            goto L_0x001d
        L_0x001a:
            goto L_0x001d
        L_0x001c:
            r3 = r0
        L_0x001d:
            if (r3 == 0) goto L_0x0036
            r0 = 58
            int r0 = r3.indexOf(r0)     // Catch:{ Exception -> 0x0033, Throwable -> 0x0030 }
            int r0 = r0 + 1
            java.lang.String r0 = r3.substring(r0)     // Catch:{ Exception -> 0x0033, Throwable -> 0x0030 }
            java.lang.String r0 = r0.trim()     // Catch:{ Exception -> 0x0033, Throwable -> 0x0030 }
            return r0
        L_0x0030:
            java.lang.String r0 = ""
            return r0
        L_0x0033:
            java.lang.String r0 = ""
            return r0
        L_0x0036:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.getCPU():java.lang.String");
    }

    public static String getAppHashKey(Context context) {
        return DeviceConfig.getAppHashKey(context);
    }

    public static String getAppSHA1Key(Context context) {
        return DeviceConfig.getAppSHA1Key(context);
    }

    public static int getTargetSdkVersion(Context context) {
        return context.getApplicationInfo().targetSdkVersion;
    }

    private static void safeClose(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public static boolean checkPath(String str) {
        try {
            if (Class.forName(str) == null) {
                return false;
            }
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static String getYunOSVersion(Properties properties) {
        String property = properties.getProperty("ro.yunos.version");
        if (!TextUtils.isEmpty(property)) {
            return property;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:? A[ExcHandler: Throwable (unused java.lang.Throwable), SYNTHETIC, Splitter:B:1:0x0001] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String encryptBySHA1(java.lang.String r2) {
        /*
            r0 = 0
            byte[] r2 = r2.getBytes()     // Catch:{ Exception -> 0x0019, Throwable -> 0x0018 }
            java.lang.String r1 = "SHA1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ Exception -> 0x0017, Throwable -> 0x0018 }
            r1.update(r2)     // Catch:{ Exception -> 0x0017, Throwable -> 0x0018 }
            byte[] r2 = r1.digest()     // Catch:{ Exception -> 0x0017, Throwable -> 0x0018 }
            java.lang.String r2 = bytes2Hex(r2)     // Catch:{ Exception -> 0x0017, Throwable -> 0x0018 }
            return r2
        L_0x0017:
            return r0
        L_0x0018:
            return r0
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.encryptBySHA1(java.lang.String):java.lang.String");
    }

    public static String getAppMD5Signature(Context context) {
        String appMD5Signature = DeviceConfig.getAppMD5Signature(context);
        if (!TextUtils.isEmpty(appMD5Signature)) {
            return appMD5Signature.replace(":", "").toLowerCase();
        }
        return appMD5Signature;
    }

    public static String getAppVersionCode(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
            return "";
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static String getAppVersionName(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static String getAppkey(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return getMultiProcessSP(context, "appkey");
        } catch (Exception e2) {
            UMCrashManager.reportCrash(context, e2);
            return null;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    public static String getChannel(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return getMultiProcessSP(context, "channel");
        } catch (Exception e2) {
            UMCrashManager.reportCrash(context, e2);
            return null;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    public static String[] getGPU(GL10 gl10) {
        try {
            return new String[]{gl10.glGetString(7936), gl10.glGetString(7937)};
        } catch (Exception unused) {
            return new String[0];
        } catch (Throwable unused2) {
            return new String[0];
        }
    }

    public static String getLastAppkey(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return getMultiProcessSP(context, "last_appkey");
        } catch (Exception e2) {
            UMCrashManager.reportCrash(context, e2);
            return null;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    public static String getUMId(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return UMEnvelopeBuild.imprintProperty(context.getApplicationContext(), "umid", null);
        } catch (Exception e2) {
            UMCrashManager.reportCrash(context, e2);
            return null;
        }
    }

    public static boolean isDebug(Context context) {
        if (context == null) {
            return false;
        }
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            UMCrashManager.reportCrash(context, e2);
            return false;
        }
    }

    private static String parseId(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    private static String readStreamToString(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        char[] cArr = new char[1024];
        StringWriter stringWriter = new StringWriter();
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (-1 == read) {
                return stringWriter.toString();
            }
            stringWriter.write(cArr, 0, read);
        }
    }

    private static String bytes2Hex(byte[] bArr) {
        String str = "";
        for (byte b2 : bArr) {
            if (Integer.toHexString(b2 & 255).length() == 1) {
                str = str + PushConstants.PUSH_TYPE_NOTIFY;
            }
            str = str + r2;
        }
        return str;
    }

    public static String getAppName(Context context) {
        String str = null;
        if (context == null) {
            return null;
        }
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.loadLabel(context.getPackageManager()).toString();
        } catch (Exception e2) {
            UMCrashManager.reportCrash(context, e2);
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
        return str;
    }

    public static String getAppkeyByXML(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f);
            if (applicationInfo != null) {
                String string = applicationInfo.metaData.getString("UMENG_APPKEY");
                if (string != null) {
                    return string.trim();
                }
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.i("MobclickAgent", "Could not read UMENG_APPKEY meta-data from AndroidManifest.xml.");
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String getChannelByXML(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                Object obj = applicationInfo.metaData.get("UMENG_CHANNEL");
                if (obj != null) {
                    String obj2 = obj.toString();
                    if (obj2 != null) {
                        return obj2.trim();
                    }
                    if (AnalyticsConstants.UM_DEBUG) {
                        MLog.i("MobclickAgent", "Could not read UMENG_CHANNEL meta-data from AndroidManifest.xml.");
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String getDeviceType(Context context) {
        boolean z;
        String str;
        if (context == null) {
            return "Phone";
        }
        try {
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
        } catch (Exception e2) {
            UMCrashManager.reportCrash(context, e2);
            return null;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    private static File getFile(Context context) {
        if (context != null && checkPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE") && Environment.getExternalStorageState().equals("mounted")) {
            try {
                return new File(Environment.getExternalStorageDirectory().getCanonicalPath(), ".UTSystemConfig/Global/Alvin2.xml");
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[ExcHandler: Throwable (unused java.lang.Throwable), SYNTHETIC, Splitter:B:1:0x0003] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getFileMD5(java.io.File r7) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            r1 = 0
            byte[] r2 = new byte[r0]     // Catch:{ Exception -> 0x003f, Throwable -> 0x003e }
            boolean r3 = r7.isFile()     // Catch:{ Exception -> 0x003d, Throwable -> 0x003e }
            if (r3 != 0) goto L_0x000e
            java.lang.String r7 = ""
            return r7
        L_0x000e:
            java.lang.String r3 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch:{ Exception -> 0x003d, Throwable -> 0x003e }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x003d, Throwable -> 0x003e }
            r4.<init>(r7)     // Catch:{ Exception -> 0x003d, Throwable -> 0x003e }
        L_0x0019:
            r7 = 0
            int r5 = r4.read(r2, r7, r0)     // Catch:{ Exception -> 0x003d, Throwable -> 0x003e }
            r6 = -1
            if (r5 == r6) goto L_0x0025
            r3.update(r2, r7, r5)     // Catch:{ Exception -> 0x003d, Throwable -> 0x003e }
            goto L_0x0019
        L_0x0025:
            r4.close()     // Catch:{ Exception -> 0x003d, Throwable -> 0x003e }
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ Exception -> 0x003f, Throwable -> 0x003e }
            byte[] r2 = r3.digest()     // Catch:{ Exception -> 0x003f, Throwable -> 0x003e }
            r3 = 1
            r0.<init>(r3, r2)     // Catch:{ Exception -> 0x003f, Throwable -> 0x003e }
            java.lang.String r2 = "%1$032x"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x003f, Throwable -> 0x003e }
            r3[r7] = r0     // Catch:{ Exception -> 0x003f, Throwable -> 0x003e }
            java.lang.String r7 = java.lang.String.format(r2, r3)     // Catch:{ Exception -> 0x003f, Throwable -> 0x003e }
            return r7
        L_0x003d:
            return r1
        L_0x003e:
            return r1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.getFileMD5(java.io.File):java.lang.String");
    }

    private static String getFlymeVersion(Properties properties) {
        try {
            String lowerCase = properties.getProperty("ro.build.display.id").toLowerCase(Locale.getDefault());
            if (lowerCase.contains("flyme os")) {
                return lowerCase.split(" ")[2];
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static String getImsi(Context context) {
        String str = null;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (checkPermission(context, "android.permission.READ_PHONE_STATE") && telephonyManager != null) {
                str = telephonyManager.getSubscriberId();
            }
            return str;
        } catch (Exception e2) {
            UMCrashManager.reportCrash(context, e2);
            return null;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0016 A[ExcHandler: Throwable (r1v5 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:3:0x0004] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Locale getLocale(android.content.Context r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.content.res.Configuration r1 = new android.content.res.Configuration     // Catch:{ Exception -> 0x0018, Throwable -> 0x0016 }
            r1.<init>()     // Catch:{ Exception -> 0x0018, Throwable -> 0x0016 }
            r1.setToDefaults()     // Catch:{ Exception -> 0x0018, Throwable -> 0x0016 }
            android.content.ContentResolver r2 = r3.getContentResolver()     // Catch:{ Exception -> 0x0018, Throwable -> 0x0016 }
            android.provider.Settings.System.getConfiguration(r2, r1)     // Catch:{ Exception -> 0x0018, Throwable -> 0x0016 }
            java.util.Locale r1 = r1.locale     // Catch:{ Exception -> 0x0018, Throwable -> 0x0016 }
            goto L_0x0019
        L_0x0016:
            r1 = move-exception
            goto L_0x0020
        L_0x0018:
            r1 = r0
        L_0x0019:
            if (r1 != 0) goto L_0x0029
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0024, Throwable -> 0x0016 }
            goto L_0x0029
        L_0x0020:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r3, r1)
            return r0
        L_0x0024:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r3, r1)
            return r0
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.getLocale(android.content.Context):java.util.Locale");
    }

    public static String getMac(Context context) {
        if (context == null) {
            return null;
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager == null) {
                return null;
            }
            if (checkPermission(context, "android.permission.ACCESS_WIFI_STATE")) {
                return wifiManager.getConnectionInfo().getMacAddress();
            }
            return "";
        } catch (Exception e2) {
            UMCrashManager.reportCrash(context, e2);
            return null;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    public static String getNetworkOperatorName(Context context) {
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (!checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                return "";
            }
            if (telephonyManager == null) {
                return "";
            }
            return telephonyManager.getNetworkOperatorName();
        } catch (Exception e2) {
            UMCrashManager.reportCrash(context, e2);
            return "";
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return "";
        }
    }

    public static String getOperator(Context context) {
        if (context == null) {
            return "Unknown";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return "Unknown";
            }
            return telephonyManager.getNetworkOperator();
        } catch (Exception e2) {
            UMCrashManager.reportCrash(context, e2);
            return "Unknown";
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return "Unknown";
        }
    }

    public static String getRegisteredOperator(Context context) {
        String str = null;
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return null;
            }
            if (checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                str = telephonyManager.getNetworkOperator();
            }
            return str;
        } catch (Exception e2) {
            UMCrashManager.reportCrash(context, e2);
            return null;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0036, code lost:
        com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0039, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0035 A[ExcHandler: Throwable (r1v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:3:0x0004] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getSubOSName(android.content.Context r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.Properties r1 = getBuildProp()     // Catch:{ Exception -> 0x003a, Throwable -> 0x0035 }
            java.lang.String r2 = "ro.miui.ui.version.name"
            java.lang.String r2 = r1.getProperty(r2)     // Catch:{ Exception -> 0x0030, Throwable -> 0x0035 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0030, Throwable -> 0x0035 }
            if (r3 == 0) goto L_0x002d
            boolean r3 = isFlyMe()     // Catch:{ Exception -> 0x0030, Throwable -> 0x0035 }
            if (r3 == 0) goto L_0x001e
            java.lang.String r1 = "Flyme"
        L_0x001c:
            r0 = r1
            goto L_0x0034
        L_0x001e:
            java.lang.String r1 = getYunOSVersion(r1)     // Catch:{ Exception -> 0x0030, Throwable -> 0x0035 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0030, Throwable -> 0x0035 }
            if (r1 != 0) goto L_0x002b
            java.lang.String r1 = "YunOS"
            goto L_0x001c
        L_0x002b:
            r0 = r2
            goto L_0x0034
        L_0x002d:
            java.lang.String r1 = "MIUI"
            goto L_0x001c
        L_0x0030:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r1)     // Catch:{ Exception -> 0x003a, Throwable -> 0x0035 }
        L_0x0034:
            return r0
        L_0x0035:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r1)
            return r0
        L_0x003a:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.getSubOSName(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002a, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002d, code lost:
        com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0030, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0031, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0032, code lost:
        com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0035, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002c A[ExcHandler: Throwable (r1v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:3:0x0004] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getSubOSVersion(android.content.Context r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.Properties r1 = getBuildProp()     // Catch:{ Exception -> 0x0031, Throwable -> 0x002c }
            java.lang.String r2 = "ro.miui.ui.version.name"
            java.lang.String r2 = r1.getProperty(r2)     // Catch:{ Exception -> 0x0026, Throwable -> 0x002c }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0026, Throwable -> 0x002c }
            if (r3 == 0) goto L_0x0024
            boolean r3 = isFlyMe()     // Catch:{ Exception -> 0x0026, Throwable -> 0x002c }
            if (r3 == 0) goto L_0x001f
            java.lang.String r1 = getFlymeVersion(r1)     // Catch:{ Exception -> 0x0024, Throwable -> 0x002c }
            goto L_0x002b
        L_0x001f:
            java.lang.String r1 = getYunOSVersion(r1)     // Catch:{ Exception -> 0x0024, Throwable -> 0x002c }
            goto L_0x002b
        L_0x0024:
            r1 = r2
            goto L_0x002b
        L_0x0026:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r1)     // Catch:{ Exception -> 0x0031, Throwable -> 0x002c }
            r1 = r0
        L_0x002b:
            return r1
        L_0x002c:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r1)
            return r0
        L_0x0031:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.getSubOSVersion(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        return readUTDId(r7);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0027 */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[ExcHandler: Throwable (unused java.lang.Throwable), SYNTHETIC, Splitter:B:4:0x0006] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getUTDID(android.content.Context r7) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "com.ut.device.UTDevice"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0027, Throwable -> 0x002c }
            java.lang.String r2 = "getUtdid"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0027, Throwable -> 0x002c }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{ Exception -> 0x0027, Throwable -> 0x002c }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch:{ Exception -> 0x0027, Throwable -> 0x002c }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0027, Throwable -> 0x002c }
            android.content.Context r3 = r7.getApplicationContext()     // Catch:{ Exception -> 0x0027, Throwable -> 0x002c }
            r2[r6] = r3     // Catch:{ Exception -> 0x0027, Throwable -> 0x002c }
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch:{ Exception -> 0x0027, Throwable -> 0x002c }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0027, Throwable -> 0x002c }
            return r1
        L_0x0027:
            java.lang.String r7 = readUTDId(r7)     // Catch:{ Exception -> 0x002d, Throwable -> 0x002c }
            return r7
        L_0x002c:
            return r0
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.getUTDID(android.content.Context):java.lang.String");
    }

    public static boolean isApplication(Context context) {
        try {
            String name = context.getApplicationContext().getClass().getSuperclass().getName();
            if (TextUtils.isEmpty(name) || !name.equals("android.app.Application")) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isMainProgress(Context context) {
        try {
            String currentProcessName = UMFrUtils.getCurrentProcessName(context);
            String packageName = context.getApplicationContext().getPackageName();
            if (TextUtils.isEmpty(currentProcessName) || TextUtils.isEmpty(packageName) || !currentProcessName.equals(packageName)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static String readUTDId(Context context) {
        FileInputStream fileInputStream;
        if (context == null) {
            return null;
        }
        File file = getFile(context);
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            String parseId = parseId(readStreamToString(fileInputStream));
            safeClose(fileInputStream);
            return parseId;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            safeClose(fileInputStream);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        return r8.replaceAll("[^[a-z][A-Z][0-9][.][_]]", "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[ExcHandler: Throwable (unused java.lang.Throwable), SYNTHETIC, Splitter:B:3:0x0004] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String MD5(java.lang.String r8) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            byte[] r1 = r8.getBytes()     // Catch:{ Exception -> 0x003e, Throwable -> 0x0047 }
            java.lang.String r2 = "MD5"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch:{ Exception -> 0x003e, Throwable -> 0x0047 }
            r2.reset()     // Catch:{ Exception -> 0x003e, Throwable -> 0x0047 }
            r2.update(r1)     // Catch:{ Exception -> 0x003e, Throwable -> 0x0047 }
            byte[] r1 = r2.digest()     // Catch:{ Exception -> 0x003e, Throwable -> 0x0047 }
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x003e, Throwable -> 0x0047 }
            r2.<init>()     // Catch:{ Exception -> 0x003e, Throwable -> 0x0047 }
            r3 = 0
            r4 = 0
        L_0x001f:
            int r5 = r1.length     // Catch:{ Exception -> 0x003e, Throwable -> 0x0047 }
            if (r4 >= r5) goto L_0x0039
            java.lang.String r5 = "%02X"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x003e, Throwable -> 0x0047 }
            byte r7 = r1[r4]     // Catch:{ Exception -> 0x003e, Throwable -> 0x0047 }
            java.lang.Byte r7 = java.lang.Byte.valueOf(r7)     // Catch:{ Exception -> 0x003e, Throwable -> 0x0047 }
            r6[r3] = r7     // Catch:{ Exception -> 0x003e, Throwable -> 0x0047 }
            java.lang.String r5 = java.lang.String.format(r5, r6)     // Catch:{ Exception -> 0x003e, Throwable -> 0x0047 }
            r2.append(r5)     // Catch:{ Exception -> 0x003e, Throwable -> 0x0047 }
            int r4 = r4 + 1
            goto L_0x001f
        L_0x0039:
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x003e, Throwable -> 0x0047 }
            return r1
        L_0x003e:
            java.lang.String r1 = "[^[a-z][A-Z][0-9][.][_]]"
            java.lang.String r2 = ""
            java.lang.String r8 = r8.replaceAll(r1, r2)     // Catch:{ Exception -> 0x0048, Throwable -> 0x0047 }
            return r8
        L_0x0047:
            return r0
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.MD5(java.lang.String):java.lang.String");
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
            sb.append(hexString.toUpperCase());
            if (i < bArr.length - 1) {
                sb.append(':');
            }
        }
        return sb.toString();
    }

    public static String getDeviceToken(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            Class<?> cls = Class.forName("com.umeng.message.MessageSharedPrefs");
            if (cls == null) {
                return null;
            }
            Method method = cls.getMethod("getInstance", new Class[]{Context.class});
            if (method == null) {
                return null;
            }
            Object invoke = method.invoke(cls, new Object[]{applicationContext});
            if (invoke == null) {
                return null;
            }
            Method method2 = cls.getMethod("getDeviceToken", new Class[0]);
            if (method2 == null) {
                return null;
            }
            Object invoke2 = method2.invoke(invoke, new Object[0]);
            if (invoke2 == null || !(invoke2 instanceof String)) {
                return null;
            }
            return (String) invoke2;
        } catch (Throwable unused) {
            return null;
        }
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
        } catch (Exception e2) {
            UMCrashManager.reportCrash(context, e2);
            return "";
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
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
        } catch (Exception e2) {
            UMCrashManager.reportCrash(context, e2);
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    public static boolean checkAndroidManifest(Context context, String str) {
        try {
            context.getApplicationContext().getPackageManager().getActivityInfo(new ComponentName(context.getApplicationContext().getPackageName(), str), 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static String getAppVersinoCode(Context context, String str) {
        if (context == null || str == null) {
            return "";
        }
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(str, 0).versionCode);
        } catch (Exception unused) {
            return "";
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static void setAppkey(Context context, String str) {
        if (context != null && str != null) {
            try {
                setMultiProcessSP(context, "appkey", str);
            } catch (Exception e2) {
                UMCrashManager.reportCrash(context, e2);
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context, th);
            }
        }
    }

    public static void setChannel(Context context, String str) {
        if (context != null && str != null) {
            try {
                setMultiProcessSP(context, "channel", str);
            } catch (Exception e2) {
                UMCrashManager.reportCrash(context, e2);
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context, th);
            }
        }
    }

    public static void setLastAppkey(Context context, String str) {
        if (context != null && str != null) {
            try {
                setMultiProcessSP(context, "last_appkey", str);
            } catch (Exception e2) {
                UMCrashManager.reportCrash(context, e2);
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context, th);
            }
        }
    }

    public static boolean checkMetaData(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationContext().getPackageManager().getApplicationInfo(context.getApplicationContext().getPackageName(), SearchJediMixFeedAdapter.f42517f);
            if (applicationInfo == null || applicationInfo.metaData.get(str) == null) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static String getAppVersionName(Context context, String str) {
        if (context == null || str == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            UMCrashManager.reportCrash(context, e2);
            return "";
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return "";
        }
    }

    public static boolean checkIntentFilterData(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(Uri.parse("tencent" + str + ":"));
        List<ResolveInfo> queryIntentActivities = context.getApplicationContext().getPackageManager().queryIntentActivities(intent, 64);
        if (queryIntentActivities.size() <= 0) {
            return false;
        }
        for (ResolveInfo next : queryIntentActivities) {
            if (next.activityInfo != null && next.activityInfo.packageName.equals(context.getApplicationContext().getPackageName())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r6.getPackageManager().checkPermission(r7, r6.getPackageName()) == 0) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (((java.lang.Integer) java.lang.Class.forName("android.content.Context").getMethod("checkSelfPermission", new java.lang.Class[]{java.lang.String.class}).invoke(r6, new java.lang.Object[]{r7})).intValue() == 0) goto L_0x0041;
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
            if (r1 < r2) goto L_0x0033
            java.lang.String r1 = "android.content.Context"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x002e }
            java.lang.String r2 = "checkSelfPermission"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x002e }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r0] = r5     // Catch:{ Exception -> 0x002e }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch:{ Exception -> 0x002e }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x002e }
            r2[r0] = r7     // Catch:{ Exception -> 0x002e }
            java.lang.Object r7 = r1.invoke(r6, r2)     // Catch:{ Exception -> 0x002e }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ Exception -> 0x002e }
            int r7 = r7.intValue()     // Catch:{ Exception -> 0x002e }
            if (r7 != 0) goto L_0x0042
            goto L_0x0041
        L_0x002e:
            r7 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r7)
            goto L_0x0042
        L_0x0033:
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            java.lang.String r6 = r6.getPackageName()
            int r6 = r1.checkPermission(r7, r6)
            if (r6 != 0) goto L_0x0042
        L_0x0041:
            r0 = 1
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.checkPermission(android.content.Context, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getMultiProcessSP(android.content.Context r5, java.lang.String r6) {
        /*
            r0 = 0
            java.lang.Object r1 = spLock     // Catch:{ Exception -> 0x004d, Throwable -> 0x004c }
            monitor-enter(r1)     // Catch:{ Exception -> 0x004d, Throwable -> 0x004c }
            if (r5 == 0) goto L_0x0048
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0046 }
            if (r2 == 0) goto L_0x000d
            goto L_0x0048
        L_0x000d:
            boolean r2 = isMainProgress(r5)     // Catch:{ all -> 0x0046 }
            r3 = 0
            if (r2 == 0) goto L_0x001f
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = "umeng_common_config"
            android.content.SharedPreferences r5 = com.ss.android.ugc.aweme.q.c.a(r5, r2, r3)     // Catch:{ all -> 0x0046 }
            goto L_0x003c
        L_0x001f:
            java.lang.String r2 = com.umeng.commonsdk.framework.UMFrUtils.getSubProcessName(r5)     // Catch:{ all -> 0x0046 }
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ all -> 0x0046 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0046 }
            r4.<init>()     // Catch:{ all -> 0x0046 }
            r4.append(r2)     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = "_umeng_common_config"
            r4.append(r2)     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0046 }
            android.content.SharedPreferences r5 = com.ss.android.ugc.aweme.q.c.a(r5, r2, r3)     // Catch:{ all -> 0x0046 }
        L_0x003c:
            if (r5 == 0) goto L_0x0044
            java.lang.String r5 = r5.getString(r6, r0)     // Catch:{ all -> 0x0046 }
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
            return r5
        L_0x0044:
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
            return r0
        L_0x0046:
            r5 = move-exception
            goto L_0x004a
        L_0x0048:
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
            return r0
        L_0x004a:
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
            throw r5     // Catch:{ Exception -> 0x004d, Throwable -> 0x004c }
        L_0x004c:
            return r0
        L_0x004d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.getMultiProcessSP(android.content.Context, java.lang.String):java.lang.String");
    }

    public static boolean checkResource(Context context, String str, String str2) {
        if (context.getApplicationContext().getResources().getIdentifier(str, str2, context.getApplicationContext().getPackageName()) <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setMultiProcessSP(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.Object r0 = spLock     // Catch:{ Exception -> 0x0053, Throwable -> 0x0052 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x0053, Throwable -> 0x0052 }
            if (r4 == 0) goto L_0x004e
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x004c }
            if (r1 != 0) goto L_0x004e
            if (r6 != 0) goto L_0x000e
            goto L_0x004e
        L_0x000e:
            boolean r1 = isMainProgress(r4)     // Catch:{ all -> 0x004c }
            r2 = 0
            if (r1 == 0) goto L_0x0020
            android.content.Context r4 = r4.getApplicationContext()     // Catch:{ all -> 0x004c }
            java.lang.String r1 = "umeng_common_config"
            android.content.SharedPreferences r4 = com.ss.android.ugc.aweme.q.c.a(r4, r1, r2)     // Catch:{ all -> 0x004c }
            goto L_0x003d
        L_0x0020:
            java.lang.String r1 = com.umeng.commonsdk.framework.UMFrUtils.getSubProcessName(r4)     // Catch:{ all -> 0x004c }
            android.content.Context r4 = r4.getApplicationContext()     // Catch:{ all -> 0x004c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            r3.<init>()     // Catch:{ all -> 0x004c }
            r3.append(r1)     // Catch:{ all -> 0x004c }
            java.lang.String r1 = "_umeng_common_config"
            r3.append(r1)     // Catch:{ all -> 0x004c }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x004c }
            android.content.SharedPreferences r4 = com.ss.android.ugc.aweme.q.c.a(r4, r1, r2)     // Catch:{ all -> 0x004c }
        L_0x003d:
            if (r4 == 0) goto L_0x004a
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ all -> 0x004c }
            android.content.SharedPreferences$Editor r4 = r4.putString(r5, r6)     // Catch:{ all -> 0x004c }
            r4.commit()     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            goto L_0x0052
        L_0x004c:
            r4 = move-exception
            goto L_0x0050
        L_0x004e:
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            return
        L_0x0050:
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            throw r4     // Catch:{ Exception -> 0x0053, Throwable -> 0x0052 }
        L_0x0052:
            return
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.setMultiProcessSP(android.content.Context, java.lang.String, java.lang.String):void");
    }
}
