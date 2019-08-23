package com.bytedance.android.livesdk.gift.effect.normal.e;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14934a;

    enum a {
        VERTICAL,
        HORIZONTAL;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static Bitmap b(Bitmap bitmap) {
        if (PatchProxy.isSupport(new Object[]{bitmap}, null, f14934a, true, 9557, new Class[]{Bitmap.class}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{bitmap}, null, f14934a, true, 9557, new Class[]{Bitmap.class}, Bitmap.class);
        }
        try {
            return Bitmap.createBitmap(bitmap);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public static Bitmap a(View view) {
        Bitmap bitmap;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f14934a, true, 9559, new Class[]{View.class}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{view2}, null, f14934a, true, 9559, new Class[]{View.class}, Bitmap.class);
        }
        view2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        view2.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view2.setDrawingCacheEnabled(true);
        try {
            bitmap = view.getDrawingCache();
            if (bitmap == null) {
                bitmap = b(view);
            }
        } catch (Exception unused) {
            bitmap = b(view);
        }
        Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        view.destroyDrawingCache();
        view2.setDrawingCacheEnabled(false);
        return copy;
    }

    private static Bitmap b(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f14934a, true, 9560, new Class[]{View.class}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{view2}, null, f14934a, true, 9560, new Class[]{View.class}, Bitmap.class);
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        view2.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view2.draw(canvas);
        return createBitmap;
    }

    public static Bitmap c(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{bitmap2}, null, f14934a, true, 9558, new Class[]{Bitmap.class}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{bitmap2}, null, f14934a, true, 9558, new Class[]{Bitmap.class}, Bitmap.class);
        }
        Matrix matrix = new Matrix();
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        matrix.postScale(-1.0f, 1.0f);
        matrix.postTranslate((float) bitmap.getWidth(), 0.0f);
        canvas.drawBitmap(bitmap2, matrix, null);
        return createBitmap;
    }

    public static Bitmap a(Bitmap bitmap) {
        a aVar;
        Rect rect;
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{bitmap2}, null, f14934a, true, 9556, new Class[]{Bitmap.class}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{bitmap2}, null, f14934a, true, 9556, new Class[]{Bitmap.class}, Bitmap.class);
        }
        try {
            int min = Math.min(bitmap.getWidth(), bitmap.getHeight()) / 2;
            Point point = new Point(bitmap.getWidth() / 2, bitmap.getHeight() / 2);
            if (bitmap.getWidth() > bitmap.getHeight()) {
                aVar = a.HORIZONTAL;
            } else {
                aVar = a.VERTICAL;
            }
            int i = min * 2;
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            Rect rect2 = new Rect(0, 0, i, i);
            RectF rectF = new RectF(new Rect(0, 0, i, i));
            float min2 = (float) (Math.min(bitmap.getWidth(), bitmap.getHeight()) / 2);
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-16777216);
            canvas.drawRoundRect(rectF, min2, min2, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            if (aVar == a.HORIZONTAL) {
                rect = new Rect(point.x - min, 0, point.x + min, i);
            } else {
                rect = new Rect(0, point.y - min, i, point.y + min);
            }
            canvas.drawBitmap(bitmap2, rect, rect2, paint);
            return createBitmap;
        } catch (Exception unused) {
            return bitmap2;
        } catch (OutOfMemoryError unused2) {
            return null;
        }
    }
}
