package com.tencent.wxop.stat;

import android.content.Context;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.wxop.stat.a.b;
import com.tencent.wxop.stat.a.n;
import com.tencent.wxop.stat.a.r;
import com.tencent.wxop.stat.b.e;

public final class p {

    /* renamed from: f  reason: collision with root package name */
    private static volatile long f79918f;

    /* renamed from: a  reason: collision with root package name */
    e f79919a;

    /* renamed from: b  reason: collision with root package name */
    boolean f79920b;

    /* renamed from: c  reason: collision with root package name */
    Context f79921c;

    /* renamed from: d  reason: collision with root package name */
    private e f79922d;

    /* renamed from: e  reason: collision with root package name */
    private long f79923e = System.currentTimeMillis();

    public p(e eVar) {
        this.f79919a = eVar;
        this.f79922d = d.a();
        this.f79920b = eVar.l;
        this.f79921c = eVar.m;
    }

    private void a(ai aiVar) {
        aj.a(g.t).a(this.f79919a, aiVar);
    }

    private void b() {
        if (this.f79919a.n != null && this.f79919a.n.f79901d) {
            this.f79922d = e.INSTANT;
        }
        if (d.q && i.a(g.t).a()) {
            this.f79922d = e.INSTANT;
        }
        if (d.b()) {
            b e2 = g.r;
            e2.a("strategy=" + this.f79922d.name());
        }
        switch (l.f79912a[this.f79922d.ordinal()]) {
            case 1:
                c();
                break;
            case 2:
                t.a(this.f79921c).b(this.f79919a, null, this.f79920b, false);
                if (d.b()) {
                    b e3 = g.r;
                    e3.a("PERIOD currTime=" + this.f79923e + ",nextPeriodSendTs=" + g.f79897f + ",difftime=" + (g.f79897f - this.f79923e));
                }
                if (g.f79897f == 0) {
                    g.f79897f = r.a(this.f79921c, "last_period_ts", 0);
                    if (this.f79923e > g.f79897f) {
                        g.c(this.f79921c);
                    }
                    long h = this.f79923e + ((long) (d.h() * 60 * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
                    if (g.f79897f > h) {
                        g.f79897f = h;
                    }
                    ae.a(this.f79921c).a();
                }
                if (d.b()) {
                    b e4 = g.r;
                    e4.a("PERIOD currTime=" + this.f79923e + ",nextPeriodSendTs=" + g.f79897f + ",difftime=" + (g.f79897f - this.f79923e));
                }
                if (this.f79923e > g.f79897f) {
                    g.c(this.f79921c);
                    return;
                }
                break;
            case 3:
            case 4:
                t.a(this.f79921c).b(this.f79919a, null, this.f79920b, false);
                return;
            case 5:
                t.a(this.f79921c).b(this.f79919a, new q(this), this.f79920b, true);
                return;
            case 6:
                if (i.a(g.t).f79904b == 1) {
                    c();
                    return;
                } else {
                    t.a(this.f79921c).b(this.f79919a, null, this.f79920b, false);
                    return;
                }
            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                if (n.d(this.f79921c)) {
                    a(new r(this));
                    return;
                }
                break;
            default:
                b e5 = g.r;
                e5.d("Invalid stat strategy:" + d.a());
                break;
        }
    }

    private void c() {
        if (t.a().f79928b <= 0 || !d.x) {
            a(new s(this));
            return;
        }
        t.a().b(this.f79919a, null, this.f79920b, true);
        t.a().a(-1);
    }

    public final void a() {
        if (!d()) {
            if (d.y > 0 && this.f79923e >= f79918f) {
                g.b(this.f79921c);
                f79918f = this.f79923e + d.z;
                if (d.b()) {
                    b e2 = g.r;
                    e2.a("nextFlushTime=" + f79918f);
                }
            }
            if (i.a(this.f79921c).b()) {
                if (d.b()) {
                    b e3 = g.r;
                    e3.a("sendFailedCount=" + g.f79895d);
                }
                if (!g.a()) {
                    b();
                    return;
                }
                t.a(this.f79921c).b(this.f79919a, null, this.f79920b, false);
                if (this.f79923e - g.f79896e > 1800000) {
                    g.a(this.f79921c);
                }
                return;
            }
            t.a(this.f79921c).b(this.f79919a, null, this.f79920b, false);
        }
    }

    private boolean d() {
        if (d.o > 0) {
            if (this.f79923e > g.f79893b) {
                g.i.clear();
                g.f79893b = this.f79923e + d.p;
                if (d.b()) {
                    b e2 = g.r;
                    e2.a("clear methodsCalledLimitMap, nextLimitCallClearTime=" + g.f79893b);
                }
            }
            Integer valueOf = Integer.valueOf(this.f79919a.a().a());
            Integer num = (Integer) g.i.get(valueOf);
            if (num != null) {
                g.i.put(valueOf, Integer.valueOf(num.intValue() + 1));
                if (num.intValue() > d.o) {
                    if (d.b()) {
                        b e3 = g.r;
                        e3.e("event " + this.f79919a.b() + " was discard, cause of called limit, current:" + num + ", limit:" + d.o + ", period:" + d.p + " ms");
                    }
                    return true;
                }
            } else {
                g.i.put(valueOf, 1);
            }
        }
        return false;
    }
}
