package com.vivo.push;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.vivo.push.util.o;

public final class x extends Handler {
    x(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        Object obj = message.obj;
        if (obj instanceof v) {
            v vVar = (v) obj;
            o.c("PushClientThread", "PushClientThread-handleMessage, task = ".concat(String.valueOf(vVar)));
            vVar.run();
        }
    }
}
