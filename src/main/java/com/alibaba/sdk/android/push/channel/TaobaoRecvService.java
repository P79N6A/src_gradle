package com.alibaba.sdk.android.push.channel;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

@Deprecated
public class TaobaoRecvService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }
}
