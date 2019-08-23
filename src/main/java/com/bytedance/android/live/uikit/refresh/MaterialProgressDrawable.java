package com.bytedance.android.live.uikit.refresh;

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
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

public final class MaterialProgressDrawable extends Drawable implements Animatable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8594a;

    /* renamed from: b  reason: collision with root package name */
    public static final Interpolator f8595b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public static final Interpolator f8596c = new c((byte) 0);
    private static final Interpolator h = new LinearInterpolator();
    private static final Interpolator i = new AccelerateDecelerateInterpolator();

    /* renamed from: d  reason: collision with root package name */
    final b f8597d;

    /* renamed from: e  reason: collision with root package name */
    public float f8598e;

    /* renamed from: f  reason: collision with root package name */
    public float f8599f;
    boolean g;
    private final int[] j = {-16777216};
    private final ArrayList<Animation> k = new ArrayList<>();
    private Resources l;
    private View m;
    private Animation n;
    private double o;
    private double p;
    private final Drawable.Callback q = new Drawable.Callback() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8606a;

        public final void invalidateDrawable(Drawable drawable) {
            if (PatchProxy.isSupport(new Object[]{drawable}, this, f8606a, false, 2206, new Class[]{Drawable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{drawable}, this, f8606a, false, 2206, new Class[]{Drawable.class}, Void.TYPE);
                return;
            }
            MaterialProgressDrawable.this.invalidateSelf();
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Runnable runnable2 = runnable;
            if (PatchProxy.isSupport(new Object[]{drawable, runnable2}, this, f8606a, false, 2208, new Class[]{Drawable.class, Runnable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{drawable, runnable2}, this, f8606a, false, 2208, new Class[]{Drawable.class, Runnable.class}, Void.TYPE);
                return;
            }
            MaterialProgressDrawable.this.unscheduleSelf(runnable2);
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Runnable runnable2 = runnable;
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{drawable, runnable2, new Long(j2)}, this, f8606a, false, 2207, new Class[]{Drawable.class, Runnable.class, Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{drawable, runnable2, new Long(j2)}, this, f8606a, false, 2207, new Class[]{Drawable.class, Runnable.class, Long.TYPE}, Void.TYPE);
                return;
            }
            MaterialProgressDrawable.this.scheduleSelf(runnable2, j2);
        }
    };

    @Retention(RetentionPolicy.CLASS)
    public @interface ProgressDrawableSize {
    }

    static class a extends AccelerateDecelerateInterpolator {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8608a;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final float getInterpolation(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f8608a, false, 2209, new Class[]{Float.TYPE}, Float.TYPE)) {
                return ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f8608a, false, 2209, new Class[]{Float.TYPE}, Float.TYPE)).floatValue();
            }
            return super.getInterpolation(Math.max(0.0f, (f2 - 0.5f) * 2.0f));
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8609a;

        /* renamed from: b  reason: collision with root package name */
        final RectF f8610b = new RectF();

        /* renamed from: c  reason: collision with root package name */
        final Paint f8611c = new Paint();

        /* renamed from: d  reason: collision with root package name */
        final Paint f8612d = new Paint();

        /* renamed from: e  reason: collision with root package name */
        public float f8613e = 0.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f8614f = 0.0f;
        public float g = 0.0f;
        public float h = 5.0f;
        public float i = 2.5f;
        int[] j;
        public int k;
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
        final Paint v = new Paint();
        public int w;
        private final Drawable.Callback x;

        public final void a() {
            this.l = this.f8613e;
            this.m = this.f8614f;
            this.n = this.g;
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f8609a, false, 2220, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f8609a, false, 2220, new Class[0], Void.TYPE);
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
        public void c() {
            if (PatchProxy.isSupport(new Object[0], this, f8609a, false, 2221, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f8609a, false, 2221, new Class[0], Void.TYPE);
                return;
            }
            this.x.invalidateDrawable(null);
        }

        public final void a(@NonNull int[] iArr) {
            this.j = iArr;
            this.k = 0;
        }

        public b(Drawable.Callback callback) {
            this.x = callback;
            this.f8611c.setStrokeCap(Paint.Cap.SQUARE);
            this.f8611c.setAntiAlias(true);
            this.f8611c.setStyle(Paint.Style.STROKE);
            this.f8612d.setStyle(Paint.Style.FILL);
            this.f8612d.setAntiAlias(true);
        }

        public final void a(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f8609a, false, 2214, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f8609a, false, 2214, new Class[]{Float.TYPE}, Void.TYPE);
                return;
            }
            this.f8613e = f2;
            c();
        }

        public final void b(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f8609a, false, 2215, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f8609a, false, 2215, new Class[]{Float.TYPE}, Void.TYPE);
                return;
            }
            this.f8614f = f2;
            c();
        }

        public final void c(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f8609a, false, 2216, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f8609a, false, 2216, new Class[]{Float.TYPE}, Void.TYPE);
                return;
            }
            this.g = f2;
            c();
        }

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f8609a, false, 2218, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f8609a, false, 2218, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (this.o != z) {
                this.o = z;
                c();
            }
        }
    }

    static class c extends AccelerateDecelerateInterpolator {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8615a;

        private c() {
        }

        /* synthetic */ c(byte b2) {
            this();
        }

        public final float getInterpolation(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f8615a, false, 2222, new Class[]{Float.TYPE}, Float.TYPE)) {
                return ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f8615a, false, 2222, new Class[]{Float.TYPE}, Float.TYPE)).floatValue();
            }
            return super.getInterpolation(Math.min(1.0f, 2.0f * f2));
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return (int) this.p;
    }

    public final int getIntrinsicWidth() {
        return (int) this.o;
    }

    public final int getAlpha() {
        return this.f8597d.u;
    }

    public final void stop() {
        if (PatchProxy.isSupport(new Object[0], this, f8594a, false, PushConstants.ONTIME_NOTIFICATION, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8594a, false, PushConstants.ONTIME_NOTIFICATION, new Class[0], Void.TYPE);
            return;
        }
        this.m.clearAnimation();
        a(0.0f);
        this.f8597d.a(false);
        this.f8597d.k = 0;
        this.f8597d.b();
    }

    public final boolean isRunning() {
        if (PatchProxy.isSupport(new Object[0], this, f8594a, false, 2199, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f8594a, false, 2199, new Class[0], Boolean.TYPE)).booleanValue();
        }
        ArrayList<Animation> arrayList = this.k;
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
        if (PatchProxy.isSupport(new Object[0], this, f8594a, false, PushConstants.EXPIRE_NOTIFICATION, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8594a, false, PushConstants.EXPIRE_NOTIFICATION, new Class[0], Void.TYPE);
            return;
        }
        this.n.reset();
        this.f8597d.a();
        if (this.f8597d.f8614f != this.f8597d.f8613e) {
            this.g = true;
            this.n.setDuration(666);
            this.m.startAnimation(this.n);
            return;
        }
        this.f8597d.k = 0;
        this.f8597d.b();
        this.n.setDuration(1333);
        this.m.startAnimation(this.n);
    }

    public final void b(int i2) {
        this.f8597d.w = i2;
    }

    public final void setAlpha(int i2) {
        this.f8597d.u = i2;
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f8594a, false, 2198, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f8594a, false, 2198, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f8598e = f2;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        ColorFilter colorFilter2 = colorFilter;
        if (PatchProxy.isSupport(new Object[]{colorFilter2}, this, f8594a, false, 2197, new Class[]{ColorFilter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{colorFilter2}, this, f8594a, false, 2197, new Class[]{ColorFilter.class}, Void.TYPE);
            return;
        }
        b bVar = this.f8597d;
        if (PatchProxy.isSupport(new Object[]{colorFilter2}, bVar, b.f8609a, false, 2212, new Class[]{ColorFilter.class}, Void.TYPE)) {
            b bVar2 = bVar;
            PatchProxy.accessDispatch(new Object[]{colorFilter2}, bVar2, b.f8609a, false, 2212, new Class[]{ColorFilter.class}, Void.TYPE);
            return;
        }
        bVar.f8611c.setColorFilter(colorFilter2);
        bVar.c();
    }

    public final void a(@ProgressDrawableSize int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8594a, false, 2190, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8594a, false, 2190, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 == 0) {
            a(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            a(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f8594a, false, 2196, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f8594a, false, 2196, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas2.rotate(this.f8598e, bounds.exactCenterX(), bounds.exactCenterY());
        b bVar = this.f8597d;
        if (PatchProxy.isSupport(new Object[]{canvas2, bounds}, bVar, b.f8609a, false, 2210, new Class[]{Canvas.class, Rect.class}, Void.TYPE)) {
            b bVar2 = bVar;
            PatchProxy.accessDispatch(new Object[]{canvas2, bounds}, bVar2, b.f8609a, false, 2210, new Class[]{Canvas.class, Rect.class}, Void.TYPE);
        } else {
            RectF rectF = bVar.f8610b;
            rectF.set(bounds);
            rectF.inset(bVar.i, bVar.i);
            float f2 = (bVar.f8613e + bVar.g) * 360.0f;
            float f3 = ((bVar.f8614f + bVar.g) * 360.0f) - f2;
            bVar.f8611c.setColor(bVar.j[bVar.k]);
            b bVar3 = bVar;
            canvas.drawArc(rectF, f2, f3, false, bVar.f8611c);
            b bVar4 = bVar3;
            if (PatchProxy.isSupport(new Object[]{canvas2, Float.valueOf(f2), Float.valueOf(f3), bounds}, bVar3, b.f8609a, false, 2211, new Class[]{Canvas.class, Float.TYPE, Float.TYPE, Rect.class}, Void.TYPE)) {
                b bVar5 = bVar4;
                PatchProxy.accessDispatch(new Object[]{canvas2, Float.valueOf(f2), Float.valueOf(f3), bounds}, bVar5, b.f8609a, false, 2211, new Class[]{Canvas.class, Float.TYPE, Float.TYPE, Rect.class}, Void.TYPE);
            } else if (bVar4.o) {
                if (bVar4.p == null) {
                    bVar4.p = new Path();
                    bVar4.p.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    bVar4.p.reset();
                }
                float f4 = ((float) (((int) bVar4.i) / 2)) * bVar4.q;
                double cos = bVar4.r * Math.cos(0.0d);
                double exactCenterX = (double) bounds.exactCenterX();
                Double.isNaN(exactCenterX);
                double sin = bVar4.r * Math.sin(0.0d);
                double exactCenterY = (double) bounds.exactCenterY();
                Double.isNaN(exactCenterY);
                bVar4.p.moveTo(0.0f, 0.0f);
                bVar4.p.lineTo(((float) bVar4.s) * bVar4.q, 0.0f);
                bVar4.p.lineTo((((float) bVar4.s) * bVar4.q) / 2.0f, ((float) bVar4.t) * bVar4.q);
                bVar4.p.offset(((float) (cos + exactCenterX)) - f4, (float) (sin + exactCenterY));
                bVar4.p.close();
                bVar4.f8612d.setColor(bVar4.j[bVar4.k]);
                canvas2.rotate((f2 + f3) - 5.0f, bounds.exactCenterX(), bounds.exactCenterY());
                canvas2.drawPath(bVar4.p, bVar4.f8612d);
            }
            if (bVar4.u < 255) {
                bVar4.v.setColor(bVar4.w);
                bVar4.v.setAlpha(255 - bVar4.u);
                canvas2.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), (float) (bounds.width() / 2), bVar4.v);
            }
        }
        canvas2.restoreToCount(save);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f8594a, false, 2191, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f8594a, false, 2191, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f8597d.a(z);
    }

    public MaterialProgressDrawable(Context context, View view) {
        this.m = view;
        this.l = context.getResources();
        this.f8597d = new b(this.q);
        this.f8597d.a(this.j);
        a(1);
        if (PatchProxy.isSupport(new Object[0], this, f8594a, false, 2203, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8594a, false, 2203, new Class[0], Void.TYPE);
            return;
        }
        final b bVar = this.f8597d;
        AnonymousClass1 r12 = new Animation() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8600a;

            public final void applyTransformation(float f2, Transformation transformation) {
                float f3 = f2;
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), transformation}, this, f8600a, false, 2204, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), transformation}, this, f8600a, false, 2204, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE);
                    return;
                }
                if (MaterialProgressDrawable.this.g) {
                    MaterialProgressDrawable materialProgressDrawable = MaterialProgressDrawable.this;
                    b bVar = bVar;
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), bVar}, materialProgressDrawable, MaterialProgressDrawable.f8594a, false, PushConstants.DELAY_NOTIFICATION, new Class[]{Float.TYPE, b.class}, Void.TYPE)) {
                        MaterialProgressDrawable materialProgressDrawable2 = materialProgressDrawable;
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), bVar}, materialProgressDrawable2, MaterialProgressDrawable.f8594a, false, PushConstants.DELAY_NOTIFICATION, new Class[]{Float.TYPE, b.class}, Void.TYPE);
                    } else {
                        bVar.a(bVar.l + ((bVar.m - bVar.l) * f3));
                        bVar.c(bVar.n + ((((float) (Math.floor((double) (bVar.n / 0.8f)) + 1.0d)) - bVar.n) * f3));
                    }
                } else {
                    double d2 = (double) bVar.h;
                    Double.isNaN(d2);
                    float radians = (float) Math.toRadians(d2 / (bVar.r * 6.283185307179586d));
                    float f4 = bVar.m;
                    float f5 = bVar.l;
                    float f6 = bVar.n;
                    bVar.b(f4 + ((0.8f - radians) * MaterialProgressDrawable.f8596c.getInterpolation(f3)));
                    bVar.a(f5 + (MaterialProgressDrawable.f8595b.getInterpolation(f3) * 0.8f));
                    bVar.c(f6 + (0.25f * f3));
                    MaterialProgressDrawable.this.a((144.0f * f3) + ((MaterialProgressDrawable.this.f8599f / 5.0f) * 720.0f));
                }
            }
        };
        r12.setRepeatCount(-1);
        r12.setRepeatMode(1);
        r12.setInterpolator(h);
        r12.setAnimationListener(new Animation.AnimationListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8603a;

            public final void onAnimationEnd(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                MaterialProgressDrawable.this.f8599f = 0.0f;
            }

            public final void onAnimationRepeat(Animation animation) {
                if (PatchProxy.isSupport(new Object[]{animation}, this, f8603a, false, 2205, new Class[]{Animation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animation}, this, f8603a, false, 2205, new Class[]{Animation.class}, Void.TYPE);
                    return;
                }
                bVar.a();
                b bVar = bVar;
                bVar.k = (bVar.k + 1) % bVar.j.length;
                bVar.a(bVar.f8614f);
                if (MaterialProgressDrawable.this.g) {
                    MaterialProgressDrawable.this.g = false;
                    animation.setDuration(1333);
                    bVar.a(false);
                    return;
                }
                MaterialProgressDrawable.this.f8599f = (MaterialProgressDrawable.this.f8599f + 1.0f) % 5.0f;
            }
        });
        this.n = r12;
    }

    public final void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(0.0f), Float.valueOf(f3)}, this, f8594a, false, 2193, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(0.0f), Float.valueOf(f3)}, this, f8594a, false, 2193, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.f8597d.a(0.0f);
        this.f8597d.b(f3);
    }

    private void a(double d2, double d3, double d4, double d5, float f2, float f3) {
        float f4;
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5), Float.valueOf(f2), Float.valueOf(f3)}, this, f8594a, false, 2189, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5), Float.valueOf(f2), Float.valueOf(f3)}, this, f8594a, false, 2189, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        b bVar = this.f8597d;
        float f5 = this.l.getDisplayMetrics().density;
        double d6 = (double) f5;
        Double.isNaN(d6);
        this.o = d2 * d6;
        Double.isNaN(d6);
        this.p = d3 * d6;
        float f6 = ((float) d5) * f5;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f6)}, bVar, b.f8609a, false, 2213, new Class[]{Float.TYPE}, Void.TYPE)) {
            b bVar2 = bVar;
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f6)}, bVar2, b.f8609a, false, 2213, new Class[]{Float.TYPE}, Void.TYPE);
        } else {
            bVar.h = f6;
            bVar.f8611c.setStrokeWidth(f6);
            bVar.c();
        }
        Double.isNaN(d6);
        bVar.r = d6 * d4;
        bVar.k = 0;
        bVar.s = (int) (f2 * f5);
        bVar.t = (int) (f5 * f3);
        int i2 = (int) this.o;
        int i3 = (int) this.p;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, bVar, b.f8609a, false, 2217, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, bVar, b.f8609a, false, 2217, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        float min = (float) Math.min(i2, i3);
        if (bVar.r <= 0.0d || min < 0.0f) {
            f4 = (float) Math.ceil((double) (bVar.h / 2.0f));
        } else {
            double d7 = (double) (min / 2.0f);
            double d8 = bVar.r;
            Double.isNaN(d7);
            f4 = (float) (d7 - d8);
        }
        bVar.i = f4;
    }
}
