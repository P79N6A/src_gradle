package com.xiaomi.push;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.XMPushService;

public class ib implements gt {

    /* renamed from: a  reason: collision with root package name */
    private int f82214a;

    /* renamed from: a  reason: collision with other field name */
    private long f517a;

    /* renamed from: a  reason: collision with other field name */
    gq f518a;

    /* renamed from: a  reason: collision with other field name */
    XMPushService f519a;

    /* renamed from: a  reason: collision with other field name */
    private Exception f520a;

    /* renamed from: a  reason: collision with other field name */
    private String f521a = "";

    /* renamed from: b  reason: collision with root package name */
    private long f82215b;

    /* renamed from: c  reason: collision with root package name */
    private long f82216c;

    /* renamed from: d  reason: collision with root package name */
    private long f82217d;

    /* renamed from: e  reason: collision with root package name */
    private long f82218e;

    /* renamed from: f  reason: collision with root package name */
    private long f82219f;

    ib(XMPushService xMPushService) {
        this.f519a = xMPushService;
        b();
        int myUid = Process.myUid();
        this.f82219f = TrafficStats.getUidRxBytes(myUid);
        this.f82218e = TrafficStats.getUidTxBytes(myUid);
    }

    private void b() {
        this.f82215b = 0;
        this.f82217d = 0;
        this.f517a = 0;
        this.f82216c = 0;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (at.b(this.f519a)) {
            this.f517a = elapsedRealtime;
        }
        if (this.f519a.c()) {
            this.f82216c = elapsedRealtime;
        }
    }

    private void c() {
        synchronized (this) {
            b.c("stat connpt = " + this.f521a + " netDuration = " + this.f82215b + " ChannelDuration = " + this.f82217d + " channelConnectedTime = " + this.f82216c);
            gg ggVar = new gg();
            ggVar.f417a = 0;
            ggVar.a(gf.CHANNEL_ONLINE_RATE.a());
            ggVar.a(this.f521a);
            ggVar.d((int) (System.currentTimeMillis() / 1000));
            ggVar.b((int) (this.f82215b / 1000));
            ggVar.c((int) (this.f82217d / 1000));
            ic.a().a(ggVar);
            b();
        }
    }

    /* access modifiers changed from: package-private */
    public Exception a() {
        return this.f520a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m385a() {
        synchronized (this) {
            if (this.f519a != null) {
                String a2 = at.a((Context) this.f519a);
                boolean b2 = at.b(this.f519a);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (this.f517a > 0) {
                    this.f82215b += elapsedRealtime - this.f517a;
                    this.f517a = 0;
                }
                if (this.f82216c != 0) {
                    this.f82217d += elapsedRealtime - this.f82216c;
                    this.f82216c = 0;
                }
                if (b2) {
                    if ((!TextUtils.equals(this.f521a, a2) && this.f82215b > 30000) || this.f82215b > 5400000) {
                        c();
                    }
                    this.f521a = a2;
                    if (this.f517a == 0) {
                        this.f517a = elapsedRealtime;
                    }
                    if (this.f519a.c()) {
                        this.f82216c = elapsedRealtime;
                    }
                }
            }
        }
    }

    public void a(gq gqVar) {
        a();
        this.f82216c = SystemClock.elapsedRealtime();
        ie.a(0, gf.CONN_SUCCESS.a(), gqVar.a(), gqVar.a());
    }

    public void a(gq gqVar, int i, Exception exc) {
        long uidRxBytes;
        long uidTxBytes;
        if (this.f82214a == 0 && this.f520a == null) {
            this.f82214a = i;
            this.f520a = exc;
            ie.b(gqVar.a(), exc);
        }
        if (i == 22 && this.f82216c != 0) {
            long a2 = gqVar.a() - this.f82216c;
            if (a2 < 0) {
                a2 = 0;
            }
            this.f82217d = a2 + ((long) (gw.b() / 2)) + this.f82217d;
            this.f82216c = 0;
        }
        a();
        int myUid = Process.myUid();
        b.c("Stats rx=" + (TrafficStats.getUidRxBytes(myUid) - this.f82219f) + ", tx=" + (TrafficStats.getUidTxBytes(myUid) - this.f82218e));
        this.f82219f = uidRxBytes;
        this.f82218e = uidTxBytes;
    }

    public void a(gq gqVar, Exception exc) {
        ie.a(0, gf.CHANNEL_CON_FAIL.a(), 1, gqVar.a(), at.b(this.f519a) ? 1 : 0);
        a();
    }

    public void b(gq gqVar) {
        this.f82214a = 0;
        this.f520a = null;
        this.f518a = gqVar;
        this.f521a = at.a((Context) this.f519a);
        ie.a(0, gf.CONN_SUCCESS.a());
    }
}
