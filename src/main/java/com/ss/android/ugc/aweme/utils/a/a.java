package com.ss.android.ugc.aweme.utils.a;

import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.bytedance.common.utility.reflect.Reflect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Field;

public final class a implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75471a;

    /* renamed from: b  reason: collision with root package name */
    private Reflect f75472b;

    /* renamed from: c  reason: collision with root package name */
    private Field f75473c;

    private IBinder a(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f75471a, false, 88726, new Class[]{Message.class}, IBinder.class)) {
            return (IBinder) PatchProxy.accessDispatch(new Object[]{message}, this, f75471a, false, 88726, new Class[]{Message.class}, IBinder.class);
        }
        IBinder iBinder = null;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                if (this.f75473c == null) {
                    this.f75473c = Class.forName("com.android.internal.os.SomeArgs").getDeclaredField("arg1");
                }
                iBinder = (IBinder) this.f75473c.get(message.obj);
            } catch (Exception unused) {
            }
        } else if (message.obj instanceof IBinder) {
            iBinder = (IBinder) message.obj;
        }
        return iBinder;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f75471a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.os.Message> r3 = android.os.Message.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 88724(0x15a94, float:1.24329E-40)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003d
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f75471a
            r13 = 0
            r14 = 88724(0x15a94, float:1.24329E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.os.Message> r0 = android.os.Message.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003d:
            int r2 = r0.what
            switch(r2) {
                case 103: goto L_0x0045;
                case 104: goto L_0x0045;
                default: goto L_0x0042;
            }
        L_0x0042:
            r2 = r17
            goto L_0x0052
        L_0x0045:
            android.os.IBinder r0 = r17.a((android.os.Message) r18)     // Catch:{ Throwable -> 0x0042 }
            r2 = r17
            boolean r0 = r2.a((android.os.IBinder) r0)     // Catch:{ Throwable -> 0x0052 }
            if (r0 == 0) goto L_0x0052
            return r1
        L_0x0052:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.a.a.handleMessage(android.os.Message):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(android.os.IBinder r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f75471a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.os.IBinder> r1 = android.os.IBinder.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 88725(0x15a95, float:1.2433E-40)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0039
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f75471a
            r3 = 0
            r4 = 88725(0x15a95, float:1.2433E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.os.IBinder> r1 = android.os.IBinder.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0039:
            com.bytedance.common.utility.reflect.Reflect r0 = r9.f75472b     // Catch:{ Throwable -> 0x0087 }
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Throwable -> 0x0087 }
            com.bytedance.common.utility.reflect.Reflect r0 = com.bytedance.common.utility.reflect.Reflect.on((java.lang.Class<?>) r0)     // Catch:{ Throwable -> 0x0087 }
            java.lang.String r1 = "currentActivityThread"
            com.bytedance.common.utility.reflect.Reflect r0 = r0.call(r1)     // Catch:{ Throwable -> 0x0087 }
            r9.f75472b = r0     // Catch:{ Throwable -> 0x0087 }
        L_0x004f:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0087 }
            r1 = 18
            if (r0 > r1) goto L_0x006e
            com.bytedance.common.utility.reflect.Reflect r0 = r9.f75472b     // Catch:{ Throwable -> 0x0087 }
            java.lang.String r1 = "mActivities"
            java.lang.Class[] r2 = new java.lang.Class[r8]     // Catch:{ Throwable -> 0x0087 }
            com.bytedance.common.utility.reflect.Reflect r0 = r0.field(r1, r2)     // Catch:{ Throwable -> 0x0087 }
            java.lang.Object r0 = r0.get()     // Catch:{ Throwable -> 0x0087 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Throwable -> 0x0087 }
            if (r0 == 0) goto L_0x0087
            boolean r0 = r0.containsKey(r10)     // Catch:{ Throwable -> 0x0087 }
            if (r0 != 0) goto L_0x0087
            return r7
        L_0x006e:
            com.bytedance.common.utility.reflect.Reflect r0 = r9.f75472b     // Catch:{ Throwable -> 0x0087 }
            java.lang.String r1 = "mActivities"
            java.lang.Class[] r2 = new java.lang.Class[r8]     // Catch:{ Throwable -> 0x0087 }
            com.bytedance.common.utility.reflect.Reflect r0 = r0.field(r1, r2)     // Catch:{ Throwable -> 0x0087 }
            java.lang.Object r0 = r0.get()     // Catch:{ Throwable -> 0x0087 }
            android.util.ArrayMap r0 = (android.util.ArrayMap) r0     // Catch:{ Throwable -> 0x0087 }
            if (r0 == 0) goto L_0x0087
            boolean r0 = r0.containsKey(r10)     // Catch:{ Throwable -> 0x0087 }
            if (r0 != 0) goto L_0x0087
            return r7
        L_0x0087:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.a.a.a(android.os.IBinder):boolean");
    }
}
