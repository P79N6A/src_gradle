package com.unicom.xiaowo.login.b;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.unicom.xiaowo.login.a.b;
import com.unicom.xiaowo.login.c.f;
import com.unicom.xiaowo.login.d.g;
import com.unicom.xiaowo.login.d.h;
import com.unicom.xiaowo.login.d.i;
import java.io.File;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f81416a;

    /* renamed from: b  reason: collision with root package name */
    private String f81417b = "";

    public static a a(Context context) {
        if (f81416a == null) {
            synchronized (a.class) {
                if (f81416a == null) {
                    f81416a = new a(context);
                }
            }
        }
        return f81416a;
    }

    private static String a() {
        try {
            String a2 = i.a(UUID.randomUUID().toString());
            try {
                if (TextUtils.isEmpty(a2)) {
                    return PushConstants.PUSH_TYPE_NOTIFY;
                }
            } catch (Exception unused) {
            }
            return a2;
        } catch (Exception unused2) {
            return "";
        }
    }

    public static void a(String str, String str2) {
        h.a(str);
        h.b(str2);
    }

    public void a(Context context, int i) {
        f.a().a(context, new b(this, i, context));
    }

    public void a(Context context, String str, String str2, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("grant_type", "password");
            jSONObject.put("username", str);
            jSONObject.put("password", a());
            jSONObject.put("scope", "read,write");
            jSONObject.put("loginmode", PushConstants.PUSH_TYPE_NOTIFY);
            this.f81417b = System.currentTimeMillis();
            f a2 = f.a();
            String a3 = i.a(jSONObject.toString(), "&");
            String str3 = this.f81417b;
            StringBuilder sb = new StringBuilder("basic ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(h.a());
            sb2.append(":");
            sb2.append(i.a(this.f81417b + h.b()).toUpperCase());
            sb.append(b.a(sb2.toString().getBytes()));
            String sb3 = sb.toString();
            HashMap hashMap = new HashMap();
            hashMap.put("accept", "*/*");
            hashMap.put("charset", "UTF-8");
            hashMap.put("version", "3.1.0AL02B0307");
            hashMap.put("Authorization", sb3);
            hashMap.put("packname", context.getPackageName());
            hashMap.put("packsign", i.a(context, context.getPackageName()));
            new StringBuilder("header:").append(hashMap.toString());
            a2.a(a3, str3, hashMap, new c(i, str2, context));
        } catch (Exception unused) {
            d.a().a("数据解析异常");
        }
    }

    private a(Context context) {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                if (new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/mmd.xv1").exists()) {
                    g.f81461a = true;
                }
            }
        } catch (Exception unused) {
        }
    }
}
