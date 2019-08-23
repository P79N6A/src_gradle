package com.vivo.push.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.google.a.a.a.a.a.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.vivo.push.z;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    private static String[] f81699a = {"com.vivo.push.sdk.RegistrationReceiver", "com.vivo.push.sdk.service.PushService", "com.vivo.push.sdk.service.CommonJobService"};

    /* renamed from: b  reason: collision with root package name */
    private static String[] f81700b = {"android.permission.INTERNET", "android.permission.READ_PHONE_STATE", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WRITE_SETTINGS", "android.permission.VIBRATE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.ACCESS_WIFI_STATE", "android.permission.WAKE_LOCK", "android.permission.GET_ACCOUNTS", "com.bbk.account.permission.READ_ACCOUNTINFO", "android.permission.AUTHENTICATE_ACCOUNTS", "android.permission.MOUNT_UNMOUNT_FILESYSTEMS", "android.permission.GET_TASKS"};

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f81701c;

    /* renamed from: d  reason: collision with root package name */
    private static String[] f81702d = {"com.vivo.push.sdk.service.CommandService", "com.vivo.push.sdk.service.CommonJobService"};

    /* renamed from: e  reason: collision with root package name */
    private static String[] f81703e = {"com.vivo.push.sdk.RegistrationReceiver"};

    /* renamed from: f  reason: collision with root package name */
    private static String[] f81704f = {"com.vivo.push.sdk.service.LinkProxyActivity"};

    public static long b(Context context) {
        String b2 = r.b(context);
        if (!TextUtils.isEmpty(b2)) {
            return a(context, b2);
        }
        o.a("Utility", "systemPushPkgName is null");
        return -1;
    }

    public static PublicKey d(Context context) {
        Cursor query = context.getContentResolver().query(z.f81713a, null, null, null, null);
        if (query == null) {
            return null;
        }
        do {
            try {
                if (query.moveToNext()) {
                }
            } catch (Exception e2) {
                a.b(e2);
            } catch (Throwable th) {
                try {
                    query.close();
                } catch (Exception unused) {
                }
                throw th;
            }
            try {
                query.close();
            } catch (Exception unused2) {
            }
            return null;
        } while (!"pushkey".equals(query.getString(query.getColumnIndex("name"))));
        String string = query.getString(query.getColumnIndex("value"));
        o.d("Utility", "result key : ".concat(String.valueOf(string)));
        PublicKey a2 = s.a(string);
        try {
            query.close();
        } catch (Exception unused3) {
        }
        return a2;
    }

    private static void g(Context context) throws VivoPushException {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                String[] strArr = packageManager.getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
                if (strArr != null) {
                    String[] strArr2 = f81700b;
                    int length = strArr2.length;
                    int i = 0;
                    while (i < length) {
                        String str = strArr2[i];
                        int length2 = strArr.length;
                        int i2 = 0;
                        while (i2 < length2) {
                            if (!str.equals(strArr[i2])) {
                                i2++;
                            } else {
                                i++;
                            }
                        }
                        throw new VivoPushException("permission : " + str + "  check fail : " + Arrays.toString(strArr));
                    }
                    return;
                }
                throw new VivoPushException("Permissions is null!");
            }
            throw new VivoPushException("localPackageManager is null");
        } catch (Exception e2) {
            throw new VivoPushException(e2.getMessage());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x008e A[SYNTHETIC, Splitter:B:44:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009d A[SYNTHETIC, Splitter:B:50:0x009d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean e(android.content.Context r10) {
        /*
            r0 = 0
            r1 = 0
            if (r10 != 0) goto L_0x0012
            java.lang.String r10 = "Utility"
            java.lang.String r2 = "context is null"
            com.vivo.push.util.o.a((java.lang.String) r10, (java.lang.String) r2)     // Catch:{ Exception -> 0x000f }
            return r0
        L_0x000c:
            r10 = move-exception
            goto L_0x009b
        L_0x000f:
            r10 = move-exception
            goto L_0x0085
        L_0x0012:
            java.lang.String r2 = r10.getPackageName()     // Catch:{ Exception -> 0x000f }
            android.content.pm.PackageManager r3 = r10.getPackageManager()     // Catch:{ Exception -> 0x000f }
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r2, r0)     // Catch:{ Exception -> 0x000f }
            int r3 = r3.versionCode     // Catch:{ Exception -> 0x000f }
            android.content.ContentResolver r4 = r10.getContentResolver()     // Catch:{ Exception -> 0x000f }
            android.net.Uri r5 = com.vivo.push.z.f81714b     // Catch:{ Exception -> 0x000f }
            r6 = 0
            java.lang.String r7 = "pushVersion = ? and appPkgName = ? and appCode = ? "
            r10 = 3
            java.lang.String[] r8 = new java.lang.String[r10]     // Catch:{ Exception -> 0x000f }
            java.lang.String r10 = "270"
            r8[r0] = r10     // Catch:{ Exception -> 0x000f }
            r10 = 1
            r8[r10] = r2     // Catch:{ Exception -> 0x000f }
            r2 = 2
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x000f }
            r8[r2] = r3     // Catch:{ Exception -> 0x000f }
            r9 = 0
            android.database.Cursor r2 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x000f }
            if (r2 != 0) goto L_0x005d
            java.lang.String r10 = "Utility"
            java.lang.String r1 = "cursor is null"
            com.vivo.push.util.o.a((java.lang.String) r10, (java.lang.String) r1)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            if (r2 == 0) goto L_0x0056
            r2.close()     // Catch:{ Exception -> 0x004e }
            goto L_0x0056
        L_0x004e:
            r10 = move-exception
            java.lang.String r1 = "Utility"
            java.lang.String r2 = "close"
            com.vivo.push.util.o.a(r1, r2, r10)
        L_0x0056:
            return r0
        L_0x0057:
            r10 = move-exception
            r1 = r2
            goto L_0x009b
        L_0x005a:
            r10 = move-exception
            r1 = r2
            goto L_0x0085
        L_0x005d:
            boolean r1 = r2.moveToFirst()     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            if (r1 == 0) goto L_0x007f
            java.lang.String r1 = "permission"
            int r1 = r2.getColumnIndex(r1)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            int r1 = r2.getInt(r1)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            r1 = r1 & r10
            if (r1 == 0) goto L_0x007f
            if (r2 == 0) goto L_0x007e
            r2.close()     // Catch:{ Exception -> 0x0076 }
            goto L_0x007e
        L_0x0076:
            r0 = move-exception
            java.lang.String r1 = "Utility"
            java.lang.String r2 = "close"
            com.vivo.push.util.o.a(r1, r2, r0)
        L_0x007e:
            return r10
        L_0x007f:
            if (r2 == 0) goto L_0x009a
            r2.close()     // Catch:{ Exception -> 0x0092 }
            goto L_0x009a
        L_0x0085:
            java.lang.String r2 = "Utility"
            java.lang.String r3 = "isSupport"
            com.vivo.push.util.o.a(r2, r3, r10)     // Catch:{ all -> 0x000c }
            if (r1 == 0) goto L_0x009a
            r1.close()     // Catch:{ Exception -> 0x0092 }
            goto L_0x009a
        L_0x0092:
            r10 = move-exception
            java.lang.String r1 = "Utility"
            java.lang.String r2 = "close"
            com.vivo.push.util.o.a(r1, r2, r10)
        L_0x009a:
            return r0
        L_0x009b:
            if (r1 == 0) goto L_0x00a9
            r1.close()     // Catch:{ Exception -> 0x00a1 }
            goto L_0x00a9
        L_0x00a1:
            r0 = move-exception
            java.lang.String r1 = "Utility"
            java.lang.String r2 = "close"
            com.vivo.push.util.o.a(r1, r2, r0)
        L_0x00a9:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.y.e(android.content.Context):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0075 A[SYNTHETIC, Splitter:B:40:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0085 A[SYNTHETIC, Splitter:B:47:0x0085] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.String> f(android.content.Context r8) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0015
            java.lang.String r8 = "Utility"
            java.lang.String r1 = "getDebugInfo error : context is null"
            com.vivo.push.util.o.a((java.lang.String) r8, (java.lang.String) r1)     // Catch:{ Exception -> 0x0011, all -> 0x000b }
            return r0
        L_0x000b:
            r8 = move-exception
            r7 = r0
            r0 = r8
            r8 = r7
            goto L_0x0083
        L_0x0011:
            r8 = move-exception
            r1 = r8
            r8 = r0
            goto L_0x006c
        L_0x0015:
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x0011, all -> 0x000b }
            android.net.Uri r2 = com.vivo.push.z.f81716d     // Catch:{ Exception -> 0x0011, all -> 0x000b }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0011, all -> 0x000b }
            if (r8 != 0) goto L_0x003d
            java.lang.String r1 = "Utility"
            java.lang.String r2 = "cursor is null"
            com.vivo.push.util.o.a((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x003b }
            if (r8 == 0) goto L_0x003a
            r8.close()     // Catch:{ Exception -> 0x0032 }
            goto L_0x003a
        L_0x0032:
            r8 = move-exception
            java.lang.String r1 = "Utility"
            java.lang.String r2 = "close"
            com.vivo.push.util.o.a(r1, r2, r8)
        L_0x003a:
            return r0
        L_0x003b:
            r1 = move-exception
            goto L_0x006c
        L_0x003d:
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Exception -> 0x003b }
            r1.<init>()     // Catch:{ Exception -> 0x003b }
        L_0x0042:
            boolean r2 = r8.moveToNext()     // Catch:{ Exception -> 0x003b }
            if (r2 == 0) goto L_0x005d
            int r2 = r8.getColumnCount()     // Catch:{ Exception -> 0x003b }
            r3 = 0
        L_0x004d:
            if (r3 >= r2) goto L_0x0042
            java.lang.String r4 = r8.getColumnName(r3)     // Catch:{ Exception -> 0x003b }
            java.lang.String r5 = r8.getString(r3)     // Catch:{ Exception -> 0x003b }
            r1.put(r4, r5)     // Catch:{ Exception -> 0x003b }
            int r3 = r3 + 1
            goto L_0x004d
        L_0x005d:
            if (r8 == 0) goto L_0x006b
            r8.close()     // Catch:{ Exception -> 0x0063 }
            goto L_0x006b
        L_0x0063:
            r8 = move-exception
            java.lang.String r0 = "Utility"
            java.lang.String r2 = "close"
            com.vivo.push.util.o.a(r0, r2, r8)
        L_0x006b:
            return r1
        L_0x006c:
            java.lang.String r2 = "Utility"
            java.lang.String r3 = "isOverdue"
            com.vivo.push.util.o.a(r2, r3, r1)     // Catch:{ all -> 0x0082 }
            if (r8 == 0) goto L_0x0081
            r8.close()     // Catch:{ Exception -> 0x0079 }
            goto L_0x0081
        L_0x0079:
            r8 = move-exception
            java.lang.String r1 = "Utility"
            java.lang.String r2 = "close"
            com.vivo.push.util.o.a(r1, r2, r8)
        L_0x0081:
            return r0
        L_0x0082:
            r0 = move-exception
        L_0x0083:
            if (r8 == 0) goto L_0x0091
            r8.close()     // Catch:{ Exception -> 0x0089 }
            goto L_0x0091
        L_0x0089:
            r8 = move-exception
            java.lang.String r1 = "Utility"
            java.lang.String r2 = "close"
            com.vivo.push.util.o.a(r1, r2, r8)
        L_0x0091:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.y.f(android.content.Context):java.util.Map");
    }

    public static void c(Context context) throws VivoPushException {
        String str;
        o.d("Utility", "check PushService AndroidManifest declearation !");
        String b2 = r.b(context);
        boolean c2 = r.c(context, context.getPackageName());
        boolean d2 = r.d(context, context.getPackageName());
        boolean b3 = r.b(context, context.getPackageName());
        if (d2) {
            f81699a = new String[]{"com.vivo.push.sdk.RegistrationReceiver", "com.vivo.push.sdk.service.PushService", "com.vivo.push.sdk.service.CommonJobService"};
            f81700b = new String[]{"android.permission.INTERNET", "android.permission.READ_PHONE_STATE", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WRITE_SETTINGS", "android.permission.VIBRATE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.ACCESS_WIFI_STATE", "android.permission.WAKE_LOCK", "android.permission.GET_ACCOUNTS", "com.bbk.account.permission.READ_ACCOUNTINFO", "android.permission.AUTHENTICATE_ACCOUNTS", "android.permission.MOUNT_UNMOUNT_FILESYSTEMS", "android.permission.GET_TASKS"};
            f81702d = new String[]{"com.vivo.push.sdk.service.CommandService", "com.vivo.push.sdk.service.CommonJobService"};
            f81703e = new String[]{"com.vivo.push.sdk.RegistrationReceiver"};
            f81704f = new String[]{"com.vivo.push.sdk.service.LinkProxyActivity"};
        } else if (b3 || c2) {
            if (b3) {
                f81702d = new String[]{"com.vivo.push.sdk.service.CommandClientService"};
                f81704f = new String[]{"com.vivo.push.sdk.LinkProxyClientActivity"};
            } else {
                f81702d = new String[]{"com.vivo.push.sdk.service.CommandService"};
                f81704f = new String[]{"com.vivo.push.sdk.service.LinkProxyActivity"};
            }
            f81703e = new String[0];
            f81699a = new String[0];
            if (c2) {
                f81700b = new String[]{"android.permission.INTERNET", "android.permission.WRITE_SETTINGS"};
            } else {
                f81700b = new String[]{"android.permission.INTERNET"};
            }
        } else {
            throw new VivoPushException("AndroidManifest.xml中receiver配置项错误，详见接入文档");
        }
        if (c2 || d2) {
            long a2 = a(context, context.getPackageName());
            long j = 270;
            if (context.getPackageName().equals(b2)) {
                j = 1270;
            }
            if (a2 == -1) {
                throw new VivoPushException("AndroidManifest.xml中未配置sdk_version");
            } else if (a2 != j) {
                throw new VivoPushException("AndroidManifest.xml中sdk_version配置项错误，请配置当前sdk_version版本为:".concat(String.valueOf(j)));
            }
        }
        g(context);
        f(context, b2);
        d(context, b2);
        e(context, b2);
        String packageName = context.getPackageName();
        Object b4 = b(context, packageName, "com.vivo.push.api_key");
        if (b4 != null) {
            str = b4.toString();
        } else {
            Object b5 = b(context, packageName, "api_key");
            if (b5 != null) {
                str = b5.toString();
            } else {
                str = "";
            }
        }
        if (TextUtils.isEmpty(str)) {
            throw new VivoPushException("com.vivo.push.api_key is null");
        } else if (TextUtils.isEmpty(b(context, context.getPackageName()))) {
            throw new VivoPushException("com.vivo.push.app_id is null");
        } else if ((c2 || d2) && a(context, context.getPackageName()) == -1) {
            throw new VivoPushException("sdkversion is null");
        } else if (d2) {
            a(context, "com.vivo.pushservice.action.METHOD", "com.vivo.push.sdk.RegistrationReceiver", true);
            a(context, "com.vivo.pushservice.action.PUSH_SERVICE", "com.vivo.push.sdk.service.PushService", false);
        }
    }

    public static boolean a(Context context) {
        if (f81701c != null) {
            return f81701c.booleanValue();
        }
        String b2 = r.b(context);
        if (context != null && context.getPackageName().equals(b2)) {
            Boolean bool = Boolean.TRUE;
            f81701c = bool;
            return bool.booleanValue();
        } else if (context == null) {
            o.d("Utility", "isPushProcess context is null");
            return false;
        } else {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            String str = null;
            if (activityManager != null) {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses != null && runningAppProcesses.size() != 0) {
                    Iterator<ActivityManager.RunningAppProcessInfo> it2 = runningAppProcesses.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        ActivityManager.RunningAppProcessInfo next = it2.next();
                        if (next.pid == myPid) {
                            str = next.processName;
                            break;
                        }
                    }
                }
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Boolean valueOf = Boolean.valueOf(str.contains(":pushservice"));
            f81701c = valueOf;
            return valueOf.booleanValue();
        }
    }

    public static Object a(String str, String str2) throws Exception {
        Class<?> cls = Class.forName(str);
        return cls.getField(str2).get(cls);
    }

    public static long a(Context context, String str) {
        Object b2 = b(context, str, "com.vivo.push.sdk_version");
        if (b2 == null) {
            b2 = b(context, str, "sdk_version");
        }
        if (b2 != null) {
            try {
                return Long.parseLong(b2.toString());
            } catch (Exception e2) {
                a.b(e2);
                o.a("Utility", "getSdkVersionCode error ", e2);
                return -1;
            }
        } else {
            o.a("Utility", "getSdkVersionCode sdk version is null");
            return -1;
        }
    }

    private static void a(ComponentInfo componentInfo, String str) throws VivoPushException {
        if (!componentInfo.applicationInfo.packageName.equals(str)) {
            String[] strArr = f81699a;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                if (!strArr[i].equals(componentInfo.name) || componentInfo.processName.contains(":pushservice")) {
                    i++;
                } else {
                    throw new VivoPushException("module : " + componentInfo.name + " process :" + componentInfo.processName + "  check process fail");
                }
            }
        }
    }

    public static String b(Context context, String str) {
        Object b2 = b(context, str, "com.vivo.push.app_id");
        if (b2 != null) {
            return b2.toString();
        }
        Object b3 = b(context, str, "app_id");
        if (b3 != null) {
            return b3.toString();
        }
        return "";
    }

    public static boolean c(Context context, String str) {
        if (context == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(SearchJediMixFeedAdapter.f42517f);
        if (installedApplications == null) {
            return false;
        }
        String packageName = context.getPackageName();
        for (ApplicationInfo next : installedApplications) {
            String str2 = next.packageName;
            if ((packageName.equals(str2) || str.equals(str2)) && (next.flags & 129) != 0) {
                o.d("Utility", " matching " + str2 + " is system app");
                return true;
            }
        }
        return false;
    }

    private static void e(Context context, String str) throws VivoPushException {
        try {
            if (context.getPackageManager() != null) {
                ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
                if (activityInfoArr != null) {
                    for (String a2 : f81704f) {
                        a(a2, (ComponentInfo[]) activityInfoArr, str);
                    }
                    return;
                }
                throw new VivoPushException("activityInfos is null");
            }
            throw new VivoPushException("localPackageManager is null");
        } catch (Exception e2) {
            throw new VivoPushException("error " + e2.getMessage());
        }
    }

    private static void f(Context context, String str) throws VivoPushException {
        try {
            if (context.getPackageManager() != null) {
                ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 2).receivers;
                if (activityInfoArr != null) {
                    for (String a2 : f81703e) {
                        a(a2, (ComponentInfo[]) activityInfoArr, str);
                    }
                    return;
                }
                throw new VivoPushException("receivers is null");
            }
            throw new VivoPushException("localPackageManager is null");
        } catch (Exception e2) {
            throw new VivoPushException(e2.getMessage());
        }
    }

    public static void a(Context context, Intent intent) {
        String b2 = r.b(context);
        String stringExtra = intent.getStringExtra("client_pkgname");
        if (TextUtils.isEmpty(b2)) {
            o.a("Utility", "illegality abe adapter : push pkg is null");
        } else if (TextUtils.isEmpty(stringExtra)) {
            o.a("Utility", "illegality abe adapter : src pkg is null");
        } else if (b2.equals(context.getPackageName())) {
            o.a("Utility", "illegality abe adapter : abe is not pushservice");
        } else if (!b2.equals(stringExtra)) {
            o.d("Utility", "proxy to core : intent pkg : " + intent.getPackage() + " ; src pkg : " + stringExtra + " ; push pkg : " + b2);
            intent.setPackage(b2);
            intent.setClassName(b2, "com.vivo.push.sdk.service.PushService");
            context.startService(intent);
        } else {
            o.a("Utility", "illegality abe adapter : pushPkg = " + b2 + " ; srcPkg = " + stringExtra);
        }
    }

    public static String b(String str, String str2) {
        String str3;
        try {
            str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class}).invoke(null, new Object[]{str});
        } catch (Exception e2) {
            a.b(e2);
            str3 = str2;
        }
        if (str3 == null || str3.length() == 0) {
            return str2;
        }
        return str3;
    }

    private static void d(Context context, String str) throws VivoPushException {
        try {
            if (context.getPackageManager() != null) {
                ServiceInfo[] serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4).services;
                if (serviceInfoArr != null) {
                    for (String a2 : f81702d) {
                        a(a2, (ComponentInfo[]) serviceInfoArr, str);
                    }
                    return;
                }
                throw new VivoPushException("serviceInfos is null");
            }
            throw new VivoPushException("localPackageManager is null");
        } catch (Exception e2) {
            throw new VivoPushException("error " + e2.getMessage());
        }
    }

    private static Object b(Context context, String str, String str2) {
        Bundle bundle;
        Object obj = null;
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, SearchJediMixFeedAdapter.f42517f);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            } else {
                bundle = null;
            }
            if (bundle != null) {
                obj = bundle.get(str2);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return obj;
    }

    private static void a(String str, ComponentInfo[] componentInfoArr, String str2) throws VivoPushException {
        int length = componentInfoArr.length;
        int i = 0;
        while (i < length) {
            ComponentInfo componentInfo = componentInfoArr[i];
            if (!str.equals(componentInfo.name)) {
                i++;
            } else if (componentInfo.enabled) {
                a(componentInfo, str2);
                return;
            } else {
                throw new VivoPushException(componentInfo.name + " module Push-SDK need is illegitmacy !");
            }
        }
        throw new VivoPushException(str + " module Push-SDK need is not exist");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0079 A[SYNTHETIC, Splitter:B:42:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0088 A[SYNTHETIC, Splitter:B:48:0x0088] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
        /*
            r0 = 0
            r1 = 0
            if (r8 != 0) goto L_0x0011
            java.lang.String r8 = "Utility"
            java.lang.String r9 = "context is null"
            com.vivo.push.util.o.a((java.lang.String) r8, (java.lang.String) r9)     // Catch:{ Exception -> 0x000f }
            return r0
        L_0x000c:
            r8 = move-exception
            goto L_0x0086
        L_0x000f:
            r8 = move-exception
            goto L_0x0070
        L_0x0011:
            android.content.ContentResolver r2 = r8.getContentResolver()     // Catch:{ Exception -> 0x000f }
            android.net.Uri r3 = com.vivo.push.z.f81715c     // Catch:{ Exception -> 0x000f }
            r4 = 0
            java.lang.String r5 = "appPkgName = ? and regId = ? "
            r8 = 2
            java.lang.String[] r6 = new java.lang.String[r8]     // Catch:{ Exception -> 0x000f }
            r6[r0] = r9     // Catch:{ Exception -> 0x000f }
            r8 = 1
            r6[r8] = r10     // Catch:{ Exception -> 0x000f }
            r7 = 0
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x000f }
            if (r8 != 0) goto L_0x0047
            java.lang.String r9 = "Utility"
            java.lang.String r10 = "cursor is null"
            com.vivo.push.util.o.a((java.lang.String) r9, (java.lang.String) r10)     // Catch:{ Exception -> 0x0043, all -> 0x003f }
            if (r8 == 0) goto L_0x003e
            r8.close()     // Catch:{ Exception -> 0x0036 }
            goto L_0x003e
        L_0x0036:
            r8 = move-exception
            java.lang.String r9 = "Utility"
            java.lang.String r10 = "close"
            com.vivo.push.util.o.a(r9, r10, r8)
        L_0x003e:
            return r0
        L_0x003f:
            r9 = move-exception
            r1 = r8
            r8 = r9
            goto L_0x0086
        L_0x0043:
            r9 = move-exception
            r1 = r8
            r8 = r9
            goto L_0x0070
        L_0x0047:
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0043, all -> 0x003f }
            if (r9 == 0) goto L_0x006a
            java.lang.String r9 = "clientState"
            int r9 = r8.getColumnIndex(r9)     // Catch:{ Exception -> 0x0043, all -> 0x003f }
            java.lang.String r9 = r8.getString(r9)     // Catch:{ Exception -> 0x0043, all -> 0x003f }
            boolean r9 = java.lang.Boolean.parseBoolean(r9)     // Catch:{ Exception -> 0x0043, all -> 0x003f }
            if (r8 == 0) goto L_0x0069
            r8.close()     // Catch:{ Exception -> 0x0061 }
            goto L_0x0069
        L_0x0061:
            r8 = move-exception
            java.lang.String r10 = "Utility"
            java.lang.String r0 = "close"
            com.vivo.push.util.o.a(r10, r0, r8)
        L_0x0069:
            return r9
        L_0x006a:
            if (r8 == 0) goto L_0x0085
            r8.close()     // Catch:{ Exception -> 0x007d }
            goto L_0x0085
        L_0x0070:
            java.lang.String r9 = "Utility"
            java.lang.String r10 = "isOverdue"
            com.vivo.push.util.o.a(r9, r10, r8)     // Catch:{ all -> 0x000c }
            if (r1 == 0) goto L_0x0085
            r1.close()     // Catch:{ Exception -> 0x007d }
            goto L_0x0085
        L_0x007d:
            r8 = move-exception
            java.lang.String r9 = "Utility"
            java.lang.String r10 = "close"
            com.vivo.push.util.o.a(r9, r10, r8)
        L_0x0085:
            return r0
        L_0x0086:
            if (r1 == 0) goto L_0x0094
            r1.close()     // Catch:{ Exception -> 0x008c }
            goto L_0x0094
        L_0x008c:
            r9 = move-exception
            java.lang.String r10 = "Utility"
            java.lang.String r0 = "close"
            com.vivo.push.util.o.a(r10, r0, r9)
        L_0x0094:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.y.a(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    private static void a(Context context, String str, String str2, boolean z) throws VivoPushException {
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                throw new VivoPushException("localPackageManager is null");
            } else if (z) {
                List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 576);
                if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                    throw new VivoPushException("checkModule " + intent + " has no receivers");
                }
                for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                    if (str2.equals(resolveInfo.activityInfo.name)) {
                        return;
                    }
                }
                throw new VivoPushException(str2 + " is missing");
            } else {
                List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 576);
                if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                    throw new VivoPushException("checkModule " + intent + " has no services");
                }
                for (ResolveInfo next : queryIntentServices) {
                    if (str2.equals(next.serviceInfo.name)) {
                        if (!next.serviceInfo.exported) {
                            throw new VivoPushException(next.serviceInfo.name + " exported is false");
                        }
                        return;
                    }
                }
                throw new VivoPushException(str2 + " is missing");
            }
        } catch (Exception e2) {
            o.a("Utility", "error  " + e2.getMessage());
            throw new VivoPushException("checkModule error" + e2.getMessage());
        }
    }
}
