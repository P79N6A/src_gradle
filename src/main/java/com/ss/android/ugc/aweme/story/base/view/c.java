package com.ss.android.ugc.aweme.story.base.view;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import java.util.Arrays;

public class c extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72016a = null;
    private static final String h = "c";
    private static boolean l;

    /* renamed from: b  reason: collision with root package name */
    public float[] f72017b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f72018c;

    /* renamed from: d  reason: collision with root package name */
    float f72019d;

    /* renamed from: e  reason: collision with root package name */
    public Float f72020e;

    /* renamed from: f  reason: collision with root package name */
    boolean f72021f;
    boolean g;
    private Paint i;
    private float j;
    private float k;
    private boolean m;

    private static double d(double d2) {
        return d2 * d2 * d2 * d2 * d2 * d2;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.m = false;
    }

    public int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f72021f = false;
        this.f72020e = null;
        this.f72019d = 0.0f;
        this.g = false;
    }

    public c() {
        float f2;
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(1.5d)}, null, f72016a, true, 82383, new Class[]{Double.TYPE}, Float.TYPE)) {
            f2 = ((Float) PatchProxy.accessDispatch(new Object[]{Double.valueOf(1.5d)}, null, f72016a, true, 82383, new Class[]{Double.TYPE}, Float.TYPE)).floatValue();
        } else {
            f2 = UIUtils.dip2Px(GlobalContext.getContext(), 1.5f);
        }
        this.j = f2;
        this.f72017b = new float[60];
        this.f72018c = new int[]{-65536, -16711936, -16776961, -16777216, -65536};
        this.f72020e = Float.valueOf(1.0f);
        if (PatchProxy.isSupport(new Object[0], this, f72016a, false, 82366, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72016a, false, 82366, new Class[0], Void.TYPE);
            return;
        }
        this.i = new Paint(1);
        this.i.setStyle(Paint.Style.STROKE);
        this.i.setStrokeWidth(this.j);
        this.i.setStrokeCap(Paint.Cap.ROUND);
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f72016a, false, 82368, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72016a, false, 82368, new Class[0], Void.TYPE);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.width() > 0) {
            LinearGradient linearGradient = new LinearGradient((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.f72018c, null, Shader.TileMode.CLAMP);
            this.i.setShader(linearGradient);
        }
    }

    public final void a(@NonNull int[] iArr) {
        if (PatchProxy.isSupport(new Object[]{iArr}, this, f72016a, false, 82385, new Class[]{int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iArr}, this, f72016a, false, 82385, new Class[]{int[].class}, Void.TYPE);
            return;
        }
        if (!Arrays.equals(iArr, this.f72018c)) {
            this.f72018c = iArr;
            c();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        ColorFilter colorFilter2 = colorFilter;
        if (PatchProxy.isSupport(new Object[]{colorFilter2}, this, f72016a, false, 82379, new Class[]{ColorFilter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{colorFilter2}, this, f72016a, false, 82379, new Class[]{ColorFilter.class}, Void.TYPE);
            return;
        }
        this.i.setColorFilter(colorFilter2);
    }

    private static double b(double d2) {
        if (!PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, null, f72016a, true, 82375, new Class[]{Double.TYPE}, Double.TYPE)) {
            return (double) ((float) d(1.0d - d2));
        }
        return ((Double) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, null, f72016a, true, 82375, new Class[]{Double.TYPE}, Double.TYPE)).doubleValue();
    }

    private static double c(double d2) {
        if (!PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, null, f72016a, true, 82376, new Class[]{Double.TYPE}, Double.TYPE)) {
            return (double) ((float) d(d2));
        }
        return ((Double) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, null, f72016a, true, 82376, new Class[]{Double.TYPE}, Double.TYPE)).doubleValue();
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f72016a, false, 82386, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f72016a, false, 82386, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.j = f2;
        this.i.setStrokeWidth(this.j);
    }

    public void onBoundsChange(Rect rect) {
        if (PatchProxy.isSupport(new Object[]{rect}, this, f72016a, false, 82367, new Class[]{Rect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect}, this, f72016a, false, 82367, new Class[]{Rect.class}, Void.TYPE);
            return;
        }
        super.onBoundsChange(rect);
        c();
        double width = (double) getBounds().width();
        Double.isNaN(width);
        this.k = (float) ((width * 3.141592653589793d) / 30.0d);
    }

    public void setAlpha(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f72016a, false, 82378, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f72016a, false, 82378, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.i.setAlpha(i2);
    }

    private static double a(double d2) {
        double d3 = d2;
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, null, f72016a, true, 82374, new Class[]{Double.TYPE}, Double.TYPE)) {
            return ((Double) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, null, f72016a, true, 82374, new Class[]{Double.TYPE}, Double.TYPE)).doubleValue();
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
        float f2;
        PathEffect pathEffect;
        boolean z;
        double d2;
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f72016a, false, 82369, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f72016a, false, 82369, new Class[]{Canvas.class}, Void.TYPE);
        } else if (!this.m) {
            canvas.save();
            Paint paint = this.i;
            if (this.f72021f) {
                if (PatchProxy.isSupport(new Object[0], this, f72016a, false, 82371, new Class[0], PathEffect.class)) {
                    pathEffect = (PathEffect) PatchProxy.accessDispatch(new Object[0], this, f72016a, false, 82371, new Class[0], PathEffect.class);
                    f2 = 0.0f;
                } else {
                    for (int i2 = 0; i2 < 30; i2++) {
                        if (i2 == 29) {
                            z = true;
                        } else {
                            z = false;
                        }
                        l = z;
                        float[] fArr = this.f72017b;
                        int i3 = i2 * 2;
                        double d3 = (double) this.k;
                        double d4 = (double) this.f72019d;
                        double d5 = (double) i2;
                        Double.isNaN(d5);
                        double d6 = (d5 * 1.0d) / 29.0d;
                        double d7 = d4;
                        double d8 = d3;
                        float[] fArr2 = fArr;
                        if (PatchProxy.isSupport(new Object[]{Double.valueOf(0.0d), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d6)}, this, f72016a, false, 82372, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Double.TYPE)) {
                            d2 = ((Double) PatchProxy.accessDispatch(new Object[]{Double.valueOf(0.0d), Double.valueOf(d8), Double.valueOf(d7), Double.valueOf(d6)}, this, f72016a, false, 82372, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Double.TYPE)).doubleValue();
                        } else {
                            Double.isNaN(d7);
                            double d9 = d7 - (d6 * 0.5d);
                            if (PatchProxy.isSupport(new Object[]{Double.valueOf(0.0d), Double.valueOf(d8), Double.valueOf(d9)}, null, f72016a, true, 82373, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE}, Double.TYPE)) {
                                d2 = ((Double) PatchProxy.accessDispatch(new Object[]{Double.valueOf(0.0d), Double.valueOf(d8), Double.valueOf(d9)}, null, f72016a, true, 82373, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE}, Double.TYPE)).doubleValue();
                            } else {
                                new StringBuilder("getAdjustedDegreeFactor(degree) = ").append(a(d9));
                                Double.isNaN(d8);
                                d2 = ((d8 - 0.0d) * a(d9)) + 0.0d;
                            }
                        }
                        fArr2[i3] = (float) d2;
                        new StringBuilder("lengthValue = ").append(this.f72017b[i3]);
                        this.f72017b[i3 + 1] = this.k - this.f72017b[i3];
                    }
                    f2 = 0.0f;
                    pathEffect = new DashPathEffect(this.f72017b, 0.0f);
                }
            } else {
                f2 = 0.0f;
                pathEffect = null;
            }
            paint.setPathEffect(pathEffect);
            float height = ((float) getBounds().height()) / 2.0f;
            float width = ((float) getBounds().width()) / 2.0f;
            if (this.f72021f) {
                double d10 = (double) this.f72019d;
                Double.isNaN(d10);
                f2 = (float) (d10 * 0.5d * 360.0d);
            }
            canvas2.rotate(f2, width, height);
            canvas2.drawCircle(width, height, (((float) getBounds().width()) / 2.0f) - this.j, this.i);
            if (this.f72021f && !this.g) {
                if (PatchProxy.isSupport(new Object[0], this, f72016a, false, 82370, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f72016a, false, 82370, new Class[0], Void.TYPE);
                } else {
                    float f3 = this.f72019d;
                    this.f72019d += 0.008f;
                    if (this.f72020e != null && f3 <= this.f72020e.floatValue() && this.f72019d >= this.f72020e.floatValue()) {
                        a();
                    }
                    invalidateSelf();
                }
            }
            canvas.restore();
        }
    }
}
