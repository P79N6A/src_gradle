package com.bytedance.apm.d.a;

import android.text.TextUtils;
import com.bytedance.apm.k.h;
import com.bytedance.apm.k.j;
import com.bytedance.apm.k.n;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public final class c extends com.bytedance.apm.d.a<com.bytedance.apm.d.b.a> {

    /* renamed from: b  reason: collision with root package name */
    private int f1960b;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f1961c;

    /* renamed from: d  reason: collision with root package name */
    private volatile List<String> f1962d;

    /* renamed from: e  reason: collision with root package name */
    private List<Pattern> f1963e;

    /* renamed from: f  reason: collision with root package name */
    private List<String> f1964f;
    private List<Pattern> g;
    private List<String> h;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f18947a = new c((byte) 0);
    }

    private c() {
    }

    public static c b() {
        return a.f18947a;
    }

    /* synthetic */ c(byte b2) {
        this();
    }

    public final /* synthetic */ boolean b(com.bytedance.apm.d.c cVar) {
        com.bytedance.apm.d.b.a aVar = (com.bytedance.apm.d.b.a) cVar;
        if (aVar == null || TextUtils.isEmpty(aVar.f18951d)) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ void c(com.bytedance.apm.d.c cVar) {
        com.bytedance.apm.d.b.a aVar = (com.bytedance.apm.d.b.a) cVar;
        try {
            aVar.a(!a());
            aVar.a(aVar.f18948a);
        } catch (JSONException unused) {
        }
    }

    public final /* synthetic */ void d(com.bytedance.apm.d.c cVar) {
        boolean z;
        com.bytedance.apm.d.b.a aVar = (com.bytedance.apm.d.b.a) cVar;
        String str = aVar.f18951d;
        if (!n.a(str, this.f1962d, this.f1963e) && !n.a(str, this.h) && j.b(com.bytedance.apm.c.a())) {
            String str2 = aVar.f18948a;
            JSONObject a2 = aVar.a();
            h.a(a2, aVar.h);
            if (a2 != null) {
                String str3 = aVar.f18948a;
                if (TextUtils.equals(str3, "api_all")) {
                    z = a(str, a2);
                } else if (!TextUtils.equals(str3, "api_error") || this.f1961c != 0) {
                    z = false;
                } else {
                    z = true;
                }
                a(str2, str2, a2, z, false);
            }
        }
    }

    private boolean a(String str, JSONObject jSONObject) {
        int i;
        int i2;
        if (n.a(str, this.f1964f, this.g) || this.f1960b != 0) {
            i = 1;
        } else {
            i = 0;
        }
        boolean b2 = b("smart_traffic");
        if (b2) {
            i2 = i | 4;
        } else {
            i2 = i;
        }
        try {
            jSONObject.put("hit_rules", i2);
        } catch (JSONException unused) {
        }
        if (i != 0 || b2) {
            return true;
        }
        return false;
    }

    public final void onRefresh(JSONObject jSONObject, boolean z) {
        this.f1962d = n.a(jSONObject, "api_black_list");
        this.f1963e = n.b(jSONObject, "api_black_list");
        this.f1964f = n.a(jSONObject, "api_allow_list");
        this.g = n.b(jSONObject, "api_allow_list");
        this.f1960b = jSONObject.optInt("enable_net_stats", 0);
        this.f1961c = jSONObject.optInt("disable_report_error", 0);
        this.h = n.a(jSONObject, "image_allow_list");
    }
}
