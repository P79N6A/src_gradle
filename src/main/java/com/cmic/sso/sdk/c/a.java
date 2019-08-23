package com.cmic.sso.sdk.c;

import com.cmic.sso.sdk.b.a.e;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a extends e {

    /* renamed from: a  reason: collision with root package name */
    public static ArrayList<Throwable> f23036a = new ArrayList<>();
    private String A;
    private String B;
    private String C;
    private String D;
    private String E;
    private String F;
    private String G;
    private String H;
    private String I;
    private String J;
    private String K;
    private String L;
    private String M;

    /* renamed from: b  reason: collision with root package name */
    private String f23037b;

    /* renamed from: c  reason: collision with root package name */
    private String f23038c;

    /* renamed from: d  reason: collision with root package name */
    private String f23039d;

    /* renamed from: e  reason: collision with root package name */
    private String f23040e;

    /* renamed from: f  reason: collision with root package name */
    private String f23041f;
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
    private JSONArray r;
    private String s;
    private String t;
    private String u = "";
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;

    public long a() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.s = PushConstants.PUSH_TYPE_NOTIFY;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("traceId", this.f23037b);
            jSONObject.put("appid", this.M);
            jSONObject.put("requestTime", this.f23038c);
            jSONObject.put("responseTime", this.f23039d);
            jSONObject.put("elapsedTime", this.f23040e);
            jSONObject.put("requestType", this.f23041f);
            jSONObject.put("interfaceType", this.u);
            jSONObject.put("interfaceCode", this.v);
            jSONObject.put("interfaceElasped", this.w);
            jSONObject.put("loginType", this.k);
            jSONObject.put("appName", this.g);
            jSONObject.put("appVersion", this.h);
            jSONObject.put("sdkVersion", this.i);
            jSONObject.put("networkType", this.j);
            jSONObject.put("networkClass", this.p);
            jSONObject.put("brand", this.x);
            jSONObject.put("reqDevice", this.l);
            jSONObject.put("reqSystem", this.m);
            jSONObject.put("wifiIPAddr", this.y);
            jSONObject.put("wifiMac", this.z);
            jSONObject.put("IPv4List", this.A);
            jSONObject.put("IPv6List", this.B);
            jSONObject.put("deviceid", this.C);
            jSONObject.put("iccid", this.D);
            jSONObject.put("subiccid", this.E);
            jSONObject.put("imei", this.F);
            jSONObject.put("imsi", this.G);
            jSONObject.put("subimei", this.H);
            jSONObject.put("subimsi", this.I);
            jSONObject.put("is_root", this.J);
            jSONObject.put("SMSAuthOn", this.s);
            jSONObject.put("clientType", "android");
            jSONObject.put("timeOut", this.t);
            jSONObject.put("simCardNum", this.q);
            jSONObject.put("operatorType", this.n);
            jSONObject.put("networkSwitchTime", this.o);
            jSONObject.put("exceptionStackTrace", this.r);
            jSONObject.put("imsiState", this.K);
            jSONObject.put("resultCode", this.L);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    public void A(String str) {
        this.l = str;
    }

    /* access modifiers changed from: package-private */
    public void B(String str) {
        this.m = str;
    }

    public void C(String str) {
        this.k = str;
    }

    /* access modifiers changed from: package-private */
    public void D(String str) {
        this.f23037b = str;
    }

    public void E(String str) {
        this.f23038c = str;
    }

    /* access modifiers changed from: package-private */
    public void F(String str) {
        this.p = str;
    }

    public void G(String str) {
        this.f23039d = str;
    }

    public void H(String str) {
        this.f23041f = str;
    }

    /* access modifiers changed from: package-private */
    public void I(String str) {
        this.i = str;
    }

    /* access modifiers changed from: package-private */
    public void J(String str) {
        this.j = str;
    }

    public void b(String str) {
        this.K = str;
    }

    public void c(String str) {
        this.L = str;
    }

    public void d(String str) {
        this.y = str;
    }

    public void e(String str) {
        this.z = str;
    }

    public void f(String str) {
        this.A = str;
    }

    public void g(String str) {
        this.B = str;
    }

    public void h(String str) {
        this.C = str;
    }

    public void i(String str) {
        this.D = str;
    }

    public void j(String str) {
        this.E = str;
    }

    public void k(String str) {
        this.F = str;
    }

    public void l(String str) {
        this.G = str;
    }

    public void m(String str) {
        this.H = str;
    }

    public void o(String str) {
        this.I = str;
    }

    public void p(String str) {
        this.J = str;
    }

    public void q(String str) {
        this.x = str;
    }

    public void r(String str) {
        this.w = str;
    }

    public void s(String str) {
        this.v = str;
    }

    public void t(String str) {
        this.u = str;
    }

    public void u(String str) {
        this.g = str;
    }

    public void v(String str) {
        this.h = str;
    }

    public void w(String str) {
        this.t = str;
    }

    public void x(String str) {
        this.f23040e = str;
    }

    /* access modifiers changed from: package-private */
    public void y(String str) {
        this.q = str;
    }

    /* access modifiers changed from: package-private */
    public void z(String str) {
        this.n = str;
    }

    public void a(String str) {
        this.M = str;
    }

    /* access modifiers changed from: package-private */
    public void a(JSONArray jSONArray) {
        this.r = jSONArray;
    }
}
