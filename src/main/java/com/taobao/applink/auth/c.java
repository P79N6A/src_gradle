package com.taobao.applink.auth;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;

public class c implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f79154a;

    c(a aVar) {
        this.f79154a = aVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Messenger messenger = new Messenger(iBinder);
        Message obtain = Message.obtain(null, 11801);
        obtain.replyTo = this.f79154a.f79152e;
        try {
            messenger.send(obtain);
        } catch (Throwable unused) {
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f79154a.b();
        if (this.f79154a.f79151d != null) {
            this.f79154a.f79151d.onFailure();
        }
        Handler unused = this.f79154a.f79150c = null;
        Messenger unused2 = this.f79154a.f79152e = null;
        ServiceConnection unused3 = a.f79148a = null;
    }
}
