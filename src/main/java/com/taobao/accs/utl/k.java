package com.taobao.accs.utl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.q.c;
import com.taobao.accs.d.a;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f79107a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    private static int f79108b = -1;

    @Deprecated
    public static void a() {
        try {
            Class<?> loadClass = a.a().b().loadClass("com.taobao.accs.client.AccsConfig");
            loadClass.getMethod("build", new Class[0]).invoke(loadClass, new Object[0]);
        } catch (Throwable th) {
            ALog.e("Utils", "initConfig", th, new Object[0]);
        }
    }

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        if (f79108b == -1) {
            f79108b = context.getApplicationInfo().targetSdkVersion;
        }
        if (f79108b < 26 || Build.VERSION.SDK_INT < 26) {
            return false;
        }
        return true;
    }

    public static void f(Context context) {
        try {
            SharedPreferences.Editor edit = c.a(context, "AGOO_BIND", 0).edit();
            edit.clear();
            edit.apply();
        } catch (Exception e2) {
            ALog.e("Utils", "clearAgooBindCache", e2, new Object[0]);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: int} */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(android.content.Context r4) {
        /*
            r0 = 0
            byte[] r1 = f79107a     // Catch:{ Throwable -> 0x001a }
            monitor-enter(r1)     // Catch:{ Throwable -> 0x001a }
            java.lang.String r2 = "ACCS_SDK"
            android.content.SharedPreferences r4 = com.ss.android.ugc.aweme.q.c.a(r4, r2, r0)     // Catch:{ all -> 0x0012 }
            java.lang.String r2 = "debug_mode"
            int r4 = r4.getInt(r2, r0)     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            goto L_0x0025
        L_0x0012:
            r2 = move-exception
            r4 = 0
        L_0x0014:
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            throw r2     // Catch:{ Throwable -> 0x0016 }
        L_0x0016:
            r1 = move-exception
            goto L_0x001c
        L_0x0018:
            r2 = move-exception
            goto L_0x0014
        L_0x001a:
            r1 = move-exception
            r4 = 0
        L_0x001c:
            java.lang.String r2 = "Utils"
            java.lang.String r3 = "getMode"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.taobao.accs.utl.ALog.e(r2, r3, r1, r0)
        L_0x0025:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.utl.k.b(android.content.Context):int");
    }

    public static void c(Context context) {
        try {
            synchronized (f79107a) {
                SharedPreferences.Editor edit = c.a(context, "ACCS_SDK", 0).edit();
                edit.clear();
                edit.apply();
            }
        } catch (Throwable th) {
            ALog.e("Utils", "clearAllSharePreferences", th, new Object[0]);
        }
    }

    public static void d(Context context) {
        try {
            Class<?> loadClass = a.a().b().loadClass("com.taobao.accs.utl.UtilityImpl");
            loadClass.getMethod("killService", new Class[]{Context.class}).invoke(loadClass, new Object[]{context});
        } catch (Throwable th) {
            ALog.e("Utils", "killService", th, new Object[0]);
        }
    }

    public static Bundle g(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            return null;
        } catch (Throwable th) {
            ALog.e("Utils", "getMetaInfo", th, new Object[0]);
            return null;
        }
    }

    public static boolean e(Context context) {
        boolean z;
        try {
            Class<?> loadClass = a.a().b().loadClass("com.taobao.accs.utl.UtilityImpl");
            z = ((Boolean) loadClass.getMethod("isMainProcess", new Class[]{Context.class}).invoke(loadClass, new Object[]{context})).booleanValue();
        } catch (Throwable th) {
            ALog.e("Utils", "killservice", th, new Object[0]);
            z = true;
        }
        ALog.i("Utils", "isMainProcess", "result", Boolean.valueOf(z));
        return z;
    }

    public static void a(Context context, int i) {
        try {
            synchronized (f79107a) {
                SharedPreferences.Editor edit = c.a(context, "ACCS_SDK", 0).edit();
                edit.putInt("debug_mode", i);
                edit.apply();
            }
        } catch (Throwable th) {
            ALog.e("Utils", "setMode", th, new Object[0]);
        }
    }

    public static void a(Context context, String str) {
        try {
            Class<?> loadClass = a.a().b().loadClass("org.android.agoo.common.Config");
            loadClass.getMethod("setAgooAppKey", new Class[]{Context.class, String.class}).invoke(loadClass, new Object[]{context, str});
        } catch (Throwable th) {
            ALog.e("Utils", "setAgooAppkey", th, new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        com.taobao.accs.utl.ALog.i("Utils", "getSpValue", "value", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (android.text.TextUtils.isEmpty(r4) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        com.taobao.accs.utl.ALog.e("Utils", "getSpValue use default!", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        com.taobao.accs.utl.ALog.e("Utils", "getSpValue fail", r5, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 0
            r1 = 0
            byte[] r2 = f79107a     // Catch:{ Throwable -> 0x003a }
            monitor-enter(r2)     // Catch:{ Throwable -> 0x003a }
            java.lang.String r3 = "ACCS_SDK"
            android.content.SharedPreferences r4 = com.ss.android.ugc.aweme.q.c.a(r4, r3, r1)     // Catch:{ all -> 0x0037 }
            java.lang.String r4 = r4.getString(r5, r0)     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            java.lang.String r5 = "Utils"
            java.lang.String r0 = "getSpValue"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x0032 }
            java.lang.String r3 = "value"
            r2[r1] = r3     // Catch:{ Throwable -> 0x0032 }
            r3 = 1
            r2[r3] = r4     // Catch:{ Throwable -> 0x0032 }
            com.taobao.accs.utl.ALog.i(r5, r0, r2)     // Catch:{ Throwable -> 0x0032 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x0032 }
            if (r5 == 0) goto L_0x0045
            java.lang.String r5 = "Utils"
            java.lang.String r0 = "getSpValue use default!"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x0032 }
            com.taobao.accs.utl.ALog.e(r5, r0, r2)     // Catch:{ Throwable -> 0x0032 }
            r4 = r6
            goto L_0x0045
        L_0x0032:
            r5 = move-exception
            goto L_0x003c
        L_0x0034:
            r5 = move-exception
            r0 = r4
            goto L_0x0038
        L_0x0037:
            r5 = move-exception
        L_0x0038:
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            throw r5     // Catch:{ Throwable -> 0x003a }
        L_0x003a:
            r5 = move-exception
            r4 = r0
        L_0x003c:
            java.lang.String r6 = "Utils"
            java.lang.String r0 = "getSpValue fail"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.taobao.accs.utl.ALog.e(r6, r0, r5, r1)
        L_0x0045:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.utl.k.b(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    public static void a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            ALog.e("Utils", "setSpValue null", new Object[0]);
            return;
        }
        try {
            synchronized (f79107a) {
                SharedPreferences.Editor edit = c.a(context, "ACCS_SDK", 0).edit();
                edit.putString(str, str2);
                edit.apply();
            }
            ALog.i("Utils", "setSpValue", "key", str, "value", str2);
        } catch (Exception e2) {
            ALog.e("Utils", "setSpValue fail", e2, new Object[0]);
        }
    }
}
