package com.ss.android.ugc.aweme.utils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.d;

public final class eb {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75807a;

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public static int b() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], null, f75807a, true, 88578, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f75807a, true, 88578, new Class[0], Integer.TYPE)).intValue();
        }
        int identifier = d.a().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = d.a().getResources().getDimensionPixelSize(identifier);
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.app.Activity r17) {
        /*
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r17
            com.meituan.robust.ChangeQuickRedirect r4 = f75807a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.app.Activity> r3 = android.app.Activity.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 88564(0x159f4, float:1.24105E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0032
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f75807a
            r13 = 1
            r14 = 88564(0x159f4, float:1.24105E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0032:
            android.view.Window r2 = r17.getWindow()
            r3 = 1024(0x400, float:1.435E-42)
            r2.setFlags(r3, r3)
            android.content.Context r2 = r17.getApplicationContext()     // Catch:{ Exception -> 0x007a }
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ Exception -> 0x007a }
            java.lang.String r3 = "android.os.SystemProperties"
            java.lang.Class r2 = r2.loadClass(r3)     // Catch:{ Exception -> 0x007a }
            java.lang.String r3 = "getInt"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x007a }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r9] = r6     // Catch:{ Exception -> 0x007a }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x007a }
            r5[r1] = r6     // Catch:{ Exception -> 0x007a }
            java.lang.reflect.Method r3 = r2.getMethod(r3, r5)     // Catch:{ Exception -> 0x007a }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x007a }
            java.lang.String r5 = "ro.miui.notch"
            r4[r9] = r5     // Catch:{ Exception -> 0x007a }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x007a }
            r4[r1] = r5     // Catch:{ Exception -> 0x007a }
            java.lang.Object r2 = r3.invoke(r2, r4)     // Catch:{ Exception -> 0x007a }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x007a }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x007a }
            if (r2 != r1) goto L_0x007a
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x007a }
            r3 = 28
            if (r2 >= r3) goto L_0x007a
            r2 = 1
            goto L_0x007b
        L_0x007a:
            r2 = 0
        L_0x007b:
            if (r2 == 0) goto L_0x009d
            java.lang.Class<android.view.Window> r2 = android.view.Window.class
            java.lang.String r3 = "addExtraFlags"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x009d }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x009d }
            r4[r9] = r5     // Catch:{ Exception -> 0x009d }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch:{ Exception -> 0x009d }
            android.view.Window r0 = r17.getWindow()     // Catch:{ Exception -> 0x009d }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x009d }
            r3 = 768(0x300, float:1.076E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x009d }
            r1[r9] = r3     // Catch:{ Exception -> 0x009d }
            r2.invoke(r0, r1)     // Catch:{ Exception -> 0x009d }
            return
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.eb.a(android.app.Activity):void");
    }

    @TargetApi(28)
    public static void a(Window window) {
        Window window2 = window;
        if (PatchProxy.isSupport(new Object[]{window2}, null, f75807a, true, 88577, new Class[]{Window.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{window2}, null, f75807a, true, 88577, new Class[]{Window.class}, Void.TYPE);
        } else if (window2 != null && Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window2.setAttributes(attributes);
        }
    }

    public static void a(Activity activity, int i) {
        if (PatchProxy.isSupport(new Object[]{activity, Integer.valueOf(i)}, null, f75807a, true, 88567, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, Integer.valueOf(i)}, null, f75807a, true, 88567, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(i);
        } else {
            int i2 = i;
            if (Build.VERSION.SDK_INT >= 19) {
                StatusBarUtils.setColor(activity, i);
            }
        }
    }
}
