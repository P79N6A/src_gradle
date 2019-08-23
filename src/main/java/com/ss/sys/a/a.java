package com.ss.sys.a;

import android.util.Base64;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static long f78469a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static int f78470b = 504;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f78471c = false;

    /* renamed from: d  reason: collision with root package name */
    public static long f78472d = 0;

    /* renamed from: e  reason: collision with root package name */
    static String f78473e = "";

    /* renamed from: f  reason: collision with root package name */
    static String f78474f = "";

    public static String a() {
        String str;
        String str2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("os", "Android");
            jSONObject.put("version", "1.0.3");
            if (f78471c) {
                str = "token_id";
                str2 = f78474f;
            } else {
                str = "token_id";
                str2 = "";
            }
            jSONObject.put(str, str2);
            jSONObject.put("code", f78470b);
            return Base64.encodeToString(jSONObject.toString().getBytes(), 2);
        } catch (Throwable unused) {
            return "";
        }
    }
}
