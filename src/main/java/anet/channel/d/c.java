package anet.channel.d;

import anet.channel.AwcnConfig;
import anet.channel.strategy.IStrategyListener;
import anet.channel.strategy.l;
import anet.channel.util.ALog;

public final class c implements IStrategyListener {
    c() {
    }

    public final void onStrategyUpdated(l.d dVar) {
        ALog.i("awcn.NetworkDetector", "onStrategyUpdated", null, new Object[0]);
        if (AwcnConfig.isHorseRaceEnable() && dVar.f1408c != null && dVar.f1408c.length != 0) {
            if (a.f1191f == null) {
                Thread unused = a.f1191f = new Thread(a.g);
                a.f1191f.setName("AWCN HR");
                a.f1191f.start();
                ALog.i("awcn.NetworkDetector", "start horse race thread", null, new Object[0]);
            }
            synchronized (a.f1186a) {
                for (l.c cVar : dVar.f1408c) {
                    a.f1186a.put(cVar.f1404a, cVar);
                }
            }
            a.f1188c.lock();
            try {
                a.f1190e.signal();
            } finally {
                a.f1188c.unlock();
            }
        }
    }
}
