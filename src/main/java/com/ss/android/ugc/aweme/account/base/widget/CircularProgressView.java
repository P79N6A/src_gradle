package com.ss.android.ugc.aweme.account.base.widget;

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
import com.ss.android.ugc.aweme.account.R$styleable;

public class CircularProgressView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31716a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f31717b;

    /* renamed from: c  reason: collision with root package name */
    public float f31718c;

    /* renamed from: d  reason: collision with root package name */
    public float f31719d;

    /* renamed from: e  reason: collision with root package name */
    public float f31720e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f31721f;
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
        if (PatchProxy.isSupport(new Object[0], this, f31716a, false, 19735, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31716a, false, 19735, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        d();
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f31716a, false, 19722, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31716a, false, 19722, new Class[0], Void.TYPE);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.h.set((float) (this.l + paddingLeft), (float) (this.l + paddingTop), (float) ((this.g - paddingLeft) - this.l), (float) ((this.g - paddingTop) - this.l));
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f31716a, false, 19723, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31716a, false, 19723, new Class[0], Void.TYPE);
            return;
        }
        this.f31721f.setColor(this.m);
        this.f31721f.setStyle(Paint.Style.STROKE);
        this.f31721f.setStrokeWidth((float) this.l);
        this.f31721f.setStrokeCap(Paint.Cap.ROUND);
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f31716a, false, 19732, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31716a, false, 19732, new Class[0], Void.TYPE);
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
        if (PatchProxy.isSupport(new Object[0], this, f31716a, false, 19734, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31716a, false, 19734, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        if (this.i) {
            if (PatchProxy.isSupport(new Object[0], this, f31716a, false, 19730, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f31716a, false, 19730, new Class[0], Void.TYPE);
                return;
            }
            a();
        }
    }

    public final void a() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f31716a, false, 19731, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31716a, false, 19731, new Class[0], Void.TYPE);
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
        if (!this.f31717b) {
            this.f31720e = this.u;
            this.r = ValueAnimator.ofFloat(new float[]{this.f31720e, this.f31720e + 360.0f});
            this.r.setDuration((long) this.o);
            this.r.setInterpolator(new DecelerateInterpolator(2.0f));
            this.r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f31722a;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f31722a, false, 19737, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f31722a, false, 19737, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    CircularProgressView.this.f31720e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CircularProgressView.this.invalidate();
                }
            });
            this.r.start();
            return;
        }
        this.f31718c = 15.0f;
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
            public static ChangeQuickRedirect f31724a;

            /* renamed from: b  reason: collision with root package name */
            boolean f31725b;

            public final void onAnimationCancel(Animator animator) {
                this.f31725b = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f31724a, false, 19738, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f31724a, false, 19738, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                if (!this.f31725b) {
                    CircularProgressView.this.a();
                }
            }
        });
        this.t.start();
    }

    public CircularProgressView(Context context) {
        super(context);
        a(null, 0);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f31716a, false, 19724, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f31716a, false, 19724, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        isInEditMode();
        float f2 = (this.j / this.k) * 360.0f;
        if (!this.f31717b) {
            canvas.drawArc(this.h, this.f31720e, f2, false, this.f31721f);
            return;
        }
        Canvas canvas2 = canvas;
        canvas2.drawArc(this.h, this.f31719d + this.f31720e, this.f31718c, false, this.f31721f);
    }

    public void setColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f31716a, false, 19727, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f31716a, false, 19727, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.m = i2;
        c();
        invalidate();
    }

    public void setIndeterminate(boolean z) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f31716a, false, 19725, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f31716a, false, 19725, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f31717b == z) {
            z2 = false;
        }
        if (z2) {
            this.f31717b = z;
            a();
        }
    }

    public void setMaxProgress(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f31716a, false, 19728, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f31716a, false, 19728, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.k = f2;
        invalidate();
    }

    public void setProgress(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f31716a, false, 19729, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f31716a, false, 19729, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.j = f2;
        invalidate();
    }

    public void setThickness(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f31716a, false, 19726, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f31716a, false, 19726, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.l = i2;
        c();
        b();
        invalidate();
    }

    public void setVisibility(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f31716a, false, 19736, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f31716a, false, 19736, new Class[]{Integer.TYPE}, Void.TYPE);
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
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f31716a, false, 19733, new Class[]{Float.TYPE}, AnimatorSet.class)) {
            return (AnimatorSet) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f31716a, false, 19733, new Class[]{Float.TYPE}, AnimatorSet.class);
        }
        final float f3 = ((((float) (this.q - 1)) * 360.0f) / ((float) this.q)) + 15.0f;
        final float f4 = ((f3 - 15.0f) * f2) - 0.049804688f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{15.0f, f3});
        ofFloat.setDuration((long) ((this.n / this.q) / 2));
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f31727a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f31727a, false, 19739, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f31727a, false, 19739, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                CircularProgressView.this.f31718c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.invalidate();
            }
        });
        float f5 = (0.5f + f2) * 720.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{(f2 * 720.0f) / ((float) this.q), f5 / ((float) this.q)});
        ofFloat2.setDuration((long) ((this.n / this.q) / 2));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f31729a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f31729a, false, 19740, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f31729a, false, 19740, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                CircularProgressView.this.f31719d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{f4, (f4 + f3) - 15.0f});
        ofFloat3.setDuration((long) ((this.n / this.q) / 2));
        ofFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f31731a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f31731a, false, 19741, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f31731a, false, 19741, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                CircularProgressView.this.f31720e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.f31718c = (f3 - CircularProgressView.this.f31720e) + f4;
                CircularProgressView.this.invalidate();
            }
        });
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{f5 / ((float) this.q), ((f2 + 1.0f) * 720.0f) / ((float) this.q)});
        ofFloat4.setDuration((long) ((this.n / this.q) / 2));
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f31735a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f31735a, false, 19742, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f31735a, false, 19742, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                CircularProgressView.this.f31719d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
        if (PatchProxy.isSupport(new Object[]{attributeSet, Integer.valueOf(i2)}, this, f31716a, false, 19718, new Class[]{AttributeSet.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{attributeSet, Integer.valueOf(i2)}, this, f31716a, false, 19718, new Class[]{AttributeSet.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        b(attributeSet, i2);
        this.f31721f = new Paint(1);
        c();
        this.h = new RectF();
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f31716a, false, 19720, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f31716a, false, 19720, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
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
        if (PatchProxy.isSupport(new Object[]{attributeSet, Integer.valueOf(i2)}, this, f31716a, false, 19719, new Class[]{AttributeSet.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{attributeSet, Integer.valueOf(i2)}, this, f31716a, false, 19719, new Class[]{AttributeSet.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.CircularProgressView, i2, 0);
        Resources resources = getResources();
        this.j = obtainStyledAttributes.getFloat(8, (float) resources.getInteger(C0906R.integer.r));
        this.k = obtainStyledAttributes.getFloat(7, (float) resources.getInteger(C0906R.integer.q));
        this.l = obtainStyledAttributes.getDimensionPixelSize(10, resources.getDimensionPixelSize(C0906R.dimen.d6));
        this.f31717b = obtainStyledAttributes.getBoolean(6, resources.getBoolean(C0906R.bool.f4416e));
        this.i = obtainStyledAttributes.getBoolean(0, resources.getBoolean(C0906R.bool.f4415d));
        this.u = obtainStyledAttributes.getFloat(9, (float) resources.getInteger(C0906R.integer.s));
        this.f31720e = this.u;
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

    public CircularProgressView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(attributeSet, i2);
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f31716a, false, 19721, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f31716a, false, 19721, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
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
