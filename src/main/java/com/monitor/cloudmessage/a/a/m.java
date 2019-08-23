package com.monitor.cloudmessage.a.a;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.monitor.cloudmessage.a.a;
import com.monitor.cloudmessage.callback.h;
import com.monitor.cloudmessage.entity.ConsumerResult;
import org.json.JSONObject;

public final class m extends a {

    /* renamed from: a  reason: collision with root package name */
    public h f27331a;

    public final String a() {
        return "plugin";
    }

    public final boolean c(com.monitor.cloudmessage.entity.a aVar) throws Exception {
        JSONObject jSONObject = new JSONObject(aVar.f27359a);
        if (this.f27331a == null) {
            return false;
        }
        this.f27331a.a(jSONObject.optString("packageName"), jSONObject.optInt("versionCode"), jSONObject.optString(PushConstants.WEB_URL), jSONObject.optString("md5"), jSONObject.optBoolean("wifiOnly", false));
        ConsumerResult b2 = this.f27331a.b();
        if (b2.isSuccess()) {
            b(aVar);
        } else {
            a(b2.getErrMsg(), b2.getSpecificParams(), aVar);
        }
        return true;
    }
}
