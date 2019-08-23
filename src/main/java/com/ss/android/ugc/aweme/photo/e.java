package com.ss.android.ugc.aweme.photo;

import android.graphics.Bitmap;
import android.net.Uri;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.b.a.b;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58487a;

    public interface a {
        void a(@Nullable Bitmap bitmap);
    }

    public static void a(b<Bitmap> bVar) {
        b<Bitmap> bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, null, f58487a, true, 63544, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, null, f58487a, true, 63544, new Class[]{b.class}, Void.TYPE);
            return;
        }
        a(2130840329, bVar2);
    }

    public static UrlModel a(@Nullable Uri uri) {
        if (PatchProxy.isSupport(new Object[]{uri}, null, f58487a, true, 63543, new Class[]{Uri.class}, UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[]{uri}, null, f58487a, true, 63543, new Class[]{Uri.class}, UrlModel.class);
        } else if (uri == null) {
            return null;
        } else {
            UrlModel urlModel = new UrlModel();
            ArrayList arrayList = new ArrayList();
            arrayList.add(uri.toString());
            urlModel.setUrlList(arrayList);
            return urlModel;
        }
    }

    private static void a(@DrawableRes int i, b<Bitmap> bVar) {
        b<Bitmap> bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{2130840329, bVar2}, null, f58487a, true, 63545, new Class[]{Integer.TYPE, b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{2130840329, bVar2}, null, f58487a, true, 63545, new Class[]{Integer.TYPE, b.class}, Void.TYPE);
            return;
        }
        c.a(a(Uri.parse("res://" + GlobalContext.getContext().getPackageName() + "/2130840329")), 0, 0, bVar2);
    }

    public static void a(Bitmap bitmap, Bitmap bitmap2, a aVar) {
        final Bitmap bitmap3 = bitmap;
        final Bitmap bitmap4 = bitmap2;
        final a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{bitmap3, bitmap4, aVar2}, null, f58487a, true, 63546, new Class[]{Bitmap.class, Bitmap.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap3, bitmap4, aVar2}, null, f58487a, true, 63546, new Class[]{Bitmap.class, Bitmap.class, a.class}, Void.TYPE);
        } else if (bitmap3 == null || bitmap4 == null) {
            if (aVar2 != null) {
                aVar2.a(null);
            }
        } else {
            com.ss.android.b.a.a.a.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58496a;

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.Object} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: android.graphics.Bitmap} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r25 = this;
                        r7 = r25
                        r8 = 0
                        java.lang.Object[] r0 = new java.lang.Object[r8]
                        com.meituan.robust.ChangeQuickRedirect r2 = f58496a
                        java.lang.Class[] r5 = new java.lang.Class[r8]
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r3 = 0
                        r4 = 63554(0xf842, float:8.9058E-41)
                        r1 = r25
                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                        if (r0 == 0) goto L_0x0029
                        java.lang.Object[] r0 = new java.lang.Object[r8]
                        com.meituan.robust.ChangeQuickRedirect r2 = f58496a
                        r3 = 0
                        r4 = 63554(0xf842, float:8.9058E-41)
                        java.lang.Class[] r5 = new java.lang.Class[r8]
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r1 = r25
                        com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                        return
                    L_0x0029:
                        r0 = 1065353216(0x3f800000, float:1.0)
                        android.graphics.Bitmap r1 = r0
                        int r1 = r1.getWidth()
                        android.graphics.Bitmap r2 = r0
                        int r2 = r2.getHeight()
                        int r1 = java.lang.Math.min(r1, r2)
                        float r1 = (float) r1
                        float r1 = r1 * r0
                        r0 = 1156579328(0x44f00000, float:1920.0)
                        float r1 = r1 / r0
                        android.graphics.Bitmap r0 = r1
                        int r0 = r0.getWidth()
                        float r0 = (float) r0
                        float r0 = r0 * r1
                        android.graphics.Bitmap r2 = r1
                        int r2 = r2.getHeight()
                        float r2 = (float) r2
                        float r2 = r2 * r1
                        android.graphics.Bitmap r1 = r0
                        int r1 = r1.getWidth()
                        android.app.Application r3 = com.ss.android.ugc.aweme.port.in.a.f61119b
                        r4 = 1093664768(0x41300000, float:11.0)
                        float r3 = com.bytedance.common.utility.UIUtils.dip2Px(r3, r4)
                        int r3 = (int) r3
                        int r1 = r1 - r3
                        int r0 = (int) r0
                        int r1 = r1 - r0
                        android.graphics.Bitmap r3 = r0
                        int r3 = r3.getHeight()
                        android.app.Application r4 = com.ss.android.ugc.aweme.port.in.a.f61119b
                        r5 = 1093140480(0x41280000, float:10.5)
                        float r4 = com.bytedance.common.utility.UIUtils.dip2Px(r4, r5)
                        int r4 = (int) r4
                        int r3 = r3 - r4
                        int r2 = (int) r2
                        int r3 = r3 - r2
                        android.graphics.Bitmap r4 = r1
                        r5 = 3
                        java.lang.Object[] r9 = new java.lang.Object[r5]
                        r9[r8] = r4
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
                        r16 = 1
                        r9[r16] = r6
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
                        r17 = 2
                        r9[r17] = r6
                        r10 = 0
                        com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.photo.e.f58487a
                        r12 = 1
                        r13 = 63548(0xf83c, float:8.905E-41)
                        java.lang.Class[] r14 = new java.lang.Class[r5]
                        java.lang.Class<android.graphics.Bitmap> r6 = android.graphics.Bitmap.class
                        r14[r8] = r6
                        java.lang.Class r6 = java.lang.Integer.TYPE
                        r14[r16] = r6
                        java.lang.Class r6 = java.lang.Integer.TYPE
                        r14[r17] = r6
                        java.lang.Class<android.graphics.Bitmap> r15 = android.graphics.Bitmap.class
                        boolean r6 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
                        if (r6 == 0) goto L_0x00d9
                        java.lang.Object[] r9 = new java.lang.Object[r5]
                        r9[r8] = r4
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                        r9[r16] = r0
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                        r9[r17] = r0
                        r10 = 0
                        com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.photo.e.f58487a
                        r12 = 1
                        r13 = 63548(0xf83c, float:8.905E-41)
                        java.lang.Class[] r14 = new java.lang.Class[r5]
                        java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
                        r14[r8] = r0
                        java.lang.Class r0 = java.lang.Integer.TYPE
                        r14[r16] = r0
                        java.lang.Class r0 = java.lang.Integer.TYPE
                        r14[r17] = r0
                        java.lang.Class<android.graphics.Bitmap> r15 = android.graphics.Bitmap.class
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
                        android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
                        goto L_0x00fa
                    L_0x00d9:
                        int r12 = r4.getWidth()
                        int r13 = r4.getHeight()
                        float r0 = (float) r0
                        float r6 = (float) r12
                        float r0 = r0 / r6
                        float r2 = (float) r2
                        float r6 = (float) r13
                        float r2 = r2 / r6
                        android.graphics.Matrix r14 = new android.graphics.Matrix
                        r14.<init>()
                        r14.postScale(r0, r2)
                        r10 = 0
                        r11 = 0
                        r15 = 1
                        r9 = r4
                        android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r9, r10, r11, r12, r13, r14, r15)
                        r4.recycle()
                    L_0x00fa:
                        android.graphics.Bitmap r2 = r0
                        r4 = 4
                        java.lang.Object[] r9 = new java.lang.Object[r4]
                        r9[r8] = r2
                        r9[r16] = r0
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
                        r9[r17] = r6
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
                        r9[r5] = r6
                        r10 = 0
                        com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.photo.e.f58487a
                        r12 = 1
                        r13 = 63547(0xf83b, float:8.9048E-41)
                        java.lang.Class[] r14 = new java.lang.Class[r4]
                        java.lang.Class<android.graphics.Bitmap> r6 = android.graphics.Bitmap.class
                        r14[r8] = r6
                        java.lang.Class<android.graphics.Bitmap> r6 = android.graphics.Bitmap.class
                        r14[r16] = r6
                        java.lang.Class r6 = java.lang.Integer.TYPE
                        r14[r17] = r6
                        java.lang.Class r6 = java.lang.Integer.TYPE
                        r14[r5] = r6
                        java.lang.Class<android.graphics.Bitmap> r15 = android.graphics.Bitmap.class
                        boolean r6 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
                        r9 = 0
                        if (r6 == 0) goto L_0x016c
                        java.lang.Object[] r6 = new java.lang.Object[r4]
                        r6[r8] = r2
                        r6[r16] = r0
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                        r6[r17] = r1
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                        r6[r5] = r1
                        r19 = 0
                        com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.photo.e.f58487a
                        r21 = 1
                        r22 = 63547(0xf83b, float:8.9048E-41)
                        java.lang.Class[] r1 = new java.lang.Class[r4]
                        java.lang.Class<android.graphics.Bitmap> r2 = android.graphics.Bitmap.class
                        r1[r8] = r2
                        java.lang.Class<android.graphics.Bitmap> r2 = android.graphics.Bitmap.class
                        r1[r16] = r2
                        java.lang.Class r2 = java.lang.Integer.TYPE
                        r1[r17] = r2
                        java.lang.Class r2 = java.lang.Integer.TYPE
                        r1[r5] = r2
                        java.lang.Class<android.graphics.Bitmap> r24 = android.graphics.Bitmap.class
                        r18 = r6
                        r23 = r1
                        java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r18, r19, r20, r21, r22, r23, r24)
                        r9 = r1
                        android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
                        goto L_0x0192
                    L_0x016c:
                        if (r2 != 0) goto L_0x016f
                        goto L_0x0192
                    L_0x016f:
                        int r4 = r2.getWidth()
                        int r5 = r2.getHeight()
                        android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
                        android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)
                        android.graphics.Canvas r5 = new android.graphics.Canvas
                        r5.<init>(r4)
                        r6 = 0
                        r5.drawBitmap(r2, r6, r6, r9)
                        float r1 = (float) r1
                        float r2 = (float) r3
                        r5.drawBitmap(r0, r1, r2, r9)
                        r5.save()
                        r5.restore()
                        r9 = r4
                    L_0x0192:
                        android.graphics.Bitmap r1 = r0
                        r1.recycle()
                        r0.recycle()
                        com.ss.android.ugc.aweme.photo.e$3$1 r0 = new com.ss.android.ugc.aweme.photo.e$3$1
                        r0.<init>(r9)
                        com.ss.android.b.a.a.a.b(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.photo.e.AnonymousClass3.run():void");
                }
            });
        }
    }
}
