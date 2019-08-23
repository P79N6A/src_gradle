package com.bytedance.android.live.uikit.b.a;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.widget.ImageView;
import com.bytedance.android.live.uikit.b.a.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class b extends ImageView {
    public static ChangeQuickRedirect m;
    protected RectF A;
    protected RectF B;
    protected RectF C;
    protected boolean D;

    /* renamed from: a  reason: collision with root package name */
    private a f8473a;
    protected com.bytedance.android.live.uikit.b.a.a.a n;
    protected Matrix o;
    protected Matrix p;
    protected Handler q;
    protected Runnable r;
    protected float s;
    protected float t;
    protected final Matrix u;
    protected final float[] v;
    protected int w;
    protected int x;
    protected boolean y;
    protected boolean z;

    public interface a {
    }

    public void a(float f2) {
    }

    public void a(Drawable drawable) {
        if (PatchProxy.isSupport(new Object[]{drawable}, this, m, false, 1897, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable}, this, m, false, 1897, new Class[]{Drawable.class}, Void.TYPE);
        }
    }

    public void b(float f2) {
    }

    public float getRotation() {
        return 0.0f;
    }

    public void a(Drawable drawable, boolean z2, Matrix matrix, float f2) {
        Drawable drawable2 = drawable;
        Matrix matrix2 = matrix;
        float f3 = f2;
        if (PatchProxy.isSupport(new Object[]{drawable2, Byte.valueOf(z2 ? (byte) 1 : 0), matrix2, Float.valueOf(f2)}, this, m, false, 1896, new Class[]{Drawable.class, Boolean.TYPE, Matrix.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable2, Byte.valueOf(z2), matrix2, Float.valueOf(f2)}, this, m, false, 1896, new Class[]{Drawable.class, Boolean.TYPE, Matrix.class, Float.TYPE}, Void.TYPE);
            return;
        }
        if (drawable2 != null) {
            if (this.y) {
                float[] fArr = new float[1];
                a(drawable2, this.o, fArr);
                setMinZoom(fArr[0]);
            } else if (this.z) {
                b(drawable2, this.o);
                setMinZoom(c(this.o));
            } else {
                a(drawable2, this.o);
                setMinZoom(getMinZoom());
            }
            super.setImageDrawable(drawable);
        } else {
            this.o.reset();
            super.setImageDrawable(null);
        }
        if (z2) {
            this.p.reset();
            if (matrix2 != null) {
                this.p = new Matrix(matrix2);
            }
        }
        setImageMatrix(getImageViewMatrix());
        if (f3 < 1.0f) {
            this.s = a();
        } else {
            this.s = f3;
        }
        a(drawable);
    }

    private void a(Drawable drawable, Matrix matrix, float[] fArr) {
        Matrix matrix2 = matrix;
        if (PatchProxy.isSupport(new Object[]{drawable, matrix2, fArr}, this, m, false, 1906, new Class[]{Drawable.class, Matrix.class, float[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable, matrix2, fArr}, this, m, false, 1906, new Class[]{Drawable.class, Matrix.class, float[].class}, Void.TYPE);
            return;
        }
        float width = (float) getWidth();
        float intrinsicWidth = (float) drawable.getIntrinsicWidth();
        matrix.reset();
        float min = Math.min(width / intrinsicWidth, 2.5f);
        matrix2.postScale(min, min);
        matrix2.postTranslate((width - (intrinsicWidth * min)) / 2.0f, 0.0f);
        if (min > 1.0f) {
            fArr[0] = 1.0f / min;
        } else {
            fArr[0] = 1.0f;
        }
    }

    public final void a(boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1, (byte) 1}, this, m, false, 1912, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1, (byte) 1}, this, m, false, 1912, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (getDrawable() != null) {
            RectF a2 = a(this.p, true, true);
            if (!(a2.left == 0.0f && a2.top == 0.0f)) {
                a(a2.left, a2.top);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.RectF a(android.graphics.Matrix r13, boolean r14, boolean r15) {
        /*
            r12 = this;
            r7 = r12
            r8 = 3
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r13
            java.lang.Byte r1 = java.lang.Byte.valueOf(r14)
            r10 = 1
            r0[r10] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r15)
            r11 = 2
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = m
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.graphics.Matrix> r1 = android.graphics.Matrix.class
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r11] = r1
            java.lang.Class<android.graphics.RectF> r6 = android.graphics.RectF.class
            r3 = 0
            r4 = 1913(0x779, float:2.68E-42)
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x005e
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r13
            java.lang.Byte r1 = java.lang.Byte.valueOf(r14)
            r0[r10] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r15)
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = m
            r3 = 0
            r4 = 1913(0x779, float:2.68E-42)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.graphics.Matrix> r1 = android.graphics.Matrix.class
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r11] = r1
            java.lang.Class<android.graphics.RectF> r6 = android.graphics.RectF.class
            r1 = r12
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.graphics.RectF r0 = (android.graphics.RectF) r0
            return r0
        L_0x005e:
            android.graphics.drawable.Drawable r0 = r12.getDrawable()
            r1 = 0
            if (r0 != 0) goto L_0x006b
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1, r1, r1, r1)
            return r0
        L_0x006b:
            android.graphics.RectF r0 = r7.B
            r0.set(r1, r1, r1, r1)
            android.graphics.RectF r0 = r12.b((android.graphics.Matrix) r13)
            float r2 = r0.height()
            float r3 = r0.width()
            r4 = 1073741824(0x40000000, float:2.0)
            if (r15 == 0) goto L_0x00aa
            int r5 = r12.getHeight()
            float r5 = (float) r5
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x0091
            float r5 = r5 - r2
            float r5 = r5 / r4
            float r2 = r0.top
            float r2 = r5 - r2
        L_0x008f:
            r5 = r2
            goto L_0x00ab
        L_0x0091:
            float r2 = r0.top
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x009b
            float r2 = r0.top
            float r2 = -r2
            goto L_0x008f
        L_0x009b:
            float r2 = r0.bottom
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x00aa
            int r2 = r12.getHeight()
            float r2 = (float) r2
            float r5 = r0.bottom
            float r2 = r2 - r5
            goto L_0x008f
        L_0x00aa:
            r5 = 0
        L_0x00ab:
            if (r14 == 0) goto L_0x00d2
            int r2 = r12.getWidth()
            float r2 = (float) r2
            int r6 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x00bd
            float r2 = r2 - r3
            float r2 = r2 / r4
            float r0 = r0.left
            float r0 = r2 - r0
            goto L_0x00d3
        L_0x00bd:
            float r3 = r0.left
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x00c7
            float r0 = r0.left
            float r0 = -r0
            goto L_0x00d3
        L_0x00c7:
            float r3 = r0.right
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x00d2
            float r0 = r0.right
            float r0 = r2 - r0
            goto L_0x00d3
        L_0x00d2:
            r0 = 0
        L_0x00d3:
            android.graphics.RectF r2 = r7.B
            r2.set(r0, r5, r1, r1)
            android.graphics.RectF r0 = r7.B
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.uikit.b.a.b.a(android.graphics.Matrix, boolean, boolean):android.graphics.RectF");
    }

    public final void a(float f2, float f3, float f4) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, this, m, false, 1918, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, this, m, false, 1918, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        b((f2 > this.s ? this.s : f2) / getScale(), f3, f4);
        a(getScale());
        a(true, true);
    }

    public final void a(double d2, double d3) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, this, m, false, 1920, new Class[]{Double.TYPE, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, this, m, false, 1920, new Class[]{Double.TYPE, Double.TYPE}, Void.TYPE);
            return;
        }
        RectF bitmapRect = getBitmapRect();
        this.C.set((float) d2, (float) d3, 0.0f, 0.0f);
        a(bitmapRect, this.C);
        a(this.C.left, this.C.top);
        a(true, true);
    }

    public final void a(RectF rectF, RectF rectF2) {
        RectF rectF3 = rectF;
        RectF rectF4 = rectF2;
        if (PatchProxy.isSupport(new Object[]{rectF3, rectF4}, this, m, false, 1921, new Class[]{RectF.class, RectF.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rectF3, rectF4}, this, m, false, 1921, new Class[]{RectF.class, RectF.class}, Void.TYPE);
            return;
        }
        float width = (float) getWidth();
        float height = (float) getHeight();
        if (rectF3.top >= 0.0f && rectF3.bottom <= height) {
            rectF4.top = 0.0f;
        }
        if (rectF3.left >= 0.0f && rectF3.right <= width) {
            rectF4.left = 0.0f;
        }
        if (rectF3.top + rectF4.top >= 0.0f && rectF3.bottom > height) {
            rectF4.top = (float) ((int) (0.0f - rectF3.top));
        }
        float f2 = height - 0.0f;
        if (rectF3.bottom + rectF4.top <= f2 && rectF3.top < 0.0f) {
            rectF4.top = (float) ((int) (f2 - rectF3.bottom));
        }
        if (rectF3.left + rectF4.left >= 0.0f) {
            rectF4.left = (float) ((int) (0.0f - rectF3.left));
        }
        float f3 = width - 0.0f;
        if (rectF3.right + rectF4.left <= f3) {
            rectF4.left = (float) ((int) (f3 - rectF3.right));
        }
    }

    public final void a(float f2, float f3, double d2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Double.valueOf(300.0d)}, this, m, false, 1922, new Class[]{Float.TYPE, Float.TYPE, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Double.valueOf(300.0d)}, this, m, false, 1922, new Class[]{Float.TYPE, Float.TYPE, Double.TYPE}, Void.TYPE);
            return;
        }
        final double d3 = (double) f2;
        final double d4 = (double) f3;
        final long currentTimeMillis = System.currentTimeMillis();
        Handler handler = this.q;
        AnonymousClass2 r0 = new Runnable(300.0d) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8480a;

            /* renamed from: b  reason: collision with root package name */
            double f8481b;

            /* renamed from: c  reason: collision with root package name */
            double f8482c;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f8480a, false, 1926, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f8480a, false, 1926, new Class[0], Void.TYPE);
                    return;
                }
                double min = Math.min(300.0d, (double) (System.currentTimeMillis() - currentTimeMillis));
                double a2 = b.this.n.a();
                double a3 = b.this.n.a();
                b.this.a(a2 - this.f8481b, a3 - this.f8482c);
                this.f8481b = a2;
                this.f8482c = a3;
                if (min < 300.0d) {
                    b.this.q.post(this);
                    return;
                }
                RectF a4 = b.this.a(b.this.p, true, true);
                if (!(a4.left == 0.0f && a4.top == 0.0f)) {
                    b.this.c(a4.left, a4.top);
                }
            }
        };
        handler.post(r0);
    }

    public final void a(float f2, float f3, float f4, float f5) {
        float f6 = f3;
        float f7 = f4;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, m, false, 1923, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, m, false, 1923, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        float maxZoom = f2 > getMaxZoom() ? getMaxZoom() : f2;
        final long currentTimeMillis = System.currentTimeMillis();
        final float scale = getScale();
        final float f8 = maxZoom - scale;
        Matrix matrix = new Matrix(this.p);
        matrix.postScale(maxZoom, maxZoom, f6, f7);
        RectF a2 = a(matrix, true, true);
        final float f9 = f6 + (a2.left * maxZoom);
        final float f10 = f7 + (a2.top * maxZoom);
        Handler handler = this.q;
        final float f11 = f5;
        AnonymousClass3 r0 = new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8486a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f8486a, false, 1927, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f8486a, false, 1927, new Class[0], Void.TYPE);
                    return;
                }
                float min = Math.min(f11, (float) (System.currentTimeMillis() - currentTimeMillis));
                b.this.a(scale + ((float) b.this.n.b()), f9, f10);
                if (min < f11) {
                    b.this.q.post(this);
                } else if (b.this.D) {
                    b.this.D = false;
                } else {
                    b.this.D = true;
                    b.this.b(b.this.getScale());
                    b.this.a(true, true);
                }
            }
        };
        handler.post(r0);
    }

    public RectF getBitmapRect() {
        if (!PatchProxy.isSupport(new Object[0], this, m, false, 1908, new Class[0], RectF.class)) {
            return b(this.p);
        }
        return (RectF) PatchProxy.accessDispatch(new Object[0], this, m, false, 1908, new Class[0], RectF.class);
    }

    public Matrix getDisplayMatrix() {
        if (!PatchProxy.isSupport(new Object[0], this, m, false, 1903, new Class[0], Matrix.class)) {
            return new Matrix(this.p);
        }
        return (Matrix) PatchProxy.accessDispatch(new Object[0], this, m, false, 1903, new Class[0], Matrix.class);
    }

    public Matrix getImageViewMatrix() {
        if (!PatchProxy.isSupport(new Object[0], this, m, false, 1901, new Class[0], Matrix.class)) {
            return a(this.p);
        }
        return (Matrix) PatchProxy.accessDispatch(new Object[0], this, m, false, 1901, new Class[0], Matrix.class);
    }

    public float getMaxZoom() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 1899, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, m, false, 1899, new Class[0], Float.TYPE)).floatValue();
        }
        if (this.s < 1.0f) {
            this.s = a();
        }
        return this.s;
    }

    public float getMinZoom() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 1900, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, m, false, 1900, new Class[0], Float.TYPE)).floatValue();
        }
        if (this.t < 0.0f) {
            this.t = 1.0f;
        }
        return this.t;
    }

    public float getScale() {
        if (!PatchProxy.isSupport(new Object[0], this, m, false, 1911, new Class[0], Float.TYPE)) {
            return c(this.p);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, m, false, 1911, new Class[0], Float.TYPE)).floatValue();
    }

    private float a() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 1898, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, m, false, 1898, new Class[0], Float.TYPE)).floatValue();
        }
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return 1.0f;
        }
        return Math.max(((float) drawable.getIntrinsicWidth()) / ((float) this.w), ((float) drawable.getIntrinsicHeight()) / ((float) this.x)) * 4.0f;
    }

    public void setMinZoom(float f2) {
        this.t = f2;
    }

    public void setOnBitmapChangedListener(a aVar) {
        this.f8473a = aVar;
    }

    public void setImageDrawable(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2}, this, m, false, 1894, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable2}, this, m, false, 1894, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        b(drawable2, true, null, -1.0f);
    }

    private RectF b(Matrix matrix) {
        if (PatchProxy.isSupport(new Object[]{matrix}, this, m, false, 1909, new Class[]{Matrix.class}, RectF.class)) {
            return (RectF) PatchProxy.accessDispatch(new Object[]{matrix}, this, m, false, 1909, new Class[]{Matrix.class}, RectF.class);
        }
        Drawable drawable = getDrawable();
        Matrix a2 = a(matrix);
        if (drawable != null) {
            this.A.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        } else {
            this.A.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        a2.mapRect(this.A);
        return this.A;
    }

    private float c(Matrix matrix) {
        Matrix matrix2 = matrix;
        if (!PatchProxy.isSupport(new Object[]{matrix2}, this, m, false, 1910, new Class[]{Matrix.class}, Float.TYPE)) {
            return a(matrix2, 0);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{matrix2}, this, m, false, 1910, new Class[]{Matrix.class}, Float.TYPE)).floatValue();
    }

    public void setFitToScreen(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, m, false, 1886, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, m, false, 1886, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2 != this.z) {
            this.z = z2;
            requestLayout();
        }
    }

    public void setFitToWidth(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, m, false, 1887, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, m, false, 1887, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2 != this.y) {
            this.y = z2;
            requestLayout();
        }
    }

    public void setImageResource(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, m, false, 1890, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, m, false, 1890, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(getContext().getResources(), i));
    }

    private Matrix a(Matrix matrix) {
        if (PatchProxy.isSupport(new Object[]{matrix}, this, m, false, 1902, new Class[]{Matrix.class}, Matrix.class)) {
            return (Matrix) PatchProxy.accessDispatch(new Object[]{matrix}, this, m, false, 1902, new Class[]{Matrix.class}, Matrix.class);
        }
        this.u.set(this.o);
        this.u.postConcat(matrix);
        return this.u;
    }

    public void setImageBitmap(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{bitmap2}, this, m, false, 1889, new Class[]{Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2}, this, m, false, 1889, new Class[]{Bitmap.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{bitmap2, (byte) 1}, this, m, false, 1891, new Class[]{Bitmap.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2, (byte) 1}, this, m, false, 1891, new Class[]{Bitmap.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{bitmap2, (byte) 1, null}, this, m, false, 1892, new Class[]{Bitmap.class, Boolean.TYPE, Matrix.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2, (byte) 1, null}, this, m, false, 1892, new Class[]{Bitmap.class, Boolean.TYPE, Matrix.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{bitmap2, (byte) 1, null, Float.valueOf(-1.0f)}, this, m, false, 1893, new Class[]{Bitmap.class, Boolean.TYPE, Matrix.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2, (byte) 1, null, Float.valueOf(-1.0f)}, this, m, false, 1893, new Class[]{Bitmap.class, Boolean.TYPE, Matrix.class, Float.TYPE}, Void.TYPE);
        } else if (bitmap2 != null) {
            b(new a(bitmap2), true, null, -1.0f);
        } else {
            b(null, true, null, -1.0f);
        }
    }

    private float a(Matrix matrix, int i) {
        if (PatchProxy.isSupport(new Object[]{matrix, 0}, this, m, false, 1907, new Class[]{Matrix.class, Integer.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{matrix, 0}, this, m, false, 1907, new Class[]{Matrix.class, Integer.TYPE}, Float.TYPE)).floatValue();
        }
        matrix.getValues(this.v);
        return this.v[0];
    }

    public final void c(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, m, false, 1919, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, m, false, 1919, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        a((double) f2, (double) f3);
    }

    private void b(Drawable drawable, Matrix matrix) {
        Matrix matrix2 = matrix;
        if (PatchProxy.isSupport(new Object[]{drawable, matrix2}, this, m, false, 1905, new Class[]{Drawable.class, Matrix.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable, matrix2}, this, m, false, 1905, new Class[]{Drawable.class, Matrix.class}, Void.TYPE);
            return;
        }
        float width = (float) getWidth();
        float height = (float) getHeight();
        float intrinsicWidth = (float) drawable.getIntrinsicWidth();
        float intrinsicHeight = (float) drawable.getIntrinsicHeight();
        matrix.reset();
        float min = Math.min(Math.min(width / intrinsicWidth, 2.5f), Math.min(height / intrinsicHeight, 2.5f));
        matrix2.postScale(min, min);
        matrix2.postTranslate((width - (intrinsicWidth * min)) / 2.0f, (height - (intrinsicHeight * min)) / 2.0f);
    }

    private void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, m, false, 1914, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, m, false, 1914, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.p.postTranslate(f2, f3);
        setImageMatrix(getImageViewMatrix());
    }

    public final void b(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(50.0f)}, this, m, false, 1917, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(50.0f)}, this, m, false, 1917, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        a(f2, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, 50.0f);
    }

    private void a(Drawable drawable, Matrix matrix) {
        Matrix matrix2 = matrix;
        if (PatchProxy.isSupport(new Object[]{drawable, matrix2}, this, m, false, 1904, new Class[]{Drawable.class, Matrix.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable, matrix2}, this, m, false, 1904, new Class[]{Drawable.class, Matrix.class}, Void.TYPE);
            return;
        }
        float width = (float) getWidth();
        float height = (float) getHeight();
        float intrinsicWidth = (float) drawable.getIntrinsicWidth();
        float intrinsicHeight = (float) drawable.getIntrinsicHeight();
        matrix.reset();
        if (intrinsicWidth > width || intrinsicHeight > height) {
            float min = Math.min(Math.min(width / intrinsicWidth, 2.0f), Math.min(height / intrinsicHeight, 2.0f));
            matrix2.postScale(min, min);
            matrix2.postTranslate((width - (intrinsicWidth * min)) / 2.0f, (height - (intrinsicHeight * min)) / 2.0f);
            return;
        }
        matrix2.postTranslate((width - intrinsicWidth) / 2.0f, (height - intrinsicHeight) / 2.0f);
    }

    private void b(float f2, float f3, float f4) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, this, m, false, 1915, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, this, m, false, 1915, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.p.postScale(f2, f2, f3, f4);
        setImageMatrix(getImageViewMatrix());
    }

    public final void b(Drawable drawable, boolean z2, Matrix matrix, float f2) {
        if (PatchProxy.isSupport(new Object[]{drawable, Byte.valueOf(z2 ? (byte) 1 : 0), matrix, Float.valueOf(f2)}, this, m, false, 1895, new Class[]{Drawable.class, Boolean.TYPE, Matrix.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable, Byte.valueOf(z2), matrix, Float.valueOf(f2)}, this, m, false, 1895, new Class[]{Drawable.class, Boolean.TYPE, Matrix.class, Float.TYPE}, Void.TYPE);
        } else if (getWidth() <= 0) {
            final Drawable drawable2 = drawable;
            final boolean z3 = z2;
            final Matrix matrix2 = matrix;
            final float f3 = f2;
            AnonymousClass1 r0 = new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f8474a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f8474a, false, 1925, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f8474a, false, 1925, new Class[0], Void.TYPE);
                        return;
                    }
                    b.this.b(drawable2, z3, matrix2, f3);
                }
            };
            this.r = r0;
        } else {
            a(drawable, z2, matrix, f2);
        }
    }

    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        float f2;
        float minZoom;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, m, false, 1888, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, m, false, 1888, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onLayout(z2, i, i2, i3, i4);
        this.w = i3 - i;
        this.x = i4 - i2;
        Runnable runnable = this.r;
        if (runnable != null) {
            this.r = null;
            runnable.run();
        }
        if (getDrawable() != null) {
            if (this.y) {
                float[] fArr = new float[1];
                a(getDrawable(), this.o, fArr);
                setMinZoom(fArr[0]);
                f2 = 1.0f;
            } else {
                if (this.z) {
                    b(getDrawable(), this.o);
                    setMinZoom(1.0f);
                    minZoom = getMinZoom();
                } else {
                    a(getDrawable(), this.o);
                    setMinZoom(getMinZoom());
                    minZoom = getMinZoom();
                }
                f2 = minZoom;
            }
            setImageMatrix(getImageViewMatrix());
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, m, false, 1916, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, m, false, 1916, new Class[]{Float.TYPE}, Void.TYPE);
                return;
            }
            a(f2, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        }
    }
}
