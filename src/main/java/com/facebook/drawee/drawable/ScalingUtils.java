package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import javax.annotation.Nullable;

public class ScalingUtils {

    public interface ScaleType {
        public static final ScaleType CENTER = c.f23704a;
        public static final ScaleType CENTER_CROP = d.f23705a;
        public static final ScaleType CENTER_INSIDE = e.f23706a;
        public static final ScaleType FIT_BOTTOM_START = f.f23707a;
        public static final ScaleType FIT_CENTER = g.f23708a;
        public static final ScaleType FIT_END = h.f23709a;
        public static final ScaleType FIT_START = i.f23710a;
        public static final ScaleType FIT_XY = j.f23711a;
        public static final ScaleType FOCUS_CROP = k.f23712a;

        Matrix getTransform(Matrix matrix, Rect rect, int i, int i2, float f2, float f3);
    }

    public static abstract class a implements ScaleType {
        public abstract void a(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5);

        public Matrix getTransform(Matrix matrix, Rect rect, int i, int i2, float f2, float f3) {
            int i3 = i;
            int i4 = i2;
            a(matrix, rect, i3, i4, f2, f3, ((float) rect.width()) / ((float) i3), ((float) rect.height()) / ((float) i4));
            return matrix;
        }
    }

    public static class b implements ScaleType, l {

        /* renamed from: a  reason: collision with root package name */
        public final ScaleType f23698a;

        /* renamed from: b  reason: collision with root package name */
        public final ScaleType f23699b;
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public final Rect f23700c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public final Rect f23701d;
        @Nullable

        /* renamed from: e  reason: collision with root package name */
        public final PointF f23702e;
        @Nullable

        /* renamed from: f  reason: collision with root package name */
        public final PointF f23703f;
        public float g;
        private final float[] h = new float[9];
        private final float[] i = new float[9];
        private final float[] j = new float[9];

        public final Object a() {
            return Float.valueOf(this.g);
        }

        public final String toString() {
            return String.format("InterpolatingScaleType(%s (%s) -> %s (%s))", new Object[]{String.valueOf(this.f23698a), String.valueOf(this.f23702e), String.valueOf(this.f23699b), String.valueOf(this.f23703f)});
        }

        public b(ScaleType scaleType, ScaleType scaleType2, @Nullable Rect rect, @Nullable Rect rect2, @Nullable PointF pointF, @Nullable PointF pointF2) {
            this.f23698a = scaleType;
            this.f23699b = scaleType2;
            this.f23700c = rect;
            this.f23701d = rect2;
            this.f23702e = pointF;
            this.f23703f = pointF2;
        }

        public final Matrix getTransform(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3) {
            Rect rect2;
            Rect rect3;
            float f4;
            float f5;
            float f6;
            float f7;
            Matrix matrix2 = matrix;
            if (this.f23700c != null) {
                rect2 = this.f23700c;
            } else {
                rect2 = rect;
            }
            if (this.f23701d != null) {
                rect3 = this.f23701d;
            } else {
                rect3 = rect;
            }
            ScaleType scaleType = this.f23698a;
            if (this.f23702e == null) {
                f4 = f2;
            } else {
                f4 = this.f23702e.x;
            }
            if (this.f23702e == null) {
                f5 = f3;
            } else {
                f5 = this.f23702e.y;
            }
            scaleType.getTransform(matrix, rect2, i2, i3, f4, f5);
            matrix.getValues(this.h);
            ScaleType scaleType2 = this.f23699b;
            if (this.f23703f == null) {
                f6 = f2;
            } else {
                f6 = this.f23703f.x;
            }
            if (this.f23703f == null) {
                f7 = f3;
            } else {
                f7 = this.f23703f.y;
            }
            scaleType2.getTransform(matrix, rect3, i2, i3, f6, f7);
            matrix.getValues(this.i);
            for (int i4 = 0; i4 < 9; i4++) {
                this.j[i4] = (this.h[i4] * (1.0f - this.g)) + (this.i[i4] * this.g);
            }
            matrix.setValues(this.j);
            return matrix2;
        }
    }

    static class c extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final ScaleType f23704a = new c();

        public final String toString() {
            return "center";
        }

        private c() {
        }

