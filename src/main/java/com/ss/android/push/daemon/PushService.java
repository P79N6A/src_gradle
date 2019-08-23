package com.ss.android.push.daemon;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.ss.android.push.daemon.g;

public class PushService extends Service {
    public void onCreate() {
        super.onCreate();
        d.a(this);
    }

    public IBinder onBind(Intent intent) {
        return new g.a() {
        };
    }
}
