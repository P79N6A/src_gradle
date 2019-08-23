package com.ss.android.ugc.aweme.main;

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

public class LongClickGuideView extends FrameLayout implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener, GestureDetector.OnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54140a;

    /* renamed from: b  reason: collision with root package name */
    GestureDetector f54141b;

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public LongClickGuideView(Context context) {
        this(context, null);
    }

    public void onLongPress(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f54140a, false, 57088, new Class[]{MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f54140a, false, 57088, new Class[]{MotionEvent.class}, Void.TYPE);
            return;
        }
        performLongClick();
        a(200);
    }

    private void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f54140a, false, 57089, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f54140a, false, 57089, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(this);
        ofFloat.addListener(this);
        ofFloat.start();
    }

    public void onAnimationEnd(Animator animator) {
        if (PatchProxy.isSupport(new Object[]{animator}, this, f54140a, false, 57091, new Class[]{Animator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{animator}, this, f54140a, false, 57091, new Class[]{Animator.class}, Void.TYPE);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54140a, false, 57090, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54140a, false, 57090, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        getChildAt(0).setAlpha(1.0f - valueAnimator.getAnimatedFraction());
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f54140a, false, 57087, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f54140a, false, 57087, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        callOnClick();
        a(0);
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (!PatchProxy.isSupport(new Object[]{motionEvent2}, this, f54140a, false, 57086, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return this.f54141b.onTouchEvent(motionEvent2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f54140a, false, 57086, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
    }

    public LongClickGuideView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LongClickGuideView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        animate().alpha(1.0f).setDuration(1000).start();
        if (PatchProxy.isSupport(new Object[0], this, f54140a, false, 57085, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54140a, false, 57085, new Class[0], Void.TYPE);
            return;
        }
        this.f54141b = new GestureDetector(getContext(), this);
    }
}
