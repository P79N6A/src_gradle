package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.gj;
import com.xiaomi.push.hf;
import com.xiaomi.push.hg;
import com.xiaomi.push.hh;
import com.xiaomi.push.hj;
import com.xiaomi.push.m;
import com.xiaomi.push.service.al;
import java.util.Collection;
import java.util.Iterator;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private p f82560a = new p();

    public static String a(al.b bVar) {
        StringBuilder sb;
        String str;
        if (!"9".equals(bVar.g)) {
            sb = new StringBuilder();
            sb.append(bVar.f939a);
            str = ".permission.MIPUSH_RECEIVE";
        } else {
            sb = new StringBuilder();
            sb.append(bVar.f939a);
            str = ".permission.MIMC_RECEIVE";
        }
        sb.append(str);
        return sb.toString();
    }

    private static void a(Context context, Intent intent, al.b bVar) {
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, a(bVar));
        }
    }

    /* access modifiers changed from: package-private */
    public al.b a(gj gjVar) {
        Collection a2 = al.a().a(Integer.toString(gjVar.a()));
        if (a2.isEmpty()) {
            return null;
        }
        Iterator it2 = a2.iterator();
        if (a2.size() == 1) {
            return (al.b) it2.next();
        }
        String g = gjVar.g();
        while (it2.hasNext()) {
            al.b bVar = (al.b) it2.next();
            if (TextUtils.equals(g, bVar.f942b)) {
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public al.b a(hh hhVar) {
        Collection a2 = al.a().a(hhVar.k());
        if (a2.isEmpty()) {
            return null;
        }
        Iterator it2 = a2.iterator();
        if (a2.size() == 1) {
            return (al.b) it2.next();
        }
        String m = hhVar.m();
        String l = hhVar.l();
        while (it2.hasNext()) {
            al.b bVar = (al.b) it2.next();
            if (!TextUtils.equals(m, bVar.f942b)) {
                if (TextUtils.equals(l, bVar.f942b)) {
                }
            }
            return bVar;
        }
        return null;
    }

    @SuppressLint({"WrongConstant"})
    public void a(Context context) {
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.service_started");
        if (m.c()) {
            intent.addFlags(16777216);
        }
        context.sendBroadcast(intent);
    }

    public void a(Context context, al.b bVar, int i) {
        if (!"5".equalsIgnoreCase(bVar.g)) {
            Intent intent = new Intent();
            intent.setAction("com.xiaomi.push.channel_closed");
            intent.setPackage(bVar.f939a);
            intent.putExtra(ap.r, bVar.g);
            intent.putExtra("ext_reason", i);
            intent.putExtra(ap.p, bVar.f942b);
            intent.putExtra(ap.C, bVar.i);
            if (bVar.f933a == null || !"9".equals(bVar.g)) {
                a(context, intent, bVar);
                return;
            }
            try {
                bVar.f933a.send(Message.obtain(null, 17, intent));
            } catch (RemoteException unused) {
                bVar.f933a = null;
                b.a("peer may died: " + bVar.f942b.substring(bVar.f942b.lastIndexOf(64)));
            }
        }
    }

    public void a(Context context, al.b bVar, String str, String str2) {
        if ("5".equalsIgnoreCase(bVar.g)) {
            b.d("mipush kicked by server");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.kicked");
        intent.setPackage(bVar.f939a);
        intent.putExtra("ext_kick_type", str);
        intent.putExtra("ext_kick_reason", str2);
        intent.putExtra("ext_chid", bVar.g);
        intent.putExtra(ap.p, bVar.f942b);
        intent.putExtra(ap.C, bVar.i);
        a(context, intent, bVar);
    }

    public void a(Context context, al.b bVar, boolean z, int i, String str) {
        if ("5".equalsIgnoreCase(bVar.g)) {
            this.f82560a.a(context, bVar, z, i, str);
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_opened");
        intent.setPackage(bVar.f939a);
        intent.putExtra("ext_succeeded", z);
        if (!z) {
            intent.putExtra("ext_reason", i);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("ext_reason_msg", str);
        }
        intent.putExtra("ext_chid", bVar.g);
        intent.putExtra(ap.p, bVar.f942b);
        intent.putExtra(ap.C, bVar.i);
        a(context, intent, bVar);
    }

    public void a(XMPushService xMPushService, String str, gj gjVar) {
        al.b a2 = a(gjVar);
        if (a2 == null) {
            b.d("error while notify channel closed! channel " + str + " not registered");
        } else if ("5".equalsIgnoreCase(str)) {
            this.f82560a.a(xMPushService, gjVar, a2);
        } else {
            String str2 = a2.f939a;
            Intent intent = new Intent();
            intent.setAction("com.xiaomi.push.new_msg");
            intent.setPackage(str2);
            intent.putExtra("ext_chid", str);
            intent.putExtra("ext_raw_packet", gjVar.a(a2.h));
            intent.putExtra(ap.C, a2.i);
            intent.putExtra(ap.v, a2.h);
            if (a2.f933a != null) {
                try {
                    a2.f933a.send(Message.obtain(null, 17, intent));
                    return;
                } catch (RemoteException unused) {
                    a2.f933a = null;
                    b.a("peer may died: " + a2.f942b.substring(a2.f942b.lastIndexOf(64)));
                }
            }
            if (!"com.xiaomi.xmsf".equals(str2)) {
                a((Context) xMPushService, intent, a2);
            }
        }
    }

    public void a(XMPushService xMPushService, String str, hh hhVar) {
        String str2;
        al.b a2 = a(hhVar);
        if (a2 == null) {
            b.d("error while notify channel closed! channel " + str + " not registered");
        } else if ("5".equalsIgnoreCase(str)) {
            this.f82560a.a(xMPushService, hhVar, a2);
        } else {
            String str3 = a2.f939a;
            if (hhVar instanceof hg) {
                str2 = "com.xiaomi.push.new_msg";
            } else if (hhVar instanceof hf) {
                str2 = "com.xiaomi.push.new_iq";
            } else if (hhVar instanceof hj) {
                str2 = "com.xiaomi.push.new_pres";
            } else {
                b.d("unknown packet type, drop it");
                return;
            }
            Intent intent = new Intent();
            intent.setAction(str2);
            intent.setPackage(str3);
            intent.putExtra("ext_chid", str);
            intent.putExtra("ext_packet", hhVar.a());
            intent.putExtra(ap.C, a2.i);
            intent.putExtra(ap.v, a2.h);
            a((Context) xMPushService, intent, a2);
        }
    }
}
