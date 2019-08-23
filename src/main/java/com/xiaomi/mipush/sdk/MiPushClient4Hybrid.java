package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.mipush.sdk.d;
import com.xiaomi.push.az;
import com.xiaomi.push.g;
import com.xiaomi.push.ge;
import com.xiaomi.push.ik;
import com.xiaomi.push.iu;
import com.xiaomi.push.ix;
import com.xiaomi.push.iy;
import com.xiaomi.push.j;
import com.xiaomi.push.ja;
import com.xiaomi.push.jj;
import com.xiaomi.push.jk;
import com.xiaomi.push.jl;
import com.xiaomi.push.jq;
import com.xiaomi.push.jr;
import com.xiaomi.push.ju;
import com.xiaomi.push.m;
import com.xiaomi.push.service.aj;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MiPushClient4Hybrid {

    /* renamed from: a  reason: collision with root package name */
    private static HybridProvider f81737a;

    /* renamed from: a  reason: collision with other field name */
    private static MiPushClientCallbackV2 f78a;

    /* renamed from: a  reason: collision with other field name */
    private static Map<String, d.a> f79a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static Map<String, Long> f81738b = new HashMap();

    private static short a(MiPushMessage miPushMessage, String str) {
        String str2 = miPushMessage.getExtra() == null ? "" : miPushMessage.getExtra().get("__hybrid_device_status");
        int intValue = !TextUtils.isEmpty(str2) ? Integer.valueOf(str2).intValue() : 0;
        if (f81737a != null && !f81737a.isAllowNotification(str)) {
            intValue = (intValue & -4) + g.a.NOT_ALLOWED.a();
        }
        return (short) intValue;
    }

    private static void a(Context context, MiPushMessage miPushMessage) {
        Intent intent;
        String str = miPushMessage.getExtra().get("web_uri");
        String str2 = miPushMessage.getExtra().get("intent_uri");
        if (!TextUtils.isEmpty(str)) {
            intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
        } else {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    intent = Intent.parseUri(str2, 0);
                } catch (URISyntaxException e2) {
                    b.a("intent uri parse failed", (Throwable) e2);
                }
            }
            intent = null;
        }
        if (intent == null) {
            b.a("web uri and intent uri all are empty");
            return;
        }
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (Throwable th) {
            b.a("start activity failed from web uri or intent uri", th);
        }
    }

    private static void a(Context context, MiPushMessage miPushMessage, String str, short s) {
        String str2;
        String str3;
        if (miPushMessage == null || miPushMessage.getExtra() == null) {
            b.a("do not ack message, message is null");
            return;
        }
        try {
            ja jaVar = new ja();
            jaVar.b(d.a(context).a());
            jaVar.a(miPushMessage.getMessageId());
            jaVar.a(Long.valueOf(miPushMessage.getExtra().get("__hybrid_message_ts")).longValue());
            jaVar.a(s);
            if (!TextUtils.isEmpty(miPushMessage.getTopic())) {
                jaVar.c(miPushMessage.getTopic());
            }
            ay.a(context).a(jaVar, ik.AckMessage, false, PushMessageHelper.generateMessage(miPushMessage));
            b.b("MiPushClient4Hybrid ack mina message, app is :" + str + ", messageId is " + miPushMessage.getMessageId());
        } catch (Throwable th) {
            b.a(th);
        } finally {
            str2 = "__hybrid_message_ts";
            miPushMessage.getExtra().remove(str2);
            str3 = "__hybrid_device_status";
            miPushMessage.getExtra().remove(str3);
        }
    }

    private static void a(Context context, String str) {
        SharedPreferences a2 = c.a(context, "mipush_extra", 0);
        a2.edit().putLong("last_pull_notification_" + str, System.currentTimeMillis()).commit();
    }

    /* renamed from: a  reason: collision with other method in class */
    private static boolean m31a(Context context, String str) {
        SharedPreferences a2 = c.a(context, "mipush_extra", 0);
        StringBuilder sb = new StringBuilder("last_pull_notification_");
        sb.append(str);
        return Math.abs(System.currentTimeMillis() - a2.getLong(sb.toString(), -1)) > 300000;
    }

    private static boolean a(MiPushMessage miPushMessage) {
        return TextUtils.equals(miPushMessage.getExtra() == null ? "" : miPushMessage.getExtra().get("push_server_action"), "platform_message");
    }

    public static void ackMessage(Context context, MiPushMessage miPushMessage) {
        if (miPushMessage == null || miPushMessage.getExtra() == null) {
            b.a("do not ack message, message is null");
            return;
        }
        String str = miPushMessage.getExtra().get("hybrid_pkg");
        a(context, miPushMessage, str, a(miPushMessage, str));
    }

    public static boolean isRegistered(Context context, String str) {
        return d.a(context).a(str) != null;
    }

    public static void onNotificationMessageArrived(Context context, String str, MiPushMessage miPushMessage) {
        if (!TextUtils.isEmpty(str)) {
            ackMessage(context, miPushMessage);
            if (f78a != null) {
                f78a.onNotificationMessageArrived(str, miPushMessage);
            }
        }
    }

    public static void onNotificationMessageClicked(Context context, String str, MiPushMessage miPushMessage) {
        if (!TextUtils.isEmpty(str)) {
            if (a(miPushMessage)) {
                a(context, miPushMessage);
            } else if (f78a != null) {
                f78a.onNotificationMessageClicked(str, miPushMessage);
            }
        }
    }

    public static void onPlatformNotificationMessageArrived(Context context, MiPushMessage miPushMessage, boolean z) {
        int intValue = Integer.valueOf(miPushMessage.getExtra().get("__hybrid_device_status")).intValue();
        if (!z) {
            intValue = g.a.NOT_ALLOWED.a() + (intValue & -4);
        }
        a(context, miPushMessage, context.getPackageName(), (short) intValue);
    }

    public static void onReceivePassThroughMessage(Context context, String str, MiPushMessage miPushMessage) {
        if (!TextUtils.isEmpty(str) && f78a != null) {
            f78a.onReceivePassThroughMessage(str, miPushMessage);
        }
    }

    public static void onReceiveRegisterResult(Context context, jl jlVar) {
        ArrayList arrayList;
        String b2 = jlVar.b();
        if (jlVar.a() == 0) {
            d.a aVar = f79a.get(b2);
            if (aVar != null) {
                aVar.a(jlVar.f763e, jlVar.f764f);
                d.a(context).a(b2, aVar);
            }
        }
        if (!TextUtils.isEmpty(jlVar.f763e)) {
            arrayList = new ArrayList();
            arrayList.add(jlVar.f763e);
        } else {
            arrayList = null;
        }
        MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(ge.COMMAND_REGISTER.f413a, arrayList, jlVar.f753a, jlVar.f762d, null);
        if (f78a != null) {
            f78a.onReceiveRegisterResult(b2, generateCommandMessage);
        }
    }

    public static void onReceiveUnregisterResult(Context context, jr jrVar) {
        MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(ge.COMMAND_UNREGISTER.f413a, null, jrVar.f829a, jrVar.f837d, null);
        String a2 = jrVar.a();
        if (f78a != null) {
            f78a.onReceiveUnregisterResult(a2, generateCommandMessage);
        }
    }

    public static void registerPush(Context context, String str, String str2, String str3) {
        if (d.a(context).a(str2, str3, str)) {
            ArrayList arrayList = new ArrayList();
            d.a a2 = d.a(context).a(str);
            if (a2 != null) {
                arrayList.add(a2.f81786c);
                MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(ge.COMMAND_REGISTER.f413a, arrayList, 0, null, null);
                if (f78a != null) {
                    f78a.onReceiveRegisterResult(str, generateCommandMessage);
                }
            }
            if (a(context, str)) {
                jj jjVar = new jj();
                jjVar.b(str2);
                jjVar.c(iu.PullOfflineMessage.f570a);
                jjVar.a(aj.a());
                jjVar.a(false);
                ay.a(context).a(jjVar, ik.Notification, false, true, null, false, str, str2);
                b.b("MiPushClient4Hybrid pull offline pass through message");
                a(context, str);
            }
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - (f81738b.get(str) != null ? f81738b.get(str).longValue() : 0)) < 5000) {
            b.a("MiPushClient4Hybrid  Could not send register message within 5s repeatedly.");
            return;
        }
        f81738b.put(str, Long.valueOf(currentTimeMillis));
        String a3 = az.a(6);
        d.a aVar = new d.a(context);
        aVar.c(str2, str3, a3);
        f79a.put(str, aVar);
        jk jkVar = new jk();
        jkVar.a(aj.a());
        jkVar.b(str2);
        jkVar.e(str3);
        jkVar.d(str);
        jkVar.f(a3);
        jkVar.c(g.a(context, context.getPackageName()));
        jkVar.b(g.a(context, context.getPackageName()));
        jkVar.g("3_6_16");
        jkVar.a(30616);
        jkVar.h(j.e(context));
        jkVar.a(iy.Init);
        if (!m.d()) {
            String g = j.g(context);
            if (!TextUtils.isEmpty(g)) {
                if (m.b()) {
                    jkVar.i(g);
                }
                jkVar.k(az.a(g));
            }
        }
        jkVar.j(j.a());
        int a4 = j.a();
        if (a4 >= 0) {
            jkVar.c(a4);
        }
        jj jjVar2 = new jj();
        jjVar2.c(iu.HybridRegister.f570a);
        jjVar2.b(d.a(context).a());
        jjVar2.d(context.getPackageName());
        jjVar2.a(ju.a(jkVar));
        jjVar2.a(aj.a());
        ay.a(context).a(jjVar2, ik.Notification, (ix) null);
    }

    public static void removeDuplicateCache(Context context, MiPushMessage miPushMessage) {
        String str = miPushMessage.getExtra() != null ? miPushMessage.getExtra().get("jobkey") : null;
        if (TextUtils.isEmpty(str)) {
            str = miPushMessage.getMessageId();
        }
        av.a(context, str);
    }

    public static void setCallback(MiPushClientCallbackV2 miPushClientCallbackV2) {
        f78a = miPushClientCallbackV2;
    }

    public static void setProvider(HybridProvider hybridProvider) {
        f81737a = hybridProvider;
    }

    public static void unregisterPush(Context context, String str) {
        f81738b.remove(str);
        d.a a2 = d.a(context).a(str);
        if (a2 != null) {
            jq jqVar = new jq();
            jqVar.a(aj.a());
            jqVar.d(str);
            jqVar.b(a2.f121a);
            jqVar.c(a2.f81786c);
            jqVar.e(a2.f81785b);
            jj jjVar = new jj();
            jjVar.c(iu.HybridUnregister.f570a);
            jjVar.b(d.a(context).a());
            jjVar.d(context.getPackageName());
            jjVar.a(ju.a(jqVar));
            jjVar.a(aj.a());
            ay.a(context).a(jjVar, ik.Notification, (ix) null);
            d.a(context).b(str);
            MIPushNotificationHelper4Hybrid.clearNotification(context, str);
        }
    }
}
