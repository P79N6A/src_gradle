package com.ss.android.ugc.aweme.base.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.R$styleable;

public class CircularProgressView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35072a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f35073b;

    /* renamed from: c  reason: collision with root package name */
    public float f35074c;

    /* renamed from: d  reason: collision with root package name */
    public float f35075d;

    /* renamed from: e  reason: collision with root package name */
    public float f35076e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f35077f;
    private int g;
    private RectF h;
    private boolean i;
    private boolean j;
    private boolean k;
    private float l;
    private float m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private ValueAnimator t;
    private ValueAnimator u;
    private AnimatorSet v;
    private float w;

    public int getColor() {
        return this.o;
    }

    public float getMaxProgress() {
        return this.m;
    }

    public float getProgress() {
        return this.l;
    }

    public int getThickness() {
        return this.n;
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f35072a, false, 25410, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35072a, false, 25410, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.k = false;
        b();
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f35072a, false, 25397, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35072a, false, 25397, new Class[0], Void.TYPE);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.h.set((float) (this.n + paddingLeft), (float) (this.n + paddingTop), (float) ((this.g - paddingLeft) - this.n), (float) ((this.g - paddingTop) - this.n));
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f35072a, false, 25398, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35072a, false, 25398, new Class[0], Void.TYPE);
            return;
        }
        this.f35077f.setColor(this.o);
        this.f35077f.setStyle(Paint.Style.STROKE);
        this.f35077f.setStrokeWidth((float) this.n);
        this.f35077f.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f35072a, false, 25407, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35072a, false, 25407, new Class[0], Void.TYPE);
            return;
        }
        this.j = false;
        if (this.t != null) {
            this.t.cancel();
            this.t = null;
        }
        if (this.u != null) {
            this.u.cancel();
            this.u = null;
        }
        if (this.v != null) {
            this.v.cancel();
            this.v = null;
        }
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f35072a, false, 25409, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35072a, false, 25409, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.k = true;
        if (this.i || this.j) {
            if (PatchProxy.isSupport(new Object[0], this, f35072a, false, 25405, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f35072a, false, 25405, new Class[0], Void.TYPE);
                return;
            }
            a();
        }
    }

    public final void a() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f35072a, false, 25406, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35072a, false, 25406, new Class[0], Void.TYPE);
        } else if (!this.k) {
            this.j = true;
        } else {
            this.j = false;
            if (this.t != null && this.t.isRunning()) {
                this.t.cancel();
            }
            if (this.u != null && this.u.isRunning()) {
                this.u.cancel();
            }
            if (this.v != null && this.v.isRunning()) {
                this.v.cancel();
            }
            if (!this.f35073b) {
                this.f35076e = this.w;
                this.t = ValueAnimator.ofFloat(new float[]{this.f35076e, this.f35076e + 360.0f});
                this.t.setDuration((long) this.q);
                this.t.setInterpolator(new DecelerateInterpolator(2.0f));
                this.t.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f35078a;

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f35078a, false, 25412, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f35078a, false, 25412, new Class[]{ValueAnimator.class}, Void.TYPE);
                            return;
                        }
                        CircularProgressView.this.f35076e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CircularProgressView.this.invalidate();
                    }
                });
                this.t.start();
                return;
            }
            this.f35074c = 15.0f;
            this.v = new AnimatorSet();
            AnimatorSet animatorSet = null;
            while (i2 < this.s) {
                AnimatorSet a2 = a((float) i2);
                AnimatorSet.Builder play = this.v.play(a2);
                if (animatorSet != null) {
                    play.after(animatorSet);
                }
                i2++;
                animatorSet = a2;
            }
            this.v.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f35080a;

                /* renamed from: b  reason: collision with root package name */
                boolean f35081b;

                public final void onAnimationCancel(Animator animator) {
                    this.f35081b = true;
                }

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f35080a, false, 25413, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f35080a, false, 25413, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    if (!this.f35081b) {
                        CircularProgressView.this.a();
                    }
                }
            });
            this.v.start();
        }
    }

    public CircularProgressView(Context context) {
        super(context);
        a(null, 0);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f35072a, false, 25399, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f35072a, false, 25399, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        isInEditMode();
        float f2 = (this.l / this.m) * 360.0f;
        if (!this.f35073b) {
            canvas.drawArc(this.h, this.f35076e, f2, false, this.f35077f);
            return;
        }
        Canvas canvas2 = canvas;
        canvas2.drawArc(this.h, this.f35075d + this.f35076e, this.f35074c, false, this.f35077f);
    }

    public void setColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f35072a, false, 25402, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f35072a, false, 25402, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.o = i2;
        d();
        invalidate();
    }

    public void setIndeterminate(boolean z) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f35072a, false, 25400, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f35072a, false, 25400, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f35073b == z) {
            z2 = false;
        }
        if (z2) {
            this.f35073b = z;
            a();
        }
    }

    public void setMaxProgress(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f35072a, false, 25403, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f35072a, false, 25403, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.m = f2;
        invalidate();
    }

    public void setProgress(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f35072a, false, 25404, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f35072a, false, 25404, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.l = f2;
        invalidate();
    }

    public void setThickness(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f35072a, false, 25401, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f35072a, false, 25401, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.n = i2;
        d();
        c();
        invalidate();
    }

    public void setVisibility(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f35072a, false, 25411, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f35072a, false, 25411, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int visibility = getVisibility();
        super.setVisibility(i2);
        if (i3 != visibility) {
            if (i3 == 0) {
                a();
            } else if (i3 == 8 || i3 == 4) {
                b();
            }
        }
    }

    private AnimatorSet a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f35072a, false, 25408, new Class[]{Float.TYPE}, AnimatorSet.class)) {
            return (AnimatorSet) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f35072a, false, 25408, new Class[]{Float.TYPE}, AnimatorSet.class);
        }
        final float f3 = ((((float) (this.s - 1)) * 360.0f) / ((float) this.s)) + 15.0f;
        final float f4 = ((f3 - 15.0f) * f2) - 0.049804688f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{15.0f, f3});
        ofFloat.setDuration((long) ((this.p / this.s) / 2));
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35083a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f35083a, false, 25414, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f35083a, false, 25414, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                CircularProgressView.this.f35074c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.invalidate();
            }
        });
        float f5 = (0.5f + f2) * 720.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{(f2 * 720.0f) / ((float) this.s), f5 / ((float) this.s)});
        ofFloat2.setDuration((long) ((this.p / this.s) / 2));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35085a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f35085a, false, 25415, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f35085a, false, 25415, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                CircularProgressView.this.f35075d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{f4, (f4 + f3) - 15.0f});
        ofFloat3.setDuration((long) ((this.p / this.s) / 2));
        ofFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35087a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f35087a, false, 25416, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f35087a, false, 25416, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                CircularProgressView.this.f35076e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.f35074c = (f3 - CircularProgressView.this.f35076e) + f4;
                CircularProgressView.this.invalidate();
            }
        });
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{f5 / ((float) this.s), ((f2 + 1.0f) * 720.0f) / ((float) this.s)});
        ofFloat4.setDuration((long) ((this.p / this.s) / 2));
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35091a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f35091a, false, 25417, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f35091a, false, 25417, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                CircularProgressView.this.f35075d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).after(ofFloat2);
        return animatorSet;
    }

    public CircularProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet, 0);
    }

    private void a(AttributeSet attributeSet, int i2) {
        if (PatchProxy.isSupport(new Object[]{attributeSet, Integer.valueOf(i2)}, this, f35072a, false, 25393, new Class[]{AttributeSet.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{attributeSet, Integer.valueOf(i2)}, this, f35072a, false, 25393, new Class[]{AttributeSet.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        b(attributeSet, i2);
        this.f35077f = new Paint(1);
        d();
        this.h = new RectF();
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f35072a, false, 25395, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f35072a, false, 25395, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int measuredWidth = getMeasuredWidth() - paddingLeft;
        int measuredHeight = getMeasuredHeight() - paddingTop;
        if (measuredWidth >= measuredHeight) {
            measuredWidth = measuredHeight;
        }
        this.g = measuredWidth;
        setMeasuredDimension(this.g + paddingLeft, this.g + paddingTop);
    }

    private void b(AttributeSet attributeSet, int i2) {
        if (PatchProxy.isSupport(new Object[]{attributeSet, Integer.valueOf(i2)}, this, f35072a, false, 25394, new Class[]{AttributeSet.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{attributeSet, Integer.valueOf(i2)}, this, f35072a, false, 25394, new Class[]{AttributeSet.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.CircularProgressView, i2, 0);
        Resources resources = getResources();
        this.l = obtainStyledAttributes.getFloat(8, (float) resources.getInteger(C0906R.integer.r));
        this.m = obtainStyledAttributes.getFloat(7, (float) resources.getInteger(C0906R.integer.q));
        this.n = obtainStyledAttributes.getDimensionPixelSize(10, resources.getDimensionPixelSize(C0906R.dimen.d6));
        this.f35073b = obtainStyledAttributes.getBoolean(6, resources.getBoolean(C0906R.bool.f4416e));
        this.i = obtainStyledAttributes.getBoolean(0, resources.getBoolean(C0906R.bool.f4415d));
        this.w = obtainStyledAttributes.getFloat(9, (float) resources.getInteger(C0906R.integer.s));
        this.f35076e = this.w;
        int identifier = getContext().getResources().getIdentifier("colorAccent", "attr", getContext().getPackageName());
        if (obtainStyledAttributes.hasValue(5)) {
            this.o = obtainStyledAttributes.getColor(5, resources.getColor(C0906R.color.f4494io));
        } else if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(identifier, typedValue, true);
            this.o = typedValue.data;
        } else if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(new int[]{16843829});
            this.o = obtainStyledAttributes2.getColor(0, resources.getColor(C0906R.color.f4494io));
            obtainStyledAttributes2.recycle();
        } else {
            this.o = resources.getColor(C0906R.color.f4494io);
        }
        this.p = obtainStyledAttributes.getInteger(1, resources.getInteger(C0906R.integer.m));
        this.q = obtainStyledAttributes.getInteger(3, resources.getInteger(C0906R.integer.o));
        this.r = obtainStyledAttributes.getInteger(4, resources.getInteger(C0906R.integer.p));
        this.s = obtainStyledAttributes.getInteger(2, resources.getInteger(C0906R.integer.n));
        obtainStyledAttributes.recycle();
    }

    public CircularProgressView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(attributeSet, i2);
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f35072a, false, 25396, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f35072a, false, 25396, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        int i6 = i2;
        int i7 = i3;
        if (i6 < i7) {
            i7 = i6;
        }
        this.g = i7;
        c();
    }
}
