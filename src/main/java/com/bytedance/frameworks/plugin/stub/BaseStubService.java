package com.bytedance.frameworks.plugin.stub;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class BaseStubService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        stopSelf();
    }
}
