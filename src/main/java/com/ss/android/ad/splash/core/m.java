package com.ss.android.ad.splash.core;

import android.graphics.Point;
import android.support.annotation.NonNull;
import android.view.View;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ad.splash.b.b;
import com.ss.android.ad.splash.c;
import com.ss.android.ad.splash.e;
import com.ss.android.ad.splash.origin.a;
import com.ss.android.ad.splash.utils.f;
import com.ss.android.ad.splash.utils.g;
import com.ss.android.ad.splash.utils.h;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class m implements l {

    /* renamed from: a  reason: collision with root package name */
    private c f27707a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f27708b;

    /* renamed from: c  reason: collision with root package name */
    private long f27709c;

    /* renamed from: d  reason: collision with root package name */
    private View f27710d;

    public final void c() {
        this.f27709c = System.currentTimeMillis();
    }

    public final void a() {
        if (!this.f27708b) {
            this.f27708b = true;
            b.a().e();
            this.f27707a.a(this.f27710d);
        }
    }

    public final void b() {
        if (!this.f27708b) {
            this.f27708b = true;
            b.a().e();
            this.f27707a.a(this.f27710d);
        }
    }

    public final void c(@NonNull com.ss.android.ad.splash.core.c.b bVar) {
        this.f27707a.a(bVar.l(), bVar.n());
    }

    public final void a(@NonNull com.ss.android.ad.splash.core.c.b bVar) {
        if (!this.f27708b) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (bVar.p() == 0 || bVar.p() == 4) {
                    jSONObject.putOpt("show_time", Long.valueOf(System.currentTimeMillis() - this.f27709c));
                }
                if (!g.a(bVar.n())) {
                    jSONObject.putOpt("log_extra", bVar.n());
                }
                jSONObject.putOpt("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                jSONObject.put("ad_fetch_time", bVar.f());
            } catch (Exception unused) {
                jSONObject = null;
            }
            e.a(bVar.l(), "splash_ad", "skip", jSONObject);
            b.a().e();
            this.f27708b = true;
            this.f27707a.a(this.f27710d);
        }
    }

    public final void b(@NonNull com.ss.android.ad.splash.core.c.b bVar) {
        if (!this.f27708b) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (bVar.p() == 0 || bVar.p() == 4) {
                    jSONObject.putOpt("show_time", Long.valueOf(System.currentTimeMillis() - this.f27709c));
                }
                if (!g.a(bVar.n())) {
                    jSONObject.putOpt("log_extra", bVar.n());
                }
                jSONObject.putOpt("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                jSONObject.put("ad_fetch_time", r.a().f());
            } catch (Exception unused) {
                jSONObject = null;
            }
            e.a(bVar.l(), "splash_ad", "shake_skip", jSONObject);
            b.a().e();
            this.f27708b = true;
            this.f27707a.a(this.f27710d);
        }
    }

    public m(@NonNull View view, @NonNull c cVar) {
        this.f27710d = view;
        this.f27707a = cVar;
    }

    private static void c(@NonNull com.ss.android.ad.splash.core.c.b bVar, @NonNull com.ss.android.ad.splash.core.c.c cVar) {
        JSONObject jSONObject;
        String str;
        try {
            Point point = cVar.f27617c;
            jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("click_x", Integer.valueOf(point.x));
            jSONObject2.putOpt("click_y", Integer.valueOf(point.y));
            jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
            jSONObject.put("ad_fetch_time", bVar.f());
            if (!g.a(bVar.n())) {
                jSONObject.put("log_extra", bVar.n());
            }
            jSONObject.putOpt("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        } catch (Exception unused) {
            jSONObject = null;
        }
        long l = bVar.l();
        if (cVar.f27616b) {
            str = "click";
        } else {
            str = "banner_click";
        }
        e.a(l, "splash_ad", str, jSONObject);
        if (bVar.k != null) {
            e.a(bVar.l(), bVar.n(), bVar.r(), 3);
        }
    }

    private void a(@NonNull a aVar, @NonNull com.ss.android.ad.splash.core.c.c cVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            Point point = cVar.f27617c;
            JSONObject jSONObject2 = new JSONObject();
            int i = 1;
            if (cVar.f27615a >= 0 && aVar.p() == 4) {
                jSONObject2.putOpt("pic_position", Integer.valueOf(cVar.f27615a + 1));
            }
            jSONObject2.putOpt("click_x", Integer.valueOf(point.x));
            jSONObject2.putOpt("click_y", Integer.valueOf(point.y));
            jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
            if (cVar.f27615a >= 0) {
                i = 0;
            }
            jSONObject.putOpt("area", Integer.valueOf(i));
            jSONObject.putOpt("log_extra", aVar.n());
            jSONObject.putOpt("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            jSONObject.putOpt("show_time", Long.valueOf(System.currentTimeMillis() - this.f27709c));
            jSONObject.put("ad_fetch_time", aVar.f());
        } catch (Exception unused) {
        }
        e.a(aVar.l(), "splash_ad", "click", jSONObject);
        e.a(aVar.l(), aVar.n(), aVar.r(), 3);
    }

    public final boolean b(@NonNull com.ss.android.ad.splash.core.c.b bVar, @NonNull com.ss.android.ad.splash.core.c.c cVar) {
        if (this.f27708b) {
            return false;
        }
        e a2 = new e.a().d(bVar.m()).c(bVar.g()).b(bVar.m()).a(bVar.o()).a();
        if (!g.a(bVar.m()) && f.b(bVar.m())) {
            this.f27707a.a(this.f27710d, bVar.a(a2));
            c(bVar, cVar);
            this.f27708b = true;
            return true;
        } else if (!h.a(bVar.o())) {
            return false;
        } else {
            this.f27707a.a(this.f27710d, bVar.b(a2));
            c(bVar, cVar);
            this.f27708b = true;
            return true;
        }
    }

    public final void a(@NonNull com.ss.android.ad.splash.core.c.b bVar, @NonNull com.ss.android.ad.splash.core.c.c cVar) {
        String str;
        String str2;
        String str3;
        String str4;
        if (!this.f27708b) {
            String m = bVar.m();
            String g = bVar.g();
            JSONObject jSONObject = null;
            if (bVar.p() == 4 && cVar.f27615a >= 0) {
                List<String> list = bVar.o;
                List<String> list2 = bVar.n;
                if (list == null || list.size() <= cVar.f27615a) {
                    str3 = m;
                    str4 = null;
                } else {
                    str4 = list.get(cVar.f27615a);
                    str3 = str4;
                }
                if (list2 == null || list2.size() <= cVar.f27615a) {
                    str = null;
                } else {
                    str = list2.get(cVar.f27615a);
                }
                String str5 = str3;
                str2 = str4;
                m = str5;
            } else if (bVar.h != 3 || cVar.f27615a >= 0) {
                str2 = bVar.m();
                str = bVar.o();
            } else {
                if (f.b(bVar.g())) {
                    str2 = bVar.g();
                } else {
                    str2 = bVar.m();
                }
                str = bVar.o();
            }
            if (cVar.f27619e) {
                String str6 = cVar.f27618d;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("ad_fetch_time", bVar.f());
                    if (!g.a(bVar.n())) {
                        jSONObject2.put("log_extra", bVar.n());
                    }
                    jSONObject2.put("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                    jSONObject = jSONObject2;
                } catch (JSONException unused) {
                }
                e.a(bVar.l(), "splash_ad", str6, jSONObject);
            }
            e a2 = new e.a().d(str2).c(g).b(m).a(str).a();
            if (!g.a(str2) && f.b(str2)) {
                this.f27707a.a(this.f27710d, bVar.a(a2));
                a((a) bVar, cVar);
                this.f27708b = true;
            } else if (h.a(str)) {
                this.f27707a.a(this.f27710d, bVar.b(a2));
                a((a) bVar, cVar);
                this.f27708b = true;
            }
        }
    }
}
