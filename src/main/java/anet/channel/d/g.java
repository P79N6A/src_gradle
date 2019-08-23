package anet.channel.d;

import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.l;

public final class g implements IConnStrategy {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l.e f1198a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ConnProtocol f1199b;

    public final int getHeartbeat() {
        return 0;
    }

    public final int getIpSource() {
        return 2;
    }

    public final int getIpType() {
        return 1;
    }

    public final int getRetryTimes() {
        return 0;
    }

    public final ConnProtocol getProtocol() {
        return this.f1199b;
    }

    public final int getConnectionTimeout() {
        return this.f1198a.f1413b.f1394c;
    }

    public final String getIp() {
        return this.f1198a.f1412a;
    }

    public final int getPort() {
        return this.f1198a.f1413b.f1392a;
    }

    public final int getReadTimeout() {
        return this.f1198a.f1413b.f1395d;
    }

    g(l.e eVar, ConnProtocol connProtocol) {
        this.f1198a = eVar;
        this.f1199b = connProtocol;
    }
}
