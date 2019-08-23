package anet.channel.strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StrategyTemplate {
    Map<String, ConnProtocol> templateMap = new ConcurrentHashMap();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        static StrategyTemplate f1345a = new StrategyTemplate();

        a() {
        }
    }

    public static StrategyTemplate getInstance() {
        return a.f1345a;
    }

    public ConnProtocol getConnProtocol(String str) {
        return this.templateMap.get(str);
    }

    public void registerConnProtocol(String str, ConnProtocol connProtocol) {
        if (connProtocol != null) {
            this.templateMap.put(str, connProtocol);
            try {
                IStrategyInstance instance = StrategyCenter.getInstance();
                if (instance instanceof g) {
                    ((g) instance).f1381b.f1331c.a(str, connProtocol);
                }
            } catch (Exception unused) {
            }
        }
    }
}
