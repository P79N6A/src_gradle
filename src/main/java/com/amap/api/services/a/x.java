package com.amap.api.services.a;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.PoiItem;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class x extends w<String, PoiItem> {
    /* access modifiers changed from: protected */
    public String g() {
        return j();
    }

    public String i() {
        return i.a() + "/place/detail?";
    }

    private String j() {
        return "id=" + ((String) this.f6441a) + "&output=json" + "&extensions=all" + "&children=1" + ("&key=" + bf.f(this.f6444d));
    }

    /* renamed from: f */
    public PoiItem a(String str) throws AMapException {
        try {
            return a(new JSONObject(str));
        } catch (JSONException e2) {
            j.a(e2, "PoiSearchIdHandler", "paseJSONJSONException");
            return null;
        } catch (Exception e3) {
            j.a(e3, "PoiSearchIdHandler", "paseJSONException");
            return null;
        }
    }

    private PoiItem a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("pois");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return null;
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return null;
        }
        return p.d(optJSONObject);
    }

    public x(Context context, String str) {
        super(context, str);
    }
}
