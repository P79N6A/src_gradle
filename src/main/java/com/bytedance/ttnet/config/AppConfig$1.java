package com.bytedance.ttnet.config;

import com.bytedance.ttnet.hostmonitor.HostMonitorBroadcastReceiver;

class AppConfig$1 extends HostMonitorBroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f22575a;

    AppConfig$1(a aVar) {
        this.f22575a = aVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|(8:12|13|14|(2:16|(1:20))|21|(1:23)|24|(1:26)))|27|28|(1:30)(1:31)|(1:33)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0062 */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0068 A[Catch:{ Throwable -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0069 A[Catch:{ Throwable -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006c A[Catch:{ Throwable -> 0x0072 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.ttnet.hostmonitor.e r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L_0x0003
            return
        L_0x0003:
            com.bytedance.ttnet.config.a r0 = r8.f22575a     // Catch:{ Throwable -> 0x0072 }
            android.content.Context r0 = r0.f22580e     // Catch:{ Throwable -> 0x0072 }
            boolean r0 = com.bytedance.frameworks.baselib.network.http.util.g.a(r0)     // Catch:{ Throwable -> 0x0072 }
            if (r0 != 0) goto L_0x000e
            return
        L_0x000e:
            super.a((com.bytedance.ttnet.hostmonitor.e) r9)     // Catch:{ Throwable -> 0x0072 }
            boolean r0 = r9.f22648d     // Catch:{ Throwable -> 0x0072 }
            if (r0 == 0) goto L_0x0071
            com.bytedance.ttnet.config.a r0 = r8.f22575a     // Catch:{ Throwable -> 0x0072 }
            com.bytedance.ttnet.config.c r0 = r0.i     // Catch:{ Throwable -> 0x0072 }
            r1 = 1
            if (r0 == 0) goto L_0x0062
            com.bytedance.ttnet.config.a r0 = r8.f22575a     // Catch:{ Throwable -> 0x0072 }
            com.bytedance.ttnet.config.c r0 = r0.i     // Catch:{ Throwable -> 0x0072 }
            com.bytedance.ttnet.config.a r2 = r8.f22575a     // Catch:{ Throwable -> 0x0072 }
            android.content.Context r2 = r2.f22580e     // Catch:{ Throwable -> 0x0072 }
            if (r2 == 0) goto L_0x0062
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0072 }
            int r3 = com.bytedance.ttnet.config.c.d(r2)     // Catch:{ Throwable -> 0x0062 }
            if (r3 != r1) goto L_0x0043
            java.lang.String r4 = com.bytedance.ttnet.config.c.e(r2)     // Catch:{ Throwable -> 0x0062 }
            if (r4 == 0) goto L_0x0043
            java.lang.String r5 = r0.i     // Catch:{ Throwable -> 0x0062 }
            boolean r4 = r4.equals(r5)     // Catch:{ Throwable -> 0x0062 }
            if (r4 != 0) goto L_0x0043
            java.lang.String r3 = "onConnectivityChange"
            r0.a((android.content.Context) r2, (java.lang.String) r3)     // Catch:{ Throwable -> 0x0062 }
            goto L_0x0062
        L_0x0043:
            int r4 = r0.j     // Catch:{ Throwable -> 0x0062 }
            if (r4 == r3) goto L_0x004c
            java.lang.String r3 = "onConnectivityChange"
            r0.a((android.content.Context) r2, (java.lang.String) r3)     // Catch:{ Throwable -> 0x0062 }
        L_0x004c:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0062 }
            long r5 = r0.f22602d     // Catch:{ Throwable -> 0x0062 }
            r7 = 0
            long r3 = r3 - r5
            int r5 = r0.f22599a     // Catch:{ Throwable -> 0x0062 }
            int r5 = r5 * 1000
            long r5 = (long) r5     // Catch:{ Throwable -> 0x0062 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0062
            java.lang.String r3 = "onConnectivityChange"
            r0.a((android.content.Context) r2, (java.lang.String) r3)     // Catch:{ Throwable -> 0x0062 }
        L_0x0062:
            com.bytedance.ttnet.hostmonitor.a r0 = r9.f22649e     // Catch:{ Throwable -> 0x0072 }
            com.bytedance.ttnet.hostmonitor.a r9 = r9.f22650f     // Catch:{ Throwable -> 0x0072 }
            if (r0 == r9) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r1 = 0
        L_0x006a:
            if (r1 == 0) goto L_0x0071
            com.bytedance.ttnet.config.a r9 = r8.f22575a     // Catch:{ Throwable -> 0x0072 }
            r9.o()     // Catch:{ Throwable -> 0x0072 }
        L_0x0071:
            return
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.config.AppConfig$1.a(com.bytedance.ttnet.hostmonitor.e):void");
    }
}
