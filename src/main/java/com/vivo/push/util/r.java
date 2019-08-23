package com.vivo.push.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.google.a.a.a.a.a.a;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.vivo.push.cache.e;
import com.vivo.push.model.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class r {
    public static Set<String> c(Context context) {
        List<ResolveInfo> list;
        List<ResolveInfo> list2;
        HashSet hashSet = new HashSet();
        try {
            list = context.getPackageManager().queryBroadcastReceivers(new Intent("com.vivo.pushservice.action.RECEIVE"), 576);
        } catch (Exception unused) {
            list = null;
        }
        try {
            list2 = context.getPackageManager().queryBroadcastReceivers(new Intent("com.vivo.pushclient.action.RECEIVE"), 576);
        } catch (Exception unused2) {
            list2 = null;
        }
        if (list != null && list.size() > 0) {
            if (list2 != null && list2.size() > 0) {
                list.addAll(list2);
            }
            list2 = list;
        }
        if (list2 != null && list2.size() > 0) {
            for (ResolveInfo next : list2) {
                if (next != null) {
                    String str = next.activityInfo.packageName;
                    if (!TextUtils.isEmpty(str)) {
                        hashSet.add(str);
                    }
                }
            }
        }
        return hashSet;
    }

    private static b d(Context context) {
        String b2 = b(context);
        ApplicationInfo applicationInfo = null;
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        b bVar = new b(b2);
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(b2, SearchJediMixFeedAdapter.f42517f);
            if (packageInfo != null) {
                bVar.a(packageInfo.versionCode);
                bVar.a(packageInfo.versionName);
                applicationInfo = packageInfo.applicationInfo;
            }
            if (applicationInfo != null) {
                bVar.a(y.a(context, b2));
            }
            bVar.a(a(context, bVar.b()));
            bVar.b(a(context, b2));
            return bVar;
        } catch (PackageManager.NameNotFoundException e2) {
            a.b(e2);
            o.d("PushPackageUtils", "PackageManager NameNotFoundException is null");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e1 A[SYNTHETIC, Splitter:B:62:0x00e1] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e8 A[SYNTHETIC, Splitter:B:67:0x00e8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(android.content.Context r8) {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x00d4, all -> 0x00cf }
            android.net.Uri r2 = com.vivo.push.z.f81713a     // Catch:{ Exception -> 0x00d4, all -> 0x00cf }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00d4, all -> 0x00cf }
            if (r8 != 0) goto L_0x002d
            java.lang.String r1 = "PushPackageUtils"
            java.lang.String r2 = "cursor is null"
            com.vivo.push.util.o.a((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0027 }
            if (r8 == 0) goto L_0x0026
            r8.close()     // Catch:{ Exception -> 0x001e }
            goto L_0x0026
        L_0x001e:
            r8 = move-exception
            java.lang.String r1 = "PushPackageUtils"
            java.lang.String r2 = "close"
            com.vivo.push.util.o.a(r1, r2, r8)
        L_0x0026:
            return r0
        L_0x0027:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
            goto L_0x00d8
        L_0x002d:
            r1 = 0
            r1 = r0
            r2 = 0
        L_0x0030:
            boolean r3 = r8.moveToNext()     // Catch:{ Exception -> 0x00cd }
            if (r3 == 0) goto L_0x0098
            java.lang.String r3 = "pushPkgName"
            java.lang.String r4 = "name"
            int r4 = r8.getColumnIndex(r4)     // Catch:{ Exception -> 0x00cd }
            java.lang.String r4 = r8.getString(r4)     // Catch:{ Exception -> 0x00cd }
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x00cd }
            if (r3 == 0) goto L_0x0068
            java.lang.String r3 = "value"
            int r3 = r8.getColumnIndex(r3)     // Catch:{ Exception -> 0x00cd }
            java.lang.String r3 = r8.getString(r3)     // Catch:{ Exception -> 0x00cd }
            java.lang.String r1 = "PushPackageUtils"
            java.lang.String r4 = "get system app is "
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = r4.concat(r5)     // Catch:{ Exception -> 0x0063 }
            com.vivo.push.util.o.d(r1, r4)     // Catch:{ Exception -> 0x0063 }
            r1 = r3
            goto L_0x0030
        L_0x0063:
            r1 = move-exception
            r0 = r1
            r1 = r3
            goto L_0x00d8
        L_0x0068:
            java.lang.String r3 = "pushEnable"
            java.lang.String r4 = "name"
            int r4 = r8.getColumnIndex(r4)     // Catch:{ Exception -> 0x00cd }
            java.lang.String r4 = r8.getString(r4)     // Catch:{ Exception -> 0x00cd }
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x00cd }
            if (r3 == 0) goto L_0x0030
            java.lang.String r2 = "value"
            int r2 = r8.getColumnIndex(r2)     // Catch:{ Exception -> 0x00cd }
            java.lang.String r2 = r8.getString(r2)     // Catch:{ Exception -> 0x00cd }
            boolean r2 = java.lang.Boolean.parseBoolean(r2)     // Catch:{ Exception -> 0x00cd }
            java.lang.String r3 = "PushPackageUtils"
            java.lang.String r4 = "get system app isSystemOpen is "
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x00cd }
            java.lang.String r4 = r4.concat(r5)     // Catch:{ Exception -> 0x00cd }
            com.vivo.push.util.o.d(r3, r4)     // Catch:{ Exception -> 0x00cd }
            goto L_0x0030
        L_0x0098:
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x00cd }
            if (r3 == 0) goto L_0x00ad
            if (r8 == 0) goto L_0x00ac
            r8.close()     // Catch:{ Exception -> 0x00a4 }
            goto L_0x00ac
        L_0x00a4:
            r8 = move-exception
            java.lang.String r1 = "PushPackageUtils"
            java.lang.String r2 = "close"
            com.vivo.push.util.o.a(r1, r2, r8)
        L_0x00ac:
            return r0
        L_0x00ad:
            if (r2 != 0) goto L_0x00be
            if (r8 == 0) goto L_0x00bd
            r8.close()     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00bd
        L_0x00b5:
            r8 = move-exception
            java.lang.String r1 = "PushPackageUtils"
            java.lang.String r2 = "close"
            com.vivo.push.util.o.a(r1, r2, r8)
        L_0x00bd:
            return r0
        L_0x00be:
            if (r8 == 0) goto L_0x00e4
            r8.close()     // Catch:{ Exception -> 0x00c4 }
            goto L_0x00e4
        L_0x00c4:
            r8 = move-exception
            java.lang.String r0 = "PushPackageUtils"
            java.lang.String r2 = "close"
            com.vivo.push.util.o.a(r0, r2, r8)
            goto L_0x00e4
        L_0x00cd:
            r0 = move-exception
            goto L_0x00d8
        L_0x00cf:
            r8 = move-exception
            r7 = r0
            r0 = r8
            r8 = r7
            goto L_0x00e6
        L_0x00d4:
            r1 = move-exception
            r8 = r0
            r0 = r1
            r1 = r8
        L_0x00d8:
            java.lang.String r2 = "PushPackageUtils"
            java.lang.String r3 = "getSystemPush"
            com.vivo.push.util.o.a(r2, r3, r0)     // Catch:{ all -> 0x00e5 }
            if (r8 == 0) goto L_0x00e4
            r8.close()     // Catch:{ Exception -> 0x00c4 }
        L_0x00e4:
            return r1
        L_0x00e5:
            r0 = move-exception
        L_0x00e6:
            if (r8 == 0) goto L_0x00f4
            r8.close()     // Catch:{ Exception -> 0x00ec }
            goto L_0x00f4
        L_0x00ec:
            r8 = move-exception
            java.lang.String r1 = "PushPackageUtils"
            java.lang.String r2 = "close"
            com.vivo.push.util.o.a(r1, r2, r8)
        L_0x00f4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.r.b(android.content.Context):java.lang.String");
    }

    private static List<String> e(Context context) {
        List<ResolveInfo> list;
        g.a("findAllCoreClientPush");
        ArrayList arrayList = new ArrayList();
        try {
            list = context.getPackageManager().queryIntentServices(new Intent("com.vivo.pushservice.action.PUSH_SERVICE"), 576);
        } catch (Exception unused) {
            list = null;
        }
        if (list != null && list.size() > 0) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ResolveInfo resolveInfo = list.get(i);
                if (resolveInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    if (!TextUtils.isEmpty(str)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        if (arrayList.size() <= 0) {
            o.d("PushPackageUtils", "get all push packages is null");
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0061, code lost:
        if (r0.d() != false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.vivo.push.model.b a(android.content.Context r13) {
        /*
            android.content.Context r13 = r13.getApplicationContext()
            com.vivo.push.model.b r0 = d(r13)
            if (r0 == 0) goto L_0x001a
            java.lang.String r13 = "PushPackageUtils"
            java.lang.String r1 = "get system push info :"
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r1 = r1.concat(r2)
            com.vivo.push.util.o.d(r13, r1)
            return r0
        L_0x001a:
            java.util.List r1 = e(r13)
            java.lang.String r2 = r13.getPackageName()
            com.vivo.push.model.b r2 = e(r13, r2)
            int r3 = r1.size()
            if (r3 > 0) goto L_0x003e
            if (r2 == 0) goto L_0x0035
            boolean r1 = r2.d()
            if (r1 == 0) goto L_0x0035
            r0 = r2
        L_0x0035:
            java.lang.String r1 = "PushPackageUtils"
            java.lang.String r2 = "findAllPushPackages error: find no package!"
            com.vivo.push.util.o.a((java.lang.String) r1, (java.lang.String) r2)
            goto L_0x010e
        L_0x003e:
            com.vivo.push.util.x r0 = com.vivo.push.util.x.b(r13)
            java.lang.String r3 = "com.vivo.push.cur_pkg"
            r4 = 0
            java.lang.String r0 = r0.a(r3, r4)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0064
            java.lang.String r3 = "com.vivo.pushservice.action.METHOD"
            boolean r3 = a(r13, r0, r3)
            if (r3 == 0) goto L_0x0064
            com.vivo.push.model.b r0 = e(r13, r0)
            if (r0 == 0) goto L_0x0064
            boolean r3 = r0.d()
            if (r3 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r0 = r4
        L_0x0065:
            if (r2 == 0) goto L_0x006e
            boolean r3 = r2.d()
            if (r3 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r2 = r4
        L_0x006f:
            if (r0 == 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r0 = r4
        L_0x0073:
            if (r2 == 0) goto L_0x00a3
            if (r0 == 0) goto L_0x00a2
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x0090
            boolean r3 = r0.c()
            if (r3 == 0) goto L_0x00a3
            long r5 = r2.b()
            long r7 = r0.b()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a3
            goto L_0x00a2
        L_0x0090:
            boolean r3 = r0.c()
            if (r3 != 0) goto L_0x00a2
            long r5 = r2.b()
            long r7 = r0.b()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a3
        L_0x00a2:
            r0 = r2
        L_0x00a3:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            if (r0 == 0) goto L_0x00b5
            boolean r3 = r0.c()
            if (r3 == 0) goto L_0x00b1
            goto L_0x00b6
        L_0x00b1:
            r12 = r4
            r4 = r0
            r0 = r12
            goto L_0x00b6
        L_0x00b5:
            r0 = r4
        L_0x00b6:
            int r3 = r1.size()
            r5 = 0
            r12 = r4
            r4 = r0
            r0 = r12
        L_0x00be:
            if (r5 >= r3) goto L_0x0103
            java.lang.Object r6 = r1.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x0100
            com.vivo.push.model.b r7 = e(r13, r6)
            if (r7 == 0) goto L_0x0100
            r2.put(r6, r7)
            boolean r6 = r7.d()
            if (r6 == 0) goto L_0x0100
            boolean r6 = r7.c()
            if (r6 == 0) goto L_0x00f1
            if (r4 == 0) goto L_0x00ef
            long r8 = r7.b()
            long r10 = r4.b()
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 <= 0) goto L_0x0100
        L_0x00ef:
            r4 = r7
            goto L_0x0100
        L_0x00f1:
            if (r0 == 0) goto L_0x00ff
            long r8 = r7.b()
            long r10 = r0.b()
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 <= 0) goto L_0x0100
        L_0x00ff:
            r0 = r7
        L_0x0100:
            int r5 = r5 + 1
            goto L_0x00be
        L_0x0103:
            if (r0 == 0) goto L_0x0106
            goto L_0x010e
        L_0x0106:
            java.lang.String r0 = "PushPackageUtils"
            java.lang.String r1 = "findSuitablePushPackage, all push app in balck list."
            com.vivo.push.util.o.d(r0, r1)
            r0 = r4
        L_0x010e:
            if (r0 == 0) goto L_0x0164
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x013d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "查找最优包为:"
            r1.<init>(r2)
            java.lang.String r2 = r0.a()
            r1.append(r2)
            java.lang.String r2 = "("
            r1.append(r2)
            long r2 = r0.b()
            r1.append(r2)
            java.lang.String r2 = ", Black)"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.vivo.push.util.o.a((android.content.Context) r13, (java.lang.String) r1)
            goto L_0x0169
        L_0x013d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "查找最优包为:"
            r1.<init>(r2)
            java.lang.String r2 = r0.a()
            r1.append(r2)
            java.lang.String r2 = "("
            r1.append(r2)
            long r2 = r0.b()
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.vivo.push.util.o.a((android.content.Context) r13, (java.lang.String) r1)
            goto L_0x0169
        L_0x0164:
            java.lang.String r1 = "查找最优包为空!"
            com.vivo.push.util.o.b((android.content.Context) r13, (java.lang.String) r1)
        L_0x0169:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.r.a(android.content.Context):com.vivo.push.model.b");
    }

    public static boolean b(Context context, String str) {
        return a(context, str, "com.vivo.pushclient.action.RECEIVE");
    }

    public static boolean c(Context context, String str) {
        return a(context, str, "com.vivo.pushservice.action.RECEIVE");
    }

    public static boolean d(Context context, String str) {
        return a(context, str, "com.vivo.pushservice.action.METHOD");
    }

    private static boolean a(Context context, long j) {
        e a2 = com.vivo.push.cache.b.a().a(context);
        if (a2 != null) {
            return a2.isInBlackList(j);
        }
        return false;
    }

    public static boolean a(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null) {
            return false;
        }
        Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
        intent.setPackage(str);
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 576);
        if (queryIntentServices == null || queryIntentServices.size() <= 0) {
            o.a("PushPackageUtils", "isEnablePush error: can not find push service.");
            return false;
        }
        int size = queryIntentServices.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ResolveInfo resolveInfo = queryIntentServices.get(i);
            if (!(resolveInfo == null || resolveInfo.serviceInfo == null)) {
                String str2 = resolveInfo.serviceInfo.name;
                boolean z2 = resolveInfo.serviceInfo.exported;
                if ("com.vivo.push.sdk.service.PushService".equals(str2) && z2) {
                    boolean z3 = resolveInfo.serviceInfo.enabled;
                    int componentEnabledSetting = packageManager.getComponentEnabledSetting(new ComponentName(str, "com.vivo.push.sdk.service.PushService"));
                    boolean z4 = true;
                    if (componentEnabledSetting != 1 && (componentEnabledSetting != 0 || !z3)) {
                        z4 = false;
                    }
                    z = z4;
                }
            }
        }
        return z;
    }

    private static b e(Context context, String str) {
        boolean z;
        ApplicationInfo applicationInfo = null;
        if (!TextUtils.isEmpty(str)) {
            if (a(context, str, "com.vivo.pushservice.action.METHOD") || a(context, str, "com.vivo.pushservice.action.RECEIVE")) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                b bVar = new b(str);
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, SearchJediMixFeedAdapter.f42517f);
                    if (packageInfo != null) {
                        bVar.a(packageInfo.versionCode);
                        bVar.a(packageInfo.versionName);
                        applicationInfo = packageInfo.applicationInfo;
                    }
                    if (applicationInfo != null) {
                        bVar.a(y.a(context, str));
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    o.a("PushPackageUtils", "getPushPackageInfo exception: ", e2);
                }
                bVar.b(a(context, str));
                bVar.a(a(context, bVar.b()));
                return bVar;
            }
        }
        return null;
    }

    private static boolean a(Context context, String str, String str2) {
        List<ResolveInfo> list;
        Intent intent = new Intent(str2);
        intent.setPackage(str);
        try {
            list = context.getPackageManager().queryBroadcastReceivers(intent, 576);
        } catch (Exception unused) {
            list = null;
        }
        if (list == null || list.size() <= 0) {
            return false;
        }
        return true;
    }
}
