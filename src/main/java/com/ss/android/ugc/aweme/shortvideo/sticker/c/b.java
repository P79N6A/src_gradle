package com.ss.android.ugc.aweme.shortvideo.sticker.c;

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

public class b implements ITransition, d {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f69490b;

    /* renamed from: c  reason: collision with root package name */
    protected f f69491c = new f.a();

    /* renamed from: d  reason: collision with root package name */
    public FrameLayout f69492d;

    /* renamed from: e  reason: collision with root package name */
    public View f69493e;

    /* renamed from: f  reason: collision with root package name */
    public View f69494f;

    public final void b() {
    }

    public final void c() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f69490b, false, 79832, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69490b, false, 79832, new Class[0], Void.TYPE);
            return;
        }
        this.f69493e.setVisibility(0);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f69490b, false, 79835, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69490b, false, 79835, new Class[0], Void.TYPE);
            return;
        }
        this.f69492d.removeView(this.f69494f);
    }

    public final void a(@NonNull f fVar) {
        this.f69491c = fVar;
    }

    public final void a(final ITransition iTransition) {
        if (PatchProxy.isSupport(new Object[]{iTransition}, this, f69490b, false, 79830, new Class[]{ITransition.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iTransition}, this, f69490b, false, 79830, new Class[]{ITransition.class}, Void.TYPE);
            return;
        }
        this.f69492d.removeAllViews();
        this.f69492d.addView(this.f69494f);
        this.f69492d.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69495a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f69495a, false, 79836, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f69495a, false, 79836, new Class[0], Void.TYPE);
                } else if (b.this.f69492d.indexOfChild(b.this.f69494f) != -1) {
                    b.this.f69491c.a();
                    b.this.a();
                    iTransition.a();
                    ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
                    final int measuredHeight = b.this.f69493e.getMeasuredHeight();
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f69498a;

                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f69498a, false, 79837, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f69498a, false, 79837, new Class[]{ValueAnimator.class}, Void.TYPE);
                                return;
                            }
                            b.this.f69491c.a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                            b.this.a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                            iTransition.a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        }
                    });
                    duration.addListener(new AnimatorListenerAdapter() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f69501a;

                        public final void onAnimationEnd(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f69501a, false, 79838, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f69501a, false, 79838, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            super.onAnimationEnd(animator);
                            b.this.f69491c.b();
                            b.this.b();
                            iTransition.b();
                        }
                    });
                    duration.start();
                }
            }
        });
    }

    public final void b(final ITransition iTransition) {
        if (PatchProxy.isSupport(new Object[]{iTransition}, this, f69490b, false, 79831, new Class[]{ITransition.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iTransition}, this, f69490b, false, 79831, new Class[]{ITransition.class}, Void.TYPE);
            return;
        }
        this.f69491c.c();
        c();
        iTransition.c();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
        final int measuredHeight = this.f69493e.getMeasuredHeight();
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69503a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f69503a, false, 79839, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f69503a, false, 79839, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                b.this.f69491c.b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                b.this.b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                iTransition.b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69507a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f69507a, false, 79840, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f69507a, false, 79840, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                b.this.f69491c.d();
                b.this.d();
                iTransition.d();
            }
        });
        duration.start();
    }

    public b(@NonNull FrameLayout frameLayout, @NonNull View view, @NonNull View view2) {
        this.f69492d = frameLayout;
        this.f69494f = view;
        this.f69493e = view2;
    }

    public final void a(float f2, int i, int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)}, this, f69490b, false, 79833, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)}, this, f69490b, false, 79833, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f69493e.setTranslationY(((float) i3) + (((float) (i - i3)) * f2));
    }

    public final void b(float f2, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)}, this, f69490b, false, 79834, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)}, this, f69490b, false, 79834, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f69493e.setTranslationY(((float) (i2 - i)) * f2);
    }
}
