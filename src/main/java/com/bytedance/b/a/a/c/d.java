package com.bytedance.b.a.a.c;

import android.text.TextUtils;
import com.bytedance.b.a.a.f.b;
import com.bytedance.b.a.a.f.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private long f19179a;

    /* renamed from: b  reason: collision with root package name */
    private a f19180b;

    public interface a {
        void a(c cVar);

        boolean c(int i);
    }

    public d(a aVar) {
        this.f19180b = aVar;
    }

    private c b(JSONObject jSONObject) throws JSONException {
        c c2 = c(new JSONObject(jSONObject.getString("app_data").replaceAll("\\\\", "")));
        if (c2 == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("canvas");
        c2.g = jSONObject2.optInt("w");
        c2.f19216f = jSONObject2.optInt("h");
        c2.f19215e = jSONObject2.optString("bgnd");
        return c2;
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                c cVar = null;
                if (jSONObject.has("source") && TextUtils.equals(jSONObject.optString("source"), "zego")) {
                    cVar = a(jSONObject);
                } else if (jSONObject.has("canvas")) {
                    cVar = b(jSONObject);
                }
                if (cVar != null) {
                    this.f19180b.a(cVar);
                }
            } catch (JSONException unused) {
            }
        }
    }

    private c a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = (JSONObject) jSONObject.get("info");
        if (!jSONObject2.has("app_data")) {
            return null;
        }
        JSONObject jSONObject3 = new JSONObject(jSONObject2.optString("app_data").replaceAll("\\\\", ""));
        c c2 = c(jSONObject3);
        if (c2 == null) {
            return null;
        }
        JSONObject optJSONObject = jSONObject3.optJSONObject("canvas");
        c2.g = optJSONObject.optInt("width");
        c2.f19216f = optJSONObject.optInt("height");
        c2.f19215e = optJSONObject.optString("background");
        return c2;
    }

    private c c(JSONObject jSONObject) throws JSONException {
        long optLong = jSONObject.optLong("timestamp");
        if (optLong == this.f19179a || !jSONObject.has("ver")) {
            return null;
        }
        int optInt = jSONObject.optInt("ver");
        if (!this.f19180b.c(optInt)) {
            return null;
        }
        this.f19179a = optLong;
        c cVar = new c();
        cVar.f19213c = optLong;
        cVar.f19211a = optInt;
        cVar.f19212b = jSONObject.optString("vendor");
        JSONArray jSONArray = new JSONArray(jSONObject.optString("grids"));
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = (JSONObject) jSONArray.opt(i);
            b b2 = new b().a(jSONObject2.optInt("type")).a(jSONObject2.optDouble("x"), jSONObject2.optDouble("y")).b(jSONObject2.optDouble("w"), jSONObject2.optDouble("h"));
            try {
                b2.a(jSONObject2.optLong("account"));
            } catch (Exception unused) {
                b2.a(0);
            }
            if (jSONObject2.has("uid")) {
                b2.b(jSONObject2.optInt("uid"));
            }
            if (jSONObject2.has("talk")) {
                boolean z = true;
                if (jSONObject2.optInt("talk") != 1) {
                    z = false;
                }
                b2.i = z;
            }
            try {
                b2.c(jSONObject2.optInt("stat"));
            } catch (Exception unused2) {
                b2.c(0);
            }
            cVar.f19214d.add(b2);
        }
        return cVar;
    }
}
