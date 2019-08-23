package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.dz;
import com.xiaomi.push.fz;
import com.xiaomi.push.g;
import com.xiaomi.push.gj;
import com.xiaomi.push.hb;
import com.xiaomi.push.he;
import com.xiaomi.push.hg;
import com.xiaomi.push.hh;
import com.xiaomi.push.hv;
import com.xiaomi.push.ik;
import com.xiaomi.push.iu;
import com.xiaomi.push.ix;
import com.xiaomi.push.ja;
import com.xiaomi.push.jg;
import com.xiaomi.push.jj;
import com.xiaomi.push.ju;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.al;
import com.xiaomi.push.service.z;
import com.xiaomi.push.u;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

public class p {
    public static Intent a(byte[] bArr, long j) {
        jg a2 = a(bArr);
        if (a2 == null) {
            return null;
        }
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mrt", Long.toString(j));
        intent.setPackage(a2.f698b);
        return intent;
    }

    public static jg a(Context context, jg jgVar) {
        ja jaVar = new ja();
        jaVar.b(jgVar.a());
        ix a2 = jgVar.a();
        if (a2 != null) {
            jaVar.a(a2.a());
            jaVar.a(a2.a());
            if (!TextUtils.isEmpty(a2.b())) {
                jaVar.c(a2.b());
            }
        }
        jaVar.a(ju.a(context, jgVar));
        jg a3 = w.a(jgVar.b(), jgVar.a(), jaVar, ik.AckMessage);
        ix a4 = jgVar.a().a();
        a4.a("mat", Long.toString(System.currentTimeMillis()));
        a3.a(a4);
        return a3;
    }

    public static jg a(byte[] bArr) {
        jg jgVar = new jg();
        try {
            ju.a(jgVar, bArr);
            return jgVar;
        } catch (Throwable th) {
            b.a(th);
            return null;
        }
    }

    private static void a(XMPushService xMPushService, jg jgVar) {
        xMPushService.a((XMPushService.i) new q(4, xMPushService, jgVar));
    }

    private static void a(XMPushService xMPushService, jg jgVar, String str) {
        xMPushService.a((XMPushService.i) new u(4, xMPushService, jgVar, str));
    }

    private static void a(XMPushService xMPushService, jg jgVar, String str, String str2) {
        v vVar = new v(4, xMPushService, jgVar, str, str2);
        xMPushService.a((XMPushService.i) vVar);
    }

