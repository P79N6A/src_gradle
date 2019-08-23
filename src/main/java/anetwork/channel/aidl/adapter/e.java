package anetwork.channel.aidl.adapter;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import anet.channel.util.ALog;
import anetwork.channel.aidl.IRemoteNetworkGetter;

public final class e implements ServiceConnection {
    e() {
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (ALog.isPrintLog(2)) {
            ALog.i("anet.RemoteGetter", "ANet_Service Disconnected", null, new Object[0]);
        }
        d.f1487a = null;
        d.f1489c = false;
        if (d.f1490d != null) {
            d.f1490d.countDown();
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (ALog.isPrintLog(2)) {
            ALog.i("anet.RemoteGetter", "[onServiceConnected]ANet_Service start success. ANet run with service mode", null, new Object[0]);
        }
        synchronized (d.class) {
            d.f1487a = IRemoteNetworkGetter.Stub.asInterface(iBinder);
            if (d.f1490d != null) {
                d.f1490d.countDown();
            }
        }
        d.f1488b = false;
        d.f1489c = false;
    }
}
