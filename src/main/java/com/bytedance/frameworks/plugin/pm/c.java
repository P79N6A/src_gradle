package com.bytedance.frameworks.plugin.pm;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.frameworks.plugin.a.a;
import com.bytedance.frameworks.plugin.core.b;
import com.bytedance.frameworks.plugin.e;
import com.bytedance.frameworks.plugin.f.g;
import com.bytedance.frameworks.plugin.pm.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f2270a;

    /* renamed from: b  reason: collision with root package name */
    public static String f2271b;

    /* renamed from: c  reason: collision with root package name */
    private static a f2272c;

    @Deprecated
    public static void c() {
        try {
            f().d();
        } catch (Exception e2) {
            g.a("PluginPackageManager waitForReady fail.", (Throwable) e2);
        }
    }

    public static List<String> e() {
        try {
            return f().b();
        } catch (Exception e2) {
            g.a("PluginPackageManager getStandalonePackageNames fail.", (Throwable) e2);
            return Collections.emptyList();
        }
    }

    public static List<a> d() {
        try {
            return f().f();
        } catch (Exception e2) {
            g.a("PluginPackageManager getAllPluginBaseAttribute fail.", (Throwable) e2);
            return new ArrayList();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0024 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x003c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.frameworks.plugin.pm.a f() {
        /*
            boolean r0 = f2270a
            if (r0 != 0) goto L_0x0007
            r0 = 0
            f2272c = r0
        L_0x0007:
            com.bytedance.frameworks.plugin.pm.a r0 = f2272c
            if (r0 != 0) goto L_0x004a
            java.lang.Class<com.bytedance.frameworks.plugin.pm.c> r0 = com.bytedance.frameworks.plugin.pm.c.class
            monitor-enter(r0)
            r1 = 0
            r2 = 0
        L_0x0010:
            com.bytedance.frameworks.plugin.pm.a r3 = f2272c     // Catch:{ all -> 0x0047 }
            if (r3 != 0) goto L_0x0045
            if (r2 <= 0) goto L_0x003c
            r3 = 3
            if (r2 <= r3) goto L_0x001f
            java.lang.String r1 = "PluginPackageManager#connect host process failed !!!"
            com.bytedance.frameworks.plugin.f.g.c(r1)     // Catch:{ all -> 0x0047 }
            goto L_0x0045
        L_0x001f:
            r3 = 200(0xc8, double:9.9E-322)
            java.lang.Thread.sleep(r3)     // Catch:{ InterruptedException -> 0x0024 }
        L_0x0024:
            boolean r3 = com.bytedance.frameworks.plugin.f.g.a()     // Catch:{ all -> 0x0047 }
            if (r3 == 0) goto L_0x003c
            java.lang.String r3 = "PluginPackageManager#retry connect host process: %d"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0047 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0047 }
            r4[r1] = r5     // Catch:{ all -> 0x0047 }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x0047 }
            com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r3)     // Catch:{ all -> 0x0047 }
        L_0x003c:
            com.bytedance.frameworks.plugin.pm.a r3 = g()     // Catch:{ all -> 0x0047 }
            f2272c = r3     // Catch:{ all -> 0x0047 }
            int r2 = r2 + 1
            goto L_0x0010
        L_0x0045:
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            goto L_0x004a
        L_0x0047:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            throw r1
        L_0x004a:
            com.bytedance.frameworks.plugin.pm.a r0 = f2272c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.pm.c.f():com.bytedance.frameworks.plugin.pm.a");
    }

    private static a g() {
        if (TextUtils.isEmpty(f2271b)) {
            f2271b = String.format("content://%s.pm.PPMP/call", new Object[]{e.a().getPackageName()});
        }
        IBinder a2 = b.a(e.a(), Uri.parse(f2271b));
        if (a2 != null && a2.isBinderAlive()) {
            try {
                a2.linkToDeath(new IBinder.DeathRecipient() {
                    public final void binderDied() {
                        c.f2270a = false;
                    }
                }, 0);
                f2270a = true;
                if (a2 == null) {
                    return null;
                }
                IInterface queryLocalInterface = a2.queryLocalInterface("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                    return new a.C0172a.C0014a(a2);
                }
                return (a) queryLocalInterface;
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    @Deprecated
    public static boolean b() {
        try {
            return f().c();
        } catch (Exception e2) {
            g.a("PluginPackageManager isReady fail.", (Throwable) e2);
            return false;
        }
    }

    public static List<String> a() {
        try {
            return f().a();
        } catch (Exception e2) {
            g.a("PluginPackageManager getInstalledPackageNames fail.", (Throwable) e2);
            return null;
        }
    }

    public static void j(String str) {
        e(str);
    }

    @Deprecated
    public static void g(String str) {
        try {
            f().g(str);
        } catch (Exception e2) {
            g.a("PluginPackageManager activate fail.", (Throwable) e2);
        }
    }

    public static String h(String str) {
        try {
            return f().h(str);
        } catch (Exception e2) {
            g.a("PluginPackageManager generateContextPackageName fail.", (Throwable) e2);
            return str;
        }
    }

    public static int c(String str) {
        try {
            return f().c(str);
        } catch (Exception e2) {
            g.a("PluginPackageManager getInstalledPluginVersion fail.", (Throwable) e2);
            return -1;
        }
    }

    public static com.bytedance.frameworks.plugin.a.a f(String str) {
        try {
            return f().f(str);
        } catch (Exception e2) {
            g.a("PluginPackageManager getPluginBaseAttribute fail.", (Throwable) e2);
            return null;
        }
    }

    public static boolean i(String str) {
        try {
            return f().i(str);
        } catch (Exception e2) {
            g.a("PluginPackageManager isStandalone fail.", (Throwable) e2);
            return false;
        }
    }

    public static int k(String str) {
        try {
            return f().j(str);
        } catch (Exception e2) {
            g.a("PluginPackageManager getPluginStatus fail.", (Throwable) e2);
            return 0;
        }
    }

    public static com.bytedance.frameworks.plugin.a.b l(String str) {
        try {
            return f().k(str);
        } catch (Exception e2) {
            g.a("PluginPackageManager getPluginAttribute fail.", (Throwable) e2);
            return null;
        }
    }

    public static boolean e(String str) {
        try {
            return f().e(str);
        } catch (Exception e2) {
            g.a("PluginPackageManager tryLoad fail.", (Throwable) e2);
            return false;
        }
    }

    public static boolean b(String str) {
        try {
            return f().b(str);
        } catch (Exception e2) {
            g.a("PluginPackageManager checkPluginInstalled fail.", (Throwable) e2);
            return false;
        }
    }

    public static boolean d(String str) {
        try {
            return f().d(str);
        } catch (Exception e2) {
            g.a("PluginPackageManager shareResources fail.", (Throwable) e2);
            return false;
        }
    }

    public static boolean a(com.bytedance.frameworks.plugin.a.b bVar) {
        try {
            return f().a(bVar);
        } catch (Exception e2) {
            g.a("PluginPackageManager resolve fail.", (Throwable) e2);
            return false;
        }
    }

    public static boolean a(String str) {
        try {
            return f().a(str);
        } catch (Exception e2) {
            g.a("PluginPackageManager isPluginPackage fail.", (Throwable) e2);
            return false;
        }
    }

    public static ApplicationInfo b(String str, int i) {
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = f().c(str, i);
        } catch (Exception e2) {
            g.a("PluginPackageManager getApplicationInfo fail.", (Throwable) e2);
            applicationInfo = null;
        }
        if (applicationInfo != null || !a(str)) {
            return applicationInfo;
        }
        ApplicationInfo applicationInfo2 = new ApplicationInfo();
        applicationInfo2.packageName = str;
        return applicationInfo2;
    }

    public static int d(String str, int i) {
        try {
            return f().d(str, 0);
        } catch (Exception e2) {
            g.a("PluginPackageManager deletePackage fail.", (Throwable) e2);
            return 0;
        }
    }

    public static ActivityInfo a(ComponentName componentName, int i) {
        ActivityInfo activityInfo;
        try {
            activityInfo = f().a(componentName, i);
        } catch (Exception e2) {
            g.a("PluginPackageManager getActivityInfo fail.", (Throwable) e2);
            activityInfo = null;
        }
        if (activityInfo != null || !a(componentName.getPackageName())) {
            return activityInfo;
        }
        ActivityInfo activityInfo2 = new ActivityInfo();
        activityInfo2.packageName = componentName.getPackageName();
        return activityInfo2;
    }

    public static ActivityInfo b(ComponentName componentName, int i) {
        ActivityInfo activityInfo;
        try {
            activityInfo = f().b(componentName, i);
        } catch (Exception e2) {
            g.a("PluginPackageManager getReceiverInfo fail.", (Throwable) e2);
            activityInfo = null;
        }
        if (activityInfo != null || !a(componentName.getPackageName())) {
            return activityInfo;
        }
        ActivityInfo activityInfo2 = new ActivityInfo();
        activityInfo2.packageName = componentName.getPackageName();
        return activityInfo2;
    }

    public static ProviderInfo c(String str, int i) {
        try {
            return f().b(str, i);
        } catch (Exception e2) {
            g.a("PluginPackageManager resolveContentProvider fail.", (Throwable) e2);
            return null;
        }
    }

    public static ProviderInfo d(ComponentName componentName, int i) {
        ProviderInfo providerInfo;
        try {
            providerInfo = f().d(componentName, i);
        } catch (Exception e2) {
            g.a("PluginPackageManager getProviderInfo fail.", (Throwable) e2);
            providerInfo = null;
        }
        if (providerInfo != null || !a(componentName.getPackageName())) {
            return providerInfo;
        }
        ProviderInfo providerInfo2 = new ProviderInfo();
        providerInfo2.packageName = componentName.getPackageName();
        return providerInfo2;
    }

    public static List<com.bytedance.frameworks.plugin.component.broadcast.c> e(String str, int i) {
        try {
            return f().e(str, 0);
        } catch (Exception e2) {
            g.a("PluginPackageManager getReceivers fail.", (Throwable) e2);
            return Collections.emptyList();
        }
    }

    public static PackageInfo a(String str, int i) {
        PackageInfo packageInfo;
        try {
            packageInfo = f().a(str, i);
        } catch (Exception e2) {
            g.a("PluginPackageManager getPackageInfo fail.", (Throwable) e2);
            packageInfo = null;
        }
        if (packageInfo != null || !a(str)) {
            return packageInfo;
        }
        PackageInfo packageInfo2 = new PackageInfo();
        packageInfo2.packageName = str;
        return packageInfo2;
    }

    public static List<ResolveInfo> b(Intent intent, int i) {
        try {
            return f().b(intent, intent.resolveTypeIfNeeded(e.a().getContentResolver()), i);
        } catch (Exception e2) {
            g.a("PluginPackageManager queryIntentActivities fail.", (Throwable) e2);
            return null;
        }
    }

    public static ResolveInfo c(Intent intent, int i) {
        try {
            return f().d(intent, intent.resolveTypeIfNeeded(e.a().getContentResolver()), i);
        } catch (Exception e2) {
            g.a("PluginPackageManager resolveService fail.", (Throwable) e2);
            return null;
        }
    }

    public static ResolveInfo a(Intent intent, int i) {
        try {
            return f().a(intent, intent.resolveTypeIfNeeded(e.a().getContentResolver()), i);
        } catch (Exception e2) {
            g.a("PluginPackageManager resolveIntent fail.", (Throwable) e2);
            return null;
        }
    }

    public static ServiceInfo c(ComponentName componentName, int i) {
        ServiceInfo serviceInfo;
        try {
            serviceInfo = f().c(componentName, i);
        } catch (Exception e2) {
            g.a("PluginPackageManager getServiceInfo fail.", (Throwable) e2);
            serviceInfo = null;
        }
        if (serviceInfo != null || !a(componentName.getPackageName())) {
            return serviceInfo;
        }
        ServiceInfo serviceInfo2 = new ServiceInfo();
        serviceInfo2.packageName = componentName.getPackageName();
        return serviceInfo2;
    }

    public static List<ResolveInfo> d(Intent intent, int i) {
        try {
            return f().e(intent, intent.resolveTypeIfNeeded(e.a().getContentResolver()), i);
        } catch (Exception e2) {
            g.a("PluginPackageManager queryIntentServices fail.", (Throwable) e2);
            return null;
        }
    }

    public static int a(String str, boolean z, int i) {
        try {
            return f().a(str, true, 0);
        } catch (Exception e2) {
            g.a("PluginPackageManager installPackage fail.", (Throwable) e2);
            return 0;
        }
    }

    public static List<ProviderInfo> a(String str, String str2, int i) {
        try {
            return f().a(str, str2, 0);
        } catch (Exception e2) {
            g.a("PluginPackageManager getProviders fail.", (Throwable) e2);
            return null;
        }
    }
}
