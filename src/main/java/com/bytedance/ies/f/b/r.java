package com.bytedance.ies.f.b;

import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import java.util.Set;
import org.json.JSONObject;

public final class r implements d {

    /* renamed from: a  reason: collision with root package name */
    private Set<String> f20686a;

    /* renamed from: b  reason: collision with root package name */
    private e f20687b;

    r(e eVar, Set<String> set) {
        this.f20686a = set;
        this.f20687b = eVar;
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        if (this.f20686a.contains(hVar.f20622c)) {
            jSONObject.put("code", "-1");
            return;
        }
        hVar.f20625f = false;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("func", hVar.f20622c);
        jSONObject2.put("__msg_type", hVar.f20620a);
        jSONObject2.put("__callback_id", hVar.f20621b);
        jSONObject2.put("params", hVar.f20623d);
        jSONObject2.put("JSSDK", hVar.f20624e);
        this.f20687b.a(jSONObject2);
        new StringBuilder("Legacy call forwarded to new bridge: ").append(hVar.toString());
    }
}
