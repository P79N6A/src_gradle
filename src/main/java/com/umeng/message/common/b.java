package com.umeng.message.common;

import android.content.Context;
import android.os.Build;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.PushAgent;
import com.umeng.message.proguard.c;
import com.umeng.message.proguard.k;
import org.json.JSONObject;

public class b {

    /* renamed from: c  reason: collision with root package name */
    private static final String f81147c = "com.umeng.message.common.b";
    private int A;
    private String B;
    private String C;
    private String D;
    private String E;
    private String F;
    private String G;
    private String H;
    private final String I = "appkey";
    private final String J = "channel";
    private final String K = "device_id";
    private final String L = "idmd5";
    private final String M = "mc";
    private final String N = "din";
    private final String O = "push_switch";
    private final String P = "req_time";
    private final String Q = "android_id";
    private final String R = "serial_number";
    private final String S = "device_model";
    private final String T = "os";
    private final String U = "os_version";
    private final String V = "resolution";
    private final String W = "cpu";
    private final String X = "gpu_vender";
    private final String Y = "gpu_renderer";
    private final String Z = "app_version";
    private final String aa = "version_code";
    private final String ab = "package_name";
    private final String ac = "sdk_type";
    private final String ad = "sdk_version";
    private final String ae = "timezone";
    private final String af = "country";
    private final String ag = "language";
    private final String ah = "access";
    private final String ai = "access_subtype";
    private final String aj = "carrier";
    private final String al = "wrapper_type";
    private final String am = "wrapper_version";

    /* renamed from: d  reason: collision with root package name */
    private String f81148d;

    /* renamed from: e  reason: collision with root package name */
    private String f81149e;

    /* renamed from: f  reason: collision with root package name */
    private String f81150f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private long l;
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

    public boolean b() {
        if (this.f81148d == null || this.f81150f == null) {
            return false;
        }
        return true;
    }

    public b() {
    }

    public boolean a() {
        if (this.f81148d == null) {
            UMLog.mutlInfo(f81147c, 0, "missing appkey");
            return false;
        } else if (this.f81150f != null && this.g != null) {
            return true;
        } else {
            UMLog.mutlInfo(f81147c, 0, "missing device id");
            return false;
        }
    }

    private void c(Context context) {
        this.y = "Android";
        this.z = "6.0.0.001";
    }

    private void q(JSONObject jSONObject) throws Exception {
        jSONObject.put("sdk_type", this.y);
        jSONObject.put("sdk_version", this.z);
    }

    private void b(Context context) {
        this.v = UmengMessageDeviceConfig.getAppVersionName(context);
        this.w = UmengMessageDeviceConfig.getAppVersionCode(context);
        this.x = UmengMessageDeviceConfig.getPackageName(context);
    }

    private void d(Context context) {
        this.A = UmengMessageDeviceConfig.getTimeZone(context);
        String[] localeInfo = UmengMessageDeviceConfig.getLocaleInfo(context);
        this.B = localeInfo[0];
        this.C = localeInfo[1];
    }

    private void e(Context context) {
        String[] networkAccessMode = UmengMessageDeviceConfig.getNetworkAccessMode(context);
        this.D = networkAccessMode[0];
        this.E = networkAccessMode[1];
        this.F = UmengMessageDeviceConfig.getOperator(context);
    }

    private void g(JSONObject jSONObject) throws Exception {
        this.y = jSONObject.getString("sdk_type");
        this.z = jSONObject.getString("sdk_version");
    }

    private void p(JSONObject jSONObject) throws Exception {
        if (this.v != null) {
            jSONObject.put("app_version", this.v);
        }
        if (this.w != null) {
            jSONObject.put("version_code", this.w);
        }
    }

    private void r(JSONObject jSONObject) throws Exception {
        jSONObject.put("timezone", this.A);
        if (this.B != null) {
            jSONObject.put("country", this.B);
        }
        if (this.C != null) {
            jSONObject.put("language", this.C);
        }
    }

    private void t(JSONObject jSONObject) throws Exception {
        if (this.G != null) {
            jSONObject.put("wrapper_type", this.G);
        }
        if (this.H != null) {
            jSONObject.put("wrapper_version", this.H);
        }
    }

    public void a(JSONObject jSONObject) throws Exception {
        if (jSONObject != null) {
            d(jSONObject);
            e(jSONObject);
            f(jSONObject);
            g(jSONObject);
            h(jSONObject);
            i(jSONObject);
            j(jSONObject);
        }
    }

