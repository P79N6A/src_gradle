package com.xiaomi.push.service;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class bm extends Handler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f82550a;

    bm(XMPushService xMPushService) {
        this.f82550a = xMPushService;
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        if (message != null) {
            try {
                switch (message.what) {
                    case 17:
                        if (message.obj != null) {
                            this.f82550a.onStart((Intent) message.obj, XMPushService.f82460a);
                            break;
                        }
                        break;
                    case 18:
                        Message obtain = Message.obtain(null, 0);
                        obtain.what = 18;
                        Bundle bundle = new Bundle();
                        bundle.putString("xmsf_region", XMPushService.a(this.f82550a));
                        obtain.setData(bundle);
                        message.replyTo.send(obtain);
                        return;
                }
            } catch (Throwable unused) {
            }
        }
    }
}
