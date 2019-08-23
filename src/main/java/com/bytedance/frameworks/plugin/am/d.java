package com.bytedance.frameworks.plugin.am;

import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.frameworks.plugin.am.c;
import com.bytedance.frameworks.plugin.core.b;
import com.bytedance.frameworks.plugin.e;
import com.bytedance.frameworks.plugin.f.g;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f2152a;

    /* renamed from: b  reason: collision with root package name */
    public static String f2153b;

    /* renamed from: c  reason: collision with root package name */
    private static c f2154c;

    private static c b() {
        if (TextUtils.isEmpty(f2153b)) {
            f2153b = String.format("content://%s.am.PAMP/call", new Object[]{e.a().getPackageName()});
        }
        IBinder a2 = b.a(e.a(), Uri.parse(f2153b));
        if (a2 != null && a2.isBinderAlive()) {
            try {
                a2.linkToDeath(new IBinder.DeathRecipient() {
                    public final void binderDied() {
                        d.f2152a = false;
                    }
                }, 0);
                f2152a = true;
                if (a2 == null) {
                    return null;
                }
                IInterface queryLocalInterface = a2.queryLocalInterface("com.bytedance.frameworks.plugin.am.IPluginActivityManager");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof c)) {
                    return new c.a.C0012a(a2);
                }
                return (c) queryLocalInterface;
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0024 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x003c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.frameworks.plugin.am.c a() {
        /*
            boolean r0 = f2152a
            if (r0 != 0) goto L_0x0007
            r0 = 0
            f2154c = r0
        L_0x0007:
            com.bytedance.frameworks.plugin.am.c r0 = f2154c
            if (r0 != 0) goto L_0x004a
            java.lang.Class<com.bytedance.frameworks.plugin.am.c> r0 = com.bytedance.frameworks.plugin.am.c.class
            monitor-enter(r0)
            r1 = 0
            r2 = 0
        L_0x0010:
            com.bytedance.frameworks.plugin.am.c r3 = f2154c     // Catch:{ all -> 0x0047 }
            if (r3 != 0) goto L_0x0045
            if (r2 <= 0) goto L_0x003c
            r3 = 3
            if (r2 <= r3) goto L_0x001f
            java.lang.String r1 = "PluginActivityManager#connect host process failed !!!"
            com.bytedance.frameworks.plugin.f.g.c(r1)     // Catch:{ all -> 0x0047 }
            goto L_0x0045
        L_0x001f:
            r3 = 200(0xc8, double:9.9E-322)
            java.lang.Thread.sleep(r3)     // Catch:{ InterruptedException -> 0x0024 }
        L_0x0024:
            boolean r3 = com.bytedance.frameworks.plugin.f.g.a()     // Catch:{ all -> 0x0047 }
            if (r3 == 0) goto L_0x003c
            java.lang.String r3 = "PluginActivityManager#retry connect host process: %d"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0047 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0047 }
            r4[r1] = r5     // Catch:{ all -> 0x0047 }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x0047 }
            com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r3)     // Catch:{ all -> 0x0047 }
        L_0x003c:
            com.bytedance.frameworks.plugin.am.c r3 = b()     // Catch:{ all -> 0x0047 }
            f2154c = r3     // Catch:{ all -> 0x0047 }
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
            com.bytedance.frameworks.plugin.am.c r0 = f2154c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.am.d.a():com.bytedance.frameworks.plugin.am.c");
    }

    public static ActivityInfo a(ActivityInfo activityInfo) {
        try {
            return a().a(activityInfo);
        } catch (Exception e2) {
            g.a("PluginActivityManager selectStubActivity fail.", (Throwable) e2);
            return null;
        }
    }

    public static boolean b(ServiceInfo serviceInfo) {
        try {
            return a().b(serviceInfo);
        } catch (Exception e2) {
            g.a("PluginActivityManager isStubService fail.", (Throwable) e2);
            return false;
        }
    }

    public static ServiceInfo c(ServiceInfo serviceInfo) {
        try {
            return a().c(serviceInfo);
        } catch (Exception e2) {
            g.a("PluginActivityManager getTargetService fail.", (Throwable) e2);
            return null;
        }
    }

    public static ProviderInfo a(ProviderInfo providerInfo) {
        try {
            return a().a(providerInfo);
        } catch (Exception e2) {
            g.a("PluginActivityManager selectStubProvider fail.", (Throwable) e2);
            return null;
        }
    }

    public static ServiceInfo a(ServiceInfo serviceInfo) {
        try {
            return a().a(serviceInfo);
        } catch (Exception e2) {
            g.a("PluginActivityManager selectStubService fail.", (Throwable) e2);
            return null;
        }
    }
}
