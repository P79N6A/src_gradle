package com.bytedance.crash.runtime.assembly;

import android.content.Context;
import com.bytedance.crash.d;
import com.bytedance.crash.e.a;
import com.bytedance.crash.e.c;
import com.bytedance.crash.j;
import com.bytedance.crash.runtime.e;
import java.util.List;
import java.util.Map;

public final class k extends c {
    /* access modifiers changed from: protected */
    public final void c(a aVar) {
        List<String> a2 = e.a(aVar.f19418b);
        if (a2 == null || a2.size() <= 0) {
            super.c(aVar);
        } else {
            aVar.b(a2);
        }
    }

    public final a a(a aVar) {
        a a2 = super.a(aVar);
        c a3 = c.a(this.f19523b);
        a3.a((Map) j.a().a());
        a3.a(j.c().a());
        a3.a(this.f19524c.c());
        a2.a(a3);
        com.bytedance.crash.i.k.a(a2, a3, this.f19522a);
        return a2;
    }

    k(Context context, b bVar, BatteryWatcher batteryWatcher) {
        super(d.NATIVE, context, bVar, batteryWatcher);
    }
}
