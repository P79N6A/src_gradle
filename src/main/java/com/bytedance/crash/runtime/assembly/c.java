package com.bytedance.crash.runtime.assembly;

import android.content.Context;
import android.os.Process;
import com.bytedance.crash.b;
import com.bytedance.crash.d;
import com.bytedance.crash.e.a;
import com.bytedance.crash.f;
import com.bytedance.crash.i.n;
import com.bytedance.crash.j;
import com.bytedance.crash.runtime.e;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    protected d f19522a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f19523b;

    /* renamed from: c  reason: collision with root package name */
    protected f f19524c = j.a().f19511a;

    /* renamed from: d  reason: collision with root package name */
    protected b f19525d;

    /* renamed from: e  reason: collision with root package name */
    protected BatteryWatcher f19526e;

    /* access modifiers changed from: protected */
    public boolean a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void c(a aVar) {
        aVar.b(e.a(j.e().g, j.e().h));
    }

    static void b(a aVar) {
        Map<String, Object> a2 = j.a().a();
        if (a2 != null) {
            if (a2.containsKey("app_version")) {
                aVar.a("crash_version", a2.get("app_version"));
            }
            if (a2.containsKey("version_name")) {
                aVar.a("app_version", a2.get("version_name"));
            }
            if (a2.containsKey("version_code")) {
                try {
                    aVar.a("crash_version_code", (Object) Integer.valueOf(Integer.parseInt(a2.get("version_code").toString())));
                } catch (Exception unused) {
                    aVar.a("crash_version_code", a2.get("version_code"));
                }
            }
            if (a2.containsKey("update_version_code")) {
                try {
                    aVar.a("crash_update_version_code", (Object) Integer.valueOf(Integer.parseInt(a2.get("update_version_code").toString())));
                } catch (Exception unused2) {
                    aVar.a("crash_update_version_code", a2.get("update_version_code"));
                }
            }
        }
    }

    public a a(a aVar) {
        if (aVar == null) {
            aVar = new a();
        }
        if (b() && this.f19525d != null) {
            aVar.a(this.f19525d);
        }
        aVar.a(j.f());
        aVar.a("is_background", (Object) Boolean.valueOf(!com.bytedance.crash.i.a.a(this.f19523b)));
        aVar.a("pid", (Object) Integer.valueOf(Process.myPid()));
        aVar.a("battery", (Object) Integer.valueOf(this.f19526e.f19513a));
        aVar.a((Map<String, Integer>) null);
        aVar.b((Map<Integer, String>) j.f19487f);
        aVar.a(j.g, j.h);
        aVar.a((List<String>) null);
        aVar.a(n.a(this.f19523b));
        if (a()) {
            c(aVar);
        }
        aVar.a(this.f19524c.d());
        String str = j.f19484c;
        if (str != null) {
            aVar.a("business", (Object) str);
        }
        if (j.f19485d) {
            aVar.a("is_mp", (Object) 1);
        }
        aVar.c(j.b().f19341b);
        aVar.a("crash_uuid", (Object) UUID.randomUUID().toString());
        b b2 = j.b();
        List<com.bytedance.crash.a> list = b2.f19340a.get(this.f19522a);
        if (list != null) {
            JSONObject jSONObject = new JSONObject();
            for (com.bytedance.crash.a a2 : list) {
                Map<? extends String, ? extends String> a3 = a2.a(this.f19522a);
                if (a3 != null) {
                    try {
                        for (String str2 : a3.keySet()) {
                            jSONObject.put(str2, a3.get(str2));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            aVar.a("custom", (Object) jSONObject);
        }
        return aVar;
    }

    c(d dVar, Context context, b bVar, BatteryWatcher batteryWatcher) {
        this.f19522a = dVar;
        this.f19523b = context;
        this.f19525d = bVar;
        this.f19526e = batteryWatcher;
    }
}
