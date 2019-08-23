package com.tencent.wxop.stat.b;

import android.content.Context;
import com.tencent.wxop.stat.a.d;
import com.tencent.wxop.stat.a.n;
import com.tencent.wxop.stat.a.r;
import org.json.JSONObject;

public final class h extends e {

    /* renamed from: a  reason: collision with root package name */
    private d f79877a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f79878b;

    public h(Context context, int i, JSONObject jSONObject, com.tencent.wxop.stat.h hVar) {
        super(context, i, hVar);
        this.f79877a = new d(context);
        this.f79878b = jSONObject;
    }

    public final a a() {
        return a.SESSION_ENV;
    }

    public final boolean a(JSONObject jSONObject) {
        if (this.f79873f != null) {
            jSONObject.put("ut", this.f79873f.f79786c);
        }
        if (this.f79878b != null) {
            jSONObject.put("cfg", this.f79878b);
        }
        Context context = this.m;
        if (n.f79820c < 0) {
            n.f79820c = r.a(context, "mta.qq.com.checktime", 0);
        }
        if (Math.abs(System.currentTimeMillis() - n.f79820c) > 86400000) {
            jSONObject.put("ncts", 1);
        }
        this.f79877a.a(jSONObject, null);
        return true;
    }
}
