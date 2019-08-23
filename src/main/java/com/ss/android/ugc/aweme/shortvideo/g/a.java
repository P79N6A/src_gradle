package com.ss.android.ugc.aweme.shortvideo.g;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class a implements View.OnTouchListener {
    public static ChangeQuickRedirect g;

    public abstract void a(View view, MotionEvent motionEvent);

    public abstract Animator b(View view);

    public abstract Animator c(View view);

    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, g, false, 77535, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, g, false, 77535, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (motionEvent.getAction() == 0) {
            Animator b2 = b(view);
            b2.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67838a;

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f67838a, false, 77536, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f67838a, false, 77536, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    super.onAnimationEnd(animator);
                }
            });
            b2.start();
            return true;
        } else if (motionEvent.getAction() == 1) {
            Animator c2 = c(view);
            c2.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67842a;

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f67842a, false, 77537, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f67842a, false, 77537, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    super.onAnimationEnd(animator);
                    a.this.a(view, motionEvent);
                }
            });
            c2.start();
            return true;
        } else if (motionEvent.getAction() != 3) {
            return false;
        } else {
            c(view).start();
            return false;
        }
    }
}
