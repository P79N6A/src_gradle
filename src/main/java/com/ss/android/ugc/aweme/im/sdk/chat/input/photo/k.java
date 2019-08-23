package com.ss.android.ugc.aweme.im.sdk.chat.input.photo;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.base.a;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50849a;

    public static k a() {
        if (PatchProxy.isSupport(new Object[0], null, f50849a, true, 51001, new Class[0], k.class)) {
            return (k) PatchProxy.accessDispatch(new Object[0], null, f50849a, true, 51001, new Class[0], k.class);
        }
        return new k();
    }

    public final void a(Activity activity, a<Boolean> aVar) {
        final Activity activity2 = activity;
        final a<Boolean> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{activity2, aVar2}, this, f50849a, false, 51002, new Class[]{Activity.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, aVar2}, this, f50849a, false, 51002, new Class[]{Activity.class, a.class}, Void.TYPE);
            return;
        }
        b.a(activity2, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new b.C0400b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50850a;

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object[]} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(java.lang.String[] r20, int[] r21) {
                /*
                    r19 = this;
                    r7 = r19
                    r8 = r21
                    r9 = 2
                    java.lang.Object[] r0 = new java.lang.Object[r9]
                    r10 = 0
                    r0[r10] = r20
                    r11 = 1
                    r0[r11] = r8
                    com.meituan.robust.ChangeQuickRedirect r2 = f50850a
                    java.lang.Class[] r5 = new java.lang.Class[r9]
                    java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                    r5[r10] = r1
                    java.lang.Class<int[]> r1 = int[].class
                    r5[r11] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r3 = 0
                    r4 = 51004(0xc73c, float:7.1472E-41)
                    r1 = r19
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 == 0) goto L_0x0045
                    java.lang.Object[] r0 = new java.lang.Object[r9]
                    r0[r10] = r20
                    r0[r11] = r8
                    com.meituan.robust.ChangeQuickRedirect r2 = f50850a
                    r3 = 0
                    r4 = 51004(0xc73c, float:7.1472E-41)
                    java.lang.Class[] r5 = new java.lang.Class[r9]
                    java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                    r5[r10] = r1
                    java.lang.Class<int[]> r1 = int[].class
                    r5[r11] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r1 = r19
                    com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                    return
                L_0x0045:
                    if (r8 == 0) goto L_0x005a
                    int r0 = r8.length
                    if (r0 <= 0) goto L_0x005a
                    r0 = r8[r10]
                    if (r0 != 0) goto L_0x005a
                    com.ss.android.ugc.aweme.base.a r0 = r1
                    if (r0 == 0) goto L_0x00c8
                    com.ss.android.ugc.aweme.base.a r0 = r1
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE
                    r0.run(r1)
                    return
                L_0x005a:
                    com.ss.android.ugc.aweme.base.a r0 = r1
                    if (r0 == 0) goto L_0x0065
                    com.ss.android.ugc.aweme.base.a r0 = r1
                    java.lang.Boolean r1 = java.lang.Boolean.FALSE
                    r0.run(r1)
                L_0x0065:
                    com.ss.android.ugc.aweme.im.sdk.chat.input.photo.k r0 = com.ss.android.ugc.aweme.im.sdk.chat.input.photo.k.this
                    android.app.Activity r1 = r0
                    java.lang.Object[] r12 = new java.lang.Object[r11]
                    r12[r10] = r1
                    com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.im.sdk.chat.input.photo.k.f50849a
                    r15 = 0
                    r16 = 51003(0xc73b, float:7.147E-41)
                    java.lang.Class[] r2 = new java.lang.Class[r11]
                    java.lang.Class<android.content.Context> r3 = android.content.Context.class
                    r2[r10] = r3
                    java.lang.Class r18 = java.lang.Void.TYPE
                    r13 = r0
                    r17 = r2
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
                    if (r2 == 0) goto L_0x009d
                    java.lang.Object[] r12 = new java.lang.Object[r11]
                    r12[r10] = r1
                    com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.im.sdk.chat.input.photo.k.f50849a
                    r15 = 0
                    r16 = 51003(0xc73b, float:7.147E-41)
                    java.lang.Class[] r1 = new java.lang.Class[r11]
                    java.lang.Class<android.content.Context> r2 = android.content.Context.class
                    r1[r10] = r2
                    java.lang.Class r18 = java.lang.Void.TYPE
                    r13 = r0
                    r17 = r1
                    com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                    return
                L_0x009d:
                    com.bytedance.ies.dmt.ui.b.a$a r2 = new com.bytedance.ies.dmt.ui.b.a$a
                    r2.<init>(r1)
                    r1 = 2131560377(0x7f0d07b9, float:1.8746125E38)
                    com.bytedance.ies.dmt.ui.b.a$a r1 = r2.b((int) r1)
                    r2 = 2131560400(0x7f0d07d0, float:1.8746171E38)
                    com.ss.android.ugc.aweme.im.sdk.chat.input.photo.k$3 r3 = new com.ss.android.ugc.aweme.im.sdk.chat.input.photo.k$3
                    r3.<init>()
                    com.bytedance.ies.dmt.ui.b.a$a r1 = r1.b((int) r2, (android.content.DialogInterface.OnClickListener) r3)
                    r2 = 2131560429(0x7f0d07ed, float:1.874623E38)
                    com.ss.android.ugc.aweme.im.sdk.chat.input.photo.k$2 r3 = new com.ss.android.ugc.aweme.im.sdk.chat.input.photo.k$2
                    r3.<init>()
                    com.bytedance.ies.dmt.ui.b.a$a r0 = r1.a((int) r2, (android.content.DialogInterface.OnClickListener) r3)
                    com.bytedance.ies.dmt.ui.b.a r0 = r0.a()
                    r0.a()
                L_0x00c8:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.k.AnonymousClass1.a(java.lang.String[], int[]):void");
            }
        });
    }
}
