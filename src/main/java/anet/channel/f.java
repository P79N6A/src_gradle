package anet.channel;

import anet.channel.entity.EventCb;
import anet.channel.entity.b;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;

public class f implements EventCb {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Session f1214a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SessionRequest f1215b;

    f(SessionRequest sessionRequest, Session session) {
        this.f1215b = sessionRequest;
        this.f1214a = session;
    }

    public void onEvent(Session session, int i, b bVar) {
        ALog.d("awcn.SessionRequest", "Receive session event", null, "eventType", Integer.valueOf(i));
        ConnEvent connEvent = new ConnEvent();
        if (i == 512) {
            connEvent.isSuccess = true;
        }
        StrategyCenter.getInstance().notifyConnEvent(this.f1214a.getRealHost(), this.f1214a.getConnStrategy(), connEvent);
    }
}
