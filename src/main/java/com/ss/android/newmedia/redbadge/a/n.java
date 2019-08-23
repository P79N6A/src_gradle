package com.ss.android.newmedia.redbadge.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.redbadge.a;
import java.util.Arrays;
import java.util.List;

public class n implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30301a;

    public final List<String> a() {
        if (PatchProxy.isSupport(new Object[0], this, f30301a, false, 18825, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f30301a, false, 18825, new Class[0], List.class);
        }
        return Arrays.asList(new String[]{"com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2", "com.i.miui.launcher"});
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3.set(r0, java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0093, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x008c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r21, android.content.ComponentName r22, int r23) throws com.ss.android.newmedia.redbadge.e {
        /*
            r20 = this;
            r1 = r21
            r0 = 3
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r10 = 0
            r3[r10] = r1
            r11 = 1
            r3[r11] = r22
            java.lang.Integer r4 = java.lang.Integer.valueOf(r23)
            r12 = 2
            r3[r12] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = f30301a
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<android.content.ComponentName> r4 = android.content.ComponentName.class
            r8[r11] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r12] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 18824(0x4988, float:2.6378E-41)
            r4 = r20
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0059
            java.lang.Object[] r13 = new java.lang.Object[r0]
            r13[r10] = r1
            r13[r11] = r22
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r13[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r15 = f30301a
            r16 = 0
            r17 = 18824(0x4988, float:2.6378E-41)
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<android.content.ComponentName> r1 = android.content.ComponentName.class
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r12] = r1
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r20
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x0059:
            if (r1 == 0) goto L_0x00fb
            if (r22 != 0) goto L_0x005f
            goto L_0x00fb
        L_0x005f:
            if (r23 >= 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            r10 = r23
        L_0x0064:
            java.lang.String r0 = "android.app.MiuiNotification"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Throwable -> 0x0094 }
            java.lang.Object r0 = r0.newInstance()     // Catch:{ Throwable -> 0x0094 }
            java.lang.Class r3 = r0.getClass()     // Catch:{ Throwable -> 0x0094 }
            java.lang.String r4 = "messageCount"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ Throwable -> 0x0094 }
            r3.setAccessible(r11)     // Catch:{ Throwable -> 0x0094 }
            if (r10 != 0) goto L_0x0080
            java.lang.String r4 = ""
            goto L_0x0084
        L_0x0080:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x008c }
        L_0x0084:
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x008c }
            r3.set(r0, r4)     // Catch:{ Throwable -> 0x008c }
            return
        L_0x008c:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x0094 }
            r3.set(r0, r4)     // Catch:{ Throwable -> 0x0094 }
            return
        L_0x0094:
            r0 = move-exception
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "android.intent.action.APPLICATION_MESSAGE_UPDATE"
            r3.<init>(r4)
            java.lang.String r4 = "android.intent.extra.update_application_component_name"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r22.getPackageName()
            r5.append(r6)
            java.lang.String r6 = "/"
            r5.append(r6)
            java.lang.String r2 = r22.getClassName()
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r3.putExtra(r4, r2)
            java.lang.String r2 = "android.intent.extra.update_application_message_text"
            if (r10 != 0) goto L_0x00c4
            java.lang.String r4 = ""
            goto L_0x00c8
        L_0x00c4:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
        L_0x00c8:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.putExtra(r2, r4)
            boolean r2 = com.ss.android.newmedia.redbadge.c.a.a(r1, r3)
            if (r2 == 0) goto L_0x00e3
            r1.sendBroadcast(r3)     // Catch:{ Throwable -> 0x00d9 }
            return
        L_0x00d9:
            com.ss.android.newmedia.redbadge.e r1 = new com.ss.android.newmedia.redbadge.e
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
        L_0x00e3:
            com.ss.android.newmedia.redbadge.e r0 = new com.ss.android.newmedia.redbadge.e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "unable to resolve intent: "
            r1.<init>(r2)
            java.lang.String r2 = r3.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.redbadge.a.n.a(android.content.Context, android.content.ComponentName, int):void");
    }
}
