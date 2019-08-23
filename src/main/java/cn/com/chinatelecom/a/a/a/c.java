package cn.com.chinatelecom.a.a.a;

import android.content.Context;
import android.os.Build;
import cn.com.chinatelecom.a.a.d.b;
import cn.com.chinatelecom.a.a.d.b.a;
import cn.com.chinatelecom.a.a.e.d;
import cn.com.chinatelecom.a.a.e.g;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import org.json.JSONObject;

public final class c extends b {
    public static void a(Context context, String str, String str2, String str3, String str4, String str5, JSONObject jSONObject) {
        final Context context2 = context;
        final String str6 = str;
        final String str7 = str2;
        final String str8 = str3;
        final String str9 = str4;
        final String str10 = str5;
        AnonymousClass2 r0 = new Runnable(null) {
            public final void run() {
                try {
                    if (context2 != null) {
                        Context context = context2;
                        String str = str6;
                        String str2 = str7;
                        String str3 = str8;
                        String str4 = str9;
                        String str5 = str10;
                        JSONObject jSONObject = null;
                        a.a(cn.com.chinatelecom.a.a.d.a.a.a("http://open.e.189.cn/" + b.f1701b, b.a(context), cn.com.chinatelecom.a.a.d.a.a(context, str, str2, str3, str4, str5, jSONObject), null));
                    }
                } catch (Exception unused) {
                }
            }
        };
        a(r0);
    }

    public static void a(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        final Context context2 = context;
        final String str15 = str;
        final String str16 = str2;
        final String str17 = str3;
        final String str18 = str4;
        final String str19 = str5;
        final String str20 = str6;
        final String str21 = str7;
        final String str22 = str8;
        final String str23 = str9;
        final String str24 = str10;
        final String str25 = str11;
        final String str26 = str12;
        final String str27 = str13;
        final String str28 = str14;
        AnonymousClass1 r0 = new Runnable() {
            public final void run() {
                try {
                    Context context = context2;
                    String str = str15;
                    String str2 = str16;
                    String str3 = str17;
                    String str4 = str18;
                    String str5 = str19;
                    String str6 = str20;
                    String str7 = str21;
                    String str8 = str22;
                    String str9 = str23;
                    String str10 = str24;
                    String str11 = str25;
                    String str12 = str26;
                    String str13 = str27;
                    String str14 = str28;
                    String str15 = str2;
                    HashMap hashMap = new HashMap();
                    hashMap.put("fun", str3);
                    hashMap.put("imsi", d.b(context));
                    hashMap.put("wifiSwitch", str8);
                    hashMap.put("switchTime", str9);
                    hashMap.put("type", str4);
                    hashMap.put("deviceId", d.c(context));
                    hashMap.put("networkType", g.d(context));
                    hashMap.put("onlineType", g.c(context));
                    hashMap.put("isAuthResult", str5);
                    hashMap.put("successMsg", str6);
                    hashMap.put("failMsg", str10);
                    hashMap.put("mobilePhone", str7);
                    hashMap.put("operatorType", d.f(context));
                    hashMap.put("osInfo", "Android:" + Build.VERSION.RELEASE);
                    hashMap.put("imei", d.a(context));
                    hashMap.put("mobileBrand", Build.BRAND);
                    hashMap.put("terminalInfo", Build.MODEL);
                    hashMap.put("mobileModel", Build.MODEL);
                    hashMap.put("preGetMobileResult", str11);
                    hashMap.put("preFailMsg", str12);
                    hashMap.put("accessCode", str13);
                    hashMap.put("clientType", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                    hashMap.put("versionSdk", "v1.3");
                    hashMap.put("timeStamp", Long.toString(System.currentTimeMillis()));
                    hashMap.put("bussinessType", str14);
                    a.a(cn.com.chinatelecom.a.a.d.a.a.a("https://open.e.189.cn/" + b.f1700a, b.a(context), cn.com.chinatelecom.a.a.c.g.a("30021", "json", "v1.46", str, str15, hashMap), null));
                } catch (Exception unused) {
                }
            }
        };
        a(r0);
    }
}
