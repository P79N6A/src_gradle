package com.huawei.android.pushagent;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushagent.utils.a.h;
import com.huawei.android.pushagent.utils.tools.b;
import java.lang.reflect.InvocationTargetException;

public class PushEventReceiver extends BroadcastReceiver {
    private static void a(Context context, Intent intent) {
        try {
            if (!"com.huawei.android.pushagent".equals(context.getPackageName())) {
                e.a("PushLogAC2815", "run invokePluginReport");
                Class<?> cls = Class.forName("com.huawei.android.pushagent.plugin.PushPluginsBroadcastMgr");
                cls.getMethod("handleEvent", new Class[]{Context.class, Intent.class}).invoke(cls, new Object[]{context, intent});
            }
        } catch (ClassNotFoundException e2) {
            e.a("PushLogAC2815", "ClassNotFoundException:" + e2.toString());
        } catch (NoSuchMethodException e3) {
            e.c("PushLogAC2815", e3.toString(), e3);
        } catch (IllegalAccessException e4) {
            e.c("PushLogAC2815", e4.toString(), e4);
        } catch (IllegalArgumentException e5) {
            e.c("PushLogAC2815", e5.toString(), e5);
        } catch (InvocationTargetException e6) {
            e.c("PushLogAC2815", e6.toString(), e6);
        }
    }

    private static void b(Context context, Intent intent) {
        boolean a2 = new h(context, "push_switch").a("notify_msg_enable");
        e.a("PushLogAC2815", "closePush_Notify:" + a2);
        if (!a2) {
            try {
                e.b("PushLogAC2815", "run push selfshow");
                Class<?> cls = Class.forName("com.huawei.android.pushselfshow.SelfShowReceiver");
                Object newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                cls.getDeclaredMethod("onReceive", new Class[]{Context.class, Intent.class}).invoke(newInstance, new Object[]{context, intent});
            } catch (ClassNotFoundException e2) {
                e.b("PushLogAC2815", "ClassNotFoundException:" + e2.toString());
            } catch (NoSuchMethodException e3) {
                e.c("PushLogAC2815", e3.toString(), e3);
            } catch (IllegalAccessException e4) {
                e.c("PushLogAC2815", e4.toString(), e4);
            } catch (IllegalArgumentException e5) {
                e.c("PushLogAC2815", e5.toString(), e5);
            } catch (InvocationTargetException e6) {
                e.c("PushLogAC2815", e6.toString(), e6);
            } catch (InstantiationException e7) {
                e.c("PushLogAC2815", e7.toString(), e7);
            }
        }
    }

    private static void c(Context context, Intent intent) {
        try {
            e.a("PushLogAC2815", "run PushProxy.handleEvent ");
            b.a(context, intent);
        } catch (Exception e2) {
            e.c("PushLogAC2815", e2.toString(), e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        if ("android.intent.action.PACKAGE_ADDED".equals(r0) != false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0053
            if (r6 != 0) goto L_0x0005
            goto L_0x0053
        L_0x0005:
            com.huawei.android.pushagent.utils.a.e.a((android.content.Context) r5)
            java.lang.String r0 = r6.getAction()
            java.lang.String r1 = "PushLogAC2815"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "action is "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.huawei.android.pushagent.utils.a.e.b(r1, r2)
            java.lang.String r1 = "com.huawei.intent.action.PUSH"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = "selfshow_info"
            boolean r1 = r6.hasExtra(r1)
            if (r1 != 0) goto L_0x0037
        L_0x002f:
            java.lang.String r1 = "android.intent.action.PACKAGE_ADDED"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0043
        L_0x0037:
            b(r5, r6)
            java.lang.String r1 = "android.intent.action.PACKAGE_ADDED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            goto L_0x004f
        L_0x0043:
            java.lang.String r1 = "com.huawei.android.push.PLUGIN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            a(r5, r6)
            return
        L_0x004f:
            c(r5, r6)
        L_0x0052:
            return
        L_0x0053:
            java.lang.String r5 = "PushLogAC2815"
            java.lang.String r6 = "context== null or intent == null"
            com.huawei.android.pushagent.utils.a.e.a(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.PushEventReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
