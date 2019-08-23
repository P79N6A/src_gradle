package com.bytedance.common.wschannel.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.WsChannelSdk;

public abstract class AbsMessengerService extends Service implements WeakHandler.IHandler {
    protected WeakHandler mHandler;
    private Messenger mMessenger;

    public void handleMsg(Message message) {
    }

    public void onDestroy() {
        super.onDestroy();
    }

    private void tryInitInPushProcess() {
        WsChannelSdk.init(getApplication(), null);
    }

    public void onCreate() {
        tryInitInPushProcess();
        this.mHandler = new WeakHandler(this);
        this.mMessenger = new Messenger(this.mHandler);
    }

    public IBinder onBind(Intent intent) {
        return this.mMessenger.getBinder();
    }

    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
}
