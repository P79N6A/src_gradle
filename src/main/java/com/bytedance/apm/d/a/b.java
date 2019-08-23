package com.bytedance.apm.d.a;

import android.text.TextUtils;
import com.bytedance.apm.d.c;
import com.bytedance.apm.k.h;
import com.bytedance.apm.k.j;
import com.bytedance.apm.k.n;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends com.bytedance.apm.d.a<com.bytedance.apm.d.b.a> {

    /* renamed from: b  reason: collision with root package name */
    private volatile List<String> f1956b;

    /* renamed from: c  reason: collision with root package name */
    private volatile List<Pattern> f1957c;

    /* renamed from: d  reason: collision with root package name */
    private volatile List<String> f1958d;

    /* renamed from: e  reason: collision with root package name */
    private volatile List<Pattern> f1959e;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f18946a = new b((byte) 0);
    }

    private b() {
    }

    public static b b() {
        return a.f18946a;
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public final /* synthetic */ boolean b(c cVar) {
        com.bytedance.apm.d.b.a aVar = (com.bytedance.apm.d.b.a) cVar;
        if (aVar == null || TextUtils.isEmpty(aVar.f18951d)) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ void c(c cVar) {
        com.bytedance.apm.d.b.a aVar = (com.bytedance.apm.d.b.a) cVar;
        try {
            aVar.a(!a());
            aVar.a("image_monitor");
        } catch (Exception unused) {
        }
    }

    public final /* synthetic */ void d(c cVar) {
        boolean z;
        int i;
        com.bytedance.apm.d.b.a aVar = (com.bytedance.apm.d.b.a) cVar;
        String str = aVar.f18951d;
        if (!n.a(str, this.f1956b, this.f1957c) && j.b(com.bytedance.apm.c.a())) {
            JSONObject a2 = aVar.a();
            h.a(a2, aVar.h);
            if (a2 != null) {
                try {
                    a2.put("net_consume_type", "image_monitor");
                } catch (JSONException unused) {
                }
                boolean a3 = n.a(str, this.f1958d, this.f1959e);
                boolean z2 = true;
                if (a3 || a("image_sla_switch")) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i = 8;
                } else {
                    i = 0;
                }
                boolean b2 = b("smart_traffic");
                if (b2) {
                    i |= 4;
                }
                try {
                    a2.put("hit_rules", i);
                } catch (JSONException unused2) {
                }
                if (!z && !b2) {
                    z2 = false;
                }
                a("api_all", "api_all", a2, z2, false);
            }
        }
    }

    public final void onRefresh(JSONObject jSONObject, boolean z) {
        super.onRefresh(jSONObject, z);
        this.f1956b = n.a(jSONObject, "api_black_list");
        this.f1957c = n.b(jSONObject, "api_black_list");
        this.f1958d = n.a(jSONObject, "api_allow_list");
        this.f1959e = n.b(jSONObject, "api_allow_list");
    }
}
