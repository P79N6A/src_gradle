package com.monitor.cloudmessage.a.a;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.monitor.cloudmessage.a.a;
import com.monitor.cloudmessage.callback.g;
import com.monitor.cloudmessage.entity.ConsumerResult;
import org.json.JSONObject;

public final class k extends a {

    /* renamed from: a  reason: collision with root package name */
    public g f27329a;

    public final String a() {
        return "patch";
    }

    public final boolean c(com.monitor.cloudmessage.entity.a aVar) throws Exception {
        JSONObject jSONObject = new JSONObject(aVar.f27359a);
        if (this.f27329a == null) {
            return false;
        }
        if (a(jSONObject, aVar)) {
            return true;
        }
        this.f27329a.a(jSONObject.optString(PushConstants.WEB_URL), jSONObject.optString("md5"));
        ConsumerResult b2 = this.f27329a.b();
        if (b2.isSuccess()) {
            b(aVar);
        } else {
            a(b2.getErrMsg(), b2.getSpecificParams(), aVar);
        }
        return true;
    }
}
