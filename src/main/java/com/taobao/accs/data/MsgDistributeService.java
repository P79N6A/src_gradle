package com.taobao.accs.data;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import android.text.TextUtils;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;

public class MsgDistributeService extends Service {

    /* renamed from: a  reason: collision with root package name */
    private Messenger f78935a = new Messenger(new j(this));

    public void onCreate() {
        super.onCreate();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public IBinder onBind(Intent intent) {
        return this.f78935a.getBinder();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            ALog.i("MsgDistributeService", "onStartCommand", "action", intent.getAction());
            if (TextUtils.isEmpty(intent.getAction()) || !TextUtils.equals(intent.getAction(), "com.taobao.accs.intent.action.SEND")) {
                ALog.i("MsgDistributeService", "onStartCommand distribute message", new Object[0]);
                g.a(getApplicationContext(), intent);
            } else {
                ThreadPoolExecutorFactory.getScheduledExecutor().execute(new k(this, intent));
            }
        } catch (Throwable th) {
            ALog.e("MsgDistributeService", "onStartCommand", th, new Object[0]);
        }
        return 2;
    }
}
