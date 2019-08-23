package com.cmic.sso.sdk.b.a;

import com.cmic.sso.sdk.d.g;
import org.json.JSONException;
import org.json.JSONObject;

public class d extends e {

    /* renamed from: a  reason: collision with root package name */
    private b f23018a;

    /* renamed from: b  reason: collision with root package name */
    private a f23019b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private JSONObject f23020a;

        public JSONObject a() {
            return this.f23020a;
        }

        public void a(JSONObject jSONObject) {
            this.f23020a = jSONObject;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private String f23021a;

        /* renamed from: b  reason: collision with root package name */
        private String f23022b;

        /* renamed from: c  reason: collision with root package name */
        private String f23023c;

        /* renamed from: d  reason: collision with root package name */
        private String f23024d;

        /* renamed from: e  reason: collision with root package name */
        private String f23025e;

        public String a() {
            return this.f23025e;
        }

        public String b() {
            return this.f23024d;
        }

        public String c() {
            return this.f23021a;
        }

        public String d() {
            return this.f23022b;
        }

        public String e() {
            return this.f23023c;
        }

        public String f() {
            return g.a(this.f23025e + this.f23024d + this.f23023c + this.f23022b + "@Fdiwmxy7CBDDQNUI");
        }

        public void a(String str) {
            this.f23025e = str;
        }

        public void b(String str) {
            this.f23024d = str;
        }

        public void c(String str) {
            this.f23021a = str;
        }

        public void d(String str) {
            this.f23022b = str;
        }

        public void e(String str) {
            this.f23023c = str;
        }
    }

    public long a() {
        return 0;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject2.put("sign", this.f23018a.c());
            jSONObject2.put("msgid", this.f23018a.d());
            jSONObject2.put("systemtime", this.f23018a.e());
            jSONObject2.put("appid", this.f23018a.b());
            jSONObject2.put("version", this.f23018a.a());
            jSONObject.put("header", jSONObject2);
            jSONObject3.put("log", this.f23019b.a());
            jSONObject.put("body", jSONObject3);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void a(a aVar) {
        this.f23019b = aVar;
    }

    public void a(b bVar) {
        this.f23018a = bVar;
    }
}
