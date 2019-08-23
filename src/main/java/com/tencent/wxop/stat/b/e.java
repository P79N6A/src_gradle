package com.tencent.wxop.stat.b;

import android.content.Context;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.tencent.wxop.stat.a.c;
import com.tencent.wxop.stat.a.n;
import com.tencent.wxop.stat.a.s;
import com.tencent.wxop.stat.d;
import com.tencent.wxop.stat.h;
import com.tencent.wxop.stat.t;
import org.json.JSONObject;

public abstract class e {
    protected static String k;

    /* renamed from: c  reason: collision with root package name */
    protected String f79870c;

    /* renamed from: d  reason: collision with root package name */
    public long f79871d = (System.currentTimeMillis() / 1000);

    /* renamed from: e  reason: collision with root package name */
    protected int f79872e;

    /* renamed from: f  reason: collision with root package name */
    protected c f79873f;
    protected int g;
    protected String h;
    protected String i;
    protected String j;
    public boolean l;
    public Context m;
    public h n;

    e(Context context, int i2, h hVar) {
        this.m = context;
        this.f79872e = i2;
        this.i = d.g();
        this.j = n.f(context);
        this.f79870c = d.f();
        if (hVar != null) {
            this.n = hVar;
            if (n.c(hVar.f79898a)) {
                this.f79870c = hVar.f79898a;
            }
            if (n.c(hVar.f79899b)) {
                this.i = hVar.f79899b;
            }
            if (n.c(hVar.f79900c)) {
                this.j = hVar.f79900c;
            }
            this.l = hVar.f79902e;
        }
        this.h = d.a(context);
        this.f79873f = t.a(context).b(context);
        this.g = a() != a.NETWORK_DETECTOR ? n.m(context).intValue() : -a.NETWORK_DETECTOR.a();
        if (!com.tencent.a.a.a.a.h.b(k)) {
            String b2 = d.b(context);
            k = b2;
            if (!n.c(b2)) {
                k = PushConstants.PUSH_TYPE_NOTIFY;
            }
        }
    }

    private boolean b(JSONObject jSONObject) {
        try {
            s.a(jSONObject, "ky", this.f79870c);
            jSONObject.put("et", a().a());
            if (this.f79873f != null) {
                jSONObject.put("ui", this.f79873f.f79784a);
                s.a(jSONObject, "mc", this.f79873f.f79785b);
                int i2 = this.f79873f.f79786c;
                jSONObject.put("ut", i2);
                if (i2 == 0 && n.p(this.m) == 1) {
                    jSONObject.put("ia", 1);
                }
            }
            s.a(jSONObject, "cui", this.h);
            if (a() != a.SESSION_ENV) {
                s.a(jSONObject, "av", this.j);
                s.a(jSONObject, "ch", this.i);
            }
            if (this.l) {
                jSONObject.put("impt", 1);
            }
            s.a(jSONObject, "mid", k);
            jSONObject.put("cch", "wxop");
            jSONObject.put("idx", this.g);
            jSONObject.put("si", this.f79872e);
            jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, this.f79871d);
            jSONObject.put("dts", n.a(this.m, false));
            return a(jSONObject);
        } catch (Throwable unused) {
            return false;
        }
    }

    public abstract a a();

    public abstract boolean a(JSONObject jSONObject);

    public final String b() {
        try {
            JSONObject jSONObject = new JSONObject();
            b(jSONObject);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }
}
