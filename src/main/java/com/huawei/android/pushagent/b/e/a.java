package com.huawei.android.pushagent.b.e;

import android.content.Context;
import com.huawei.android.pushagent.b.a.a.b.b;
import com.huawei.android.pushagent.utils.a.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f25093a;

    private a() {
    }

    public static synchronized a a() {
        synchronized (a.class) {
            if (f25093a != null) {
                a aVar = f25093a;
                return aVar;
            }
            a aVar2 = new a();
            f25093a = aVar2;
            return aVar2;
        }
    }

    private void a(JSONObject jSONObject, Context context) throws JSONException {
        e.a("PushLogAC2815", "server command agent to refresh token");
        JSONObject jSONObject2 = jSONObject.getJSONObject("refreshToken");
        if (jSONObject2.has("pkgs")) {
            JSONArray jSONArray = jSONObject2.getJSONArray("pkgs");
            String[] strArr = new String[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                e.a("PushLogAC2815", "package need to refresh token:" + string);
                strArr[i] = string;
            }
            b.a(context, strArr);
            return;
        }
        e.a("PushLogAC2815", "all packages need to refresh token");
        b.c(context);
    }

    private void b(JSONObject jSONObject, Context context) throws JSONException {
        e.a("PushLogAC2815", "server command agent to refresh trs");
        JSONObject jSONObject2 = jSONObject.getJSONObject("refreshTrs");
        if (jSONObject2.has("belongId")) {
            int i = jSONObject2.getInt("belongId");
            e.a("PushLogAC2815", "need to refresh trs in belongId:" + i);
            if (i >= 0) {
                com.huawei.android.pushagent.b.b.a.a(context).a("belongId", (Object) Integer.valueOf(i));
            }
        }
        com.huawei.android.pushagent.b.b.a.b(context);
    }

    private void c(JSONObject jSONObject, Context context) throws JSONException {
        e.a("PushLogAC2815", "server command agent to refresh heartbeat");
        JSONObject jSONObject2 = jSONObject.getJSONObject("refreshHb");
        if (jSONObject2.has("fixedWifiHb")) {
            int i = jSONObject2.getInt("fixedWifiHb");
            e.a("PushLogAC2815", "fixed heartbeat in wifi is " + i);
            if (i > 60) {
                long j = (long) i;
                com.huawei.android.pushagent.b.b.a.a(context).a(j);
                com.huawei.android.pushagent.b.b.a.a(context).b(j);
            } else {
                e.a("PushLogAC2815", "fixed heartbeat in wifi is invalid");
            }
        }
        if (jSONObject2.has("fixed3GHb")) {
            int i2 = jSONObject2.getInt("fixed3GHb");
            e.a("PushLogAC2815", "fixed heartbeat in 3g is " + i2);
            if (i2 > 60) {
                long j2 = (long) i2;
                com.huawei.android.pushagent.b.b.a.a(context).c(j2);
                com.huawei.android.pushagent.b.b.a.a(context).d(j2);
            } else {
                e.a("PushLogAC2815", "fixed heartbeat in 3g is invalid");
            }
        }
        try {
            e.a("PushLogAC2815", "delete heartbeat files and reload heartbeat");
            com.huawei.android.pushagent.utils.a.e(context, new b(context).c());
            com.huawei.android.pushagent.b.a.a.e().f25015e.f();
        } catch (Exception e2) {
            e.c("PushLogAC2815", "delete heartbeat files or reload heartbeat error:" + e2.getMessage(), e2);
        }
    }

    public void a(Context context, com.huawei.android.pushagent.a.b.b bVar) {
        try {
            byte a2 = bVar.a();
            if (-91 == a2) {
                e.a("PushLogAC2815", "receive response from server");
            } else {
                if (-90 == a2) {
                    JSONObject c2 = bVar.c();
                    if (c2.has("refreshHb")) {
                        c(c2, context);
                    } else if (c2.has("refreshToken")) {
                        a(c2, context);
                    } else if (c2.has("refreshTrs")) {
                        b(c2, context);
                    } else {
                        e.d("PushLogAC2815", "cannot parse the unknown message:" + c2.toString());
                    }
                }
            }
        } catch (JSONException e2) {
            e.c("PushLogAC2815", "parse json error:" + e2.getMessage(), e2);
        } catch (Exception e3) {
            e.c("PushLogAC2815", "parse DecoupledPushMessage error: " + e3.getMessage(), e3);
        }
    }
}
