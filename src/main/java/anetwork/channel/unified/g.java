package anetwork.channel.unified;

import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.entity.c;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.HttpUrl;

public class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SessionCenter f1576a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HttpUrl f1577b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ RequestStatistic f1578c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ HttpUrl f1579d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f1580e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ e f1581f;

    public void run() {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        Session session = this.f1576a.get(this.f1577b, c.f1211a, 3000);
        this.f1578c.connWaitTime = System.currentTimeMillis() - currentTimeMillis;
        RequestStatistic requestStatistic = this.f1578c;
        if (session != null) {
            z = true;
        } else {
            z = false;
        }
        requestStatistic.spdyRequestSend = z;
        this.f1581f.a(this.f1581f.a(session, this.f1576a, this.f1579d, this.f1580e), this.f1581f.f1566a.f1591a.a());
    }

    g(e eVar, SessionCenter sessionCenter, HttpUrl httpUrl, RequestStatistic requestStatistic, HttpUrl httpUrl2, boolean z) {
        this.f1581f = eVar;
        this.f1576a = sessionCenter;
        this.f1577b = httpUrl;
        this.f1578c = requestStatistic;
        this.f1579d = httpUrl2;
        this.f1580e = z;
    }
}
