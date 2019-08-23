package com.huawei.android.pushagent.b.a.a;

import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import com.huawei.android.pushagent.a.d;
import com.huawei.android.pushagent.b.a.a;
import com.huawei.android.pushagent.b.a.a.c;
import com.huawei.android.pushagent.b.a.b.b;
import com.huawei.android.pushagent.utils.a.e;
import java.net.Socket;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public d f25011a;

    /* renamed from: b  reason: collision with root package name */
    public c f25012b;

    /* renamed from: c  reason: collision with root package name */
    public b f25013c;

    /* renamed from: d  reason: collision with root package name */
    public Context f25014d;

    /* renamed from: e  reason: collision with root package name */
    public b f25015e;

    /* renamed from: f  reason: collision with root package name */
    protected PowerManager.WakeLock f25016f;
    private PowerManager g;

    /* renamed from: com.huawei.android.pushagent.b.a.a.a$a  reason: collision with other inner class name */
    enum C0288a {
        CONNECT_METHOD_DIRECT_TrsPort,
        CONNECT_METHOD_DIRECT_DefaultPort,
        CONNECT_METHOD_Proxy_TrsPort,
        CONNECT_METHOD_Proxy_DefaultPort
    }

    public a(d dVar, Context context, b bVar, String str) {
        this.f25014d = context;
        this.f25011a = dVar;
        this.f25015e = bVar;
        this.g = (PowerManager) context.getSystemService("power");
    }

    /* access modifiers changed from: protected */
    public d a(int i, int i2) {
        switch (C0288a.values()[b(i, i2)]) {
            case CONNECT_METHOD_DIRECT_TrsPort:
                return new d(this.f25011a.f24993a, this.f25011a.f24994b, false, this.f25011a.f24995c);
            case CONNECT_METHOD_DIRECT_DefaultPort:
                return new d(this.f25011a.f24993a, 443, false, this.f25011a.f24995c);
            case CONNECT_METHOD_Proxy_TrsPort:
                return new d(this.f25011a.f24993a, 443, true, this.f25011a.f24995c);
            case CONNECT_METHOD_Proxy_DefaultPort:
                return new d(this.f25011a.f24993a, this.f25011a.f24994b, true, this.f25011a.f24995c);
            default:
                return null;
        }
    }

    public abstract void a(c.a aVar, Bundle bundle);

    public abstract void a(boolean z) throws com.huawei.android.pushagent.a.c;

    public abstract void a(boolean z, boolean z2) throws com.huawei.android.pushagent.a.c;

    public boolean a() {
        return this.f25013c != null && this.f25013c.b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b3, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean a(com.huawei.android.pushagent.a.b r8) throws java.lang.Exception {
        /*
            r7 = this;
            monitor-enter(r7)
            com.huawei.android.pushagent.b.a.b.b r0 = r7.f25013c     // Catch:{ all -> 0x00b4 }
            r1 = 0
            if (r0 == 0) goto L_0x0099
            com.huawei.android.pushagent.b.a.b.b r0 = r7.f25013c     // Catch:{ all -> 0x00b4 }
            java.net.Socket r0 = r0.c()     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x0099
            com.huawei.android.pushagent.b.a.a$a r0 = com.huawei.android.pushagent.b.a.a.c()     // Catch:{ all -> 0x00b4 }
            com.huawei.android.pushagent.b.a.a$a r2 = r7.e()     // Catch:{ all -> 0x00b4 }
            if (r0 != r2) goto L_0x0022
            com.huawei.android.pushagent.b.a.b.b r0 = r7.f25013c     // Catch:{ all -> 0x00b4 }
            java.net.Socket r0 = r0.c()     // Catch:{ all -> 0x00b4 }
            r0.setSoTimeout(r1)     // Catch:{ all -> 0x00b4 }
            goto L_0x003e
        L_0x0022:
            com.huawei.android.pushagent.b.a.b.b r0 = r7.f25013c     // Catch:{ all -> 0x00b4 }
            java.net.Socket r0 = r0.c()     // Catch:{ all -> 0x00b4 }
            com.huawei.android.pushagent.b.a.a.b r2 = r7.f25015e     // Catch:{ all -> 0x00b4 }
            long r2 = r2.b((boolean) r1)     // Catch:{ all -> 0x00b4 }
            android.content.Context r4 = r7.f25014d     // Catch:{ all -> 0x00b4 }
            com.huawei.android.pushagent.b.b.a r4 = com.huawei.android.pushagent.b.b.a.a((android.content.Context) r4)     // Catch:{ all -> 0x00b4 }
            long r4 = r4.Q()     // Catch:{ all -> 0x00b4 }
            r6 = 0
            long r2 = r2 + r4
            int r2 = (int) r2     // Catch:{ all -> 0x00b4 }
            r0.setSoTimeout(r2)     // Catch:{ all -> 0x00b4 }
        L_0x003e:
            r0 = 0
            if (r8 == 0) goto L_0x0046
            byte[] r0 = r8.b()     // Catch:{ all -> 0x00b4 }
            goto L_0x004d
        L_0x0046:
            java.lang.String r2 = "PushLogAC2815"
            java.lang.String r3 = "pushMsg = null, send fail"
            com.huawei.android.pushagent.utils.a.e.d(r2, r3)     // Catch:{ all -> 0x00b4 }
        L_0x004d:
            if (r0 == 0) goto L_0x0091
            int r2 = r0.length     // Catch:{ all -> 0x00b4 }
            if (r2 != 0) goto L_0x0053
            goto L_0x0091
        L_0x0053:
            java.lang.String r2 = "PushLogAC2815"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b4 }
            java.lang.String r4 = "read to Send:"
            r3.<init>(r4)     // Catch:{ all -> 0x00b4 }
            byte r4 = r8.a()     // Catch:{ all -> 0x00b4 }
            java.lang.String r4 = com.huawei.android.pushagent.utils.a.a((byte) r4)     // Catch:{ all -> 0x00b4 }
            r3.append(r4)     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00b4 }
            com.huawei.android.pushagent.utils.a.e.b(r2, r3)     // Catch:{ all -> 0x00b4 }
            com.huawei.android.pushagent.b.a.b.b r2 = r7.f25013c     // Catch:{ all -> 0x00b4 }
            boolean r0 = r2.a((byte[]) r0)     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x0089
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x00b4 }
            java.lang.String r1 = "com.huawei.android.push.intent.MSG_SENT"
            r0.<init>(r1)     // Catch:{ all -> 0x00b4 }
            java.lang.String r1 = "push_msg"
            android.content.Intent r8 = r0.putExtra(r1, r8)     // Catch:{ all -> 0x00b4 }
            com.huawei.android.pushagent.PushService.a((android.content.Intent) r8)     // Catch:{ all -> 0x00b4 }
            r8 = 1
            monitor-exit(r7)
            return r8
        L_0x0089:
            java.lang.String r8 = "PushLogAC2815"
            java.lang.String r0 = "call channel.send false!!"
        L_0x008d:
            com.huawei.android.pushagent.utils.a.e.d(r8, r0)     // Catch:{ all -> 0x00b4 }
            goto L_0x00b2
        L_0x0091:
            java.lang.String r8 = "PushLogAC2815"
            java.lang.String r0 = "when send PushMsg, encode Len is null"
            com.huawei.android.pushagent.utils.a.e.b(r8, r0)     // Catch:{ all -> 0x00b4 }
            goto L_0x00b2
        L_0x0099:
            java.lang.String r8 = "PushLogAC2815"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b4 }
            java.lang.String r2 = "when send pushMsg, channel is null， curCls:"
            r0.<init>(r2)     // Catch:{ all -> 0x00b4 }
            java.lang.Class r2 = r7.getClass()     // Catch:{ all -> 0x00b4 }
            java.lang.String r2 = r2.getSimpleName()     // Catch:{ all -> 0x00b4 }
            r0.append(r2)     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00b4 }
            goto L_0x008d
        L_0x00b2:
            monitor-exit(r7)
            return r1
        L_0x00b4:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.b.a.a.a.a(com.huawei.android.pushagent.a.b):boolean");
    }

    /* access modifiers changed from: protected */
    public int b(int i, int i2) {
        return Math.abs(i + i2) % C0288a.values().length;
    }

    /* access modifiers changed from: protected */
    public synchronized void b() {
        this.f25016f = this.g.newWakeLock(1, "mWakeLockForThread");
        this.f25016f.setReferenceCounted(false);
        this.f25016f.acquire(1000);
    }

    public Socket c() {
        if (this.f25013c != null) {
            return this.f25013c.c();
        }
        return null;
    }

    public void d() {
        if (this.f25013c != null) {
            try {
                this.f25013c.a();
                this.f25013c = null;
            } catch (Exception e2) {
                e.c("PushLogAC2815", "call channel.close() cause:" + e2.toString(), e2);
            }
            if (this.f25012b != null) {
                this.f25012b.interrupt();
                this.f25012b = null;
            }
        }
    }

    public abstract a.C0287a e();

    public String toString() {
        return this.f25011a.toString() + " " + this.f25015e.toString();
    }
}
