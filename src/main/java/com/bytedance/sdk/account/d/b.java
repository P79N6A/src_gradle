package com.bytedance.sdk.account.d;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.account.api.call.d;
import com.bytedance.sdk.account.c.a;
import com.bytedance.sdk.account.f.a.f;
import com.bytedance.sdk.account.f.a.g;
import com.bytedance.sdk.account.f.a.k;
import com.bytedance.sdk.account.j.e;
import com.ss.android.account.b;
import com.ss.android.account.c;
import java.util.Map;
import org.json.JSONObject;

public final class b {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static b.a f22332a = new b.a();

        public static com.bytedance.sdk.account.k.b a(JSONObject jSONObject) throws Exception {
            return b(jSONObject);
        }

        private static com.bytedance.sdk.account.k.b b(JSONObject jSONObject) throws Exception {
            com.ss.android.account.a.a.a aVar = c.f2422b;
            if (aVar != null) {
                com.bytedance.sdk.account.k.a a2 = aVar.a();
                if (a2 != null) {
                    return a2.a(jSONObject);
                }
            }
            return b.a.b(jSONObject);
        }

        public static void a(JSONObject jSONObject, e eVar) throws Exception {
            com.bytedance.sdk.account.k.b b2 = b(jSONObject);
            if (b2 != null) {
                eVar.f22510b = b2;
            }
        }

        public static void a(e eVar, JSONObject jSONObject) {
            if (jSONObject != null) {
                if (jSONObject.has("error_code")) {
                    eVar.g = jSONObject.optInt("error_code", eVar.g);
                } else if (jSONObject.has("code")) {
                    eVar.g = jSONObject.optInt("code", eVar.g);
                }
                eVar.h = jSONObject.optString("description");
                String optString = jSONObject.optString("name");
                if ("connect_switch".equals(optString) || "connect_exist".equals(optString)) {
                    eVar.f22512d = jSONObject.optString("description");
                    eVar.f22513e = jSONObject.optString("dialog_tips");
                    eVar.f22514f = jSONObject.optString("auth_token");
                }
            }
        }

        public static d a(e eVar, boolean z, int i) {
            d dVar = new d(z, 0);
            dVar.error = eVar.g;
            dVar.errorMsg = eVar.h;
            dVar.f22253b = eVar.f22512d;
            dVar.f22254c = eVar.f22513e;
            dVar.f22255d = eVar.f22514f;
            dVar.f22252a = eVar.f22510b;
            return dVar;
        }
    }

    public static void a(com.bytedance.sdk.account.j.a aVar, JSONObject jSONObject) {
        if (jSONObject.has("error_code")) {
            aVar.g = jSONObject.optInt("error_code", aVar.g);
        } else if (jSONObject.has("code")) {
            aVar.g = jSONObject.optInt("code", aVar.g);
        }
        aVar.h = jSONObject.optString("description");
    }

    public static void a(f fVar, JSONObject jSONObject) {
        if (jSONObject.has("error_code")) {
            fVar.g = jSONObject.optInt("error_code", fVar.g);
        } else if (jSONObject.has("code")) {
            fVar.g = jSONObject.optInt("code", fVar.g);
        }
        fVar.h = jSONObject.optString("description");
        if (fVar instanceof f) {
            fVar.i = jSONObject.optString("captcha");
            fVar.j = jSONObject.optString("alert_text");
        }
        if (fVar.g == 1001 && (fVar instanceof k)) {
            ((k) fVar).f22391c = jSONObject.optString("dialog_tips");
        }
        if (fVar.g == 1057 && (fVar instanceof k)) {
            k kVar = (k) fVar;
            kVar.f22391c = jSONObject.optString("dialog_tips");
            kVar.f22392d = jSONObject.optString("next_url");
        }
        if (fVar.g == 1057 && (fVar instanceof g)) {
            g gVar = (g) fVar;
            gVar.f22378f = jSONObject.optString("dialog_tips");
            gVar.m = jSONObject.optString("next_url");
        }
    }

    public static a.C0233a a(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        a.C0233a aVar = new a.C0233a();
        if (!TextUtils.isEmpty(str)) {
            aVar.a("platform", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            aVar.a("access_token", Uri.encode(str2));
        }
        if (!TextUtils.isEmpty(str3)) {
            aVar.a("expires_in", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            aVar.a("code", Uri.encode(str4));
        }
        if (!TextUtils.isEmpty(null)) {
            aVar.a("profile_key", Uri.encode(null));
        }
        if (!TextUtils.isEmpty(str6)) {
            aVar.a("platform_app_id", str6);
        }
        if (map != null && !map.isEmpty()) {
            for (String next : map.keySet()) {
                if (!TextUtils.isEmpty(next)) {
                    aVar.a(next, map.get(next));
                }
            }
        }
        return aVar;
    }
}
