package com.ss.android.ugc.awemepushlib.os.receiver;

import a.g;
import a.i;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.i18n.c;
import com.ss.android.ugc.awemepushlib.a.b;
import com.ss.android.ugc.awemepushlib.interaction.a;
import com.ss.android.ugc.awemepushlib.interaction.j;
import com.ss.android.ugc.awemepushlib.manager.MessageShowHandler;
import com.ss.android.ugc.awemepushlib.manager.f;

public class ScreenOnPushActionReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect changeQuickRedirect;

    private synchronized void sendNotificationWhenScreenOn(Context context) {
        long j;
        final String str;
        int i;
        final Context context2 = context;
        synchronized (this) {
            if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 90376, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 90376, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            if (c.a()) {
                int b2 = f.a().b(context2);
                if (b2 == 2 || b2 == 4) {
                    j = 5000;
                } else {
                    j = 10000;
                }
            } else {
                f a2 = f.a();
                if (PatchProxy.isSupport(new Object[0], a2, f.f77088a, false, 90343, new Class[0], Integer.TYPE)) {
                    i = ((Integer) PatchProxy.accessDispatch(new Object[0], a2, f.f77088a, false, 90343, new Class[0], Integer.TYPE)).intValue();
                } else {
                    if (PatchProxy.isSupport(new Object[0], null, a.f77007a, true, 90196, new Class[0], Integer.TYPE)) {
                        i = ((Integer) PatchProxy.accessDispatch(new Object[0], null, a.f77007a, true, 90196, new Class[0], Integer.TYPE)).intValue();
                    } else {
                        i = j.a().getScreenOnPushWaitTime();
                    }
                }
                j = (long) (i * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
            }
            int d2 = f.a().d(context2);
            f a3 = f.a();
            if (PatchProxy.isSupport(new Object[]{context2, 0}, a3, f.f77088a, false, 90351, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
                f fVar = a3;
                PatchProxy.accessDispatch(new Object[]{context2, 0}, fVar, f.f77088a, false, 90351, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
            } else {
                a3.a(context2).edit().putInt("push_have_stored", 0).commit();
            }
            for (int i2 = 0; i2 < d2; i2++) {
                f a4 = f.a();
                if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i2)}, a4, f.f77088a, false, 90353, new Class[]{Context.class, Integer.TYPE}, String.class)) {
                    f fVar2 = a4;
                    str = (String) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i2)}, fVar2, f.f77088a, false, 90353, new Class[]{Context.class, Integer.TYPE}, String.class);
                } else {
                    SharedPreferences a5 = a4.a(context2);
                    String string = a5.getString("screen_push_key_" + i2, "");
                    SharedPreferences.Editor edit = a4.a(context2).edit();
                    edit.putString("screen_push_key_" + i2, "").apply();
                    str = string;
                }
                i.a((((long) i2) * 500) + j).a((g<TResult, TContinuationResult>) new g<Void, Void>() {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    public Void then(i<Void> iVar) throws Exception {
                        if (PatchProxy.isSupport(new Object[]{iVar}, this, changeQuickRedirect, false, 90377, new Class[]{i.class}, Void.class)) {
                            return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, changeQuickRedirect, false, 90377, new Class[]{i.class}, Void.class);
                        }
                        b bVar = (b) new Gson().fromJson(str, b.class);
                        MessageShowHandler.processMessage(context2, bVar.f76961b, com.ss.android.ugc.awemepushlib.a.c.from(bVar.f76960a));
                        return null;
                    }
                });
            }
            f a6 = f.a();
            if (PatchProxy.isSupport(new Object[]{context2}, a6, f.f77088a, false, 90355, new Class[]{Context.class}, Void.TYPE)) {
                f fVar3 = a6;
                PatchProxy.accessDispatch(new Object[]{context2}, fVar3, f.f77088a, false, 90355, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            ((AlarmManager) context2.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(context2, 0, new Intent("ALARM_ACTION"), 0));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        if (r1.equals("android.intent.action.USER_PRESENT") == false) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r20, android.content.Intent r21) {
        /*
            r19 = this;
            r0 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r21
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<android.content.Intent> r4 = android.content.Intent.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 90375(0x16107, float:1.26642E-40)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0045
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r21
            com.meituan.robust.ChangeQuickRedirect r14 = changeQuickRedirect
            r15 = 0
            r16 = 90375(0x16107, float:1.26642E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0045:
            java.lang.String r1 = r21.getAction()
            if (r1 != 0) goto L_0x004c
            return
        L_0x004c:
            r3 = -1
            int r4 = r1.hashCode()
            r5 = -2128145023(0xffffffff81271581, float:-3.0688484E-38)
            if (r4 == r5) goto L_0x0083
            r5 = -1454123155(0xffffffffa953d76d, float:-4.7038264E-14)
            if (r4 == r5) goto L_0x0079
            r5 = -8502268(0xffffffffff7e4404, float:-3.3797707E38)
            if (r4 == r5) goto L_0x006f
            r5 = 823795052(0x311a1d6c, float:2.2426674E-9)
            if (r4 == r5) goto L_0x0066
            goto L_0x008d
        L_0x0066:
            java.lang.String r4 = "android.intent.action.USER_PRESENT"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x008d
            goto L_0x008e
        L_0x006f:
            java.lang.String r2 = "ALARM_ACTION"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x008d
            r2 = 3
            goto L_0x008e
        L_0x0079:
            java.lang.String r2 = "android.intent.action.SCREEN_ON"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x008d
            r2 = 0
            goto L_0x008e
        L_0x0083:
            java.lang.String r2 = "android.intent.action.SCREEN_OFF"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x008d
            r2 = 1
            goto L_0x008e
        L_0x008d:
            r2 = -1
        L_0x008e:
            switch(r2) {
                case 0: goto L_0x00a5;
                case 1: goto L_0x00a4;
                case 2: goto L_0x00a0;
                case 3: goto L_0x0092;
                default: goto L_0x0091;
            }
        L_0x0091:
            goto L_0x00a6
        L_0x0092:
            com.ss.android.ugc.awemepushlib.manager.f r1 = com.ss.android.ugc.awemepushlib.manager.f.a()
            boolean r1 = r1.c(r0)
            if (r1 == 0) goto L_0x00a6
            r19.sendNotificationWhenScreenOn(r20)
            goto L_0x00a6
        L_0x00a0:
            r19.sendNotificationWhenScreenOn(r20)
            return
        L_0x00a4:
            return
        L_0x00a5:
            return
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.os.receiver.ScreenOnPushActionReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
