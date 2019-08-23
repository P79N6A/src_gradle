package com.taobao.applink.f;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private String f79192a;

    /* renamed from: b  reason: collision with root package name */
    private String f79193b;

    /* renamed from: c  reason: collision with root package name */
    private String f79194c;

    /* renamed from: d  reason: collision with root package name */
    private String f79195d;

    /* renamed from: e  reason: collision with root package name */
    private String f79196e;

    public static List f(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                f fVar = new f();
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String str2 = null;
                fVar.e(jSONObject.has("handlerName") ? jSONObject.getString("handlerName") : null);
                fVar.c(jSONObject.has("callbackId") ? jSONObject.getString("callbackId") : null);
                fVar.b(jSONObject.has("responseData") ? jSONObject.getString("responseData") : null);
                fVar.a(jSONObject.has("responseId") ? jSONObject.getString("responseId") : null);
                if (jSONObject.has("data")) {
                    str2 = jSONObject.getString("data");
                }
                fVar.d(str2);
                arrayList.add(fVar);
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }

    public String a() {
        return this.f79193b;
    }

    public void a(String str) {
        this.f79193b = str;
    }

    public String b() {
        return this.f79194c;
    }

    public void b(String str) {
        this.f79194c = str;
    }

    public String c() {
        return this.f79192a;
    }

    public void c(String str) {
        this.f79192a = str;
    }

    public String d() {
        return this.f79195d;
    }

    public void d(String str) {
        this.f79195d = str;
    }

    public String e() {
        return this.f79196e;
    }

    public void e(String str) {
        this.f79196e = str;
    }

    public String f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("callbackId", c());
            jSONObject.put("data", d());
            jSONObject.put("handlerName", e());
            jSONObject.put("responseData", b());
            jSONObject.put("responseId", a());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }
}