    public static void a(XMPushService xMPushService, String str, byte[] bArr, Intent intent) {
        fz a2;
        String b2;
        String str2;
        String a3;
        int i;
        String str3;
        fz a4;
        String b3;
        String b4;
        String a5;
        String str4;
        boolean z;
        XMPushService xMPushService2 = xMPushService;
        byte[] bArr2 = bArr;
        Intent intent2 = intent;
        jg a6 = a(bArr);
        ix a7 = a6.a();
        String str5 = null;
        if (bArr2 != null) {
            dz.a(a6.b(), xMPushService.getApplicationContext(), null, a6.a(), bArr2.length);
        }
        if (c(a6) && a((Context) xMPushService, str)) {
            if (z.e(a6)) {
                fz.a(xMPushService.getApplicationContext()).a(a6.b(), z.b(a6), a7.a(), "old message received by new SDK.");
            }
            c(xMPushService2, a6);
        } else if (a(a6) && !a((Context) xMPushService, str) && !b(a6)) {
            if (z.e(a6)) {
                fz.a(xMPushService.getApplicationContext()).a(a6.b(), z.b(a6), a7.a(), "new message received by old SDK.");
            }
            d(xMPushService2, a6);
        } else if ((z.a(a6) && g.b((Context) xMPushService2, a6.f698b)) || a((Context) xMPushService2, intent2)) {
            if (ik.Registration == a6.a()) {
                String b5 = a6.b();
                SharedPreferences.Editor edit = c.a(xMPushService2, "pref_registered_pkg_names", 0).edit();
                edit.putString(b5, a6.f694a);
                edit.commit();
                fz.a(xMPushService.getApplicationContext()).a(b5, "E100003", a7.a(), 6003, "receive a register message");
                if (!TextUtils.isEmpty(a7.a())) {
                    intent2.putExtra("messageId", a7.a());
                    intent2.putExtra("eventMessageType", 6000);
                }
            }
            if (z.c(a6)) {
                fz.a(xMPushService.getApplicationContext()).a(a6.b(), z.b(a6), a7.a(), PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST, System.currentTimeMillis(), "receive notification message ");
                if (!TextUtils.isEmpty(a7.a())) {
                    intent2.putExtra("messageId", a7.a());
                    intent2.putExtra("eventMessageType", PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                }
            }
            if (z.b(a6)) {
                fz.a(xMPushService.getApplicationContext()).a(a6.b(), z.b(a6), a7.a(), 2001, System.currentTimeMillis(), "receive passThrough message");
                if (!TextUtils.isEmpty(a7.a())) {
                    intent2.putExtra("messageId", a7.a());
                    intent2.putExtra("eventMessageType", 2000);
                }
            }
            if (z.a(a6)) {
                fz.a(xMPushService.getApplicationContext()).a(a6.b(), z.b(a6), a7.a(), 3001, System.currentTimeMillis(), "receive business message");
                if (!TextUtils.isEmpty(a7.a())) {
                    intent2.putExtra("messageId", a7.a());
                    intent2.putExtra("eventMessageType", PushConstants.WORK_RECEIVER_EVENTCORE_ERROR);
                }
            }
            if (a7 != null && !TextUtils.isEmpty(a7.c()) && !TextUtils.isEmpty(a7.d()) && a7.f607b != 1 && (z.a(a7.a()) || !z.a((Context) xMPushService2, a6.f698b))) {
                if (a7 != null) {
                    if (a7.f605a != null) {
                        str5 = a7.f605a.get("jobkey");
                    }
                    if (TextUtils.isEmpty(str5)) {
                        str5 = a7.a();
                    }
                    z = ab.a(xMPushService2, a6.f698b, str5);
                } else {
                    z = false;
                }
                if (z) {
                    fz.a(xMPushService.getApplicationContext()).c(a6.b(), z.b(a6), a7.a(), "drop a duplicate message");
                    b.a("drop a duplicate message, key=" + str5);
                } else {
                    z.c a8 = z.a((Context) xMPushService2, a6, bArr2);
                    if (a8.f82607a > 0 && !TextUtils.isEmpty(a8.f1021a)) {
                        hv.a(xMPushService, a8.f1021a, a8.f82607a, true, false, System.currentTimeMillis());
                    }
                    if (!z.a(a6)) {
                        Intent intent3 = new Intent("com.xiaomi.mipush.MESSAGE_ARRIVED");
                        intent3.putExtra("mipush_payload", bArr2);
                        intent3.setPackage(a6.f698b);
                        try {
                            List<ResolveInfo> queryBroadcastReceivers = xMPushService.getPackageManager().queryBroadcastReceivers(intent3, 0);
                            if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
                                xMPushService2.sendBroadcast(intent3, w.a(a6.f698b));
                            }
                        } catch (Exception e2) {
                            xMPushService2.sendBroadcast(intent3, w.a(a6.f698b));
                            fz.a(xMPushService.getApplicationContext()).b(a6.b(), z.b(a6), a7.a(), e2.getMessage());
                        }
                    }
                }
                b(xMPushService2, a6);
            } else if ("com.xiaomi.xmsf".contains(a6.f698b) && !a6.b() && a7 != null && a7.a() != null && a7.a().containsKey("ab")) {
                b(xMPushService2, a6);
                b.c("receive abtest message. ack it." + a7.a());
            } else if (a(xMPushService2, str, a6, a7)) {
                if (a7 != null && !TextUtils.isEmpty(a7.a())) {
                    if (z.b(a6)) {
                        a2 = fz.a(xMPushService.getApplicationContext());
                        b2 = a6.b();
                        str2 = z.b(a6);
                        a3 = a7.a();
                        i = 2002;
                        str3 = "try send passThrough message Broadcast";
                    } else {
                        if (z.a(a6)) {
                            a4 = fz.a(xMPushService.getApplicationContext());
                            b3 = a6.b();
                            b4 = z.b(a6);
                            a5 = a7.a();
                            str4 = "try show awake message , but it don't show in foreground";
                        } else if (z.c(a6)) {
                            a4 = fz.a(xMPushService.getApplicationContext());
                            b3 = a6.b();
                            b4 = z.b(a6);
                            a5 = a7.a();
                            str4 = "try show notification message , but it don't show in foreground";
                        } else if (z.d(a6)) {
                            a2 = fz.a(xMPushService.getApplicationContext());
                            b2 = a6.b();
                            str2 = "E100003";
                            a3 = a7.a();
                            i = 6004;
                            str3 = "try send register broadcast";
                        }
                        a4.a(b3, b4, a5, str4);
                    }
                    a2.a(b2, str2, a3, i, str3);
                }
                xMPushService2.sendBroadcast(intent2, w.a(a6.f698b));
            } else {
                fz.a(xMPushService.getApplicationContext()).a(a6.b(), z.b(a6), a7.a(), "passThough message: not permit to send broadcast ");
            }
            if (a6.a() == ik.UnRegistration && !"com.xiaomi.xmsf".equals(xMPushService.getPackageName())) {
                xMPushService.stopSelf();
            }
        } else if (!g.b((Context) xMPushService2, a6.f698b)) {
            if (z.e(a6)) {
                fz.a(xMPushService.getApplicationContext()).b(a6.b(), z.b(a6), a7.a(), "receive a message, but the package is removed.");
            }
            a(xMPushService2, a6);
        } else {
            b.a("receive a mipush message, we can see the app, but we can't see the receiver.");
            if (z.e(a6)) {
                fz.a(xMPushService.getApplicationContext()).b(a6.b(), z.b(a6), a7.a(), "receive a mipush message, we can see the app, but we can't see the receiver.");
            }
        }
    }

