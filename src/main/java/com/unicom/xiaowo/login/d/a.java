package com.unicom.xiaowo.login.d;

import android.net.ConnectivityManager;
import java.util.concurrent.ExecutorService;

public class a {

    /* renamed from: e  reason: collision with root package name */
    private static volatile a f81448e;

    /* renamed from: a  reason: collision with root package name */
    public ConnectivityManager.NetworkCallback f81449a;

    /* renamed from: b  reason: collision with root package name */
    public ConnectivityManager f81450b;

    /* renamed from: c  reason: collision with root package name */
    public volatile e f81451c;

    /* renamed from: d  reason: collision with root package name */
    public ExecutorService f81452d;

    public static a a() {
        if (f81448e == null) {
            synchronized (a.class) {
                if (f81448e == null) {
                    f81448e = new a();
                }
            }
        }
        return f81448e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024 A[Catch:{ Exception -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f A[Catch:{ Exception -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0036 }
            r1 = 21
            r2 = 0
            if (r0 < r1) goto L_0x001b
            android.net.ConnectivityManager r0 = r3.f81450b     // Catch:{ Exception -> 0x0036 }
            if (r0 == 0) goto L_0x0020
            android.net.ConnectivityManager$NetworkCallback r0 = r3.f81449a     // Catch:{ Exception -> 0x0036 }
            if (r0 == 0) goto L_0x0018
            android.net.ConnectivityManager r0 = r3.f81450b     // Catch:{ Exception -> 0x0036 }
            android.net.ConnectivityManager$NetworkCallback r1 = r3.f81449a     // Catch:{ Exception -> 0x0036 }
            r0.unregisterNetworkCallback(r1)     // Catch:{ Exception -> 0x0036 }
            r3.f81449a = r2     // Catch:{ Exception -> 0x0036 }
        L_0x0018:
            r3.f81450b = r2     // Catch:{ Exception -> 0x0036 }
            goto L_0x0020
        L_0x001b:
            android.net.ConnectivityManager r0 = r3.f81450b     // Catch:{ Exception -> 0x0036 }
            if (r0 == 0) goto L_0x0020
            goto L_0x0018
        L_0x0020:
            com.unicom.xiaowo.login.d.e r0 = r3.f81451c     // Catch:{ Exception -> 0x0036 }
            if (r0 == 0) goto L_0x002b
            com.unicom.xiaowo.login.d.e r0 = r3.f81451c     // Catch:{ Exception -> 0x0036 }
            r0.cancel()     // Catch:{ Exception -> 0x0036 }
            r3.f81451c = r2     // Catch:{ Exception -> 0x0036 }
        L_0x002b:
            java.util.concurrent.ExecutorService r0 = r3.f81452d     // Catch:{ Exception -> 0x0036 }
            if (r0 == 0) goto L_0x0036
            java.util.concurrent.ExecutorService r0 = r3.f81452d     // Catch:{ Exception -> 0x0036 }
            r0.shutdownNow()     // Catch:{ Exception -> 0x0036 }
            r3.f81452d = r2     // Catch:{ Exception -> 0x0036 }
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unicom.xiaowo.login.d.a.b():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:34|(3:36|37|(2:39|40)(0))|41|42|43) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x009c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.content.Context r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 0
            java.lang.String r1 = "connectivity"
            java.lang.Object r7 = r7.getSystemService(r1)     // Catch:{ Exception -> 0x00a4 }
            android.net.ConnectivityManager r7 = (android.net.ConnectivityManager) r7     // Catch:{ Exception -> 0x00a4 }
            r6.f81450b = r7     // Catch:{ Exception -> 0x00a4 }
            android.net.ConnectivityManager r7 = r6.f81450b     // Catch:{ Exception -> 0x00a4 }
            if (r7 != 0) goto L_0x0010
            return r0
        L_0x0010:
            android.net.ConnectivityManager r7 = r6.f81450b     // Catch:{ Exception -> 0x00a4 }
            r1 = 5
            android.net.NetworkInfo r7 = r7.getNetworkInfo(r1)     // Catch:{ Exception -> 0x00a4 }
            android.net.NetworkInfo$State r7 = r7.getState()     // Catch:{ Exception -> 0x00a4 }
            android.net.NetworkInfo$State r2 = android.net.NetworkInfo.State.CONNECTED     // Catch:{ Exception -> 0x00a4 }
            int r2 = r7.compareTo(r2)     // Catch:{ Exception -> 0x00a4 }
            r3 = 1
            if (r2 == 0) goto L_0x00a3
            android.net.NetworkInfo$State r2 = android.net.NetworkInfo.State.CONNECTING     // Catch:{ Exception -> 0x00a4 }
            int r7 = r7.compareTo(r2)     // Catch:{ Exception -> 0x00a4 }
            if (r7 != 0) goto L_0x002e
            goto L_0x00a3
        L_0x002e:
            android.net.ConnectivityManager r7 = r6.f81450b     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r2 = "enableHIPRI"
            int r7 = r7.startUsingNetworkFeature(r0, r2)     // Catch:{ Exception -> 0x00a4 }
            r2 = -1
            if (r2 != r7) goto L_0x003a
            return r0
        L_0x003a:
            if (r7 != 0) goto L_0x003d
            return r3
        L_0x003d:
            java.lang.String r7 = "://"
            int r7 = r8.indexOf(r7)     // Catch:{ Exception -> 0x00a4 }
            r3 = 3
            if (r7 <= 0) goto L_0x004c
            int r7 = r7 + r3
            java.lang.String r7 = r8.substring(r7)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x004d
        L_0x004c:
            r7 = r8
        L_0x004d:
            r4 = 58
            int r4 = r7.indexOf(r4)     // Catch:{ Exception -> 0x00a4 }
            if (r4 < 0) goto L_0x0059
            java.lang.String r7 = r7.substring(r0, r4)     // Catch:{ Exception -> 0x00a4 }
        L_0x0059:
            r4 = 47
            int r4 = r7.indexOf(r4)     // Catch:{ Exception -> 0x00a4 }
            if (r4 < 0) goto L_0x0065
            java.lang.String r7 = r7.substring(r0, r4)     // Catch:{ Exception -> 0x00a4 }
        L_0x0065:
            r4 = 63
            int r4 = r7.indexOf(r4)     // Catch:{ Exception -> 0x00a4 }
            if (r4 < 0) goto L_0x0071
            java.lang.String r7 = r7.substring(r0, r4)     // Catch:{ Exception -> 0x00a4 }
        L_0x0071:
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x00a4 }
            if (r4 == 0) goto L_0x0078
            r7 = r8
        L_0x0078:
            int r7 = com.unicom.xiaowo.login.d.i.b(r7)     // Catch:{ Exception -> 0x00a4 }
            if (r2 != r7) goto L_0x007f
            return r0
        L_0x007f:
            r8 = 0
        L_0x0080:
            if (r8 >= r3) goto L_0x009c
            android.net.ConnectivityManager r2 = r6.f81450b     // Catch:{ InterruptedException -> 0x009c }
            android.net.NetworkInfo r2 = r2.getNetworkInfo(r1)     // Catch:{ InterruptedException -> 0x009c }
            android.net.NetworkInfo$State r2 = r2.getState()     // Catch:{ InterruptedException -> 0x009c }
            android.net.NetworkInfo$State r4 = android.net.NetworkInfo.State.CONNECTED     // Catch:{ InterruptedException -> 0x009c }
            int r2 = r2.compareTo(r4)     // Catch:{ InterruptedException -> 0x009c }
            if (r2 == 0) goto L_0x009c
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r4)     // Catch:{ InterruptedException -> 0x009c }
            int r8 = r8 + 1
            goto L_0x0080
        L_0x009c:
            android.net.ConnectivityManager r8 = r6.f81450b     // Catch:{ Exception -> 0x00a4 }
            boolean r7 = r8.requestRouteToHost(r1, r7)     // Catch:{ Exception -> 0x00a4 }
            return r7
        L_0x00a3:
            return r3
        L_0x00a4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unicom.xiaowo.login.d.a.a(android.content.Context, java.lang.String):boolean");
    }
}
