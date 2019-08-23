package com.ss.android.vesdk.keyvaluepair;

import android.support.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f78020a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private StringBuilder f78021b = new StringBuilder();

    /* renamed from: c  reason: collision with root package name */
    private boolean f78022c = true;

    @Nullable
    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String next : this.f78020a.keySet()) {
                jSONObject.put(next, this.f78020a.get(next));
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final a a(String str, String str2) {
        this.f78020a.put(str, str2);
        b(str, str2);
        return this;
    }

    private void b(String str, String str2) {
        if (!this.f78022c) {
            this.f78021b.append(",");
        }
        this.f78021b.append("\"");
        this.f78021b.append(str);
        this.f78021b.append("\"");
        this.f78021b.append(":");
        this.f78021b.append("\"");
        this.f78021b.append(str2);
        this.f78021b.append("\"");
        if (this.f78022c) {
            this.f78022c = false;
        }
    }

    public final a a(String str, float f2) {
        Map<String, String> map = this.f78020a;
        map.put(str, f2);
        b(str, f2);
        return this;
    }

    public final a a(String str, int i) {
        Map<String, String> map = this.f78020a;
        map.put(str, i);
        b(str, i);
        return this;
    }
}
