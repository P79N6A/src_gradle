package com.xiaomi.push;

import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.fi;
import com.xiaomi.push.service.al;
import java.util.HashMap;

public class gi {
    public static void a(al.b bVar, String str, gq gqVar) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        fi.c cVar = new fi.c();
        if (!TextUtils.isEmpty(bVar.f82500c)) {
            cVar.a(bVar.f82500c);
        }
        if (!TextUtils.isEmpty(bVar.f82502e)) {
            cVar.d(bVar.f82502e);
        }
        if (!TextUtils.isEmpty(bVar.f82503f)) {
            cVar.e(bVar.f82503f);
        }
        cVar.b(bVar.f941a ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_NOTIFY);
        cVar.c(!TextUtils.isEmpty(bVar.f82501d) ? bVar.f82501d : "XIAOMI-SASL");
        gj gjVar = new gj();
        gjVar.c(bVar.f942b);
        gjVar.a(Integer.parseInt(bVar.g));
        gjVar.b(bVar.f939a);
        gjVar.a("BIND", (String) null);
        gjVar.a(gjVar.e());
        b.a("[Slim]: bind id=" + gjVar.e());
        HashMap hashMap = new HashMap();
        hashMap.put("challenge", str);
        hashMap.put("token", bVar.f82500c);
        hashMap.put("chid", bVar.g);
        hashMap.put("from", bVar.f942b);
        hashMap.put("id", gjVar.e());
        hashMap.put("to", "xiaomi.com");
        if (bVar.f941a) {
            str2 = "kick";
            str3 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str2 = "kick";
            str3 = PushConstants.PUSH_TYPE_NOTIFY;
        }
        hashMap.put(str2, str3);
        if (!TextUtils.isEmpty(bVar.f82502e)) {
            str4 = "client_attrs";
            str5 = bVar.f82502e;
        } else {
            str4 = "client_attrs";
            str5 = "";
        }
        hashMap.put(str4, str5);
        if (!TextUtils.isEmpty(bVar.f82503f)) {
            str6 = "cloud_attrs";
            str7 = bVar.f82503f;
        } else {
            str6 = "cloud_attrs";
            str7 = "";
        }
        hashMap.put(str6, str7);
        if (bVar.f82501d.equals("XIAOMI-PASS") || bVar.f82501d.equals("XMPUSH-PASS")) {
            str8 = ax.a(bVar.f82501d, null, hashMap, bVar.h);
        } else {
            bVar.f82501d.equals("XIAOMI-SASL");
            str8 = null;
        }
        cVar.f(str8);
        gjVar.a(cVar.a(), (String) null);
        gqVar.b(gjVar);
    }

    public static void a(String str, String str2, gq gqVar) {
        gj gjVar = new gj();
        gjVar.c(str2);
        gjVar.a(Integer.parseInt(str));
        gjVar.a("UBND", (String) null);
        gqVar.b(gjVar);
    }
}
