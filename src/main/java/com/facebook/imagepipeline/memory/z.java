package com.facebook.imagepipeline.memory;

import com.facebook.common.memory.b;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public final class z extends u {
    private static NativeMemoryChunk f(int i) {
        return new NativeMemoryChunk(i);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(int i) {
        return f(i);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ t e(int i) {
        return f(i);
    }

    public z(b bVar, af afVar, ag agVar) {
        super(bVar, afVar, agVar);
    }
}
