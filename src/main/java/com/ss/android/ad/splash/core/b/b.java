package com.ss.android.ad.splash.core.b;

import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ad.splash.core.e;
import com.ss.android.ad.splash.utils.d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class b {

    /* renamed from: b  reason: collision with root package name */
    private static volatile b f27577b;

    /* renamed from: a  reason: collision with root package name */
    public List<a> f27578a = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private List<com.ss.android.ad.splash.core.c.b> f27579c;

    private b() {
    }

    public final void c() {
        if (this.f27578a != null) {
            this.f27578a.clear();
        }
    }

    public static b a() {
        if (f27577b == null) {
            synchronized (b.class) {
                if (f27577b == null) {
                    f27577b = new b();
                }
            }
        }
        return f27577b;
    }

    public final void b() {
        if (this.f27579c == null) {
            this.f27579c = new ArrayList();
        } else {
            this.f27579c.clear();
        }
    }

    public final void d() {
        if (!d.a(this.f27579c)) {
            com.ss.android.ad.splash.core.c.b bVar = this.f27579c.get(0);
            if (bVar != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    for (com.ss.android.ad.splash.core.c.b next : this.f27579c) {
                        if (!TextUtils.isEmpty(next.t())) {
                            jSONArray.put(next.t());
                        }
                    }
                    jSONObject2.putOpt("native_splash_ad_id", jSONArray);
                    jSONObject.putOpt("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                    jSONObject.putOpt("ad_extra_data", jSONObject2);
                    jSONObject.putOpt("log_extra", bVar.n());
                } catch (Exception unused) {
                }
                e.a(bVar.l(), "splash_ad", "client_false", jSONObject);
            }
        }
    }

    public final void a(a aVar) {
        if (aVar != null && this.f27578a != null) {
            this.f27578a.add(aVar);
        }
    }

    public static void b(a aVar) {
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (aVar.f27570b > 0) {
                    jSONObject2.put("ad_show_fail_type", aVar.f27570b);
                }
                if (!TextUtils.isEmpty(aVar.f27572d)) {
                    jSONObject.put("log_extra", aVar.f27572d);
                }
                jSONObject.put("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                jSONObject.put("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
            }
            e.a(aVar.f27569a, "splash_ad", "open_splash", jSONObject);
        }
    }

    public final void a(com.ss.android.ad.splash.core.c.b bVar) {
        if (bVar != null && this.f27579c != null) {
            this.f27579c.add(bVar);
        }
    }

    public static void b(com.ss.android.ad.splash.core.c.b bVar) {
        if (bVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (!TextUtils.isEmpty(bVar.n())) {
                    jSONObject.put("log_extra", bVar.n());
                }
                jSONObject.putOpt("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                jSONObject.putOpt("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
            }
            e.a(bVar.l(), "splash_ad", "open_splash", jSONObject);
        }
    }

    public static void c(a aVar) {
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (aVar.f27570b > 0 && aVar.f27571c > 0) {
                    jSONObject2.put("ad_show_fail_type", aVar.f27570b);
                    jSONObject2.put("ad_error_code", aVar.f27571c);
                }
                if (!TextUtils.isEmpty(aVar.f27572d)) {
                    jSONObject.put("log_extra", aVar.f27572d);
                }
                jSONObject.put("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                jSONObject.put("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
            }
            e.a(aVar.f27569a, "splash_ad", "open_splash", jSONObject);
        }
    }

    public static void d(a aVar) {
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (aVar.f27570b > 0) {
                    jSONObject2.put("ad_show_fail_type", aVar.f27570b);
                }
                if (aVar.f27571c > 0) {
                    jSONObject2.put("ad_error_code", aVar.f27571c);
                }
                if (!TextUtils.isEmpty(aVar.f27572d)) {
                    jSONObject.put("log_extra", aVar.f27572d);
                }
                jSONObject.putOpt("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                jSONObject.putOpt("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
            }
            e.a(aVar.f27569a, "splash_ad", "open_splash", jSONObject);
        }
    }

    public final void a(boolean z) {
        if (this.f27578a != null) {
            try {
                if (this.f27578a.size() > 0) {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    for (a next : this.f27578a) {
                        if (next != null && next.f27571c > 0) {
                            jSONObject.put(next.f27569a, next.f27571c);
                        }
                    }
                    jSONObject3.put("ad_show_fail_list", jSONObject);
                    jSONObject3.put("ad_show_fail_type", 3);
                    jSONObject2.put("log_extra", "{}");
                    jSONObject2.putOpt("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                    jSONObject2.put("ad_extra_data", jSONObject3);
                    e.a(84378473382L, "splash_ad", "open_splash", jSONObject2);
                }
                c();
            } catch (Exception unused) {
            }
        }
    }

    public static void a(com.ss.android.ad.splash.core.c.b bVar, com.ss.android.ad.splash.core.c.b bVar2) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(bVar2.n())) {
                jSONObject.put("log_extra", bVar2.n());
            }
            if (!TextUtils.isEmpty(bVar.t())) {
                jSONObject2.put("native_splash_ad_id", bVar.t());
            }
            jSONObject.putOpt("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            jSONObject.putOpt("ad_extra_data", jSONObject2);
        } catch (Exception unused) {
        }
        e.a(bVar2.l(), "splash_ad", "client_false_show", jSONObject);
    }
}
