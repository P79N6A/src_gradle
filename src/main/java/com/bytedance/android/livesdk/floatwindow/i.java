package com.bytedance.android.livesdk.floatwindow;

import android.app.AppOpsManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.RequiresApi;
import com.bytedance.android.live.core.utils.ah;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14577a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f14578b = i.class.getCanonicalName();

    private i() {
    }

    private static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f14577a, true, 9099, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f14577a, true, 9099, new Class[0], String.class);
        }
        return TTLiveSDKContext.getHostService().a().e();
    }

    private static String b() {
        if (PatchProxy.isSupport(new Object[0], null, f14577a, true, 9106, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f14577a, true, 9106, new Class[0], String.class);
        }
        return ah.a("ro.miui.ui.version.name");
    }

    private static void i(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f14577a, true, 9109, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, null, f14577a, true, 9109, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        j(context);
    }

    private static void k(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f14577a, true, 9112, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f14577a, true, 9112, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a("com.coloros.safecenter", context2);
    }

    private static void l(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f14577a, true, 9113, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f14577a, true, 9113, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a("com.yulong.android.security:remote", context2);
    }

    private static void m(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f14577a, true, 9114, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f14577a, true, 9114, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a("com.bairenkeji.icaller", context2);
    }

    public static boolean a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f14577a, true, 9100, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f14577a, true, 9100, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (Build.VERSION.SDK_INT >= 23) {
            return Settings.canDrawOverlays(context);
        } else {
            return c(context);
        }
    }

    private static void d(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f14577a, true, 9103, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f14577a, true, 9103, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        try {
            Intent intent = new Intent(a());
            intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$AccessLockSummaryActivity"));
            if (a(context2, intent)) {
                context2.startActivity(intent);
            } else {
                j(context);
            }
        } catch (Exception unused) {
            j(context);
        }
    }

    private static void e(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f14577a, true, 9104, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f14577a, true, 9104, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        try {
            Intent intent = new Intent(a());
            intent.setComponent(new ComponentName("com.sonymobile.cta", "com.sonymobile.cta.SomcCTAMainActivity"));
            if (a(context2, intent)) {
                context2.startActivity(intent);
            } else {
                j(context);
            }
        } catch (Exception unused) {
            j(context);
        }
    }

    private static void f(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f14577a, true, 9105, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f14577a, true, 9105, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        try {
            Intent intent = new Intent(a());
            intent.setFlags(268435456);
            intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
            if (a(context2, intent)) {
                context2.startActivity(intent);
            } else {
                j(context);
            }
        } catch (Exception unused) {
            j(context);
        }
    }

    private static void h(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f14577a, true, 9108, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f14577a, true, 9108, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        try {
            Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.putExtra("packageName", a());
            if (a(context2, intent)) {
                context2.startActivity(intent);
            } else {
                j(context);
            }
        } catch (ActivityNotFoundException unused) {
            j(context);
        }
    }

    private static void j(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f14577a, true, 9110, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f14577a, true, 9110, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        try {
            if (a(context2, intent)) {
                context2.startActivity(intent);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005f, code lost:
        if (r2.equals("vivo") != false) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(android.content.Context r17) {
        /*
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r17
            com.meituan.robust.ChangeQuickRedirect r4 = f14577a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 9102(0x238e, float:1.2755E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0030
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f14577a
            r13 = 1
            r14 = 9102(0x238e, float:1.2755E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0030:
            java.lang.String r2 = android.os.Build.MANUFACTURER
            r3 = -1
            int r4 = r2.hashCode()
            switch(r4) {
                case -1678088054: goto L_0x008b;
                case -1675632421: goto L_0x0081;
                case 2427: goto L_0x0076;
                case 2432928: goto L_0x006c;
                case 2582855: goto L_0x0062;
                case 3620012: goto L_0x0059;
                case 74224812: goto L_0x004f;
                case 1864941562: goto L_0x0045;
                case 2141820391: goto L_0x003b;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0095
        L_0x003b:
            java.lang.String r1 = "HUAWEI"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0095
            r1 = 0
            goto L_0x0096
        L_0x0045:
            java.lang.String r1 = "samsung"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0095
            r1 = 6
            goto L_0x0096
        L_0x004f:
            java.lang.String r1 = "Meizu"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0095
            r1 = 4
            goto L_0x0096
        L_0x0059:
            java.lang.String r4 = "vivo"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0095
            goto L_0x0096
        L_0x0062:
            java.lang.String r1 = "Sony"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0095
            r1 = 7
            goto L_0x0096
        L_0x006c:
            java.lang.String r1 = "OPPO"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0095
            r1 = 2
            goto L_0x0096
        L_0x0076:
            java.lang.String r1 = "LG"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0095
            r1 = 8
            goto L_0x0096
        L_0x0081:
            java.lang.String r1 = "Xiaomi"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0095
            r1 = 5
            goto L_0x0096
        L_0x008b:
            java.lang.String r1 = "Coolpad"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0095
            r1 = 3
            goto L_0x0096
        L_0x0095:
            r1 = -1
        L_0x0096:
            switch(r1) {
                case 0: goto L_0x00bd;
                case 1: goto L_0x00b9;
                case 2: goto L_0x00b5;
                case 3: goto L_0x00b1;
                case 4: goto L_0x00ad;
                case 5: goto L_0x00a9;
                case 6: goto L_0x00a5;
                case 7: goto L_0x00a1;
                case 8: goto L_0x009d;
                default: goto L_0x0099;
            }
        L_0x0099:
            j(r17)
            return
        L_0x009d:
            d(r17)
            return
        L_0x00a1:
            e(r17)
            return
        L_0x00a5:
            i(r17)
            return
        L_0x00a9:
            g(r17)
            return
        L_0x00ad:
            h(r17)
            return
        L_0x00b1:
            l(r17)
            return
        L_0x00b5:
            k(r17)
            return
        L_0x00b9:
            m(r17)
            return
        L_0x00bd:
            f(r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.floatwindow.i.b(android.content.Context):void");
    }

    @RequiresApi(api = 19)
    private static boolean c(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f14577a, true, 9101, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f14577a, true, 9101, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            if (((Integer) AppOpsManager.class.getMethod("checkOp", new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke((AppOpsManager) context2.getSystemService("appops"), new Object[]{24, Integer.valueOf(Binder.getCallingUid()), context.getApplicationContext().getPackageName()})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static void g(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f14577a, true, 9107, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f14577a, true, 9107, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        String b2 = b();
        Intent intent = new Intent();
        if ("V6".equals(b2) || "V7".equals(b2)) {
            intent.setAction("miui.intent.action.APP_PERM_EDITOR");
            intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
            intent.putExtra("extra_pkgname", a());
        } else if ("V8".equals(b2) || "V9".equals(b2) || "V10".equals(b2)) {
            intent.setAction("miui.intent.action.APP_PERM_EDITOR");
            intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
            intent.putExtra("extra_pkgname", a());
        } else {
            j(context);
            return;
        }
        if (a(context2, intent)) {
            context2.startActivity(intent);
        }
    }

    private static void a(String str, Context context) {
        PackageInfo packageInfo;
        String str2 = str;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{str2, context2}, null, f14577a, true, 9116, new Class[]{String.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, context2}, null, f14577a, true, 9116, new Class[]{String.class, Context.class}, Void.TYPE);
            return;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str2, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo == null) {
            j(context);
            return;
        }
        Intent intent = new Intent("android.intent.action.MAIN", null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(packageInfo.packageName);
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        for (int i = 0; i < queryIntentActivities.size(); i++) {
        }
        try {
            ResolveInfo next = queryIntentActivities.iterator().next();
            if (next != null) {
                String str3 = next.activityInfo.packageName;
                String str4 = next.activityInfo.name;
                Intent intent2 = new Intent("android.intent.action.MAIN");
                intent2.addCategory("android.intent.category.LAUNCHER");
                intent2.setComponent(new ComponentName(str3, str4));
                context2.startActivity(intent2);
            }
        } catch (Exception unused2) {
            j(context);
        }
    }

    private static boolean a(Context context, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{context, intent2}, null, f14577a, true, 9111, new Class[]{Context.class, Intent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, intent2}, null, f14577a, true, 9111, new Class[]{Context.class, Intent.class}, Boolean.TYPE)).booleanValue();
        }
        if (context != null) {
            try {
                if (context.getPackageManager().resolveActivity(intent2, 0) != null) {
                    return true;
                }
                return false;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
