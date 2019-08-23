package com.ss.android.ugc.aweme.hotsearch.d;

import android.graphics.Bitmap;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49734a;

    public static Bitmap a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f49734a, true, 49819, new Class[]{View.class}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{view2}, null, f49734a, true, 49819, new Class[]{View.class}, Bitmap.class);
        }
        view2.setDrawingCacheEnabled(true);
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null || drawingCache.getWidth() <= 0 || drawingCache.getHeight() <= 0) {
            return null;
        }
        return Bitmap.createBitmap(view.getDrawingCache());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap a(android.graphics.Bitmap r21, int r22, int r23) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r22)
            r12 = 1
            r4[r12] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r23)
            r13 = 2
            r4[r13] = r5
            com.meituan.robust.ChangeQuickRedirect r6 = f49734a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            r9[r11] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r9[r12] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r9[r13] = r5
            java.lang.Class<android.graphics.Bitmap> r10 = android.graphics.Bitmap.class
            r5 = 0
            r7 = 1
            r8 = 49820(0xc29c, float:6.9813E-41)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0068
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            r14[r12] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            r14[r13] = r0
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f49734a
            r17 = 1
            r18 = 49820(0xc29c, float:6.9813E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r13] = r1
            java.lang.Class<android.graphics.Bitmap> r20 = android.graphics.Bitmap.class
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            return r0
        L_0x0068:
            int r3 = r21.getHeight()
            int r4 = r21.getWidth()
            float r3 = (float) r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r6 = r3 * r5
            float r4 = (float) r4
            float r6 = r6 / r4
            float r7 = (float) r1
            float r7 = r7 * r5
            float r8 = (float) r2
            float r9 = r7 / r8
            int r10 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r10 <= 0) goto L_0x008a
            float r8 = r8 * r5
            float r8 = r8 / r4
            float r8 = r8 * r3
            int r3 = (int) r8
            r4 = r3
        L_0x0088:
            r3 = r2
            goto L_0x0095
        L_0x008a:
            int r5 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x0090
            r4 = r1
            goto L_0x0088
        L_0x0090:
            float r7 = r7 / r3
            float r7 = r7 * r4
            int r3 = (int) r7
            r4 = r1
        L_0x0095:
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r0, r3, r4, r11)
            if (r4 <= r3) goto L_0x00a3
            int r4 = r4 / r13
            int r3 = r1 / 2
            int r3 = r4 - r3
            r11 = r3
            r3 = 0
            goto L_0x00a7
        L_0x00a3:
            int r3 = r3 / r13
            int r4 = r2 / 2
            int r3 = r3 - r4
        L_0x00a7:
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r0, r3, r11, r2, r1)
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hotsearch.d.f.a(android.graphics.Bitmap, int, int):android.graphics.Bitmap");
    }
}
