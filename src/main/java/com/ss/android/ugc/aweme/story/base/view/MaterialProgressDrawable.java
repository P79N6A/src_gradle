package com.ss.android.ugc.aweme.story.base.view;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

public final class MaterialProgressDrawable extends Drawable implements Animatable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71965a;

    /* renamed from: b  reason: collision with root package name */
    static final Interpolator f71966b = new FastOutSlowInInterpolator();

    /* renamed from: f  reason: collision with root package name */
    private static final Interpolator f71967f = new LinearInterpolator();
    private static final int[] g = {-16777216};

    /* renamed from: c  reason: collision with root package name */
    final a f71968c;

    /* renamed from: d  reason: collision with root package name */
    public float f71969d;

    /* renamed from: e  reason: collision with root package name */
    boolean f71970e;
    private final ArrayList<Animation> h;
    private Resources i;
    private View j;
    private Animation k;
    private double l;
    private double m;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ProgressDrawableSize {
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71971a;

        /* renamed from: b  reason: collision with root package name */
        final RectF f71972b;

        /* renamed from: c  reason: collision with root package name */
        final Paint f71973c;

        /* renamed from: d  reason: collision with root package name */
        final Paint f71974d;

        /* renamed from: e  reason: collision with root package name */
        public float f71975e;

        /* renamed from: f  reason: collision with root package name */
        public float f71976f;
        public float g;
        public float h;
        public float i;
        int[] j;
        public float k;
        public float l;
        public float m;
        boolean n;
        Path o;
        float p;
        public double q;
        int r;
        int s;
        public int t;
        final Paint u;
        public int v;
        public int w;
        private final Drawable.Callback x;
        private int y;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f71971a, false, 82425, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f71971a, false, 82425, new Class[0], Void.TYPE);
                return;
            }
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            a(0.0f);
            b(0.0f);
            c(0.0f);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (PatchProxy.isSupport(new Object[0], this, f71971a, false, 82426, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f71971a, false, 82426, new Class[0], Void.TYPE);
                return;
            }
            this.x.invalidateDrawable(null);
        }

        public final void a(int i2) {
            this.y = 0;
            this.w = this.j[this.y];
        }

        public final void a(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f71971a, false, 82419, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f71971a, false, 82419, new Class[]{Float.TYPE}, Void.TYPE);
                return;
            }
            this.f71975e = f2;
            b();
        }

        public final void b(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f71971a, false, 82420, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f71971a, false, 82420, new Class[]{Float.TYPE}, Void.TYPE);
                return;
            }
            this.f71976f = f2;
            b();
        }

        public final void c(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f71971a, false, 82421, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f71971a, false, 82421, new Class[]{Float.TYPE}, Void.TYPE);
                return;
            }
            this.g = f2;
            b();
        }

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f71971a, false, 82423, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f71971a, false, 82423, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (this.n != z) {
                this.n = z;
                b();
            }
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return (int) this.m;
    }

    public final int getIntrinsicWidth() {
        return (int) this.l;
    }

    public final int getAlpha() {
        return this.f71968c.t;
    }

    public final boolean isRunning() {
        if (PatchProxy.isSupport(new Object[0], this, f71965a, false, 82400, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f71965a, false, 82400, new Class[0], Boolean.TYPE)).booleanValue();
        }
        ArrayList<Animation> arrayList = this.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Animation animation = arrayList.get(i2);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }

    public final void start() {
        if (PatchProxy.isSupport(new Object[0], this, f71965a, false, 82401, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71965a, false, 82401, new Class[0], Void.TYPE);
            return;
        }
        this.k.reset();
        a aVar = this.f71968c;
        aVar.k = aVar.f71975e;
        aVar.l = aVar.f71976f;
        aVar.m = aVar.g;
        if (this.f71968c.f71976f != this.f71968c.f71975e) {
            this.f71970e = true;
            this.k.setDuration(666);
            this.j.startAnimation(this.k);
            return;
        }
        this.f71968c.a(0);
        this.f71968c.a();
        this.k.setDuration(1332);
        this.j.startAnimation(this.k);
    }

    public final void stop() {
        if (PatchProxy.isSupport(new Object[0], this, f71965a, false, 82402, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71965a, false, 82402, new Class[0], Void.TYPE);
            return;
        }
        this.j.clearAnimation();
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(0.0f)}, this, f71965a, false, 82399, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(0.0f)}, this, f71965a, false, 82399, new Class[]{Float.TYPE}, Void.TYPE);
        } else {
            this.f71969d = 0.0f;
            invalidateSelf();
        }
        this.f71968c.a(false);
        this.f71968c.a(0);
        this.f71968c.a();
    }

    public final void setAlpha(int i2) {
        this.f71968c.t = i2;
    }

    public final void b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f71965a, false, 82395, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f71965a, false, 82395, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f71968c.c(f2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        ColorFilter colorFilter2 = colorFilter;
        if (PatchProxy.isSupport(new Object[]{colorFilter2}, this, f71965a, false, 82398, new Class[]{ColorFilter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{colorFilter2}, this, f71965a, false, 82398, new Class[]{ColorFilter.class}, Void.TYPE);
            return;
        }
        a aVar = this.f71968c;
        if (PatchProxy.isSupport(new Object[]{colorFilter2}, aVar, a.f71971a, false, 82417, new Class[]{ColorFilter.class}, Void.TYPE)) {
            a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{colorFilter2}, aVar2, a.f71971a, false, 82417, new Class[]{ColorFilter.class}, Void.TYPE);
            return;
        }
        aVar.f71973c.setColorFilter(colorFilter2);
        aVar.b();
    }

    public final void a(float f2) {
        float f3 = f2;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f71965a, false, 82393, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f71965a, false, 82393, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        a aVar = this.f71968c;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, aVar, a.f71971a, false, 82424, new Class[]{Float.TYPE}, Void.TYPE)) {
            a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, aVar2, a.f71971a, false, 82424, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (f3 != aVar.p) {
            aVar.p = f3;
            aVar.b();
        }
    }

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f71965a, false, 82397, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f71965a, false, 82397, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas2.rotate(this.f71969d, bounds.exactCenterX(), bounds.exactCenterY());
        a aVar = this.f71968c;
        if (PatchProxy.isSupport(new Object[]{canvas2, bounds}, aVar, a.f71971a, false, 82412, new Class[]{Canvas.class, Rect.class}, Void.TYPE)) {
            a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{canvas2, bounds}, aVar2, a.f71971a, false, 82412, new Class[]{Canvas.class, Rect.class}, Void.TYPE);
        } else {
            RectF rectF = aVar.f71972b;
            rectF.set(bounds);
            rectF.inset(aVar.i, aVar.i);
            float f2 = (aVar.f71975e + aVar.g) * 360.0f;
            float f3 = ((aVar.f71976f + aVar.g) * 360.0f) - f2;
            aVar.f71973c.setColor(aVar.w);
            a aVar3 = aVar;
            canvas.drawArc(rectF, f2, f3, false, aVar.f71973c);
            a aVar4 = aVar3;
            if (PatchProxy.isSupport(new Object[]{canvas2, Float.valueOf(f2), Float.valueOf(f3), bounds}, aVar3, a.f71971a, false, 82413, new Class[]{Canvas.class, Float.TYPE, Float.TYPE, Rect.class}, Void.TYPE)) {
                a aVar5 = aVar4;
                PatchProxy.accessDispatch(new Object[]{canvas2, Float.valueOf(f2), Float.valueOf(f3), bounds}, aVar5, a.f71971a, false, 82413, new Class[]{Canvas.class, Float.TYPE, Float.TYPE, Rect.class}, Void.TYPE);
            } else if (aVar4.n) {
                if (aVar4.o == null) {
                    aVar4.o = new Path();
                    aVar4.o.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    aVar4.o.reset();
                }
                float f4 = ((float) (((int) aVar4.i) / 2)) * aVar4.p;
                double cos = aVar4.q * Math.cos(0.0d);
                double exactCenterX = (double) bounds.exactCenterX();
                Double.isNaN(exactCenterX);
                double sin = aVar4.q * Math.sin(0.0d);
                double exactCenterY = (double) bounds.exactCenterY();
                Double.isNaN(exactCenterY);
                aVar4.o.moveTo(0.0f, 0.0f);
                aVar4.o.lineTo(((float) aVar4.r) * aVar4.p, 0.0f);
                aVar4.o.lineTo((((float) aVar4.r) * aVar4.p) / 2.0f, ((float) aVar4.s) * aVar4.p);
                aVar4.o.offset(((float) (cos + exactCenterX)) - f4, (float) (sin + exactCenterY));
                aVar4.o.close();
                aVar4.f71974d.setColor(aVar4.w);
                canvas2.rotate((f2 + f3) - 5.0f, bounds.exactCenterX(), bounds.exactCenterY());
                canvas2.drawPath(aVar4.o, aVar4.f71974d);
            }
            if (aVar4.t < 255) {
                aVar4.u.setColor(aVar4.v);
                aVar4.u.setAlpha(255 - aVar4.t);
                canvas2.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), (float) (bounds.width() / 2), aVar4.u);
            }
        }
        canvas2.restoreToCount(save);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f71965a, false, 82391, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f71965a, false, 82391, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 == 0) {
            a(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            a(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f71965a, false, 82392, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f71965a, false, 82392, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f71968c.a(z);
    }

    public final void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(0.0f), Float.valueOf(f3)}, this, f71965a, false, 82394, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(0.0f), Float.valueOf(f3)}, this, f71965a, false, 82394, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.f71968c.a(0.0f);
        this.f71968c.b(f3);
    }

    private void a(double d2, double d3, double d4, double d5, float f2, float f3) {
        float f4;
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5), Float.valueOf(f2), Float.valueOf(f3)}, this, f71965a, false, 82390, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5), Float.valueOf(f2), Float.valueOf(f3)}, this, f71965a, false, 82390, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        a aVar = this.f71968c;
        float f5 = this.i.getDisplayMetrics().density;
        double d6 = (double) f5;
        Double.isNaN(d6);
        this.l = d2 * d6;
        Double.isNaN(d6);
        this.m = d3 * d6;
        float f6 = ((float) d5) * f5;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f6)}, aVar, a.f71971a, false, 82418, new Class[]{Float.TYPE}, Void.TYPE)) {
            a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f6)}, aVar2, a.f71971a, false, 82418, new Class[]{Float.TYPE}, Void.TYPE);
        } else {
            aVar.h = f6;
            aVar.f71973c.setStrokeWidth(f6);
            aVar.b();
        }
        Double.isNaN(d6);
        aVar.q = d6 * d4;
        aVar.a(0);
        aVar.r = (int) (f2 * f5);
        aVar.s = (int) (f5 * f3);
        int i2 = (int) this.l;
        int i3 = (int) this.m;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, aVar, a.f71971a, false, 82422, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, aVar, a.f71971a, false, 82422, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        float min = (float) Math.min(i2, i3);
        if (aVar.q <= 0.0d || min < 0.0f) {
            f4 = (float) Math.ceil((double) (aVar.h / 2.0f));
        } else {
            double d7 = (double) (min / 2.0f);
            double d8 = aVar.q;
            Double.isNaN(d7);
            f4 = (float) (d7 - d8);
        }
        aVar.i = f4;
    }
}
