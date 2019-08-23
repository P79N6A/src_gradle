package com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

public final class MaterialProgressDrawable extends Drawable implements Animatable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34809a;

    /* renamed from: b  reason: collision with root package name */
    static final Interpolator f34810b = new FastOutSlowInInterpolator();
    private static final Interpolator g = new LinearInterpolator();
    private static final int[] h = {-16777216};

    /* renamed from: c  reason: collision with root package name */
    final a f34811c;

    /* renamed from: d  reason: collision with root package name */
    public float f34812d;

    /* renamed from: e  reason: collision with root package name */
    float f34813e;

    /* renamed from: f  reason: collision with root package name */
    boolean f34814f;
    private final ArrayList<Animation> i = new ArrayList<>();
    private Resources j;
    private View k;
    private Animation l;
    private double m;
    private double n;
    private final Drawable.Callback o = new Drawable.Callback() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34821a;

        public final void invalidateDrawable(Drawable drawable) {
            if (PatchProxy.isSupport(new Object[]{drawable}, this, f34821a, false, 24739, new Class[]{Drawable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{drawable}, this, f34821a, false, 24739, new Class[]{Drawable.class}, Void.TYPE);
                return;
            }
            MaterialProgressDrawable.this.invalidateSelf();
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Runnable runnable2 = runnable;
            if (PatchProxy.isSupport(new Object[]{drawable, runnable2}, this, f34821a, false, 24741, new Class[]{Drawable.class, Runnable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{drawable, runnable2}, this, f34821a, false, 24741, new Class[]{Drawable.class, Runnable.class}, Void.TYPE);
                return;
            }
            MaterialProgressDrawable.this.unscheduleSelf(runnable2);
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Runnable runnable2 = runnable;
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{drawable, runnable2, new Long(j2)}, this, f34821a, false, 24740, new Class[]{Drawable.class, Runnable.class, Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{drawable, runnable2, new Long(j2)}, this, f34821a, false, 24740, new Class[]{Drawable.class, Runnable.class, Long.TYPE}, Void.TYPE);
                return;
            }
            MaterialProgressDrawable.this.scheduleSelf(runnable2, j2);
        }
    };

    @Retention(RetentionPolicy.SOURCE)
    public @interface ProgressDrawableSize {
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34823a;

        /* renamed from: b  reason: collision with root package name */
        final RectF f34824b = new RectF();

        /* renamed from: c  reason: collision with root package name */
        final Paint f34825c = new Paint();

        /* renamed from: d  reason: collision with root package name */
        final Paint f34826d = new Paint();

        /* renamed from: e  reason: collision with root package name */
        public float f34827e = 0.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f34828f = 0.0f;
        public float g = 0.0f;
        public float h = 5.0f;
        public float i = 2.5f;
        int[] j;
        int k;
        public float l;
        public float m;
        public float n;
        boolean o;
        Path p;
        float q;
        public double r;
        int s;
        int t;
        public int u;
        final Paint v = new Paint(1);
        public int w;
        public int x;
        private final Drawable.Callback y;

        /* access modifiers changed from: package-private */
        public int a() {
            return (this.k + 1) % this.j.length;
        }

        public final void b() {
            this.l = this.f34827e;
            this.m = this.f34828f;
            this.n = this.g;
        }

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f34823a, false, 24755, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34823a, false, 24755, new Class[0], Void.TYPE);
                return;
            }
            this.l = 0.0f;
            this.m = 0.0f;
            this.n = 0.0f;
            a(0.0f);
            b(0.0f);
            c(0.0f);
        }

        /* access modifiers changed from: package-private */
        public void d() {
            if (PatchProxy.isSupport(new Object[0], this, f34823a, false, 24756, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34823a, false, 24756, new Class[0], Void.TYPE);
                return;
            }
            this.y.invalidateDrawable(null);
        }

        public final void a(int i2) {
            this.k = i2;
            this.x = this.j[this.k];
        }

        public final void a(@NonNull int[] iArr) {
            if (PatchProxy.isSupport(new Object[]{iArr}, this, f34823a, false, 24744, new Class[]{int[].class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iArr}, this, f34823a, false, 24744, new Class[]{int[].class}, Void.TYPE);
                return;
            }
            this.j = iArr;
            a(0);
        }

        a(Drawable.Callback callback) {
            this.y = callback;
            this.f34825c.setStrokeCap(Paint.Cap.SQUARE);
            this.f34825c.setAntiAlias(true);
            this.f34825c.setStyle(Paint.Style.STROKE);
            this.f34826d.setStyle(Paint.Style.FILL);
            this.f34826d.setAntiAlias(true);
        }

        public final void a(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f34823a, false, 24749, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f34823a, false, 24749, new Class[]{Float.TYPE}, Void.TYPE);
                return;
            }
            this.f34827e = f2;
            d();
        }

        public final void b(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f34823a, false, 24750, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f34823a, false, 24750, new Class[]{Float.TYPE}, Void.TYPE);
                return;
            }
            this.f34828f = f2;
            d();
        }

        public final void c(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f34823a, false, 24751, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f34823a, false, 24751, new Class[]{Float.TYPE}, Void.TYPE);
                return;
            }
            this.g = f2;
            d();
        }

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34823a, false, 24753, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34823a, false, 24753, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (this.o != z) {
                this.o = z;
                d();
            }
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return (int) this.n;
    }

    public final int getIntrinsicWidth() {
        return (int) this.m;
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f34809a, false, 24721, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f34809a, false, 24721, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 == 0) {
            a(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            a(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34809a, false, 24722, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34809a, false, 24722, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f34811c.a(z);
    }

    public final int getAlpha() {
        return this.f34811c.u;
    }

    public final void stop() {
        if (PatchProxy.isSupport(new Object[0], this, f34809a, false, 24732, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34809a, false, 24732, new Class[0], Void.TYPE);
            return;
        }
        this.k.clearAnimation();
        c(0.0f);
        this.f34811c.a(false);
        this.f34811c.a(0);
        this.f34811c.c();
    }

    public final boolean isRunning() {
        if (PatchProxy.isSupport(new Object[0], this, f34809a, false, 24730, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34809a, false, 24730, new Class[0], Boolean.TYPE)).booleanValue();
        }
        ArrayList<Animation> arrayList = this.i;
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
        if (PatchProxy.isSupport(new Object[0], this, f34809a, false, 24731, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34809a, false, 24731, new Class[0], Void.TYPE);
            return;
        }
        this.l.reset();
        this.f34811c.b();
        if (this.f34811c.f34828f != this.f34811c.f34827e) {
            this.f34814f = true;
            this.l.setDuration(666);
            this.k.startAnimation(this.l);
            return;
        }
        this.f34811c.a(0);
        this.f34811c.c();
        this.l.setDuration(1332);
        this.k.startAnimation(this.l);
    }

    public final void b(int i2) {
        this.f34811c.w = i2;
    }

    public final void setAlpha(int i2) {
        this.f34811c.u = i2;
    }

    /* access modifiers changed from: package-private */
    public final float a(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f34809a, false, 24733, new Class[]{a.class}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f34809a, false, 24733, new Class[]{a.class}, Float.TYPE)).floatValue();
        }
        double d2 = (double) aVar2.h;
        Double.isNaN(d2);
        return (float) Math.toRadians(d2 / (aVar2.r * 6.283185307179586d));
    }

    public final void b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f34809a, false, 24725, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f34809a, false, 24725, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f34811c.c(f2);
    }

    /* access modifiers changed from: package-private */
    public final void c(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f34809a, false, 24729, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f34809a, false, 24729, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f34812d = f2;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        ColorFilter colorFilter2 = colorFilter;
        if (PatchProxy.isSupport(new Object[]{colorFilter2}, this, f34809a, false, 24728, new Class[]{ColorFilter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{colorFilter2}, this, f34809a, false, 24728, new Class[]{ColorFilter.class}, Void.TYPE);
            return;
        }
        a aVar = this.f34811c;
        if (PatchProxy.isSupport(new Object[]{colorFilter2}, aVar, a.f34823a, false, 24747, new Class[]{ColorFilter.class}, Void.TYPE)) {
            a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{colorFilter2}, aVar2, a.f34823a, false, 24747, new Class[]{ColorFilter.class}, Void.TYPE);
            return;
        }
        aVar.f34825c.setColorFilter(colorFilter2);
        aVar.d();
    }

    public final void a(float f2) {
        float f3 = f2;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f34809a, false, 24723, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f34809a, false, 24723, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        a aVar = this.f34811c;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, aVar, a.f34823a, false, 24754, new Class[]{Float.TYPE}, Void.TYPE)) {
            a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, aVar2, a.f34823a, false, 24754, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (f3 != aVar.q) {
            aVar.q = f3;
            aVar.d();
        }
    }

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f34809a, false, 24727, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f34809a, false, 24727, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas2.rotate(this.f34812d, bounds.exactCenterX(), bounds.exactCenterY());
        a aVar = this.f34811c;
        if (PatchProxy.isSupport(new Object[]{canvas2, bounds}, aVar, a.f34823a, false, 24742, new Class[]{Canvas.class, Rect.class}, Void.TYPE)) {
            a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{canvas2, bounds}, aVar2, a.f34823a, false, 24742, new Class[]{Canvas.class, Rect.class}, Void.TYPE);
        } else {
            RectF rectF = aVar.f34824b;
            rectF.set(bounds);
            rectF.inset(aVar.i, aVar.i);
            float f2 = (aVar.f34827e + aVar.g) * 360.0f;
            float f3 = ((aVar.f34828f + aVar.g) * 360.0f) - f2;
            aVar.f34825c.setColor(aVar.x);
            a aVar3 = aVar;
            canvas.drawArc(rectF, f2, f3, false, aVar.f34825c);
            a aVar4 = aVar3;
            if (PatchProxy.isSupport(new Object[]{canvas2, Float.valueOf(f2), Float.valueOf(f3), bounds}, aVar3, a.f34823a, false, 24743, new Class[]{Canvas.class, Float.TYPE, Float.TYPE, Rect.class}, Void.TYPE)) {
                a aVar5 = aVar4;
                PatchProxy.accessDispatch(new Object[]{canvas2, Float.valueOf(f2), Float.valueOf(f3), bounds}, aVar5, a.f34823a, false, 24743, new Class[]{Canvas.class, Float.TYPE, Float.TYPE, Rect.class}, Void.TYPE);
            } else if (aVar4.o) {
                if (aVar4.p == null) {
                    aVar4.p = new Path();
                    aVar4.p.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    aVar4.p.reset();
                }
                float f4 = ((float) (((int) aVar4.i) / 2)) * aVar4.q;
                double cos = aVar4.r * Math.cos(0.0d);
                double exactCenterX = (double) bounds.exactCenterX();
                Double.isNaN(exactCenterX);
                double sin = aVar4.r * Math.sin(0.0d);
                double exactCenterY = (double) bounds.exactCenterY();
                Double.isNaN(exactCenterY);
                aVar4.p.moveTo(0.0f, 0.0f);
                aVar4.p.lineTo(((float) aVar4.s) * aVar4.q, 0.0f);
                aVar4.p.lineTo((((float) aVar4.s) * aVar4.q) / 2.0f, ((float) aVar4.t) * aVar4.q);
                aVar4.p.offset(((float) (cos + exactCenterX)) - f4, (float) (sin + exactCenterY));
                aVar4.p.close();
                aVar4.f34826d.setColor(aVar4.x);
                canvas2.rotate((f2 + f3) - 5.0f, bounds.exactCenterX(), bounds.exactCenterY());
                canvas2.drawPath(aVar4.p, aVar4.f34826d);
            }
            if (aVar4.u < 255) {
                aVar4.v.setColor(aVar4.w);
                aVar4.v.setAlpha(255 - aVar4.u);
                canvas2.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), (float) (bounds.width() / 2), aVar4.v);
            }
        }
        canvas2.restoreToCount(save);
    }

    MaterialProgressDrawable(Context context, View view) {
        this.k = view;
        this.j = context.getResources();
        this.f34811c = new a(this.o);
        this.f34811c.a(h);
        a(1);
        if (PatchProxy.isSupport(new Object[0], this, f34809a, false, 24736, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34809a, false, 24736, new Class[0], Void.TYPE);
            return;
        }
        final a aVar = this.f34811c;
        AnonymousClass1 r0 = new Animation() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34815a;

            public final void applyTransformation(float f2, Transformation transformation) {
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), transformation}, this, f34815a, false, 24737, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), transformation}, this, f34815a, false, 24737, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE);
                } else if (MaterialProgressDrawable.this.f34814f) {
                    MaterialProgressDrawable.this.b(f2, aVar);
                } else {
                    float a2 = MaterialProgressDrawable.this.a(aVar);
                    float f3 = aVar.m;
                    float f4 = aVar.l;
                    float f5 = aVar.n;
                    MaterialProgressDrawable.this.a(f2, aVar);
                    if (f2 <= 0.5f) {
                        Interpolator interpolator = MaterialProgressDrawable.f34810b;
                        aVar.a(f4 + ((0.8f - a2) * interpolator.getInterpolation(f2 / 0.5f)));
                    }
                    if (f2 > 0.5f) {
                        Interpolator interpolator2 = MaterialProgressDrawable.f34810b;
                        aVar.b(f3 + ((0.8f - a2) * interpolator2.getInterpolation((f2 - 0.5f) / 0.5f)));
                    }
                    aVar.c(f5 + (0.25f * f2));
                    MaterialProgressDrawable.this.c((216.0f * f2) + ((MaterialProgressDrawable.this.f34813e / 5.0f) * 1080.0f));
                }
            }
        };
        r0.setRepeatCount(-1);
        r0.setRepeatMode(1);
        r0.setInterpolator(g);
        r0.setAnimationListener(new Animation.AnimationListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34818a;

            public final void onAnimationEnd(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                MaterialProgressDrawable.this.f34813e = 0.0f;
            }

            public final void onAnimationRepeat(Animation animation) {
                Animation animation2 = animation;
                if (PatchProxy.isSupport(new Object[]{animation2}, this, f34818a, false, 24738, new Class[]{Animation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animation2}, this, f34818a, false, 24738, new Class[]{Animation.class}, Void.TYPE);
                    return;
                }
                aVar.b();
                a aVar = aVar;
                if (PatchProxy.isSupport(new Object[0], aVar, a.f34823a, false, 24746, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, a.f34823a, false, 24746, new Class[0], Void.TYPE);
                } else {
                    aVar.a(aVar.a());
                }
                aVar.a(aVar.f34828f);
                if (MaterialProgressDrawable.this.f34814f) {
                    MaterialProgressDrawable.this.f34814f = false;
                    animation2.setDuration(1332);
                    aVar.a(false);
                    return;
                }
                MaterialProgressDrawable.this.f34813e = (MaterialProgressDrawable.this.f34813e + 1.0f) % 5.0f;
            }
        });
        this.l = r0;
    }

    /* access modifiers changed from: package-private */
    public final void b(float f2, a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), aVar2}, this, f34809a, false, 24735, new Class[]{Float.TYPE, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), aVar2}, this, f34809a, false, 24735, new Class[]{Float.TYPE, a.class}, Void.TYPE);
            return;
        }
        a(f2, aVar);
        aVar2.a(aVar2.l + (((aVar2.m - a(aVar2)) - aVar2.l) * f2));
        aVar2.b(aVar2.m);
        aVar2.c(aVar2.n + ((((float) (Math.floor((double) (aVar2.n / 0.8f)) + 1.0d)) - aVar2.n) * f2));
    }

    public final void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(0.0f), Float.valueOf(f3)}, this, f34809a, false, 24724, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(0.0f), Float.valueOf(f3)}, this, f34809a, false, 24724, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.f34811c.a(0.0f);
        this.f34811c.b(f3);
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2, a aVar) {
        int i2;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), aVar2}, this, f34809a, false, 24734, new Class[]{Float.TYPE, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), aVar2}, this, f34809a, false, 24734, new Class[]{Float.TYPE, a.class}, Void.TYPE);
            return;
        }
        if (f2 > 0.75f) {
            float f3 = (f2 - 0.75f) / 0.25f;
            int i3 = aVar2.j[aVar2.k];
            if (PatchProxy.isSupport(new Object[0], aVar, a.f34823a, false, 24745, new Class[0], Integer.TYPE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], aVar, a.f34823a, false, 24745, new Class[0], Integer.TYPE)).intValue();
            } else {
                i2 = aVar2.j[aVar.a()];
            }
            int i4 = (i3 >> 24) & 255;
            int i5 = (i3 >> 16) & 255;
            int i6 = (i3 >> 8) & 255;
            int i7 = i3 & 255;
            aVar2.x = ((i4 + ((int) (((float) (((i2 >> 24) & 255) - i4)) * f3))) << 24) | ((i5 + ((int) (((float) (((i2 >> 16) & 255) - i5)) * f3))) << 16) | ((i6 + ((int) (((float) (((i2 >> 8) & 255) - i6)) * f3))) << 8) | (i7 + ((int) (f3 * ((float) ((i2 & 255) - i7)))));
        }
    }

    private void a(double d2, double d3, double d4, double d5, float f2, float f3) {
        float f4;
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5), Float.valueOf(f2), Float.valueOf(f3)}, this, f34809a, false, 24720, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5), Float.valueOf(f2), Float.valueOf(f3)}, this, f34809a, false, 24720, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        a aVar = this.f34811c;
        float f5 = this.j.getDisplayMetrics().density;
        double d6 = (double) f5;
        Double.isNaN(d6);
        this.m = d2 * d6;
        Double.isNaN(d6);
        this.n = d3 * d6;
        float f6 = ((float) d5) * f5;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f6)}, aVar, a.f34823a, false, 24748, new Class[]{Float.TYPE}, Void.TYPE)) {
            a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f6)}, aVar2, a.f34823a, false, 24748, new Class[]{Float.TYPE}, Void.TYPE);
        } else {
            aVar.h = f6;
            aVar.f34825c.setStrokeWidth(f6);
            aVar.d();
        }
        Double.isNaN(d6);
        aVar.r = d6 * d4;
        aVar.a(0);
        aVar.s = (int) (f2 * f5);
        aVar.t = (int) (f5 * f3);
        int i2 = (int) this.m;
        int i3 = (int) this.n;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, aVar, a.f34823a, false, 24752, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, aVar, a.f34823a, false, 24752, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        float min = (float) Math.min(i2, i3);
        if (aVar.r <= 0.0d || min < 0.0f) {
            f4 = (float) Math.ceil((double) (aVar.h / 2.0f));
        } else {
            double d7 = (double) (min / 2.0f);
            double d8 = aVar.r;
            Double.isNaN(d7);
            f4 = (float) (d7 - d8);
        }
        aVar.i = f4;
    }
}
