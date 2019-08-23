package com.bytedance.apm;

import com.bytedance.apm.a.c;
import com.bytedance.apm.d.a.a;
import com.bytedance.apm.d.b.e;
import com.bytedance.apm.d.b.f;
import com.bytedance.apm.d.b.g;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.k.h;
import org.json.JSONObject;

public final class b {
    public static boolean a(String str) {
        return ApmDelegate.getInstance().getServiceNameSwitch(str);
    }

    public static JSONObject a(JSONObject jSONObject) {
        try {
            JSONObject a2 = h.a(jSONObject);
            if (a2 == null) {
                a2 = new JSONObject();
            }
            if (a2.isNull("timestamp")) {
                a2.put("timestamp", System.currentTimeMillis());
            }
            return a2;
        } catch (Exception unused) {
            return jSONObject;
        }
    }

    public static void a(String str, JSONObject jSONObject) {
        a(str, jSONObject, false);
    }

    public static void a(final String str, final int i, JSONObject jSONObject) {
        final JSONObject a2 = a(jSONObject);
        com.bytedance.apm.j.b.a().a((Runnable) new Runnable() {
            public final void run() {
                a b2 = a.b();
                f fVar = new f(str, i, null, null, null, a2);
                b2.a(fVar);
            }
        });
    }

    public static void a(final String str, final String str2, JSONObject jSONObject) {
        try {
            final JSONObject a2 = h.a(jSONObject);
            final JSONObject a3 = a((JSONObject) null);
            com.bytedance.apm.j.b.a().a((Runnable) new Runnable() {
                public final void run() {
                    a.b().a(new g(str, str2, a2, a3));
                }
            });
        } catch (Exception unused) {
        }
    }

    @Deprecated
    public static void a(final String str, final JSONObject jSONObject, JSONObject jSONObject2) {
        final JSONObject a2 = a(jSONObject2);
        com.bytedance.apm.j.b.a().a((Runnable) new Runnable() {
            public final void run() {
                a b2 = a.b();
                f fVar = new f(str, 0, jSONObject, null, null, a2);
                b2.a(fVar);
            }
        });
    }

    public static void a(final String str, JSONObject jSONObject, final boolean z) {
        final JSONObject a2 = a(jSONObject);
        com.bytedance.apm.j.b.a().a((Runnable) new Runnable() {
            public final void run() {
                a.b().a(new com.bytedance.apm.d.b.b(str, a2, z));
            }
        });
    }

    public static void b(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        a(str, "", jSONObject, jSONObject2, jSONObject3);
    }

    @Deprecated
    public static void a(final String str, final int i, final JSONObject jSONObject, JSONObject jSONObject2) {
        final JSONObject a2 = a(jSONObject2);
        com.bytedance.apm.j.b.a().a((Runnable) new Runnable() {
            public final void run() {
                a b2 = a.b();
                f fVar = new f(str, i, jSONObject, null, null, a2);
                b2.a(fVar);
            }
        });
    }

    public static void a(final String str, final JSONObject jSONObject, final JSONObject jSONObject2, JSONObject jSONObject3) {
        final JSONObject a2 = a(jSONObject3);
        com.bytedance.apm.j.b.a().a((Runnable) new Runnable() {
            public final void run() {
                a b2 = a.b();
                f fVar = new f(str, 0, null, jSONObject, jSONObject2, a2);
                b2.a(fVar);
            }
        });
    }

    public static void a(String str, long j, long j2, String str2, c cVar) {
        ApmDelegate.getInstance().activeUploadAlog(str, j, j2, str2, cVar);
    }

    public static void a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (jSONObject != null) {
            try {
                final JSONObject a2 = h.a(jSONObject2);
                final JSONObject a3 = h.a(jSONObject);
                final JSONObject a4 = a(jSONObject3);
                com.bytedance.apm.j.b a5 = com.bytedance.apm.j.b.a();
                final String str3 = str;
                final String str4 = str2;
                AnonymousClass2 r0 = new Runnable() {
                    public final void run() {
                        a b2 = a.b();
                        e eVar = new e(str3, str4, a3, a2, a4);
                        b2.a(eVar);
                    }
                };
                a5.a((Runnable) r0);
            } catch (Exception unused) {
            }
        }
    }
}
