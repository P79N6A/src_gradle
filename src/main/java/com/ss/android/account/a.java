package com.ss.android.account;

import com.bytedance.sdk.account.k.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class a extends b {
    public String g;
    public String h;
    public String i;
    private final Map<String, com.ss.android.account.b.a> j = new HashMap();

    public final Map<String, com.ss.android.account.b.a> b() {
        return this.j;
    }

    public void a() throws Exception {
        super.a();
        JSONObject jSONObject = this.f22520e;
        if (jSONObject.has("name")) {
            this.g = jSONObject.optString("name");
        } else if (jSONObject.has("username")) {
            this.g = jSONObject.optString("username");
        }
        this.i = jSONObject.optString("avatar_url");
        this.h = jSONObject.optString("description");
    }

    public a(JSONObject jSONObject) {
        super(jSONObject);
    }
}
