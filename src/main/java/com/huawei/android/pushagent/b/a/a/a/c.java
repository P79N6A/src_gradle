package com.huawei.android.pushagent.b.a.a.a;

import com.huawei.android.pushagent.b.a.a.a;

public class c extends com.huawei.android.pushagent.b.a.a.c {
    public c(a aVar) {
        super(aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() throws java.lang.Exception {
        /*
            r6 = this;
            r0 = 0
            com.huawei.android.pushagent.b.a.a.a r1 = r6.f25034c     // Catch:{ Exception -> 0x00d8, all -> 0x00d5 }
            com.huawei.android.pushagent.b.a.b.b r1 = r1.f25013c     // Catch:{ Exception -> 0x00d8, all -> 0x00d5 }
            if (r1 == 0) goto L_0x00bc
            com.huawei.android.pushagent.b.a.a.a r1 = r6.f25034c     // Catch:{ Exception -> 0x00d8, all -> 0x00d5 }
            com.huawei.android.pushagent.b.a.b.b r1 = r1.f25013c     // Catch:{ Exception -> 0x00d8, all -> 0x00d5 }
            java.net.Socket r1 = r1.c()     // Catch:{ Exception -> 0x00d8, all -> 0x00d5 }
            if (r1 != 0) goto L_0x0013
            goto L_0x00bc
        L_0x0013:
            com.huawei.android.pushagent.b.a.a.a r1 = r6.f25034c     // Catch:{ Exception -> 0x00d8, all -> 0x00d5 }
            com.huawei.android.pushagent.b.a.b.b r1 = r1.f25013c     // Catch:{ Exception -> 0x00d8, all -> 0x00d5 }
            java.net.Socket r1 = r1.c()     // Catch:{ Exception -> 0x00d8, all -> 0x00d5 }
            java.lang.String r2 = "PushLogAC2815"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d8, all -> 0x00d5 }
            java.lang.String r4 = "socket timeout is "
            r3.<init>(r4)     // Catch:{ Exception -> 0x00d8, all -> 0x00d5 }
            int r1 = r1.getSoTimeout()     // Catch:{ Exception -> 0x00d8, all -> 0x00d5 }
            r3.append(r1)     // Catch:{ Exception -> 0x00d8, all -> 0x00d5 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x00d8, all -> 0x00d5 }
            com.huawei.android.pushagent.utils.a.e.a(r2, r1)     // Catch:{ Exception -> 0x00d8, all -> 0x00d5 }
            com.huawei.android.pushagent.b.a.a.a r1 = r6.f25034c     // Catch:{ Exception -> 0x00d8, all -> 0x00d5 }
            com.huawei.android.pushagent.b.a.b.b r1 = r1.f25013c     // Catch:{ Exception -> 0x00d8, all -> 0x00d5 }
            java.io.InputStream r1 = r1.d()     // Catch:{ Exception -> 0x00d8, all -> 0x00d5 }
        L_0x003a:
            boolean r2 = r6.isInterrupted()     // Catch:{ Exception -> 0x00ba }
            if (r2 != 0) goto L_0x00a3
            com.huawei.android.pushagent.b.a.a.a r2 = r6.f25034c     // Catch:{ Exception -> 0x00ba }
            com.huawei.android.pushagent.b.a.b.b r2 = r2.f25013c     // Catch:{ Exception -> 0x00ba }
            boolean r2 = r2.b()     // Catch:{ Exception -> 0x00ba }
            if (r2 == 0) goto L_0x00a3
            if (r1 == 0) goto L_0x0055
            com.huawei.android.pushagent.a.a.a.b r2 = com.huawei.android.pushagent.a.a.a.b.b(r1)     // Catch:{ SocketException -> 0x0053, Exception -> 0x0051 }
            goto L_0x005d
        L_0x0051:
            r2 = move-exception
            goto L_0x0074
        L_0x0053:
            r2 = move-exception
            goto L_0x008c
        L_0x0055:
            java.lang.String r2 = "PushLogAC2815"
            java.lang.String r3 = "InputStream is null, get pollingMessage failed"
            com.huawei.android.pushagent.utils.a.e.b(r2, r3)     // Catch:{ SocketException -> 0x0053, Exception -> 0x0051 }
            r2 = r0
        L_0x005d:
            if (r2 == 0) goto L_0x003a
            com.huawei.android.pushagent.utils.a.b()     // Catch:{ SocketException -> 0x0053, Exception -> 0x0051 }
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ SocketException -> 0x0053, Exception -> 0x0051 }
            r3.<init>()     // Catch:{ SocketException -> 0x0053, Exception -> 0x0051 }
            java.lang.String r4 = "push_msg"
            r3.putSerializable(r4, r2)     // Catch:{ SocketException -> 0x0053, Exception -> 0x0051 }
            com.huawei.android.pushagent.b.a.a.a r2 = r6.f25034c     // Catch:{ SocketException -> 0x0053, Exception -> 0x0051 }
            com.huawei.android.pushagent.b.a.a.c$a r4 = com.huawei.android.pushagent.b.a.a.c.a.SocketEvent_MSG_RECEIVED     // Catch:{ SocketException -> 0x0053, Exception -> 0x0051 }
            r2.a((com.huawei.android.pushagent.b.a.a.c.a) r4, (android.os.Bundle) r3)     // Catch:{ SocketException -> 0x0053, Exception -> 0x0051 }
            goto L_0x003a
        L_0x0074:
            java.lang.String r3 = "PushLogAC2815"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ba }
            java.lang.String r5 = "call getEntityByCmdId cause:"
            r4.<init>(r5)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r5 = r2.toString()     // Catch:{ Exception -> 0x00ba }
            r4.append(r5)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00ba }
            com.huawei.android.pushagent.utils.a.e.c(r3, r4, r2)     // Catch:{ Exception -> 0x00ba }
            throw r2     // Catch:{ Exception -> 0x00ba }
        L_0x008c:
            java.lang.String r3 = "PushLogAC2815"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ba }
            java.lang.String r5 = "SocketException:"
            r4.<init>(r5)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00ba }
            r4.append(r2)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x00ba }
            com.huawei.android.pushagent.utils.a.e.a(r3, r2)     // Catch:{ Exception -> 0x00ba }
        L_0x00a3:
            if (r1 == 0) goto L_0x00a8
            r1.close()
        L_0x00a8:
            com.huawei.android.pushagent.b.a.a.a r1 = r6.f25034c
            com.huawei.android.pushagent.b.a.b.b r1 = r1.f25013c
            if (r1 == 0) goto L_0x00b9
            com.huawei.android.pushagent.b.a.a.a r1 = r6.f25034c
            com.huawei.android.pushagent.b.a.b.b r1 = r1.f25013c
            r1.a()
            com.huawei.android.pushagent.b.a.a.a r1 = r6.f25034c
            r1.f25013c = r0
        L_0x00b9:
            return
        L_0x00ba:
            r2 = move-exception
            goto L_0x00da
        L_0x00bc:
            java.lang.String r1 = "PushLogAC2815"
            java.lang.String r2 = "no socket when in readSSLSocket"
            com.huawei.android.pushagent.utils.a.e.d(r1, r2)     // Catch:{ Exception -> 0x00d8, all -> 0x00d5 }
            com.huawei.android.pushagent.b.a.a.a r1 = r6.f25034c
            com.huawei.android.pushagent.b.a.b.b r1 = r1.f25013c
            if (r1 == 0) goto L_0x00d4
            com.huawei.android.pushagent.b.a.a.a r1 = r6.f25034c
            com.huawei.android.pushagent.b.a.b.b r1 = r1.f25013c
            r1.a()
            com.huawei.android.pushagent.b.a.a.a r1 = r6.f25034c
            r1.f25013c = r0
        L_0x00d4:
            return
        L_0x00d5:
            r2 = move-exception
            r1 = r0
            goto L_0x00e3
        L_0x00d8:
            r2 = move-exception
            r1 = r0
        L_0x00da:
            com.huawei.android.pushagent.a.c r3 = new com.huawei.android.pushagent.a.c     // Catch:{ all -> 0x00e2 }
            com.huawei.android.pushagent.a.c$a r4 = com.huawei.android.pushagent.a.c.a.Err_Read     // Catch:{ all -> 0x00e2 }
            r3.<init>((java.lang.Throwable) r2, (com.huawei.android.pushagent.a.c.a) r4)     // Catch:{ all -> 0x00e2 }
            throw r3     // Catch:{ all -> 0x00e2 }
        L_0x00e2:
            r2 = move-exception
        L_0x00e3:
            if (r1 == 0) goto L_0x00e8
            r1.close()
        L_0x00e8:
            com.huawei.android.pushagent.b.a.a.a r1 = r6.f25034c
            com.huawei.android.pushagent.b.a.b.b r1 = r1.f25013c
            if (r1 == 0) goto L_0x00f9
            com.huawei.android.pushagent.b.a.a.a r1 = r6.f25034c
            com.huawei.android.pushagent.b.a.b.b r1 = r1.f25013c
            r1.a()
            com.huawei.android.pushagent.b.a.a.a r1 = r6.f25034c
            r1.f25013c = r0
        L_0x00f9:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.b.a.a.a.c.b():void");
    }
}
