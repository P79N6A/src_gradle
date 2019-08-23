package anet.channel.strategy;

import anet.channel.statist.StrategyStatObject;
import anet.channel.strategy.StrategyInfoHolder;
import java.io.Serializable;
import java.util.Map;

public class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Map.Entry f1378a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ StrategyInfoHolder.LruStrategyMap f1379b;

    public void run() {
        StrategyTable strategyTable = (StrategyTable) this.f1378a.getValue();
        if (strategyTable.f1344e) {
            StrategyStatObject strategyStatObject = new StrategyStatObject(1);
            strategyStatObject.writeStrategyFileId = strategyTable.f1340a;
            m.a((Serializable) this.f1378a.getValue(), strategyTable.f1340a, strategyStatObject);
            strategyTable.f1344e = false;
        }
    }

    f(StrategyInfoHolder.LruStrategyMap lruStrategyMap, Map.Entry entry) {
        this.f1379b = lruStrategyMap;
        this.f1378a = entry;
    }
}
