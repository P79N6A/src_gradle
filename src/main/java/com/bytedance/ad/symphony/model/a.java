package com.bytedance.ad.symphony.model;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class a {

    /* renamed from: e  reason: collision with root package name */
    private static final String f7640e = "a";

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.ad.symphony.f.a f7641a;

    /* renamed from: b  reason: collision with root package name */
    public List<String> f7642b;

    /* renamed from: c  reason: collision with root package name */
    public JSONObject f7643c;

    /* renamed from: d  reason: collision with root package name */
    public long f7644d;

    private a() {
    }

    public static a a(JSONObject jSONObject) {
        a aVar = new a();
        try {
            aVar.f7644d = jSONObject.optLong("ad_id");
            aVar.f7642b = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("placement_type");
            for (int i = 0; i < jSONArray.length(); i++) {
                aVar.f7642b.add(jSONArray.getString(i));
            }
            aVar.f7643c = jSONObject.optJSONObject("log_extra");
            aVar.f7641a = com.bytedance.ad.symphony.f.a.a(jSONObject.optJSONObject("fill_strategy"));
        } catch (Exception e2) {
            e2.getMessage();
        }
        return aVar;
    }
}
