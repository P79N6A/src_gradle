package com.ss.android.ugc.aweme.main;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SwipeUpGuideView extends FrameLayout implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener, GestureDetector.OnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54282a;

    /* renamed from: b  reason: collision with root package name */
    GestureDetector f54283b;

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public SwipeUpGuideView(Context context) {
        this(context, null);
    }

    public void onLongPress(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f54282a, false, 57716, new Class[]{MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f54282a, false, 57716, new Class[]{MotionEvent.class}, Void.TYPE);
            return;
        }
        performLongClick();
        a(0.0f);
    }

    private void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f54282a, false, 57718, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f54282a, false, 57718, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        int height = getHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        long min = Math.min((long) (((float) ((long) height)) / ((Math.abs(f2) / 1000.0f) / 2.0f)), 400);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(min);
        ofFloat.addUpdateListener(this);
        ofFloat.addListener(this);
        ofFloat.start();
    }

    public void onAnimationEnd(Animator animator) {
        if (PatchProxy.isSupport(new Object[]{animator}, this, f54282a, false, 57720, new Class[]{Animator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{animator}, this, f54282a, false, 57720, new Class[]{Animator.class}, Void.TYPE);
            return;
        }
        callOnClick();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54282a, false, 57719, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54282a, false, 57719, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        View childAt = getChildAt(0);
        childAt.setTranslationY((-valueAnimator.getAnimatedFraction()) * ((float) getHeight()));
        childAt.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f54282a, false, 57715, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f54282a, false, 57715, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        callOnClick();
        a(0.0f);
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (!PatchProxy.isSupport(new Object[]{motionEvent2}, this, f54282a, false, 57714, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return this.f54283b.onTouchEvent(motionEvent2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f54282a, false, 57714, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
    }

    public SwipeUpGuideView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeUpGuideView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (PatchProxy.isSupport(new Object[0], this, f54282a, false, 57713, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54282a, false, 57713, new Class[0], Void.TYPE);
            return;
        }
        this.f54283b = new GestureDetector(getContext(), this);
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        float f4 = f3;
        if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f54282a, false, 57717, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f54282a, false, 57717, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (f4 < 0.0f) {
            a(f4);
        }
        return true;
    }
}
