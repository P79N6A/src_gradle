package com.ss.android.ugc.aweme.story.feed.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.sticker.a.b;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72497a;

    public static void a(int i, int i2, int i3, int i4, b.a aVar) {
        if (i2 != 0 && i != 0) {
            float f2 = (((float) i) * 1.0f) / ((float) i2);
            if (f2 > 0.625f) {
                i4 = (int) (((float) i3) / f2);
            } else {
                i3 = (int) (f2 * ((float) i4));
            }
            aVar.f71621a = i3;
            aVar.f71622b = i4;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(int r24, int r25, int r26, int r27, android.view.View... r28) {
        /*
            r0 = r24
            r1 = r25
            r2 = r28
            r3 = 5
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r24)
            r11 = 0
            r4[r11] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r25)
            r12 = 1
            r4[r12] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r26)
            r13 = 2
            r4[r13] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r27)
            r14 = 3
            r4[r14] = r5
            r15 = 4
            r4[r15] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f72497a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class r5 = java.lang.Integer.TYPE
            r9[r11] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r9[r12] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r9[r13] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r9[r14] = r5
            java.lang.Class<android.view.View[]> r5 = android.view.View[].class
            r9[r15] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = 0
            r7 = 1
            r8 = 83684(0x146e4, float:1.17266E-40)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0092
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
            r4[r11] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r25)
            r4[r12] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r26)
            r4[r13] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r27)
            r4[r14] = r0
            r4[r15] = r2
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = f72497a
            r19 = 1
            r20 = 83684(0x146e4, float:1.17266E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r14] = r1
            java.lang.Class<android.view.View[]> r1 = android.view.View[].class
            r0[r15] = r1
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r4
            r21 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            return
        L_0x0092:
            int r3 = r2.length
            if (r3 == 0) goto L_0x00cc
            if (r1 == 0) goto L_0x00cc
            if (r0 != 0) goto L_0x009a
            goto L_0x00cc
        L_0x009a:
            float r0 = (float) r0
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r3
            float r1 = (float) r1
            float r0 = r0 / r1
            r1 = 1059061760(0x3f200000, float:0.625)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00b2
            r1 = r26
            float r3 = (float) r1
            float r3 = r3 / r0
            int r0 = (int) r3
            r23 = r1
            r1 = r0
            r0 = r23
            goto L_0x00b8
        L_0x00b2:
            r1 = r27
            float r3 = (float) r1
            float r0 = r0 * r3
            int r0 = (int) r0
        L_0x00b8:
            int r3 = r2.length
        L_0x00b9:
            if (r11 >= r3) goto L_0x00cb
            r4 = r2[r11]
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            r5.width = r0
            r5.height = r1
            r4.setLayoutParams(r5)
            int r11 = r11 + 1
            goto L_0x00b9
        L_0x00cb:
            return
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.c.d.a(int, int, int, int, android.view.View[]):void");
    }
}
