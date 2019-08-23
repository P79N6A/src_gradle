package com.bytedance.ttnet.utils;

import com.bytedance.frameworks.baselib.network.http.util.i;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static a f22672a = null;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f22673b = true;

    public interface a {
        void a(String str, String str2, int i, boolean z, JSONObject jSONObject);
    }

    public static void a(a aVar) {
        f22672a = aVar;
    }

    public static String a(String str) {
        if (!f22673b) {
            return null;
        }
        try {
            if (i.a(str).getHost().endsWith(com.bytedance.ttnet.a.b())) {
                return String.valueOf(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
