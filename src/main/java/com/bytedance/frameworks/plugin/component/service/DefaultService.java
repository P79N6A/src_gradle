package com.bytedance.frameworks.plugin.component.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class DefaultService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}