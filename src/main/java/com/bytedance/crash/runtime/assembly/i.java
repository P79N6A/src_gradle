package com.bytedance.crash.runtime.assembly;

import android.content.Context;
import com.bytedance.crash.d;
import com.bytedance.crash.e.a;
import com.bytedance.crash.e.c;
import com.bytedance.crash.i.k;
import com.bytedance.crash.j;
import java.util.Map;

public final class i extends c {
    public final a a(a aVar) {
        a a2 = super.a(aVar);
        a2.a("app_count", (Object) 1);
        a2.a("magic_tag", (Object) "ss_app_log");
        b(a2);
        c a3 = c.a(this.f19523b);
        a3.a((Map) j.a().a());
        a3.a(j.c().a());
        a3.a(this.f19524c.c());
        a2.a(a3);
        k.a(a2, a3, this.f19522a);
        return a2;
    }

    i(Context context, b bVar, BatteryWatcher batteryWatcher) {
        super(d.JAVA, context, bVar, batteryWatcher);
    }
}
