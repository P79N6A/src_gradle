package com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Animation;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.utils.v;
import java.util.LinkedList;
import java.util.Queue;

public class c extends b {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f34867d = null;
    static Queue<String> g = new LinkedList();
    public static boolean h = false;
    private static final String i = "c";
    private static final float[] k = {0.23f, 0.39f, 0.78f, 1.0f};

    /* renamed from: e  reason: collision with root package name */
    public AnimationImageView f34868e;

    /* renamed from: f  reason: collision with root package name */
    public AnimatorListenerAdapter f34869f;
    private String j;

    public final void a(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f34867d, false, 24775, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f34867d, false, 24775, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(z, z2);
        if (this.f34861c) {
        }
    }

    public c() {
        g.offer("home_pulldown.json");
        g.offer("home_loading_finish_drag.json");
        g.offer("home_loading_loop_28_47_90.json");
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f34867d, false, 24777, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34867d, false, 24777, new Class[0], Void.TYPE);
            return;
        }
        this.f34868e.setProgress(0.0f);
        this.f34868e.loop(false);
        this.f34868e.cancelAnimation();
        v.b((View) this.f34868e, 4);
        b(true);
    }

    public final void a() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f34867d, false, 24776, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34867d, false, 24776, new Class[0], Void.TYPE);
        } else if (!this.f34861c) {
            super.a();
        } else if (StringUtils.equal(this.j, "home_loading_finish_drag.json")) {
            this.f34868e.removeAnimatorListener(this.f34869f);
            this.f34868e.loop(false);
            b(true);
        } else {
            float progress = this.f34868e.getProgress();
            while (i2 < k.length && k[i2] < progress) {
                i2++;
            }
            if (i2 >= k.length) {
                c();
                return;
            }
            final float f2 = k[i2];
            this.f34868e.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f34870a;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f34870a, false, 24786, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f34870a, false, 24786, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    if (((Float) valueAnimator.getAnimatedValue()).floatValue() >= f2) {
                        c.this.f34868e.postOnAnimation(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f34873a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f34873a, false, 24787, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f34873a, false, 24787, new Class[0], Void.TYPE);
                                    return;
                                }
                                c.this.f34868e.removeUpdateListener(this);
                                c.this.c();
                            }
                        });
                    }
                }
            });
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f34867d, false, 24778, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34867d, false, 24778, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        if (this.f34861c) {
            a("home_loading_finish_drag.json");
            this.f34868e.loop(false);
            this.f34868e.playAnimation();
            this.f34869f = new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f34876a;

                public final void onAnimationCancel(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f34876a, false, 24789, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f34876a, false, 24789, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    super.onAnimationCancel(animator);
                    c.this.f34868e.removeAnimatorListener(this);
                }

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f34876a, false, 24788, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f34876a, false, 24788, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    c.this.a("home_loading_loop_28_47_90.json");
                    c.this.f34868e.loop(true);
                    c.this.f34868e.playAnimation();
                    super.onAnimationEnd(animator);
                    c.this.f34868e.removeAnimatorListener(this);
                }
            };
            this.f34868e.addAnimatorListener(this.f34869f);
        }
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f34867d, false, 24781, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f34867d, false, 24781, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        super.a(f2);
        if (this.f34861c) {
            a("home_pulldown.json");
            this.f34868e.setProgress(f2);
            this.f34868e.postOnAnimation(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f34878a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f34878a, false, 24790, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f34878a, false, 24790, new Class[0], Void.TYPE);
                        return;
                    }
                    v.b((View) c.this.f34868e, 0);
                }
            });
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f34867d, false, 24783, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f34867d, false, 24783, new Class[]{String.class}, Void.TYPE);
        } else if (!StringUtils.equal(this.j, str)) {
            this.j = str;
            this.f34868e.setAnimation(str);
        }
    }

    public final void a(boolean z) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34867d, false, 24782, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34867d, false, 24782, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        AnimationImageView animationImageView = this.f34868e;
        if (!z) {
            i2 = 4;
        }
        v.a((View) animationImageView, i2);
        this.f34860b.f34838f.setDisabled(z);
    }

    public final void b(int i2, Animation.AnimationListener animationListener) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), animationListener}, this, f34867d, false, 24780, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), animationListener}, this, f34867d, false, 24780, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE);
            return;
        }
        super.b(i2, animationListener);
        if (this.f34861c) {
            this.f34868e.loop(false);
            this.f34868e.setSpeed(-1.0f);
            this.f34868e.playAnimation();
        }
    }

    public final void a(int i2, Animation.AnimationListener animationListener) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), animationListener}, this, f34867d, false, 24779, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), animationListener}, this, f34867d, false, 24779, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE);
            return;
        }
        super.a(i2, animationListener);
        if (this.f34861c) {
        }
    }
}
