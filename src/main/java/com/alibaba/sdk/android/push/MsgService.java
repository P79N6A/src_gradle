package com.alibaba.sdk.android.push;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.ss.android.push.PushDependManager;

@Deprecated
public class MsgService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        try {
            PushDependManager.inst().tryHookInit(getApplicationContext());
        } catch (Throwable unused) {
        }
    }
}
