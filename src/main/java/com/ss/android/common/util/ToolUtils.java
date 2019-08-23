package com.ss.android.common.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.location.LocationManager;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.reflect.Reflect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ToolUtils {
    public static String MESSAGE_PROCESS_SUFFIX = ":push";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static boolean sCanSetStatusBar = true;
    private static String sCurProcessName;
    public static boolean sIsInited;
    public static boolean sIsMiui;
    private static String systemProperty;

    static class a implements MediaScannerConnection.MediaScannerConnectionClient {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f2447a;

        /* renamed from: b  reason: collision with root package name */
        MediaScannerConnection f2448b;

        /* renamed from: c  reason: collision with root package name */
        Context f2449c;

        /* renamed from: d  reason: collision with root package name */
        private String f2450d;

        public final void onMediaScannerConnected() {
            if (PatchProxy.isSupport(new Object[0], this, f2447a, false, 16142, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f2447a, false, 16142, new Class[0], Void.TYPE);
                return;
            }
            try {
                this.f2448b.scanFile(this.f2450d, "image/*");
            } catch (Exception unused) {
            }
        }

        public a(Context context, String str) {
            this.f2449c = context;
            this.f2450d = str;
        }

        public final void onScanCompleted(String str, Uri uri) {
            if (PatchProxy.isSupport(new Object[]{str, uri}, this, f2447a, false, 16143, new Class[]{String.class, Uri.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, uri}, this, f2447a, false, 16143, new Class[]{String.class, Uri.class}, Void.TYPE);
                return;
            }
            if (this.f2448b != null) {
                if (this.f2448b.isConnected()) {
                    this.f2448b.disconnect();
                }
                this.f2448b = null;
            }
        }
    }

    public static String getEmuiInfo() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 16100, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 16100, new Class[0], String.class);
        }
        return getSystemProperty("ro.build.version.emui");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072 A[SYNTHETIC, Splitter:B:21:0x0072] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0079 A[SYNTHETIC, Splitter:B:29:0x0079] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getCurProcessNameFromProc() {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2 = 0
            r4 = 1
            r5 = 16122(0x3efa, float:2.2592E-41)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 1
            r6 = 16122(0x3efa, float:2.2592E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0026:
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0076, all -> 0x006f }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0076, all -> 0x006f }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0076, all -> 0x006f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0076, all -> 0x006f }
            java.lang.String r5 = "/proc/"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0076, all -> 0x006f }
            int r5 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x0076, all -> 0x006f }
            r4.append(r5)     // Catch:{ Throwable -> 0x0076, all -> 0x006f }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ Throwable -> 0x0076, all -> 0x006f }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0076, all -> 0x006f }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0076, all -> 0x006f }
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x0076, all -> 0x006f }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0076, all -> 0x006f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0077, all -> 0x006a }
            r2.<init>()     // Catch:{ Throwable -> 0x0077, all -> 0x006a }
        L_0x0054:
            int r3 = r1.read()     // Catch:{ Throwable -> 0x0077, all -> 0x006a }
            if (r3 <= 0) goto L_0x005f
            char r3 = (char) r3     // Catch:{ Throwable -> 0x0077, all -> 0x006a }
            r2.append(r3)     // Catch:{ Throwable -> 0x0077, all -> 0x006a }
            goto L_0x0054
        L_0x005f:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0077, all -> 0x006a }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0077, all -> 0x006a }
            r1.close()     // Catch:{ Exception -> 0x0069 }
        L_0x0069:
            return r2
        L_0x006a:
            r0 = move-exception
            r9 = r1
            r1 = r0
            r0 = r9
            goto L_0x0070
        L_0x006f:
            r1 = move-exception
        L_0x0070:
            if (r0 == 0) goto L_0x0075
            r0.close()     // Catch:{ Exception -> 0x0075 }
        L_0x0075:
            throw r1
        L_0x0076:
            r1 = r0
        L_0x0077:
            if (r1 == 0) goto L_0x007c
            r1.close()     // Catch:{ Exception -> 0x007c }
        L_0x007c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.ToolUtils.getCurProcessNameFromProc():java.lang.String");
    }

    public static boolean isFlyme() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 16103, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 16103, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if ((StringUtils.isEmpty(Build.DISPLAY) || Build.DISPLAY.indexOf("Flyme") < 0) && (StringUtils.isEmpty(Build.USER) || !Build.USER.equals("flyme"))) {
            return false;
        }
        return true;
    }

    public static boolean isHuaweiDevice() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 16098, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 16098, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            if ((!StringUtils.isEmpty(Build.BRAND) && Build.BRAND.toLowerCase().startsWith("huawei")) || (!StringUtils.isEmpty(Build.MANUFACTURER) && Build.MANUFACTURER.toLowerCase().startsWith("huawei"))) {
                z = true;
            }
        } catch (Throwable unused) {
        }
        return z;
    }

    public static boolean isMiui() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 16102, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 16102, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!sIsInited) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    sIsMiui = true;
                    sIsInited = true;
                    return sIsMiui;
                }
            } catch (Exception unused) {
            }
            sIsInited = true;
        }
        return sIsMiui;
    }

    public static void setCanSetStatusBar(boolean z) {
        sCanSetStatusBar = z;
    }

    public static void setMessageProcessSuffix(String str) {
        MESSAGE_PROCESS_SUFFIX = str;
    }

    public static void clearDir(String str) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 16107, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 16107, new Class[]{String.class}, Void.TYPE);
            return;
        }
        File file = new File(str2);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    removeDir(listFiles[i].getAbsolutePath());
                } else if (listFiles[i].isFile()) {
                    listFiles[i].delete();
                }
            }
        }
    }

    public static String getCurProcessName(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 16121, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 16121, new Class[]{Context.class}, String.class);
        }
        String str = sCurProcessName;
        if (!StringUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context2.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses()) {
                if (next.pid == myPid) {
                    Logger.debug();
                    String str2 = next.processName;
                    sCurProcessName = str2;
                    return str2;
                }
            }
        } catch (Exception unused) {
        }
        String curProcessNameFromProc = getCurProcessNameFromProc();
        sCurProcessName = curProcessNameFromProc;
        return curProcessNameFromProc;
    }

    public static int getLocationMode(Context context) {
        Context context2 = context;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 16093, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 16093, new Class[]{Context.class}, Integer.TYPE)).intValue();
        } else if (context2 == null) {
            return -1;
        } else {
            try {
                if (!StringUtils.isEmpty(Settings.Secure.getString(context.getContentResolver(), "location_providers_allowed"))) {
                    LocationManager locationManager = (LocationManager) context2.getSystemService("location");
                    boolean isProviderEnabled = locationManager.isProviderEnabled("gps");
                    if (locationManager.isProviderEnabled("network")) {
                        isProviderEnabled |= true;
                    }
                    z = isProviderEnabled;
                    if (locationManager.isProviderEnabled("passive")) {
                        z |= true;
                    }
                }
                return z ? 1 : 0;
            } catch (Throwable unused) {
                return -1;
            }
        }
    }

    public static String getUserSerial(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 16135, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 16135, new Class[]{Context.class}, String.class);
        } else if (context2 == null) {
            return null;
        } else {
            Object systemService = context2.getSystemService(AllStoryActivity.f73306b);
            if (systemService == null) {
                return null;
            }
            try {
                Object invoke = Process.class.getMethod("myUserHandle", null).invoke(Process.class, null);
                return String.valueOf(((Long) systemService.getClass().getMethod("getSerialNumberForUser", new Class[]{invoke.getClass()}).invoke(systemService, new Object[]{invoke})).longValue());
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static String handleZipEntryGetNameLeak(String str) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3}, null, changeQuickRedirect, true, 16130, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3}, null, changeQuickRedirect, true, 16130, new Class[]{String.class}, String.class);
        } else if (StringUtils.isEmpty(str)) {
            return str3;
        } else {
            try {
                Logger.debug();
                str2 = str3.replaceAll(".." + File.separator, "");
                try {
                    Logger.debug();
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                str2 = str3;
            }
            return str2;
        }
    }

    public static boolean isEmui(String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 16099, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 16099, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            str2 = getEmuiInfo();
        } else {
            str2 = str;
        }
        if ((TextUtils.isEmpty(str2) || !str2.toLowerCase().startsWith("emotionui")) && !isHuaweiDevice()) {
            return false;
        }
        return true;
    }

    public static boolean isMainProcess(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 16119, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 16119, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        String curProcessName = getCurProcessName(context);
        if ((curProcessName == null || !curProcessName.contains(":")) && curProcessName != null && curProcessName.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    public static long isMainProcessRetId(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 16120, new Class[]{Context.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 16120, new Class[]{Context.class}, Long.TYPE)).longValue();
        } else if (isMainProcess(context)) {
            return Thread.currentThread().getId();
        } else {
            return 0;
        }
    }

    public static boolean isMessageProcess(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 16117, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 16117, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        String curProcessName = getCurProcessName(context);
        if (curProcessName == null || !curProcessName.endsWith(MESSAGE_PROCESS_SUFFIX)) {
            return false;
        }
        return true;
    }

    public static boolean isNoDexProcess(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 16118, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 16118, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        String curProcessName = getCurProcessName(context);
        if (curProcessName == null || !curProcessName.endsWith(":nodex")) {
            return false;
        }
        return true;
    }

    public static void removeDir(String str) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 16108, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 16108, new Class[]{String.class}, Void.TYPE);
            return;
        }
        File file = new File(str2);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    removeDir(listFiles[i].getAbsolutePath());
                } else {
                    listFiles[i].delete();
                }
            }
            file.delete();
        }
    }

    public static void trySetStatusBarWithFullScreen(Window window) {
        Window window2 = window;
        if (PatchProxy.isSupport(new Object[]{window2}, null, changeQuickRedirect, true, 16137, new Class[]{Window.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{window2}, null, changeQuickRedirect, true, 16137, new Class[]{Window.class}, Void.TYPE);
        } else if (window2 != null) {
            try {
                if (Build.VERSION.SDK_INT >= 21) {
                    window2.clearFlags(201326592);
                    window.getDecorView().setSystemUiVisibility(1792);
                    window2.addFlags(Integer.MIN_VALUE);
                    window2.setStatusBarColor(0);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static int areNotificationsEnabled(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 16136, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 16136, new Class[]{Context.class}, Integer.TYPE)).intValue();
        } else if (context2 == null) {
            return -1;
        } else {
            try {
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                String packageName = context.getApplicationContext().getPackageName();
                int i = applicationInfo.uid;
                Reflect on = Reflect.on((Object) (AppOpsManager) context2.getSystemService("appops"));
                int intValue = ((Integer) on.field("OP_POST_NOTIFICATION", Integer.TYPE).get()).intValue();
                if (((Integer) on.call("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Integer.valueOf(intValue), Integer.valueOf(i), packageName).get()).intValue() == 0) {
                    return 1;
                }
                return 0;
            } catch (Throwable unused) {
                return -1;
            }
        }
    }

    public static String getCacheDirPath(Context context) throws NullPointerException {
        String str;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 16132, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 16132, new Class[]{Context.class}, String.class);
        } else if (context2 != null) {
            try {
                if (context.getCacheDir() != null) {
                    str = context.getCacheDir().getPath();
                } else {
                    File dir = context2.getDir("/data/data/" + context.getPackageName() + "/cache/", 0);
                    if (dir != null) {
                        str = dir.getPath();
                    }
                    str = null;
                }
            } catch (Throwable unused) {
            }
            if (!StringUtils.isEmpty(str)) {
                return str;
            }
            throw new NullPointerException("Cannot Create Cache Dir");
        } else {
            throw new NullPointerException("Context is NUll");
        }
    }

    public static String getDefaultBrowserString(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 16129, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 16129, new Class[]{Context.class}, String.class);
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setDataAndType(Uri.parse("http://"), null);
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65568);
            if (queryIntentActivities.size() > 0) {
                for (ResolveInfo next : queryIntentActivities) {
                    if (next != null && next.activityInfo != null && "com.android.browser".equals(next.activityInfo.packageName)) {
                        return next.activityInfo.packageName + "/" + next.activityInfo.name;
                    }
                }
                ResolveInfo resolveInfo = queryIntentActivities.get(0);
                if (!(resolveInfo == null || resolveInfo.activityInfo == null)) {
                    return resolveInfo.activityInfo.packageName + "/" + resolveInfo.activityInfo.name;
                }
            }
        } catch (Exception unused) {
        }
        return "com.android.browser/com.android.browser.BrowserActivity";
    }

    public static String getFilesDirPath(Context context) throws NullPointerException {
        String str;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 16133, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 16133, new Class[]{Context.class}, String.class);
        } else if (context2 != null) {
            try {
                if (context.getFilesDir() != null) {
                    str = context.getFilesDir().getPath();
                } else {
                    File dir = context2.getDir("/data/data/" + context.getPackageName() + "/files/", 0);
                    if (dir != null) {
                        str = dir.getPath();
                    }
                    str = null;
                }
            } catch (Throwable unused) {
            }
            if (!StringUtils.isEmpty(str)) {
                return str;
            }
            throw new NullPointerException("Cannot Create Files Dir");
        } else {
            throw new NullPointerException("Context is NUll");
        }
    }

    public static String getRunningTaskInfoString(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 16131, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 16131, new Class[]{Context.class}, String.class);
        } else if (context2 == null) {
            return "";
        } else {
            try {
                List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context2.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningTasks(5);
                if (runningTasks == null) {
                    return "";
                }
                String packageName = context.getPackageName();
                StringBuilder sb = new StringBuilder();
                for (ActivityManager.RunningTaskInfo next : runningTasks) {
                    if (next != null && next.baseActivity != null && packageName.equals(next.baseActivity.getPackageName())) {
                        sb.append("id = ");
                        sb.append(next.id);
                        sb.append(" ");
                        sb.append("description = ");
                        sb.append(next.description);
                        sb.append(" ");
                        sb.append("number_of_activities = ");
                        sb.append(next.numActivities);
                        sb.append(" ");
                        sb.append("number_of_running_activities = ");
                        sb.append(next.numRunning);
                        sb.append(" ");
                        sb.append("topActivity = ");
                        sb.append(next.topActivity.toString());
                        sb.append(" ");
                        sb.append("baseActivity = ");
                        sb.append(next.baseActivity.toString());
                        return sb.toString();
                    }
                }
                return "";
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0076 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:11:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e A[SYNTHETIC, Splitter:B:26:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0085 A[SYNTHETIC, Splitter:B:33:0x0085] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getSystemProperty(java.lang.String r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 16101(0x3ee5, float:2.2562E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 1
            r14 = 16101(0x3ee5, float:2.2562E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0035:
            java.lang.String r1 = systemProperty
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0040
            java.lang.String r0 = systemProperty
            return r0
        L_0x0040:
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ Throwable -> 0x0082, all -> 0x007b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0082, all -> 0x007b }
            java.lang.String r4 = "getprop "
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0082, all -> 0x007b }
            r3.append(r0)     // Catch:{ Throwable -> 0x0082, all -> 0x007b }
            java.lang.String r0 = r3.toString()     // Catch:{ Throwable -> 0x0082, all -> 0x007b }
            java.lang.Process r0 = r2.exec(r0)     // Catch:{ Throwable -> 0x0082, all -> 0x007b }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0082, all -> 0x007b }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0082, all -> 0x007b }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ Throwable -> 0x0082, all -> 0x007b }
            r3.<init>(r0)     // Catch:{ Throwable -> 0x0082, all -> 0x007b }
            r0 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3, r0)     // Catch:{ Throwable -> 0x0082, all -> 0x007b }
            java.lang.String r0 = r2.readLine()     // Catch:{ Throwable -> 0x0079, all -> 0x0076 }
            r2.close()     // Catch:{ Throwable -> 0x0074, all -> 0x0076 }
            systemProperty = r0     // Catch:{ Throwable -> 0x0074, all -> 0x0076 }
            r2.close()     // Catch:{ IOException -> 0x0073 }
        L_0x0073:
            return r0
        L_0x0074:
            r1 = r0
            goto L_0x0083
        L_0x0076:
            r0 = move-exception
            r1 = r2
            goto L_0x007c
        L_0x0079:
            goto L_0x0083
        L_0x007b:
            r0 = move-exception
        L_0x007c:
            if (r1 == 0) goto L_0x0081
            r1.close()     // Catch:{ IOException -> 0x0081 }
        L_0x0081:
            throw r0
        L_0x0082:
            r2 = r1
        L_0x0083:
            if (r2 == 0) goto L_0x0088
            r2.close()     // Catch:{ IOException -> 0x0088 }
        L_0x0088:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.ToolUtils.getSystemProperty(java.lang.String):java.lang.String");
    }

    public static void addImageMedia(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, changeQuickRedirect, true, 16112, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, null, changeQuickRedirect, true, 16112, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        try {
            context2.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(new File(str2))));
        } catch (Exception unused) {
        }
    }

    public static Intent getLaunchIntentForPackage(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, changeQuickRedirect, true, 16094, new Class[]{Context.class, String.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{context, str2}, null, changeQuickRedirect, true, 16094, new Class[]{Context.class, String.class}, Intent.class);
        }
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str2);
        if (launchIntentForPackage == null) {
            return launchIntentForPackage;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static String getProviderAuthority(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, changeQuickRedirect, true, 16128, new Class[]{Context.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context, str2}, null, changeQuickRedirect, true, 16128, new Class[]{Context.class, String.class}, String.class);
        } else if (context == null || StringUtils.isEmpty(str)) {
            return null;
        } else {
            try {
                for (ProviderInfo providerInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 8).providers) {
                    if (str2.equals(providerInfo.name)) {
                        return providerInfo.authority;
                    }
                }
            } catch (Exception unused) {
            }
            return null;
        }
    }

    public static boolean isInstalledApp(Context context, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{context, intent2}, null, changeQuickRedirect, true, 16096, new Class[]{Context.class, Intent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, intent2}, null, changeQuickRedirect, true, 16096, new Class[]{Context.class, Intent.class}, Boolean.TYPE)).booleanValue();
        } else if (intent2 == null) {
            return false;
        } else {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent2, 65536);
            if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                return false;
            }
            return true;
        }
    }

    public static boolean isSubProcess(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, changeQuickRedirect, true, 16116, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str2}, null, changeQuickRedirect, true, 16116, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        String curProcessName = getCurProcessName(context);
        if (curProcessName == null || !curProcessName.endsWith(str2)) {
            return false;
        }
        return true;
    }

    public static void openInstalledApp(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, changeQuickRedirect, true, 16127, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, null, changeQuickRedirect, true, 16127, new Class[]{Context.class, String.class}, Void.TYPE);
        } else if (context2 != null && !StringUtils.isEmpty(str)) {
            try {
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str2);
                launchIntentForPackage.addFlags(268435456);
                context2.startActivity(launchIntentForPackage);
            } catch (Exception unused) {
            }
        }
    }

    private static void setFlymeStatusBarDarkMode(boolean z, Window window) {
        Window window2 = window;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), window2}, null, changeQuickRedirect, true, 16140, new Class[]{Boolean.TYPE, Window.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), window2}, null, changeQuickRedirect, true, 16140, new Class[]{Boolean.TYPE, Window.class}, Void.TYPE);
            return;
        }
        try {
            WindowManager.LayoutParams attributes = window.getAttributes();
            Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
            if (z) {
                declaredField.set(attributes, Integer.valueOf(declaredField.getInt(attributes) | 512));
            } else {
                declaredField.set(attributes, Integer.valueOf(declaredField.getInt(attributes) & -513));
            }
            window2.setAttributes(attributes);
        } catch (Throwable unused) {
        }
    }

    public static void startPhoneScreen(Context context, String str) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, str}, null, changeQuickRedirect, true, 16126, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str}, null, changeQuickRedirect, true, 16126, new Class[]{Context.class, String.class}, Void.TYPE);
        } else if (context2 != null && !StringUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context2 instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                context2.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    public static void addImageMedia2(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, changeQuickRedirect, true, 16113, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, null, changeQuickRedirect, true, 16113, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        try {
            a aVar = new a(context2, str2);
            if (PatchProxy.isSupport(new Object[0], aVar, a.f2447a, false, 16141, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, a.f2447a, false, 16141, new Class[0], Void.TYPE);
                return;
            }
            if (aVar.f2448b != null && aVar.f2448b.isConnected()) {
                aVar.f2448b.disconnect();
            }
            aVar.f2448b = new MediaScannerConnection(aVar.f2449c, aVar);
            aVar.f2448b.connect();
        } catch (Exception unused) {
        }
    }

    public static void clearDir(String str, Set<String> set) throws Exception {
        String str2 = str;
        Set<String> set2 = set;
        if (PatchProxy.isSupport(new Object[]{str2, set2}, null, changeQuickRedirect, true, 16109, new Class[]{String.class, Set.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, set2}, null, changeQuickRedirect, true, 16109, new Class[]{String.class, Set.class}, Void.TYPE);
            return;
        }
        File file = new File(str2);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    removeDir(listFiles[i].getAbsolutePath(), set2);
                } else if (listFiles[i].isFile()) {
                    String name = listFiles[i].getName();
                    if (set2 == null || !set2.contains(name)) {
                        listFiles[i].delete();
                    }
                }
            }
        }
    }

    private static String getAuthorityFromPermission(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, changeQuickRedirect, true, 16104, new Class[]{Context.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context, str2}, null, changeQuickRedirect, true, 16104, new Class[]{Context.class, String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            try {
                List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(8);
                if (installedPackages == null) {
                    return null;
                }
                for (PackageInfo packageInfo : installedPackages) {
                    ProviderInfo[] providerInfoArr = packageInfo.providers;
                    if (providerInfoArr != null) {
                        int length = providerInfoArr.length;
                        int i = 0;
                        while (i < length) {
                            ProviderInfo providerInfo = providerInfoArr[i];
                            if (!str2.equals(providerInfo.readPermission)) {
                                if (!str2.equals(providerInfo.writePermission)) {
                                    i++;
                                }
                            }
                            return providerInfo.authority;
                        }
                        continue;
                    }
                }
                return null;
            } catch (Exception unused) {
            }
        }
    }

    public static long getDirectorySize(File file, boolean z) {
        if (PatchProxy.isSupport(new Object[]{file, Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 16111, new Class[]{File.class, Boolean.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{file, Byte.valueOf(z)}, null, changeQuickRedirect, true, 16111, new Class[]{File.class, Boolean.TYPE}, Long.TYPE)).longValue();
        }
        long j = 0;
        try {
            if (!file.exists() && file.isDirectory()) {
                return 0;
            }
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    j += getDirectorySize(file2, z);
                } else {
                    boolean z2 = z;
                    if (file2.isFile()) {
                        j += file2.length();
                    }
                }
            }
            return j;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:16|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r7 = r3.getApplicationLabel(r4);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0071 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void installShortcut(android.content.Context r19, java.lang.String r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = 0
            r6 = 1
            r7 = 16106(0x3eea, float:2.257E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0043
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = changeQuickRedirect
            r15 = 1
            r16 = 16106(0x3eea, float:2.257E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0043:
            if (r0 != 0) goto L_0x0046
            return
        L_0x0046:
            android.content.Intent r2 = getLaunchIntentForPackage(r19, r20)     // Catch:{ Exception -> 0x00a5 }
            if (r2 != 0) goto L_0x004d
            return
        L_0x004d:
            android.content.pm.PackageManager r3 = r19.getPackageManager()     // Catch:{ Exception -> 0x00a5 }
            android.content.pm.ApplicationInfo r4 = r3.getApplicationInfo(r1, r10)     // Catch:{ Exception -> 0x00a5 }
            android.content.res.Resources r5 = r3.getResourcesForApplication(r4)     // Catch:{ Exception -> 0x00a5 }
            int r6 = r4.icon     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r6 = r5.getResourceName(r6)     // Catch:{ Exception -> 0x00a5 }
            r7 = 0
            android.content.ComponentName r8 = r2.getComponent()     // Catch:{ NotFoundException -> 0x0071 }
            android.content.pm.ActivityInfo r8 = r3.getActivityInfo(r8, r10)     // Catch:{ NotFoundException -> 0x0071 }
            int r8 = r8.labelRes     // Catch:{ NotFoundException -> 0x0071 }
            if (r8 <= 0) goto L_0x0075
            java.lang.String r7 = r5.getString(r8)     // Catch:{ NotFoundException -> 0x0071 }
            goto L_0x0075
        L_0x0071:
            java.lang.CharSequence r7 = r3.getApplicationLabel(r4)     // Catch:{ Exception -> 0x00a5 }
        L_0x0075:
            if (r7 != 0) goto L_0x0078
            return
        L_0x0078:
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r4 = "com.android.launcher.action.INSTALL_SHORTCUT"
            r3.<init>(r4)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r4 = "android.intent.extra.shortcut.NAME"
            r3.putExtra(r4, r7)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r4 = "android.intent.extra.shortcut.INTENT"
            r3.putExtra(r4, r2)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r2 = "launch_from"
            r3.putExtra(r2, r11)     // Catch:{ Exception -> 0x00a5 }
            android.content.Intent$ShortcutIconResource r2 = new android.content.Intent$ShortcutIconResource     // Catch:{ Exception -> 0x00a5 }
            r2.<init>()     // Catch:{ Exception -> 0x00a5 }
            r2.packageName = r1     // Catch:{ Exception -> 0x00a5 }
            r2.resourceName = r6     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r1 = "android.intent.extra.shortcut.ICON_RESOURCE"
            r3.putExtra(r1, r2)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r1 = "duplicate"
            r3.putExtra(r1, r10)     // Catch:{ Exception -> 0x00a5 }
            r0.sendBroadcast(r3)     // Catch:{ Exception -> 0x00a5 }
            return
        L_0x00a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.ToolUtils.installShortcut(android.content.Context, java.lang.String):void");
    }

    public static boolean isApkInstalled(Context context, String str) {
        PackageInfo packageInfo;
        String str2 = str;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, changeQuickRedirect, true, 16115, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str2}, null, changeQuickRedirect, true, 16115, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (context == null || str2 == null || StringUtils.isEmpty(str)) {
            return false;
        } else {
            try {
                File file = new File(str2);
                if (file.exists()) {
                    PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 1);
                    if (packageArchiveInfo == null) {
                        return false;
                    }
                    String str3 = packageArchiveInfo.packageName;
                    int i = packageArchiveInfo.versionCode;
                    try {
                        packageInfo = context.getPackageManager().getPackageInfo(str3, 1);
                    } catch (PackageManager.NameNotFoundException unused) {
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        if (i <= packageInfo.versionCode) {
                            z = true;
                        }
                    }
                }
            } catch (Exception unused2) {
            }
            return z;
        }
    }

    public static boolean isApplicationForeground(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, changeQuickRedirect, true, 16123, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str2}, null, changeQuickRedirect, true, 16123, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (context2 == null || StringUtils.isEmpty(str)) {
            return false;
        } else {
            ActivityManager activityManager = (ActivityManager) context2.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            if (Build.VERSION.SDK_INT < 21) {
                List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
                if (!runningTasks.isEmpty()) {
                    ComponentName componentName = runningTasks.get(0).topActivity;
                    if (componentName == null || !str2.equals(componentName.getPackageName())) {
                        return false;
                    }
                    return true;
                }
            } else {
                for (ActivityManager.RunningAppProcessInfo next : activityManager.getRunningAppProcesses()) {
                    if (str2.equals(next.processName)) {
                        if (next.importance == 100) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            return false;
        }
    }

    public static boolean isInstalledApp(Context context, String str) {
        String str2 = str;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, changeQuickRedirect, true, 16095, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str2}, null, changeQuickRedirect, true, 16095, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        if (context != null && !StringUtils.isEmpty(str)) {
            try {
                if (context.getPackageManager().getPackageInfo(str2, 16777216) != null) {
                    z = true;
                }
            } catch (Exception unused) {
            }
        }
        return z;
    }

    public static boolean isShortcutInstalled(Context context, String str) {
        Context context2 = context;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{context2, str}, null, changeQuickRedirect, true, 16105, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str}, null, changeQuickRedirect, true, 16105, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            String authorityFromPermission = getAuthorityFromPermission(context2, "com.android.launcher.permission.READ_SETTINGS");
            if (authorityFromPermission == null) {
                authorityFromPermission = "com.android.launcher.settings";
            }
            Uri parse = Uri.parse("content://" + authorityFromPermission + "/favorites?notify=true");
            Cursor query = context.getContentResolver().query(parse, new String[]{PushConstants.TITLE}, "title=?", new String[]{str}, null);
            if (query != null && query.getCount() > 0) {
                z = true;
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception unused) {
        }
        return z;
    }

    public static void removeDir(String str, Set<String> set) throws Exception {
        String str2 = str;
        Set<String> set2 = set;
        if (PatchProxy.isSupport(new Object[]{str2, set2}, null, changeQuickRedirect, true, 16110, new Class[]{String.class, Set.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, set2}, null, changeQuickRedirect, true, 16110, new Class[]{String.class, Set.class}, Void.TYPE);
            return;
        }
        File file = new File(str2);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    removeDir(listFiles[i].getAbsolutePath(), set2);
                } else {
                    String name = listFiles[i].getName();
                    if (set2 == null || !set2.contains(name)) {
                        listFiles[i].delete();
                    }
                }
            }
        }
    }

    private static void setMiuiStatusBarDarkMode(boolean z, Window window) {
        int i;
        Window window2 = window;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), window2}, null, changeQuickRedirect, true, 16139, new Class[]{Boolean.TYPE, Window.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), window2}, null, changeQuickRedirect, true, 16139, new Class[]{Boolean.TYPE, Window.class}, Void.TYPE);
            return;
        }
        try {
            Class<?> cls = window.getClass();
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Method method = cls.getMethod("setExtraFlags", new Class[]{Integer.TYPE, Integer.TYPE});
            Object[] objArr = new Object[2];
            if (z) {
                i = i2;
            } else {
                i = 0;
            }
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(i2);
            method.invoke(window2, objArr);
        } catch (Throwable unused) {
        }
    }

    public static void deleteShortCut(Context context, Intent intent, String str) {
        Context context2 = context;
        Intent intent2 = intent;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, intent2, str2}, null, changeQuickRedirect, true, 16125, new Class[]{Context.class, Intent.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, intent2, str2}, null, changeQuickRedirect, true, 16125, new Class[]{Context.class, Intent.class, String.class}, Void.TYPE);
        } else if (context2 != null && intent2 != null && !StringUtils.isEmpty(str)) {
            try {
                Intent intent3 = new Intent("com.android.launcher.action.UNINSTALL_SHORTCUT");
                intent3.putExtra("android.intent.extra.shortcut.INTENT", intent2);
                intent3.putExtra("android.intent.extra.shortcut.NAME", str2);
                intent3.putExtra("duplicate", false);
                context2.sendBroadcast(intent3);
                Logger.debug();
            } catch (Exception unused) {
            }
        }
    }

    public static boolean isPackageMatchApk(Context context, String str, String str2) {
        PackageInfo packageInfo;
        String str3 = str;
        String str4 = str2;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{context, str3, str4}, null, changeQuickRedirect, true, 16114, new Class[]{Context.class, String.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str3, str4}, null, changeQuickRedirect, true, 16114, new Class[]{Context.class, String.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (context == null || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            return false;
        } else {
            try {
                File file = new File(str3);
                if (file.exists()) {
                    PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 1);
                    if (packageArchiveInfo == null || !packageArchiveInfo.packageName.equals(str4)) {
                        return false;
                    }
                    int i = packageArchiveInfo.versionCode;
                    try {
                        packageInfo = context.getPackageManager().getPackageInfo(str4, 1);
                    } catch (PackageManager.NameNotFoundException unused) {
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        if (i == packageInfo.versionCode) {
                            z = true;
                        }
                    }
                }
            } catch (Exception unused2) {
            }
            return z;
        }
    }

    public static boolean isServiceRunning(Context context, String str, String str2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4}, null, changeQuickRedirect, true, 16134, new Class[]{Context.class, String.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str3, str4}, null, changeQuickRedirect, true, 16134, new Class[]{Context.class, String.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (context2 == null || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            return false;
        } else {
            try {
                List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context2.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningServices(Integer.MAX_VALUE);
                if (runningServices != null && runningServices.size() > 0) {
                    Iterator<ActivityManager.RunningServiceInfo> it2 = runningServices.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        ActivityManager.RunningServiceInfo next = it2.next();
                        if (str3.equals(next.service.getPackageName()) && str4.equals(next.service.getClassName())) {
                            z = true;
                            break;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            return z;
        }
    }

    public static void runApplication(Context context, String str, String str2) {
        Context context2 = context;
        String str3 = str;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str2}, null, changeQuickRedirect, true, 16097, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str3, str2}, null, changeQuickRedirect, true, 16097, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (!StringUtils.isEmpty(str)) {
            z = isInstalledApp(context, str);
        }
        if (z) {
            Intent launchIntentForPackage = getLaunchIntentForPackage(context, str);
            if (launchIntentForPackage != null) {
                context2.startActivity(launchIntentForPackage);
                return;
            }
        }
        if (!StringUtils.isEmpty(str2)) {
            try {
                context2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                return;
            } catch (Exception unused) {
            }
        }
        if (!StringUtils.isEmpty(str)) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str3));
            intent.addFlags(268435456);
            try {
                context2.startActivity(intent);
            } catch (Exception unused2) {
            }
        }
    }

    public static void createShortCut(Context context, Intent intent, String str, Bitmap bitmap) {
        Context context2 = context;
        Intent intent2 = intent;
        String str2 = str;
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{context2, intent2, str2, bitmap2}, null, changeQuickRedirect, true, 16124, new Class[]{Context.class, Intent.class, String.class, Bitmap.class}, Void.TYPE)) {
            Object[] objArr = {context2, intent2, str2, bitmap2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, 16124, new Class[]{Context.class, Intent.class, String.class, Bitmap.class}, Void.TYPE);
        } else if (context2 != null && intent2 != null && !StringUtils.isEmpty(str) && bitmap2 != null && !isShortcutInstalled(context2, str2)) {
            try {
                Intent intent3 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                intent3.putExtra("android.intent.extra.shortcut.NAME", str2);
                intent3.putExtra("android.intent.extra.shortcut.ICON", bitmap2);
                intent3.putExtra("duplicate", false);
                intent3.putExtra("android.intent.extra.shortcut.INTENT", intent2);
                context2.sendBroadcast(intent3);
                Logger.debug();
            } catch (Exception unused) {
            }
        }
    }

    @TargetApi(21)
    public static void trySetStatusBar(Context context, Window window, int i, boolean z) {
        Window window2 = window;
        if (PatchProxy.isSupport(new Object[]{context, window2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 16138, new Class[]{Context.class, Window.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, window2, Integer.valueOf(i), Byte.valueOf(z)}, null, changeQuickRedirect, true, 16138, new Class[]{Context.class, Window.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (context != null && window2 != null) {
            try {
                if (!sCanSetStatusBar) {
                    window2.clearFlags(Integer.MIN_VALUE);
                    return;
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    if (isMiui()) {
                        if (z) {
                            setMiuiStatusBarDarkMode(false, window2);
                        } else {
                            setMiuiStatusBarDarkMode(true, window2);
                        }
                    } else if (!isFlyme()) {
                        View decorView = window.getDecorView();
                        int systemUiVisibility = decorView.getSystemUiVisibility();
                        if (z) {
                            decorView.setSystemUiVisibility(systemUiVisibility & -8193);
                        } else {
                            decorView.setSystemUiVisibility(systemUiVisibility | 8192);
                        }
                    } else if (z) {
                        setFlymeStatusBarDarkMode(false, window2);
                    } else {
                        setFlymeStatusBarDarkMode(true, window2);
                    }
                    window2.clearFlags(67108864);
                    window2.addFlags(Integer.MIN_VALUE);
                    window2.setStatusBarColor(context.getResources().getColor(i));
                }
            } catch (Throwable unused) {
            }
        }
    }
}
