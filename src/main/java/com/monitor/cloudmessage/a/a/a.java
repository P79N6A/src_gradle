package com.monitor.cloudmessage.a.a;

import android.text.TextUtils;
import com.monitor.cloudmessage.entity.ConsumerResult;
import org.json.JSONObject;

public final class a extends com.monitor.cloudmessage.a.a {

    /* renamed from: a  reason: collision with root package name */
    public com.monitor.cloudmessage.callback.a f27311a;

    public final String a() {
        return "abtest";
    }

    public final boolean c(com.monitor.cloudmessage.entity.a aVar) throws Exception {
        JSONObject jSONObject = new JSONObject(aVar.f27359a);
        if (this.f27311a == null) {
            return false;
        }
        if (a(jSONObject, aVar)) {
            return true;
        }
        if (TextUtils.isEmpty(jSONObject.optString("field"))) {
            return false;
        }
        Object obj = jSONObject.get("value");
        this.f27311a.a(jSONObject.optString("spKey"), obj);
        ConsumerResult b2 = this.f27311a.b();
        if (b2.isSuccess()) {
            b(aVar);
        } else {
            a(b2.getErrMsg(), b2.getSpecificParams(), aVar);
        }
        return true;
    }
}
