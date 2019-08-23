package com.ss.android.ugc.aweme.miniapp.b.a;

import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tt.miniapphost.process.annotation.AnyProcess;
import java.lang.reflect.Method;

@AnyProcess
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55492a;

    private static String a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], null, f55492a, true, 59266, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f55492a, true, 59266, new Class[0], String.class);
        }
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class});
                declaredMethod.setAccessible(true);
                str = (String) declaredMethod.invoke(null, new Object[]{"qemu.hw.mainkeys"});
            } catch (Throwable unused) {
            }
            return str;
        }
        str = null;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009d, code lost:
        if (android.view.ViewConfiguration.get(r17).hasPermanentMenuKey() == false) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.app.Activity r17) {
        /*
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r17
            com.meituan.robust.ChangeQuickRedirect r4 = f55492a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.app.Activity> r3 = android.app.Activity.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 59267(0xe783, float:8.3051E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0032
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f55492a
            r13 = 1
            r14 = 59267(0xe783, float:8.3051E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0032:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r9] = r17
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f55492a
            r5 = 1
            r6 = 59265(0xe781, float:8.3048E-41)
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            r7[r9] = r8
            java.lang.Class r8 = java.lang.Boolean.TYPE
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0069
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f55492a
            r13 = 1
            r14 = 59265(0xe781, float:8.3048E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r15[r9] = r1
            java.lang.Class r16 = java.lang.Boolean.TYPE
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x00a1
        L_0x0069:
            android.content.res.Resources r2 = r17.getResources()
            java.lang.String r3 = "config_showNavigationBar"
            java.lang.String r4 = "bool"
            java.lang.String r5 = "android"
            int r3 = r2.getIdentifier(r3, r4, r5)
            if (r3 == 0) goto L_0x0095
            boolean r2 = r2.getBoolean(r3)
            java.lang.String r3 = a()
            java.lang.String r4 = "1"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x008a
            goto L_0x00a0
        L_0x008a:
            java.lang.String r4 = "0"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0093
            goto L_0x00a1
        L_0x0093:
            r1 = r2
            goto L_0x00a1
        L_0x0095:
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r17)
            boolean r2 = r2.hasPermanentMenuKey()
            if (r2 != 0) goto L_0x00a0
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            if (r1 != 0) goto L_0x00a4
            return
        L_0x00a4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 11
            r3 = 19
            if (r1 <= r2) goto L_0x00be
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 >= r3) goto L_0x00be
            android.view.Window r0 = r17.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 8
            r0.setSystemUiVisibility(r1)
            return
        L_0x00be:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r3) goto L_0x00d8
            android.view.Window r1 = r17.getWindow()
            android.view.View r1 = r1.getDecorView()
            r2 = 7942(0x1f06, float:1.1129E-41)
            r1.setSystemUiVisibility(r2)
            android.view.Window r0 = r17.getWindow()
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0.addFlags(r1)
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.miniapp.b.a.b.a(android.app.Activity):void");
    }
}
