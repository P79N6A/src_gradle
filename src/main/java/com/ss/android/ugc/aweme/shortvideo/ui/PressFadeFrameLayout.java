package com.ss.android.ugc.aweme.shortvideo.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class PressFadeFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70530a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f70531b;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f70530a, false, 80276, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70530a, false, 80276, new Class[0], Void.TYPE);
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            childAt.clearAnimation();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "alpha", new float[]{childAt.getAlpha(), 1.0f});
            ofFloat.setDuration(100);
            ofFloat.start();
            ofFloat.addUpdateListener(s.f70921b);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f70531b;
    }

    public void setIntercept(boolean z) {
        this.f70531b = z;
    }

    public PressFadeFrameLayout(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f70530a, false, 80275, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f70530a, false, 80275, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    if (!PatchProxy.isSupport(new Object[0], this, f70530a, false, 80274, new Class[0], Void.TYPE)) {
                        int childCount = getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getChildAt(i), "alpha", new float[]{1.0f, 0.5f});
                            ofFloat.setDuration(100);
                            ofFloat.start();
                            ofFloat.addUpdateListener(r.f70919b);
                        }
                        break;
                    } else {
                        PatchProxy.accessDispatch(new Object[0], this, f70530a, false, 80274, new Class[0], Void.TYPE);
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

    public PressFadeFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PressFadeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
