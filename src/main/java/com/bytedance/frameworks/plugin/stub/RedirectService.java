package com.bytedance.frameworks.plugin.stub;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class RedirectService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            Intent intent2 = (Intent) intent.getParcelableExtra("target_intent");
            if (intent2 != null) {
                startService(intent2);
            }
        }
        stopSelf();
        return super.onStartCommand(intent, i, i2);
    }
}
