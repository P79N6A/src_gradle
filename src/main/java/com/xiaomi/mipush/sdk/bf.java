package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.az;
import com.xiaomi.push.g;
import com.xiaomi.push.ik;
import com.xiaomi.push.iu;
import com.xiaomi.push.ix;
import com.xiaomi.push.j;
import com.xiaomi.push.jj;
import com.xiaomi.push.m;
import com.xiaomi.push.o;
import com.xiaomi.push.service.aj;
import java.util.HashMap;
import java.util.Map;

public final class bf implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f81781a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ boolean f115a;

    bf(Context context, boolean z) {
        this.f81781a = context;
        this.f115a = z;
    }

    public final void run() {
        Map<String, String> map;
        String str;
        String b2;
        b.a("do sync info");
        jj jjVar = new jj(aj.a(), false);
        d a2 = d.a(this.f81781a);
        jjVar.c(iu.SyncInfo.f570a);
        jjVar.b(a2.a());
        jjVar.d(this.f81781a.getPackageName());
        jjVar.f710a = new HashMap();
        o.a(jjVar.f710a, "app_version", g.a(this.f81781a, this.f81781a.getPackageName()));
        o.a(jjVar.f710a, "app_version_code", Integer.toString(g.a(this.f81781a, this.f81781a.getPackageName())));
        o.a(jjVar.f710a, "push_sdk_vn", "3_6_16");
        o.a(jjVar.f710a, "push_sdk_vc", Integer.toString(30616));
        o.a(jjVar.f710a, "token", a2.b());
        if (!m.d()) {
            String a3 = az.a(j.f(this.f81781a));
            if (!TextUtils.isEmpty(j.h(this.f81781a))) {
                a3 = a3 + "," + r4;
            }
            if (!TextUtils.isEmpty(a3)) {
                o.a(jjVar.f710a, "imei_md5", a3);
            }
        }
        o.a(jjVar.f710a, "reg_id", a2.c());
        o.a(jjVar.f710a, "reg_secret", a2.d());
        o.a(jjVar.f710a, "accept_time", MiPushClient.getAcceptTime(this.f81781a).replace(",", "-"));
        if (this.f115a) {
            o.a(jjVar.f710a, "aliases_md5", be.c(MiPushClient.getAllAlias(this.f81781a)));
            o.a(jjVar.f710a, "topics_md5", be.c(MiPushClient.getAllTopic(this.f81781a)));
            map = jjVar.f710a;
            str = "accounts_md5";
            b2 = be.c(MiPushClient.getAllUserAccount(this.f81781a));
        } else {
            o.a(jjVar.f710a, "aliases", be.d(MiPushClient.getAllAlias(this.f81781a)));
            o.a(jjVar.f710a, "topics", be.d(MiPushClient.getAllTopic(this.f81781a)));
            map = jjVar.f710a;
            str = "user_accounts";
            b2 = be.d(MiPushClient.getAllUserAccount(this.f81781a));
        }
        o.a(map, str, b2);
        ay.a(this.f81781a).a(jjVar, ik.Notification, false, (ix) null);
    }
}
