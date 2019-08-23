package com.taobao.accs.net;

import anet.channel.entity.ConnType;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.HttpDispatcher;
import com.taobao.accs.utl.ALog;
import java.util.ArrayList;
import java.util.List;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private int f79007a;

    /* renamed from: b  reason: collision with root package name */
    private List<IConnStrategy> f79008b = new ArrayList();

    public int c() {
        return this.f79007a;
    }

    public IConnStrategy a() {
        return a(this.f79008b);
    }

    public void b() {
        this.f79007a++;
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d("HttpDnsProvider", "updateStrategyPos StrategyPos:" + this.f79007a, new Object[0]);
        }
    }

    public void b(String str) {
        StrategyCenter.getInstance().forceRefreshStrategy(str);
    }

    public g(String str) {
        HttpDispatcher.getInstance().addListener(new h(this));
        a(str);
    }

    public IConnStrategy a(List<IConnStrategy> list) {
        if (list == null || list.isEmpty()) {
            ALog.d("HttpDnsProvider", "strategys null or 0", new Object[0]);
            return null;
        }
        if (this.f79007a < 0 || this.f79007a >= list.size()) {
            this.f79007a = 0;
        }
        return list.get(this.f79007a);
    }

    public List<IConnStrategy> a(String str) {
        if (this.f79007a == 0 || this.f79008b.isEmpty()) {
            List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str);
            if (connStrategyListByHost != null && !connStrategyListByHost.isEmpty()) {
                this.f79008b.clear();
                for (IConnStrategy next : connStrategyListByHost) {
                    ConnType valueOf = ConnType.valueOf(next.getProtocol());
                    if (valueOf.getTypeLevel() == ConnType.TypeLevel.SPDY && valueOf.isSSL()) {
                        this.f79008b.add(next);
                    }
                }
            }
        }
        return this.f79008b;
    }
}
