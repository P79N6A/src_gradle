package com.bytedance.apm.h;

import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static b f2001a;

    /* renamed from: b  reason: collision with root package name */
    private static b f2002b;

    static {
        AnonymousClass1 r0 = new b() {
        };
        f2001a = r0;
        f2002b = r0;
    }

    public static void a(String str, Object... objArr) {
        if (f2002b != null) {
            JSONObject jSONObject = new JSONObject();
            int length = objArr.length;
            if (length % 2 == 0) {
                int i = 0;
                while (i < length) {
                    try {
                        jSONObject.put(String.valueOf(objArr[i]), String.valueOf(objArr[i + 1]));
                        i += 2;
                    } catch (JSONException unused) {
                    }
                }
                new String[1][0] = jSONObject.toString();
                return;
            }
            throw new IllegalArgumentException();
        }
    }
}
