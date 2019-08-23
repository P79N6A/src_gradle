package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67248a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.RectF a(android.graphics.PointF[] r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f67248a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.graphics.PointF[]> r3 = android.graphics.PointF[].class
            r7[r9] = r3
            java.lang.Class<android.graphics.RectF> r8 = android.graphics.RectF.class
            r3 = 0
            r5 = 1
            r6 = 76888(0x12c58, float:1.07743E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f67248a
            r13 = 1
            r14 = 76888(0x12c58, float:1.07743E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.graphics.PointF[]> r0 = android.graphics.PointF[].class
            r15[r9] = r0
            java.lang.Class<android.graphics.RectF> r16 = android.graphics.RectF.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            android.graphics.RectF r0 = (android.graphics.RectF) r0
            return r0
        L_0x0037:
            r1 = r0[r9]
            float r1 = r1.x
            r2 = r0[r9]
            float r2 = r2.y
            int r3 = r0.length
            r4 = r1
            r5 = r2
        L_0x0042:
            if (r9 >= r3) goto L_0x0069
            r6 = r0[r9]
            float r7 = r6.x
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 >= 0) goto L_0x004e
            float r1 = r6.x
        L_0x004e:
            float r7 = r6.x
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x0056
            float r4 = r6.x
        L_0x0056:
            float r7 = r6.y
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x005e
            float r2 = r6.y
        L_0x005e:
            float r7 = r6.y
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0066
            float r5 = r6.y
        L_0x0066:
            int r9 = r9 + 1
            goto L_0x0042
        L_0x0069:
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1, r2, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.a(android.graphics.PointF[]):android.graphics.RectF");
    }

    public static boolean a(Rect rect, PointF[] pointFArr) {
        Rect rect2 = rect;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{rect2, pointFArr}, null, f67248a, true, 76887, new Class[]{Rect.class, PointF[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{rect2, pointFArr}, null, f67248a, true, 76887, new Class[]{Rect.class, PointF[].class}, Boolean.TYPE)).booleanValue();
        }
        if (!(pointFArr == null || rect2 == null)) {
            RectF a2 = a(pointFArr);
            if (a2.right < ((float) rect2.left)) {
                z = true;
            }
            if (a2.left > ((float) rect2.right)) {
                z = true;
            }
            if (a2.bottom < ((float) rect2.top)) {
                z = true;
            }
            if (a2.top > ((float) rect2.bottom)) {
                z = true;
            }
        }
        return z;
    }
}
