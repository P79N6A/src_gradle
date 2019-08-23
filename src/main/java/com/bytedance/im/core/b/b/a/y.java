package com.bytedance.im.core.b.b.a;

import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.proto.IMCMD;

@Deprecated
public final class y extends l<Boolean> {
    /* access modifiers changed from: protected */
    public final boolean a(f fVar) {
        return true;
    }

    public y() {
        super(IMCMD.SEND_MESSAGE.getValue());
    }

    public y(b<Boolean> bVar) {
        super(IMCMD.SEND_MESSAGE.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    public final void a(f fVar, Runnable runnable) {
        runnable.run();
        a(Boolean.TRUE);
    }
}
