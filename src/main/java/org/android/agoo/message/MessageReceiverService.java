package org.android.agoo.message;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.taobao.accs.utl.ALog;
import org.android.agoo.control.BaseIntentService;
import org.android.agoo.service.SendMessage;

public abstract class MessageReceiverService extends Service {

    /* renamed from: a  reason: collision with root package name */
    SendMessage.Stub f84030a = new SendMessage.Stub() {
        public int doSend(Intent intent) throws RemoteException {
            BaseIntentService.runIntentInService(MessageReceiverService.this.getApplicationContext(), intent, MessageReceiverService.this.getIntentServiceClassName(MessageReceiverService.this.getApplicationContext()));
            return 0;
        }
    };

    public abstract String getIntentServiceClassName(Context context);

    public void onCreate() {
        super.onCreate();
    }

    public IBinder onBind(Intent intent) {
        ALog.d("MessageReceiverService", "Message receiver aidl was binded {}", intent.getAction());
        if ("org.android.agoo.client.MessageReceiverService".equals(intent.getAction())) {
            return this.f84030a;
        }
        return this.f84030a;
    }
}
