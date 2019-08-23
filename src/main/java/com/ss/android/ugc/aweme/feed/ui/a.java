package com.ss.android.ugc.aweme.feed.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.live.feedpage.b;
import com.ss.android.ugc.aweme.live.feedpage.c;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ex;
import io.reactivex.functions.Consumer;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46369a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f46370b = "a";

    /* renamed from: c  reason: collision with root package name */
    public boolean f46371c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f46372d;

    /* renamed from: e  reason: collision with root package name */
    public View f46373e;

    /* renamed from: f  reason: collision with root package name */
    public LiveCircleView f46374f;
    public ValueAnimator g;
    public ValueAnimator h;
    protected View.OnAttachStateChangeListener i = new View.OnAttachStateChangeListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46375a;

        public final void onViewAttachedToWindow(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f46375a, false, 42405, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f46375a, false, 42405, new Class[]{View.class}, Void.TYPE);
                return;
            }
            if (a.this.f46372d) {
                a.this.c();
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f46375a, false, 42406, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f46375a, false, 42406, new Class[]{View.class}, Void.TYPE);
                return;
            }
            a.this.d();
        }
    };
    private User j;
    private View k;
    private AnimatorSet l;
    private Class m;
    private Consumer<b> n;

    public a() {
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f46369a, false, 42399, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46369a, false, 42399, new Class[0], Void.TYPE);
            return;
        }
        b(0);
        e();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f46369a, false, 42400, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46369a, false, 42400, new Class[0], Void.TYPE);
            return;
        }
        f();
        b(8);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f46369a, false, 42402, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46369a, false, 42402, new Class[0], Void.TYPE);
            return;
        }
        if (this.l != null) {
            this.l.cancel();
            this.f46371c = false;
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f46369a, false, 42401, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46369a, false, 42401, new Class[0], Void.TYPE);
            return;
        }
        this.f46372d = a(this.j);
        if (!this.f46372d) {
            d();
            if (!(this.n == null || this.j == null)) {
                try {
                    this.n.accept(new b(Long.parseLong(this.j.getUid()), 0));
                } catch (Exception unused) {
                }
            }
        } else if (this.f46371c) {
            if (this.n != null) {
                a(this.j, this.n);
            }
        } else {
            if (this.g == null) {
                this.g = ValueAnimator.ofInt(new int[]{0, 800});
                this.g.setRepeatCount(-1);
                this.g.setRepeatMode(1);
                this.g.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f46377a;

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float f2;
                        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f46377a, false, 42407, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f46377a, false, 42407, new Class[]{ValueAnimator.class}, Void.TYPE);
                            return;
                        }
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        if (animatedFraction <= 0.5f) {
                            f2 = 1.0f - ((animatedFraction / 0.5f) * 0.08f);
                        } else {
                            f2 = 0.92f + (((animatedFraction - 0.5f) / 0.5f) * 0.08f);
                        }
                        if (a.this.f46373e != null) {
                            a.this.f46373e.setScaleX(f2);
                            a.this.f46373e.setScaleY(f2);
                        }
                        if (intValue >= 730 && intValue < 740 && !a.this.f46371c) {
                            a.this.f46371c = true;
                            a.this.h.start();
                        }
                    }
                });
            }
            if (this.h == null) {
                this.h = ValueAnimator.ofInt(new int[]{0, 800});
                this.h.setRepeatCount(-1);
                this.h.setRepeatMode(1);
                this.h.setDuration(800);
                this.h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f46379a;

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f46379a, false, 42408, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f46379a, false, 42408, new Class[]{ValueAnimator.class}, Void.TYPE);
                            return;
                        }
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        if (intValue >= 0 && intValue <= 640) {
                            float f2 = (((float) intValue) * 1.0f) / 640.0f;
                            if (a.this.f46374f != null) {
                                a.this.f46374f.setFraction(f2);
                            }
                        }
                    }
                });
            }
            if (this.l == null) {
                this.l = new AnimatorSet();
                this.l.setDuration(800);
                this.l.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f46381a;

                    public final void onAnimationCancel(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f46381a, false, 42409, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f46381a, false, 42409, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        if (a.this.h != null) {
                            a.this.h.cancel();
                        }
                        if (a.this.g != null) {
                            a.this.g.cancel();
                        }
                        a.this.f46371c = false;
                    }
                });
            }
            this.l.play(this.g);
            this.l.start();
            if (this.n != null) {
                a(this.j, this.n);
            }
        }
    }

    private boolean a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f46369a, false, 42396, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, this, f46369a, false, 42396, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (user == null) {
            return this.f46372d;
        } else {
            if (!ex.b() && user.isLive() && com.ss.android.ugc.aweme.story.a.a() && !user.isBlock()) {
                return true;
            }
            return false;
        }
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f46369a, false, 42403, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f46369a, false, 42403, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 == 0) {
            if (this.f46374f != null) {
                this.f46374f.setVisibility(0);
            }
            if (this.f46373e != null) {
                this.f46373e.setVisibility(0);
                if (!(this.k == null || this.f46373e == this.k)) {
                    this.k.setVisibility(8);
                }
            }
        } else {
            if (this.f46374f != null) {
                this.f46374f.setVisibility(8);
            }
            if (!(this.f46373e == null || this.f46373e == this.k)) {
                this.f46373e.setVisibility(8);
            }
            if (this.k != null) {
                this.k.setVisibility(0);
            }
        }
    }

    private void a(User user, Consumer<b> consumer) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2, consumer}, this, f46369a, false, 42397, new Class[]{User.class, Consumer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2, consumer}, this, f46369a, false, 42397, new Class[]{User.class, Consumer.class}, Void.TYPE);
        } else if (user2 != null) {
            long parseLong = Long.parseLong(user.getUid());
            c a2 = c.a();
            Class cls = this.m;
            b bVar = new b(this, parseLong, user, consumer);
            a2.a(cls, user, bVar);
        }
    }

    public final void a(User user, Class cls, Consumer<b> consumer) {
        User user2 = user;
        Class cls2 = cls;
        Consumer<b> consumer2 = consumer;
        if (PatchProxy.isSupport(new Object[]{user2, cls2, consumer2}, this, f46369a, false, 42395, new Class[]{User.class, Class.class, Consumer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2, cls2, consumer2}, this, f46369a, false, 42395, new Class[]{User.class, Class.class, Consumer.class}, Void.TYPE);
            return;
        }
        this.j = user2;
        this.n = consumer2;
        this.m = cls2;
        this.f46372d = a(user);
        this.f46373e.removeOnAttachStateChangeListener(this.i);
        this.f46373e.addOnAttachStateChangeListener(this.i);
        if (this.f46372d) {
            c();
        } else {
            d();
        }
    }

    public a(boolean z, View view, View view2, LiveCircleView liveCircleView) {
        int i2;
        this.f46373e = view;
        this.k = view2;
        this.f46374f = liveCircleView;
        this.f46372d = z;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        liveCircleView.setVisibility(i2);
        view.addOnAttachStateChangeListener(this.i);
    }
}
