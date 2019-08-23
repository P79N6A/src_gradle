package com.bytedance.common.wschannel.server;

import android.content.Intent;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.app.AbsMessengerService;
import com.bytedance.common.wschannel.app.IWsApp;

public class WsChannelService extends AbsMessengerService {

    static class Msg {
        int channelId;
        byte[] data;

        Msg() {
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onCreate() {
        Logger.debug();
        super.onCreate();
        ChannelManager.inst(this);
    }

    static int getClientKey(IWsApp iWsApp) {
        if (iWsApp == null) {
            return Integer.MIN_VALUE;
        }
        return iWsApp.getChannelId();
    }

    public void handleMsg(Message message) {
        super.handleMsg(message);
        if (message != null) {
            Logger.debug();
            ChannelManager.inst(this).handleMsg(message);
        }
    }

    private void handleIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("com.bytedance.article.wschannel.appstate".equals(action)) {
                int intExtra = intent.getIntExtra("app_state", -1);
                Message message = new Message();
                message.what = 2;
                message.arg1 = intExtra;
                handleMsg(message);
                return;
            }
            if ("com.bytedance.article.wschannel.networkstate".equals(action)) {
                int intExtra2 = intent.getIntExtra("network_state", -1);
                Message message2 = new Message();
                message2.what = 3;
                message2.arg1 = intExtra2;
                handleMsg(message2);
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Logger.debug();
        handleIntent(intent);
        return 1;
    }
}
