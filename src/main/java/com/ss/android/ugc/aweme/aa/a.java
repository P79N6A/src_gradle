package com.ss.android.ugc.aweme.aa;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.WeakHashMap;

public abstract class a<PARAM_TYPE, SUB> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f31574b;

    /* renamed from: c  reason: collision with root package name */
    protected WeakHashMap<View, PARAM_TYPE> f31575c = new WeakHashMap<>();

    /* JADX WARNING: type inference failed for: r1v3, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final PARAM_TYPE a(android.view.View r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f31574b
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r9] = r1
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r3 = 0
            r4 = 63470(0xf7ee, float:8.894E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0035
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f31574b
            r3 = 0
            r4 = 63470(0xf7ee, float:8.894E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r9] = r1
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r1 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        L_0x0035:
            java.util.WeakHashMap<android.view.View, PARAM_TYPE> r0 = r10.f31575c
            java.lang.Object r0 = r0.get(r11)
            r7 = r11
        L_0x003c:
            int r1 = r7.getId()
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            if (r1 == r2) goto L_0x0061
            r0 = 30
            if (r9 <= r0) goto L_0x004b
            r0 = 0
            return r0
        L_0x004b:
            java.util.WeakHashMap<android.view.View, PARAM_TYPE> r0 = r10.f31575c
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L_0x0061
            android.view.ViewParent r1 = r7.getParent()
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L_0x0061
            r7 = r1
            android.view.View r7 = (android.view.View) r7
            int r9 = r9 + 1
            goto L_0x003c
        L_0x0061:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aa.a.a(android.view.View):java.lang.Object");
    }

    public final SUB a(View view, PARAM_TYPE param_type) {
        if (PatchProxy.isSupport(new Object[]{view, param_type}, this, f31574b, false, 63469, new Class[]{View.class, Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{view, param_type}, this, f31574b, false, 63469, new Class[]{View.class, Object.class}, Object.class);
        }
        this.f31575c.put(view, param_type);
        return this;
    }
}
