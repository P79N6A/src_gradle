package com.ss.android.ugc.aweme.shortvideo.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.photomovie.transition.ITransition;
import com.ss.android.ugc.aweme.photomovie.transition.d;
import com.ss.android.ugc.aweme.photomovie.transition.f;

public final class h implements ITransition, d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65898a;

    /* renamed from: b  reason: collision with root package name */
    public f f65899b = new f.a();

    /* renamed from: c  reason: collision with root package name */
    public View f65900c;

    /* renamed from: d  reason: collision with root package name */
    private FrameLayout f65901d;

    /* renamed from: e  reason: collision with root package name */
    private View f65902e;

    public final void b() {
    }

    public final void c() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f65898a, false, 75228, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65898a, false, 75228, new Class[0], Void.TYPE);
            return;
        }
        this.f65900c.setVisibility(0);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f65898a, false, 75231, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65898a, false, 75231, new Class[0], Void.TYPE);
            return;
        }
        this.f65901d.removeView(this.f65902e);
    }

    public final void a(@NonNull f fVar) {
        this.f65899b = fVar;
    }

    public final void a(final ITransition iTransition) {
        if (PatchProxy.isSupport(new Object[]{iTransition}, this, f65898a, false, 75226, new Class[]{ITransition.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iTransition}, this, f65898a, false, 75226, new Class[]{ITransition.class}, Void.TYPE);
            return;
        }
        this.f65901d.removeAllViews();
        this.f65901d.addView(this.f65902e);
        this.f65901d.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65903a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f65903a, false, 75232, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f65903a, false, 75232, new Class[0], Void.TYPE);
                    return;
                }
                h.this.f65899b.a();
                h.this.a();
                iTransition.a();
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
                final int measuredHeight = h.this.f65900c.getMeasuredHeight();
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f65906a;

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f65906a, false, 75233, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f65906a, false, 75233, new Class[]{ValueAnimator.class}, Void.TYPE);
                            return;
                        }
                        h.this.f65899b.a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        h.this.a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        iTransition.a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f65909a;

                    public final void onAnimationEnd(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f65909a, false, 75234, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f65909a, false, 75234, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        super.onAnimationEnd(animator);
                        h.this.f65899b.b();
                        h.this.b();
                        iTransition.b();
                    }
                });
                duration.start();
            }
        });
    }

    public final void b(final ITransition iTransition) {
        if (PatchProxy.isSupport(new Object[]{iTransition}, this, f65898a, false, 75227, new Class[]{ITransition.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iTransition}, this, f65898a, false, 75227, new Class[]{ITransition.class}, Void.TYPE);
            return;
        }
        this.f65899b.c();
        c();
        iTransition.c();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
        final int measuredHeight = this.f65900c.getMeasuredHeight();
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65911a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f65911a, false, 75235, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f65911a, false, 75235, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                h.this.f65899b.b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                h.this.b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                iTransition.b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65915a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f65915a, false, 75236, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f65915a, false, 75236, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                h.this.f65899b.d();
                h.this.d();
                iTransition.d();
            }
        });
        duration.start();
    }

    public h(@NonNull FrameLayout frameLayout, @NonNull View view, @NonNull View view2) {
        this.f65901d = frameLayout;
        this.f65902e = view;
        this.f65900c = view2;
    }

    public final void a(float f2, int i, int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)}, this, f65898a, false, 75229, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)}, this, f65898a, false, 75229, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f65900c.setTranslationY(((float) i3) + (((float) (i - i3)) * f2));
    }

    public final void b(float f2, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)}, this, f65898a, false, 75230, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)}, this, f65898a, false, 75230, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f65900c.setTranslationY(((float) (i2 - i)) * f2);
    }
}
