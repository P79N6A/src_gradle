package anetwork.channel.aidl.adapter;

import anet.channel.util.ALog;

public final class f implements Runnable {
    f() {
    }

    public final void run() {
        if (d.f1489c) {
            d.f1489c = false;
            ALog.w("anet.RemoteGetter", "binding service timeout. reset status!", null, new Object[0]);
        }
    }
}
