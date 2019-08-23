package com.taobao.accs.data;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.taobao.accs.utl.ALog;

public class j extends Handler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MsgDistributeService f78962a;

    j(MsgDistributeService msgDistributeService) {
        this.f78962a = msgDistributeService;
    }

    public void handleMessage(Message message) {
        if (message != null) {
            ALog.i("MsgDistributeService", "handleMessage on receive msg", "msg", message.toString());
            Intent intent = (Intent) message.getData().getParcelable("intent");
            if (intent != null) {
                ALog.i("MsgDistributeService", "handleMessage get intent success", "intent", intent.toString());
                this.f78962a.onStartCommand(intent, 0, 0);
            }
        }
    }
}
