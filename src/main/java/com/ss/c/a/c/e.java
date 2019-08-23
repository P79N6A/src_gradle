package com.ss.c.a.c;

import com.ss.c.a.b;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {

    interface a {
        void a(com.ss.c.a.a.a aVar);

        void a(JSONObject jSONObject);
    }

    static void a(b bVar, String str, String str2, a aVar) {
        com.ss.c.a.a.a aVar2;
        if (str2 != null) {
            b.a a2 = bVar.a(str, str2);
            if (a2 == null) {
                aVar.a(new com.ss.c.a.a.a(-111, "result is null", null));
                return;
            }
            Exception exc = a2.f78288d;
            if (exc != null || a2.f78285a == null) {
                HashMap hashMap = new HashMap();
                if (a2.f78285a != null) {
                    hashMap.put("rawResp", a2.f78285a);
                }
                if (exc instanceof IOException) {
                    hashMap.put("description", "network IO exception");
                    aVar2 = new com.ss.c.a.a.a(-108, exc.toString(), hashMap);
                } else if (exc instanceof JSONException) {
                    hashMap.put("description", "parse JSON failure");
                    if (a2.f78286b != null) {
                        hashMap.put("rowBody", a2.f78286b);
                    }
                    if (a2.f78287c != null) {
                        hashMap.put("responseHeader", a2.f78287c);
                    }
                    aVar2 = new com.ss.c.a.a.a(-100, exc.getMessage(), hashMap);
                } else {
                    hashMap.put("description", "response not successful");
                    aVar2 = new com.ss.c.a.a.a(-104, exc.getMessage(), hashMap);
                }
                aVar.a(aVar2);
                return;
            }
            aVar.a(a2.f78285a);
        }
    }
}
