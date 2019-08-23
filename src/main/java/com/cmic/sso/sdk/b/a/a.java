package com.cmic.sso.sdk.b.a;

import org.json.JSONException;
import org.json.JSONObject;

public class a extends e {

    /* renamed from: a  reason: collision with root package name */
    private String f22991a;

    /* renamed from: b  reason: collision with root package name */
    private String f22992b;

    /* renamed from: c  reason: collision with root package name */
    private String f22993c;

    /* renamed from: d  reason: collision with root package name */
    private String f22994d;

    /* renamed from: e  reason: collision with root package name */
    private String f22995e;

    /* renamed from: f  reason: collision with root package name */
    private String f22996f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private long l;
    private String m;
    private JSONObject n;

    /* renamed from: com.cmic.sso.sdk.b.a.a$a  reason: collision with other inner class name */
    public static class C0248a {

        /* renamed from: a  reason: collision with root package name */
        private String f22997a;

        /* renamed from: b  reason: collision with root package name */
        private String f22998b;

        /* renamed from: c  reason: collision with root package name */
        private String f22999c;

        /* renamed from: d  reason: collision with root package name */
        private String f23000d;

        /* renamed from: e  reason: collision with root package name */
        private String f23001e;

        /* renamed from: f  reason: collision with root package name */
        private String f23002f;
        private String g;
        private String h;
        private String i;
        private String j;
        private String k;
        private String l;
        private String m;
        private String n;
        private String o;
        private String p;
        private String q;
        private String r;
        private String s;
        private String t;
        private String u;
        private String v;
        private String w;
        private String x;
        private String y;
        private String z;

        public JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("traceid", this.f22997a);
                jSONObject.put("phone_id", this.f22998b);
                jSONObject.put("os", this.f22999c);
                jSONObject.put("dev_model", this.f23000d);
                jSONObject.put("dev_brand", this.f23001e);
                jSONObject.put("mnc", this.f23002f);
                jSONObject.put("client_type", this.g);
                jSONObject.put("network_type", this.h);
                jSONObject.put("cpuid", this.i);
                jSONObject.put("sim_num", this.j);
                jSONObject.put("imei", this.k);
                jSONObject.put("imsi", this.l);
                jSONObject.put("sub_imei", this.m);
                jSONObject.put("sub_imsi", this.n);
                jSONObject.put("dev_mac", this.o);
                jSONObject.put("lac", this.p);
                jSONObject.put("loc_info", this.q);
                jSONObject.put("cell_id", this.r);
                jSONObject.put("is_wifi", this.s);
                jSONObject.put("wifi_mac", this.t);
                jSONObject.put("wifi_ssid", this.u);
                jSONObject.put("ipv4_list", this.v);
                jSONObject.put("ipv6_list", this.w);
                jSONObject.put("is_cert", this.x);
                jSONObject.put("server_addr", this.y);
                jSONObject.put("is_root", this.z);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        public void a(String str) {
            this.f22997a = str;
        }

        public void b(String str) {
            this.f22998b = str;
        }

        public void c(String str) {
            this.f22999c = str;
        }

        public void d(String str) {
            this.f23000d = str;
        }

        public void e(String str) {
            this.f23001e = str;
        }

        public void f(String str) {
            this.f23002f = str;
        }

        public void g(String str) {
            this.g = str;
        }

        public void h(String str) {
            this.h = str;
        }

        public void i(String str) {
            this.i = str;
        }

        public void j(String str) {
            this.j = str;
        }

        public void k(String str) {
            this.k = str;
        }

        public void l(String str) {
            this.l = str;
        }

        public void m(String str) {
            this.m = str;
        }

        public void n(String str) {
            this.n = str;
        }

        public void o(String str) {
            this.o = str;
        }

        public void p(String str) {
            this.p = str;
        }

        public void q(String str) {
            this.q = str;
        }

        public void r(String str) {
            this.r = str;
        }

        public void s(String str) {
            this.s = str;
        }

        public void t(String str) {
            this.t = str;
        }

        public void u(String str) {
            this.u = str;
        }

        public void v(String str) {
            this.v = str;
        }

        public void w(String str) {
            this.w = str;
        }

        public void x(String str) {
            this.x = str;
        }

        public void y(String str) {
            this.y = str;
        }

        public void z(String str) {
            this.z = str;
        }
    }

    public long a() {
        return this.l;
    }

    public String toString() {
        return b().toString();
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", this.f22991a);
            jSONObject.put("msgid", this.f22992b);
            jSONObject.put("appid", this.f22993c);
            jSONObject.put("scrip", this.f22994d);
            jSONObject.put("sign", this.f22995e);
            jSONObject.put("interfacever", this.f22996f);
            jSONObject.put("userCapaid", this.g);
            jSONObject.put("clienttype", this.h);
            jSONObject.put("sourceid", this.i);
            jSONObject.put("authenticated_appid", this.j);
            jSONObject.put("genTokenByAppid", this.k);
            jSONObject.put("rcData", this.n);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void b(String str) {
        this.i = str;
    }

    public void c(String str) {
        this.m = str;
    }

    public void d(String str) {
        this.f22996f = str;
    }

    public void e(String str) {
        this.g = str;
    }

    public void f(String str) {
        this.f22991a = str;
    }

    public void g(String str) {
        this.f22992b = str;
    }

    public void h(String str) {
        this.f22993c = str;
    }

    public void i(String str) {
        this.f22994d = str;
    }

    public void j(String str) {
        this.f22995e = str;
    }

    public void k(String str) {
        this.j = str;
    }

    public void l(String str) {
        this.k = str;
    }

    public void a(long j2) {
        this.l = j2;
    }

    public void a(String str) {
        this.h = str;
    }

    public void a(JSONObject jSONObject) {
        this.n = jSONObject;
    }

    public String m(String str) {
        return n(this.f22991a + this.f22993c + str + this.f22994d);
    }
}
