package org.android.agoo.control;

import android.os.RemoteException;
import com.taobao.accs.utl.ALog;
import org.android.agoo.control.AgooFactory;

public class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AgooFactory.a f84013a;

    public void run() {
        try {
            ALog.d("AgooFactory", "onConnected running tid:" + Thread.currentThread().getId(), new Object[0]);
            AgooFactory.a.b(this.f84013a).doSend(AgooFactory.a.a(this.f84013a));
        } catch (RemoteException e2) {
            ALog.e("AgooFactory", "send error", e2, new Object[0]);
        } catch (Throwable th) {
            ALog.d("AgooFactory", "send finish. close this connection", new Object[0]);
            AgooFactory.a.a(this.f84013a, null);
            AgooFactory.mContext.unbindService(AgooFactory.a.c(this.f84013a));
            throw th;
        }
        ALog.d("AgooFactory", "send finish. close this connection", new Object[0]);
        AgooFactory.a.a(this.f84013a, null);
        AgooFactory.mContext.unbindService(AgooFactory.a.c(this.f84013a));
    }

    f(AgooFactory.a aVar) {
        this.f84013a = aVar;
    }
}
