package com.alipay.c.d;

import android.content.Context;
import com.alipay.c.f.e;
import com.alipay.c.f.f;
import com.alipay.d.a.a.a.a;
import com.alipay.d.a.a.b.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c {
    public static Map<String, String> a(Context context) {
        b bVar = b.f5358a;
        HashMap hashMap = new HashMap();
        f a2 = e.a(context);
        String a3 = b.a(context);
        String b2 = b.b(context);
        String l = b.l(context);
        String o = b.o(context);
        String n = b.n(context);
        if (a2 != null) {
            if (a.a(a3)) {
                a3 = a2.a();
            }
            if (a.a(b2)) {
                b2 = a2.b();
            }
            if (a.a(l)) {
                l = a2.c();
            }
            if (a.a(o)) {
                o = a2.d();
            }
            if (a.a(n)) {
                n = a2.e();
            }
        }
        f fVar = new f(a3, b2, l, o, n);
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("imei", fVar.a());
                jSONObject.put("imsi", fVar.b());
                jSONObject.put("mac", fVar.c());
                jSONObject.put("bluetoothmac", fVar.d());
                jSONObject.put("gsi", fVar.e());
                String jSONObject2 = jSONObject.toString();
                com.alipay.c.h.a.a("device_feature_file_name", "device_feature_file_key", jSONObject2);
                com.alipay.c.h.a.a(context, "device_feature_prefs_name", "device_feature_prefs_key", jSONObject2);
            } catch (Exception e2) {
                com.alipay.c.c.a.a((Throwable) e2);
            }
        }
        hashMap.put("AD1", a3);
        hashMap.put("AD2", b2);
        hashMap.put("AD3", b.g(context));
        hashMap.put("AD5", b.i(context));
        hashMap.put("AD6", b.j(context));
        hashMap.put("AD7", b.k(context));
        hashMap.put("AD8", l);
        hashMap.put("AD9", b.m(context));
        hashMap.put("AD10", n);
        hashMap.put("AD11", b.c());
        hashMap.put("AD12", bVar.d());
        String e3 = b.e();
        if (a.a(e3)) {
            e3 = b.f();
        }
        hashMap.put("AD13", e3);
        hashMap.put("AD14", b.h());
        hashMap.put("AD15", b.i());
        hashMap.put("AD16", b.j());
        hashMap.put("AD17", "");
        hashMap.put("AD18", o);
        hashMap.put("AD19", b.p(context));
        hashMap.put("AD20", b.k());
        hashMap.put("AD21", b.f(context));
        hashMap.put("AD22", "");
        hashMap.put("AD23", b.l());
        hashMap.put("AD24", a.f(b.h(context)));
        hashMap.put("AD26", b.e(context));
        hashMap.put("AD27", b.q());
        hashMap.put("AD28", b.s());
        hashMap.put("AD29", b.u());
        hashMap.put("AD30", b.r());
        hashMap.put("AD31", b.t());
        hashMap.put("AD32", b.o());
        hashMap.put("AD33", b.p());
        hashMap.put("AD34", b.s(context));
        hashMap.put("AD35", b.t(context));
        hashMap.put("AD36", b.r(context));
        hashMap.put("AD37", b.n());
        hashMap.put("AD38", b.m());
        hashMap.put("AD39", b.c(context));
        hashMap.put("AD40", b.d(context));
        hashMap.put("AD41", b.a());
        hashMap.put("AD42", b.b());
        hashMap.put("AL3", b.q(context));
        return hashMap;
    }
}
