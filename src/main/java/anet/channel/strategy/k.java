package anet.channel.strategy;

import java.util.Comparator;

public class k implements Comparator<IPConnStrategy> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ StrategyList f1391a;

    k(StrategyList strategyList) {
        this.f1391a = strategyList;
    }

    /* renamed from: a */
    public int compare(IPConnStrategy iPConnStrategy, IPConnStrategy iPConnStrategy2) {
        int a2 = ((ConnHistoryItem) this.f1391a.f1336b.get(Integer.valueOf(iPConnStrategy.getUniqueId()))).a();
        int a3 = ((ConnHistoryItem) this.f1391a.f1336b.get(Integer.valueOf(iPConnStrategy2.getUniqueId()))).a();
        if (a2 != a3) {
            return a2 - a3;
        }
        if (iPConnStrategy.f1317a != iPConnStrategy2.f1317a) {
            return iPConnStrategy.f1317a - iPConnStrategy2.f1317a;
        }
        return iPConnStrategy.protocol.isHttp - iPConnStrategy2.protocol.isHttp;
    }
}
