package com.cmic.sso.sdk.b.b;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.cmic.sso.sdk.a;
import com.cmic.sso.sdk.b.a.a;
import com.cmic.sso.sdk.b.a.b;
import com.cmic.sso.sdk.b.a.c;
import com.cmic.sso.sdk.b.a.e;
import com.cmic.sso.sdk.d.d;
import com.cmic.sso.sdk.d.f;
import com.cmic.sso.sdk.d.h;
import com.cmic.sso.sdk.d.l;
import com.cmic.sso.sdk.d.m;
import com.cmic.sso.sdk.d.q;
import com.cmic.sso.sdk.d.r;
import com.cmic.sso.sdk.d.t;
import com.cmic.sso.sdk.d.u;
import com.cmic.sso.sdk.d.v;
import com.cmic.sso.sdk.d.w;
import com.cmic.sso.sdk.d.x;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f23026a;

    private a() {
    }

    public static a a() {
        if (f23026a == null) {
            synchronized (a.class) {
                if (f23026a == null) {
                    f23026a = new a();
                }
            }
        }
        return f23026a;
    }

    public void a(boolean z, Bundle bundle, b bVar) {
        String str;
        b bVar2 = new b();
        bVar2.a("1.0");
        bVar2.b("Android");
        bVar2.c(bundle.getString("imei"));
        if (z) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        bVar2.d(str);
        bVar2.e("quick_login_android_9.0.6.1");
        bVar2.f(bundle.getString("appid"));
        bVar2.g(bVar2.c());
        a("https://config.cmpassport.com/client/uniConfig", bVar2, false, bundle, bVar);
    }

    public void a(Context context, Bundle bundle, b bVar) {
        int i = bundle.getInt("networktype");
        String string = bundle.getString("authtype", "");
        c cVar = new c();
        c.a aVar = new c.a();
        aVar.e("1.0");
        aVar.f("quick_login_android_9.0.6.1");
        aVar.g(bundle.getString("appid"));
        aVar.h(string);
        aVar.i(bundle.getString("smskey", ""));
        aVar.j(bundle.getString("imsi"));
        aVar.k(bundle.getString("imei"));
        aVar.c(m.a(context).c());
        aVar.d(m.a(context).d());
        aVar.l(bundle.getString("operatortype"));
        aVar.m(i);
        aVar.n(r.a());
        aVar.o(r.b());
        aVar.p(r.c());
        aVar.q(PushConstants.PUSH_TYPE_NOTIFY);
        aVar.r(w.a());
        aVar.a(System.currentTimeMillis());
        aVar.s(t.a());
        aVar.t(bundle.getString("apppackage"));
        aVar.u(bundle.getString("appsign"));
        aVar.v(aVar.w(bundle.getString("appkey")));
        cVar.a(bundle.getString(a.C0245a.f22942a));
        cVar.b(l.a().a(bundle.getString(a.C0245a.f22942a)));
        cVar.a(aVar);
        bundle.putString("interfaceVersion", "6.0");
        bundle.putString("interfaceType", "getPrePhonescrip");
        bundle.putBoolean("isCloseIpv4", u.b(context));
        bundle.putBoolean("isCloseIpv6", u.c(context));
        String str = u.e(context) + "rs/getPrePhonescrip";
        if (i != 3 || !string.equals("3")) {
            f.b("BaseRequest", "不使用wifi下取号" + i);
            bundle.putBoolean("doNetworkSwitch", false);
            a(str, cVar, false, bundle, bVar);
            return;
        }
        x.a(context);
        f.b("BaseRequest", "使用wifi下取号" + i);
        bundle.putBoolean("doNetworkSwitch", true);
        a(str, cVar, true, bundle, bVar);
    }

    public void b(Context context, Bundle bundle, b bVar) {
        com.cmic.sso.sdk.b.a.a aVar = new com.cmic.sso.sdk.b.a.a();
        a.C0248a aVar2 = new a.C0248a();
        aVar.f("0.1");
        aVar.i(bundle.getString("phonescrip"));
        aVar.h(bundle.getString("appid"));
        aVar.g(w.a());
        aVar.a(System.currentTimeMillis());
        aVar.c(t.a());
        aVar.d("6.0");
        aVar.e(bundle.getString("userCapaid", "50"));
        aVar.a(PushConstants.PUSH_TYPE_NOTIFY);
        aVar.b(bundle.getString("sourceid"));
        aVar.k(bundle.getString("authenticated_appid"));
        aVar.l(bundle.getString("genTokenByAppid"));
        aVar.j(aVar.m(bundle.getString("appkey")));
        aVar2.a(bundle.getString("traceId", ""));
        aVar2.b(m.g(context));
        aVar2.c(r.c());
        aVar2.d(r.b());
        aVar2.e(r.a());
        aVar2.f(bundle.getString("operatortype", ""));
        aVar2.g(PushConstants.PUSH_TYPE_NOTIFY);
        aVar2.h(r.a(context));
        aVar2.i(m.e());
        aVar2.j(m.h(context));
        aVar2.k(bundle.getString("imei", ""));
        aVar2.l(bundle.getString("imsi", ""));
        aVar2.m(m.a(context).d());
        aVar2.n(m.a(context).c());
        aVar2.o(m.d(context));
        aVar2.p("");
        aVar2.q(m.j(context));
        aVar2.r("");
        if (r.a(context) == 3 || r.a(context) == 2) {
            aVar2.s(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        } else {
            aVar2.s(PushConstants.PUSH_TYPE_NOTIFY);
        }
        aVar2.t(m.d(context));
        aVar2.u(m.i(context));
        aVar2.v(v.a());
        aVar2.w(v.b());
        aVar2.x(PushConstants.PUSH_TYPE_NOTIFY);
        aVar2.y("www.cmpassport.com");
        if (q.a()) {
            aVar2.z(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        } else {
            aVar2.z(PushConstants.PUSH_TYPE_NOTIFY);
        }
        aVar.a(aVar2.a());
        String str = u.f(context) + "api/getAuthToken";
        com.cmic.sso.sdk.b.c.a.a(u.a(context, u.f(context)));
        if (TextUtils.isEmpty(bundle.getString("interfaceType", ""))) {
            bundle.putString("interfaceType", "getAuthToken");
        } else {
            bundle.putString("interfaceType", bundle.getString("interfaceType") + ";getAuthToken");
        }
        bundle.putString("interfaceVersion", "6.0");
        a(str, aVar, false, bundle, bVar);
    }

    private <T extends e> void a(String str, T t, boolean z, Bundle bundle, b bVar) {
        String string = bundle.getString("traceId");
        StringBuilder sb = new StringBuilder("request https url : ");
        String str2 = str;
        sb.append(str);
        f.a("BaseRequest", sb.toString());
        d dVar = new d();
        final String str3 = str;
        final Bundle bundle2 = bundle;
        final T t2 = t;
        final b bVar2 = bVar;
        AnonymousClass1 r1 = new d.a() {

            /* renamed from: f  reason: collision with root package name */
            private boolean f23032f;

            public void a(String str, String str2) {
                if (!this.f23032f) {
                    this.f23032f = true;
                    f.a("BaseRequest", "request success , url : " + str3 + ">>>>result : " + str);
                    if (!str3.contains("uniConfig")) {
                        if (TextUtils.isEmpty(bundle2.getString("interfaceElasped", ""))) {
                            bundle2.putString("interfaceElasped", String.valueOf(System.currentTimeMillis() - t2.a()));
                        } else {
                            Bundle bundle = bundle2;
                            bundle.putString("interfaceElasped", bundle2.getString("interfaceElasped") + ";" + String.valueOf(System.currentTimeMillis() - t2.a()));
                        }
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("resultCode")) {
                            if (TextUtils.isEmpty(bundle2.getString("interfaceCode", ""))) {
                                bundle2.putString("interfaceCode", jSONObject.getString("resultCode"));
                            } else {
                                Bundle bundle2 = bundle2;
                                bundle2.putString("interfaceCode", bundle2.getString("interfaceCode") + ";" + jSONObject.getString("resultCode"));
                            }
                        }
                        if (!h.a(bundle2.getString("traceId")) || str3.contains("uniConfig")) {
                            bVar2.a(jSONObject.optString("resultCode"), jSONObject.optString("desc"), jSONObject);
                        }
                    } catch (Exception unused) {
                        this.f23032f = false;
                        a("102223", "数据解析异常", str2);
                    }
                }
            }

            public void a(String str, String str2, String str3) {
                if (!this.f23032f) {
                    this.f23032f = true;
                    if (!str3.contains("uniConfig")) {
                        if (TextUtils.isEmpty(bundle2.getString("interfaceElasped", ""))) {
                            bundle2.putString("interfaceElasped", String.valueOf(System.currentTimeMillis() - t2.a()));
                        } else {
                            Bundle bundle = bundle2;
                            bundle.putString("interfaceElasped", bundle2.getString("interfaceElasped") + ";" + String.valueOf(System.currentTimeMillis() - t2.a()));
                        }
                    }
                    JSONObject a2 = com.cmic.sso.sdk.auth.c.a(str, str2);
                    if (str.contains("200039") && !str.equals("200039")) {
                        str = "200039";
                        a2 = com.cmic.sso.sdk.auth.c.a(str, "电信取号接口失败");
                    }
                    if (TextUtils.isEmpty(bundle2.getString("interfaceCode", ""))) {
                        bundle2.putString("interfaceCode", str);
                    } else {
                        Bundle bundle2 = bundle2;
                        bundle2.putString("interfaceCode", bundle2.getString("interfaceCode") + ";" + str);
                    }
                    f.a("BaseRequest", "request failed , url : " + str3 + ">>>>>errorMsg : " + a2.toString());
                    if (bVar2 != null && (!h.a(bundle2.getString("traceId")) || str3.contains("uniConfig"))) {
                        bVar2.a(str, str2, a2);
                    }
                }
            }
        };
        dVar.a(str, t, z, (d.a) r1, "POST", string, bundle);
    }
}
