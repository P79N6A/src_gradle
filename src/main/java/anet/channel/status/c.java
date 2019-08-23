package anet.channel.status;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import anet.channel.util.ALog;
import java.util.ArrayList;

public final class c extends ConnectivityManager.NetworkCallback {
    c() {
    }

    public final void onAvailable(Network network) {
        super.onAvailable(network);
        ALog.i("awcn.NetworkStatusMonitor", "network onAvailable", null, new Object[0]);
        b.f1308b = true;
    }

    public final void onLost(Network network) {
        super.onLost(network);
        ALog.i("awcn.NetworkStatusMonitor", "network onLost", null, new Object[0]);
        b.f1308b = false;
    }

    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        super.onLinkPropertiesChanged(network, linkProperties);
        b.l = new ArrayList(linkProperties.getDnsServers());
    }
}
