package com.unicom.xiaowo.login.c;

import android.content.Context;
import android.net.Network;
import android.os.Handler;
import android.os.Looper;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.unicom.xiaowo.login.d.a;
import com.unicom.xiaowo.login.d.h;
import com.unicom.xiaowo.login.d.i;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private static volatile f f81438a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f81439b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private a f81440c = new a();

    private f() {
    }

    public static f a() {
        if (f81438a == null) {
            synchronized (f.class) {
                if (f81438a == null) {
                    f81438a = new f();
                }
            }
        }
        return f81438a;
    }

    public final void a(Context context, k kVar) {
        try {
            String str = "http://opencloud.wostore.cn/openapi/netauth/precheck/wp?" + i.a(a(context), "&");
            if (i.a(context.getApplicationContext()) == 1) {
                this.f81439b.post(new h(this, context, str, kVar));
            } else if (i.a(context.getApplicationContext()) == 0) {
                a(str, null, kVar);
            } else {
                kVar.a(2, "获取鉴权信息失败");
                a.a().b();
            }
        } catch (Exception unused) {
            kVar.a(2, "");
            a.a().b();
        }
    }

    public final void a(String str, String str2, HashMap hashMap, k kVar) {
        try {
            this.f81440c.a("https://opencloud.wostore.cn/authz/oauth/token?timestamp=".concat(String.valueOf(str2)), str, hashMap, new j(kVar));
        } catch (Exception unused) {
            kVar.a(2, "");
        }
    }

    private static String a(Context context) {
        String a2;
        try {
            String packageName = context.getPackageName();
            String a3 = i.a(context, context.getPackageName());
            if (packageName == null) {
                packageName = "";
            }
            if (a3 == null) {
                a3 = "";
            }
            String a4 = com.unicom.xiaowo.login.a.a.a();
            h.f81462a = a4;
            String decode = URLDecoder.decode(i.c(a4), "utf-8");
            String str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE + a2 + "30100" + "jsonp" + decode + packageName + a3 + r7 + "3.1.0AL02B0307" + h.b();
            "unsign:".concat(String.valueOf(str));
            String a5 = i.a(str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("client_id", a2);
            jSONObject.put("client_type", "30100");
            jSONObject.put("format", "jsonp");
            jSONObject.put("version", "3.1.0AL02B0307");
            jSONObject.put("business_type", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            jSONObject.put("packname", packageName);
            jSONObject.put("packsign", URLEncoder.encode(a3, "utf-8"));
            jSONObject.put("timeStamp", System.currentTimeMillis());
            jSONObject.put("key", decode);
            jSONObject.put("sign", a5);
            return jSONObject.toString();
        } catch (Exception e2) {
            new StringBuilder("getPreCheckParam error:").append(e2.getMessage());
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, Network network, k kVar) {
        try {
            a aVar = this.f81440c;
            g gVar = new g(kVar);
            ExecutorService executorService = aVar.f81426a;
            d dVar = new d(aVar, str, null, network, gVar);
            executorService.submit(dVar);
        } catch (Exception unused) {
            kVar.a(2, "");
            a.a().b();
        }
    }
}
