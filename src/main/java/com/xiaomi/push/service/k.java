package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.g;
import com.xiaomi.push.service.al;
import com.xiaomi.push.u;
import java.util.Locale;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public final int f82577a;

    /* renamed from: a  reason: collision with other field name */
    public final String f995a;

    /* renamed from: b  reason: collision with root package name */
    public final String f82578b;

    /* renamed from: c  reason: collision with root package name */
    public final String f82579c;

    /* renamed from: d  reason: collision with root package name */
    public final String f82580d;

    /* renamed from: e  reason: collision with root package name */
    public final String f82581e;

    /* renamed from: f  reason: collision with root package name */
    public final String f82582f;

    public k(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.f995a = str;
        this.f82578b = str2;
        this.f82579c = str3;
        this.f82580d = str4;
        this.f82581e = str5;
        this.f82582f = str6;
        this.f82577a = i;
    }

    public static boolean a() {
        try {
            return Class.forName("miui.os.Build").getField("IS_ALPHA_BUILD").getBoolean(null);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(Context context) {
        return "com.xiaomi.xmsf".equals(context.getPackageName()) && a();
    }

    private static boolean b(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }

    public al.b a(XMPushService xMPushService) {
        al.b bVar = new al.b(xMPushService);
        a(bVar, xMPushService, xMPushService.b(), "c");
        return bVar;
    }

    public al.b a(al.b bVar, Context context, d dVar, String str) {
        bVar.f939a = context.getPackageName();
        bVar.f942b = this.f995a;
        bVar.h = this.f82579c;
        bVar.f82500c = this.f82578b;
        bVar.g = "5";
        bVar.f82501d = "XMPUSH-PASS";
        bVar.f941a = false;
        String str2 = "";
        if (b(context)) {
            str2 = g.b(context);
        }
        bVar.f82502e = String.format("%1$s:%2$s,%3$s:%4$s,%5$s:%6$s:%7$s:%8$s,%9$s:%10$s,%11$s:%12$s", new Object[]{"sdk_ver", 38, "cpvn", "3_6_16", "cpvc", 30616, "aapn", str2, "country_code", a.a(context).b(), "region", a.a(context).a()});
        bVar.f82503f = String.format("%1$s:%2$s,%3$s:%4$s,%5$s:%6$s,sync:1", new Object[]{"appid", b(context) ? "1000271" : this.f82580d, "locale", Locale.getDefault().toString(), "miid", u.a(context)});
        if (a(context)) {
            bVar.f82503f += String.format(",%1$s:%2$s", new Object[]{"ab", str});
        }
        bVar.f938a = dVar;
        return bVar;
    }
}
