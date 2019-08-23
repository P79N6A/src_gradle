package anet.channel.f;

import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.IStrategyFilter;

public final class b implements IStrategyFilter {
    b() {
    }

    public final boolean accept(IConnStrategy iConnStrategy) {
        String str = iConnStrategy.getProtocol().protocol;
        if ("quic".equals(str) || "quicplain".equals(str)) {
            return true;
        }
        return false;
    }
}
