package anet.channel.session;

import anet.channel.RequestCb;
import anet.channel.request.Request;
import anet.channel.session.b;

public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Request f1296a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d f1297b;

    public void run() {
        b.a a2 = b.a(this.f1296a, (RequestCb) null);
        if (a2.f1290a > 0) {
            this.f1297b.notifyStatus(4, new anet.channel.entity.b(1));
        } else {
            this.f1297b.handleCallbacks(256, new anet.channel.entity.b(256, a2.f1290a, "Http connect fail"));
        }
    }

    e(d dVar, Request request) {
        this.f1297b = dVar;
        this.f1296a = request;
    }
}
