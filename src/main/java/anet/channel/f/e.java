package anet.channel.f;

import anet.channel.status.NetworkStatusHelper;

public final class e implements NetworkStatusHelper.INetworkStatusChangeListener {
    e() {
    }

    public final void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        a.a(networkStatus);
    }
}
