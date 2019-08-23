package com.ss.android.http;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.ss.android.http.d;
import com.ss.android.message.log.c;
import com.ss.android.ugc.aweme.app.f;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a extends d {
    private Context o;
    private long p;

    public final void b() {
        super.b();
        c.a(this.o, "local_http_server", "stop", new JSONObject[0]);
        Logger.debug();
    }

    public final void a() throws IOException {
        super.a();
        c.a(this.o, "local_http_server", "start", new JSONObject[0]);
        Logger.debug();
    }

    private d.n b(String str) {
        JSONObject a2 = a(false, str);
        d.n a3 = d.a(d.n.c.BAD_REQUEST, "json", new ByteArrayInputStream(a2.toString().getBytes()), (long) a2.toString().length());
        a3.a("Access-Control-Allow-Origin", "*");
        c.a(this.o, "local_http_server", "response", a2);
        return a3;
    }

    private d.n a(Map<String, String> map) {
        try {
            String str = map.get(f.f34168b);
            Logger.debug();
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String host = Uri.parse(str).getHost();
            if (!"home".equals(host) && !"detail".equals(host) && !"media_account".equals(host)) {
                return b("only accept \"home\" and \"detail\".");
            }
            Intent intent = new Intent("com.ss.android.action.openurl");
            intent.setPackage(this.o.getPackageName());
            intent.putExtra(f.f34168b, str);
            this.o.startService(intent);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("openUrl", str);
                c.a(this.o, "local_http_server", f.f34168b, jSONObject);
            } catch (Exception unused) {
            }
            JSONObject a2 = a(true, "");
            d.n a3 = d.a(d.n.c.OK, "json", a2.toString());
            a3.a("Access-Control-Allow-Origin", "*");
            c.a(this.o, "local_http_server", "response", a2);
            this.p = System.currentTimeMillis();
            return a3;
        } catch (Throwable th) {
            return b(th.getMessage());
        }
    }

    public final d.n a(d.l lVar) {
        try {
            Map b2 = lVar.b();
            Map d2 = lVar.d();
            d.m c2 = lVar.c();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("header", new JSONObject(b2));
            jSONObject.put("parms", new JSONObject(d2));
            if (d2.isEmpty()) {
                c.a(this.o, "local_http_server", "ping_request", jSONObject);
            } else {
                c.a(this.o, "local_http_server", "get_request", jSONObject);
            }
            if (!new ArrayList(Arrays.asList(c.a(this.o).f29159a.a("deep_link_host", "").replaceAll(" ", "").split(","))).contains(Uri.parse((String) b2.get("origin")).getHost())) {
                return b("referer host not in white list.");
            }
            Logger.debug();
            if (System.currentTimeMillis() - this.p < 3000) {
                return b("Request too often.");
            }
            if (d.m.GET.equals(c2)) {
                d.n a2 = a(d2);
                if (a2 != null) {
                    return a2;
                }
            }
            Logger.debug();
            JSONObject a3 = a(false, "fail");
            d.n a4 = d.a(d.n.c.BAD_REQUEST, "json", a3.toString());
            a4.a("Access-Control-Allow-Origin", "*");
            c.a(this.o, "local_http_server", "response", a3);
            return a4;
        } catch (Exception e2) {
            return b(e2.getMessage());
        }
    }

    public a(Context context, int i) {
        super(i);
        this.o = context.getApplicationContext();
    }

    private static JSONObject a(boolean z, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("success", Boolean.valueOf(z));
        hashMap.put("reason", str);
        return new JSONObject(hashMap);
    }
}
