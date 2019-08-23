package com.alipay.sdk.h;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.alipay.sdk.j.i;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private String f5506a = "";

    /* renamed from: b  reason: collision with root package name */
    private String f5507b = "";

    /* renamed from: c  reason: collision with root package name */
    private Context f5508c;

    public a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f5506a = packageInfo.versionName;
            this.f5507b = packageInfo.packageName;
            this.f5508c = context.getApplicationContext();
        } catch (Exception unused) {
        }
    }

    private String b(String str) {
        try {
            String a2 = a(str, "&", "bizcontext=");
            if (TextUtils.isEmpty(a2)) {
                return str + "&" + a("bizcontext=", "");
            }
            int indexOf = str.indexOf(a2);
            String substring = str.substring(0, indexOf);
            String substring2 = str.substring(indexOf + a2.length());
            return substring + b(a2, "bizcontext=", "") + substring2;
        } catch (Throwable unused) {
            return str;
        }
    }

    private String c(String str) {
        try {
            String a2 = a(str, "\"&", "bizcontext=\"");
            if (TextUtils.isEmpty(a2)) {
                return str + "&" + a("bizcontext=\"", "\"");
            }
            if (!a2.endsWith("\"")) {
                a2 = a2 + "\"";
            }
            int indexOf = str.indexOf(a2);
            String substring = str.substring(0, indexOf);
            String substring2 = str.substring(indexOf + a2.length());
            return substring + b(a2, "bizcontext=\"", "\"") + substring2;
        } catch (Throwable unused) {
            return str;
        }
    }

    public final String a(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("new_external_info==")) {
            return str;
        }
        if (!str.contains("\"&")) {
            return b(str);
        }
        return c(str);
    }

    private String a(String str, String str2) throws JSONException, UnsupportedEncodingException {
        String b2 = b("", "");
        return str + b2 + str2;
    }

    private String b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", "2014052600006128");
            jSONObject.put("ty", "and_lite");
            jSONObject.put("sv", "h.a.3.2.0");
            if (!this.f5507b.contains("setting") || !i.c(this.f5508c)) {
                jSONObject.put("an", this.f5507b);
            }
            jSONObject.put("av", this.f5506a);
            jSONObject.put("sdk_start_time", System.currentTimeMillis());
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(str, str2);
            }
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    private static String a(String str, String str2, String str3) {
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(str2);
        int i = 0;
        while (true) {
            if (i < split.length) {
                if (!TextUtils.isEmpty(split[i]) && split[i].startsWith(str3)) {
                    str4 = split[i];
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return str4;
    }

    private String b(String str, String str2, String str3) throws JSONException, UnsupportedEncodingException {
        String substring = str.substring(str2.length());
        JSONObject jSONObject = new JSONObject(substring.substring(0, substring.length() - str3.length()));
        if (!jSONObject.has("appkey")) {
            jSONObject.put("appkey", "2014052600006128");
        }
        if (!jSONObject.has("ty")) {
            jSONObject.put("ty", "and_lite");
        }
        if (!jSONObject.has("sv")) {
            jSONObject.put("sv", "h.a.3.2.0");
        }
        if (!jSONObject.has("an") && (!this.f5507b.contains("setting") || !i.c(this.f5508c))) {
            jSONObject.put("an", this.f5507b);
        }
        if (!jSONObject.has("av")) {
            jSONObject.put("av", this.f5506a);
        }
        if (!jSONObject.has("sdk_start_time")) {
            jSONObject.put("sdk_start_time", System.currentTimeMillis());
        }
        String jSONObject2 = jSONObject.toString();
        return str2 + jSONObject2 + str3;
    }
}
