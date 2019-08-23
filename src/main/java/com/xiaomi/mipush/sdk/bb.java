package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.xiaomi.channel.commonutils.logger.b;

public class bb implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ay f81773a;

    bb(ay ayVar) {
        this.f81773a = ayVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f81773a) {
            Messenger unused = this.f81773a.f107a = new Messenger(iBinder);
            boolean unused2 = this.f81773a.f81768c = false;
            for (Message send : ay.a(this.f81773a)) {
                try {
                    ay.a(this.f81773a).send(send);
                } catch (RemoteException e2) {
                    b.a((Throwable) e2);
                }
            }
            ay.a(this.f81773a).clear();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        Messenger unused = this.f81773a.f107a = null;
        boolean unused2 = this.f81773a.f81768c = false;
    }
}
