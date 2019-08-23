package com.ss.android.ugc.aweme.discover.helper;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.au;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42312a;

    /* renamed from: b  reason: collision with root package name */
    public Context f42313b;

    /* renamed from: c  reason: collision with root package name */
    public int f42314c;

    /* renamed from: d  reason: collision with root package name */
    protected int f42315d;

    /* renamed from: e  reason: collision with root package name */
    private ValueAnimator f42316e;

    /* renamed from: f  reason: collision with root package name */
    private ValueAnimator f42317f;

    public abstract void a(Animator animator);

    public abstract void a(ValueAnimator valueAnimator);

    public abstract void b(Animator animator);

    public abstract void b(ValueAnimator valueAnimator);

    public abstract void c(Animator animator);

    public abstract void d(Animator animator);

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f42312a, false, 36285, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42312a, false, 36285, new Class[0], Void.TYPE);
            return;
        }
        a(true);
    }

    private boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f42312a, false, 36287, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f42312a, false, 36287, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f42317f != null && this.f42317f.isRunning()) {
            return true;
        } else {
            if (this.f42316e == null || !this.f42316e.isRunning()) {
                return false;
            }
            return true;
        }
    }

    public void b() {
        long j;
        if (PatchProxy.isSupport(new Object[0], this, f42312a, false, 36286, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42312a, false, 36286, new Class[0], Void.TYPE);
        } else if (this.f42315d != 0 && !c()) {
            if (this.f42317f == null) {
                this.f42317f = new ValueAnimator();
                this.f42317f.setFloatValues(new float[]{0.0f, 1.0f});
                ValueAnimator valueAnimator = this.f42317f;
                if (this.f42314c == 0) {
                    j = 200;
                } else {
                    j = (long) this.f42314c;
                }
                valueAnimator.setDuration(j);
                this.f42317f.setInterpolator(new au(0.32f, 0.94f, 0.6f, 1.0f));
                this.f42317f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f42322a;

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ValueAnimator valueAnimator2 = valueAnimator;
                        if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f42322a, false, 36292, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f42322a, false, 36292, new Class[]{ValueAnimator.class}, Void.TYPE);
                            return;
                        }
                        a.this.b(valueAnimator2);
                    }
                });
                this.f42317f.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f42324a;

                    public final void onAnimationEnd(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f42324a, false, 36294, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f42324a, false, 36294, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        super.onAnimationEnd(animator);
                        a.this.d(animator);
                        a.this.f42315d = 0;
                    }

                    public final void onAnimationStart(Animator animator) {
                        Animator animator2 = animator;
                        if (PatchProxy.isSupport(new Object[]{animator2}, this, f42324a, false, 36293, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator2}, this, f42324a, false, 36293, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        super.onAnimationStart(animator);
                        a.this.c(animator2);
                    }
                });
            }
            this.f42317f.start();
        }
    }

    public a(Context context) {
        this.f42313b = context;
    }

    public final void a(boolean z) {
        long j;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f42312a, false, 36284, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f42312a, false, 36284, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f42315d != 1 && !c()) {
            if (this.f42316e == null) {
                this.f42316e = new ValueAnimator();
                this.f42316e.setFloatValues(new float[]{0.0f, 1.0f});
                if (this.f42314c == 0) {
                    j = 200;
                } else {
                    j = (long) this.f42314c;
                }
                long j2 = j;
                if (!z) {
                    j2 = 0;
                }
                this.f42316e.setDuration(j2);
                this.f42316e.setInterpolator(new au(0.32f, 0.94f, 0.6f, 1.0f));
                this.f42316e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f42318a;

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ValueAnimator valueAnimator2 = valueAnimator;
                        if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f42318a, false, 36289, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f42318a, false, 36289, new Class[]{ValueAnimator.class}, Void.TYPE);
                            return;
                        }
                        a.this.a(valueAnimator2);
                    }
                });
                this.f42316e.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f42320a;

                    public final void onAnimationEnd(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f42320a, false, 36291, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f42320a, false, 36291, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        super.onAnimationEnd(animator);
                        a.this.b(animator);
                        a.this.f42315d = 1;
                    }

                    public final void onAnimationStart(Animator animator) {
                        Animator animator2 = animator;
                        if (PatchProxy.isSupport(new Object[]{animator2}, this, f42320a, false, 36290, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator2}, this, f42320a, false, 36290, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        super.onAnimationStart(animator);
                        a.this.a(animator2);
                    }
                });
            }
            this.f42316e.start();
        }
    }
}
