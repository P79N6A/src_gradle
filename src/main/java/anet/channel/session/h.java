package anet.channel.session;

import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;

public class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TnetSpdySession f1303a;

    public void run() {
        if (this.f1303a.y) {
            ALog.e("awcn.TnetSpdySession", "send msg time out!", this.f1303a.p, "pingUnRcv:", Boolean.valueOf(this.f1303a.y));
            try {
                this.f1303a.handleCallbacks(2048, null);
                if (this.f1303a.q != null) {
                    this.f1303a.q.closeReason = "ping time out";
                }
                ConnEvent connEvent = new ConnEvent();
                connEvent.isSuccess = false;
                StrategyCenter.getInstance().notifyConnEvent(this.f1303a.f1127d, this.f1303a.k, connEvent);
                this.f1303a.close(true);
            } catch (Exception unused) {
            }
        }
    }

    h(TnetSpdySession tnetSpdySession) {
        this.f1303a = tnetSpdySession;
    }
}
