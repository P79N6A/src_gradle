package com.ss.android.ugc.aweme.music.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class CheckableImageView extends RemoteImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56406a;

    /* renamed from: b  reason: collision with root package name */
    public a f56407b;

    public interface a {
        void a();

        void a(int i);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f56406a, false, 60104, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56406a, false, 60104, new Class[0], Void.TYPE);
            return;
        }
        a(1.0f);
    }

    public void setOnStateChangeListener(a aVar) {
        this.f56407b = aVar;
    }

    public CheckableImageView(Context context) {
        this(context, null);
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f56406a, false, 60105, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f56406a, false, 60105, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        clearAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "scaleX", new float[]{1.0f, 1.08f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "scaleY", new float[]{1.0f, 1.08f});
        ofFloat.setDuration(100);
        ofFloat2.setDuration(100);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "scaleX", new float[]{1.08f, 0.0f});
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, "scaleY", new float[]{1.08f, 0.0f});
        ofFloat3.setDuration(100);
        ofFloat4.setDuration(100);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this, "alpha", new float[]{0.0f, f2});
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this, "alpha", new float[]{f2, 0.0f});
        ofFloat6.setDuration(100);
        ofFloat5.setDuration(100);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).with(ofFloat6).after(ofFloat);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this, "scaleX", new float[]{0.0f, 1.08f});
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this, "scaleY", new float[]{0.0f, 1.08f});
        ofFloat7.setDuration(100);
        ofFloat8.setDuration(100);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this, "scaleX", new float[]{1.08f, 1.0f});
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this, "scaleY", new float[]{1.08f, 1.0f});
        ofFloat9.setDuration(100);
        ofFloat9.setDuration(100);
        final AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ofFloat7).with(ofFloat8).with(ofFloat5);
        animatorSet2.play(ofFloat9).with(ofFloat10).after(ofFloat7);
        animatorSet.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56408a;

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f56408a, false, 60106, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f56408a, false, 60106, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                if (CheckableImageView.this.f56407b != null) {
                    CheckableImageView.this.f56407b.a(0);
                }
            }

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f56408a, false, 60107, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f56408a, false, 60107, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                animatorSet2.start();
                if (CheckableImageView.this.f56407b != null) {
                    CheckableImageView.this.f56407b.a(1);
                }
            }
        });
        animatorSet2.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56411a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f56411a, false, 60108, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f56411a, false, 60108, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                if (CheckableImageView.this.f56407b != null) {
                    CheckableImageView.this.f56407b.a();
                }
            }
        });
        animatorSet.start();
    }

    public CheckableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CheckableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
