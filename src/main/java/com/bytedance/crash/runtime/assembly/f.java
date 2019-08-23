package com.bytedance.crash.runtime.assembly;

import android.content.Context;
import com.bytedance.crash.d;
import com.bytedance.crash.e.a;
import com.bytedance.crash.e.c;
import com.bytedance.crash.j;
import java.util.Map;

@Deprecated
public final class f extends c {
    public final a a(a aVar) {
        a a2 = super.a(aVar);
        c a3 = c.a(this.f19523b);
        a3.a((Map) j.a().a());
        a3.a(j.c().a());
        a3.a(this.f19524c.c());
        a2.a(a3);
        return a2;
    }

    f(Context context, b bVar, BatteryWatcher batteryWatcher) {
        super(d.CUSTOM_JAVA, context, bVar, batteryWatcher);
    }
}
