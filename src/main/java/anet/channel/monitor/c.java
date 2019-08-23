package anet.channel.monitor;

import anet.channel.status.NetworkStatusHelper;

public class c implements NetworkStatusHelper.INetworkStatusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f1247a;

    c(b bVar) {
        this.f1247a = bVar;
    }

    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f1247a.n.a();
        b.f1245f = 0;
        this.f1247a.d();
    }
}
