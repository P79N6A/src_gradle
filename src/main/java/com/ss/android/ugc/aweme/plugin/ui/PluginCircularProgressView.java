package com.ss.android.ugc.aweme.plugin.ui;

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
import com.ss.android.ugc.aweme.plugin.R$styleable;

public class PluginCircularProgressView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59349a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f59350b;

    /* renamed from: c  reason: collision with root package name */
    public float f59351c;

    /* renamed from: d  reason: collision with root package name */
    public float f59352d;

    /* renamed from: e  reason: collision with root package name */
    public float f59353e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f59354f;
    private int g;
    private RectF h;
    private boolean i;
    private float j;
    private float k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private ValueAnimator r;
    private ValueAnimator s;
    private AnimatorSet t;
    private float u;

    public int getColor() {
        return this.m;
    }

    public float getMaxProgress() {
        return this.k;
    }

    public float getProgress() {
        return this.j;
    }

    public int getThickness() {
        return this.l;
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f59349a, false, 64681, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59349a, false, 64681, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        d();
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f59349a, false, 64668, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59349a, false, 64668, new Class[0], Void.TYPE);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.h.set((float) (this.l + paddingLeft), (float) (this.l + paddingTop), (float) ((this.g - paddingLeft) - this.l), (float) ((this.g - paddingTop) - this.l));
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f59349a, false, 64669, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59349a, false, 64669, new Class[0], Void.TYPE);
            return;
        }
        this.f59354f.setColor(this.m);
        this.f59354f.setStyle(Paint.Style.STROKE);
        this.f59354f.setStrokeWidth((float) this.l);
        this.f59354f.setStrokeCap(Paint.Cap.ROUND);
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f59349a, false, 64678, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59349a, false, 64678, new Class[0], Void.TYPE);
            return;
        }
        if (this.r != null) {
            this.r.cancel();
            this.r = null;
        }
        if (this.s != null) {
            this.s.cancel();
            this.s = null;
        }
        if (this.t != null) {
            this.t.cancel();
            this.t = null;
        }
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f59349a, false, 64680, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59349a, false, 64680, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        if (this.i) {
            if (PatchProxy.isSupport(new Object[0], this, f59349a, false, 64676, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f59349a, false, 64676, new Class[0], Void.TYPE);
                return;
            }
            a();
        }
    }

    public final void a() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f59349a, false, 64677, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59349a, false, 64677, new Class[0], Void.TYPE);
            return;
        }
        if (this.r != null && this.r.isRunning()) {
            this.r.cancel();
        }
        if (this.s != null && this.s.isRunning()) {
            this.s.cancel();
        }
        if (this.t != null && this.t.isRunning()) {
            this.t.cancel();
        }
        if (!this.f59350b) {
            this.f59353e = this.u;
            this.r = ValueAnimator.ofFloat(new float[]{this.f59353e, this.f59353e + 360.0f});
            this.r.setDuration((long) this.o);
            this.r.setInterpolator(new DecelerateInterpolator(2.0f));
            this.r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f59355a;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f59355a, false, 64683, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f59355a, false, 64683, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    PluginCircularProgressView.this.f59353e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    PluginCircularProgressView.this.invalidate();
                }
            });
            this.r.start();
            return;
        }
        this.f59351c = 15.0f;
        this.t = new AnimatorSet();
        AnimatorSet animatorSet = null;
        while (i2 < this.q) {
            AnimatorSet a2 = a((float) i2);
            AnimatorSet.Builder play = this.t.play(a2);
            if (animatorSet != null) {
                play.after(animatorSet);
            }
            i2++;
            animatorSet = a2;
        }
        this.t.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59357a;

            /* renamed from: b  reason: collision with root package name */
            boolean f59358b;

            public final void onAnimationCancel(Animator animator) {
                this.f59358b = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f59357a, false, 64684, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f59357a, false, 64684, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                if (!this.f59358b) {
                    PluginCircularProgressView.this.a();
                }
            }
        });
        this.t.start();
    }

    public PluginCircularProgressView(Context context) {
        super(context);
        a(null, 0);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f59349a, false, 64670, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f59349a, false, 64670, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        isInEditMode();
        float f2 = (this.j / this.k) * 360.0f;
        if (!this.f59350b) {
            canvas.drawArc(this.h, this.f59353e, f2, false, this.f59354f);
            return;
        }
        Canvas canvas2 = canvas;
        canvas2.drawArc(this.h, this.f59352d + this.f59353e, this.f59351c, false, this.f59354f);
    }

    public void setColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f59349a, false, 64673, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f59349a, false, 64673, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.m = i2;
        c();
        invalidate();
    }

    public void setIndeterminate(boolean z) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f59349a, false, 64671, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f59349a, false, 64671, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f59350b == z) {
            z2 = false;
        }
        if (z2) {
            this.f59350b = z;
            a();
        }
    }

    public void setMaxProgress(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f59349a, false, 64674, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f59349a, false, 64674, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.k = f2;
        invalidate();
    }

    public void setProgress(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f59349a, false, 64675, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f59349a, false, 64675, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.j = f2;
        invalidate();
    }

    public void setThickness(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f59349a, false, 64672, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f59349a, false, 64672, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.l = i2;
        c();
        b();
        invalidate();
    }

    public void setVisibility(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f59349a, false, 64682, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f59349a, false, 64682, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int visibility = getVisibility();
        super.setVisibility(i2);
        if (i3 != visibility) {
            if (i3 == 0) {
                a();
            } else if (i3 == 8 || i3 == 4) {
                d();
            }
        }
    }

    private AnimatorSet a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f59349a, false, 64679, new Class[]{Float.TYPE}, AnimatorSet.class)) {
            return (AnimatorSet) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f59349a, false, 64679, new Class[]{Float.TYPE}, AnimatorSet.class);
        }
        final float f3 = ((((float) (this.q - 1)) * 360.0f) / ((float) this.q)) + 15.0f;
        final float f4 = ((f3 - 15.0f) * f2) - 0.049804688f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{15.0f, f3});
        ofFloat.setDuration((long) ((this.n / this.q) / 2));
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59360a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f59360a, false, 64685, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f59360a, false, 64685, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                PluginCircularProgressView.this.f59351c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                PluginCircularProgressView.this.invalidate();
            }
        });
        float f5 = (0.5f + f2) * 720.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{(f2 * 720.0f) / ((float) this.q), f5 / ((float) this.q)});
        ofFloat2.setDuration((long) ((this.n / this.q) / 2));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59362a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f59362a, false, 64686, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f59362a, false, 64686, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                PluginCircularProgressView.this.f59352d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{f4, (f4 + f3) - 15.0f});
        ofFloat3.setDuration((long) ((this.n / this.q) / 2));
        ofFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59364a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f59364a, false, 64687, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f59364a, false, 64687, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                PluginCircularProgressView.this.f59353e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                PluginCircularProgressView.this.f59351c = (f3 - PluginCircularProgressView.this.f59353e) + f4;
                PluginCircularProgressView.this.invalidate();
            }
        });
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{f5 / ((float) this.q), ((f2 + 1.0f) * 720.0f) / ((float) this.q)});
        ofFloat4.setDuration((long) ((this.n / this.q) / 2));
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59368a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f59368a, false, 64688, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f59368a, false, 64688, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                PluginCircularProgressView.this.f59352d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).after(ofFloat2);
        return animatorSet;
    }

    public PluginCircularProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet, 0);
    }

    private void a(AttributeSet attributeSet, int i2) {
        if (PatchProxy.isSupport(new Object[]{attributeSet, Integer.valueOf(i2)}, this, f59349a, false, 64664, new Class[]{AttributeSet.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{attributeSet, Integer.valueOf(i2)}, this, f59349a, false, 64664, new Class[]{AttributeSet.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        b(attributeSet, i2);
        this.f59354f = new Paint(1);
        c();
        this.h = new RectF();
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f59349a, false, 64666, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f59349a, false, 64666, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
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
        if (PatchProxy.isSupport(new Object[]{attributeSet, Integer.valueOf(i2)}, this, f59349a, false, 64665, new Class[]{AttributeSet.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{attributeSet, Integer.valueOf(i2)}, this, f59349a, false, 64665, new Class[]{AttributeSet.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.PluginCircularProgressView, i2, 0);
        Resources resources = getResources();
        this.j = obtainStyledAttributes.getFloat(8, (float) resources.getInteger(C0906R.integer.r));
        this.k = obtainStyledAttributes.getFloat(7, (float) resources.getInteger(C0906R.integer.q));
        this.l = obtainStyledAttributes.getDimensionPixelSize(10, resources.getDimensionPixelSize(C0906R.dimen.d6));
        this.f59350b = obtainStyledAttributes.getBoolean(6, resources.getBoolean(C0906R.bool.f4416e));
        this.i = obtainStyledAttributes.getBoolean(0, resources.getBoolean(C0906R.bool.f4415d));
        this.u = obtainStyledAttributes.getFloat(9, (float) resources.getInteger(C0906R.integer.s));
        this.f59353e = this.u;
        int identifier = getContext().getResources().getIdentifier("colorAccent", "attr", getContext().getPackageName());
        if (obtainStyledAttributes.hasValue(5)) {
            this.m = obtainStyledAttributes.getColor(5, resources.getColor(C0906R.color.f4494io));
        } else if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(identifier, typedValue, true);
            this.m = typedValue.data;
        } else if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(new int[]{16843829});
            this.m = obtainStyledAttributes2.getColor(0, resources.getColor(C0906R.color.f4494io));
            obtainStyledAttributes2.recycle();
        } else {
            this.m = resources.getColor(C0906R.color.f4494io);
        }
        this.n = obtainStyledAttributes.getInteger(1, resources.getInteger(C0906R.integer.m));
        this.o = obtainStyledAttributes.getInteger(3, resources.getInteger(C0906R.integer.o));
        this.p = obtainStyledAttributes.getInteger(4, resources.getInteger(C0906R.integer.p));
        this.q = obtainStyledAttributes.getInteger(2, resources.getInteger(C0906R.integer.n));
        obtainStyledAttributes.recycle();
    }

    public PluginCircularProgressView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(attributeSet, i2);
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f59349a, false, 64667, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f59349a, false, 64667, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        int i6 = i2;
        int i7 = i3;
        if (i6 < i7) {
            i7 = i6;
        }
        this.g = i7;
        b();
    }
}
