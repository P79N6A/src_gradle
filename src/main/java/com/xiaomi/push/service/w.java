package com.xiaomi.push.service;

import android.content.Context;
import android.os.Messenger;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.dz;
import com.xiaomi.push.gj;
import com.xiaomi.push.gq;
import com.xiaomi.push.hb;
import com.xiaomi.push.hh;
import com.xiaomi.push.ik;
import com.xiaomi.push.iz;
import com.xiaomi.push.jg;
import com.xiaomi.push.jj;
import com.xiaomi.push.ju;
import com.xiaomi.push.jv;
import com.xiaomi.push.ka;
import com.xiaomi.push.service.al;
import com.xiaomi.push.service.bc;
import java.nio.ByteBuffer;

public final class w {
    static gj a(XMPushService xMPushService, byte[] bArr) {
        jg jgVar = new jg();
        try {
            ju.a(jgVar, bArr);
            return a(l.a((Context) xMPushService), (Context) xMPushService, jgVar);
        } catch (ka e2) {
            b.a((Throwable) e2);
            return null;
        }
    }

    static gj a(k kVar, Context context, jg jgVar) {
        try {
            gj gjVar = new gj();
            gjVar.a(5);
            gjVar.c(kVar.f995a);
            gjVar.b(a(jgVar));
            gjVar.a("SECMSG", "message");
            String str = kVar.f995a;
            jgVar.f693a.f619a = str.substring(0, str.indexOf("@"));
            jgVar.f693a.f623c = str.substring(str.indexOf("/") + 1);
            gjVar.a(ju.a(jgVar), kVar.f82579c);
            gjVar.a(1);
            b.a("try send mi push message. packagename:" + jgVar.f698b + " action:" + jgVar.f691a);
            return gjVar;
        } catch (NullPointerException e2) {
            b.a((Throwable) e2);
            return null;
        }
    }

    static jg a(String str, String str2) {
        jj jjVar = new jj();
        jjVar.b(str2);
        jjVar.c("package uninstalled");
        jjVar.a(hh.i());
        jjVar.a(false);
        return a(str, str2, jjVar, ik.Notification);
    }

    static <T extends jv<T, ?>> jg a(String str, String str2, T t, ik ikVar) {
        byte[] a2 = ju.a(t);
        jg jgVar = new jg();
        iz izVar = new iz();
        izVar.f618a = 5;
        izVar.f619a = "fakeid";
        jgVar.a(izVar);
        jgVar.a(ByteBuffer.wrap(a2));
        jgVar.a(ikVar);
        jgVar.b(true);
        jgVar.b(str);
        jgVar.a(false);
        jgVar.a(str2);
        return jgVar;
    }

    private static String a(jg jgVar) {
        if (!(jgVar.f692a == null || jgVar.f692a.f609b == null)) {
            String str = jgVar.f692a.f609b.get("ext_traffic_source_pkg");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return jgVar.f698b;
    }

    static String a(String str) {
        return str + ".permission.MIPUSH_RECEIVE";
    }

    static void a(XMPushService xMPushService) {
        k a2 = l.a(xMPushService.getApplicationContext());
        if (a2 != null) {
            al.b a3 = l.a(xMPushService.getApplicationContext()).a(xMPushService);
            a(xMPushService, a3);
            al.a().a(a3);
            bc a4 = bc.a((Context) xMPushService);
            x xVar = new x("GAID", 172800, xMPushService, a2);
            a4.a((bc.a) xVar);
        }
    }

    static void a(XMPushService xMPushService, jg jgVar) {
        dz.a(jgVar.b(), xMPushService.getApplicationContext(), jgVar, -1);
        gq a2 = xMPushService.a();
        if (a2 == null) {
            throw new hb("try send msg while connection is null.");
        } else if (a2.a()) {
            gj a3 = a(l.a((Context) xMPushService), (Context) xMPushService, jgVar);
            if (a3 != null) {
                a2.b(a3);
            }
        } else {
            throw new hb("Don't support XMPP connection.");
        }
    }

    static void a(XMPushService xMPushService, al.b bVar) {
        bVar.a((Messenger) null);
        bVar.a((al.b.a) new y(xMPushService));
    }

    static void a(XMPushService xMPushService, String str, byte[] bArr) {
        dz.a(str, xMPushService.getApplicationContext(), bArr);
        gq a2 = xMPushService.a();
        if (a2 == null) {
            throw new hb("try send msg while connection is null.");
        } else if (a2.a()) {
            gj a3 = a(xMPushService, bArr);
            if (a3 != null) {
                a2.b(a3);
            } else {
                o.a(xMPushService, str, bArr, 70000003, "not a valid message");
            }
        } else {
            throw new hb("Don't support XMPP connection.");
        }
    }
}
