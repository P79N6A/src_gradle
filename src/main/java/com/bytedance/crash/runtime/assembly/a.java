package com.bytedance.crash.runtime.assembly;

import android.content.Context;
import com.bytedance.crash.d;
import com.bytedance.crash.e.c;
import com.bytedance.crash.i.k;
import com.bytedance.crash.j;
import java.util.Map;

public final class a extends c {
    public final com.bytedance.crash.e.a a(com.bytedance.crash.e.a aVar) {
        com.bytedance.crash.e.a a2 = super.a(aVar);
        c a3 = c.a(this.f19523b);
        a3.a((Map) j.a().a());
        a3.a(j.c().a());
        a3.a(this.f19524c.c());
        a2.a(a3);
        a2.a("process_name", (Object) com.bytedance.crash.i.a.d(this.f19523b));
        k.a(a2, a3, this.f19522a);
        return a2;
    }

    a(Context context, b bVar, BatteryWatcher batteryWatcher) {
        super(d.ANR, context, bVar, batteryWatcher);
    }
}