    private static void a(XMPushService xMPushService, byte[] bArr, long j) {
        jg a2 = a(bArr);
        if (a2 != null) {
            if (TextUtils.isEmpty(a2.f698b)) {
                b.a("receive a mipush message without package name");
                return;
            }
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            Intent a3 = a(bArr, valueOf.longValue());
            String a4 = z.a(a2);
            hv.a(xMPushService, a4, j, true, true, System.currentTimeMillis());
            ix a5 = a2.a();
            if (a5 != null) {
                a5.a("mrt", Long.toString(valueOf.longValue()));
            }
            if (ik.SendMessage == a2.a() && m.a((Context) xMPushService).a(a2.f698b) && !z.a(a2)) {
                String str = "";
                if (a5 != null) {
                    str = a5.a();
                    if (z.e(a2)) {
                        fz.a(xMPushService.getApplicationContext()).a(a2.b(), z.b(a2), str, "Drop a message for unregistered");
                    }
                }
                b.a("Drop a message for unregistered, msgid=" + str);
                a(xMPushService, a2, a2.f698b);
            } else if (ik.SendMessage == a2.a() && m.a((Context) xMPushService).c(a2.f698b) && !z.a(a2)) {
                String str2 = "";
                if (a5 != null) {
                    str2 = a5.a();
                    if (z.e(a2)) {
                        fz.a(xMPushService.getApplicationContext()).a(a2.b(), z.b(a2), str2, "Drop a message for push closed");
                    }
                }
                b.a("Drop a message for push closed, msgid=" + str2);
                a(xMPushService, a2, a2.f698b);
            } else if (ik.SendMessage != a2.a() || TextUtils.equals(xMPushService.getPackageName(), "com.xiaomi.xmsf") || TextUtils.equals(xMPushService.getPackageName(), a2.f698b)) {
                if (!(a5 == null || a5.a() == null)) {
                    b.a(String.format("receive a message, appid=%1$s, msgid= %2$s", new Object[]{a2.a(), a5.a()}));
                }
                if (a5 != null) {
                    Map a6 = a5.a();
                    if (a6 != null && a6.containsKey("hide") && "true".equalsIgnoreCase((String) a6.get("hide"))) {
                        b(xMPushService, a2);
                        return;
                    }
                }
                if (!(a5 == null || a5.a() == null || !a5.a().containsKey("__miid"))) {
                    String str3 = (String) a5.a().get("__miid");
                    String a7 = u.a(xMPushService.getApplicationContext());
                    if (TextUtils.isEmpty(a7) || !TextUtils.equals(str3, a7)) {
                        if (z.e(a2)) {
                            fz.a(xMPushService.getApplicationContext()).a(a2.b(), z.b(a2), a5.a(), "miid already logout or anther already login");
                        }
                        b.a(str3 + " should be login, but got " + a7);
                        a(xMPushService, a2, "miid already logout or anther already login", str3 + " should be login, but got " + a7);
                        return;
                    }
                }
                a(xMPushService, a4, bArr, a3);
            } else {
                b.a("Receive a message with wrong package name, expect " + xMPushService.getPackageName() + ", received " + a2.f698b);
                a(xMPushService, a2, "unmatched_package", "package should be " + xMPushService.getPackageName() + ", but got " + a2.f698b);
                if (a5 != null && z.e(a2)) {
                    fz.a(xMPushService.getApplicationContext()).a(a2.b(), z.b(a2), a5.a(), "Receive a message with wrong package name");
                }
            }
        }
    }

