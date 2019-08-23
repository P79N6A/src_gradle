package com.taobao.applink.c;

import com.taobao.applink.util.c;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public Map f79158a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public String f79159b;

    /* renamed from: c  reason: collision with root package name */
    public String f79160c;

    /* renamed from: d  reason: collision with root package name */
    public long f79161d;

    /* renamed from: e  reason: collision with root package name */
    public String f79162e;

    /* renamed from: f  reason: collision with root package name */
    public String f79163f;

    private String b() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f79158a.keySet()) {
            if (!"group0".equals(str)) {
                sb.append(str);
                Map map = (Map) this.f79158a.get(str);
                for (String str2 : map.keySet()) {
                    sb.append(str2);
                    sb.append((String) map.get(str2));
                }
            }
        }
        try {
            sb.append("ALITRADE20160628");
            char[] charArray = sb.toString().toCharArray();
            Arrays.sort(charArray);
            return c.a(new String(charArray).getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public void a(JSONObject jSONObject) {
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                HashMap hashMap = new HashMap();
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                Iterator<String> keys2 = jSONObject2.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    hashMap.put(next2, jSONObject2.getString(next2));
                }
                this.f79158a.put(next, hashMap);
            }
        } catch (JSONException unused) {
        }
    }

    public boolean a() {
        if (!this.f79158a.isEmpty()) {
            String b2 = b();
            Map map = (Map) this.f79158a.get("group0");
            if (map != null) {
                String str = (String) map.get("sign");
                if (str != null && str.equals(b2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
