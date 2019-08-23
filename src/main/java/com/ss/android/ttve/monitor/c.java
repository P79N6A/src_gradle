package com.ss.android.ttve.monitor;

import android.content.Context;
import android.support.annotation.RestrictTo;
import b.a.a.a.e;
import b.a.a.a.f;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class c {
    private static e a() {
        try {
            return f.a("1357");
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(String str) {
        e a2 = a();
        if (a2 == null) {
            return null;
        }
        JSONObject g = a2.g();
        if (g != null) {
            try {
                return g.getString(str);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static void a(String str, String str2) {
        e a2 = a();
        if (a2 != null) {
            JSONObject g = a2.g();
            if (g != null) {
                try {
                    g.put(str, str2);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static void a(String str, int i, JSONObject jSONObject) {
        String language = Locale.getDefault().getLanguage();
        String country = Locale.getDefault().getCountry();
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        jSONObject.put("te_language", language);
        jSONObject.put("te_region", country);
        if (a() != null) {
            a().a(str, i, jSONObject, null);
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        f.a(context, "1357", d.a(context, str, str2, str3), new e.a() {
        });
    }
}