    private static boolean a(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            if (queryBroadcastReceivers == null || queryBroadcastReceivers.isEmpty()) {
                return false;
            }
        } catch (Exception unused) {
        }
        return true;
    }

    private static boolean a(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.mipush.miui.CLICK_MESSAGE");
        intent.setPackage(str);
        Intent intent2 = new Intent("com.xiaomi.mipush.miui.RECEIVE_MESSAGE");
        intent2.setPackage(str);
        PackageManager packageManager = context.getPackageManager();
        try {
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 32);
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 32);
            if (!queryBroadcastReceivers.isEmpty() || !queryIntentServices.isEmpty()) {
                return true;
            }
        } catch (Exception e2) {
            b.a((Throwable) e2);
        }
        return false;
    }

    private static boolean a(jg jgVar) {
        return "com.xiaomi.xmsf".equals(jgVar.f698b) && jgVar.a() != null && jgVar.a().a() != null && jgVar.a().a().containsKey("miui_package_name");
    }

    private static boolean a(XMPushService xMPushService, String str, jg jgVar, ix ixVar) {
        boolean z = true;
        if (ixVar != null && ixVar.a() != null && ixVar.a().containsKey("__check_alive") && ixVar.a().containsKey("__awake")) {
            jj jjVar = new jj();
            jjVar.b(jgVar.a());
            jjVar.d(str);
            jjVar.c(iu.AwakeSystemApp.f570a);
            jjVar.a(ixVar.a());
            jjVar.f710a = new HashMap();
            boolean a2 = g.a(xMPushService.getApplicationContext(), str);
            jjVar.f710a.put("app_running", Boolean.toString(a2));
            if (!a2) {
                boolean parseBoolean = Boolean.parseBoolean((String) ixVar.a().get("__awake"));
                jjVar.f710a.put("awaked", Boolean.toString(parseBoolean));
                if (!parseBoolean) {
                    z = false;
                }
            }
            try {
                w.a(xMPushService, w.a(jgVar.b(), jgVar.a(), jjVar, ik.Notification));
            } catch (hb e2) {
                b.a((Throwable) e2);
            }
        }
        return z;
    }

    private static void b(XMPushService xMPushService, jg jgVar) {
        xMPushService.a((XMPushService.i) new r(4, xMPushService, jgVar));
    }

    private static boolean b(jg jgVar) {
        Map a2 = jgVar.a().a();
        return a2 != null && a2.containsKey("notify_effect");
    }

    private static void c(XMPushService xMPushService, jg jgVar) {
        xMPushService.a((XMPushService.i) new s(4, xMPushService, jgVar));
    }

    private static boolean c(jg jgVar) {
        if (jgVar.a() == null || jgVar.a().a() == null) {
            return false;
        }
        return PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(jgVar.a().a().get("obslete_ads_message"));
    }

    private static void d(XMPushService xMPushService, jg jgVar) {
        xMPushService.a((XMPushService.i) new t(4, xMPushService, jgVar));
    }

    public void a(Context context, al.b bVar, boolean z, int i, String str) {
        if (!z) {
            k a2 = l.a(context);
            if (a2 != null && "token-expired".equals(str)) {
                try {
                    l.a(context, a2.f82582f, a2.f82580d, a2.f82581e);
                } catch (IOException e2) {
                    b.a((Throwable) e2);
                } catch (JSONException e3) {
                    b.a((Throwable) e3);
                }
            }
        }
    }

    public void a(XMPushService xMPushService, gj gjVar, al.b bVar) {
        try {
            a(xMPushService, gjVar.a(bVar.h), (long) gjVar.c());
        } catch (IllegalArgumentException e2) {
            b.a((Throwable) e2);
        }
    }

    public void a(XMPushService xMPushService, hh hhVar, al.b bVar) {
        if (hhVar instanceof hg) {
            hg hgVar = (hg) hhVar;
            he a2 = hgVar.a(NotifyType.SOUND);
            if (a2 != null) {
                try {
                    a(xMPushService, au.a(au.a(bVar.h, hgVar.j()), a2.c()), (long) hv.a(hhVar.a()));
                } catch (IllegalArgumentException e2) {
                    b.a((Throwable) e2);
                }
            }
            return;
        }
        b.a("not a mipush message");
    }
}
