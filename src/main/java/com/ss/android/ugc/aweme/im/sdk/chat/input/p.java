package com.ss.android.ugc.aweme.im.sdk.chat.input;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class p implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50666a;

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f50666a, false, 50637, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f50666a, false, 50637, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
    }

    public boolean onLongClick(View view) {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.view.View.OnClickListener r19, android.view.View... r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f50666a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.view.View$OnClickListener> r4 = android.view.View.OnClickListener.class
            r8[r10] = r4
            java.lang.Class<android.view.View[]> r4 = android.view.View[].class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = 0
            r6 = 1
            r7 = 50638(0xc5ce, float:7.0959E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0045
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f50666a
            r15 = 1
            r16 = 50638(0xc5ce, float:7.0959E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.view.View$OnClickListener> r1 = android.view.View.OnClickListener.class
            r0[r10] = r1
            java.lang.Class<android.view.View[]> r1 = android.view.View[].class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0045:
            int r2 = r1.length
            if (r2 > 0) goto L_0x0049
            return
        L_0x0049:
            int r2 = r1.length
        L_0x004a:
            if (r10 >= r2) goto L_0x0054
            r3 = r1[r10]
            r3.setOnClickListener(r0)
            int r10 = r10 + 1
            goto L_0x004a
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.input.p.a(android.view.View$OnClickListener, android.view.View[]):void");
    }

    public static void a(View.OnLongClickListener onLongClickListener, View... viewArr) {
        View.OnLongClickListener onLongClickListener2 = onLongClickListener;
        if (PatchProxy.isSupport(new Object[]{onLongClickListener2, viewArr}, null, f50666a, true, 50639, new Class[]{View.OnLongClickListener.class, View[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onLongClickListener2, viewArr}, null, f50666a, true, 50639, new Class[]{View.OnLongClickListener.class, View[].class}, Void.TYPE);
            return;
        }
        for (int i = 0; i < 2; i++) {
            viewArr[i].setOnLongClickListener(onLongClickListener2);
        }
    }
}
