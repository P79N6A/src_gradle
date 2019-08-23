package com.monitor.cloudmessage.a.a;

import android.text.TextUtils;
import com.monitor.cloudmessage.a.a;
import com.monitor.cloudmessage.callback.i;
import com.monitor.cloudmessage.entity.ConsumerResult;
import org.json.JSONObject;

public final class n extends a {

    /* renamed from: a  reason: collision with root package name */
    public i f27332a;

    public final String a() {
        return "route";
    }

    public final boolean c(com.monitor.cloudmessage.entity.a aVar) throws Exception {
        String optString = new JSONObject(aVar.f27359a).optString("schema");
        if (TextUtils.isEmpty(optString)) {
            a("路由scheme为空", aVar);
            return true;
        } else if (this.f27332a == null) {
            return false;
        } else {
            this.f27332a.a(optString);
            ConsumerResult b2 = this.f27332a.b();
            if (b2.isSuccess()) {
                b(aVar);
            } else {
                a(b2.getErrMsg(), b2.getSpecificParams(), aVar);
            }
            return true;
        }
    }
}
