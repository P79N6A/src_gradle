package com.ss.android.ugc.aweme.discover.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.g.a;

public abstract class ai extends a {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f43115f;

    public abstract void b(View view, MotionEvent motionEvent);

    public final Animator b(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f43115f, false, 37782, new Class[]{View.class}, Animator.class)) {
            return (Animator) PatchProxy.accessDispatch(new Object[]{view2}, this, f43115f, false, 37782, new Class[]{View.class}, Animator.class);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", new float[]{1.0f, 0.5f});
        ofFloat.setDuration(150);
        return ofFloat;
    }

    public final Animator c(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f43115f, false, 37783, new Class[]{View.class}, Animator.class)) {
            return (Animator) PatchProxy.accessDispatch(new Object[]{view2}, this, f43115f, false, 37783, new Class[]{View.class}, Animator.class);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", new float[]{0.5f, 1.0f});
        ofFloat.setDuration(150);
        return ofFloat;
    }

    public final void a(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f43115f, false, 37784, new Class[]{View.class, MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f43115f, false, 37784, new Class[]{View.class, MotionEvent.class}, Void.TYPE);
            return;
        }
        b(view, motionEvent);
    }
}
