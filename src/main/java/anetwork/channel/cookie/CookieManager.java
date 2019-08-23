package anetwork.channel.cookie;

import android.content.Context;
import android.os.Build;
import android.webkit.CookieSyncManager;
import anet.channel.util.ALog;
import anetwork.channel.http.NetworkSdkSetting;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;
import java.util.Map;

public class CookieManager {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f1508a = false;

    /* renamed from: b  reason: collision with root package name */
    private static android.webkit.CookieManager f1509b = null;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f1510c = true;

    private static boolean a() {
        if (!f1508a && NetworkSdkSetting.getContext() != null) {
            setup(NetworkSdkSetting.getContext());
        }
        return f1508a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String getCookie(java.lang.String r6) {
        /*
            java.lang.Class<anetwork.channel.cookie.CookieManager> r0 = anetwork.channel.cookie.CookieManager.class
            monitor-enter(r0)
            boolean r1 = a()     // Catch:{ all -> 0x0032 }
            r2 = 0
            if (r1 == 0) goto L_0x0030
            boolean r1 = f1510c     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x000f
            goto L_0x0030
        L_0x000f:
            android.webkit.CookieManager r1 = f1509b     // Catch:{ Throwable -> 0x0016 }
            java.lang.String r1 = r1.getCookie(r6)     // Catch:{ Throwable -> 0x0016 }
            goto L_0x002e
        L_0x0016:
            r1 = move-exception
            java.lang.String r3 = "anet.CookieManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0032 }
            java.lang.String r5 = "get cookie failed. url="
            r4.<init>(r5)     // Catch:{ all -> 0x0032 }
            r4.append(r6)     // Catch:{ all -> 0x0032 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0032 }
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0032 }
            anet.channel.util.ALog.e(r3, r6, r2, r1, r4)     // Catch:{ all -> 0x0032 }
            r1 = r2
        L_0x002e:
            monitor-exit(r0)
            return r1
        L_0x0030:
            monitor-exit(r0)
            return r2
        L_0x0032:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.cookie.CookieManager.getCookie(java.lang.String):java.lang.String");
    }

    public static synchronized void setup(Context context) {
        synchronized (CookieManager.class) {
            if (!f1508a) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (Build.VERSION.SDK_INT < 21) {
                        CookieSyncManager.createInstance(context);
                    }
                    android.webkit.CookieManager instance = android.webkit.CookieManager.getInstance();
                    f1509b = instance;
                    instance.setAcceptCookie(true);
                    if (Build.VERSION.SDK_INT < 21) {
                        f1509b.removeExpiredCookie();
                    }
                    ALog.e("anet.CookieManager", "CookieManager setup. cost:" + (System.currentTimeMillis() - currentTimeMillis), null, new Object[0]);
                } catch (Throwable th) {
                    f1510c = false;
                    ALog.e("anet.CookieManager", "Cookie Manager setup failed!!!", null, th, new Object[0]);
                }
                f1508a = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void setCookie(java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.Class<anetwork.channel.cookie.CookieManager> r0 = anetwork.channel.cookie.CookieManager.class
            monitor-enter(r0)
            boolean r1 = a()     // Catch:{ all -> 0x004c }
            if (r1 == 0) goto L_0x004a
            boolean r1 = f1510c     // Catch:{ all -> 0x004c }
            if (r1 != 0) goto L_0x000e
            goto L_0x004a
        L_0x000e:
            android.webkit.CookieManager r1 = f1509b     // Catch:{ Throwable -> 0x0028 }
            r1.setCookie(r5, r6)     // Catch:{ Throwable -> 0x0028 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0028 }
            r2 = 21
            if (r1 >= r2) goto L_0x0021
            android.webkit.CookieSyncManager r1 = android.webkit.CookieSyncManager.getInstance()     // Catch:{ Throwable -> 0x0028 }
            r1.sync()     // Catch:{ Throwable -> 0x0028 }
            goto L_0x0048
        L_0x0021:
            android.webkit.CookieManager r1 = f1509b     // Catch:{ Throwable -> 0x0028 }
            r1.flush()     // Catch:{ Throwable -> 0x0028 }
            monitor-exit(r0)
            return
        L_0x0028:
            r1 = move-exception
            java.lang.String r2 = "anet.CookieManager"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            java.lang.String r4 = "set cookie failed. url="
            r3.<init>(r4)     // Catch:{ all -> 0x004c }
            r3.append(r5)     // Catch:{ all -> 0x004c }
            java.lang.String r5 = " cookies="
            r3.append(r5)     // Catch:{ all -> 0x004c }
            r3.append(r6)     // Catch:{ all -> 0x004c }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x004c }
            r6 = 0
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x004c }
            anet.channel.util.ALog.e(r2, r5, r6, r1, r3)     // Catch:{ all -> 0x004c }
        L_0x0048:
            monitor-exit(r0)
            return
        L_0x004a:
            monitor-exit(r0)
            return
        L_0x004c:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.cookie.CookieManager.setCookie(java.lang.String, java.lang.String):void");
    }

    public static void setCookie(String str, Map<String, List<String>> map) {
        if (str != null && map != null) {
            try {
                for (Map.Entry next : map.entrySet()) {
                    String str2 = (String) next.getKey();
                    if (str2 != null && (str2.equalsIgnoreCase("Set-Cookie") || str2.equalsIgnoreCase("Set-Cookie2"))) {
                        for (String cookie : (List) next.getValue()) {
                            setCookie(str, cookie);
                        }
                    }
                }
            } catch (Exception e2) {
                ALog.e("anet.CookieManager", "set cookie failed", null, e2, PushConstants.WEB_URL, str, "\nheaders", map);
            }
        }
    }
}
