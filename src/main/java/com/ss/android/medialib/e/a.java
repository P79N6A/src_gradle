package com.ss.android.medialib.e;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29648a;

    public static void a(int i, Rect rect, Rect rect2) {
        Rect rect3 = rect;
        Rect rect4 = rect2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), rect3, rect4}, null, f29648a, true, 17767, new Class[]{Integer.TYPE, Rect.class, Rect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), rect3, rect4}, null, f29648a, true, 17767, new Class[]{Integer.TYPE, Rect.class, Rect.class}, Void.TYPE);
            return;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate((float) (-i));
        RectF rectF = new RectF(rect3);
        RectF rectF2 = new RectF(rect4);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        matrix.reset();
        matrix.setTranslate(-rectF.left, -rectF.top);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        rect3.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        rect4.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
    }
}
