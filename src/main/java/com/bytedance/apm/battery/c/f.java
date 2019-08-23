package com.bytedance.apm.battery.c;

import android.text.TextUtils;
import com.bytedance.apm.battery.a.d;
import com.bytedance.apm.battery.b.b;
import com.bytedance.apm.k.m;
import com.bytedance.apm.k.n;
import java.lang.reflect.Method;
import java.util.List;

public final class f extends b implements d {
    public final String a() {
        return "android.location.ILocationManager";
    }

    public f() {
        super("location");
    }

    public final void a(Method method, Object[] objArr) {
        try {
            String name = method.getName();
            if (TextUtils.equals(name, "requestLocationUpdates")) {
                a(n.a(objArr));
                return;
            }
            if (TextUtils.equals(name, "removeUpdates")) {
                b(n.a(objArr));
            }
        } catch (Exception unused) {
        }
    }

    public final void a(b bVar, List<com.bytedance.apm.f.b> list, int i, int i2) {
        m a2 = a(list, i, i2);
        bVar.f18922f = ((Long) a2.f19039a).longValue();
        bVar.k = ((Long) a2.f19040b).longValue();
    }
}
