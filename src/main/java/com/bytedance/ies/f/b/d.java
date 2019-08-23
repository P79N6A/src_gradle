package com.bytedance.ies.f.b;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public abstract class d<P, R> extends a<P, R> {
    @Nullable
    public abstract R invoke(@NonNull P p, @NonNull f fVar) throws Exception;

    protected static void terminate() throws q {
        throw new q(0);
    }

    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    protected static void terminate(String str) throws q {
        throw new q(0, str);
    }
}
