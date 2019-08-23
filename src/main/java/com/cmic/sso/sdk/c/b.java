package com.cmic.sso.sdk.c;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.cmic.sso.sdk.b.a.d;
import com.cmic.sso.sdk.b.a.e;
import com.cmic.sso.sdk.b.c.a;
import com.cmic.sso.sdk.d.d;
import com.cmic.sso.sdk.d.f;
import com.cmic.sso.sdk.d.i;
import com.cmic.sso.sdk.d.k;
import com.cmic.sso.sdk.d.m;
import com.cmic.sso.sdk.d.n;
import com.cmic.sso.sdk.d.r;
import com.cmic.sso.sdk.d.s;
import com.cmic.sso.sdk.d.t;
import com.cmic.sso.sdk.d.u;
import com.cmic.sso.sdk.d.v;
import com.cmic.sso.sdk.d.w;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private Bundle f23042a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Context f23043b;

    /* access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        a(jSONObject, (com.cmic.sso.sdk.b.b.b) new com.cmic.sso.sdk.b.b.b() {
            public void a(String str, String str2, JSONObject jSONObject) {
            }
        });
    }

    private void a(final JSONObject jSONObject, Bundle bundle) {
        this.f23042a = bundle;
        s.a(new s.a() {
            public void a() {
                b.this.a(jSONObject);
            }
        });
    }

    private <T extends e> void a(T t, final com.cmic.sso.sdk.b.b.b bVar) {
        if (u.m(this.f23043b) == 0 || u.l(this.f23043b) == 0 || System.currentTimeMillis() > n.b(this.f23043b, "logCloseTime", 0) + ((long) u.m(this.f23043b))) {
            f.a("SendLog", "request https url : " + u.g(this.f23043b));
            new d().a(u.g(this.f23043b), t, false, (d.a) new d.a() {
                public void a(String str, String str2) {
                    f.a("SendLog", "request success , url : " + u.g(b.this.f23043b) + ">>>>result : " + str);
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        bVar.a(jSONObject.optString("resultCode"), jSONObject.optString("desc"), jSONObject);
                    } catch (Exception unused) {
                        a("102223", "数据解析异常", str2);
                    }
                }

                public void a(String str, String str2, String str3) {
                    if (!(u.m(b.this.f23043b) == 0 || u.l(b.this.f23043b) == 0)) {
                        int b2 = n.b(b.this.f23043b, "logFailTimes", 0) + 1;
                        if (b2 >= u.l(b.this.f23043b)) {
                            n.a(b.this.f23043b, "logFailTimes", 0);
                            n.a(b.this.f23043b, "logCloseTime", System.currentTimeMillis());
                        } else {
                            n.a(b.this.f23043b, "logFailTimes", b2);
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("resultCode", str);
                        jSONObject.put("desc", str2);
                    } catch (JSONException unused) {
                    }
                    f.a("SendLog", "request failed , url : " + u.g(b.this.f23043b) + ">>>>>errorMsg : " + jSONObject.toString());
                    if (bVar != null) {
                        bVar.a(str, str2, jSONObject);
                    }
                }
            }, "POST", "", this.f23042a);
        }
    }

    private void a(JSONObject jSONObject, com.cmic.sso.sdk.b.b.b bVar) {
        com.cmic.sso.sdk.b.a.d dVar = new com.cmic.sso.sdk.b.a.d();
        d.a aVar = new d.a();
        d.b bVar2 = new d.b();
        bVar2.d(w.a());
        bVar2.e(t.a());
        bVar2.a("2.0");
        bVar2.b(this.f23042a.getString("appid", ""));
        bVar2.c(bVar2.f());
        aVar.a(jSONObject);
        dVar.a(aVar);
        dVar.a(bVar2);
        a.a(u.a(this.f23043b, u.g(this.f23043b)));
        a((T) dVar, bVar);
    }

    private static void a(a aVar, Bundle bundle) {
        String str;
        String str2;
        String str3;
        if (aVar != null && bundle != null) {
            aVar.a(bundle.getString("appid", ""));
            if (TextUtils.isEmpty(bundle.getString("ipv4List", ""))) {
                str = v.a();
            } else {
                str = bundle.getString("ipv4List", "");
            }
            aVar.f(str);
            if (TextUtils.isEmpty(bundle.getString("ipv6List", ""))) {
                str2 = v.b();
            } else {
                str2 = bundle.getString("ipv6List", "");
            }
            aVar.g(str2);
            aVar.h(bundle.getString("imei", ""));
            aVar.k(bundle.getString("imei", ""));
            aVar.l(bundle.getString("imsi", ""));
            if (k.a()) {
                str3 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str3 = PushConstants.PUSH_TYPE_NOTIFY;
            }
            aVar.p(str3);
            aVar.q(r.a());
            aVar.t(bundle.getString("interfaceType", ""));
            aVar.s(bundle.getString("interfaceCode", ""));
            aVar.r(bundle.getString("interfaceElasped", ""));
            aVar.w(bundle.getString("timeOut"));
            aVar.D(bundle.getString("traceId"));
            aVar.F(bundle.getString("networkClass"));
            aVar.y(bundle.getString("simCardNum"));
            aVar.z(bundle.getString("operatortype"));
            aVar.A(r.b());
            aVar.B(r.c());
            aVar.I("quick_login_android_9.0.6.1");
            aVar.J(String.valueOf(bundle.getInt("networktype", 0)));
            aVar.E(bundle.getString("starttime"));
            aVar.G(bundle.getString("endtime"));
            aVar.x(String.valueOf(bundle.getLong("systemEndTime", 0) - bundle.getLong("systemStartTime", 0)));
            aVar.b(bundle.getString("imsiState"));
            f.a("SendLog", "traceId" + bundle.getString("traceId"));
        }
    }

    public void a(Context context, String str, Bundle bundle, Throwable th) {
        try {
            this.f23043b = context;
            a aVar = new a();
            String e2 = i.e(context);
            aVar.c(str);
            if (bundle.getString("loginMethod", "").equals("loginAuth")) {
                aVar.c();
            }
            aVar.H(bundle.getString("loginMethod", ""));
            if (bundle.getBoolean("isCacheScrip", false)) {
                aVar.C("scrip");
            } else {
                aVar.C("pgw");
            }
            aVar.u(i.d(context));
            if (TextUtils.isEmpty(e2)) {
                e2 = "";
            }
            aVar.v(e2);
            aVar.m(m.a(context).d());
            aVar.o(m.a(context).c());
            aVar.d(m.c(context));
            aVar.e(m.d(context));
            aVar.i(m.e(context));
            aVar.j(m.f(context));
            a(aVar, bundle);
            JSONArray jSONArray = null;
            if (th != null) {
                jSONArray = new JSONArray();
                JSONObject jSONObject = new JSONObject();
                StringBuffer stringBuffer = new StringBuffer();
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    stringBuffer.append("\n");
                    stringBuffer.append(stackTraceElement.toString());
                }
                jSONObject.put("message", th.toString());
                jSONObject.put("stack", stringBuffer.toString());
                jSONArray.put(jSONObject);
            }
            if (a.f23036a.size() > 0) {
                if (jSONArray == null) {
                    jSONArray = new JSONArray();
                }
                Iterator<Throwable> it2 = a.f23036a.iterator();
                while (it2.hasNext()) {
                    Throwable next = it2.next();
                    StringBuffer stringBuffer2 = new StringBuffer();
                    JSONObject jSONObject2 = new JSONObject();
                    for (StackTraceElement stackTraceElement2 : next.getStackTrace()) {
                        stringBuffer2.append("\n");
                        stringBuffer2.append(stackTraceElement2.toString());
                    }
                    jSONObject2.put("message", next.toString());
                    jSONObject2.put("stack", stringBuffer2.toString());
                    jSONArray.put(jSONObject2);
                }
                a.f23036a.clear();
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                aVar.a(jSONArray);
            }
            f.a("SendLog", "登录日志");
            a(aVar.b(), bundle);
        } catch (Exception unused) {
        }
    }
}
