package com.bytedance.ies.common.push.account;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AuthenticatorService extends Service {

    /* renamed from: a  reason: collision with root package name */
    private b f20220a;

    public void onCreate() {
        this.f20220a = new b(this);
    }

    public IBinder onBind(Intent intent) {
        return this.f20220a.getIBinder();
    }
}
