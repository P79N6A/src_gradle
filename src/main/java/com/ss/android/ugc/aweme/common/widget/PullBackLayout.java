package com.ss.android.ugc.aweme.common.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class PullBackLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40456a;

    /* renamed from: b  reason: collision with root package name */
    public View f40457b;

    /* renamed from: c  reason: collision with root package name */
    public b f40458c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f40459d;

    /* renamed from: e  reason: collision with root package name */
    private Context f40460e;

    /* renamed from: f  reason: collision with root package name */
    private float f40461f;
    private View g;
    private VelocityTracker h;

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f40456a, false, 33751, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40456a, false, 33751, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.h.clear();
        this.h.recycle();
    }

    public void setCanPullBack(boolean z) {
        this.f40459d = z;
    }

    public void setPullBackListener(@NonNull b bVar) {
        this.f40458c = bVar;
    }

    public PullBackLayout(Context context) {
        this(context, null);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f40456a, false, 33749, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f40456a, false, 33749, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            this.f40461f = motionEvent.getY();
        } else if (motionEvent.getAction() == 2 && motionEvent.getY() - this.f40461f > ((float) ViewConfiguration.get(this.f40460e).getScaledTouchSlop())) {
            return this.f40459d;
        }
        return false;
    }

    public void setBackgroundColor(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40456a, false, 33752, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40456a, false, 33752, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g.setBackgroundColor(i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f40456a, false, 33750, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f40456a, false, 33750, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        this.h.addMovement(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.f40461f = motionEvent.getY();
        }
        if (motionEvent.getAction() == 2) {
            if ((this.f40457b == null || this.f40457b.getTranslationY() <= 0.0f) && !onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            float max = (float) ((int) Math.max(0.0f, motionEvent.getY() - this.f40461f));
            this.f40457b.setTranslationY(max);
            this.g.setAlpha(0.9f - ((max / ((float) this.f40457b.getHeight())) * 0.9f));
        } else if (motionEvent.getAction() == 1) {
            float translationY = this.f40457b.getTranslationY();
            if (this.f40457b.getTranslationY() / ((float) this.f40457b.getHeight()) > 0.3f) {
                z = true;
            }
            a(translationY, z);
        }
        return true;
    }

    public PullBackLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(float f2, boolean z) {
        long j;
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        long j2;
        final boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f40456a, false, 33748, new Class[]{Float.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Byte.valueOf(z)}, this, f40456a, false, 33748, new Class[]{Float.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f40457b != null) {
            float height = 0.9f - (f2 / ((float) this.f40457b.getHeight()));
            this.h.computeCurrentVelocity(1);
            if (z2) {
                if (this.h.getYVelocity() != 0.0f) {
                    j = (long) ((((float) this.f40457b.getHeight()) - f2) / Math.abs(this.h.getYVelocity()));
                } else {
                    j = 300;
                }
                objectAnimator = ObjectAnimator.ofFloat(this.f40457b, "translationY", new float[]{f2, (float) this.f40457b.getHeight()});
                objectAnimator2 = ObjectAnimator.ofFloat(this.g, "alpha", new float[]{height, 0.0f});
            } else {
                if (this.h.getYVelocity() != 0.0f) {
                    j2 = (long) (f2 / Math.abs(this.h.getYVelocity()));
                } else {
                    j2 = 300;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f40457b, "translationY", new float[]{f2, 0.0f});
                objectAnimator2 = ObjectAnimator.ofFloat(this.g, "alpha", new float[]{height, 0.9f});
                objectAnimator = ofFloat;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            long j3 = 0;
            if (j >= 300) {
                j3 = 300;
            } else if (j >= 0) {
                j3 = j;
            }
            animatorSet.setDuration(j3);
            animatorSet.playTogether(new Animator[]{objectAnimator, objectAnimator2});
            animatorSet.addListener(new Animator.AnimatorListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f40462a;

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f40462a, false, 33753, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f40462a, false, 33753, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    if (PullBackLayout.this.f40458c != null && z2) {
                        PullBackLayout.this.f40458c.a();
                    }
                }
            });
            animatorSet.start();
        }
    }

    public PullBackLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40459d = true;
        this.f40460e = context;
        this.h = VelocityTracker.obtain();
        this.g = new View(this.f40460e);
        this.g.setBackgroundColor(getResources().getColor(17170444));
        addView(this.g, 0);
    }
}
