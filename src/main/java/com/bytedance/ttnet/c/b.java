package com.bytedance.ttnet.c;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public Context f22565a;

    /* renamed from: b  reason: collision with root package name */
    public a f22566b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f22567c = true;

    public static a a(JSONObject jSONObject) {
        boolean z;
        try {
            a aVar = new a();
            boolean z2 = true;
            if (jSONObject.has("local_enable")) {
                if (jSONObject.getInt("local_enable") == 0) {
                    z = false;
                } else {
                    z = true;
                }
                aVar.f22559a = z;
            }
            if (jSONObject.has("probe_enable")) {
                if (jSONObject.getInt("probe_enable") == 0) {
                    z2 = false;
                }
                aVar.f22560b = z2;
            }
            if (jSONObject.has("local_host_filter")) {
                JSONArray jSONArray = jSONObject.getJSONArray("local_host_filter");
                HashMap hashMap = new HashMap();
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String string = jSONArray.getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(string, 0);
                        }
                    }
                }
                aVar.f22561c = hashMap;
            } else {
                aVar.f22561c = null;
            }
            if (jSONObject.has("host_replace_map")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("host_replace_map");
                HashMap hashMap2 = new HashMap();
                if (jSONObject2.length() > 0) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string2 = jSONObject2.getString(next);
                        if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string2)) {
                            hashMap2.put(next, string2);
                        }
                    }
                }
                aVar.f22562d = hashMap2;
            } else {
                aVar.f22562d = null;
            }
            aVar.f22563e = jSONObject.optInt("req_to_cnt", aVar.f22563e);
            aVar.f22564f = jSONObject.optInt("req_to_api_cnt", aVar.f22564f);
            aVar.g = jSONObject.optInt("req_to_ip_cnt", aVar.g);
            aVar.h = jSONObject.optInt("req_err_cnt", aVar.h);
            aVar.i = jSONObject.optInt("req_err_api_cnt", aVar.i);
            aVar.j = jSONObject.optInt("req_err_ip_cnt", aVar.j);
            aVar.k = jSONObject.optInt("update_interval", aVar.k);
            aVar.l = jSONObject.optInt("update_random_range", aVar.l);
            aVar.m = jSONObject.optString("http_code_black", aVar.m);
            return aVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public b(Context context, boolean z) {
        this.f22565a = context;
        this.f22567c = z;
        this.f22566b = new a();
    }
}
