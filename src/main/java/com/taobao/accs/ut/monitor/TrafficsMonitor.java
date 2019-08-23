package com.taobao.accs.ut.monitor;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrafficsMonitor {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, List<a>> f79081a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f79082b = new HashMap<String, String>() {
        {
            put("im", "512");
            put("motu", "513");
            put("acds", "514");
            put("agooSend", "515");
            put("agooAck", "515");
            put("agooTokenReport", "515");
            put("accsSelf", "1000");
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private int f79083c = 0;

    /* renamed from: d  reason: collision with root package name */
    private Context f79084d;

    /* renamed from: e  reason: collision with root package name */
    private String f79085e = "";

    @Monitor(module = "NetworkSDK", monitorPoint = "TrafficStats")
    public static class StatTrafficMonitor extends BaseMonitor {
        @Dimension
        public String bizId;
        @Dimension
        public String date;
        @Dimension
        public String host;
        @Dimension
        public boolean isBackground;
        @Dimension
        public String serviceId;
        @Measure
        public long size;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f79087a;

        /* renamed from: b  reason: collision with root package name */
        String f79088b;

        /* renamed from: c  reason: collision with root package name */
        String f79089c;

        /* renamed from: d  reason: collision with root package name */
        boolean f79090d;

        /* renamed from: e  reason: collision with root package name */
        String f79091e;

        /* renamed from: f  reason: collision with root package name */
        long f79092f;

        public String toString() {
            return ("date:" + this.f79087a) + " " + ("bizId:" + this.f79088b) + " " + ("serviceId:" + this.f79089c) + " " + ("host:" + this.f79091e) + " " + ("isBackground:" + this.f79090d) + " " + ("size:" + this.f79092f);
        }

        public a(String str, boolean z, String str2, long j) {
            this.f79089c = str;
            this.f79090d = z;
            this.f79091e = str2;
            this.f79092f = j;
        }

        public a(String str, String str2, String str3, boolean z, String str4, long j) {
            this.f79087a = str;
            this.f79088b = str2;
            this.f79089c = str3;
            this.f79090d = z;
            this.f79091e = str4;
            this.f79092f = j;
        }
    }

    public void a() {
        try {
            synchronized (this.f79081a) {
                this.f79081a.clear();
            }
            List<a> a2 = com.taobao.accs.c.a.a(this.f79084d).a(true);
            if (a2 != null) {
                for (a a3 : a2) {
                    a(a3);
                }
            }
        } catch (Exception e2) {
            ALog.w("TrafficsMonitor", e2.toString(), new Object[0]);
        }
    }

    private void c() {
        List<a> a2 = com.taobao.accs.c.a.a(this.f79084d).a(false);
        if (a2 != null) {
            try {
                for (a next : a2) {
                    if (next != null) {
                        StatTrafficMonitor statTrafficMonitor = new StatTrafficMonitor();
                        statTrafficMonitor.bizId = next.f79088b;
                        statTrafficMonitor.date = next.f79087a;
                        statTrafficMonitor.host = next.f79091e;
                        statTrafficMonitor.isBackground = next.f79090d;
                        statTrafficMonitor.size = next.f79092f;
                        AppMonitor.getInstance().commitStat(statTrafficMonitor);
                    }
                }
                com.taobao.accs.c.a.a(this.f79084d).a();
            } catch (Throwable th) {
                ALog.e("", th.toString(), new Object[0]);
            }
        }
    }

    private void b() {
        boolean z;
        String str;
        synchronized (this.f79081a) {
            String a2 = UtilityImpl.a(System.currentTimeMillis());
            if (TextUtils.isEmpty(this.f79085e) || this.f79085e.equals(a2)) {
                str = a2;
                z = false;
            } else {
                str = this.f79085e;
                z = true;
            }
            for (String str2 : this.f79081a.keySet()) {
                for (a aVar : this.f79081a.get(str2)) {
                    if (aVar != null) {
                        com.taobao.accs.c.a.a(this.f79084d).a(aVar.f79091e, aVar.f79089c, this.f79082b.get(aVar.f79089c), aVar.f79090d, aVar.f79092f, str);
                    }
                }
            }
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.d("TrafficsMonitor", "savetoDay:" + str + " saveTraffics" + this.f79081a.toString(), new Object[0]);
            }
            if (z) {
                this.f79081a.clear();
                c();
            } else if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.d("TrafficsMonitor", "no need commit lastsaveDay:" + this.f79085e + " currday:" + a2, new Object[0]);
            }
            this.f79085e = a2;
            this.f79083c = 0;
        }
    }

    public TrafficsMonitor(Context context) {
        this.f79084d = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0090, code lost:
        if (r10.f79083c < 10) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0092, code lost:
        b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.taobao.accs.ut.monitor.TrafficsMonitor.a r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x0099
            java.lang.String r0 = r11.f79091e
            if (r0 == 0) goto L_0x0099
            long r0 = r11.f79092f
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0099
            java.lang.String r0 = r11.f79089c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = "accsSelf"
            goto L_0x001b
        L_0x0019:
            java.lang.String r0 = r11.f79089c
        L_0x001b:
            r11.f79089c = r0
            java.util.Map<java.lang.String, java.util.List<com.taobao.accs.ut.monitor.TrafficsMonitor$a>> r0 = r10.f79081a
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r10.f79082b     // Catch:{ all -> 0x0096 }
            java.lang.String r2 = r11.f79089c     // Catch:{ all -> 0x0096 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0096 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0096 }
            if (r2 == 0) goto L_0x0032
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return
        L_0x0032:
            r11.f79088b = r1     // Catch:{ all -> 0x0096 }
            com.taobao.accs.utl.ALog$Level r2 = com.taobao.accs.utl.ALog.Level.D     // Catch:{ all -> 0x0096 }
            com.taobao.accs.utl.ALog.isPrintLog(r2)     // Catch:{ all -> 0x0096 }
            java.util.Map<java.lang.String, java.util.List<com.taobao.accs.ut.monitor.TrafficsMonitor$a>> r2 = r10.f79081a     // Catch:{ all -> 0x0096 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0096 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x0096 }
            r3 = 1
            if (r2 == 0) goto L_0x0079
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x0096 }
        L_0x0048:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0096 }
            if (r5 == 0) goto L_0x0072
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0096 }
            com.taobao.accs.ut.monitor.TrafficsMonitor$a r5 = (com.taobao.accs.ut.monitor.TrafficsMonitor.a) r5     // Catch:{ all -> 0x0096 }
            boolean r6 = r5.f79090d     // Catch:{ all -> 0x0096 }
            boolean r7 = r11.f79090d     // Catch:{ all -> 0x0096 }
            if (r6 != r7) goto L_0x0048
            java.lang.String r6 = r5.f79091e     // Catch:{ all -> 0x0096 }
            if (r6 == 0) goto L_0x0048
            java.lang.String r6 = r5.f79091e     // Catch:{ all -> 0x0096 }
            java.lang.String r7 = r11.f79091e     // Catch:{ all -> 0x0096 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0096 }
            if (r6 == 0) goto L_0x0048
            long r6 = r5.f79092f     // Catch:{ all -> 0x0096 }
            long r8 = r11.f79092f     // Catch:{ all -> 0x0096 }
            r4 = 0
            long r6 = r6 + r8
            r5.f79092f = r6     // Catch:{ all -> 0x0096 }
            r4 = 0
            goto L_0x0073
        L_0x0072:
            r4 = 1
        L_0x0073:
            if (r4 == 0) goto L_0x0081
            r2.add(r11)     // Catch:{ all -> 0x0096 }
            goto L_0x0081
        L_0x0079:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0096 }
            r2.<init>()     // Catch:{ all -> 0x0096 }
            r2.add(r11)     // Catch:{ all -> 0x0096 }
        L_0x0081:
            java.util.Map<java.lang.String, java.util.List<com.taobao.accs.ut.monitor.TrafficsMonitor$a>> r11 = r10.f79081a     // Catch:{ all -> 0x0096 }
            r11.put(r1, r2)     // Catch:{ all -> 0x0096 }
            int r11 = r10.f79083c     // Catch:{ all -> 0x0096 }
            int r11 = r11 + r3
            r10.f79083c = r11     // Catch:{ all -> 0x0096 }
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            int r11 = r10.f79083c
            r0 = 10
            if (r11 < r0) goto L_0x0099
            r10.b()
            goto L_0x0099
        L_0x0096:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            throw r11
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.ut.monitor.TrafficsMonitor.a(com.taobao.accs.ut.monitor.TrafficsMonitor$a):void");
    }
}
