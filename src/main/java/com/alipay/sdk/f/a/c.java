package com.alipay.sdk.f.a;

import android.content.Context;
import com.alipay.sdk.f.b;
import com.alipay.sdk.f.d;
import com.ss.ugc.live.sdk.message.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import org.json.JSONException;
import org.json.JSONObject;

public final class c extends d {
    public final String a(String str, JSONObject jSONObject) {
        return str;
    }

    public final JSONObject a() throws JSONException {
        return null;
    }

    public final String c() throws JSONException {
        HashMap hashMap = new HashMap();
        hashMap.put("api_name", "/sdk/log");
        hashMap.put("api_version", BuildConfig.VERSION_NAME);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("log_v", "1.0");
        return a(hashMap, hashMap2);
    }

    public final b a(Context context, String str) throws Throwable {
        return a(context, str, "http://mcgw.alipay.com/sdklog.do", true);
    }

    public final List<Header> a(boolean z, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicHeader("msp-gzip", String.valueOf(z)));
        arrayList.add(new BasicHeader("content-type", "application/octet-stream"));
        arrayList.add(new BasicHeader("des-mode", "CBC"));
        return arrayList;
    }
}
