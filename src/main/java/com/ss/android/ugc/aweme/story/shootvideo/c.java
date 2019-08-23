package com.ss.android.ugc.aweme.story.shootvideo;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.f;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.utils.w;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73428a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.String[] r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f73428a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = 0
            r5 = 1
            r6 = 85121(0x14c81, float:1.1928E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f73428a
            r13 = 1
            r14 = 85121(0x14c81, float:1.1928E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003b:
            if (r0 == 0) goto L_0x005c
            int r2 = r0.length
            if (r2 != 0) goto L_0x0041
            goto L_0x005c
        L_0x0041:
            int r2 = r0.length
            r3 = 0
        L_0x0043:
            if (r3 >= r2) goto L_0x005b
            r4 = r0[r3]
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x0058
            java.lang.String r4 = r4.trim()
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0058
            return r1
        L_0x0058:
            int r3 = r3 + 1
            goto L_0x0043
        L_0x005b:
            return r9
        L_0x005c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.shootvideo.c.a(java.lang.String[]):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074 A[SYNTHETIC, Splitter:B:23:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007d A[SYNTHETIC, Splitter:B:30:0x007d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.graphics.Bitmap r19, java.lang.String r20) {
        /*
            r1 = r19
            r0 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r1
            r11 = 1
            r3[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r5 = f73428a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.graphics.Bitmap> r4 = android.graphics.Bitmap.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = 0
            r6 = 1
            r7 = 85118(0x14c7e, float:1.19276E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x004c
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r1
            r12[r11] = r0
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f73428a
            r15 = 1
            r16 = 85118(0x14c7e, float:1.19276E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x004c:
            if (r1 == 0) goto L_0x0084
            boolean r2 = r19.isRecycled()
            if (r2 == 0) goto L_0x0055
            goto L_0x0084
        L_0x0055:
            com.ss.android.ugc.aweme.video.b.a((java.lang.String) r0, (boolean) r11)
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x007b, all -> 0x0071 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x007b, all -> 0x0071 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x006f, all -> 0x006c }
            r2 = 100
            r1.compress(r0, r2, r3)     // Catch:{ Exception -> 0x006f, all -> 0x006c }
            r3.close()     // Catch:{ IOException -> 0x0068 }
        L_0x0068:
            com.ss.android.ugc.aweme.utils.w.a((android.graphics.Bitmap) r19)
            return r11
        L_0x006c:
            r0 = move-exception
            r2 = r3
            goto L_0x0072
        L_0x006f:
            r2 = r3
            goto L_0x007b
        L_0x0071:
            r0 = move-exception
        L_0x0072:
            if (r2 == 0) goto L_0x0077
            r2.close()     // Catch:{ IOException -> 0x0077 }
        L_0x0077:
            com.ss.android.ugc.aweme.utils.w.a((android.graphics.Bitmap) r19)
            throw r0
        L_0x007b:
            if (r2 == 0) goto L_0x0080
            r2.close()     // Catch:{ IOException -> 0x0080 }
        L_0x0080:
            com.ss.android.ugc.aweme.utils.w.a((android.graphics.Bitmap) r19)
            return r10
        L_0x0084:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.shootvideo.c.a(android.graphics.Bitmap, java.lang.String):boolean");
    }

    public static boolean a(Activity activity, String str, f.a aVar) {
        Activity activity2 = activity;
        String str2 = str;
        f.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{activity2, str2, aVar2}, null, f73428a, true, 85123, new Class[]{Activity.class, String.class, f.a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str2, aVar2}, null, f73428a, true, 85123, new Class[]{Activity.class, String.class, f.a.class}, Boolean.TYPE)).booleanValue();
        } else if (a.x.c() && !TextUtils.isEmpty(a.x.d())) {
            return true;
        } else {
            a.x.a(activity2, str2, aVar2);
            return false;
        }
    }

    public static Bitmap a(View view, int i, int i2) {
        Bitmap bitmap;
        View view2 = view;
        int i3 = i;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f73428a, true, 85119, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f73428a, true, 85119, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Bitmap.class);
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            createBitmap.setDensity(o.a().getDisplayMetrics().densityDpi);
            if (view.getDrawingCacheBackgroundColor() != 0) {
                createBitmap.eraseColor(view.getDrawingCacheBackgroundColor());
            }
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate((float) (-view.getScrollX()), (float) (-view.getScrollY()));
            view2.draw(canvas);
            if (PatchProxy.isSupport(new Object[]{createBitmap, Integer.valueOf(i), Integer.valueOf(i2)}, null, f73428a, true, 85120, new Class[]{Bitmap.class, Integer.TYPE, Integer.TYPE}, Bitmap.class)) {
                bitmap = (Bitmap) PatchProxy.accessDispatch(new Object[]{createBitmap, Integer.valueOf(i), Integer.valueOf(i2)}, null, f73428a, true, 85120, new Class[]{Bitmap.class, Integer.TYPE, Integer.TYPE}, Bitmap.class);
            } else {
                int width = createBitmap.getWidth();
                int height = createBitmap.getHeight();
                if (width == i3 && height == i4) {
                    bitmap = createBitmap;
                } else {
                    Matrix matrix = new Matrix();
                    matrix.postScale(((float) i3) / ((float) width), ((float) i4) / ((float) height));
                    bitmap = Bitmap.createBitmap(createBitmap, 0, 0, width, height, matrix, true);
                }
            }
            if (bitmap != createBitmap) {
                w.a(createBitmap);
            }
            return bitmap;
        } catch (OutOfMemoryError e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return null;
        }
    }
}
