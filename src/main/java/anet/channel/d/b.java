package anet.channel.d;

import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.strategy.l;
import anet.channel.util.ALog;
import java.util.Map;

public final class b implements Runnable {
    b() {
    }

    public final void run() {
        Map.Entry entry;
        ALog.e("awcn.NetworkDetector", "network detect thread start", null, new Object[0]);
        while (true) {
            try {
                a.f1188c.lock();
                if (!GlobalAppRuntimeInfo.isAppBackground()) {
                    a.f1189d.await();
                }
                if (a.f1186a.isEmpty()) {
                    a.f1190e.await();
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                a.f1188c.unlock();
                throw th;
            }
            a.f1188c.unlock();
            while (GlobalAppRuntimeInfo.isAppBackground()) {
                synchronized (a.f1186a) {
                    if (!AwcnConfig.isHorseRaceEnable()) {
                        a.f1186a.clear();
                        entry = null;
                    } else {
                        entry = a.f1186a.pollFirstEntry();
                    }
                }
                if (entry == null) {
                    break;
                }
                try {
                    a.b((l.c) entry.getValue());
                } catch (Exception e2) {
                    ALog.e("awcn.NetworkDetector", "start hr task failed", null, e2, new Object[0]);
                }
            }
        }
    }
}
