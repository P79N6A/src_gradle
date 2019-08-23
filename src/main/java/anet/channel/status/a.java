package anet.channel.status;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import java.util.Iterator;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NetworkStatusHelper.NetworkStatus f1306a;

    public final void run() {
        try {
            Iterator<NetworkStatusHelper.INetworkStatusChangeListener> it2 = NetworkStatusHelper.listeners.iterator();
            while (it2.hasNext()) {
                NetworkStatusHelper.INetworkStatusChangeListener next = it2.next();
                long currentTimeMillis = System.currentTimeMillis();
                next.onNetworkStatusChanged(this.f1306a);
                if (System.currentTimeMillis() - currentTimeMillis > 500) {
                    ALog.e("awcn.NetworkStatusHelper", "call back cost too much time", null, "listener", next);
                }
            }
        } catch (Exception unused) {
        }
    }

    a(NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f1306a = networkStatus;
    }
}
