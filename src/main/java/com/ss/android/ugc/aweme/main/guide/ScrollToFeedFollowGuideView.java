package com.ss.android.ugc.aweme.main.guide;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.bg;

public class ScrollToFeedFollowGuideView extends FrameLayout implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener, GestureDetector.OnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54783a;

    /* renamed from: b  reason: collision with root package name */
    GestureDetector f54784b;

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public ScrollToFeedFollowGuideView(Context context) {
        this(context, null);
    }

    private void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f54783a, false, 58093, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f54783a, false, 58093, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        bg.a(new d(false));
        e.f54822b = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(this);
        ofFloat.addListener(this);
        ofFloat.start();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f54783a, false, 58090, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f54783a, false, 58090, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onAnimationEnd(Animator animator) {
        if (PatchProxy.isSupport(new Object[]{animator}, this, f54783a, false, 58095, new Class[]{Animator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{animator}, this, f54783a, false, 58095, new Class[]{Animator.class}, Void.TYPE);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54783a, false, 58094, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54783a, false, 58094, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        getChildAt(0).setAlpha(1.0f - valueAnimator.getAnimatedFraction());
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f54783a, false, 58091, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f54783a, false, 58091, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        a(0);
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f54783a, false, 58089, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f54783a, false, 58089, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        a(500);
        return this.f54784b.onTouchEvent(motionEvent);
    }

    public ScrollToFeedFollowGuideView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrollToFeedFollowGuideView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        animate().alpha(1.0f).setDuration(1000).start();
        if (PatchProxy.isSupport(new Object[0], this, f54783a, false, 58088, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54783a, false, 58088, new Class[0], Void.TYPE);
            return;
        }
        this.f54784b = new GestureDetector(getContext(), this);
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f54783a, false, 58092, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f54783a, false, 58092, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        a(500);
        return true;
    }
}
