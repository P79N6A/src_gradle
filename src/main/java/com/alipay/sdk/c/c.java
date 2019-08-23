package com.alipay.sdk.c;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alipay.sdk.b.a;
import com.alipay.sdk.h.b;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public final class c {

    /* renamed from: d  reason: collision with root package name */
    private static c f5475d;

    /* renamed from: a  reason: collision with root package name */
    public String f5476a;

    /* renamed from: b  reason: collision with root package name */
    public String f5477b = "sdk-and-lite";

    /* renamed from: c  reason: collision with root package name */
    public String f5478c;

    private c() {
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            if (f5475d == null) {
                f5475d = new c();
            }
            cVar = f5475d;
        }
        return cVar;
    }

    public static String b() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        new Random();
        return hexString + (r1.nextInt(9000) + PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
    }

    public final synchronized void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            PreferenceManager.getDefaultSharedPreferences(b.a().f5510a).edit().putString("trideskey", str).commit();
            a.f5469b = str;
        }
    }

    static String a(Context context, HashMap<String, String> hashMap) {
        String str;
        try {
            str = com.alipay.e.a.a.a(context, hashMap);
        } catch (Throwable th) {
            com.alipay.sdk.app.a.a.a("third", "GetApdidEx", th);
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            com.alipay.sdk.app.a.a.a("third", "GetApdidNull", "apdid == null");
        }
        return str;
    }

    public final String b(Context context, HashMap<String, String> hashMap) {
        try {
            return (String) d.a(2).submit(new e(this, context, hashMap)).get(3000, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            com.alipay.sdk.app.a.a.a("third", "GetApdidTimeout", th);
            return "";
        }
    }
}