        public final void a(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
            matrix.setTranslate((float) ((int) (((float) rect.left) + (((float) (rect.width() - i)) * 0.5f) + 0.5f)), (float) ((int) (((float) rect.top) + (((float) (rect.height() - i2)) * 0.5f) + 0.5f)));
        }
    }

    static class d extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final ScaleType f23705a = new d();

        public final String toString() {
            return "center_crop";
        }

        private d() {
        }

        public final void a(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
            float f6;
            float f7;
            if (f5 > f4) {
                f7 = (float) rect.top;
                f6 = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * f5)) * 0.5f);
                f4 = f5;
            } else {
                f6 = (float) rect.left;
                f7 = ((((float) rect.height()) - (((float) i2) * f4)) * 0.5f) + ((float) rect.top);
            }
            matrix.setScale(f4, f4);
            matrix.postTranslate((float) ((int) (f6 + 0.5f)), (float) ((int) (f7 + 0.5f)));
        }
    }

    static class e extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final ScaleType f23706a = new e();

        public final String toString() {
            return "center_inside";
        }

        private e() {
        }

        public final void a(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
            float min = Math.min(Math.min(f4, f5), 1.0f);
            float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * min)) * 0.5f);
            float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }
    }

    static class f extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final ScaleType f23707a = new f();

        public final String toString() {
            return "fit_bottom_start";
        }

        private f() {
        }

        public final void a(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
            float min = Math.min(f4, f5);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (((float) rect.top) + (((float) rect.height()) - (((float) i2) * min)) + 0.5f)));
        }
    }

    static class g extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final ScaleType f23708a = new g();

        public final String toString() {
            return "fit_center";
        }

        private g() {
        }

        public final void a(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
            float min = Math.min(f4, f5);
            float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * min)) * 0.5f);
            float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }
    }

    static class h extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final ScaleType f23709a = new h();

        public final String toString() {
            return "fit_end";
        }

        private h() {
        }

        public final void a(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
            float min = Math.min(f4, f5);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (((float) rect.left) + (((float) rect.width()) - (((float) i) * min)) + 0.5f)), (float) ((int) (((float) rect.top) + (((float) rect.height()) - (((float) i2) * min)) + 0.5f)));
        }
    }

    static class i extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final ScaleType f23710a = new i();

        public final String toString() {
            return "fit_start";
        }

        private i() {
        }

        public final void a(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
            float min = Math.min(f4, f5);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (((float) rect.top) + 0.5f)));
        }
    }

    static class j extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final ScaleType f23711a = new j();

        public final String toString() {
            return "fit_xy";
        }

        private j() {
        }

        public final void a(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
            matrix.setScale(f4, f5);
            matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (((float) rect.top) + 0.5f)));
        }
    }

    static class k extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final ScaleType f23712a = new k();

        public final String toString() {
            return "focus_crop";
        }

        private k() {
        }

        public final void a(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
            float f6;
            float f7;
            if (f5 > f4) {
                float f8 = ((float) i) * f5;
                f6 = ((float) rect.left) + Math.max(Math.min((((float) rect.width()) * 0.5f) - (f2 * f8), 0.0f), ((float) rect.width()) - f8);
                f7 = (float) rect.top;
                f4 = f5;
            } else {
                f6 = (float) rect.left;
                float f9 = ((float) i2) * f4;
                f7 = Math.max(Math.min((((float) rect.height()) * 0.5f) - (f3 * f9), 0.0f), ((float) rect.height()) - f9) + ((float) rect.top);
            }
            matrix.setScale(f4, f4);
            matrix.postTranslate((float) ((int) (f6 + 0.5f)), (float) ((int) (f7 + 0.5f)));
        }
    }

    public interface l {
        Object a();
    }

    @Nullable
    public static ScaleTypeDrawable getActiveScaleTypeDrawable(Drawable drawable) {
        while (drawable != null) {
            if (drawable instanceof ScaleTypeDrawable) {
                return (ScaleTypeDrawable) drawable;
            }
            if (drawable instanceof DrawableParent) {
                drawable = ((DrawableParent) drawable).getDrawable();
            } else {
                if (drawable instanceof a) {
                    a aVar = (a) drawable;
                    int numberOfLayers = aVar.getNumberOfLayers();
                    for (int i2 = 0; i2 < numberOfLayers; i2++) {
                        ScaleTypeDrawable activeScaleTypeDrawable = getActiveScaleTypeDrawable(aVar.getDrawable(i2));
                        if (activeScaleTypeDrawable != null) {
                            return activeScaleTypeDrawable;
                        }
                    }
                }
                return null;
            }
        }
        return null;
    }
}
