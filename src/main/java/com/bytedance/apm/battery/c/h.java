package com.bytedance.apm.battery.c;

import com.bytedance.apm.battery.a.d;
import com.bytedance.apm.battery.b.b;
import com.bytedance.apm.k.k;
import com.bytedance.apm.k.m;
import java.lang.reflect.Method;
import java.util.List;

public final class h extends b implements d {
    public final String a() {
        return "android.os.IPowerManager";
    }

    public h() {
        super("power");
    }

    public final void a(Method method, Object[] objArr) {
        try {
            String name = method.getName();
            if ("acquireWakeLock".equals(name)) {
                a("");
                return;
            }
            if ("releaseWakeLock".equals(name)) {
                b("");
            }
        } catch (Exception unused) {
        }
    }

    public final void a(b bVar, List<com.bytedance.apm.f.b> list, int i, int i2) {
        m a2 = a(list, i, i2);
        bVar.g = k.a((Long) a2.f19039a);
        bVar.l = k.a((Long) a2.f19040b);
    }
}
