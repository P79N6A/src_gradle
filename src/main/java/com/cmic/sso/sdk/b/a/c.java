package com.cmic.sso.sdk.b.a;

import com.cmic.sso.sdk.d.g;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONException;
import org.json.JSONObject;

public class c extends e {

    /* renamed from: a  reason: collision with root package name */
    private a f23009a;

    /* renamed from: b  reason: collision with root package name */
    private String f23010b;

    /* renamed from: c  reason: collision with root package name */
    private String f23011c;

    public static class a {
        private String A = "";
        private String B = "";
        private String C = "";
        private String D = "";
        private String E;

        /* renamed from: a  reason: collision with root package name */
        private String f23012a = "";

        /* renamed from: b  reason: collision with root package name */
        private String f23013b = "";

        /* renamed from: c  reason: collision with root package name */
        private String f23014c = "";

        /* renamed from: d  reason: collision with root package name */
        private String f23015d = "";

        /* renamed from: e  reason: collision with root package name */
        private String f23016e = "";

        /* renamed from: f  reason: collision with root package name */
        private String f23017f = "";
        private String g = "";
        private String h = "";
        private String i = "";
        private String j = "";
        private String k = "";
        private String l = "";
        private String m = "";
        private String n = "";
        private String o = "";
        private String p = "";
        private long q;
        private String r = "";
        private String s = "";
        private String t = "";
        private String u = "";
        private String v = "";
        private String w = "";
        private String x = "";
        private String y = "";
        private String z = "";

        private String x(String str) {
            return str == null ? "" : str;
        }

        /* access modifiers changed from: package-private */
        public long a() {
            return this.q;
        }

        public String toString() {
            return this.f23012a + "&" + this.f23013b + "&" + this.f23014c + "&" + this.f23015d + "&" + this.f23016e + "&" + this.f23017f + "&" + this.g + "&" + this.h + "&" + this.i + "&" + this.j + "&" + this.k + "&" + this.l + "&" + this.m + "&6.0" + "&" + this.n + "&" + this.o + "&" + this.p + "&" + this.r + "&" + this.s + "&" + this.t + "&" + this.u + "&" + this.v + "&" + this.w + "&" + this.x + "&" + this.y + "&" + this.z + "&" + this.A + "&" + this.B + "&" + this.E + "&&" + this.C + "&" + this.D;
        }

        public void b(String str) {
            this.D = str;
        }

        public void c(String str) {
            this.y = str;
        }

        public void d(String str) {
            this.z = str;
        }

        public void a(long j2) {
            this.q = j2;
        }

        public void e(String str) {
            this.f23012a = x(str);
        }

        public void f(String str) {
            this.f23013b = x(str);
        }

        public void g(String str) {
            this.f23014c = x(str);
        }

        public void h(String str) {
            this.f23015d = x(str);
        }

        public void i(String str) {
            this.f23016e = x(str);
        }

        public void j(String str) {
            this.f23017f = x(str);
        }

        public void k(String str) {
            this.g = x(str);
        }

        public void l(String str) {
            this.h = x(str);
        }

        public void m(String str) {
            this.i = x(str);
        }

        public void p(String str) {
            this.l = x(str);
        }

        public void q(String str) {
            this.m = x(str);
        }

        public void r(String str) {
            this.o = x(str);
        }

        public void s(String str) {
            this.p = x(str);
        }

        public void t(String str) {
            this.A = x(str);
        }

        public void u(String str) {
            this.B = x(str);
        }

        public void v(String str) {
            this.E = x(str);
        }

        public void a(String str) {
            this.C = str;
        }

        public void n(String str) {
            String x2 = x(str);
            try {
                this.j = URLEncoder.encode(x2, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                this.j = x2;
            }
        }

        public void o(String str) {
            String x2 = x(str);
            try {
                this.k = URLEncoder.encode(x2, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                this.k = x2;
            }
        }

        public String w(String str) {
            return g.a(this.f23013b + this.f23014c + this.f23015d + this.f23016e + this.f23017f + this.g + this.h + this.i + this.j + this.k + this.l + this.m + this.o + this.p + str + this.r + this.s + this.t + this.u + this.v + this.w + this.x + this.y + this.z + this.A + this.B + this.C + this.D);
        }
    }

    public a c() {
        return this.f23009a;
    }

    public long a() {
        return this.f23009a.a();
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("encrypted", this.f23011c);
            jSONObject.put("reqdata", com.cmic.sso.sdk.d.a.a(this.f23010b, this.f23009a.toString()));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void a(a aVar) {
        this.f23009a = aVar;
    }

    public void b(String str) {
        this.f23011c = str;
    }

    public void a(String str) {
        this.f23010b = str;
    }
}
