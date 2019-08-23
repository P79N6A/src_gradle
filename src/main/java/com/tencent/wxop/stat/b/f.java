package com.tencent.wxop.stat.b;

import android.content.Context;
import com.tencent.wxop.stat.a.s;
import com.tencent.wxop.stat.d;
import com.tencent.wxop.stat.h;
import org.json.JSONObject;

public final class f extends e {

    /* renamed from: a  reason: collision with root package name */
    public static final h f79874a;

    static {
        h hVar = new h();
        f79874a = hVar;
        hVar.f79898a = "A9VH9B8L4GX4";
    }

    public f(Context context) {
        super(context, 0, f79874a);
    }

    public final a a() {
        return a.NETWORK_DETECTOR;
    }

    public final boolean a(JSONObject jSONObject) {
        s.a(jSONObject, "actky", d.f());
        return true;
    }
}
