package com.ss.android.ugc.aweme.photomovie.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.photomovie.transition.f;

public final class b implements ITransition, d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59032a;

    /* renamed from: b  reason: collision with root package name */
    public f f59033b = new f.a();

    /* renamed from: c  reason: collision with root package name */
    public View f59034c;

    /* renamed from: d  reason: collision with root package name */
    public int f59035d;

    /* renamed from: e  reason: collision with root package name */
    private FrameLayout f59036e;

    public final void b() {
    }

    public final void c() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f59032a, false, 64176, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59032a, false, 64176, new Class[0], Void.TYPE);
            return;
        }
        this.f59034c.setVisibility(0);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f59032a, false, 64179, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59032a, false, 64179, new Class[0], Void.TYPE);
            return;
        }
        this.f59036e.removeView(this.f59034c);
    }

    public final void a(@NonNull f fVar) {
        this.f59033b = fVar;
    }

    public final void a(final ITransition iTransition) {
        if (PatchProxy.isSupport(new Object[]{iTransition}, this, f59032a, false, 64174, new Class[]{ITransition.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iTransition}, this, f59032a, false, 64174, new Class[]{ITransition.class}, Void.TYPE);
            return;
        }
        this.f59036e.removeAllViews();
        this.f59036e.addView(this.f59034c);
        this.f59036e.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59037a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f59037a, false, 64180, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f59037a, false, 64180, new Class[0], Void.TYPE);
                    return;
                }
                b.this.f59033b.a();
                b.this.a();
                iTransition.a();
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(400);
                final int measuredHeight = b.this.f59034c.getMeasuredHeight() + b.this.f59035d;
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f59040a;

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f59040a, false, 64181, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f59040a, false, 64181, new Class[]{ValueAnimator.class}, Void.TYPE);
                            return;
                        }
                        b.this.f59033b.a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        b.this.a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        iTransition.a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f59043a;

                    public final void onAnimationEnd(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f59043a, false, 64182, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f59043a, false, 64182, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        super.onAnimationEnd(animator);
                        b.this.f59033b.b();
                        b.this.b();
                        iTransition.b();
                    }
                });
                duration.start();
            }
        });
    }

    public final void b(final ITransition iTransition) {
        if (PatchProxy.isSupport(new Object[]{iTransition}, this, f59032a, false, 64175, new Class[]{ITransition.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iTransition}, this, f59032a, false, 64175, new Class[]{ITransition.class}, Void.TYPE);
            return;
        }
        this.f59033b.c();
        c();
        iTransition.c();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(400);
        final int measuredHeight = this.f59034c.getMeasuredHeight() + this.f59035d;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59045a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f59045a, false, 64183, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f59045a, false, 64183, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                b.this.f59033b.b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                b.this.b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                iTransition.b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59049a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f59049a, false, 64184, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f59049a, false, 64184, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                b.this.f59033b.d();
                b.this.d();
                iTransition.d();
            }
        });
        duration.start();
    }

    public b(@NonNull FrameLayout frameLayout, @NonNull View view) {
        this.f59036e = frameLayout;
        this.f59034c = view;
        this.f59035d = (int) UIUtils.dip2Px(frameLayout.getContext(), 0.0f);
    }

    public final void a(float f2, int i, int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)}, this, f59032a, false, 64177, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)}, this, f59032a, false, 64177, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f59034c.setTranslationY(((float) i3) + (((float) (i - i3)) * f2));
    }

    public final void b(float f2, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)}, this, f59032a, false, 64178, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)}, this, f59032a, false, 64178, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f59034c.setTranslationY(((float) (i2 - i)) * f2);
    }
}
