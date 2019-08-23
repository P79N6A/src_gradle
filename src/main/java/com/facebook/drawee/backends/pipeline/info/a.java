package com.facebook.drawee.backends.pipeline.info;

import com.facebook.common.logging.FLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f23652a = new ArrayList(2);

    public final synchronized void a(b bVar) {
        this.f23652a.add(bVar);
    }

    public final synchronized void b(b bVar) {
        this.f23652a.remove(bVar);
    }

    public a(b... bVarArr) {
        Collections.addAll(this.f23652a, bVarArr);
    }

    public final synchronized void a(String str, int i, boolean z) {
        int size = this.f23652a.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f23652a.get(i2);
            if (bVar != null) {
                try {
                    bVar.a(str, i, z);
                } catch (Exception e2) {
                    FLog.e("ForwardingImageOriginListener", "InternalListener exception in onImageLoaded", (Throwable) e2);
                }
            }
        }
    }
}
