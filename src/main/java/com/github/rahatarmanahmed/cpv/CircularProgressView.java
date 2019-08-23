package com.github.rahatarmanahmed.cpv;

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
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CircularProgressView extends View {

    /* renamed from: a  reason: collision with root package name */
    public boolean f24370a;

    /* renamed from: b  reason: collision with root package name */
    public float f24371b;

    /* renamed from: c  reason: collision with root package name */
    public float f24372c;

    /* renamed from: d  reason: collision with root package name */
    public List<Object> f24373d;

    /* renamed from: e  reason: collision with root package name */
    public float f24374e;

    /* renamed from: f  reason: collision with root package name */
    public float f24375f;
    private Paint g;
    private int h;
    private RectF i;
    private boolean j;
    private float k;
    private float l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private ValueAnimator s;
    private ValueAnimator t;
    private AnimatorSet u;
    private float v;

    public final void a() {
        b();
    }

    public int getColor() {
        return this.n;
    }

    public float getMaxProgress() {
        return this.l;
    }

    public float getProgress() {
        return this.k;
    }

    public int getThickness() {
        return this.m;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.j) {
            a();
        }
    }

    private void e() {
        this.g.setColor(this.n);
        this.g.setStyle(Paint.Style.STROKE);
        this.g.setStrokeWidth((float) this.m);
        this.g.setStrokeCap(Paint.Cap.BUTT);
    }

    private void d() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.i.set((float) (this.m + paddingLeft), (float) (this.m + paddingTop), (float) ((this.h - paddingLeft) - this.m), (float) ((this.h - paddingTop) - this.m));
    }

    public final void c() {
        if (this.s != null) {
            this.s.cancel();
            this.s = null;
        }
        if (this.t != null) {
            this.t.cancel();
            this.t = null;
        }
        if (this.u != null) {
            this.u.cancel();
            this.u = null;
        }
    }

    public final void b() {
        if (this.s != null && this.s.isRunning()) {
            this.s.cancel();
        }
        if (this.t != null && this.t.isRunning()) {
            this.t.cancel();
        }
        if (this.u != null && this.u.isRunning()) {
            this.u.cancel();
        }
        int i2 = 0;
        if (!this.f24370a) {
            this.f24374e = this.v;
            this.s = ValueAnimator.ofFloat(new float[]{this.f24374e, this.f24374e + 360.0f});
            this.s.setDuration((long) this.p);
            this.s.setInterpolator(new DecelerateInterpolator(2.0f));
            this.s.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CircularProgressView.this.f24374e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CircularProgressView.this.invalidate();
                }
            });
            this.s.start();
            this.f24375f = 0.0f;
            this.t = ValueAnimator.ofFloat(new float[]{this.f24375f, this.k});
            this.t.setDuration((long) this.q);
            this.t.setInterpolator(new LinearInterpolator());
            this.t.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CircularProgressView.this.f24375f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CircularProgressView.this.invalidate();
                }
            });
            this.t.start();
            return;
        }
        this.f24371b = 15.0f;
        this.u = new AnimatorSet();
        AnimatorSet animatorSet = null;
        while (i2 < this.r) {
            AnimatorSet a2 = a((float) i2);
            AnimatorSet.Builder play = this.u.play(a2);
            if (animatorSet != null) {
                play.after(animatorSet);
            }
            i2++;
            animatorSet = a2;
        }
        this.u.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            boolean f24381a;

            public final void onAnimationCancel(Animator animator) {
                this.f24381a = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (!this.f24381a) {
                    CircularProgressView.this.b();
                }
            }
        });
        this.u.start();
        Iterator<Object> it2 = this.f24373d.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }

    public void setMaxProgress(float f2) {
        this.l = f2;
        invalidate();
    }

    public CircularProgressView(Context context) {
        super(context);
        a(null, 0);
    }

    public void setColor(int i2) {
        this.n = i2;
        e();
        invalidate();
    }

    public void setThickness(int i2) {
        this.m = i2;
        e();
        d();
        invalidate();
    }

    public void setVisibility(int i2) {
        int visibility = getVisibility();
        super.setVisibility(i2);
        if (i2 != visibility) {
            if (i2 == 0) {
                b();
            } else if (i2 == 8 || i2 == 4) {
                c();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f2;
        super.onDraw(canvas);
        if (isInEditMode()) {
            f2 = this.k;
        } else {
            f2 = this.f24375f;
        }
        float f3 = (f2 / this.l) * 360.0f;
        if (!this.f24370a) {
            canvas.drawArc(this.i, this.f24374e, f3, false, this.g);
            return;
        }
        canvas.drawArc(this.i, this.f24374e + this.f24372c, this.f24371b, false, this.g);
    }

    public void setIndeterminate(boolean z) {
        boolean z2;
        boolean z3 = this.f24370a;
        if (this.f24370a == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f24370a = z;
        if (z2) {
            b();
        }
        if (z3 != z) {
            Iterator<Object> it2 = this.f24373d.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    public void setProgress(final float f2) {
        this.k = f2;
        if (!this.f24370a) {
            if (this.t != null && this.t.isRunning()) {
                this.t.cancel();
            }
            this.t = ValueAnimator.ofFloat(new float[]{this.f24375f, f2});
            this.t.setDuration((long) this.q);
            this.t.setInterpolator(new LinearInterpolator());
            this.t.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CircularProgressView.this.f24375f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CircularProgressView.this.invalidate();
                }
            });
            this.t.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    Iterator<Object> it2 = CircularProgressView.this.f24373d.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                }
            });
            this.t.start();
        }
        invalidate();
        Iterator<Object> it2 = this.f24373d.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }

    private AnimatorSet a(float f2) {
        final float f3 = ((((float) (this.r - 1)) * 360.0f) / ((float) this.r)) + 15.0f;
        final float f4 = ((f3 - 15.0f) * f2) - 0.049804688f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{15.0f, f3});
        ofFloat.setDuration((long) ((this.o / this.r) / 2));
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f24371b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.invalidate();
            }
        });
        float f5 = (0.5f + f2) * 720.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{(f2 * 720.0f) / ((float) this.r), f5 / ((float) this.r)});
        ofFloat2.setDuration((long) ((this.o / this.r) / 2));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f24372c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{f4, (f4 + f3) - 15.0f});
        ofFloat3.setDuration((long) ((this.o / this.r) / 2));
        ofFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f24374e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.f24371b = (f3 - CircularProgressView.this.f24374e) + f4;
                CircularProgressView.this.invalidate();
            }
        });
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{f5 / ((float) this.r), ((f2 + 1.0f) * 720.0f) / ((float) this.r)});
        ofFloat4.setDuration((long) ((this.o / this.r) / 2));
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f24372c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
        this.f24373d = new ArrayList();
        b(attributeSet, i2);
        this.g = new Paint(1);
        e();
        this.i = new RectF();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int measuredWidth = getMeasuredWidth() - paddingLeft;
        int measuredHeight = getMeasuredHeight() - paddingTop;
        if (measuredWidth >= measuredHeight) {
            measuredWidth = measuredHeight;
        }
        this.h = measuredWidth;
        setMeasuredDimension(this.h + paddingLeft, this.h + paddingTop);
    }

    private void b(AttributeSet attributeSet, int i2) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.CircularProgressView, i2, 0);
        Resources resources = getResources();
        this.k = obtainStyledAttributes.getFloat(8, (float) resources.getInteger(C0906R.integer.r));
        this.l = obtainStyledAttributes.getFloat(7, (float) resources.getInteger(C0906R.integer.q));
        this.m = obtainStyledAttributes.getDimensionPixelSize(10, resources.getDimensionPixelSize(C0906R.dimen.d6));
        this.f24370a = obtainStyledAttributes.getBoolean(6, resources.getBoolean(C0906R.bool.f4416e));
        this.j = obtainStyledAttributes.getBoolean(0, resources.getBoolean(C0906R.bool.f4415d));
        this.v = obtainStyledAttributes.getFloat(9, (float) resources.getInteger(C0906R.integer.s));
        this.f24374e = this.v;
        int identifier = getContext().getResources().getIdentifier("colorAccent", "attr", getContext().getPackageName());
        if (obtainStyledAttributes.hasValue(5)) {
            this.n = obtainStyledAttributes.getColor(5, resources.getColor(C0906R.color.f4494io));
        } else if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(identifier, typedValue, true);
            this.n = typedValue.data;
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.n = getContext().obtainStyledAttributes(new int[]{16843829}).getColor(0, resources.getColor(C0906R.color.f4494io));
        } else {
            this.n = resources.getColor(C0906R.color.f4494io);
        }
        this.o = obtainStyledAttributes.getInteger(1, resources.getInteger(C0906R.integer.m));
        this.p = obtainStyledAttributes.getInteger(3, resources.getInteger(C0906R.integer.o));
        this.q = obtainStyledAttributes.getInteger(4, resources.getInteger(C0906R.integer.p));
        this.r = obtainStyledAttributes.getInteger(2, resources.getInteger(C0906R.integer.n));
        obtainStyledAttributes.recycle();
    }

    public CircularProgressView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(attributeSet, i2);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 >= i3) {
            i2 = i3;
        }
        this.h = i2;
        d();
    }
}
