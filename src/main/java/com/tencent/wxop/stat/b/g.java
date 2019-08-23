package com.tencent.wxop.stat.b;

import android.content.Context;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.tencent.wxop.stat.a.n;
import com.tencent.wxop.stat.a.s;
import com.tencent.wxop.stat.h;
import com.tencent.wxop.stat.i;
import org.json.JSONObject;

public final class g extends e {

    /* renamed from: b  reason: collision with root package name */
    private static String f79875b;

    /* renamed from: a  reason: collision with root package name */
    public String f79876a;
    private String o;

    public g(Context context, int i, h hVar) {
        super(context, i, hVar);
        this.o = i.a(context).f79905c;
        if (f79875b == null) {
            f79875b = n.e(context);
        }
    }

    public final a a() {
        return a.NETWORK_MONITOR;
    }

    public final boolean a(JSONObject jSONObject) {
        s.a(jSONObject, "op", f79875b);
        s.a(jSONObject, AdvanceSetting.CLEAR_NOTIFICATION, this.o);
        jSONObject.put("sp", this.f79876a);
        return true;
    }
}
