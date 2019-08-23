package com.ss.android.ugc.aweme.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public class bi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75616a;

    /* renamed from: b  reason: collision with root package name */
    private static final List<Intent> f75617b = new ArrayList();

    public static void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f75616a, true, 88288, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, null, f75616a, true, 88288, new Class[]{Context.class}, Void.TYPE);
        } else if (context != null) {
            b(context);
            if (!c(context) && !d(context)) {
                e(context);
            }
        }
    }

    private static boolean d(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f75616a, true, 88290, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f75616a, true, 88290, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + context.getPackageName()));
            intent.addFlags(268435456);
            context2.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean e(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f75616a, true, 88291, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f75616a, true, 88291, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            Intent intent = new Intent("android.settings.APPLICATION_SETTINGS");
            intent.addFlags(268435456);
            context2.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static void b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f75616a, true, 88287, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, null, f75616a, true, 88287, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (f75617b.size() == 0) {
            String packageName = context.getPackageName();
            Intent component = new Intent().setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionManagerActivity"));
            component.putExtra("pkg_name", packageName);
            component.putExtra("app_name", context.getResources().getString(context.getApplicationInfo().labelRes));
            component.putExtra("class_name", bi.class.getName());
            f75617b.add(component);
            Intent component2 = new Intent().setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionAppAllPermissionActivity"));
            component2.putExtra("packageName", packageName);
            f75617b.add(component2);
            Intent component3 = new Intent().setComponent(new ComponentName("com.google.android.packageinstaller", "com.android.packageinstaller.permission.ui.ManagePermissionsActivity"));
            component3.putExtra("android.intent.extra.PACKAGE_NAME", packageName);
            f75617b.add(component3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x01ad A[Catch:{ Exception -> 0x01b1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean c(android.content.Context r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f75616a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = 0
            r5 = 1
            r6 = 88289(0x158e1, float:1.23719E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f75616a
            r13 = 1
            r14 = 88289(0x158e1, float:1.23719E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003b:
            java.lang.String r2 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r2 = r2.toLowerCase()     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r3 = "oppo"
            boolean r3 = android.text.TextUtils.equals(r2, r3)     // Catch:{ Exception -> 0x01b1 }
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r5 = 0
            if (r3 == 0) goto L_0x00a5
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01b1 }
            r6 = 23
            if (r3 > r6) goto L_0x00a5
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x01b1 }
            r10[r9] = r0     // Catch:{ Exception -> 0x01b1 }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f75616a     // Catch:{ Exception -> 0x01b1 }
            r13 = 1
            r14 = 88292(0x158e4, float:1.23723E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x01b1 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r15[r9] = r2     // Catch:{ Exception -> 0x01b1 }
            java.lang.Class<android.content.Intent> r16 = android.content.Intent.class
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x01b1 }
            if (r2 == 0) goto L_0x0087
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x01b1 }
            r10[r9] = r0     // Catch:{ Exception -> 0x01b1 }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f75616a     // Catch:{ Exception -> 0x01b1 }
            r13 = 1
            r14 = 88292(0x158e4, float:1.23723E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x01b1 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r15[r9] = r2     // Catch:{ Exception -> 0x01b1 }
            java.lang.Class<android.content.Intent> r16 = android.content.Intent.class
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x01b1 }
            android.content.Intent r2 = (android.content.Intent) r2     // Catch:{ Exception -> 0x01b1 }
        L_0x0084:
            r5 = r2
            goto L_0x01ab
        L_0x0087:
            java.util.List<android.content.Intent> r2 = f75617b     // Catch:{ Exception -> 0x01b1 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x01b1 }
        L_0x008d:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x01b1 }
            if (r3 == 0) goto L_0x01ab
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x01b1 }
            android.content.Intent r3 = (android.content.Intent) r3     // Catch:{ Exception -> 0x01b1 }
            boolean r6 = a(r0, r3)     // Catch:{ Exception -> 0x01b1 }
            if (r6 == 0) goto L_0x008d
            r3.addFlags(r4)     // Catch:{ Exception -> 0x01b1 }
            r5 = r3
            goto L_0x01ab
        L_0x00a5:
            java.lang.String r3 = "huawei"
            boolean r3 = android.text.TextUtils.equals(r2, r3)     // Catch:{ Exception -> 0x01b1 }
            if (r3 == 0) goto L_0x00fe
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x01b1 }
            r10[r9] = r0     // Catch:{ Exception -> 0x01b1 }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f75616a     // Catch:{ Exception -> 0x01b1 }
            r13 = 1
            r14 = 88294(0x158e6, float:1.23726E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x01b1 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r15[r9] = r2     // Catch:{ Exception -> 0x01b1 }
            java.lang.Class<android.content.Intent> r16 = android.content.Intent.class
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x01b1 }
            if (r2 == 0) goto L_0x00e0
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x01b1 }
            r10[r9] = r0     // Catch:{ Exception -> 0x01b1 }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f75616a     // Catch:{ Exception -> 0x01b1 }
            r13 = 1
            r14 = 88294(0x158e6, float:1.23726E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x01b1 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r15[r9] = r2     // Catch:{ Exception -> 0x01b1 }
            java.lang.Class<android.content.Intent> r16 = android.content.Intent.class
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x01b1 }
            android.content.Intent r2 = (android.content.Intent) r2     // Catch:{ Exception -> 0x01b1 }
            goto L_0x0084
        L_0x00e0:
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x01b1 }
            r2.<init>()     // Catch:{ Exception -> 0x01b1 }
            r2.setFlags(r4)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r3 = "packageName"
            java.lang.String r4 = r17.getPackageName()     // Catch:{ Exception -> 0x01b1 }
            r2.putExtra(r3, r4)     // Catch:{ Exception -> 0x01b1 }
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r4 = "com.huawei.systemmanager"
            java.lang.String r5 = "com.huawei.permissionmanager.ui.MainActivity"
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x01b1 }
            r2.setComponent(r3)     // Catch:{ Exception -> 0x01b1 }
            goto L_0x0084
        L_0x00fe:
            java.lang.String r3 = "xiaomi"
            boolean r3 = android.text.TextUtils.equals(r2, r3)     // Catch:{ Exception -> 0x01b1 }
            if (r3 == 0) goto L_0x0158
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x01b1 }
            r10[r9] = r0     // Catch:{ Exception -> 0x01b1 }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f75616a     // Catch:{ Exception -> 0x01b1 }
            r13 = 1
            r14 = 88295(0x158e7, float:1.23728E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x01b1 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r15[r9] = r2     // Catch:{ Exception -> 0x01b1 }
            java.lang.Class<android.content.Intent> r16 = android.content.Intent.class
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x01b1 }
            if (r2 == 0) goto L_0x013a
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x01b1 }
            r10[r9] = r0     // Catch:{ Exception -> 0x01b1 }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f75616a     // Catch:{ Exception -> 0x01b1 }
            r13 = 1
            r14 = 88295(0x158e7, float:1.23728E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x01b1 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r15[r9] = r2     // Catch:{ Exception -> 0x01b1 }
            java.lang.Class<android.content.Intent> r16 = android.content.Intent.class
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x01b1 }
            android.content.Intent r2 = (android.content.Intent) r2     // Catch:{ Exception -> 0x01b1 }
            goto L_0x0084
        L_0x013a:
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r3 = "miui.intent.action.APP_PERM_EDITOR"
            r2.<init>(r3)     // Catch:{ Exception -> 0x01b1 }
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r4 = "com.miui.securitycenter"
            java.lang.String r5 = "com.miui.permcenter.permissions.PermissionsEditorActivity"
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x01b1 }
            r2.setComponent(r3)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r3 = "extra_pkgname"
            java.lang.String r4 = r17.getPackageName()     // Catch:{ Exception -> 0x01b1 }
            r2.putExtra(r3, r4)     // Catch:{ Exception -> 0x01b1 }
            goto L_0x0084
        L_0x0158:
            java.lang.String r3 = "meizu"
            boolean r2 = android.text.TextUtils.equals(r2, r3)     // Catch:{ Exception -> 0x01b1 }
            if (r2 == 0) goto L_0x01ab
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x01b1 }
            r10[r9] = r0     // Catch:{ Exception -> 0x01b1 }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f75616a     // Catch:{ Exception -> 0x01b1 }
            r13 = 1
            r14 = 88293(0x158e5, float:1.23725E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x01b1 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r15[r9] = r2     // Catch:{ Exception -> 0x01b1 }
            java.lang.Class<android.content.Intent> r16 = android.content.Intent.class
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x01b1 }
            if (r2 == 0) goto L_0x0194
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x01b1 }
            r10[r9] = r0     // Catch:{ Exception -> 0x01b1 }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f75616a     // Catch:{ Exception -> 0x01b1 }
            r13 = 1
            r14 = 88293(0x158e5, float:1.23725E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x01b1 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r15[r9] = r2     // Catch:{ Exception -> 0x01b1 }
            java.lang.Class<android.content.Intent> r16 = android.content.Intent.class
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x01b1 }
            android.content.Intent r2 = (android.content.Intent) r2     // Catch:{ Exception -> 0x01b1 }
            goto L_0x0084
        L_0x0194:
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r3 = "com.meizu.safe.security.SHOW_APPSEC"
            r2.<init>(r3)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r3 = "android.intent.category.DEFAULT"
            r2.addCategory(r3)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r3 = "packageName"
            java.lang.String r4 = r17.getPackageName()     // Catch:{ Exception -> 0x01b1 }
            r2.putExtra(r3, r4)     // Catch:{ Exception -> 0x01b1 }
            goto L_0x0084
        L_0x01ab:
            if (r5 == 0) goto L_0x01b1
            r0.startActivity(r5)     // Catch:{ Exception -> 0x01b1 }
            return r1
        L_0x01b1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.bi.c(android.content.Context):boolean");
    }

    private static boolean a(Context context, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{context, intent2}, null, f75616a, true, 88296, new Class[]{Context.class, Intent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, intent2}, null, f75616a, true, 88296, new Class[]{Context.class, Intent.class}, Boolean.TYPE)).booleanValue();
        } else if (context == null || intent2 == null) {
            return false;
        } else {
            try {
                ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent2, 1);
                if (resolveActivity == null || resolveActivity.activityInfo == null) {
                    return false;
                }
                return resolveActivity.activityInfo.exported;
            } catch (Exception unused) {
                return false;
            }
        }
    }
}
