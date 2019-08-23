package com.ss.android.message.b;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.reflect.Reflect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29996a;

    /* renamed from: b  reason: collision with root package name */
    public static String f29997b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f29998c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f29999d;

    public static boolean a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f29996a, true, 18195, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f29996a, true, 18195, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (context2 == null || StringUtils.isEmpty(str)) {
            return false;
        } else {
            ActivityManager activityManager = (ActivityManager) context2.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            if (Build.VERSION.SDK_INT < 21) {
                List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
                if (runningTasks != null && !runningTasks.isEmpty()) {
                    ComponentName componentName = runningTasks.get(0).topActivity;
                    return componentName != null && str2.equals(componentName.getPackageName());
                }
            } else {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                    for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                        if (str2.equals(next.processName)) {
                            return next.importance == 100;
                        }
                    }
                }
            }
        }
    }

    private static String e() {
        if (PatchProxy.isSupport(new Object[0], null, f29996a, true, 18207, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f29996a, true, 18207, new Class[0], String.class);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return a("ro.build.version.emui");
        }
        return f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072 A[SYNTHETIC, Splitter:B:21:0x0072] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0079 A[SYNTHETIC, Splitter:B:29:0x0079] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String c() {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f29996a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2 = 0
            r4 = 1
            r5 = 18193(0x4711, float:2.5494E-41)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f29996a
            r5 = 1
            r6 = 18193(0x4711, float:2.5494E-41)
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.b.k.c():java.lang.String");
    }

    private static boolean d() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f29996a, true, 18205, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f29996a, true, 18205, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            if ((!StringUtils.isEmpty(Build.BRAND) && Build.BRAND.toLowerCase().startsWith("huawei")) || (!StringUtils.isEmpty(Build.MANUFACTURER) && Build.MANUFACTURER.toLowerCase().startsWith("huawei"))) {
                z = true;
            }
        } catch (Throwable unused) {
        }
        return z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String f() {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f29996a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2 = 0
            r4 = 1
            r5 = 18208(0x4720, float:2.5515E-41)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f29996a
            r5 = 1
            r6 = 18208(0x4720, float:2.5515E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0026:
            java.lang.Class<android.os.Build> r1 = android.os.Build.class
            java.lang.String r2 = "getString"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Throwable -> 0x004b }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r0] = r5     // Catch:{ Throwable -> 0x004b }
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch:{ Throwable -> 0x004b }
            r1.setAccessible(r3)     // Catch:{ Throwable -> 0x004b }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x004b }
            java.lang.String r3 = "ro.build.version.emui"
            r2[r0] = r3     // Catch:{ Throwable -> 0x004b }
            r0 = 0
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch:{ Throwable -> 0x004b }
            boolean r2 = r1 instanceof java.lang.String     // Catch:{ Throwable -> 0x004b }
            if (r2 == 0) goto L_0x004d
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x004b }
            goto L_0x004d
        L_0x004b:
            java.lang.String r0 = ""
        L_0x004d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.b.k.f():java.lang.String");
    }

    private static boolean g() {
        if (PatchProxy.isSupport(new Object[0], null, f29996a, true, 18210, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f29996a, true, 18210, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!f29999d) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    f29998c = true;
                    f29999d = true;
                    return f29998c;
                }
            } catch (Exception unused) {
            }
            f29999d = true;
        }
        return f29998c;
    }

    public static String b() {
        boolean z;
        String str;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], null, f29996a, true, 18211, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f29996a, true, 18211, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        try {
            if (g()) {
                sb.append("MIUI-");
            } else if (a()) {
                sb.append("FLYME-");
            } else {
                String e2 = e();
                if (PatchProxy.isSupport(new Object[]{e2}, null, f29996a, true, 18206, new Class[]{String.class}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{e2}, null, f29996a, true, 18206, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
                } else {
                    if (TextUtils.isEmpty(e2)) {
                        str = e();
                    } else {
                        str = e2;
                    }
                    if (TextUtils.isEmpty(str) || !str.toLowerCase().startsWith("emotionui")) {
                        if (!d()) {
                            z = false;
                        }
                    }
                    z = true;
                }
                if (z) {
                    if (PatchProxy.isSupport(new Object[0], null, f29996a, true, 18212, new Class[0], Boolean.TYPE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f29996a, true, 18212, new Class[0], Boolean.TYPE)).booleanValue();
                    } else if ("angler".equals(Build.BOARD) && Build.MODEL != null && Build.MODEL.toLowerCase().contains("nexus") && Build.MODEL.toLowerCase().contains("6p")) {
                        z2 = true;
                    }
                    if (!z2) {
                        sb.append("EMUI-");
                    }
                }
                if (!TextUtils.isEmpty(e2)) {
                    sb.append(e2);
                    sb.append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f29996a, true, 18201, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f29996a, true, 18201, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (Build.DISPLAY.indexOf("Flyme") >= 0 || Build.USER.equals("flyme")) {
            return true;
        }
        return false;
    }

    public static String a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f29996a, true, 18192, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, f29996a, true, 18192, new Class[]{Context.class}, String.class);
        }
        String str = f29997b;
        if (!StringUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context2.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses()) {
                if (next.pid == myPid) {
                    Logger.debug();
                    String str2 = next.processName;
                    f29997b = str2;
                    return str2;
                }
            }
        } catch (Exception unused) {
        }
        String c2 = c();
        f29997b = c2;
        return c2;
    }

    public static String b(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f29996a, true, 18194, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, f29996a, true, 18194, new Class[]{Context.class}, String.class);
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:7:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071 A[SYNTHETIC, Splitter:B:22:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0078 A[SYNTHETIC, Splitter:B:29:0x0078] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.String r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f29996a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 18209(0x4721, float:2.5516E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f29996a
            r13 = 1
            r14 = 18209(0x4721, float:2.5516E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0035:
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ Throwable -> 0x0075, all -> 0x006e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0075, all -> 0x006e }
            java.lang.String r4 = "getprop "
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0075, all -> 0x006e }
            r3.append(r0)     // Catch:{ Throwable -> 0x0075, all -> 0x006e }
            java.lang.String r0 = r3.toString()     // Catch:{ Throwable -> 0x0075, all -> 0x006e }
            java.lang.Process r0 = r2.exec(r0)     // Catch:{ Throwable -> 0x0075, all -> 0x006e }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0075, all -> 0x006e }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0075, all -> 0x006e }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ Throwable -> 0x0075, all -> 0x006e }
            r3.<init>(r0)     // Catch:{ Throwable -> 0x0075, all -> 0x006e }
            r0 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3, r0)     // Catch:{ Throwable -> 0x0075, all -> 0x006e }
            java.lang.String r0 = r2.readLine()     // Catch:{ Throwable -> 0x006c, all -> 0x0069 }
            r2.close()     // Catch:{ Throwable -> 0x0067, all -> 0x0069 }
            r2.close()     // Catch:{ IOException -> 0x0066 }
        L_0x0066:
            return r0
        L_0x0067:
            r1 = r0
            goto L_0x0076
        L_0x0069:
            r0 = move-exception
            r1 = r2
            goto L_0x006f
        L_0x006c:
            goto L_0x0076
        L_0x006e:
            r0 = move-exception
        L_0x006f:
            if (r1 == 0) goto L_0x0074
            r1.close()     // Catch:{ IOException -> 0x0074 }
        L_0x0074:
            throw r0
        L_0x0075:
            r2 = r1
        L_0x0076:
            if (r2 == 0) goto L_0x007b
            r2.close()     // Catch:{ IOException -> 0x007b }
        L_0x007b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.b.k.a(java.lang.String):java.lang.String");
    }

    public static String c(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f29996a, true, 18196, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, null, f29996a, true, 18196, new Class[]{Context.class}, String.class);
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

    public static boolean d(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f29996a, true, 18200, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f29996a, true, 18200, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        String a2 = a(context);
        if ((a2 == null || !a2.contains(":")) && a2 != null && a2.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    public static int e(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f29996a, true, 18204, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, null, f29996a, true, 18204, new Class[]{Context.class}, Integer.TYPE)).intValue();
        } else if (context2 == null) {
            return -1;
        } else {
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    if (((Boolean) Reflect.on((Object) (NotificationManager) context2.getSystemService("notification")).call("areNotificationsEnabled").get()).booleanValue()) {
                        return 1;
                    }
                    return 0;
                } catch (Exception unused) {
                }
            }
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
            } catch (Throwable unused2) {
                return -1;
            }
        }
    }

    public static String a(String str, List<Pair<String, String>> list) {
        String str2 = str;
        List<Pair<String, String>> list2 = list;
        if (PatchProxy.isSupport(new Object[]{str2, list2}, null, f29996a, true, 18203, new Class[]{String.class, List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, list2}, null, f29996a, true, 18203, new Class[]{String.class, List.class}, String.class);
        }
        StringBuilder sb = new StringBuilder(str2);
        if (str2.indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        sb.append(NetworkUtils.format(list2, "UTF-8"));
        return sb.toString();
    }

    public static String a(String str, Map<String, String> map) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, map}, null, f29996a, true, 18202, new Class[]{String.class, Map.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, map}, null, f29996a, true, 18202, new Class[]{String.class, Map.class}, String.class);
        }
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                arrayList.add(new Pair(next.getKey(), next.getValue()));
            }
        }
        return a(str2, (List<Pair<String, String>>) arrayList);
    }
}
