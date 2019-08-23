package com.amap.api.services.a;

import android.content.Context;
import com.amap.api.services.cloud.CloudItemDetail;
import com.amap.api.services.core.AMapException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class g extends f<aa, CloudItemDetail> {
    public String i() {
        return i.c() + "/datasearch/id?";
    }

    /* access modifiers changed from: protected */
    public String g() {
        return ("key=" + bf.f(this.f6444d)) + ("&tableid=" + ((aa) this.f6441a).f6446a) + "&output=json" + ("&_id=" + ((aa) this.f6441a).f6447b);
    }

    /* renamed from: f */
    public CloudItemDetail a(String str) throws AMapException {
        CloudItemDetail cloudItemDetail;
        if (str == null || str.equals("")) {
            return null;
        }
        try {
            cloudItemDetail = b(new JSONObject(str));
        } catch (Exception | JSONException unused) {
            cloudItemDetail = null;
        }
        return cloudItemDetail;
    }

    private CloudItemDetail b(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has("datas")) {
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("datas");
        if (optJSONArray.length() <= 0) {
            return null;
        }
        JSONObject jSONObject2 = optJSONArray.getJSONObject(0);
        CloudItemDetail a2 = a(jSONObject2);
        a(a2, jSONObject2);
        return a2;
    }

    public g(Context context, aa aaVar) {
        super(context, aaVar);
    }
}
