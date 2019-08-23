package com.bytedance.im.core.b.b.a;

import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.proto.IMCMD;

public final class r extends l<Boolean> {
    /* access modifiers changed from: protected */
    public final boolean a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean a(f fVar) {
        return true;
    }

    public r(b<Boolean> bVar) {
        super(IMCMD.MARK_ALL_STRANGER_CONVERSATIONS_READ.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    public final void a(f fVar, Runnable runnable) {
        if (fVar.g()) {
            a(Boolean.TRUE);
        } else {
            b(fVar);
        }
    }
}
