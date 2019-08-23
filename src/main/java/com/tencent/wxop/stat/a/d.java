package com.tencent.wxop.stat.a;

import android.content.Context;
import android.os.Build;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.tencent.wxop.stat.i;
import com.tencent.wxop.stat.t;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static e f79790a;

    /* renamed from: d  reason: collision with root package name */
    private static b f79791d = n.c();

    /* renamed from: e  reason: collision with root package name */
    private static JSONObject f79792e = new JSONObject();

    /* renamed from: b  reason: collision with root package name */
    Integer f79793b;

    /* renamed from: c  reason: collision with root package name */
    String f79794c;

    public d(Context context) {
        try {
            a(context);
            this.f79793b = n.h(context.getApplicationContext());
            this.f79794c = i.a(context).f79905c;
        } catch (Throwable unused) {
        }
    }

    private static synchronized e a(Context context) {
        e eVar;
        synchronized (d.class) {
            if (f79790a == null) {
                f79790a = new e(context.getApplicationContext(), (byte) 0);
            }
            eVar = f79790a;
        }
        return eVar;
    }

    public final void a(JSONObject jSONObject, Thread thread) {
        String str;
        Object obj;
        String str2;
        String b2;
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (f79790a != null) {
                e eVar = f79790a;
                if (thread == null) {
                    if (eVar.f79797c != null) {
                        jSONObject2.put("sr", eVar.f79797c.widthPixels + "*" + eVar.f79797c.heightPixels);
                        jSONObject2.put("dpi", eVar.f79797c.xdpi + "*" + eVar.f79797c.ydpi);
                    }
                    if (i.a(eVar.o).a()) {
                        JSONObject jSONObject3 = new JSONObject();
                        s.a(jSONObject3, NotificationStyle.BASE_STYLE, s.c(eVar.o));
                        s.a(jSONObject3, "ss", s.d(eVar.o));
                        if (jSONObject3.length() > 0) {
                            s.a(jSONObject2, "wf", jSONObject3.toString());
                        }
                    }
                    str2 = "sen";
                    b2 = eVar.p;
                } else {
                    s.a(jSONObject2, "thn", thread.getName());
                    s.a(jSONObject2, "qq", r.a(eVar.o, "mta.acc.qq", com.tencent.wxop.stat.d.l));
                    s.a(jSONObject2, "cui", com.tencent.wxop.stat.d.a(eVar.o));
                    if (n.c(eVar.r) && eVar.r.split("/").length == 2) {
                        s.a(jSONObject2, "fram", eVar.r.split("/")[0]);
                    }
                    if (n.c(eVar.s) && eVar.s.split("/").length == 2) {
                        s.a(jSONObject2, "from", eVar.s.split("/")[0]);
                    }
                    if (t.a(eVar.o).b(eVar.o) != null) {
                        jSONObject2.put("ui", t.a(eVar.o).b(eVar.o).f79784a);
                    }
                    str2 = "mid";
                    b2 = com.tencent.wxop.stat.d.b(eVar.o);
                }
                s.a(jSONObject2, str2, b2);
                s.a(jSONObject2, "pcn", n.k(eVar.o));
                s.a(jSONObject2, "osn", Build.VERSION.RELEASE);
                s.a(jSONObject2, "av", eVar.f79795a);
                s.a(jSONObject2, "ch", eVar.h);
                s.a(jSONObject2, "mf", eVar.f79800f);
                s.a(jSONObject2, "sv", eVar.f79796b);
                s.a(jSONObject2, "osd", Build.DISPLAY);
                s.a(jSONObject2, "prod", Build.PRODUCT);
                s.a(jSONObject2, "tags", Build.TAGS);
                s.a(jSONObject2, "id", Build.ID);
                s.a(jSONObject2, "fng", Build.FINGERPRINT);
                s.a(jSONObject2, "lch", eVar.n);
                s.a(jSONObject2, "ov", Integer.toString(eVar.f79798d));
                jSONObject2.put("os", 1);
                s.a(jSONObject2, "op", eVar.i);
                s.a(jSONObject2, "lg", eVar.g);
                s.a(jSONObject2, "md", eVar.f79799e);
                s.a(jSONObject2, "tz", eVar.j);
                if (eVar.l != 0) {
                    jSONObject2.put("jb", eVar.l);
                }
                s.a(jSONObject2, "sd", eVar.k);
                s.a(jSONObject2, "apn", eVar.m);
                s.a(jSONObject2, "cpu", eVar.q);
                s.a(jSONObject2, "abi", Build.CPU_ABI);
                s.a(jSONObject2, "abi2", Build.CPU_ABI2);
                s.a(jSONObject2, "ram", eVar.r);
                s.a(jSONObject2, "rom", eVar.s);
            }
            s.a(jSONObject2, AdvanceSetting.CLEAR_NOTIFICATION, this.f79794c);
            if (this.f79793b != null) {
                jSONObject2.put("tn", this.f79793b);
            }
            if (thread == null) {
                str = "ev";
                obj = jSONObject2;
            } else {
                str = "errkv";
                obj = jSONObject2.toString();
            }
            jSONObject.put(str, obj);
            if (f79792e != null && f79792e.length() > 0) {
                jSONObject.put("eva", f79792e);
            }
        } catch (Throwable unused) {
        }
    }
}
