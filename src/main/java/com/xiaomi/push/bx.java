package com.xiaomi.push;

import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class bx extends Handler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ bw f81877a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bx(bw bwVar, Looper looper) {
        super(looper);
        this.f81877a = bwVar;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 200:
                synchronized (bw.a(this.f81877a)) {
                    for (bu a2 : bw.a(this.f81877a)) {
                        a2.a((NetworkInfo) message.obj);
                    }
                }
                return;
            case 201:
                synchronized (bw.a(this.f81877a)) {
                    for (bu b2 : bw.a(this.f81877a)) {
                        b2.b((NetworkInfo) message.obj);
                    }
                }
                return;
            default:
                return;
        }
    }
}
