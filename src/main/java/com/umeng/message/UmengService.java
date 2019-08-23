package com.umeng.message;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

@Deprecated
public class UmengService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }
}
