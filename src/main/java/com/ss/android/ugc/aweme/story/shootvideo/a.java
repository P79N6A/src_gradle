package com.ss.android.ugc.aweme.story.shootvideo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73395a;

    public static void a(View view) {
        final View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f73395a, true, 85112, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, null, f73395a, true, 85112, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{view2, null}, null, f73395a, true, 85114, new Class[]{View.class, Animator.AnimatorListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, null}, null, f73395a, true, 85114, new Class[]{View.class, Animator.AnimatorListener.class}, Void.TYPE);
            return;
        }
        if (view2 != null) {
            view2.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", new float[]{0.0f, 1.0f});
            ofFloat.setDuration(300);
            ofFloat.addListener(new AnimatorListenerAdapter(null) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f73396a;

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f73396a, false, 85116, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f73396a, false, 85116, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    view2.setVisibility(0);
                    if (null != null) {
                        null.onAnimationEnd(animator);
                    }
                    super.onAnimationEnd(animator);
                }
            });
            ofFloat.start();
        }
    }

    public static void b(View view) {
        final View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f73395a, true, 85113, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, null, f73395a, true, 85113, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{view2, null}, null, f73395a, true, 85115, new Class[]{View.class, Animator.AnimatorListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, null}, null, f73395a, true, 85115, new Class[]{View.class, Animator.AnimatorListener.class}, Void.TYPE);
            return;
        }
        if (!(view2 == null || view.getVisibility() == 8)) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", new float[]{1.0f, 0.0f});
            ofFloat.setDuration(300);
            ofFloat.addListener(new AnimatorListenerAdapter(null) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f73399a;

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f73399a, false, 85117, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f73399a, false, 85117, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    view2.setVisibility(8);
                    if (null != null) {
                        null.onAnimationEnd(animator);
                    }
                    super.onAnimationEnd(animator);
                }
            });
            ofFloat.start();
        }
    }
}
