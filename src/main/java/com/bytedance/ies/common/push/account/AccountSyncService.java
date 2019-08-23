package com.bytedance.ies.common.push.account;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AccountSyncService extends Service {

    /* renamed from: a  reason: collision with root package name */
    private static c f20218a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f20219b = new Object();

    public void onCreate() {
        synchronized (f20219b) {
            if (f20218a == null) {
                f20218a = new c(getApplicationContext(), true);
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return f20218a.getSyncAdapterBinder();
    }
}
