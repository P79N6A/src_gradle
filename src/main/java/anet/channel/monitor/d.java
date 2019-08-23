package anet.channel.monitor;

import anet.channel.util.ALog;

public class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f1248a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f1249b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f1250c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ b f1251d;

    public void run() {
        b.f1240a++;
        b.f1244e += this.f1248a;
        if (b.f1240a == 1) {
            b.f1243d = this.f1249b - this.f1250c;
        }
        if (b.f1240a >= 2 && b.f1240a <= 3) {
            if (this.f1250c >= b.f1242c) {
                b.f1243d += this.f1249b - this.f1250c;
            } else if (this.f1250c < b.f1242c && this.f1249b >= b.f1242c) {
                long j = b.f1243d + (this.f1249b - this.f1250c);
                b.f1243d = j;
                b.f1243d = j - (b.f1242c - this.f1250c);
            }
        }
        b.f1241b = this.f1250c;
        b.f1242c = this.f1249b;
        if (b.f1240a == 3) {
            b.i = (double) ((long) this.f1251d.n.a((double) b.f1244e, (double) b.f1243d));
            b.f1245f++;
            int unused = this.f1251d.m = this.f1251d.m + 1;
            if (b.f1245f > 30) {
                this.f1251d.n.a();
                b.f1245f = 3;
            }
            double d2 = (b.i * 0.68d) + (b.h * 0.27d) + (b.g * 0.05d);
            b.g = b.h;
            b.h = b.i;
            if (b.i < b.g * 0.65d || b.i > b.g * 2.0d) {
                b.i = d2;
            }
            int i = 5;
            if (ALog.isPrintLog(1)) {
                ALog.d("awcn.BandWidthSampler", "NetworkSpeed", null, "mKalmanDataSize", Long.valueOf(b.f1244e), "mKalmanTimeUsed", Long.valueOf(b.f1243d), "speed", Double.valueOf(b.i), "mSpeedKalmanCount", Long.valueOf(b.f1245f));
            }
            if (this.f1251d.m > 5 || b.f1245f == 2) {
                a.a().a(b.i);
                int unused2 = this.f1251d.m = 0;
                b bVar = this.f1251d;
                if (b.i < b.j) {
                    i = 1;
                }
                int unused3 = bVar.l = i;
                ALog.i("awcn.BandWidthSampler", "NetworkSpeed notification!", null, "Send Network quality notification.");
            }
            b.f1243d = 0;
            b.f1244e = 0;
            b.f1240a = 0;
        }
    }

    d(b bVar, long j, long j2, long j3) {
        this.f1251d = bVar;
        this.f1248a = j;
        this.f1249b = j2;
        this.f1250c = j3;
    }
}
