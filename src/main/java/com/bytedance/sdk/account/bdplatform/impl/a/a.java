package com.bytedance.sdk.account.bdplatform.impl.a;

import com.bytedance.sdk.account.bdplatform.b.b;
import com.bytedance.sdk.account.bdplatform.b.d;
import com.bytedance.sdk.account.bdplatform.b.e;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {
    public static com.bytedance.sdk.account.bdplatform.b.a a(String str) {
        if (str == null) {
            return null;
        }
        com.bytedance.sdk.account.bdplatform.b.a aVar = new com.bytedance.sdk.account.bdplatform.b.a();
        try {
            a(aVar, str);
            if (aVar.f22281e) {
                if (aVar.h != null) {
                    aVar.f22269a = aVar.h.optString("code");
                    return aVar;
                }
                aVar.f22282f = -1;
                return aVar;
            }
        } catch (Exception unused) {
        }
        return aVar;
    }

    public static e b(String str) {
        if (str == null) {
            return null;
        }
        e eVar = new e();
        try {
            a(eVar, str);
            if (eVar.f22281e) {
                if (eVar.h != null) {
                    eVar.f22283a = eVar.h.optString("ticket");
                    return eVar;
                }
                eVar.f22282f = -1;
                return eVar;
            }
        } catch (Exception unused) {
        }
        return eVar;
    }

    public static b c(String str) {
        if (str == null) {
            return null;
        }
        b bVar = new b();
        try {
            a(bVar, str);
            if (bVar.f22281e) {
                if (bVar.h != null) {
                    bVar.f22270a = bVar.h.optString("client_name");
                    bVar.f22271b = bVar.h.optString("client_icon");
                    JSONArray optJSONArray = bVar.h.optJSONArray("scopes");
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            bVar.f22272c.add(optJSONArray.optString(i));
                        }
                    }
                    JSONObject optJSONObject = bVar.h.optJSONObject("scope_dict");
                    if (optJSONObject != null) {
                        bVar.f22273d = optJSONObject;
                    }
                    return bVar;
                }
                bVar.f22282f = -1;
                return bVar;
            }
        } catch (Exception unused) {
        }
        return bVar;
    }

    private static void a(d dVar, String str) throws Exception {
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            if ("success".equals(jSONObject.optString("message"))) {
                dVar.f22281e = true;
                dVar.h = jSONObject.optJSONObject("data");
                return;
            }
            dVar.f22281e = false;
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                dVar.f22282f = optJSONObject.optInt("error_code");
                dVar.g = optJSONObject.optString("description");
            }
            return;
        }
        throw new IllegalArgumentException("argument is null");
    }
}
