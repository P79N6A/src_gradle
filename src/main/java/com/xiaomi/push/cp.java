package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class cp extends Handler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ch f81910a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cp(ch chVar, Looper looper) {
        super(looper);
        this.f81910a = chVar;
    }

    public void handleMessage(Message message) {
        boolean z = false;
        switch (message.what) {
            case 1:
                this.f81910a.a(false);
                return;
            case 2:
                if (message.obj != null) {
                    z = ((Boolean) message.obj).booleanValue();
                }
                this.f81910a.b(z);
                return;
            default:
                return;
        }
    }
}
