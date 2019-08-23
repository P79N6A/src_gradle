package com.bytedance.ttnet.b;

import com.bytedance.common.utility.StringUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f22549a;

    /* renamed from: b  reason: collision with root package name */
    public String f22550b;

    /* renamed from: c  reason: collision with root package name */
    public long f22551c;

    /* renamed from: d  reason: collision with root package name */
    public String f22552d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f22553e;

    /* renamed from: f  reason: collision with root package name */
    public String f22554f;
    public String g;
    public boolean h;

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", this.f22549a);
        jSONObject.put(PushConstants.WEB_URL, this.f22550b);
        jSONObject.put("query_time", this.f22551c);
        if (!this.h) {
            jSONObject.put("raw_sign", this.f22553e);
            jSONObject.put("ss_sign", this.f22554f);
            jSONObject.put("local_sign", this.g);
        }
        if (!StringUtils.isEmpty(this.f22552d)) {
            jSONObject.put("err_msg", this.f22552d);
        }
        return jSONObject;
    }
}
