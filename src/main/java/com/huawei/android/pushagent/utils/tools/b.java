package com.huawei.android.pushagent.utils.tools;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import com.huawei.android.microkernel.MKService;
import com.huawei.android.pushagent.PushService;
import com.huawei.android.pushagent.permission.PermissionsMgrActivity;
import com.huawei.android.pushagent.utils.a;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushagent.utils.a.h;
import com.huawei.android.pushagent.utils.f;

public class b extends Thread {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static b f25186a;

    /* renamed from: b  reason: collision with root package name */
    private static long f25187b;

    /* renamed from: c  reason: collision with root package name */
    private static Handler f25188c;

    /* renamed from: d  reason: collision with root package name */
    private static PowerManager.WakeLock f25189d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f25190e;

    /* renamed from: f  reason: collision with root package name */
    private static long f25191f;

    static {
        b bVar = new b();
        f25186a = bVar;
        bVar.start();
    }

    public static void a() {
        f25187b = System.currentTimeMillis();
    }

    private static void a(Context context) {
        f25189d = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "pushagentPoxy");
    }

    public static void a(Context context, Intent intent) {
        String str;
        StringBuilder sb;
        String str2;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (f25189d == null) {
                a(context);
            }
            int i = 0;
            while (f25188c == null && i <= 60) {
                if (i % 20 == 0) {
                    e.a("PushLogAC2815", "when send msg handler is null, waitTimes:" + i);
                }
                i++;
                sleep(10);
            }
            if (f25189d != null) {
                f25189d.acquire(500);
            }
            if (f25188c != null) {
                f25188c.postDelayed(new c(context, intent), 1);
            }
        } catch (InterruptedException e2) {
            str2 = "PushLogAC2815";
            sb = new StringBuilder("call handleEvent cause InterruptedException:");
            str = e2.toString();
            sb.append(str);
            e.d(str2, sb.toString());
            e.a("PushLogAC2815", "PushProxy cost " + (System.currentTimeMillis() - currentTimeMillis) + "ms dealwith " + intent);
        } catch (Exception e3) {
            str2 = "PushLogAC2815";
            sb = new StringBuilder("call handleEvent cause Exception:");
            str = e3.toString();
            sb.append(str);
            e.d(str2, sb.toString());
            e.a("PushLogAC2815", "PushProxy cost " + (System.currentTimeMillis() - currentTimeMillis) + "ms dealwith " + intent);
        }
        e.a("PushLogAC2815", "PushProxy cost " + (System.currentTimeMillis() - currentTimeMillis) + "ms dealwith " + intent);
    }

    private boolean a(Context context, String str) {
        int q = a.q(context);
        String r = a.r(context);
        if ("android.intent.action.PACKAGE_ADDED".equals(str) || "android.intent.action.PACKAGE_REMOVED".equals(str) || q == 0 || TextUtils.isEmpty(r)) {
            if (PushServiceTools.isVotedSelf(context)) {
                a.a(context, true);
                q = 1;
            } else {
                a.a(context, false);
                q = 2;
            }
            e.a("PushLogAC2815", "After voting, My service Stats = " + q);
            new h(context, "pushConfig").a("NeedMyServiceRun", Integer.valueOf(q));
        }
        return 1 == q;
    }

    /* access modifiers changed from: private */
    public void b(Context context, Intent intent) {
        if (intent != null) {
            if ("android.intent.action.PACKAGE_REMOVED".equals(intent.getAction())) {
                c(context, intent);
            }
            f.a(context);
            boolean a2 = a(context, intent.getAction());
            if (a.o(context)) {
                e.a("PushLogAC2815", "need not current " + context.getPackageName() + " to depose, so exit receiver");
                a.a(context, 3);
                PushService.b();
                return;
            }
            if (a2) {
                e.a("PushLogAC2815", "my pkg " + context.getPackageName() + " need deal with:" + intent);
            } else if (a.s(context)) {
                a.a(context, false);
                e.a("PushLogAC2815", "need not current " + context.getPackageName() + " to depose, so exit receiver");
                a.a(context, 3);
                PushService.b();
                return;
            } else {
                a.a(context, true);
                if (("com.huawei.android.push.intent.REGISTER".equals(intent.getAction()) || "com.huawei.android.push.intent.GET_PUSH_STATE".equals(intent.getAction()) || "com.huawei.android.push.intent.DEREGISTER".equals(intent.getAction())) && !intent.getStringExtra("pkg_name").equals(context.getPackageName())) {
                    e.a("PushLogAC2815", "my pkg " + context.getPackageName() + " need not deal with:" + intent);
                    return;
                }
            }
            d(context, intent);
        }
    }

    private boolean b(Context context) {
        return System.currentTimeMillis() < f25187b || (com.huawei.android.pushagent.b.b.a.a(context).N() * 1000) + f25187b < System.currentTimeMillis();
    }

    private boolean b(Context context, String str) {
        if ("com.huawei.android.push.intent.REGISTER".equals(str)) {
            return true;
        }
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(str)) {
            return (com.huawei.android.pushagent.b.e.b.b(context).size() == 0 && com.huawei.android.pushagent.b.e.b.a(context).f25095a.size() == 0) ? false : true;
        }
        return false;
    }

    private static void c(Context context, Intent intent) {
        String str = "";
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        }
        String packageName = context.getPackageName();
        e.a("PushLogAC2815", "the Reinstall pkgName:" + str + ", current PkgName:" + packageName);
        if (!TextUtils.isEmpty(str) && str.equals(packageName)) {
            a.a(context, 1);
            boolean stopService = context.stopService(new Intent(context, PushService.class));
            e.a("PushLogAC2815", "after apk reinstalled , stop pushservice:" + String.valueOf(stopService));
        }
    }

    private void d(Context context, Intent intent) {
        Intent intent2;
        if (!(context == null || intent == null)) {
            e.a("PushLogAC2815", "my pkg " + context.getPackageName() + " need deal with:" + intent);
            if (PermissionsMgrActivity.a(context)) {
                e.b("PushLogAC2815", "needStartPermissionActivity");
                if (!b(context, intent.getAction())) {
                    e.b("PushLogAC2815", "need not requestPermission");
                } else {
                    PermissionsMgrActivity.a(context, intent);
                }
            } else if (!e(context, intent)) {
                if (b(context)) {
                    e.a("PushLogAC2815", "enter checkBackUp()");
                    a();
                    a.f(context);
                    a.p(context);
                }
                if (MKService.getAppContext() == null) {
                    intent2 = new Intent(context, PushService.class);
                } else {
                    intent2 = new Intent();
                    e.a("PushLogAC2815", "MKService.getAppContext() is" + MKService.getAppContext());
                    intent2.setComponent(new ComponentName(context, "com.huawei.deviceCloud.microKernel.push.PushMKService"));
                }
                intent2.fillIn(intent, 7);
                intent2.setPackage(context.getPackageName());
                e.a("PushLogAC2815", "serviceIntent is" + intent2.toURI());
                context.startService(intent2);
            }
        }
    }

    private boolean e(Context context, Intent intent) {
        String str;
        String str2;
        e.a("PushLogAC2815", "enter needDelayIntent");
        if (!TextUtils.isEmpty(com.huawei.android.pushagent.utils.a.f.a(context, "device_info", "deviceId"))) {
            str = "PushLogAC2815";
            str2 = "local deviceId is not empty";
        } else {
            if (!f25190e) {
                f25190e = true;
                if (TextUtils.isEmpty(a.c(context))) {
                    e.a("PushLogAC2815", "first enter, imei is empty, begin to wait 1 minute");
                    f25191f = System.currentTimeMillis();
                } else {
                    str = "PushLogAC2815";
                    str2 = "first enter, imei is not empty, no deed to wait";
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis() - f25191f;
                if (0 >= currentTimeMillis || currentTimeMillis > 60000) {
                    str = "PushLogAC2815";
                    str2 = "second enter, no deed to wait";
                } else {
                    e.a("PushLogAC2815", "second enter, waitting 1 minute");
                }
            }
            intent.setPackage(context.getPackageName());
            com.huawei.android.pushagent.utils.a.a.b(context, intent, 60000);
            return true;
        }
        e.a(str, str2);
        return false;
    }

    public void run() {
        Looper.prepare();
        if (f25188c == null) {
            f25188c = new Handler();
        }
        Looper.loop();
    }
}
