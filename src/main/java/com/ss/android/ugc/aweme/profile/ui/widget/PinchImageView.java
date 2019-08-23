package com.ss.android.ugc.aweme.profile.ui.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

public class PinchImageView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63022a;

    /* renamed from: b  reason: collision with root package name */
    boolean f63023b;

    /* renamed from: c  reason: collision with root package name */
    Rect f63024c;

    /* renamed from: d  reason: collision with root package name */
    public View.OnClickListener f63025d;

    /* renamed from: e  reason: collision with root package name */
    public View.OnLongClickListener f63026e;

    /* renamed from: f  reason: collision with root package name */
    public Matrix f63027f = new Matrix();
    public RectF g;
    public int h = 0;
    public f i;
    a j;
    private List<Object> k;
    private List<Object> l;
    private int m;
    private PointF n = new PointF();
    private PointF o = new PointF();
    private float p = 0.0f;
    private GestureDetector q = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63028a;

        public final void onLongPress(MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f63028a, false, 69739, new Class[]{MotionEvent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f63028a, false, 69739, new Class[]{MotionEvent.class}, Void.TYPE);
                return;
            }
            if (PinchImageView.this.f63026e != null) {
                PinchImageView.this.f63026e.onLongClick(PinchImageView.this);
            }
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f63028a, false, 69741, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f63028a, false, 69741, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            if (PinchImageView.this.f63025d != null) {
                PinchImageView.this.f63025d.onClick(PinchImageView.this);
            }
            return true;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            float f2;
            int width;
            float f3;
            int height;
            int width2;
            int height2;
            float f4;
            float f5;
            float f6;
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f63028a, false, 69740, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f63028a, false, 69740, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            if (PinchImageView.this.h == 1 && (PinchImageView.this.i == null || !PinchImageView.this.i.isRunning())) {
                PinchImageView pinchImageView = PinchImageView.this;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(x), Float.valueOf(y)}, pinchImageView, PinchImageView.f63022a, false, 69733, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
                    PinchImageView pinchImageView2 = pinchImageView;
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(x), Float.valueOf(y)}, pinchImageView2, PinchImageView.f63022a, false, 69733, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
                } else if (pinchImageView.b()) {
                    Matrix a2 = b.a();
                    pinchImageView.a(a2);
                    float f7 = b.c(a2)[0];
                    float f8 = b.c(pinchImageView.f63027f)[0];
                    float f9 = f7 * f8;
                    if (pinchImageView.f63023b) {
                        f2 = (float) pinchImageView.f63024c.left;
                    } else {
                        f2 = 0.0f;
                    }
                    if (pinchImageView.f63023b) {
                        width = pinchImageView.f63024c.right;
                    } else {
                        width = pinchImageView.getWidth();
                    }
                    float f10 = (float) width;
                    if (pinchImageView.f63023b) {
                        f3 = (float) pinchImageView.f63024c.top;
                    } else {
                        f3 = 0.0f;
                    }
                    if (pinchImageView.f63023b) {
                        height = pinchImageView.f63024c.bottom;
                    } else {
                        height = pinchImageView.getHeight();
                    }
                    float f11 = (float) height;
                    if (pinchImageView.f63023b) {
                        width2 = pinchImageView.f63024c.width();
                    } else {
                        width2 = pinchImageView.getWidth();
                    }
                    float f12 = (float) width2;
                    if (pinchImageView.f63023b) {
                        height2 = pinchImageView.f63024c.height();
                    } else {
                        height2 = pinchImageView.getHeight();
                    }
                    float f13 = (float) height2;
                    float maxScale = pinchImageView.getMaxScale();
                    Object[] objArr = {Float.valueOf(f7), Float.valueOf(f8)};
                    ChangeQuickRedirect changeQuickRedirect = PinchImageView.f63022a;
                    Class[] clsArr = {Float.TYPE, Float.TYPE};
                    if (PatchProxy.isSupport(objArr, pinchImageView, changeQuickRedirect, false, 69725, clsArr, Float.TYPE)) {
                        PinchImageView pinchImageView3 = pinchImageView;
                        f4 = ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f7), Float.valueOf(f8)}, pinchImageView3, PinchImageView.f63022a, false, 69725, new Class[]{Float.TYPE, Float.TYPE}, Float.TYPE)).floatValue();
                    } else if (f9 < pinchImageView.getMaxScale()) {
                        f4 = pinchImageView.getMaxScale();
                    } else {
                        f4 = f7;
                    }
                    if (f4 > maxScale) {
                        f4 = maxScale;
                    }
                    if (f4 < f7) {
                        f4 = f7;
                    }
                    Matrix a3 = b.a(pinchImageView.f63027f);
                    float f14 = f4 / f9;
                    a3.postScale(f14, f14, x, y);
                    float f15 = f12 / 2.0f;
                    float f16 = f13 / 2.0f;
                    a3.postTranslate(f15 - x, f16 - y);
                    Matrix a4 = b.a(a2);
                    a4.postConcat(a3);
                    RectF a5 = b.a(0.0f, 0.0f, (float) pinchImageView.getDrawable().getIntrinsicWidth(), (float) pinchImageView.getDrawable().getIntrinsicHeight());
                    a4.mapRect(a5);
                    if (a5.right - a5.left < f12) {
                        f5 = f15 - ((a5.right + a5.left) / 2.0f);
                    } else if (a5.left > f2) {
                        f5 = f2 - a5.left;
                    } else if (a5.right < f10) {
                        f5 = f10 - a5.right;
                    } else {
                        f5 = 0.0f;
                    }
                    if (a5.bottom - a5.top < f13) {
                        f6 = f16 - ((a5.bottom + a5.top) / 2.0f);
                    } else if (a5.top > f3) {
                        f6 = f3 - a5.top;
                    } else if (a5.bottom < f11) {
                        f6 = f11 - a5.bottom;
                    } else {
                        f6 = 0.0f;
                    }
                    a3.postTranslate(f5, f6);
                    pinchImageView.c();
                    pinchImageView.i = new f(pinchImageView, pinchImageView.f63027f, a3);
                    pinchImageView.i.start();
                    b.a(a5);
                    b.b(a4);
                    b.b(a3);
                    b.b(a2);
                }
            }
            return true;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f63028a, false, 69738, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f63028a, false, 69738, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
            }
            if (PinchImageView.this.h == 0 && (PinchImageView.this.i == null || !PinchImageView.this.i.isRunning())) {
                PinchImageView pinchImageView = PinchImageView.this;
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, pinchImageView, PinchImageView.f63022a, false, 69736, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
                    PinchImageView pinchImageView2 = pinchImageView;
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, pinchImageView2, PinchImageView.f63022a, false, 69736, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
                } else if (pinchImageView.b()) {
                    pinchImageView.c();
                    pinchImageView.j = new a(f2 / 60.0f, f3 / 60.0f);
                    pinchImageView.j.start();
                }
            }
            return true;
        }
    });

    class a extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63030a;

        /* renamed from: c  reason: collision with root package name */
        private float[] f63032c;

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f63030a, false, 69742, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f63030a, false, 69742, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            boolean a2 = PinchImageView.this.a(this.f63032c[0], this.f63032c[1]);
            float[] fArr = this.f63032c;
            fArr[0] = fArr[0] * 0.9f;
            float[] fArr2 = this.f63032c;
            fArr2[1] = fArr2[1] * 0.9f;
            if (!a2 || b.b(0.0f, 0.0f, this.f63032c[0], this.f63032c[1]) < 1.0f) {
                valueAnimator.cancel();
            }
        }

        a(float f2, float f3) {
            setFloatValues(new float[]{0.0f, 1.0f});
            setDuration(1000000);
            addUpdateListener(this);
            this.f63032c = new float[]{f2, f3};
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63033a;

        /* renamed from: b  reason: collision with root package name */
        private static c f63034b = new c(16);

        /* renamed from: c  reason: collision with root package name */
        private static e f63035c = new e(16);

        public static Matrix a() {
            if (PatchProxy.isSupport(new Object[0], null, f63033a, true, 69744, new Class[0], Matrix.class)) {
                return (Matrix) PatchProxy.accessDispatch(new Object[0], null, f63033a, true, 69744, new Class[0], Matrix.class);
            }
            return (Matrix) f63034b.b();
        }

        public static RectF b() {
            if (PatchProxy.isSupport(new Object[0], null, f63033a, true, 69747, new Class[0], RectF.class)) {
                return (RectF) PatchProxy.accessDispatch(new Object[0], null, f63033a, true, 69747, new Class[0], RectF.class);
            }
            return (RectF) f63035c.b();
        }

        public static Matrix a(Matrix matrix) {
            Matrix matrix2 = matrix;
            if (PatchProxy.isSupport(new Object[]{matrix2}, null, f63033a, true, 69745, new Class[]{Matrix.class}, Matrix.class)) {
                return (Matrix) PatchProxy.accessDispatch(new Object[]{matrix2}, null, f63033a, true, 69745, new Class[]{Matrix.class}, Matrix.class);
            }
            Matrix matrix3 = (Matrix) f63034b.b();
            if (matrix2 != null) {
                matrix3.set(matrix2);
            }
            return matrix3;
        }

        public static void b(Matrix matrix) {
            Matrix matrix2 = matrix;
            if (PatchProxy.isSupport(new Object[]{matrix2}, null, f63033a, true, 69746, new Class[]{Matrix.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{matrix2}, null, f63033a, true, 69746, new Class[]{Matrix.class}, Void.TYPE);
                return;
            }
            f63034b.b(matrix2);
        }

        public static float[] c(Matrix matrix) {
            Matrix matrix2 = matrix;
            if (PatchProxy.isSupport(new Object[]{matrix2}, null, f63033a, true, 69752, new Class[]{Matrix.class}, float[].class)) {
                return (float[]) PatchProxy.accessDispatch(new Object[]{matrix2}, null, f63033a, true, 69752, new Class[]{Matrix.class}, float[].class);
            } else if (matrix2 == null) {
                return new float[2];
            } else {
                float[] fArr = new float[9];
                matrix2.getValues(fArr);
                return new float[]{fArr[0], fArr[4]};
            }
        }

        public static void a(RectF rectF) {
            RectF rectF2 = rectF;
            if (PatchProxy.isSupport(new Object[]{rectF2}, null, f63033a, true, 69750, new Class[]{RectF.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{rectF2}, null, f63033a, true, 69750, new Class[]{RectF.class}, Void.TYPE);
                return;
            }
            f63035c.b(rectF2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static float[] a(float[] r19, android.graphics.Matrix r20) {
            /*
                r0 = r19
                r1 = r20
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r10 = 0
                r3[r10] = r0
                r11 = 1
                r3[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r5 = f63033a
                java.lang.Class[] r8 = new java.lang.Class[r2]
                java.lang.Class<float[]> r4 = float[].class
                r8[r10] = r4
                java.lang.Class<android.graphics.Matrix> r4 = android.graphics.Matrix.class
                r8[r11] = r4
                java.lang.Class<float[]> r9 = float[].class
                r4 = 0
                r6 = 1
                r7 = 69753(0x11079, float:9.7745E-41)
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                if (r3 == 0) goto L_0x0048
                java.lang.Object[] r12 = new java.lang.Object[r2]
                r12[r10] = r0
                r12[r11] = r1
                r13 = 0
                com.meituan.robust.ChangeQuickRedirect r14 = f63033a
                r15 = 1
                r16 = 69753(0x11079, float:9.7745E-41)
                java.lang.Class[] r0 = new java.lang.Class[r2]
                java.lang.Class<float[]> r1 = float[].class
                r0[r10] = r1
                java.lang.Class<android.graphics.Matrix> r1 = android.graphics.Matrix.class
                r0[r11] = r1
                java.lang.Class<float[]> r18 = float[].class
                r17 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                float[] r0 = (float[]) r0
                return r0
            L_0x0048:
                if (r0 == 0) goto L_0x005c
                if (r1 == 0) goto L_0x005c
                float[] r2 = new float[r2]
                android.graphics.Matrix r3 = a()
                r1.invert(r3)
                r3.mapPoints(r2, r0)
                b(r3)
                return r2
            L_0x005c:
                float[] r0 = new float[r2]
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView.b.a(float[], android.graphics.Matrix):float[]");
        }

        public static float[] c(float f2, float f3, float f4, float f5) {
            return new float[]{(f2 + f4) / 2.0f, (f3 + f5) / 2.0f};
        }

        public static RectF a(float f2, float f3, float f4, float f5) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(f4), Float.valueOf(f5)}, null, f63033a, true, 69748, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, RectF.class)) {
                return (RectF) PatchProxy.accessDispatch(new Object[]{Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(f4), Float.valueOf(f5)}, null, f63033a, true, 69748, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, RectF.class);
            }
            RectF rectF = (RectF) f63035c.b();
            rectF.set(0.0f, 0.0f, f4, f5);
            return rectF;
        }

        public static float b(float f2, float f3, float f4, float f5) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, null, f63033a, true, 69751, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Float.TYPE)) {
                return ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, null, f63033a, true, 69751, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Float.TYPE)).floatValue();
            }
            float f6 = f2 - f4;
            float f7 = f3 - f5;
            return (float) Math.sqrt((double) ((f6 * f6) + (f7 * f7)));
        }
    }

    static class c extends d<Matrix> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63036a;

        /* access modifiers changed from: private */
        /* renamed from: c */
        public Matrix a() {
            if (!PatchProxy.isSupport(new Object[0], this, f63036a, false, 69756, new Class[0], Matrix.class)) {
                return new Matrix();
            }
            return (Matrix) PatchProxy.accessDispatch(new Object[0], this, f63036a, false, 69756, new Class[0], Matrix.class);
        }

        c(int i) {
            super(16);
        }

        public final /* synthetic */ Object a(Object obj) {
            Matrix matrix = (Matrix) obj;
            if (PatchProxy.isSupport(new Object[]{matrix}, this, f63036a, false, 69757, new Class[]{Matrix.class}, Matrix.class)) {
                return (Matrix) PatchProxy.accessDispatch(new Object[]{matrix}, this, f63036a, false, 69757, new Class[]{Matrix.class}, Matrix.class);
            } else if (matrix == null) {
                return a();
            } else {
                matrix.reset();
                return matrix;
            }
        }
    }

    static abstract class d<T> {

        /* renamed from: b  reason: collision with root package name */
        public static ChangeQuickRedirect f63037b;

        /* renamed from: a  reason: collision with root package name */
        private int f63038a;

        /* renamed from: c  reason: collision with root package name */
        private Queue<T> f63039c = new LinkedList();

        public abstract T a();

        public abstract T a(T t);

        public final T b() {
            if (PatchProxy.isSupport(new Object[0], this, f63037b, false, 69758, new Class[0], Object.class)) {
                return PatchProxy.accessDispatch(new Object[0], this, f63037b, false, 69758, new Class[0], Object.class);
            } else if (this.f63039c.size() == 0) {
                return a();
            } else {
                try {
                    return a(this.f63039c.poll());
                } catch (NoSuchElementException unused) {
                    return a();
                }
            }
        }

        d(int i) {
            this.f63038a = i;
        }

        public final void b(T t) {
            if (PatchProxy.isSupport(new Object[]{t}, this, f63037b, false, 69759, new Class[]{Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{t}, this, f63037b, false, 69759, new Class[]{Object.class}, Void.TYPE);
                return;
            }
            if (t != null && this.f63039c.size() < this.f63038a) {
                this.f63039c.offer(t);
            }
        }
    }

    static class e extends d<RectF> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63040a;

        /* access modifiers changed from: private */
        /* renamed from: c */
        public RectF a() {
            if (!PatchProxy.isSupport(new Object[0], this, f63040a, false, 69760, new Class[0], RectF.class)) {
                return new RectF();
            }
            return (RectF) PatchProxy.accessDispatch(new Object[0], this, f63040a, false, 69760, new Class[0], RectF.class);
        }

        e(int i) {
            super(16);
        }

        public final /* synthetic */ Object a(Object obj) {
            RectF rectF = (RectF) obj;
            if (PatchProxy.isSupport(new Object[]{rectF}, this, f63040a, false, 69761, new Class[]{RectF.class}, RectF.class)) {
                return (RectF) PatchProxy.accessDispatch(new Object[]{rectF}, this, f63040a, false, 69761, new Class[]{RectF.class}, RectF.class);
            } else if (rectF == null) {
                return a();
            } else {
                rectF.setEmpty();
                return rectF;
            }
        }
    }

    class f extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63041a;

        /* renamed from: c  reason: collision with root package name */
        private float[] f63043c;

        /* renamed from: d  reason: collision with root package name */
        private float[] f63044d;

        /* renamed from: e  reason: collision with root package name */
        private float[] f63045e;

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f63041a, false, 69762, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f63041a, false, 69762, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            for (int i = 0; i < 9; i++) {
                this.f63045e[i] = this.f63043c[i] + ((this.f63044d[i] - this.f63043c[i]) * floatValue);
            }
            PinchImageView.this.f63027f.setValues(this.f63045e);
            PinchImageView.this.a();
            PinchImageView.this.invalidate();
        }

        f(PinchImageView pinchImageView, Matrix matrix, Matrix matrix2) {
            this(matrix, matrix2, 200);
        }

        private f(Matrix matrix, Matrix matrix2, long j) {
            this.f63043c = new float[9];
            this.f63044d = new float[9];
            this.f63045e = new float[9];
            setFloatValues(new float[]{0.0f, 1.0f});
            setDuration(200);
            addUpdateListener(this);
            matrix.getValues(this.f63043c);
            matrix2.getValues(this.f63044d);
        }
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public int getPinchMode() {
        return this.h;
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f63022a, false, 69726, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63022a, false, 69726, new Class[0], Void.TYPE);
            return;
        }
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f63022a, false, 69737, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63022a, false, 69737, new Class[0], Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.i.cancel();
            this.i = null;
        }
        if (this.j != null) {
            this.j.cancel();
            this.j = null;
        }
    }

    public RectF getMask() {
        if (PatchProxy.isSupport(new Object[0], this, f63022a, false, 69715, new Class[0], RectF.class)) {
            return (RectF) PatchProxy.accessDispatch(new Object[0], this, f63022a, false, 69715, new Class[0], RectF.class);
        } else if (this.g != null) {
            return new RectF(this.g);
        } else {
            return null;
        }
    }

    public float getMaxScale() {
        float f2;
        if (PatchProxy.isSupport(new Object[0], this, f63022a, false, 69724, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f63022a, false, 69724, new Class[0], Float.TYPE)).floatValue();
        }
        if (!b()) {
            f2 = 4.0f;
        } else if (((float) getDrawable().getIntrinsicWidth()) / ((float) getDrawable().getIntrinsicHeight()) < ((float) getWidth()) / ((float) getHeight())) {
            f2 = ((float) getWidth()) / ((float) getDrawable().getIntrinsicWidth());
        } else {
            f2 = ((float) getHeight()) / ((float) getDrawable().getIntrinsicHeight());
        }
        return Math.max(f2, 4.0f);
    }

    private float getMinScale() {
        if (PatchProxy.isSupport(new Object[0], this, f63022a, false, 69735, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f63022a, false, 69735, new Class[0], Float.TYPE)).floatValue();
        } else if (!b() || this.f63024c == null) {
            return 1.0f;
        } else {
            float intrinsicWidth = ((float) getDrawable().getIntrinsicWidth()) / ((float) getDrawable().getIntrinsicHeight());
            float width = ((float) getWidth()) / ((float) getHeight());
            if (intrinsicWidth >= ((float) this.f63024c.width()) / ((float) this.f63024c.height()) && intrinsicWidth >= width) {
                return ((float) this.f63024c.height()) / (((float) getWidth()) / intrinsicWidth);
            }
            return (((float) this.f63024c.width()) / ((float) getWidth())) * (((float) getWidth()) / (b.c(a((Matrix) null))[0] * ((float) getDrawable().getIntrinsicWidth())));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f63022a, false, 69728, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63022a, false, 69728, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (getDrawable() == null || getDrawable().getIntrinsicWidth() <= 0 || getDrawable().getIntrinsicHeight() <= 0 || getWidth() <= 0 || getHeight() <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f63022a, false, 69723, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63022a, false, 69723, new Class[0], Void.TYPE);
        } else if (this.k != null) {
            this.m++;
            Iterator<Object> it2 = this.k.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            this.m--;
            if (this.m == 0 && this.l != null) {
                this.k = this.l;
                this.l = null;
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f63025d = onClickListener;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f63026e = onLongClickListener;
    }

    public void setDisplayWindowRect(Rect rect) {
        this.f63024c = rect;
        if (rect != null) {
            this.f63023b = true;
        }
    }

    public PinchImageView(Context context) {
        super(context);
        d();
    }

    private Matrix b(Matrix matrix) {
        if (PatchProxy.isSupport(new Object[]{matrix}, this, f63022a, false, 69713, new Class[]{Matrix.class}, Matrix.class)) {
            return (Matrix) PatchProxy.accessDispatch(new Object[]{matrix}, this, f63022a, false, 69713, new Class[]{Matrix.class}, Matrix.class);
        }
        Matrix a2 = a(matrix);
        a2.postConcat(this.f63027f);
        return a2;
    }

    public final Matrix a(Matrix matrix) {
        Matrix matrix2;
        if (PatchProxy.isSupport(new Object[]{matrix}, this, f63022a, false, 69712, new Class[]{Matrix.class}, Matrix.class)) {
            return (Matrix) PatchProxy.accessDispatch(new Object[]{matrix}, this, f63022a, false, 69712, new Class[]{Matrix.class}, Matrix.class);
        }
        if (matrix == null) {
            matrix2 = new Matrix();
        } else {
            matrix.reset();
            matrix2 = matrix;
        }
        if (b()) {
            RectF a2 = b.a(0.0f, 0.0f, (float) getDrawable().getIntrinsicWidth(), (float) getDrawable().getIntrinsicHeight());
            RectF a3 = b.a(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            matrix2.setRectToRect(a2, a3, Matrix.ScaleToFit.CENTER);
            b.a(a3);
            b.a(a2);
        }
        return matrix2;
    }

    public boolean canScrollHorizontally(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f63022a, false, 69716, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f63022a, false, 69716, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.h == 2) {
            return true;
        } else {
            RectF a2 = a((RectF) null);
            if (a2 == null || a2.isEmpty()) {
                return false;
            }
            if (i2 > 0) {
                if (a2.right > ((float) getWidth())) {
                    return true;
                }
                return false;
            } else if (a2.left < 0.0f) {
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean canScrollVertically(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f63022a, false, 69717, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f63022a, false, 69717, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.h == 2) {
            return true;
        } else {
            RectF a2 = a((RectF) null);
            if (a2 == null || a2.isEmpty()) {
                return false;
            }
            if (i2 > 0) {
                if (a2.bottom > ((float) getHeight())) {
                    return true;
                }
                return false;
            } else if (a2.top < 0.0f) {
                return true;
            } else {
                return false;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f63022a, false, 69727, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f63022a, false, 69727, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        if (b()) {
            Matrix a2 = b.a();
            setImageMatrix(b(a2));
            b.b(a2);
        }
        if (this.g != null) {
            canvas.save();
            canvas.clipRect(this.g);
            super.onDraw(canvas);
            canvas.restore();
            return;
        }
        super.onDraw(canvas);
    }

    public final RectF a(RectF rectF) {
        RectF rectF2;
        if (PatchProxy.isSupport(new Object[]{rectF}, this, f63022a, false, 69714, new Class[]{RectF.class}, RectF.class)) {
            return (RectF) PatchProxy.accessDispatch(new Object[]{rectF}, this, f63022a, false, 69714, new Class[]{RectF.class}, RectF.class);
        }
        if (rectF == null) {
            rectF2 = new RectF();
        } else {
            rectF.setEmpty();
            rectF2 = rectF;
        }
        if (!b()) {
            return rectF2;
        }
        Matrix a2 = b.a();
        b(a2);
        rectF2.set(0.0f, 0.0f, (float) getDrawable().getIntrinsicWidth(), (float) getDrawable().getIntrinsicHeight());
        a2.mapRect(rectF2);
        b.b(a2);
        return rectF2;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f2;
        int width;
        float f3;
        int height;
        int width2;
        int height2;
        float f4;
        boolean z;
        float f5;
        float f6;
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f63022a, false, 69729, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f63022a, false, 69729, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        super.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            if (this.h == 2) {
                if (PatchProxy.isSupport(new Object[0], this, f63022a, false, 69734, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f63022a, false, 69734, new Class[0], Void.TYPE);
                } else if (b()) {
                    Matrix a2 = b.a();
                    b(a2);
                    float f7 = b.c(a2)[0];
                    float f8 = b.c(this.f63027f)[0];
                    if (this.f63023b) {
                        f2 = (float) this.f63024c.left;
                    } else {
                        f2 = 0.0f;
                    }
                    if (this.f63023b) {
                        width = this.f63024c.right;
                    } else {
                        width = getWidth();
                    }
                    float f9 = (float) width;
                    if (this.f63023b) {
                        f3 = (float) this.f63024c.top;
                    } else {
                        f3 = 0.0f;
                    }
                    if (this.f63023b) {
                        height = this.f63024c.bottom;
                    } else {
                        height = getHeight();
                    }
                    float f10 = (float) height;
                    if (this.f63023b) {
                        width2 = this.f63024c.width();
                    } else {
                        width2 = getWidth();
                    }
                    float f11 = (float) width2;
                    if (this.f63023b) {
                        height2 = this.f63024c.height();
                    } else {
                        height2 = getHeight();
                    }
                    float f12 = (float) height2;
                    float maxScale = getMaxScale();
                    if (f7 > maxScale) {
                        f4 = maxScale / f7;
                    } else {
                        f4 = 1.0f;
                    }
                    float minScale = getMinScale();
                    if (f8 * f4 < minScale) {
                        f4 = minScale / f8;
                    }
                    if (f4 != 1.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Matrix a3 = b.a(a2);
                    a3.postScale(f4, f4, this.n.x, this.n.y);
                    RectF a4 = b.a(0.0f, 0.0f, (float) getDrawable().getIntrinsicWidth(), (float) getDrawable().getIntrinsicHeight());
                    a3.mapRect(a4);
                    if (a4.right - a4.left < f11) {
                        f5 = ((f2 + f9) / 2.0f) - ((a4.right + a4.left) / 2.0f);
                    } else if (a4.left > f2) {
                        f5 = f2 - a4.left;
                    } else if (a4.right < f9) {
                        f5 = f9 - a4.right;
                    } else {
                        f5 = 0.0f;
                    }
                    if (a4.bottom - a4.top < f12) {
                        f6 = ((f3 + f10) / 2.0f) - ((a4.bottom + a4.top) / 2.0f);
                    } else if (a4.top > f3) {
                        f6 = f3 - a4.top;
                    } else if (a4.bottom < f10) {
                        f6 = f10 - a4.bottom;
                    } else {
                        f6 = 0.0f;
                    }
                    if (!(f5 == 0.0f && f6 == 0.0f)) {
                        z = true;
                    }
                    if (z) {
                        Matrix a5 = b.a(this.f63027f);
                        a5.postScale(f4, f4, this.n.x, this.n.y);
                        a5.postTranslate(f5, f6);
                        c();
                        this.i = new f(this, this.f63027f, a5);
                        this.i.start();
                        b.b(a5);
                    }
                    b.a(a4);
                    b.b(a3);
                    b.b(a2);
                }
            }
            this.h = 0;
        } else if (action == 6) {
            if (this.h == 2 && motionEvent.getPointerCount() > 2) {
                if ((motionEvent.getAction() >> 8) == 0) {
                    a(motionEvent2.getX(1), motionEvent2.getY(1), motionEvent2.getX(2), motionEvent2.getY(2));
                } else if ((motionEvent.getAction() >> 8) == 1) {
                    a(motionEvent2.getX(0), motionEvent2.getY(0), motionEvent2.getX(2), motionEvent2.getY(2));
                }
            }
        } else if (action == 0) {
            if (this.i == null || !this.i.isRunning()) {
                c();
                this.h = 1;
                this.n.set(motionEvent.getX(), motionEvent.getY());
            }
        } else if (action == 5) {
            c();
            this.h = 2;
            a(motionEvent2.getX(0), motionEvent2.getY(0), motionEvent2.getX(1), motionEvent2.getY(1));
        } else if (action == 2 && (this.i == null || !this.i.isRunning())) {
            if (this.h == 1) {
                a(motionEvent.getX() - this.n.x, motionEvent.getY() - this.n.y);
                this.n.set(motionEvent.getX(), motionEvent.getY());
            } else if (this.h == 2 && motionEvent.getPointerCount() > 1) {
                float b2 = b.b(motionEvent2.getX(0), motionEvent2.getY(0), motionEvent2.getX(1), motionEvent2.getY(1));
                float[] c2 = b.c(motionEvent2.getX(0), motionEvent2.getY(0), motionEvent2.getX(1), motionEvent2.getY(1));
                this.n.set(c2[0], c2[1]);
                PointF pointF = this.o;
                float f13 = this.p;
                PointF pointF2 = this.n;
                PointF pointF3 = pointF2;
                if (PatchProxy.isSupport(new Object[]{pointF, Float.valueOf(f13), Float.valueOf(b2), pointF2}, this, f63022a, false, 69732, new Class[]{PointF.class, Float.TYPE, Float.TYPE, PointF.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{pointF, Float.valueOf(f13), Float.valueOf(b2), pointF3}, this, f63022a, false, 69732, new Class[]{PointF.class, Float.TYPE, Float.TYPE, PointF.class}, Void.TYPE);
                } else {
                    PointF pointF4 = pointF3;
                    if (b()) {
                        float f14 = f13 * b2;
                        Matrix a6 = b.a();
                        a6.postScale(f14, f14, pointF.x, pointF.y);
                        a6.postTranslate(pointF4.x - pointF.x, pointF4.y - pointF.y);
                        this.f63027f.set(a6);
                        b.b(a6);
                        a();
                        invalidate();
                    }
                }
            }
        }
        this.q.onTouchEvent(motionEvent2);
        return true;
    }

    public PinchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(float r14, float r15) {
        /*
            r13 = this;
            r7 = r13
            r8 = 2
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Float r1 = java.lang.Float.valueOf(r14)
            r9 = 0
            r0[r9] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r15)
            r10 = 1
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f63022a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 69730(0x11062, float:9.7713E-41)
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0057
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Float r1 = java.lang.Float.valueOf(r14)
            r0[r9] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r15)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f63022a
            r3 = 0
            r4 = 69730(0x11062, float:9.7713E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r13
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0057:
            boolean r0 = r13.b()
            if (r0 != 0) goto L_0x005e
            return r9
        L_0x005e:
            android.graphics.RectF r0 = com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView.b.b()
            r13.a((android.graphics.RectF) r0)
            boolean r1 = r7.f63023b
            r2 = 0
            if (r1 == 0) goto L_0x0070
            android.graphics.Rect r1 = r7.f63024c
            int r1 = r1.left
            float r1 = (float) r1
            goto L_0x0071
        L_0x0070:
            r1 = 0
        L_0x0071:
            boolean r3 = r7.f63023b
            if (r3 == 0) goto L_0x007b
            android.graphics.Rect r3 = r7.f63024c
            int r3 = r3.right
        L_0x0079:
            float r3 = (float) r3
            goto L_0x0080
        L_0x007b:
            int r3 = r13.getWidth()
            goto L_0x0079
        L_0x0080:
            boolean r4 = r7.f63023b
            if (r4 == 0) goto L_0x008a
            android.graphics.Rect r4 = r7.f63024c
            int r4 = r4.top
            float r4 = (float) r4
            goto L_0x008b
        L_0x008a:
            r4 = 0
        L_0x008b:
            boolean r5 = r7.f63023b
            if (r5 == 0) goto L_0x0095
            android.graphics.Rect r5 = r7.f63024c
            int r5 = r5.bottom
        L_0x0093:
            float r5 = (float) r5
            goto L_0x009a
        L_0x0095:
            int r5 = r13.getHeight()
            goto L_0x0093
        L_0x009a:
            boolean r6 = r7.f63023b
            if (r6 == 0) goto L_0x00a6
            android.graphics.Rect r6 = r7.f63024c
            int r6 = r6.width()
        L_0x00a4:
            float r6 = (float) r6
            goto L_0x00ab
        L_0x00a6:
            int r6 = r13.getWidth()
            goto L_0x00a4
        L_0x00ab:
            boolean r8 = r7.f63023b
            if (r8 == 0) goto L_0x00b7
            android.graphics.Rect r8 = r7.f63024c
            int r8 = r8.height()
        L_0x00b5:
            float r8 = (float) r8
            goto L_0x00bc
        L_0x00b7:
            int r8 = r13.getHeight()
            goto L_0x00b5
        L_0x00bc:
            float r11 = r0.right
            float r12 = r0.left
            float r11 = r11 - r12
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x00ea
            float r6 = r0.left
            float r6 = r6 + r14
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d6
            float r3 = r0.left
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x00ea
            float r3 = r0.left
            float r1 = r1 - r3
            goto L_0x00eb
        L_0x00d6:
            float r1 = r0.right
            float r1 = r1 + r14
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x00e8
            float r1 = r0.right
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x00ea
            float r1 = r0.right
            float r1 = r3 - r1
            goto L_0x00eb
        L_0x00e8:
            r1 = r14
            goto L_0x00eb
        L_0x00ea:
            r1 = 0
        L_0x00eb:
            float r3 = r0.bottom
            float r6 = r0.top
            float r3 = r3 - r6
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x011a
            float r3 = r0.top
            float r3 = r3 + r15
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0106
            float r3 = r0.top
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x011a
            float r3 = r0.top
            float r3 = r4 - r3
            goto L_0x011b
        L_0x0106:
            float r3 = r0.bottom
            float r3 = r3 + r15
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0118
            float r3 = r0.bottom
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x011a
            float r3 = r0.bottom
            float r3 = r5 - r3
            goto L_0x011b
        L_0x0118:
            r3 = r15
            goto L_0x011b
        L_0x011a:
            r3 = 0
        L_0x011b:
            com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView.b.a((android.graphics.RectF) r0)
            android.graphics.Matrix r0 = r7.f63027f
            r0.postTranslate(r1, r3)
            r13.a()
            r13.invalidate()
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0133
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0132
            goto L_0x0133
        L_0x0132:
            return r9
        L_0x0133:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView.a(float, float):boolean");
    }

    public PinchImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        d();
    }

    private void a(float f2, float f3, float f4, float f5) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, f63022a, false, 69731, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, f63022a, false, 69731, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.p = b.c(this.f63027f)[0] / b.b(f2, f3, f4, f5);
        float[] a2 = b.a(b.c(f2, f3, f4, f5), this.f63027f);
        this.o.set(a2[0], a2[1]);
    }
}
