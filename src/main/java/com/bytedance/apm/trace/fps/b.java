package com.bytedance.apm.trace.fps;

import com.bytedance.apm.c;
import com.bytedance.apm.j.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class b implements b.C0006b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, a> f19077a;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f19081a;

        /* renamed from: b  reason: collision with root package name */
        public float f19082b;

        /* renamed from: c  reason: collision with root package name */
        long f19083c = System.currentTimeMillis();

        /* renamed from: d  reason: collision with root package name */
        int f19084d = 1;

        a(String str, float f2) {
            this.f19081a = str;
            this.f19082b = f2;
        }
    }

    /* renamed from: com.bytedance.apm.trace.fps.b$b  reason: collision with other inner class name */
    static class C0141b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f19085a = new b((byte) 0);
    }

    private b() {
        this.f19077a = new HashMap<>();
        com.bytedance.apm.j.b.a().a((b.C0006b) this);
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public final void a(long j) {
        boolean z;
        float f2;
        if (!this.f19077a.isEmpty()) {
            Iterator<Map.Entry<String, a>> it2 = this.f19077a.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry next = it2.next();
                String str = (String) next.getKey();
                a aVar = (a) next.getValue();
                if (j - aVar.f19083c > 120000) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    it2.remove();
                    if (aVar.f19084d > 0) {
                        f2 = aVar.f19082b / ((float) aVar.f19084d);
                    } else {
                        f2 = -1.0f;
                    }
                    if (c.d()) {
                        new String[1][0] = "聚合 fps: " + str + " , value: " + f2;
                    }
                    if (f2 > 0.0f) {
                        float f3 = 60.0f;
                        if (f2 <= 60.0f) {
                            f3 = f2;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("fps", (double) f3);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("scene", str);
                            com.bytedance.apm.b.a("fps", str, jSONObject, jSONObject2, (JSONObject) null);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }
}
