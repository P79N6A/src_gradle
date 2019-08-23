package com.umeng.analytics.social;

import android.content.Context;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.bv;
import com.umeng.analytics.pro.by;
import com.umeng.analytics.social.UMPlatformData;
import java.io.ByteArrayOutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f80727a;

    private static String a(List<String> list) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(URLEncoder.encode(list.toString()).getBytes());
            return byteArrayOutputStream.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static Map<String, String> a(Context context) {
        HashMap hashMap = new HashMap();
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            by.b("No IMEI.");
        }
        String str = null;
        try {
            if (bv.a(context, "android.permission.READ_PHONE_STATE")) {
                str = telephonyManager.getDeviceId();
            }
        } catch (Exception e2) {
            by.e((Throwable) e2);
        }
        String q = bv.q(context);
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (!TextUtils.isEmpty(q)) {
            hashMap.put("mac", q);
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("imei", str);
        }
        if (!TextUtils.isEmpty(string)) {
            hashMap.put("android_id", string);
        }
        return hashMap;
    }

    private static String b(UMPlatformData... uMPlatformDataArr) {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        for (UMPlatformData uMPlatformData : uMPlatformDataArr) {
            UMPlatformData.GENDER gender = uMPlatformData.getGender();
            String name = uMPlatformData.getName();
            if (gender == null) {
                try {
                    if (TextUtils.isEmpty(name)) {
                    }
                } catch (Exception e2) {
                    throw new a("build body exception", (Throwable) e2);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            if (gender == null) {
                str = "";
            } else {
                str = String.valueOf(gender.value);
            }
            jSONObject2.put("gender", str);
            if (name == null) {
                str2 = "";
            } else {
                str2 = String.valueOf(name);
            }
            jSONObject2.put("name", str2);
            jSONObject.put(uMPlatformData.getMeida().toString(), jSONObject2);
        }
        if (jSONObject.length() == 0) {
            return null;
        }
        return jSONObject.toString();
    }

    private static List<String> a(UMPlatformData... uMPlatformDataArr) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (UMPlatformData uMPlatformData : uMPlatformDataArr) {
            sb.append(uMPlatformData.getMeida().toString());
            sb.append(',');
            sb2.append(uMPlatformData.getUsid());
            sb2.append(',');
            sb3.append(uMPlatformData.getWeiboId());
            sb3.append(',');
        }
        if (uMPlatformDataArr.length > 0) {
            sb.deleteCharAt(sb.length() - 1);
            sb2.deleteCharAt(sb2.length() - 1);
            sb3.deleteCharAt(sb3.length() - 1);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("platform=" + sb.toString());
        arrayList.add("usid=" + sb2.toString());
        if (sb3.length() > 0) {
            arrayList.add("weiboid=" + sb3.toString());
        }
        return arrayList;
    }

    private static Map<String, String> b(Context context) throws a {
        HashMap hashMap = new HashMap();
        Map<String, String> a2 = a(context);
        if (a2 == null || a2.isEmpty()) {
            throw new a("can`t get device id.");
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry next : a2.entrySet()) {
            if (!TextUtils.isEmpty((CharSequence) next.getValue())) {
                sb2.append((String) next.getKey());
                sb2.append(",");
                sb.append((String) next.getValue());
                sb.append(",");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            hashMap.put("deviceid", sb.toString());
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.length() - 1);
            hashMap.put("idtype", sb2.toString());
        }
        return hashMap;
    }

    protected static String[] a(Context context, String str, UMPlatformData... uMPlatformDataArr) throws a {
        if (uMPlatformDataArr == null || uMPlatformDataArr.length == 0) {
            throw new a("platform data is null");
        }
        if (!TextUtils.isEmpty(AnalyticsConfig.getAppkey(context))) {
            ArrayList arrayList = new ArrayList();
            String str2 = "http://log.umsns.com/share/api/" + r0 + "/";
            if (f80727a == null || f80727a.isEmpty()) {
                f80727a = b(context);
            }
            if (f80727a != null && !f80727a.isEmpty()) {
                for (Map.Entry next : f80727a.entrySet()) {
                    arrayList.add(((String) next.getKey()) + "=" + ((String) next.getValue()));
                }
            }
            arrayList.add("date=" + String.valueOf(System.currentTimeMillis()));
            arrayList.add("channel=" + d.f80726d);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add("topic=" + str);
            }
            arrayList.addAll(a(uMPlatformDataArr));
            String b2 = b(uMPlatformDataArr);
            if (b2 == null) {
                b2 = "null";
            }
            String str3 = str2 + "?" + a((List<String>) arrayList);
            while (str3.contains("%2C+")) {
                str3 = str3.replace("%2C+", "&");
            }
            while (str3.contains("%3D")) {
                str3 = str3.replace("%3D", "=");
            }
            while (str3.contains("%5B")) {
                str3 = str3.replace("%5B", "");
            }
            while (str3.contains("%5D")) {
                str3 = str3.replace("%5D", "");
            }
            by.b("url:" + str3 + "\nBody:" + b2);
            return new String[]{str3, b2};
        }
        throw new a("can`t get appkey.");
    }
}
