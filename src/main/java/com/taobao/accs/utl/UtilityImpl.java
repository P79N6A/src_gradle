package com.taobao.accs.utl;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import anet.channel.util.HMacUtil;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent;
import com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent;
import com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.framework.core.a;
import com.ss.android.ugc.aweme.q.c;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.utl.ALog;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class UtilityImpl {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f79094a = new byte[0];

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(int i) {
            String str = a.b().f3304b;
            if (TextUtils.isEmpty(str) || !str.startsWith("gray_") || !ToolUtils.isMainProcess(GlobalContext.getContext())) {
                Process.killProcess(i);
                return;
            }
            throw new RuntimeException("Process killed, pid is " + i);
        }
    }

    public static byte[] a(Context context, String str, String str2, byte[] bArr) {
        byte[] bArr2 = null;
        if (d(str)) {
            return null;
        }
        if (context == null || bArr == null) {
            ALog.e("UtilityImpl", "staticBinarySafeDecryptNoB64 input null!", new Object[0]);
            return null;
        }
        try {
            AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
            String authCode = configByTag != null ? configByTag.getAuthCode() : null;
            ALog.i("UtilityImpl", "staticBinarySafeDecryptNoB64", "appkey", str2, "authcode", authCode);
            SecurityGuardManager instance = SecurityGuardManager.getInstance(context);
            if (instance != null) {
                IStaticDataEncryptComponent staticDataEncryptComp = instance.getStaticDataEncryptComp();
                if (staticDataEncryptComp != null) {
                    bArr2 = staticDataEncryptComp.staticBinarySafeDecryptNoB64(16, "tnet_pksg_key", bArr, authCode);
                }
            }
            if (bArr2 == null) {
                ALog.e("UtilityImpl", "staticBinarySafeDecryptNoB64 null", new Object[0]);
            }
        } catch (Throwable th) {
            ALog.e("UtilityImpl", "staticBinarySafeDecryptNoB64", th, new Object[0]);
        }
        return bArr2;
    }

    public static byte[] a(Context context, String str, String str2, String str3) {
        byte[] bArr = null;
        if (context == null || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) {
            ALog.i("UtilityImpl", "get sslticket input null", new Object[0]);
            return null;
        }
        try {
            if (d(str)) {
                return null;
            }
            SecurityGuardManager instance = SecurityGuardManager.getInstance(context);
            if (instance != null) {
                IDynamicDataStoreComponent dynamicDataStoreComp = instance.getDynamicDataStoreComp();
                if (dynamicDataStoreComp != null) {
                    bArr = dynamicDataStoreComp.getByteArray("accs_ssl_key2_" + str3);
                }
            }
            return bArr;
        } catch (Throwable th) {
            ALog.e("UtilityImpl", "SecurityGuardGetSslTicket2", th, new Object[0]);
        }
    }

    public static boolean a(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            ALog.e("UtilityImpl", "package not exist", "pkg", str);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        r3 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.String r3, android.content.Context r4) {
        /*
            r0 = 0
            byte[] r1 = f79094a     // Catch:{ Throwable -> 0x0022 }
            monitor-enter(r1)     // Catch:{ Throwable -> 0x0022 }
            java.lang.String r2 = com.taobao.accs.utl.a.b(r4)     // Catch:{ all -> 0x001a }
            android.content.SharedPreferences r3 = com.ss.android.ugc.aweme.q.c.a(r4, r3, r0)     // Catch:{ all -> 0x001a }
            java.lang.String r4 = "utdid"
            java.lang.String r3 = r3.getString(r4, r2)     // Catch:{ all -> 0x001a }
            boolean r3 = r3.equals(r2)     // Catch:{ all -> 0x001a }
            r3 = r3 ^ 1
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            goto L_0x002d
        L_0x001a:
            r4 = move-exception
            r3 = 0
        L_0x001c:
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            throw r4     // Catch:{ Throwable -> 0x001e }
        L_0x001e:
            r4 = move-exception
            goto L_0x0024
        L_0x0020:
            r4 = move-exception
            goto L_0x001c
        L_0x0022:
            r4 = move-exception
            r3 = 0
        L_0x0024:
            java.lang.String r1 = "UtilityImpl"
            java.lang.String r2 = "saveUtdid"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.taobao.accs.utl.ALog.e(r1, r2, r4, r0)
        L_0x002d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.utl.UtilityImpl.a(java.lang.String, android.content.Context):boolean");
    }

    public static void a(Context context, String str, long j) {
        try {
            SharedPreferences.Editor edit = c.a(context, "ACCS_SDK_CHANNEL", 0).edit();
            edit.putLong(str, j);
            edit.apply();
            ALog.d("UtilityImpl", "setServiceTime:" + j, new Object[0]);
        } catch (Throwable th) {
            ALog.e("UtilityImpl", "setServiceTime:", th, new Object[0]);
        }
    }

    public static long a() {
        return a.a();
    }

    public static int c() {
        if (Build.VERSION.SDK_INT < 11) {
            return android.net.Proxy.getDefaultPort();
        }
        try {
            return Integer.parseInt(System.getProperty("http.proxyPort"));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static String d() {
        String str = b() + ":" + c();
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d("UtilityImpl", "getProxy:" + str, new Object[0]);
        }
        return str;
    }

    public static String b() {
        if (Build.VERSION.SDK_INT < 11) {
            return android.net.Proxy.getDefaultHost();
        }
        return System.getProperty("http.proxyHost");
    }

    public static String e() {
        Class[] clsArr = {String.class};
        Object[] objArr = {"ro.build.version.emui"};
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getDeclaredMethod("get", clsArr).invoke(cls, objArr);
            ALog.d("UtilityImpl", "getEmuiVersion", "result", str);
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            return "";
        } catch (Exception e2) {
            ALog.e("UtilityImpl", "getEmuiVersion", e2, new Object[0]);
        }
    }

    public static String c(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    public static boolean isMainProcess(Context context) {
        return a.a(context);
    }

    public static String l(Context context) {
        return a.b(context);
    }

    public static String r(Context context) {
        return a.d(context);
    }

    public static int a(String str) {
        int i;
        if (str == null) {
            return 0;
        }
        try {
            i = str.getBytes("utf-8").length;
        } catch (UnsupportedEncodingException unused) {
            i = 0;
        }
        return i;
    }

    public static String i(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getSubscriberId();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String o(Context context) {
        try {
            return GlobalClientInfo.getInstance(context).getPackageInfo().versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String[] s(Context context) {
        String[] appkey;
        synchronized (f79094a) {
            appkey = ACCSManager.getAppkey(context);
        }
        return appkey;
    }

    public static String a(int i) {
        try {
            return String.valueOf(i);
        } catch (Exception e2) {
            ALog.e("UtilityImpl", "int2String", e2, new Object[0]);
            return null;
        }
    }

    public static int b(Context context) {
        int i = c.a(context, "ACCS_SDK", 4).getInt("proxy_port", -1);
        if (i > 0) {
            return i;
        }
        if (a(context) == null) {
            return -1;
        }
        try {
            return c();
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private static boolean d(String str) {
        int i;
        AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
        if (configByTag == null) {
            i = 0;
        } else {
            i = configByTag.getSecurity();
        }
        if (i == 2) {
            return true;
        }
        return false;
    }

    public static boolean k(Context context) {
        if (context != null) {
            try {
                NetworkInfo activeNetworkInfo = GlobalClientInfo.getInstance(context).getConnectivityManager().getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.isConnected();
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String m(Context context) {
        String i = i(context);
        if (i == null || i.length() <= 5) {
            return "null";
        }
        return i.substring(0, 5);
    }

    public static String p(Context context) {
        try {
            return c.a(context, "ACCS_COOKIE", 4).getString("cookie_sec", null);
        } catch (Exception e2) {
            ALog.e("UtilityImpl", "reStoreCookie fail", e2, new Object[0]);
            return null;
        }
    }

    public static void q(Context context) {
        try {
            GlobalClientInfo.f78905c = null;
            SharedPreferences.Editor edit = c.a(context, "ACCS_COOKIE", 0).edit();
            edit.clear();
            edit.apply();
        } catch (Throwable th) {
            ALog.e("UtilityImpl", "clearCookie fail", th, new Object[0]);
        }
    }

    public static String a(long j) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(Long.valueOf(j));
        } catch (Throwable th) {
            ALog.e("UtilityImpl", "formatDay", th, new Object[0]);
            return "";
        }
    }

    public static int b(String str) {
        try {
            return Integer.valueOf(str).intValue();
        } catch (Exception e2) {
            ALog.e("UtilityImpl", "String2Int", e2, new Object[0]);
            return 0;
        }
    }

    public static void disableService(Context context) {
        ComponentName componentName = new ComponentName(context, "com.taobao.accs.ChannelService");
        PackageManager packageManager = context.getPackageManager();
        try {
            ALog.d("UtilityImpl", "disableService,comptName=" + componentName.toString(), new Object[0]);
            if (packageManager.getServiceInfo(componentName, SearchJediMixFeedAdapter.f42517f).enabled) {
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
                killService(context);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean e(Context context) {
        try {
            if (context.getPackageManager().getServiceInfo(new ComponentName(context, "com.taobao.accs.ChannelService"), SearchJediMixFeedAdapter.f42517f).enabled) {
                return true;
            }
        } catch (Exception e2) {
            ALog.e("UtilityImpl", a.a((Throwable) e2), new Object[0]);
        }
        return false;
    }

    public static void enableService(Context context) {
        ComponentName componentName = new ComponentName(context, "com.taobao.accs.ChannelService");
        ALog.d("UtilityImpl", "enableService", "comptName", componentName);
        try {
            context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
        } catch (Exception e2) {
            ALog.w("UtilityImpl", "enableService", e2, new Object[0]);
        }
    }

    public static void focusDisableService(Context context) {
        try {
            synchronized (f79094a) {
                SharedPreferences.Editor edit = c.a(context, "ACCS_SDK", 0).edit();
                edit.putBoolean("fouce_disable", true);
                edit.apply();
                disableService(context);
            }
        } catch (Throwable th) {
            ALog.e("UtilityImpl", "focusDisableService", th, new Object[0]);
        }
    }

    public static void focusEnableService(Context context) {
        try {
            synchronized (f79094a) {
                SharedPreferences.Editor edit = c.a(context, "ACCS_SDK", 0).edit();
                edit.putBoolean("fouce_disable", false);
                edit.apply();
                enableService(context);
            }
        } catch (Throwable th) {
            ALog.e("UtilityImpl", "focusEnableService", th, new Object[0]);
        }
    }

    public static String g(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "unknown";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "wifi";
        }
        String subtypeName = activeNetworkInfo.getSubtypeName();
        String str = "";
        if (!TextUtils.isEmpty(subtypeName)) {
            str = subtypeName.replaceAll(" ", "");
        }
        return str;
    }

    public static long n(Context context) {
        long j;
        try {
            SharedPreferences a2 = c.a(context, "ACCS_SDK_CHANNEL", 0);
            long j2 = a2.getLong("service_start", 0);
            long j3 = a2.getLong("service_end", 0);
            if (j2 > 0) {
                j = j3 - j2;
            } else {
                j = 0;
            }
            try {
                SharedPreferences.Editor edit = a2.edit();
                edit.putLong("service_start", 0);
                edit.putLong("service_end", 0);
                edit.apply();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            j = 0;
            ALog.e("UtilityImpl", "getServiceAliveTime:", th, new Object[0]);
            return j;
        }
        return j;
    }

    private static void t(Context context) {
        try {
            SharedPreferences.Editor edit = c.a(context, "ACCS_SDK", 0).edit();
            edit.putInt("appVersionCode", GlobalClientInfo.getInstance(context).getPackageInfo().versionCode);
            edit.putString("appVersionName", GlobalClientInfo.getInstance(context).getPackageInfo().versionName);
            edit.apply();
        } catch (Throwable th) {
            ALog.e("UtilityImpl", "saveAppVersion", th, new Object[0]);
        }
    }

    public static boolean f(Context context) {
        ComponentName componentName = new ComponentName(context, com.taobao.accs.client.a.a(context.getPackageName()));
        PackageManager packageManager = context.getPackageManager();
        try {
            if (componentName.getPackageName().equals("!")) {
                ALog.e("UtilityImpl", "getAgooServiceEnabled,exception,comptName.getPackageName()=" + componentName.getPackageName(), new Object[0]);
                return false;
            }
            if (packageManager.getServiceInfo(componentName, SearchJediMixFeedAdapter.f42517f).enabled) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    public static boolean j(Context context) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String packageName = GlobalClientInfo.getInstance(context).getActivityManager().getRunningTasks(1).get(0).topActivity.getPackageName();
            if (!TextUtils.isEmpty(packageName) && packageName.equals(context.getPackageName())) {
                return true;
            }
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.d("UtilityImpl", "isForeground time " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            }
            return false;
        } catch (Throwable th) {
            ALog.e("UtilityImpl", "isForeground error ", th, new Object[0]);
        }
    }

    public static String a(Context context) {
        String string = c.a(context, "ACCS_SDK", 4).getString("proxy_host", null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String b2 = b();
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        return b2;
    }

    public static boolean c(Context context) {
        int i;
        String str;
        synchronized (f79094a) {
            PackageInfo packageInfo = GlobalClientInfo.getInstance(context).getPackageInfo();
            int i2 = c.a(context, "ACCS_SDK", 0).getInt("appVersionCode", -1);
            String string = c.a(context, "ACCS_SDK", 0).getString("appVersionName", "");
            if (packageInfo != null) {
                i = packageInfo.versionCode;
                str = packageInfo.versionName;
            } else {
                str = null;
                i = 0;
            }
            if (i2 == i) {
                if (string.equals(str)) {
                    return false;
                }
            }
            t(context);
            ALog.i("UtilityImpl", "appVersionChanged", "oldV", Integer.valueOf(i2), "nowV", Integer.valueOf(i), "oldN", string, "nowN", str);
            return true;
        }
    }

    public static void clearSharePreferences(Context context) {
        try {
            synchronized (f79094a) {
                SharedPreferences a2 = c.a(context, "ACCS_SDK", 0);
                String string = a2.getString("appkey", null);
                String string2 = a2.getString("app_sercet", null);
                String string3 = a2.getString("proxy_host", null);
                int i = a2.getInt("proxy_port", -1);
                int i2 = a2.getInt("version", -1);
                int i3 = a2.getInt("debug_mode", 0);
                SharedPreferences.Editor edit = c.a(context, "ACCS_SDK", 0).edit();
                edit.clear();
                if (!TextUtils.isEmpty(string)) {
                    edit.putString("appkey", string);
                }
                if (!TextUtils.isEmpty(string2)) {
                    edit.putString("app_sercet", string2);
                }
                if (!TextUtils.isEmpty(string3)) {
                    edit.putString("proxy_host", string3);
                }
                if (i > 0) {
                    edit.putInt("proxy_port", i);
                }
                if (i2 > 0) {
                    edit.putInt("version", i2);
                }
                if (i3 == 2 || i3 == 1) {
                    edit.putInt("debug_mode", i3);
                }
                edit.apply();
            }
        } catch (Throwable th) {
            ALog.e("UtilityImpl", "clearSharePreferences", th, new Object[0]);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean d(android.content.Context r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            byte[] r1 = f79094a     // Catch:{ Exception -> 0x001d }
            monitor-enter(r1)     // Catch:{ Exception -> 0x001d }
            java.lang.String r2 = "ACCS_SDK"
            android.content.SharedPreferences r4 = com.ss.android.ugc.aweme.q.c.a(r4, r2, r0)     // Catch:{ all -> 0x0015 }
            java.lang.String r2 = "fouce_disable"
            boolean r4 = r4.getBoolean(r2, r0)     // Catch:{ all -> 0x0015 }
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            goto L_0x0028
        L_0x0015:
            r2 = move-exception
            r4 = 0
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2     // Catch:{ Exception -> 0x0019 }
        L_0x0019:
            r1 = move-exception
            goto L_0x001f
        L_0x001b:
            r2 = move-exception
            goto L_0x0017
        L_0x001d:
            r1 = move-exception
            r4 = 0
        L_0x001f:
            java.lang.String r2 = "UtilityImpl"
            java.lang.String r3 = "getFocusDisableStatus"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.taobao.accs.utl.ALog.e(r2, r3, r1, r0)
        L_0x0028:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.utl.UtilityImpl.d(android.content.Context):boolean");
    }

    public static String h(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return "unknown";
            }
            if (activeNetworkInfo.getType() == 1) {
                return "wifi";
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                case 4:
                case e.l:
                case 11:
                    return "2g";
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case SearchNilInfo.HIT_TYPE_SENSITIVE:
                case 14:
                case 15:
                    return "3g";
                case 13:
                    return "4g";
                default:
                    String subtypeName = activeNetworkInfo.getSubtypeName();
                    if (TextUtils.isEmpty(subtypeName)) {
                        return "unknown";
                    }
                    if (subtypeName.equalsIgnoreCase("td-scdma") || subtypeName.equalsIgnoreCase("td_scdma") || subtypeName.equalsIgnoreCase("tds_hsdpa")) {
                        return "3g";
                    }
                    return "unknown";
            }
            ALog.e("UtilityImpl", "getNetworkTypeExt", e, new Object[0]);
            return null;
        } catch (Exception e2) {
            ALog.e("UtilityImpl", "getNetworkTypeExt", e2, new Object[0]);
            return null;
        }
    }

    public static void killService(Context context) {
        try {
            int myUid = Process.myUid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo next : activityManager.getRunningAppProcesses()) {
                    if (next.uid == myUid) {
                        if (!TextUtils.isEmpty(com.taobao.accs.client.a.f78913e) && com.taobao.accs.client.a.f78913e.equals(next.processName)) {
                            ALog.e("UtilityImpl", "killService", "processName", next.processName);
                            _lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(next.pid);
                            return;
                        } else if (next.processName.endsWith(":channel")) {
                            ALog.e("UtilityImpl", "killService", "processName", next.processName);
                            _lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(next.pid);
                            return;
                        }
                    }
                }
                ALog.e("UtilityImpl", "kill nothing", new Object[0]);
            }
        } catch (Throwable th) {
            ALog.e("UtilityImpl", "killService", th, new Object[0]);
        }
    }

    public static String a(Throwable th) {
        return a.a(th);
    }

    public static final String a(List<String> list) {
        StringBuffer stringBuffer = new StringBuffer();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            stringBuffer.append(list.get(i));
            if (i < size - 1) {
                stringBuffer.append(",");
            }
        }
        return stringBuffer.toString();
    }

    public static final Map<String, String> a(Map<String, List<String>> map) {
        HashMap hashMap = new HashMap();
        try {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                if (!TextUtils.isEmpty(str)) {
                    String a2 = a((List) next.getValue());
                    if (!TextUtils.isEmpty(a2)) {
                        if (!str.startsWith(":")) {
                            str = str.toLowerCase(Locale.US);
                        }
                        hashMap.put(str, a2);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    public static String c(String str, Context context) {
        String string;
        try {
            synchronized (f79094a) {
                string = c.a(context, str, 0).getString("utdid", a.b(context));
            }
            return string;
        } catch (Throwable th) {
            ALog.e("UtilityImpl", "getUtdid", th, new Object[0]);
            return "";
        }
    }

    public static String c(Context context, String str) {
        try {
            File externalFilesDir = context.getExternalFilesDir("tnetlogs");
            if (externalFilesDir == null || !externalFilesDir.exists() || !externalFilesDir.canWrite()) {
                externalFilesDir = context.getDir("logs", 0);
            }
            ALog.d("UtilityImpl", "getTnetLogFilePath :" + externalFilesDir, new Object[0]);
            return externalFilesDir + "/" + str.toLowerCase();
        } catch (Throwable th) {
            ALog.e("UtilityImpl", "getTnetLogFilePath", th, new Object[0]);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(android.content.Context r3, java.lang.String r4) {
        /*
            byte[] r0 = f79094a     // Catch:{ Throwable -> 0x0050 }
            monitor-enter(r0)     // Catch:{ Throwable -> 0x0050 }
            java.lang.String r1 = "ACCS_SDK"
            r2 = 0
            android.content.SharedPreferences r3 = com.ss.android.ugc.aweme.q.c.a(r3, r1, r2)     // Catch:{ all -> 0x004d }
            java.lang.String r1 = "appkey"
            java.lang.String r2 = ""
            java.lang.String r1 = r3.getString(r1, r2)     // Catch:{ all -> 0x004d }
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x004d }
            if (r2 != 0) goto L_0x004b
            boolean r2 = r1.equals(r4)     // Catch:{ all -> 0x004d }
            if (r2 != 0) goto L_0x004b
            boolean r2 = r1.contains(r4)     // Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x0025
            goto L_0x004b
        L_0x0025:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x002c
            goto L_0x003d
        L_0x002c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            r2.<init>(r1)     // Catch:{ all -> 0x004d }
            java.lang.String r1 = "|"
            r2.append(r1)     // Catch:{ all -> 0x004d }
            r2.append(r4)     // Catch:{ all -> 0x004d }
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x004d }
        L_0x003d:
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x004d }
            java.lang.String r1 = "appkey"
            r3.putString(r1, r4)     // Catch:{ all -> 0x004d }
            r3.apply()     // Catch:{ all -> 0x004d }
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            goto L_0x0050
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x004d:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            throw r3     // Catch:{ Throwable -> 0x0050 }
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.utl.UtilityImpl.d(android.content.Context, java.lang.String):void");
    }

    public static void b(Context context, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                GlobalClientInfo.f78905c = str;
                SharedPreferences.Editor edit = c.a(context, "ACCS_COOKIE", 0).edit();
                edit.putString("cookie_sec", str);
                edit.apply();
            }
        } catch (Exception e2) {
            ALog.e("UtilityImpl", "storeCookie fail", e2, new Object[0]);
        }
    }

    public static void b(String str, Context context) {
        try {
            synchronized (f79094a) {
                SharedPreferences.Editor edit = c.a(context, str, 0).edit();
                edit.putString("utdid", a.b(context));
                edit.apply();
            }
        } catch (Throwable th) {
            ALog.e("UtilityImpl", "saveUtdid", th, new Object[0]);
        }
    }

    public static int a(Context context, String str, String str2, String str3, byte[] bArr) {
        int i = -1;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || context == null || bArr == null) {
            return -1;
        }
        try {
            if (d(str)) {
                return -1;
            }
            SecurityGuardManager instance = SecurityGuardManager.getInstance(context);
            if (instance != null) {
                IDynamicDataStoreComponent dynamicDataStoreComp = instance.getDynamicDataStoreComp();
                if (dynamicDataStoreComp != null) {
                    i = dynamicDataStoreComp.putByteArray("accs_ssl_key2_" + str3, bArr);
                }
            }
            return i;
        } catch (Throwable th) {
            ALog.e("UtilityImpl", "SecurityGuardPutSslTicket2", th, new Object[0]);
        }
    }

    public static String a(Context context, String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        if (TextUtils.isEmpty(str)) {
            ALog.e("UtilityImpl", "getAppsign appkey null", new Object[0]);
            return null;
        }
        try {
            if (!d(str4)) {
                SecurityGuardManager instance = SecurityGuardManager.getInstance(context);
                if (instance != null) {
                    ALog.d("UtilityImpl", "getAppsign SecurityGuardManager not null!", new Object[0]);
                    ISecureSignatureComponent secureSignatureComp = instance.getSecureSignatureComp();
                    SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
                    securityGuardParamContext.appKey = str;
                    securityGuardParamContext.paramMap.put("INPUT", str3 + str);
                    securityGuardParamContext.requestType = 3;
                    AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str4);
                    if (configByTag != null) {
                        str6 = configByTag.getAuthCode();
                    } else {
                        str6 = null;
                    }
                    str5 = secureSignatureComp.signRequest(securityGuardParamContext, str6);
                    return str5;
                }
                ALog.d("UtilityImpl", "getAppsign SecurityGuardManager is null", new Object[0]);
                str5 = null;
                return str5;
            } else if (!TextUtils.isEmpty(str2)) {
                str5 = HMacUtil.hmacSha1Hex(str2.getBytes(), (str + str3).getBytes());
                return str5;
            } else {
                ALog.e("UtilityImpl", "getAppsign secret null", new Object[0]);
                str5 = null;
                return str5;
            }
        } catch (Throwable th) {
            ALog.e("UtilityImpl", "getAppsign", th, new Object[0]);
        }
    }
}
