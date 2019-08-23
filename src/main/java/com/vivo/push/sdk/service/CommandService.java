package com.vivo.push.sdk.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.vivo.push.sdk.a;
import com.vivo.push.util.o;

public class CommandService extends Service {
    public void onDestroy() {
        super.onDestroy();
    }

    public void onCreate() {
        o.c("CommandService", getClass().getSimpleName() + " -- oncreate " + getPackageName());
        super.onCreate();
        a.a().a(getApplicationContext());
    }

    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    public IBinder onBind(Intent intent) {
        o.c("CommandService", "onBind initSuc: ");
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            stopSelf();
            return 2;
        }
        try {
            String stringExtra = intent.getStringExtra("command_type");
            if (!TextUtils.isEmpty(stringExtra) && stringExtra.equals("reflect_receiver")) {
                a.a().a(intent);
            }
        } catch (Exception e2) {
            o.a("CommandService", "onStartCommand -- error", e2);
        }
        stopSelf();
        return 2;
    }
}
