package anet.channel.strategy;

import anet.channel.strategy.StrategyList;
import anet.channel.strategy.l;

public class j implements StrategyList.Predicate<IPConnStrategy> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l.a f1387a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f1388b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ConnProtocol f1389c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ StrategyList f1390d;

    /* renamed from: a */
    public boolean apply(IPConnStrategy iPConnStrategy) {
        if (iPConnStrategy.getPort() != this.f1387a.f1392a || !iPConnStrategy.getIp().equals(this.f1388b) || !iPConnStrategy.protocol.equals(this.f1389c)) {
            return false;
        }
        return true;
    }

    j(StrategyList strategyList, l.a aVar, String str, ConnProtocol connProtocol) {
        this.f1390d = strategyList;
        this.f1387a = aVar;
        this.f1388b = str;
        this.f1389c = connProtocol;
    }
}
