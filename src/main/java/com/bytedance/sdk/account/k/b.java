package com.bytedance.sdk.account.k;

import android.support.annotation.CallSuper;
import android.text.TextUtils;
import com.ss.android.account.b.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public long f22516a;

    /* renamed from: b  reason: collision with root package name */
    protected final Map<String, a> f22517b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public boolean f22518c;

    /* renamed from: d  reason: collision with root package name */
    public String f22519d;

    /* renamed from: e  reason: collision with root package name */
    public JSONObject f22520e;

    /* renamed from: f  reason: collision with root package name */
    public JSONObject f22521f;

    public Map<String, a> b() {
        return this.f22517b;
    }

    @CallSuper
    public void a() throws Exception {
        boolean z;
        JSONObject jSONObject = this.f22520e;
        this.f22516a = jSONObject.optLong("user_id", 0);
        this.f22519d = jSONObject.optString("session_key", "");
        if (jSONObject.optInt("new_user") != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f22518c = z;
        String optString = jSONObject.optString("mobile");
        String optString2 = jSONObject.optString("email");
        a a2 = a.a("mobile");
        a a3 = a.a("email");
        a3.f2419e = optString2;
        if (!TextUtils.isEmpty(optString2)) {
            b().put(a3.f2416b, a3);
        }
        a2.f2419e = optString;
        if (!TextUtils.isEmpty(optString)) {
            b().put(a2.f2416b, a2);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("connects");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            long currentTimeMillis = System.currentTimeMillis();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                String string = jSONObject2.getString("platform");
                if (!(string == null || string.length() == 0)) {
                    a a4 = a.a(string);
                    if (jSONObject2.has("screen_name")) {
                        a4.f2419e = jSONObject2.optString("screen_name");
                    } else if (jSONObject2.has("platform_screen_name")) {
                        a4.f2419e = jSONObject2.optString("platform_screen_name");
                    }
                    a4.f2420f = jSONObject2.optString("profile_image_url");
                    a4.g = jSONObject2.optString("platform_uid");
                    a4.h = jSONObject2.optString("create_time");
                    long optLong = jSONObject2.optLong("expires_in");
                    if (optLong > 0) {
                        a4.i = (1000 * optLong) + currentTimeMillis;
                    }
                    a4.j = optLong;
                    b().put(string, a4);
                }
            }
        }
    }

    public b(JSONObject jSONObject) {
        this.f22521f = jSONObject;
        this.f22520e = jSONObject.optJSONObject("data");
    }
}
