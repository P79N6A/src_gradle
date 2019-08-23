package anet.channel.strategy;

import java.util.Comparator;

public final class o implements Comparator<StrategyCollection> {
    o() {
    }

    /* renamed from: a */
    public final int compare(StrategyCollection strategyCollection, StrategyCollection strategyCollection2) {
        if (strategyCollection.f1322c != strategyCollection2.f1322c) {
            return (int) (strategyCollection.f1322c - strategyCollection2.f1322c);
        }
        return strategyCollection.f1320a.compareTo(strategyCollection2.f1320a);
    }
}
