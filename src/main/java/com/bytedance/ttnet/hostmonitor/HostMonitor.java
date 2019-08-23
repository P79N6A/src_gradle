package com.bytedance.ttnet.hostmonitor;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class HostMonitor extends IntentService {
    public HostMonitor() {
        super("HostMonitor");
    }

    public void onCreate() {
        try {
            super.onCreate();
        } catch (Throwable unused) {
        }
    }

    static a a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return a.NONE;
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            return a.MOBILE;
        }
        if (type == 1) {
            return a.WIFI;
        }
        f.a("HostMonitor", "Unsupported connection type: " + type + ". Returning NONE");
        return a.NONE;
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        a aVar;
        if (intent != null) {
            try {
                if ("com.bytedance.ttnet.hostmonitor.check".equals(intent.getAction())) {
                    d dVar = new d(this);
                    if (dVar.b().isEmpty()) {
                        f.b("HostMonitor", "No hosts to check at this moment");
                    } else {
                        int intExtra = intent.getIntExtra("com.bytedance.ttnet.hostmonitor.connection_type", -1);
                        if (intExtra < 0) {
                            aVar = a(this);
                        } else {
                            aVar = a.values()[intExtra];
                        }
                        if (aVar == a.NONE) {
                            f.b("HostMonitor", "No active connection. Notifying that all the hosts are unreachable");
                            for (c cVar : dVar.b().keySet()) {
                                g gVar = (g) dVar.b().get(cVar);
                                g gVar2 = new g(false, aVar);
                                if (!gVar2.equals(gVar)) {
                                    f.b("HostMonitor", "Host " + cVar.f22637a + " is currently unreachable on port " + cVar.f22638b);
                                    dVar.b().put(cVar, gVar2);
                                    a(dVar.c(), cVar, gVar, gVar2);
                                }
                            }
                            dVar.e();
                        } else {
                            a(aVar, dVar);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0027 A[SYNTHETIC, Splitter:B:16:0x0027] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0036 A[SYNTHETIC, Splitter:B:24:0x0036] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(com.bytedance.ttnet.hostmonitor.c r3, int r4) {
        /*
            r0 = 0
            java.net.Socket r1 = new java.net.Socket     // Catch:{ Exception -> 0x0033, all -> 0x0023 }
            r1.<init>()     // Catch:{ Exception -> 0x0033, all -> 0x0023 }
            java.net.InetSocketAddress r0 = new java.net.InetSocketAddress     // Catch:{ Exception -> 0x0021, all -> 0x001f }
            java.lang.String r2 = r3.f22637a     // Catch:{ Exception -> 0x0021, all -> 0x001f }
            int r3 = r3.f22638b     // Catch:{ Exception -> 0x0021, all -> 0x001f }
            r0.<init>(r2, r3)     // Catch:{ Exception -> 0x0021, all -> 0x001f }
            r1.connect(r0, r4)     // Catch:{ Exception -> 0x0021, all -> 0x001f }
            r3 = 1
            r1.close()     // Catch:{ Exception -> 0x0017 }
            goto L_0x0039
        L_0x0017:
            java.lang.String r4 = "HostMonitor"
            java.lang.String r0 = "Error while closing socket."
            com.bytedance.ttnet.hostmonitor.f.b(r4, r0)
            goto L_0x0039
        L_0x001f:
            r3 = move-exception
            goto L_0x0025
        L_0x0021:
            r0 = r1
            goto L_0x0033
        L_0x0023:
            r3 = move-exception
            r1 = r0
        L_0x0025:
            if (r1 == 0) goto L_0x0032
            r1.close()     // Catch:{ Exception -> 0x002b }
            goto L_0x0032
        L_0x002b:
            java.lang.String r4 = "HostMonitor"
            java.lang.String r0 = "Error while closing socket."
            com.bytedance.ttnet.hostmonitor.f.b(r4, r0)
        L_0x0032:
            throw r3
        L_0x0033:
            r3 = 0
            if (r0 == 0) goto L_0x0039
            r0.close()     // Catch:{ Exception -> 0x0017 }
        L_0x0039:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.hostmonitor.HostMonitor.a(com.bytedance.ttnet.hostmonitor.c, int):boolean");
    }

    private void a(a aVar, d dVar) {
        String str;
        f.b("HostMonitor", "Starting reachability check");
        for (c cVar : dVar.b().keySet()) {
            g gVar = (g) dVar.b().get(cVar);
            if (dVar.f22642d <= 0) {
                dVar.f22642d = dVar.a().getInt("socketTimeout", 5000);
            }
            int i = dVar.f22642d;
            if (dVar.f22644f <= 0) {
                dVar.f22644f = dVar.a().getInt("maxAttempts", 3);
            }
            int i2 = dVar.f22644f;
            boolean z = false;
            for (int i3 = 0; i3 < i2; i3++) {
                z = a(cVar, i);
                if (z) {
                    break;
                }
            }
            g gVar2 = new g(z, aVar);
            if (!gVar2.equals(gVar)) {
                StringBuilder sb = new StringBuilder("Host ");
                sb.append(cVar.f22637a);
                sb.append(" is currently ");
                if (z) {
                    str = "reachable";
                } else {
                    str = "unreachable";
                }
                sb.append(str);
                sb.append(" on port ");
                sb.append(cVar.f22638b);
                sb.append(" via ");
                sb.append(aVar);
                f.b("HostMonitor", sb.toString());
                dVar.b().put(cVar, gVar2);
                a(dVar.c(), cVar, gVar, gVar2);
            }
        }
        dVar.e();
        f.b("HostMonitor", "Reachability check finished!");
    }

    private void a(String str, c cVar, g gVar, g gVar2) {
        e a2 = new e().a(cVar.f22637a).a(cVar.f22638b).a(gVar.f22654a).b(gVar.f22655b).b(gVar2.f22654a).a(gVar2.f22655b);
        f.b("HostMonitor", "Broadcast with action: " + str + " and status: " + a2);
        Intent intent = new Intent(str);
        intent.putExtra("HostStatus", a2);
        sendBroadcast(intent);
    }
}
