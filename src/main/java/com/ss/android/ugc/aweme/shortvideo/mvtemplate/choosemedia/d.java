package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"showImportErrorToast", "", "context", "Landroid/content/Context;", "errorCode", "", "minDuration", "tools.dmt-av-impl_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68594a;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0098, code lost:
        if (r1 == null) goto L_0x009a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(@org.jetbrains.annotations.Nullable android.content.Context r20, int r21, int r22) {
        /*
            r0 = r20
            r1 = r22
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            r11 = 1
            r3[r11] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            r12 = 2
            r3[r12] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = f68594a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r11] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r12] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = 0
            r6 = 1
            r7 = 77933(0x1306d, float:1.09207E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0063
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r10] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r13[r11] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            r13[r12] = r0
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f68594a
            r16 = 1
            r17 = 77933(0x1306d, float:1.09207E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r12] = r1
            java.lang.Class r19 = java.lang.Void.TYPE
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x0063:
            r2 = 2131564487(0x7f0d17c7, float:1.875446E38)
            switch(r21) {
                case -8: goto L_0x00e3;
                case -7: goto L_0x00d8;
                case -6: goto L_0x00cd;
                case -5: goto L_0x00c2;
                case -4: goto L_0x00ba;
                case -3: goto L_0x00af;
                case -2: goto L_0x00a4;
                case -1: goto L_0x0071;
                default: goto L_0x0069;
            }
        L_0x0069:
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (int) r2)
            r0.a()
            return
        L_0x0071:
            r2 = -1
            if (r1 != r2) goto L_0x007f
            r1 = 2131564483(0x7f0d17c3, float:1.8754453E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (int) r1)
            r0.a()
            return
        L_0x007f:
            if (r0 == 0) goto L_0x009a
            android.content.res.Resources r2 = r20.getResources()
            if (r2 == 0) goto L_0x009a
            r3 = 2131564489(0x7f0d17c9, float:1.8754465E38)
            java.lang.Object[] r4 = new java.lang.Object[r11]
            int r1 = r1 / 1000
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r10] = r1
            java.lang.String r1 = r2.getString(r3, r4)
            if (r1 != 0) goto L_0x009c
        L_0x009a:
            java.lang.String r1 = ""
        L_0x009c:
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (java.lang.String) r1)
            r0.a()
            return
        L_0x00a4:
            r1 = 2131564485(0x7f0d17c5, float:1.8754457E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (int) r1)
            r0.a()
            return
        L_0x00af:
            r1 = 2131564486(0x7f0d17c6, float:1.8754459E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (int) r1)
            r0.a()
            return
        L_0x00ba:
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (int) r2)
            r0.a()
            return
        L_0x00c2:
            r1 = 2131564478(0x7f0d17be, float:1.8754442E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (int) r1)
            r0.a()
            return
        L_0x00cd:
            r1 = 2131561301(0x7f0d0b55, float:1.8747999E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (int) r1)
            r0.a()
            return
        L_0x00d8:
            r1 = 2131564477(0x7f0d17bd, float:1.875444E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (int) r1)
            r0.a()
            return
        L_0x00e3:
            r1 = 2131564476(0x7f0d17bc, float:1.8754438E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (int) r1)
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.d.a(android.content.Context, int, int):void");
    }
}
