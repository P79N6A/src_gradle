package anet.channel.strategy;

import anet.channel.AwcnConfig;
import anet.channel.util.ALog;

public class h implements IStrategyFilter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f1385a;

    h(g gVar) {
        this.f1385a = gVar;
    }

    public boolean accept(IConnStrategy iConnStrategy) {
        boolean isQuicEnable = AwcnConfig.isQuicEnable();
        boolean z = this.f1385a.f1381b.d().f1342c;
        String str = iConnStrategy.getProtocol().protocol;
        if ((isQuicEnable && z) || (!"quic".equals(str) && !"quicplain".equals(str))) {
            return true;
        }
        ALog.i("awcn.StrategyCenter", "quic strategy disabled", null, "strategy", iConnStrategy);
        return false;
    }
}
