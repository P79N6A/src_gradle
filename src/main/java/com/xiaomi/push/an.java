package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.push.am;

public class an extends Handler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ am f81833a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    an(am amVar, Looper looper) {
        super(looper);
        this.f81833a = amVar;
    }

    public void handleMessage(Message message) {
        am.b bVar = (am.b) message.obj;
        if (message.what == 0) {
            bVar.a();
        } else if (message.what == 1) {
            bVar.c();
        }
        super.handleMessage(message);
    }
}
