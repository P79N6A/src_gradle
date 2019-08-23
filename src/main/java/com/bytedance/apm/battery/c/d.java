package com.bytedance.apm.battery.c;

import android.text.TextUtils;
import com.bytedance.apm.battery.b.a;
import com.bytedance.apm.k.b;
import com.bytedance.apm.k.m;
import com.bytedance.apm.k.n;
import java.lang.reflect.Method;
import java.util.List;

public final class d extends a implements com.bytedance.apm.battery.a.d {
    public final String a() {
        return "android.app.IAlarmManager";
    }

    public d() {
        super("alarm");
    }

    public final void a(Method method, Object[] objArr) {
        try {
            if ("set".equals(method.getName())) {
                n.a(objArr);
                int intValue = objArr[b.a(objArr, Integer.class)].intValue();
                if (intValue == 2 || intValue == 0) {
                    com.bytedance.apm.f.b bVar = new com.bytedance.apm.f.b(this.f18924b, System.currentTimeMillis(), this.f18923a, true);
                    a.a().a(bVar);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void a(com.bytedance.apm.battery.b.b bVar, List<com.bytedance.apm.f.b> list, int i, int i2) {
        long j = 0;
        String str = null;
        long j2 = 0;
        while (i <= i2) {
            com.bytedance.apm.f.b bVar2 = list.get(i);
            if (TextUtils.equals(this.f18923a, bVar2.f18984d)) {
                String str2 = bVar2.l;
                if (str != null) {
                    TextUtils.equals(str, str2);
                }
                if (bVar2.f18982b) {
                    j++;
                } else if (bVar2.a()) {
                    j2++;
                }
                str = str2;
            }
            i++;
        }
        m mVar = new m(Long.valueOf(j), Long.valueOf(j2));
        bVar.h = ((Long) mVar.f19039a).longValue();
        bVar.m = ((Long) mVar.f19040b).longValue();
    }
}
