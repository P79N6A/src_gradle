package com.bytedance.im.core.b.b.a;

import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;

public abstract class b extends l {
    /* access modifiers changed from: protected */
    public abstract void a(int i, ResponseBody responseBody);

    b(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public final boolean a(f fVar) {
        if (!fVar.g() || fVar.g == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(f fVar, Runnable runnable) {
        if (fVar.g() && fVar.g.body != null) {
            Response response = fVar.g;
            a(response.inbox_type.intValue(), response.body);
        }
    }
}
