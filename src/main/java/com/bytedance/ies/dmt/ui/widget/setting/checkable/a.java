package com.bytedance.ies.dmt.ui.widget.setting.checkable;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.ies.dmt.R$styleable;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;

public final class a extends View {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f20519d = {C0906R.attr.a4l};
    private static final Property<a, Float> l = new Property<a, Float>(Float.class, "thumbPos") {
        public final /* synthetic */ Object get(Object obj) {
            return Float.valueOf(((a) obj).f20520a);
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            ((a) obj).setThumbPosition(((Float) obj2).floatValue());
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public float f20520a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f20521b;

    /* renamed from: c  reason: collision with root package name */
    ObjectAnimator f20522c;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f20523e;

    /* renamed from: f  reason: collision with root package name */
    private int f20524f;
    private int g;
    private int h;
    private Rect i;
    private RectF j;
    private ColorStateList k;
    private Paint m;
    private int n;
    private C0188a o;
    private int p;
    private VelocityTracker q;
    private int r;
    private float s;
    private float t;
    private boolean u;

    /* renamed from: com.bytedance.ies.dmt.ui.widget.setting.checkable.a$a  reason: collision with other inner class name */
    public interface C0188a {
    }

    public final Drawable getThumbDrawable() {
        return this.f20523e;
    }

    public final Rect getThumbRect() {
        return this.i;
    }

    public final int getTrackPadding() {
        return this.g;
    }

    public final int getTrackRadius() {
        return this.h;
    }

    public final ColorStateList getTrackTintList() {
        return this.k;
    }

    private int getThumbScrollRange() {
        return getMeasuredWidth() - this.f20524f;
    }

    private boolean getTargetCheckedState() {
        if (this.f20520a > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f2;
        if (ViewCompat.getLayoutDirection(this) == 1) {
            f2 = 1.0f - this.f20520a;
        } else {
            f2 = this.f20520a;
        }
        return (int) ((f2 * ((float) getThumbScrollRange())) + 0.5f);
    }

    public final void setEnableTouch(boolean z) {
        this.u = z;
    }

    public final void setOnCheckedChangeListener(C0188a aVar) {
        this.o = aVar;
    }

    public final void setThumbDrawable(Drawable drawable) {
        this.f20523e = drawable;
    }

    public final void setThumbRect(Rect rect) {
        this.i = rect;
    }

    public final void setTrackPadding(int i2) {
        this.g = i2;
    }

    public final void setTrackRadius(int i2) {
        this.h = i2;
    }

    public final void setTrackTintList(ColorStateList colorStateList) {
        this.k = colorStateList;
    }

    public a(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: package-private */
    public final void setThumbPosition(float f2) {
        this.f20520a = f2;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (this.f20521b) {
            mergeDrawableStates(onCreateDrawableState, f20519d);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int[] drawableState = getDrawableState();
        if (this.k != null) {
            this.m.setColor(this.k.getColorForState(drawableState, -65536));
        }
        this.j.left = 0.0f;
        this.j.right = (float) getMeasuredWidth();
        this.j.top = (float) this.g;
        this.j.bottom = (float) (getMeasuredHeight() - this.g);
        canvas.drawRoundRect(this.j, (float) this.h, (float) this.h, this.m);
        this.i.left = getThumbOffset();
        this.i.right = this.i.left + this.f20524f;
        if (this.f20523e != null) {
            this.f20523e.setBounds(this.i);
            this.f20523e.setState(drawableState);
            this.f20523e.draw(canvas);
        }
    }

    public final void setChecked(boolean z) {
        if (this.f20521b != z) {
            this.f20521b = z;
        }
        refreshDrawableState();
        float f2 = 0.0f;
        if (getWindowToken() == null || !ViewCompat.isLaidOut(this)) {
            if (this.f20522c != null) {
                this.f20522c.cancel();
            }
            if (z) {
                f2 = 1.0f;
            }
            setThumbPosition(f2);
            return;
        }
        if (z) {
            f2 = 1.0f;
        }
        this.f20522c = ObjectAnimator.ofFloat(this, l, new float[]{f2});
        this.f20522c.setDuration(250);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f20522c.setAutoCancel(true);
        }
        this.f20522c.start();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        float f2;
        if (!this.u) {
            return false;
        }
        this.q.addMovement(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (isEnabled()) {
                    this.r = 1;
                    this.s = x;
                    this.t = y;
                    break;
                }
                break;
            case 1:
            case 3:
                if (this.r != 2) {
                    this.r = 0;
                    this.q.clear();
                    break;
                } else {
                    this.r = 0;
                    if (motionEvent.getAction() != 1 || !isEnabled()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean z3 = this.f20521b;
                    if (z) {
                        this.q.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                        float xVelocity = this.q.getXVelocity();
                        if (Math.abs(xVelocity) <= ((float) this.p)) {
                            z2 = getTargetCheckedState();
                        } else if (ViewCompat.getLayoutDirection(this) != 1 ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    } else {
                        z2 = z3;
                    }
                    if (z2 != z3) {
                        playSoundEffect(0);
                    }
                    setChecked(z2);
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    super.onTouchEvent(obtain);
                    obtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                break;
            case 2:
                switch (this.r) {
                    case 1:
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (Math.abs(x2 - this.s) > ((float) this.n) || Math.abs(y2 - this.t) > ((float) this.n)) {
                            this.r = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.s = x2;
                            this.t = y2;
                            return true;
                        }
                    case 2:
                        float x3 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f3 = x3 - this.s;
                        if (thumbScrollRange != 0) {
                            f2 = f3 / ((float) thumbScrollRange);
                        } else if (f3 > 0.0f) {
                            f2 = 1.0f;
                        } else {
                            f2 = -1.0f;
                        }
                        if (ViewCompat.getLayoutDirection(this) == 1) {
                            f2 = -f2;
                        }
                        float f4 = f2 + this.f20520a;
                        if (f4 < 0.0f) {
                            f4 = 0.0f;
                        } else if (f4 > 1.0f) {
                            f4 = 1.0f;
                        }
                        if (f4 != this.f20520a) {
                            this.s = x3;
                            setThumbPosition(f4);
                        }
                        return true;
                }
                break;
        }
        return true;
    }

    private a(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        if (this.f20523e == null) {
            super.onMeasure(i2, i3);
            return;
        }
        int intrinsicWidth = this.f20523e.getIntrinsicWidth();
        int intrinsicHeight = this.f20523e.getIntrinsicHeight();
        this.i.left = 0;
        this.i.top = 0;
        this.i.right = intrinsicWidth;
        this.f20524f = intrinsicWidth;
        this.i.bottom = intrinsicHeight;
        this.f20523e.setBounds(this.i);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            setMeasuredDimension(size, intrinsicHeight);
        } else {
            setMeasuredDimension(intrinsicWidth * 2, intrinsicHeight);
        }
    }

    private a(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        this.m = new Paint();
        this.q = VelocityTracker.obtain();
        this.u = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.DmtSettingSwitch);
        this.f20523e = obtainStyledAttributes.getDrawable(0);
        this.k = obtainStyledAttributes.getColorStateList(3);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.h = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        obtainStyledAttributes.recycle();
        this.m.setAntiAlias(true);
        this.i = new Rect();
        this.j = new RectF();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.n = viewConfiguration.getScaledTouchSlop();
        this.p = viewConfiguration.getScaledMinimumFlingVelocity();
    }
}
