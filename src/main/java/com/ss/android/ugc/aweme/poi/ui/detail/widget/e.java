package com.ss.android.ugc.aweme.poi.ui.detail.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.RestrictTo;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60783a;

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<Matrix> f60784b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    private static final ThreadLocal<RectF> f60785c = new ThreadLocal<>();

    public static void a(ViewGroup viewGroup, View view, Rect rect) {
        Rect rect2 = rect;
        if (PatchProxy.isSupport(new Object[]{viewGroup, view, rect2}, null, f60783a, true, 66585, new Class[]{ViewGroup.class, View.class, Rect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup, view, rect2}, null, f60783a, true, 66585, new Class[]{ViewGroup.class, View.class, Rect.class}, Void.TYPE);
            return;
        }
        rect2.set(0, 0, view.getWidth(), view.getHeight());
        b(viewGroup, view, rect);
    }

    private static void a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent viewParent2 = viewParent;
        Matrix matrix2 = matrix;
        if (PatchProxy.isSupport(new Object[]{viewParent2, view, matrix2}, null, f60783a, true, 66586, new Class[]{ViewParent.class, View.class, Matrix.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewParent2, view, matrix2}, null, f60783a, true, 66586, new Class[]{ViewParent.class, View.class, Matrix.class}, Void.TYPE);
            return;
        }
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent2) {
            View view2 = (View) parent;
            a(viewParent2, view2, matrix2);
            matrix2.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix2.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix2.preConcat(view.getMatrix());
        }
    }

    private static void b(ViewGroup viewGroup, View view, Rect rect) {
        ViewGroup viewGroup2 = viewGroup;
        View view2 = view;
        Rect rect2 = rect;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, view2, rect2}, null, f60783a, true, 66584, new Class[]{ViewGroup.class, View.class, Rect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2, view2, rect2}, null, f60783a, true, 66584, new Class[]{ViewGroup.class, View.class, Rect.class}, Void.TYPE);
            return;
        }
        Matrix matrix = f60784b.get();
        if (matrix == null) {
            matrix = new Matrix();
            f60784b.set(matrix);
        } else {
            matrix.reset();
        }
        a((ViewParent) viewGroup2, view2, matrix);
        RectF rectF = f60785c.get();
        if (rectF == null) {
            rectF = new RectF();
            f60785c.set(rectF);
        }
        rectF.set(rect2);
        matrix.mapRect(rectF);
        rect2.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
