package anet.channel;

import anet.channel.SessionRequest;
import anet.channel.util.i;

public class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Session f1225a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SessionRequest.a f1226b;

    public void run() {
        try {
            SessionRequest.this.a(this.f1226b.f1147c, this.f1225a.getConnType().getType(), i.a(SessionRequest.this.f1139a.f1133c), (SessionGetCallback) null, 0);
        } catch (Exception unused) {
        }
    }

    g(SessionRequest.a aVar, Session session) {
        this.f1226b = aVar;
        this.f1225a = session;
    }
}
