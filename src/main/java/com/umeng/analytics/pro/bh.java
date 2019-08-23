package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.analytics.pro.af;
import org.json.JSONObject;

public class bh implements az {
    private static bh j;
    private int h;
    private final long i = 60000;

    public boolean d() {
        if (this.h != 0) {
            return true;
        }
        return false;
    }

    private bh() {
    }

    public long c() {
        if (this.h == 0) {
            return 0;
        }
        return 300000;
    }

    public long b() {
        switch (this.h) {
            case 1:
                return 14400000;
            case 2:
                return 28800000;
            case 3:
                return 86400000;
            default:
                return 0;
        }
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            jSONObject.put("id", bd.a());
            jSONObject.put("start_time", currentTimeMillis);
            jSONObject.put("end_time", currentTimeMillis + 60000);
            jSONObject.put("duration", 60000);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public void a(int i2) {
        if (i2 >= 0 && i2 <= 3) {
            this.h = i2;
        }
    }

    public void a(af.a aVar) {
        a(aVar.a(0));
    }

    public static synchronized bh a(Context context) {
        bh bhVar;
        synchronized (bh.class) {
            if (j == null) {
                j = new bh();
                j.a(af.a(context).b().a(0));
            }
            bhVar = j;
        }
        return bhVar;
    }

    public void a(JSONObject jSONObject, Context context) {
        if (this.h == 1) {
            jSONObject.remove("error");
            jSONObject.remove("ekv");
            jSONObject.remove("gkv");
            jSONObject.remove("cc");
            w.a(context).a(false, true);
            m.a(context).b(new f());
        } else if (this.h == 2) {
            jSONObject.remove("sessions");
            try {
                jSONObject.put("sessions", a());
            } catch (Exception unused) {
            }
            jSONObject.remove("error");
            jSONObject.remove("ekv");
            jSONObject.remove("gkv");
            jSONObject.remove("cc");
            w.a(context).a(false, true);
            m.a(context).b(new f());
        } else {
            if (this.h == 3) {
                jSONObject.remove("sessions");
                jSONObject.remove("error");
                jSONObject.remove("ekv");
                jSONObject.remove("gkv");
                jSONObject.remove("cc");
                w.a(context).a(false, true);
                m.a(context).b(new f());
            }
        }
    }
}
