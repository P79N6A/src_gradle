package com.alipay.sdk.a;

import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

public final class f extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f5409a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f5410b;

    public final void run() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("toastCallBack", "true");
        } catch (JSONException unused) {
        }
        a aVar = new a("callback");
        aVar.f5394a = this.f5409a.f5394a;
        aVar.f5398e = jSONObject;
        this.f5410b.f5405a.a(aVar);
    }

    f(c cVar, a aVar) {
        this.f5410b = cVar;
        this.f5409a = aVar;
    }
}