    private void a(Context context) {
        this.o = Build.MODEL;
        this.p = "Android";
        this.q = Build.VERSION.RELEASE;
        this.r = UmengMessageDeviceConfig.getResolution(context);
        this.s = UmengMessageDeviceConfig.getCPU();
        this.m = UmengMessageDeviceConfig.getAndroidId(context);
        this.n = UmengMessageDeviceConfig.getSerial_number();
    }

    private void f(JSONObject jSONObject) throws Exception {
        String str;
        String str2;
        String str3 = null;
        if (jSONObject.has("app_version")) {
            str = jSONObject.getString("app_version");
        } else {
            str = null;
        }
        this.v = str;
        if (jSONObject.has("version_code")) {
            str2 = jSONObject.getString("version_code");
        } else {
            str2 = null;
        }
        this.w = str2;
        if (jSONObject.has("package_name")) {
            str3 = jSONObject.getString("package_name");
        }
        this.x = str3;
    }

    private void h(JSONObject jSONObject) throws Exception {
        int i2;
        String str;
        if (jSONObject.has("timezone")) {
            i2 = jSONObject.getInt("timezone");
        } else {
            i2 = 8;
        }
        this.A = i2;
        String str2 = null;
        if (jSONObject.has("country")) {
            str = jSONObject.getString("country");
        } else {
            str = null;
        }
        this.B = str;
        if (jSONObject.has("language")) {
            str2 = jSONObject.getString("language");
        }
        this.C = str2;
    }

    private void i(JSONObject jSONObject) throws Exception {
        String str;
        String str2;
        String str3 = null;
        if (jSONObject.has("access")) {
            str = jSONObject.getString("access");
        } else {
            str = null;
        }
        this.D = str;
        if (jSONObject.has("access_subtype")) {
            str2 = jSONObject.getString("access_subtype");
        } else {
            str2 = null;
        }
        this.E = str2;
        if (jSONObject.has("carrier")) {
            str3 = jSONObject.getString("carrier");
        }
        this.F = str3;
    }

    private void j(JSONObject jSONObject) throws Exception {
        String str;
        String str2 = null;
        if (jSONObject.has("wrapper_type")) {
            str = jSONObject.getString("wrapper_type");
        } else {
            str = null;
        }
        this.G = str;
        if (jSONObject.has("wrapper_version")) {
            str2 = jSONObject.getString("wrapper_version");
        }
        this.H = str2;
    }

    private void n(JSONObject jSONObject) throws Exception {
        if (this.o != null) {
            jSONObject.put("device_model", this.o);
        }
        if (this.p != null) {
            jSONObject.put("os", this.p);
        }
        if (this.q != null) {
            jSONObject.put("os_version", this.q);
        }
    }

    private void o(JSONObject jSONObject) throws Exception {
        if (this.v != null) {
            jSONObject.put("app_version", this.v);
        }
        if (this.w != null) {
            jSONObject.put("version_code", this.w);
        }
        if (this.x != null) {
            jSONObject.put("package_name", this.x);
        }
    }

    private void s(JSONObject jSONObject) throws Exception {
        if (this.D != null) {
            jSONObject.put("access", this.D);
        }
        if (this.E != null) {
            jSONObject.put("access_subtype", this.E);
        }
        if (this.F != null) {
            jSONObject.put("carrier", this.F);
        }
    }

    public void c(JSONObject jSONObject) throws Exception {
        l(jSONObject);
        n(jSONObject);
        p(jSONObject);
        q(jSONObject);
        s(jSONObject);
    }

    private void d(JSONObject jSONObject) throws Exception {
        this.f81148d = jSONObject.getString("appkey");
        this.f81150f = jSONObject.getString("device_id");
        this.g = jSONObject.getString("idmd5");
        if (jSONObject.has("mc")) {
            this.h = jSONObject.getString("mc");
        }
        if (jSONObject.has("channel")) {
            this.f81149e = jSONObject.getString("channel");
        }
        if (jSONObject.has("req_time")) {
            this.l = jSONObject.getLong("req_time");
        }
    }

    private void l(JSONObject jSONObject) throws Exception {
        jSONObject.put("appkey", this.f81148d);
        if (this.f81148d == null || 24 != this.f81148d.length()) {
            this.j = c.a(this.j, "utf-8");
        } else {
            this.j = c.a(this.j, "utf-8", this.f81148d.substring(0, 16));
        }
        if (this.f81149e != null) {
            jSONObject.put("channel", this.f81149e);
        }
        jSONObject.put("umid", this.i);
        jSONObject.put("din", this.j);
        jSONObject.put("push_switch", this.k);
    }

