package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.xiaomi.channel.commonutils.logger.b;

public class az implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ax f82535a;

    az(ax axVar) {
        this.f82535a = axVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f82535a) {
            Messenger unused = this.f82535a.f82533b = new Messenger(iBinder);
            boolean unused2 = this.f82535a.f960b = false;
            for (Message send : ax.a(this.f82535a)) {
                try {
                    ax.a(this.f82535a).send(send);
                } catch (RemoteException e2) {
                    b.a((Throwable) e2);
                }
            }
            ax.a(this.f82535a).clear();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        Messenger unused = this.f82535a.f82533b = null;
        boolean unused2 = this.f82535a.f960b = false;
    }
}
