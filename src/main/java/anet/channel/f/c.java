package anet.channel.f;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.entity.a;
import anet.channel.session.TnetSpdySession;
import anet.channel.strategy.IConnStrategy;
import java.util.List;
import org.android.spdy.SpdyAgent;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f1221a;

    public final void run() {
        if (a.f1218c.compareAndSet(false, true)) {
            SpdyAgent.InitializeCerts();
        }
        IConnStrategy iConnStrategy = (IConnStrategy) this.f1221a.get(0);
        TnetSpdySession tnetSpdySession = new TnetSpdySession(GlobalAppRuntimeInfo.getContext(), new a("https://" + a.f1216a, "QuicDetect" + a.f1220e.getAndIncrement(), iConnStrategy));
        tnetSpdySession.registerEventcb(257, new d(this, iConnStrategy));
        tnetSpdySession.q.isCommitted = true;
        tnetSpdySession.connect();
    }

    c(List list) {
        this.f1221a = list;
    }
}
