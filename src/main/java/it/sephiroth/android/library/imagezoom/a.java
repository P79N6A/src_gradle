package it.sephiroth.android.library.imagezoom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.ImageView;

public abstract class a extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private float f83392a;

    /* renamed from: b  reason: collision with root package name */
    private float f83393b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f83394c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f83395d;

    /* renamed from: e  reason: collision with root package name */
    private int f83396e;

    /* renamed from: f  reason: collision with root package name */
    private int f83397f;
    private PointF g;
    private boolean h;
    private boolean i;
    private b j;
    private c k;
    protected it.sephiroth.android.library.a.b m;
    protected Matrix n;
    protected Matrix o;
    protected Matrix p;
    protected Handler q;
    protected Runnable r;
    protected boolean s;
    protected final Matrix t;
    protected final float[] u;
    protected C0884a v;
    protected final int w;
    protected RectF x;
    protected RectF y;
    protected RectF z;

    /* renamed from: it.sephiroth.android.library.imagezoom.a$a  reason: collision with other inner class name */
    public enum C0884a {
        NONE,
        FIT_TO_SCREEN,
        FIT_IF_BIGGER
    }

    public interface b {
    }

    public interface c {
    }

    /* access modifiers changed from: protected */
    public void a(float f2) {
    }

    @SuppressLint({"Override"})
    public float getRotation() {
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public PointF getCenter() {
        return this.g;
    }

    public C0884a getDisplayType() {
        return this.v;
    }

    /* access modifiers changed from: protected */
    public void a(Drawable drawable, Matrix matrix, float f2, float f3) {
        if (drawable != null) {
            super.setImageDrawable(drawable);
        } else {
            this.n.reset();
            super.setImageDrawable(null);
        }
        if (f2 == -1.0f || f3 == -1.0f) {
            this.f83393b = -1.0f;
            this.f83392a = -1.0f;
            this.f83395d = false;
            this.f83394c = false;
        } else {
            float min = Math.min(f2, f3);
            float max = Math.max(min, f3);
            this.f83393b = min;
            this.f83392a = max;
            this.f83395d = true;
            this.f83394c = true;
            if (this.v == C0884a.FIT_TO_SCREEN || this.v == C0884a.FIT_IF_BIGGER) {
                if (this.f83393b >= 1.0f) {
                    this.f83395d = false;
                    this.f83393b = -1.0f;
                }
                if (this.f83392a <= 1.0f) {
                    this.f83394c = true;
                    this.f83392a = -1.0f;
                }
            }
        }
        if (matrix != null) {
            this.p = new Matrix(matrix);
        }
        this.i = true;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z2, boolean z3) {
        if (getDrawable() != null) {
            RectF a2 = a(this.o, true, true);
            if (!(a2.left == 0.0f && a2.top == 0.0f)) {
                a(a2.left, a2.top);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(RectF rectF, RectF rectF2) {
        if (rectF != null) {
            if (rectF.top >= 0.0f && rectF.bottom <= ((float) this.f83397f)) {
                rectF2.top = 0.0f;
            }
            if (rectF.left >= 0.0f && rectF.right <= ((float) this.f83396e)) {
                rectF2.left = 0.0f;
            }
            if (rectF.top + rectF2.top >= 0.0f && rectF.bottom > ((float) this.f83397f)) {
                rectF2.top = (float) ((int) (0.0f - rectF.top));
            }
            if (rectF.bottom + rectF2.top <= ((float) (this.f83397f + 0)) && rectF.top < 0.0f) {
                rectF2.top = (float) ((int) (((float) (this.f83397f + 0)) - rectF.bottom));
            }
            if (rectF.left + rectF2.left >= 0.0f) {
                rectF2.left = (float) ((int) (0.0f - rectF.left));
            }
            if (rectF.right + rectF2.left <= ((float) (this.f83396e + 0))) {
                rectF2.left = (float) ((int) (((float) (this.f83396e + 0)) - rectF.right));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(float f2, float f3, float f4, float f5) {
        if (f2 > getMaxScale()) {
            f2 = getMaxScale();
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final float scale = getScale();
        final float f6 = f2 - scale;
        Matrix matrix = new Matrix(this.o);
        matrix.postScale(f2, f2, f3, f4);
        RectF a2 = a(matrix, true, true);
        final float f7 = f3 + (a2.left * f2);
        final float f8 = f4 + (a2.top * f2);
        Handler handler = this.q;
        final float f9 = f5;
        AnonymousClass3 r0 = new Runnable() {
            public final void run() {
                float min = Math.min(f9, (float) (System.currentTimeMillis() - currentTimeMillis));
                a.this.a(scale + ((float) a.this.m.b((double) min, 0.0d, (double) f6, (double) f9)), f7, f8);
                if (min < f9) {
                    a.this.q.post(this);
                    return;
                }
                a.this.a(a.this.getScale());
                a.this.a(true, true);
            }
        };
        handler.post(r0);
    }

    public float getBaseScale() {
        return c(this.n);
    }

    public RectF getBitmapRect() {
        return b(this.o);
    }

    public Matrix getDisplayMatrix() {
        return new Matrix(this.o);
    }

    public Matrix getImageViewMatrix() {
        return a(this.o);
    }

    public float getScale() {
        return c(this.o);
    }

    public float getMaxScale() {
        float f2;
        if (this.f83392a == -1.0f) {
            Drawable drawable = getDrawable();
            if (drawable == null) {
                f2 = 1.0f;
            } else {
                f2 = Math.max(((float) drawable.getIntrinsicWidth()) / ((float) this.f83396e), ((float) drawable.getIntrinsicHeight()) / ((float) this.f83397f)) * 8.0f;
            }
            this.f83392a = f2;
        }
        return this.f83392a;
    }

    public float getMinScale() {
        if (this.f83393b == -1.0f) {
            float f2 = 1.0f;
            if (getDrawable() != null) {
                f2 = Math.min(1.0f, 1.0f / c(this.n));
            }
            this.f83393b = f2;
        }
        return this.f83393b;
    }

    public final void a() {
        this.o = new Matrix();
        float a2 = a(this.v);
        setImageMatrix(getImageViewMatrix());
        if (a2 != getScale()) {
            b(a2);
        }
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void setMaxScale(float f2) {
        this.f83392a = f2;
    }

    /* access modifiers changed from: protected */
    public void setMinScale(float f2) {
        this.f83393b = f2;
    }

    public void setOnDrawableChangedListener(b bVar) {
        this.j = bVar;
    }

    public void setOnLayoutChangeListener(c cVar) {
        this.k = cVar;
    }

    public a(Context context) {
        this(context, null);
    }

    private float c(Matrix matrix) {
        return a(matrix, 0);
    }

    public void setImageDrawable(Drawable drawable) {
        b(drawable, null, -1.0f, -1.0f);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        }
    }

    public void setDisplayType(C0884a aVar) {
        if (aVar != this.v) {
            this.s = false;
            this.v = aVar;
            this.h = true;
            requestLayout();
        }
    }

    public void setImageResource(int i2) {
        setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(getContext().getResources(), i2));
    }

    private float a(C0884a aVar) {
        if (aVar == C0884a.FIT_TO_SCREEN) {
            return 1.0f;
        }
        if (aVar == C0884a.FIT_IF_BIGGER) {
            return Math.min(1.0f, 1.0f / c(this.n));
        }
        return 1.0f / c(this.n);
    }

    public void setImageBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            b(new it.sephiroth.android.library.imagezoom.a.a(bitmap), null, -1.0f, -1.0f);
        } else {
            b(null, null, -1.0f, -1.0f);
        }
    }

    public void setImageMatrix(Matrix matrix) {
        Matrix imageMatrix = getImageMatrix();
        if ((matrix != null || imageMatrix.isIdentity()) && matrix != null) {
            imageMatrix.equals(matrix);
        }
        super.setImageMatrix(matrix);
    }

    private Matrix a(Matrix matrix) {
        this.t.set(this.n);
        this.t.postConcat(matrix);
        return this.t;
    }

    private RectF b(Matrix matrix) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        Matrix a2 = a(matrix);
        this.x.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        a2.mapRect(this.x);
        return this.x;
    }

    private void b(float f2) {
        if (f2 > getMaxScale()) {
            f2 = getMaxScale();
        }
        if (f2 < getMinScale()) {
            f2 = getMinScale();
        }
        PointF center = getCenter();
        a(f2, center.x, center.y);
    }

    public final void d(float f2, float f3) {
        a((double) f2, (double) f3);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private float a(Matrix matrix, int i2) {
        matrix.getValues(this.u);
        return this.u[0];
    }

    public final void c(float f2, float f3) {
        PointF center = getCenter();
        a(f2, center.x, center.y, 50.0f);
    }

    private void a(float f2, float f3) {
        if (f2 != 0.0f || f3 != 0.0f) {
            this.o.postTranslate(f2, f3);
            setImageMatrix(getImageViewMatrix());
        }
    }

    /* access modifiers changed from: protected */
    public final void a(double d2, double d3) {
        RectF bitmapRect = getBitmapRect();
        this.z.set((float) d2, (float) d3, 0.0f, 0.0f);
        a(bitmapRect, this.z);
        a(this.z.left, this.z.top);
        a(true, true);
    }

    /* access modifiers changed from: protected */
    public void a(Context context, AttributeSet attributeSet, int i2) {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private void b(float f2, float f3, float f4) {
        this.o.postScale(f2, f2, f3, f4);
        setImageMatrix(getImageViewMatrix());
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.m = new it.sephiroth.android.library.a.a();
        this.n = new Matrix();
        this.o = new Matrix();
        this.q = new Handler();
        this.r = null;
        this.s = false;
        this.f83392a = -1.0f;
        this.f83393b = -1.0f;
        this.t = new Matrix();
        this.u = new float[9];
        this.f83396e = -1;
        this.f83397f = -1;
        this.g = new PointF();
        this.v = C0884a.NONE;
        this.w = 200;
        this.x = new RectF();
        this.y = new RectF();
        this.z = new RectF();
        a(context, attributeSet, i2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.RectF a(android.graphics.Matrix r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.getDrawable()
            r1 = 0
            if (r0 != 0) goto L_0x000d
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r1, r1, r1, r1)
            return r6
        L_0x000d:
            android.graphics.RectF r0 = r5.y
            r0.set(r1, r1, r1, r1)
            android.graphics.RectF r6 = r5.b((android.graphics.Matrix) r6)
            float r0 = r6.height()
            float r2 = r6.width()
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L_0x0046
            int r8 = r5.f83397f
            float r8 = (float) r8
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x002f
            float r8 = r8 - r0
            float r8 = r8 / r3
            float r0 = r6.top
            float r8 = r8 - r0
            goto L_0x0047
        L_0x002f:
            float r0 = r6.top
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0039
            float r8 = r6.top
            float r8 = -r8
            goto L_0x0047
        L_0x0039:
            float r0 = r6.bottom
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0046
            int r8 = r5.f83397f
            float r8 = (float) r8
            float r0 = r6.bottom
            float r8 = r8 - r0
            goto L_0x0047
        L_0x0046:
            r8 = 0
        L_0x0047:
            if (r7 == 0) goto L_0x006c
            int r7 = r5.f83396e
            float r7 = (float) r7
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0057
            float r7 = r7 - r2
            float r7 = r7 / r3
            float r6 = r6.left
            float r6 = r7 - r6
            goto L_0x006d
        L_0x0057:
            float r0 = r6.left
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0061
            float r6 = r6.left
            float r6 = -r6
            goto L_0x006d
        L_0x0061:
            float r0 = r6.right
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x006c
            float r6 = r6.right
            float r6 = r7 - r6
            goto L_0x006d
        L_0x006c:
            r6 = 0
        L_0x006d:
            android.graphics.RectF r7 = r5.y
            r7.set(r6, r8, r1, r1)
            android.graphics.RectF r6 = r5.y
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.imagezoom.a.a(android.graphics.Matrix, boolean, boolean):android.graphics.RectF");
    }

    /* access modifiers changed from: protected */
    public final void a(float f2, float f3, double d2) {
        final double d3 = (double) f2;
        final double d4 = (double) f3;
        final long currentTimeMillis = System.currentTimeMillis();
        Handler handler = this.q;
        AnonymousClass2 r0 = new Runnable(300.0d) {

            /* renamed from: a  reason: collision with root package name */
            double f83403a;

            /* renamed from: b  reason: collision with root package name */
            double f83404b;

            public final void run() {
                double min = Math.min(300.0d, (double) (System.currentTimeMillis() - currentTimeMillis));
                double d2 = min;
                double a2 = a.this.m.a(d2, 0.0d, d3, 300.0d);
                double a3 = a.this.m.a(d2, 0.0d, d4, 300.0d);
                a.this.a(a2 - this.f83403a, a3 - this.f83404b);
                this.f83403a = a2;
                this.f83404b = a3;
                if (min < 300.0d) {
                    a.this.q.post(this);
                    return;
                }
                RectF a4 = a.this.a(a.this.o, true, true);
                if (!(a4.left == 0.0f && a4.top == 0.0f)) {
                    a.this.d(a4.left, a4.top);
                }
            }
        };
        handler.post(r0);
    }

    /* access modifiers changed from: protected */
    public final void a(float f2, float f3, float f4) {
        if (f2 > getMaxScale()) {
            f2 = getMaxScale();
        }
        b(f2 / getScale(), f3, f4);
        getScale();
        a(true, true);
    }

    public final void b(Drawable drawable, Matrix matrix, float f2, float f3) {
        if (getWidth() <= 0) {
            final Drawable drawable2 = drawable;
            final Matrix matrix2 = matrix;
            final float f4 = f2;
            final float f5 = f3;
            AnonymousClass1 r1 = new Runnable() {
                public final void run() {
                    a.this.b(drawable2, matrix2, f4, f5);
                }
            };
            this.r = r1;
            return;
        }
        a(drawable, matrix, f2, f3);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012d, code lost:
        if (r10 != getScale()) goto L_0x012f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            super.onLayout(r18, r19, r20, r21, r22)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r18 == 0) goto L_0x002e
            int r4 = r0.f83396e
            int r5 = r0.f83397f
            int r6 = r21 - r19
            r0.f83396e = r6
            int r6 = r22 - r20
            r0.f83397f = r6
            int r6 = r0.f83396e
            int r4 = r6 - r4
            int r6 = r0.f83397f
            int r5 = r6 - r5
            android.graphics.PointF r6 = r0.g
            int r7 = r0.f83396e
            float r7 = (float) r7
            float r7 = r7 / r2
            r6.x = r7
            android.graphics.PointF r6 = r0.g
            int r7 = r0.f83397f
            float r7 = (float) r7
            float r7 = r7 / r2
            r6.y = r7
            goto L_0x0030
        L_0x002e:
            r4 = 0
            r5 = 0
        L_0x0030:
            java.lang.Runnable r6 = r0.r
            r7 = 0
            if (r6 == 0) goto L_0x003a
            r0.r = r7
            r6.run()
        L_0x003a:
            android.graphics.drawable.Drawable r6 = r17.getDrawable()
            if (r6 == 0) goto L_0x015c
            if (r18 != 0) goto L_0x004a
            boolean r8 = r0.h
            if (r8 != 0) goto L_0x004a
            boolean r8 = r0.i
            if (r8 == 0) goto L_0x0169
        L_0x004a:
            it.sephiroth.android.library.imagezoom.a$a r8 = r0.v
            r0.a((it.sephiroth.android.library.imagezoom.a.C0884a) r8)
            android.graphics.Matrix r8 = r0.n
            float r8 = r0.c(r8)
            float r9 = r17.getScale()
            r10 = 1065353216(0x3f800000, float:1.0)
            float r11 = r10 / r8
            float r11 = java.lang.Math.min(r10, r11)
            android.graphics.Matrix r12 = r0.n
            int r13 = r0.f83396e
            float r13 = (float) r13
            int r14 = r0.f83397f
            float r14 = (float) r14
            int r15 = r6.getIntrinsicWidth()
            float r15 = (float) r15
            int r6 = r6.getIntrinsicHeight()
            float r6 = (float) r6
            r12.reset()
            int r16 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r16 > 0) goto L_0x0096
            int r16 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x007f
            goto L_0x0096
        L_0x007f:
            float r10 = r13 / r15
            float r3 = r14 / r6
            float r3 = java.lang.Math.min(r10, r3)
            r12.postScale(r3, r3)
            float r15 = r15 * r3
            float r13 = r13 - r15
            float r13 = r13 / r2
            float r6 = r6 * r3
            float r14 = r14 - r6
            float r14 = r14 / r2
            r12.postTranslate(r13, r14)
            goto L_0x00ac
        L_0x0096:
            float r3 = r13 / r15
            float r10 = r14 / r6
            float r3 = java.lang.Math.min(r3, r10)
            r12.postScale(r3, r3)
            float r15 = r15 * r3
            float r13 = r13 - r15
            float r13 = r13 / r2
            float r6 = r6 * r3
            float r14 = r14 - r6
            float r14 = r14 / r2
            r12.postTranslate(r13, r14)
        L_0x00ac:
            android.graphics.Matrix r2 = r0.n
            float r2 = r0.c(r2)
            boolean r3 = r0.i
            if (r3 != 0) goto L_0x0101
            boolean r3 = r0.h
            if (r3 == 0) goto L_0x00bb
            goto L_0x0101
        L_0x00bb:
            if (r18 == 0) goto L_0x00fd
            boolean r1 = r0.f83395d
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x00c5
            r0.f83393b = r3
        L_0x00c5:
            boolean r1 = r0.f83394c
            if (r1 != 0) goto L_0x00cb
            r0.f83392a = r3
        L_0x00cb:
            android.graphics.Matrix r1 = r17.getImageViewMatrix()
            r0.setImageMatrix(r1)
            int r1 = -r4
            float r1 = (float) r1
            int r3 = -r5
            float r3 = (float) r3
            r0.a((float) r1, (float) r3)
            boolean r1 = r0.s
            if (r1 != 0) goto L_0x00e5
            it.sephiroth.android.library.imagezoom.a$a r1 = r0.v
            float r1 = r0.a((it.sephiroth.android.library.imagezoom.a.C0884a) r1)
            r10 = r1
            goto L_0x012f
        L_0x00e5:
            float r1 = r9 - r11
            float r1 = java.lang.Math.abs(r1)
            double r3 = (double) r1
            r5 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00fa
            float r8 = r8 / r2
            float r8 = r8 * r9
            r10 = r8
            goto L_0x012f
        L_0x00fa:
            r10 = 1065353216(0x3f800000, float:1.0)
            goto L_0x012f
        L_0x00fd:
            r1 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0133
        L_0x0101:
            android.graphics.Matrix r1 = r0.p
            if (r1 == 0) goto L_0x0114
            android.graphics.Matrix r1 = r0.o
            android.graphics.Matrix r2 = r0.p
            r1.set(r2)
            r0.p = r7
            float r1 = r17.getScale()
        L_0x0112:
            r10 = r1
            goto L_0x0120
        L_0x0114:
            android.graphics.Matrix r1 = r0.o
            r1.reset()
            it.sephiroth.android.library.imagezoom.a$a r1 = r0.v
            float r1 = r0.a((it.sephiroth.android.library.imagezoom.a.C0884a) r1)
            goto L_0x0112
        L_0x0120:
            android.graphics.Matrix r1 = r17.getImageViewMatrix()
            r0.setImageMatrix(r1)
            float r1 = r17.getScale()
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0132
        L_0x012f:
            r0.b((float) r10)
        L_0x0132:
            r1 = 0
        L_0x0133:
            r0.s = r1
            float r1 = r17.getMaxScale()
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0145
            float r1 = r17.getMinScale()
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0148
        L_0x0145:
            r0.b((float) r10)
        L_0x0148:
            r1 = 1
            r0.a((boolean) r1, (boolean) r1)
            boolean r1 = r0.h
            if (r1 == 0) goto L_0x0154
            r1 = 0
            r0.h = r1
            goto L_0x0155
        L_0x0154:
            r1 = 0
        L_0x0155:
            boolean r2 = r0.i
            if (r2 == 0) goto L_0x015b
            r0.i = r1
        L_0x015b:
            return
        L_0x015c:
            r1 = 0
            boolean r2 = r0.i
            if (r2 == 0) goto L_0x0163
            r0.i = r1
        L_0x0163:
            boolean r2 = r0.h
            if (r2 == 0) goto L_0x0169
            r0.h = r1
        L_0x0169:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.imagezoom.a.onLayout(boolean, int, int, int, int):void");
    }
}
