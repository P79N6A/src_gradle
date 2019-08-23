package com.ss.android.ugc.aweme.antiaddic.lock.ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.ag.d;
import com.ss.android.ugc.aweme.ag.k;
import com.ss.android.ugc.aweme.framework.core.a;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33473a;

    private String c(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f33473a, false, 21891, new Class[]{String.class}, String.class)) {
            return k.b(str2, "user_id");
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f33473a, false, 21891, new Class[]{String.class}, String.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0069 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int b(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f33473a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Integer.TYPE
            r5 = 0
            r6 = 21890(0x5582, float:3.0674E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f33473a
            r13 = 0
            r14 = 21890(0x5582, float:3.0674E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Integer.TYPE
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x003b:
            java.lang.String r2 = "type"
            java.lang.String r0 = com.ss.android.ugc.aweme.ag.k.b(r0, r2)
            int r2 = r0.hashCode()
            r3 = -892246040(0xffffffffcad167e8, float:-6861812.0)
            r4 = -1
            if (r2 == r3) goto L_0x005b
            r3 = 36430685(0x22be35d, float:1.2628346E-37)
            if (r2 == r3) goto L_0x0051
            goto L_0x0065
        L_0x0051:
            java.lang.String r2 = "time_lock"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0065
            r0 = 0
            goto L_0x0066
        L_0x005b:
            java.lang.String r2 = "teen_mode"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0065
            r0 = 1
            goto L_0x0066
        L_0x0065:
            r0 = -1
        L_0x0066:
            switch(r0) {
                case 0: goto L_0x006b;
                case 1: goto L_0x006a;
                default: goto L_0x0069;
            }
        L_0x0069:
            return r4
        L_0x006a:
            return r1
        L_0x006b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.antiaddic.lock.ui.b.b(java.lang.String):int");
    }

    private int d(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f33473a, false, 21892, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, f33473a, false, 21892, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        String b2 = k.b(str2, "time_lock");
        if (TextUtils.isEmpty(b2)) {
            return 0;
        }
        try {
            return Integer.parseInt(b2);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private int e(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f33473a, false, 21893, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, f33473a, false, 21893, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        String b2 = k.b(str2, "teen_mode");
        if (TextUtils.isEmpty(b2)) {
            return 0;
        }
        try {
            return Integer.parseInt(b2);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final boolean a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f33473a, false, 21887, new Class[]{String.class}, Boolean.TYPE)) {
            return a(null, str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f33473a, false, 21887, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public final boolean a(Activity activity, String str) {
        Activity activity2 = activity;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{activity2, str2}, this, f33473a, false, 21888, new Class[]{Activity.class, String.class}, Boolean.TYPE)) {
            return a(activity2, str2, null);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str2}, this, f33473a, false, 21888, new Class[]{Activity.class, String.class}, Boolean.TYPE)).booleanValue();
    }

    public final boolean a(Activity activity, String str, View view) {
        Context context;
        String str2 = str;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{activity, str2, view}, this, f33473a, false, 21889, new Class[]{Activity.class, String.class, View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity, str2, view}, this, f33473a, false, 21889, new Class[]{Activity.class, String.class, View.class}, Boolean.TYPE)).booleanValue();
        }
        if (activity == null) {
            context = a.b().a();
        } else {
            context = activity;
        }
        if (context == null) {
            context = GlobalContext.getContext();
        }
        if (e(str) == -1 || TextUtils.isEmpty(c(str))) {
            return false;
        }
        int b2 = b(str);
        if ((b2 == 0 && d(str) > 0) || (b2 == 1 && e(str) == 1)) {
            z = true;
        }
        SetTimeLockActivity.a(context, b(str), c(str), z, d(str));
        return true;
    }
}