    private void m(JSONObject jSONObject) throws Exception {
        if (this.o != null) {
            jSONObject.put("device_model", this.o);
        }
        if (this.p != null) {
            jSONObject.put("os", this.p);
        }
        if (this.q != null) {
            jSONObject.put("os_version", this.q);
        }
        if (this.r != null) {
            jSONObject.put("resolution", this.r);
        }
        if (this.s != null) {
            jSONObject.put("cpu", this.s);
        }
        if (this.t != null) {
            jSONObject.put("gpu_vender", this.t);
        }
        if (this.u != null) {
            jSONObject.put("gpu_vender", this.u);
        }
    }

    public void b(JSONObject jSONObject) throws Exception {
        k(jSONObject);
        m(jSONObject);
        o(jSONObject);
        q(jSONObject);
        r(jSONObject);
        s(jSONObject);
        t(jSONObject);
    }

    private void e(JSONObject jSONObject) throws Exception {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9 = null;
        if (jSONObject.has("device_model")) {
            str = jSONObject.getString("device_model");
        } else {
            str = null;
        }
        this.o = str;
        if (jSONObject.has("os")) {
            str2 = jSONObject.getString("os");
        } else {
            str2 = null;
        }
        this.p = str2;
        if (jSONObject.has("os_version")) {
            str3 = jSONObject.getString("os_version");
        } else {
            str3 = null;
        }
        this.q = str3;
        if (jSONObject.has("resolution")) {
            str4 = jSONObject.getString("resolution");
        } else {
            str4 = null;
        }
        this.r = str4;
        if (jSONObject.has("cpu")) {
            str5 = jSONObject.getString("cpu");
        } else {
            str5 = null;
        }
        this.s = str5;
        if (jSONObject.has("gpu_vender")) {
            str6 = jSONObject.getString("gpu_vender");
        } else {
            str6 = null;
        }
        this.t = str6;
        if (jSONObject.has("gpu_renderer")) {
            str7 = jSONObject.getString("gpu_renderer");
        } else {
            str7 = null;
        }
        this.u = str7;
        if (jSONObject.has("android_id")) {
            str8 = jSONObject.getString("android_id");
        } else {
            str8 = null;
        }
        this.m = str8;
        if (jSONObject.has("serial_number")) {
            str9 = jSONObject.getString("serial_number");
        }
        this.n = str9;
    }

    private void k(JSONObject jSONObject) throws Exception {
        jSONObject.put("appkey", this.f81148d);
        if (this.f81148d == null || 24 != this.f81148d.length()) {
            this.f81150f = c.a(this.f81150f, "utf-8");
            this.j = c.a(this.j, "utf-8");
        } else {
            this.f81150f = c.a(this.f81150f, "utf-8", this.f81148d.substring(0, 16));
            this.j = c.a(this.j, "utf-8", this.f81148d.substring(0, 16));
        }
        jSONObject.put("device_id", this.f81150f);
        jSONObject.put("idmd5", this.g);
        if (this.f81149e != null) {
            jSONObject.put("channel", this.f81149e);
        }
        if (this.h != null) {
            jSONObject.put("mc", this.h);
        }
        if (this.l > 0) {
            jSONObject.put("req_time", this.l);
        }
        if (this.m != null) {
            jSONObject.put("android_id", this.m);
        }
        if (this.n != null) {
            jSONObject.put("serial_number", this.n);
        }
        jSONObject.put("umid", this.i);
        jSONObject.put("din", this.j);
        jSONObject.put("push_switch", this.k);
    }

    public void c(Context context, String... strArr) {
        a(context, strArr);
        a(context);
        b(context);
        c(context);
        e(context);
    }

    public void b(Context context, String... strArr) {
        a(context, strArr);
        a(context);
        b(context);
        c(context);
        d(context);
        e(context);
    }

    public void a(Context context, String... strArr) {
        if (strArr != null && strArr.length == 2) {
            this.f81148d = strArr[0];
            this.f81149e = strArr[1];
        }
        if (this.f81148d == null) {
            this.f81148d = PushAgent.getInstance(context).getMessageAppkey();
        }
        if (this.f81149e == null) {
            this.f81149e = PushAgent.getInstance(context).getMessageChannel();
        }
        this.f81150f = UmengMessageDeviceConfig.getDeviceId(context);
        this.g = UmengMessageDeviceConfig.getDeviceIdMD5(context);
        this.h = UmengMessageDeviceConfig.getMac(context);
        this.j = UmengMessageDeviceConfig.getDIN(context);
        this.i = UmengMessageDeviceConfig.getUmid(context);
        this.k = UmengMessageDeviceConfig.isNotificationEnabled(context);
        if ("false".equals(this.k)) {
            UMLog.aq(k.f81299c, 0, "\\|");
        }
    }

    public b(String str, String str2) {
        this.f81148d = str;
        this.f81149e = str2;
    }
}
