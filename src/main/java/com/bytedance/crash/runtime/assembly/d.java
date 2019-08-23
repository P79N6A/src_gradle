package com.bytedance.crash.runtime.assembly;

import android.content.Context;
import com.bytedance.crash.e.a;
import com.bytedance.crash.i.k;

public final class d extends c {
    /* access modifiers changed from: protected */
    public final boolean a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean b() {
        return true;
    }

    public final a a(a aVar) {
        a a2 = super.a(aVar);
        b(a2);
        k.a(a2, null, this.f19522a);
        return a2;
    }

    d(Context context, b bVar, BatteryWatcher batteryWatcher) {
        super(com.bytedance.crash.d.BLOCK, context, bVar, batteryWatcher);
    }
}
