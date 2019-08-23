package com.ss.android.ugc.aweme.feed.guide;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import javax.annotation.Nonnull;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    protected View f45446a;

    /* renamed from: b  reason: collision with root package name */
    Animator f45447b;

    public static class a extends j {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f45448c;

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f45448c, false, 41274, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f45448c, false, 41274, new Class[0], Void.TYPE);
                return;
            }
            this.f45447b.cancel();
            this.f45446a.setVisibility(8);
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f45448c, false, 41273, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f45448c, false, 41273, new Class[0], Void.TYPE);
                return;
            }
            this.f45446a.setAlpha(0.0f);
            this.f45446a.setVisibility(0);
            Keyframe ofFloat = Keyframe.ofFloat(0.0f, 0.0f);
            Keyframe ofFloat2 = Keyframe.ofFloat(0.08f, 1.0f);
            Keyframe ofFloat3 = Keyframe.ofFloat(0.92f, 1.0f);
            Keyframe ofFloat4 = Keyframe.ofFloat(1.0f, 0.0f);
            PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(View.ALPHA, new Keyframe[]{ofFloat, ofFloat2, ofFloat3, ofFloat4});
            this.f45447b = ObjectAnimator.ofPropertyValuesHolder(this.f45446a, new PropertyValuesHolder[]{ofKeyframe});
            this.f45447b.setDuration(3600);
            this.f45447b.start();
            this.f45447b.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45449a;

                public final void onAnimationCancel(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f45449a, false, 41277, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f45449a, false, 41277, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    a.this.f45446a.setVisibility(8);
                }

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f45449a, false, 41276, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f45449a, false, 41276, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    a.this.f45446a.setVisibility(8);
                }
            });
        }

        public a(@Nonnull View view) {
            super(view);
        }
    }

    public abstract void a();

    public abstract void b();

    public j(@Nonnull View view) {
        this.f45446a = view;
    }
}
