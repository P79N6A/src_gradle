package com.cmic.sso.sdk.b.a;

import org.json.JSONException;
import org.json.JSONObject;

public class b extends e {

    /* renamed from: a  reason: collision with root package name */
    private String f23003a;

    /* renamed from: b  reason: collision with root package name */
    private String f23004b;

    /* renamed from: c  reason: collision with root package name */
    private String f23005c;

    /* renamed from: d  reason: collision with root package name */
    private String f23006d;

    /* renamed from: e  reason: collision with root package name */
    private String f23007e;

    /* renamed from: f  reason: collision with root package name */
    private String f23008f;
    private String g;
    private String h;

    public long a() {
        return 0;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", this.f23003a);
            jSONObject.put("apptype", this.f23004b);
            jSONObject.put("phone_ID", this.f23005c);
            jSONObject.put("certflag", this.f23006d);
            jSONObject.put("sdkversion", this.f23007e);
            jSONObject.put("appid", this.f23008f);
            jSONObject.put("expandparams", this.g);
            jSONObject.put("sign", this.h);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String c() {
        return n(this.f23003a + this.f23007e + this.f23008f + "iYm0HAnkxQtpvN44").toLowerCase();
    }

    public void b(String str) {
        this.f23004b = str;
    }

    public void c(String str) {
        this.f23005c = str;
    }

    public void d(String str) {
        this.f23006d = str;
    }

    public void e(String str) {
        this.f23007e = str;
    }

    public void f(String str) {
        this.f23008f = str;
    }

    public void g(String str) {
        this.h = str;
    }

    public void a(String str) {
        this.f23003a = str;
    }
}
