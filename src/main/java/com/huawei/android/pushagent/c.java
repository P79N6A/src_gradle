package com.huawei.android.pushagent;

import android.os.MessageQueue;

public class c implements MessageQueue.IdleHandler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f25107a;

    c(b bVar) {
        this.f25107a = bVar;
    }

    public boolean queueIdle() {
        if (this.f25107a.f24999c.isHeld()) {
            this.f25107a.f24999c.release();
        }
        return true;
    }
}
