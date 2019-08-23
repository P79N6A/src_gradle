package com.alibaba.sdk.android.push;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.ss.android.message.NotifyService;
import com.ss.android.push.PushDependManager;

@Deprecated
public class AliyunPushIntentService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            Intent intent2 = new Intent(this, NotifyService.class);
            intent2.setAction("com.ss.android.message.action.PUSH_SERVICE");
            intent2.setPackage(getPackageName());
            startService(intent2);
            PushDependManager.inst().tryHookInit(this);
        } catch (Throwable unused) {
        }
        stopSelf();
        return super.onStartCommand(intent, i, i2);
    }
}