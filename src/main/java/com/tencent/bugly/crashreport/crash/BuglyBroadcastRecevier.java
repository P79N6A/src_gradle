package com.tencent.bugly.crashreport.crash;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.a.a.a.a.a.a;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;

public class BuglyBroadcastRecevier extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static BuglyBroadcastRecevier f79295d;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public IntentFilter f79296a = new IntentFilter();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Context f79297b;

    /* renamed from: c  reason: collision with root package name */
    private String f79298c;

    /* renamed from: e  reason: collision with root package name */
    private boolean f79299e = true;

    public static synchronized BuglyBroadcastRecevier getInstance() {
        BuglyBroadcastRecevier buglyBroadcastRecevier;
        synchronized (BuglyBroadcastRecevier.class) {
            if (f79295d == null) {
                f79295d = new BuglyBroadcastRecevier();
            }
            buglyBroadcastRecevier = f79295d;
        }
        return buglyBroadcastRecevier;
    }

    public synchronized void register(Context context) {
        this.f79297b = context;
        z.a((Runnable) new Runnable() {
            public final void run() {
                try {
                    x.a((Class) BuglyBroadcastRecevier.f79295d.getClass(), "Register broadcast receiver of Bugly.", new Object[0]);
                    synchronized (this) {
                        BuglyBroadcastRecevier.this.f79297b.registerReceiver(BuglyBroadcastRecevier.f79295d, BuglyBroadcastRecevier.this.f79296a);
                    }
                } catch (Throwable th) {
                    a.b(th);
                }
            }
        });
    }

    public synchronized void addFilter(String str) {
        if (!this.f79296a.hasAction(str)) {
            this.f79296a.addAction(str);
        }
        x.c("add action %s", str);
    }

    public synchronized void unregister(Context context) {
        try {
            x.a((Class) getClass(), "Unregister broadcast receiver of Bugly.", new Object[0]);
            context.unregisterReceiver(this);
            this.f79297b = context;
        } catch (Throwable th) {
            x.a(th);
        }
    }

    public final void onReceive(Context context, Intent intent) {
        try {
            a(context, intent);
        } catch (Throwable th) {
            x.a(th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b2, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c0, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean a(android.content.Context r12, android.content.Intent r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 0
            if (r12 == 0) goto L_0x00bf
            if (r13 == 0) goto L_0x00bf
            java.lang.String r13 = r13.getAction()     // Catch:{ all -> 0x00bc }
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r13 = r13.equals(r1)     // Catch:{ all -> 0x00bc }
            if (r13 != 0) goto L_0x0014
            goto L_0x00bf
        L_0x0014:
            boolean r13 = r11.f79299e     // Catch:{ all -> 0x00bc }
            r1 = 1
            if (r13 == 0) goto L_0x001d
            r11.f79299e = r0     // Catch:{ all -> 0x00bc }
            monitor-exit(r11)
            return r1
        L_0x001d:
            android.content.Context r13 = r11.f79297b     // Catch:{ all -> 0x00bc }
            java.lang.String r13 = com.tencent.bugly.crashreport.common.info.b.f(r13)     // Catch:{ all -> 0x00bc }
            java.lang.String r2 = "is Connect BC "
            java.lang.String r3 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x00bc }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x00bc }
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ all -> 0x00bc }
            com.tencent.bugly.proguard.x.c(r2, r3)     // Catch:{ all -> 0x00bc }
            java.lang.String r2 = "network %s changed to %s"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00bc }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bc }
            r4.<init>()     // Catch:{ all -> 0x00bc }
            java.lang.String r5 = r11.f79298c     // Catch:{ all -> 0x00bc }
            r4.append(r5)     // Catch:{ all -> 0x00bc }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00bc }
            r3[r0] = r4     // Catch:{ all -> 0x00bc }
            java.lang.String r4 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x00bc }
            r3[r1] = r4     // Catch:{ all -> 0x00bc }
            com.tencent.bugly.proguard.x.a(r2, r3)     // Catch:{ all -> 0x00bc }
            if (r13 != 0) goto L_0x0057
            r12 = 0
            r11.f79298c = r12     // Catch:{ all -> 0x00bc }
            monitor-exit(r11)
            return r1
        L_0x0057:
            java.lang.String r2 = r11.f79298c     // Catch:{ all -> 0x00bc }
            r11.f79298c = r13     // Catch:{ all -> 0x00bc }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00bc }
            com.tencent.bugly.crashreport.common.strategy.a r5 = com.tencent.bugly.crashreport.common.strategy.a.a()     // Catch:{ all -> 0x00bc }
            com.tencent.bugly.proguard.u r6 = com.tencent.bugly.proguard.u.a()     // Catch:{ all -> 0x00bc }
            com.tencent.bugly.crashreport.common.info.a r12 = com.tencent.bugly.crashreport.common.info.a.a((android.content.Context) r12)     // Catch:{ all -> 0x00bc }
            if (r5 == 0) goto L_0x00b3
            if (r6 == 0) goto L_0x00b3
            if (r12 != 0) goto L_0x0072
            goto L_0x00b3
        L_0x0072:
            boolean r12 = r13.equals(r2)     // Catch:{ all -> 0x00bc }
            if (r12 != 0) goto L_0x00b1
            int r12 = com.tencent.bugly.crashreport.crash.c.f79344a     // Catch:{ all -> 0x00bc }
            long r12 = r6.a((int) r12)     // Catch:{ all -> 0x00bc }
            r2 = 0
            long r12 = r3 - r12
            r7 = 30000(0x7530, double:1.4822E-319)
            int r2 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0099
            java.lang.String r12 = "try to upload crash on network changed."
            java.lang.Object[] r13 = new java.lang.Object[r0]     // Catch:{ all -> 0x00bc }
            com.tencent.bugly.proguard.x.a(r12, r13)     // Catch:{ all -> 0x00bc }
            com.tencent.bugly.crashreport.crash.c r12 = com.tencent.bugly.crashreport.crash.c.a()     // Catch:{ all -> 0x00bc }
            if (r12 == 0) goto L_0x0099
            r9 = 0
            r12.a((long) r9)     // Catch:{ all -> 0x00bc }
        L_0x0099:
            r12 = 1001(0x3e9, float:1.403E-42)
            long r12 = r6.a((int) r12)     // Catch:{ all -> 0x00bc }
            r2 = 0
            long r3 = r3 - r12
            int r12 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r12 <= 0) goto L_0x00b1
            java.lang.String r12 = "try to upload userinfo on network changed."
            java.lang.Object[] r13 = new java.lang.Object[r0]     // Catch:{ all -> 0x00bc }
            com.tencent.bugly.proguard.x.a(r12, r13)     // Catch:{ all -> 0x00bc }
            com.tencent.bugly.crashreport.biz.a r12 = com.tencent.bugly.crashreport.biz.b.f79262a     // Catch:{ all -> 0x00bc }
            r12.b()     // Catch:{ all -> 0x00bc }
        L_0x00b1:
            monitor-exit(r11)
            return r1
        L_0x00b3:
            java.lang.String r12 = "not inited BC not work"
            java.lang.Object[] r13 = new java.lang.Object[r0]     // Catch:{ all -> 0x00bc }
            com.tencent.bugly.proguard.x.d(r12, r13)     // Catch:{ all -> 0x00bc }
            monitor-exit(r11)
            return r1
        L_0x00bc:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        L_0x00bf:
            monitor-exit(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.BuglyBroadcastRecevier.a(android.content.Context, android.content.Intent):boolean");
    }
}
