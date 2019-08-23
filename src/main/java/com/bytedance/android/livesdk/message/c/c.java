package com.bytedance.android.livesdk.message.c;

import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;

public final class c implements IInterceptor {

    /* renamed from: a  reason: collision with root package name */
    private long f16409a;

    public c(long j) {
        this.f16409a = j;
    }

    public final boolean onMessage(IMessage iMessage) {
        com.bytedance.android.livesdk.message.model.c cVar = (com.bytedance.android.livesdk.message.model.c) iMessage;
        if (cVar.baseMessage == null || cVar.baseMessage.f18776c == this.f16409a) {
            return false;
        }
        return true;
    }
}
