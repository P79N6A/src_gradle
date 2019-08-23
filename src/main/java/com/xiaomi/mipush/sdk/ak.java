package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.push.az;
import com.xiaomi.push.j;
import com.xiaomi.push.m;
import java.util.HashMap;

public class ak {
    public static HashMap<String, String> a(Context context, String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            hashMap.put("appToken", d.a(context).b());
            hashMap.put("regId", MiPushClient.getRegId(context));
            hashMap.put("appId", d.a(context).a());
            hashMap.put("regResource", d.a(context).e());
            if (!m.d()) {
                String g = j.g(context);
                if (!TextUtils.isEmpty(g)) {
                    hashMap.put("imeiMd5", az.a(g));
                }
            }
            hashMap.put("isMIUI", String.valueOf(m.a()));
            hashMap.put("miuiVersion", m.a());
            hashMap.put("devId", j.a(context, true));
            hashMap.put("model", Build.MODEL);
            hashMap.put("pkgName", context.getPackageName());
            hashMap.put("sdkVersion", "3_6_16");
            hashMap.put("androidVersion", String.valueOf(Build.VERSION.SDK_INT));
            hashMap.put("os", Build.VERSION.RELEASE + "-" + Build.VERSION.INCREMENTAL);
            hashMap.put("andId", j.e(context));
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("clientInterfaceId", str);
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }
}
