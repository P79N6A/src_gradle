package com.ss.android.ugc.aweme.filter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.ui.c.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.photomovie.transition.ITransition;
import com.ss.android.ugc.aweme.photomovie.transition.d;
import com.ss.android.ugc.aweme.photomovie.transition.f;

public final class b implements ITransition, d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47530a;

    /* renamed from: b  reason: collision with root package name */
    public f f47531b = new f.a();

    /* renamed from: c  reason: collision with root package name */
    public View f47532c;

    /* renamed from: d  reason: collision with root package name */
    private FrameLayout f47533d;

    /* renamed from: e  reason: collision with root package name */
    private View f47534e;

    public final void b() {
    }

    public final void c() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f47530a, false, 44001, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47530a, false, 44001, new Class[0], Void.TYPE);
            return;
        }
        this.f47532c.setVisibility(0);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f47530a, false, 44004, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47530a, false, 44004, new Class[0], Void.TYPE);
            return;
        }
        this.f47533d.removeView(this.f47534e);
    }

    public final void a(@NonNull f fVar) {
        this.f47531b = fVar;
    }

    public final void a(final ITransition iTransition) {
        if (PatchProxy.isSupport(new Object[]{iTransition}, this, f47530a, false, 43999, new Class[]{ITransition.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iTransition}, this, f47530a, false, 43999, new Class[]{ITransition.class}, Void.TYPE);
            return;
        }
        this.f47533d.removeAllViews();
        this.f47533d.addView(this.f47534e);
        this.f47533d.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47535a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f47535a, false, 44005, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f47535a, false, 44005, new Class[0], Void.TYPE);
                    return;
                }
                b.this.f47531b.a();
                b.this.a();
                iTransition.a();
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
                duration.setInterpolator(new c());
                final int measuredHeight = b.this.f47532c.getMeasuredHeight();
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f47538a;

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f47538a, false, 44006, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f47538a, false, 44006, new Class[]{ValueAnimator.class}, Void.TYPE);
                            return;
                        }
                        b.this.f47531b.a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        b.this.a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        iTransition.a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f47541a;

                    public final void onAnimationEnd(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f47541a, false, 44007, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f47541a, false, 44007, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        super.onAnimationEnd(animator);
                        b.this.f47531b.b();
                        b.this.b();
                        iTransition.b();
                    }
                });
                duration.start();
            }
        });
    }

    public final void b(final ITransition iTransition) {
        if (PatchProxy.isSupport(new Object[]{iTransition}, this, f47530a, false, 44000, new Class[]{ITransition.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iTransition}, this, f47530a, false, 44000, new Class[]{ITransition.class}, Void.TYPE);
            return;
        }
        this.f47531b.c();
        c();
        iTransition.c();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
        duration.setInterpolator(new c());
        final int measuredHeight = this.f47532c.getMeasuredHeight();
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47543a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f47543a, false, 44008, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f47543a, false, 44008, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                b.this.f47531b.b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                b.this.b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                iTransition.b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47547a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f47547a, false, 44009, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f47547a, false, 44009, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                b.this.f47531b.d();
                b.this.d();
                iTransition.d();
            }
        });
        duration.start();
    }

    public b(@NonNull FrameLayout frameLayout, @NonNull View view, @NonNull View view2) {
        this.f47533d = frameLayout;
        this.f47534e = view;
        this.f47532c = view2;
    }

    public final void a(float f2, int i, int i2) {
        float f3 = f2;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)}, this, f47530a, false, 44002, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)}, this, f47530a, false, 44002, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f47532c.setTranslationY(((float) i3) + (((float) (i - i3)) * f3));
        this.f47532c.setAlpha(f2);
    }

    public final void b(float f2, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)}, this, f47530a, false, 44003, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)}, this, f47530a, false, 44003, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f47532c.setTranslationY(((float) (i2 - i)) * f2);
        this.f47532c.setAlpha(1.0f - f2);
    }
}
