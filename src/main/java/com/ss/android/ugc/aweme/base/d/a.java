package com.ss.android.ugc.aweme.base.d;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.u;

public class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34725a = null;
    private static final String i = "a";
    private static boolean m;

    /* renamed from: b  reason: collision with root package name */
    public Paint f34726b;

    /* renamed from: c  reason: collision with root package name */
    public int f34727c;

    /* renamed from: d  reason: collision with root package name */
    public float[] f34728d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f34729e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f34730f;
    public boolean g;
    public boolean h;
    private float j;
    private float k;
    private Float l;

    private static double d(double d2) {
        return d2 * d2 * d2 * d2 * d2 * d2;
    }

    public int getOpacity() {
        return -3;
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f34725a, false, 24633, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34725a, false, 24633, new Class[0], Void.TYPE);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.width() > 0) {
            this.f34726b.setShader(new SweepGradient((float) bounds.centerX(), (float) bounds.centerY(), this.f34729e, null));
        }
    }

    public a() {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(1.5d)}, null, f34725a, true, 24648, new Class[]{Double.TYPE}, Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{Double.valueOf(1.5d)}, null, f34725a, true, 24648, new Class[]{Double.TYPE}, Integer.TYPE)).intValue();
        } else {
            i2 = u.a(1.5d);
        }
        this.f34727c = i2;
        this.f34728d = new float[60];
        this.f34729e = new int[]{-65536, -16711936, -16776961, -16777216, -65536};
        if (PatchProxy.isSupport(new Object[0], this, f34725a, false, 24631, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34725a, false, 24631, new Class[0], Void.TYPE);
            return;
        }
        this.f34726b = new Paint(1);
        this.f34726b.setStyle(Paint.Style.STROKE);
        this.f34726b.setStrokeWidth((float) this.f34727c);
        this.f34726b.setStrokeCap(Paint.Cap.ROUND);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        ColorFilter colorFilter2 = colorFilter;
        if (PatchProxy.isSupport(new Object[]{colorFilter2}, this, f34725a, false, 24644, new Class[]{ColorFilter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{colorFilter2}, this, f34725a, false, 24644, new Class[]{ColorFilter.class}, Void.TYPE);
            return;
        }
        this.f34726b.setColorFilter(colorFilter2);
    }

    private static double b(double d2) {
        if (!PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, null, f34725a, true, 24640, new Class[]{Double.TYPE}, Double.TYPE)) {
            return (double) ((float) d(1.0d - d2));
        }
        return ((Double) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, null, f34725a, true, 24640, new Class[]{Double.TYPE}, Double.TYPE)).doubleValue();
    }

    private static double c(double d2) {
        if (!PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, null, f34725a, true, 24641, new Class[]{Double.TYPE}, Double.TYPE)) {
            return (double) ((float) d(d2));
        }
        return ((Double) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, null, f34725a, true, 24641, new Class[]{Double.TYPE}, Double.TYPE)).doubleValue();
    }

    public void onBoundsChange(Rect rect) {
        if (PatchProxy.isSupport(new Object[]{rect}, this, f34725a, false, 24632, new Class[]{Rect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect}, this, f34725a, false, 24632, new Class[]{Rect.class}, Void.TYPE);
            return;
        }
        super.onBoundsChange(rect);
        a();
        double width = (double) getBounds().width();
        Double.isNaN(width);
        this.j = (float) ((width * 3.141592653589793d) / 30.0d);
    }

    public void setAlpha(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f34725a, false, 24643, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f34725a, false, 24643, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f34726b.setAlpha(i2);
    }

    private static double a(double d2) {
        double d3 = d2;
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, null, f34725a, true, 24639, new Class[]{Double.TYPE}, Double.TYPE)) {
            return ((Double) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, null, f34725a, true, 24639, new Class[]{Double.TYPE}, Double.TYPE)).doubleValue();
        }
        StringBuilder sb = new StringBuilder("getAdjustedDegreeFactor() called, with progress = [");
        sb.append(d3);
        sb.append("]");
        double floor = Math.floor(d2);
        double d4 = d3 - floor;
        StringBuilder sb2 = new StringBuilder("getAdjustedDegreeFactor() called, with base = [");
        sb2.append(floor);
        sb2.append("]");
        StringBuilder sb3 = new StringBuilder("getAdjustedDegreeFactor() called, with periodicValue = [");
        sb3.append(d4);
        sb3.append("]");
        if (d4 < 0.125d) {
            return b(d4 / 0.125d);
        }
        if (d4 < 0.375d) {
            return 0.0d;
        }
        if (d4 < 0.5d) {
            return c(((d4 - 0.125d) - 0.25d) / 0.125d);
        }
        return 1.0d;
    }

    public void draw(Canvas canvas) {
        PathEffect pathEffect;
        float f2;
        boolean z;
        double d2;
        Canvas canvas2 = canvas;
        char c2 = 1;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f34725a, false, 24634, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f34725a, false, 24634, new Class[]{Canvas.class}, Void.TYPE);
        } else if (!this.g) {
            canvas.save();
            Paint paint = this.f34726b;
            if (this.f34730f) {
                if (PatchProxy.isSupport(new Object[0], this, f34725a, false, 24636, new Class[0], PathEffect.class)) {
                    pathEffect = (PathEffect) PatchProxy.accessDispatch(new Object[0], this, f34725a, false, 24636, new Class[0], PathEffect.class);
                } else {
                    int i2 = 0;
                    while (i2 < 30) {
                        if (i2 == 29) {
                            z = true;
                        } else {
                            z = false;
                        }
                        m = z;
                        float[] fArr = this.f34728d;
                        int i3 = i2 * 2;
                        double d3 = (double) this.j;
                        double d4 = (double) this.k;
                        double d5 = (double) i2;
                        Double.isNaN(d5);
                        double d6 = (d5 * 1.0d) / 29.0d;
                        Object[] objArr = new Object[4];
                        objArr[0] = Double.valueOf(0.0d);
                        objArr[c2] = Double.valueOf(d3);
                        objArr[2] = Double.valueOf(d4);
                        double d7 = d3;
                        objArr[3] = Double.valueOf(d6);
                        ChangeQuickRedirect changeQuickRedirect = f34725a;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Double.TYPE;
                        clsArr[c2] = Double.TYPE;
                        clsArr[2] = Double.TYPE;
                        clsArr[3] = Double.TYPE;
                        double d8 = d4;
                        float[] fArr2 = fArr;
                        Class[] clsArr2 = clsArr;
                        int i4 = i2;
                        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, 24637, clsArr2, Double.TYPE)) {
                            d2 = ((Double) PatchProxy.accessDispatch(new Object[]{Double.valueOf(0.0d), Double.valueOf(d7), Double.valueOf(d8), Double.valueOf(d6)}, this, f34725a, false, 24637, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Double.TYPE)).doubleValue();
                        } else {
                            Double.isNaN(d8);
                            double d9 = d8 - (d6 * 0.5d);
                            if (PatchProxy.isSupport(new Object[]{Double.valueOf(0.0d), Double.valueOf(d7), Double.valueOf(d9)}, null, f34725a, true, 24638, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE}, Double.TYPE)) {
                                d2 = ((Double) PatchProxy.accessDispatch(new Object[]{Double.valueOf(0.0d), Double.valueOf(d7), Double.valueOf(d9)}, null, f34725a, true, 24638, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE}, Double.TYPE)).doubleValue();
                            } else {
                                new StringBuilder("getAdjustedDegreeFactor(degree) = ").append(a(d9));
                                Double.isNaN(d7);
                                d2 = ((d7 - 0.0d) * a(d9)) + 0.0d;
                            }
                        }
                        fArr2[i3] = (float) d2;
                        new StringBuilder("lengthValue = ").append(this.f34728d[i3]);
                        this.f34728d[i3 + 1] = this.j - this.f34728d[i3];
                        i2 = i4 + 1;
                        c2 = 1;
                    }
                    pathEffect = new DashPathEffect(this.f34728d, 0.0f);
                }
            } else {
                pathEffect = null;
            }
            paint.setPathEffect(pathEffect);
            int centerX = getBounds().centerX();
            int centerY = getBounds().centerY();
            if (this.f34730f) {
                double d10 = (double) this.k;
                Double.isNaN(d10);
                f2 = (float) (d10 * 0.5d * 360.0d);
            } else {
                f2 = 0.0f;
            }
            float f3 = (float) centerX;
            float f4 = (float) centerY;
            canvas2.rotate(f2, f3, f4);
            canvas2.drawCircle(f3, f4, (float) ((getBounds().width() / 2) - this.f34727c), this.f34726b);
            if (this.f34730f && !this.h) {
                if (PatchProxy.isSupport(new Object[0], this, f34725a, false, 24635, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f34725a, false, 24635, new Class[0], Void.TYPE);
                } else {
                    float f5 = this.k;
                    this.k += 0.008f;
                    if (this.l != null && f5 <= this.l.floatValue() && this.k >= this.l.floatValue()) {
                        this.f34730f = false;
                        this.l = null;
                        this.k = 0.0f;
                        this.h = false;
                    }
                    invalidateSelf();
                }
            }
            canvas.restore();
        }
    }
}
