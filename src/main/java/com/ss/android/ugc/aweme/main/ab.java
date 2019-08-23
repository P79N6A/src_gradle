package com.ss.android.ugc.aweme.main;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;

public final /* synthetic */ class ab implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54315a;

    /* renamed from: b  reason: collision with root package name */
    private final MainFragment f54316b;

    ab(MainFragment mainFragment) {
        this.f54316b = mainFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChanged(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f54315a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 57334(0xdff6, float:8.0342E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f54315a
            r13 = 0
            r14 = 57334(0xdff6, float:8.0342E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            r2 = r17
            com.ss.android.ugc.aweme.main.MainFragment r3 = r2.f54316b
            r0 = r18
            com.ss.android.ugc.aweme.arch.widgets.base.a r0 = (com.ss.android.ugc.aweme.arch.widgets.base.a) r0
            if (r0 == 0) goto L_0x014a
            java.lang.Object r4 = r0.a()
            boolean r4 = r4 instanceof int[]
            if (r4 == 0) goto L_0x014a
            java.lang.Object r0 = r0.a()
            int[] r0 = (int[]) r0
            int r4 = r0.length
            r5 = 2
            if (r4 != r5) goto L_0x014a
            r4 = r0[r9]
            r0 = r0[r1]
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r10[r9] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r10[r1] = r6
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.main.MainFragment.f3515a
            r13 = 0
            r14 = 57256(0xdfa8, float:8.0233E-41)
            java.lang.Class[] r15 = new java.lang.Class[r5]
            java.lang.Class r6 = java.lang.Integer.TYPE
            r15[r9] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r15[r1] = r6
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r3
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r6 == 0) goto L_0x00a0
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r10[r9] = r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10[r1] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.main.MainFragment.f3515a
            r13 = 0
            r14 = 57256(0xdfa8, float:8.0233E-41)
            java.lang.Class[] r15 = new java.lang.Class[r5]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r15[r9] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r15[r1] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x00a0:
            if (r4 != r1) goto L_0x012e
            boolean r4 = r3.d()
            if (r4 == 0) goto L_0x011c
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.main.MainFragment.f3515a
            r13 = 0
            r14 = 57278(0xdfbe, float:8.0264E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r3
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x00cd
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.main.MainFragment.f3515a
            r13 = 0
            r14 = 57278(0xdfbe, float:8.0264E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x014a
        L_0x00cd:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r0 = r0.bE()
            r6 = 120000(0x1d4c0, double:5.9288E-319)
            if (r0 != r1) goto L_0x00e7
            long r4 = java.lang.System.currentTimeMillis()
            long r10 = r3.g
            long r4 = r4 - r10
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0100
            r0 = 1
            goto L_0x0101
        L_0x00e7:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r0 = r0.bE()
            if (r0 != r5) goto L_0x0100
            long r4 = java.lang.System.currentTimeMillis()
            long r10 = r3.h
            long r4 = r4 - r10
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fe
            r0 = 1
            goto L_0x00ff
        L_0x00fe:
            r0 = 0
        L_0x00ff:
            r9 = r0
        L_0x0100:
            r0 = 0
        L_0x0101:
            if (r9 == 0) goto L_0x010a
            java.lang.String r4 = "homepage_follow"
            java.lang.String r5 = "yellow_dot"
            com.ss.android.ugc.aweme.main.d.a.a(r1, r4, r5)
        L_0x010a:
            if (r0 == 0) goto L_0x0113
            java.lang.String r4 = "homepage_follow"
            java.lang.String r5 = "capsule"
            com.ss.android.ugc.aweme.main.d.a.a(r1, r4, r5)
        L_0x0113:
            r3.e(r9)
            r1 = 150(0x96, float:2.1E-43)
            r3.a((boolean) r0, (int) r1)
            return
        L_0x011c:
            com.ss.android.ugc.aweme.main.d.a.a((boolean) r1)
            java.lang.String r4 = "homepage_hot"
            java.lang.String r5 = "yellow_dot"
            com.ss.android.ugc.aweme.main.d.a.a(r1, r4, r5)
            if (r0 != r1) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            r1 = 0
        L_0x012a:
            r3.e(r1)
            return
        L_0x012e:
            if (r4 != r5) goto L_0x013a
            boolean r5 = r3.d()
            if (r5 != 0) goto L_0x013a
            r3.c((int) r0)
            return
        L_0x013a:
            r5 = 3
            if (r4 != r5) goto L_0x014a
            boolean r4 = r3.d()
            if (r4 != 0) goto L_0x014a
            if (r0 != r1) goto L_0x0146
            goto L_0x0147
        L_0x0146:
            r1 = 0
        L_0x0147:
            r3.f(r1)
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.ab.onChanged(java.lang.Object):void");
    }
}
