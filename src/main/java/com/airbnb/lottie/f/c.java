package com.airbnb.lottie.f;

import android.animation.Animator;
import android.os.Build;
import android.support.annotation.FloatRange;
import android.support.annotation.MainThread;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.view.Choreographer;
import com.airbnb.lottie.LottieComposition;

public final class c extends a implements Choreographer.FrameCallback {

    /* renamed from: b  reason: collision with root package name */
    public float f4840b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    public long f4841c;

    /* renamed from: d  reason: collision with root package name */
    public float f4842d;

    /* renamed from: e  reason: collision with root package name */
    public float f4843e = -2.14748365E9f;

    /* renamed from: f  reason: collision with root package name */
    public float f4844f = 2.14748365E9f;
    @Nullable
    public LottieComposition g;
    @VisibleForTesting
    protected boolean h;
    private boolean i;
    private int j;

    @MainThread
    public final void f() {
        l();
    }

    public final boolean isRunning() {
        return this.h;
    }

    @MainThread
    private void l() {
        b(true);
    }

    public final void c() {
        this.f4840b = -this.f4840b;
    }

    private boolean j() {
        if (this.f4840b < 0.0f) {
            return true;
        }
        return false;
    }

    @MainThread
    public final void e() {
        l();
        a(j());
    }

    public final Object getAnimatedValue() {
        return Float.valueOf(b());
    }

    public final long getDuration() {
        if (this.g == null) {
            return 0;
        }
        return (long) this.g.getDuration();
    }

    private void k() {
        if (isRunning()) {
            b(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float b() {
        if (this.g == null) {
            return 0.0f;
        }
        return (this.f4842d - this.g.getStartFrame()) / (this.g.getEndFrame() - this.g.getStartFrame());
    }

    @MainThread
    public final void cancel() {
        for (Animator.AnimatorListener onAnimationCancel : this.f4838a) {
            onAnimationCancel.onAnimationCancel(this);
        }
        l();
    }

    public final float h() {
        if (this.g == null) {
            return 0.0f;
        }
        if (this.f4843e == -2.14748365E9f) {
            return this.g.getStartFrame();
        }
        return this.f4843e;
    }

    public final float i() {
        if (this.g == null) {
            return 0.0f;
        }
        if (this.f4844f == 2.14748365E9f) {
            return this.g.getEndFrame();
        }
        return this.f4844f;
    }

    @MainThread
    public final void g() {
        this.h = true;
        k();
        this.f4841c = System.nanoTime();
        if (!j() || this.f4842d != h()) {
            if (!j() && this.f4842d == i()) {
                this.f4842d = h();
            }
            return;
        }
        this.f4842d = i();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getAnimatedFraction() {
        if (this.g == null) {
            return 0.0f;
        }
        if (j()) {
            return (i() - this.f4842d) / (i() - h());
        }
        return (this.f4842d - h()) / (i() - h());
    }

    @MainThread
    public final void d() {
        float f2;
        this.h = true;
        boolean j2 = j();
        for (Animator.AnimatorListener next : this.f4838a) {
            if (Build.VERSION.SDK_INT >= 26) {
                next.onAnimationStart(this, j2);
            } else {
                next.onAnimationStart(this);
            }
        }
        if (j()) {
            f2 = i();
        } else {
            f2 = h();
        }
        a((int) f2);
        this.f4841c = System.nanoTime();
        this.j = 0;
        k();
    }

    @MainThread
    private void b(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.h = false;
        }
    }

    public final void a(int i2) {
        float f2 = (float) i2;
        if (this.f4842d != f2) {
            this.f4842d = e.b(f2, h(), i());
            this.f4841c = System.nanoTime();
            a();
        }
    }

    public final void setRepeatMode(int i2) {
        super.setRepeatMode(i2);
        if (i2 != 2 && this.i) {
            this.i = false;
            c();
        }
    }

    public final void doFrame(long j2) {
        float f2;
        boolean z;
        float f3;
        k();
        if (this.g != null && isRunning()) {
            long nanoTime = System.nanoTime();
            long j3 = nanoTime - this.f4841c;
            if (this.g == null) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = (1.0E9f / this.g.getFrameRate()) / Math.abs(this.f4840b);
            }
            float f4 = ((float) j3) / f2;
            float f5 = this.f4842d;
            if (j()) {
                f4 = -f4;
            }
            this.f4842d = f5 + f4;
            float f6 = this.f4842d;
            float h2 = h();
            float i2 = i();
            if (f6 < h2 || f6 > i2) {
                z = false;
            } else {
                z = true;
            }
            boolean z2 = !z;
            this.f4842d = e.b(this.f4842d, h(), i());
            this.f4841c = nanoTime;
            a();
            if (z2) {
                if (getRepeatCount() == -1 || this.j < getRepeatCount()) {
                    for (Animator.AnimatorListener onAnimationRepeat : this.f4838a) {
                        onAnimationRepeat.onAnimationRepeat(this);
                    }
                    this.j++;
                    if (getRepeatMode() == 2) {
                        this.i = !this.i;
                        c();
                    } else {
                        if (j()) {
                            f3 = i();
                        } else {
                            f3 = h();
                        }
                        this.f4842d = f3;
                    }
                    this.f4841c = nanoTime;
                } else {
                    this.f4842d = i();
                    l();
                    a(j());
                }
            }
            if (this.g != null && (this.f4842d < this.f4843e || this.f4842d > this.f4844f)) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.f4843e), Float.valueOf(this.f4844f), Float.valueOf(this.f4842d)}));
            }
        }
    }

    public final void a(int i2, int i3) {
        float f2;
        float f3;
        if (this.g == null) {
            f2 = -3.4028235E38f;
        } else {
            f2 = this.g.getStartFrame();
        }
        if (this.g == null) {
            f3 = Float.MAX_VALUE;
        } else {
            f3 = this.g.getEndFrame();
        }
        float f4 = (float) i2;
        this.f4843e = e.b(f4, f2, f3);
        float f5 = (float) i3;
        this.f4844f = e.b(f5, f2, f3);
        a((int) e.b(this.f4842d, f4, f5));
    }
}
