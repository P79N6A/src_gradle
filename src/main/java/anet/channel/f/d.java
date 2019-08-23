package anet.channel.f;

import anet.channel.Session;
import anet.channel.entity.EventCb;
import anet.channel.entity.b;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;

public class d implements EventCb {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IConnStrategy f1222a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f1223b;

    d(c cVar, IConnStrategy iConnStrategy) {
        this.f1223b = cVar;
        this.f1222a = iConnStrategy;
    }

    public void onEvent(Session session, int i, b bVar) {
        ConnEvent connEvent = new ConnEvent();
        if (i == 1) {
            connEvent.isSuccess = true;
        }
        StrategyCenter.getInstance().notifyConnEvent(a.f1216a, this.f1222a, connEvent);
        session.close(false);
    }
}
