package com.unicom.xiaowo.login.b;

import com.unicom.xiaowo.login.ResultListener;
import org.json.JSONObject;

public class d {

    /* renamed from: b  reason: collision with root package name */
    private static volatile d f81424b;

    /* renamed from: a  reason: collision with root package name */
    public ResultListener f81425a;

    private d() {
    }

    public static d a() {
        if (f81424b == null) {
            synchronized (d.class) {
                if (f81424b == null) {
                    f81424b = new d();
                }
            }
        }
        return f81424b;
    }

    public final void a(String str) {
        b(str, "");
    }

    public final void a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resultCode", 0);
            jSONObject.put("resultMsg", str);
            jSONObject.put("resultData", new JSONObject(str2));
            this.f81425a.onResult(jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    public final void b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resultCode", 1);
            jSONObject.put("resultMsg", str);
            jSONObject.put("resultData", "");
            jSONObject.put("traceId", str2);
            this.f81425a.onResult(jSONObject.toString());
        } catch (Exception unused) {
        }
    }
}
