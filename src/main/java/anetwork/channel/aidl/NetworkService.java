package anetwork.channel.aidl;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import anet.channel.util.ALog;
import anetwork.channel.aidl.IRemoteNetworkGetter;
import anetwork.channel.aidl.RemoteNetwork;
import anetwork.channel.degrade.DegradableNetworkDelegate;
import anetwork.channel.http.HttpNetworkDelegate;

public class NetworkService extends Service {

    /* renamed from: a  reason: collision with root package name */
    IRemoteNetworkGetter.Stub f1473a = new IRemoteNetworkGetter.Stub() {
        public RemoteNetwork get(int i) throws RemoteException {
            if (i == 1) {
                return NetworkService.this.f1475c;
            }
            return NetworkService.this.f1476d;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private Context f1474b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public RemoteNetwork.Stub f1475c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public RemoteNetwork.Stub f1476d;

    public void onDestroy() {
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    public IBinder onBind(Intent intent) {
        this.f1474b = getApplicationContext();
        if (ALog.isPrintLog(2)) {
            ALog.i("anet.NetworkService", "onBind:" + intent.getAction(), null, new Object[0]);
        }
        this.f1475c = new DegradableNetworkDelegate(this.f1474b);
        this.f1476d = new HttpNetworkDelegate(this.f1474b);
        if (IRemoteNetworkGetter.class.getName().equals(intent.getAction())) {
            return this.f1473a;
        }
        return null;
    }
}
