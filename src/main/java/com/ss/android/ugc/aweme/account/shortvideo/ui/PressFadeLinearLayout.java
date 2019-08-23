package com.ss.android.ugc.aweme.account.shortvideo.ui;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class PressFadeLinearLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32767a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f32768b;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f32767a, false, 20913, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32767a, false, 20913, new Class[0], Void.TYPE);
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            childAt.clearAnimation();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "alpha", new float[]{childAt.getAlpha(), 1.0f});
            ofFloat.setDuration(100);
            ofFloat.start();
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                }
            });
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f32768b;
    }

    public void setIntercept(boolean z) {
        this.f32768b = z;
    }

    public PressFadeLinearLayout(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f32767a, false, 20912, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f32767a, false, 20912, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    if (!PatchProxy.isSupport(new Object[0], this, f32767a, false, 20911, new Class[0], Void.TYPE)) {
                        int childCount = getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getChildAt(i), "alpha", new float[]{1.0f, 0.5f});
                            ofFloat.setDuration(100);
                            ofFloat.start();
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                }
                            });
                        }
                        break;
                    } else {
                        PatchProxy.accessDispatch(new Object[0], this, f32767a, false, 20911, new Class[0], Void.TYPE);
                        break;
                    }
                case 1:
                    a();
                    break;
            }
        } else {
            a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public PressFadeLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PressFadeLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
