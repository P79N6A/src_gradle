package com.bytedance.apm.d.a;

import com.bytedance.apm.d.c;
import org.json.JSONObject;

public class a extends com.bytedance.apm.d.a<c> {

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f1955b;

    private a() {
    }

    public static a b() {
        if (f1955b == null) {
            synchronized (a.class) {
                if (f1955b == null) {
                    f1955b = new a();
                }
            }
        }
        return f1955b;
    }

    public final void d(c cVar) {
        JSONObject a2 = cVar.a();
        boolean a3 = cVar.a(this);
        if (com.bytedance.apm.c.d()) {
            String str = com.bytedance.apm.h.a.h;
            com.bytedance.apm.h.c.a(str, "logType: " + cVar.b() + ", subType: " + cVar.c() + "data: " + a2, " ,sample: " + a3);
        }
        if (a3 || cVar.d()) {
            a(cVar.b(), cVar.c(), a2, a3, false);
        }
    }
}
