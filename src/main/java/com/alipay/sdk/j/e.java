package com.alipay.sdk.j;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.alipay.b.a.a;

public final class e implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f5531a;

    e(d dVar) {
        this.f5531a = dVar;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        a unused = this.f5531a.f5526b = null;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a aVar;
        synchronized (this.f5531a.f5527c) {
            d dVar = this.f5531a;
            if (iBinder == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.alipay.android.app.IAlixPay");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                    aVar = new a.C0037a.C0038a(iBinder);
                } else {
                    aVar = (a) queryLocalInterface;
                }
            }
            a unused = dVar.f5526b = aVar;
            this.f5531a.f5527c.notify();
        }
    }
}
