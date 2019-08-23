package anet.channel.session;

import anet.channel.RequestCb;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;

public class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Request f1298a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ RequestCb f1299b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ RequestStatistic f1300c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ d f1301d;

    public void run() {
        this.f1298a.f1262a.sendBeforeTime = System.currentTimeMillis() - this.f1298a.f1262a.reqStart;
        b.a(this.f1298a, (RequestCb) new g(this));
    }

    f(d dVar, Request request, RequestCb requestCb, RequestStatistic requestStatistic) {
        this.f1301d = dVar;
        this.f1298a = request;
        this.f1299b = requestCb;
        this.f1300c = requestStatistic;
    }
}
