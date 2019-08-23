package anet.channel.d;

import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;

public final class d implements AppLifecycle.AppLifecycleListener {
    public final void forground() {
    }

    d() {
    }

    public final void background() {
        ALog.i("awcn.NetworkDetector", "background", null, new Object[0]);
        a.f1188c.lock();
        try {
            a.f1189d.signal();
        } finally {
            a.f1188c.unlock();
        }
    }
}
