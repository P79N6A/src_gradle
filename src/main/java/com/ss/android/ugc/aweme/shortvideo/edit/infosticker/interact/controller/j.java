package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.utils.w;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67282a;

    public static Bitmap a(View view, int i, int i2, int i3, int i4) {
        Bitmap bitmap;
        View view2 = view;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, null, f67282a, true, 76979, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Bitmap.class)) {
            Object[] objArr = {view2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, f67282a, true, 76979, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Bitmap.class);
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
            Object[] objArr2 = {createBitmap, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            if (PatchProxy.isSupport(objArr2, null, f67282a, true, 76980, new Class[]{Bitmap.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Bitmap.class)) {
                Object[] objArr3 = {createBitmap, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                Object[] objArr4 = objArr3;
                bitmap = (Bitmap) PatchProxy.accessDispatch(objArr4, null, f67282a, true, 76980, new Class[]{Bitmap.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Bitmap.class);
            } else {
                int width = createBitmap.getWidth();
                int height = createBitmap.getHeight();
                if (width == i5 && height == i6) {
                    bitmap = createBitmap;
                } else if (i7 <= 0 || i8 <= 0 || (width <= i7 && height <= i8)) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(((float) i5) / ((float) width), ((float) i6) / ((float) height));
                    bitmap = Bitmap.createBitmap(createBitmap, 0, 0, width, height, matrix, true);
                } else {
                    Matrix matrix2 = new Matrix();
                    matrix2.setTranslate(((float) (width - i7)) * 0.5f, ((float) (height - i8)) * 0.5f);
                    matrix2.postScale(((float) i5) / ((float) i7), ((float) i6) / ((float) i8));
                    bitmap = Bitmap.createBitmap(createBitmap, 0, 0, i3, i4, matrix2, true);
                }
            }
            if (bitmap != createBitmap) {
                w.a(createBitmap);
            }
            return bitmap;
        } catch (OutOfMemoryError e2) {
            a.a((Throwable) e2);
            return null;
        }
    }
}
