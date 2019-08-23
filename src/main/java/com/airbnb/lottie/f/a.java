package com.airbnb.lottie.f;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public abstract class a extends ValueAnimator {

    /* renamed from: a  reason: collision with root package name */
    final Set<Animator.AnimatorListener> f4838a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    private final Set<ValueAnimator.AnimatorUpdateListener> f4839b = new CopyOnWriteArraySet();

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void removeAllListeners() {
        this.f4838a.clear();
    }

    public void removeAllUpdateListeners() {
        this.f4839b.clear();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        for (ValueAnimator.AnimatorUpdateListener onAnimationUpdate : this.f4839b) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }

    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f4838a.add(animatorListener);
    }

    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f4839b.add(animatorUpdateListener);
    }

    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f4838a.remove(animatorListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f4839b.remove(animatorUpdateListener);
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        for (Animator.AnimatorListener next : this.f4838a) {
            if (Build.VERSION.SDK_INT >= 26) {
                next.onAnimationEnd(this, z);
            } else {
                next.onAnimationEnd(this);
            }
        }
    }
}
