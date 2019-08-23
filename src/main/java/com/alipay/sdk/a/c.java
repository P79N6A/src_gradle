package com.alipay.sdk.a;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    b f5405a;

    /* renamed from: b  reason: collision with root package name */
    Context f5406b;

    public c(Context context, b bVar) {
        this.f5406b = context;
        this.f5405a = bVar;
    }

    public final void a(String str, int i) throws JSONException {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error", i - 1);
            a aVar = new a("callback");
            aVar.f5398e = jSONObject;
            aVar.f5394a = str;
            this.f5405a.a(aVar);
        }
    }
}
