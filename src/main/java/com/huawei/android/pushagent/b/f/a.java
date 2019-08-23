package com.huawei.android.pushagent.b.f;

import android.content.Context;
import android.content.Intent;
import com.huawei.android.pushagent.utils.a.e;

public class a extends com.huawei.android.pushagent.b.a {

    /* renamed from: a  reason: collision with root package name */
    private static String f25105a = "PushLogAC2815";

    /* renamed from: b  reason: collision with root package name */
    private static boolean f25106b;

    public a(Context context) {
    }

    public static void a(Context context, boolean z, String str) {
        Intent intent = new Intent();
        String str2 = f25105a;
        e.a(str2, "sendStateBroadcast the current push state is: " + z);
        intent.setAction("com.huawei.intent.action.PUSH_STATE").putExtra("push_state", z).setFlags(32).setPackage(str);
        context.sendBroadcast(intent);
    }

    private static synchronized void a(boolean z) {
        synchronized (a.class) {
            f25106b = z;
        }
    }

    public void a(Context context, Intent intent) {
        String str = f25105a;
        e.a(str, "enter ChannelRecorder:onReceive(intent:" + intent + " context:" + context);
        String action = intent.getAction();
        boolean a2 = com.huawei.android.pushagent.b.a.a.e().a();
        String str2 = f25105a;
        e.a(str2, "PushState get action :" + action);
        if ("com.huawei.android.push.intent.GET_PUSH_STATE".equals(action)) {
            String stringExtra = intent.getStringExtra("pkg_name");
            String str3 = f25105a;
            e.a(str3, "responseClinetGetPushState: get the client packageName: " + stringExtra);
            try {
                String str4 = f25105a;
                e.a(str4, "current program pkgName" + context.getPackageName());
                String str5 = f25105a;
                e.a(str5, "the current push curIsConnect:" + a2);
                a(context, a2, stringExtra);
            } catch (Exception e2) {
                String str6 = f25105a;
                e.a(str6, "e:" + e2.toString());
            }
        }
        if (f25106b != a2) {
            a(a2);
        }
    }
}
