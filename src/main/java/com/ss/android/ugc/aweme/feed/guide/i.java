package com.ss.android.ugc.aweme.feed.guide;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.e.b;
import com.ss.android.ugc.aweme.main.bt;
import java.util.Map;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45435a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f45436b;

    /* renamed from: c  reason: collision with root package name */
    public AnimatorSet f45437c;

    /* renamed from: d  reason: collision with root package name */
    public bt f45438d = new bt();

    /* renamed from: e  reason: collision with root package name */
    private ImageView f45439e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f45440f;
    private Context g;
    private Animator h;
    private String i;

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, f45435a, false, 41269, new Class[0], Boolean.TYPE)) {
            return TextUtils.equals(this.i, "playlist");
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f45435a, false, 41269, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f45435a, false, 41262, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45435a, false, 41262, new Class[0], Void.TYPE);
            return;
        }
        this.f45436b = false;
        if (c()) {
            this.f45438d.i(false);
        } else {
            this.f45438d.c(false);
        }
        if (this.f45437c != null) {
            this.f45437c.cancel();
        }
        if (this.h != null) {
            this.h.cancel();
        }
        if (this.f45439e != null) {
            this.f45439e.setVisibility(8);
        }
        if (this.f45440f != null) {
            this.f45440f.setVisibility(8);
        }
    }

    private Animator d() {
        if (PatchProxy.isSupport(new Object[0], this, f45435a, false, 41266, new Class[0], Animator.class)) {
            return (Animator) PatchProxy.accessDispatch(new Object[0], this, f45435a, false, 41266, new Class[0], Animator.class);
        }
        ObjectAnimator objectAnimator = null;
        if (this.g != null) {
            objectAnimator = ObjectAnimator.ofFloat(this.f45439e, "translationY", new float[]{0.0f, (float) b.a(this.g, -160.0f)});
            objectAnimator.setDuration(1200);
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f45439e, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(1200);
        AnimatorSet animatorSet = new AnimatorSet();
        if (objectAnimator != null) {
            animatorSet.playTogether(new Animator[]{objectAnimator, ofFloat});
        } else {
            animatorSet.playTogether(new Animator[]{ofFloat});
        }
        return animatorSet;
    }

    public final void a() {
        AnimatorSet animatorSet;
        ObjectAnimator objectAnimator;
        Animator animator;
        if (PatchProxy.isSupport(new Object[0], this, f45435a, false, 41261, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45435a, false, 41261, new Class[0], Void.TYPE);
        } else if (this.g != null && this.f45439e != null && this.f45440f != null) {
            if (a.a() && !c()) {
                r.a("swipe_up_guide_show", (Map) d.a().a("type", "3").f34114b);
                r.a("new_user_guide_show", (Map) d.a().a("guide_type", "slide").f34114b);
            }
            this.f45440f.setText(C0906R.string.cgx);
            if (this.f45436b) {
                this.f45437c.cancel();
                if (this.h != null) {
                    this.h.cancel();
                }
            }
            this.f45436b = true;
            if (PatchProxy.isSupport(new Object[0], this, f45435a, false, 41263, new Class[0], Animator.class)) {
                animatorSet = (Animator) PatchProxy.accessDispatch(new Object[0], this, f45435a, false, 41263, new Class[0], Animator.class);
            } else {
                AnimatorSet animatorSet2 = new AnimatorSet();
                if (PatchProxy.isSupport(new Object[0], this, f45435a, false, 41265, new Class[0], Animator.class)) {
                    animator = (Animator) PatchProxy.accessDispatch(new Object[0], this, f45435a, false, 41265, new Class[0], Animator.class);
                } else {
                    ObjectAnimator objectAnimator2 = null;
                    if (this.g != null) {
                        objectAnimator2 = ObjectAnimator.ofFloat(this.f45440f, "translationY", new float[]{0.0f, (float) b.a(this.g, -12.0f)});
                        objectAnimator2.setDuration(600);
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f45440f, "alpha", new float[]{0.0f, 1.0f});
                    ofFloat.setDuration(600);
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (objectAnimator2 != null) {
                        animatorSet3.playTogether(new Animator[]{objectAnimator2, ofFloat});
                    } else {
                        animatorSet3.playTogether(new Animator[]{ofFloat});
                    }
                    animator = animatorSet3;
                }
                animator.setStartDelay(600);
                animatorSet2.playTogether(new Animator[]{animator, d()});
                animatorSet = animatorSet2;
            }
            this.h = animatorSet;
            this.h.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45441a;

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f45441a, false, 41270, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f45441a, false, 41270, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    super.onAnimationEnd(animator);
                    i.this.f45437c.start();
                }
            });
            this.f45437c = new AnimatorSet();
            AnimatorSet animatorSet4 = this.f45437c;
            Animator[] animatorArr = new Animator[2];
            if (PatchProxy.isSupport(new Object[0], this, f45435a, false, 41267, new Class[0], Animator.class)) {
                objectAnimator = (Animator) PatchProxy.accessDispatch(new Object[0], this, f45435a, false, 41267, new Class[0], Animator.class);
            } else {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f45439e, "alpha", new float[]{1.0f, 0.0f});
                ofFloat2.setDuration(300);
                objectAnimator = ofFloat2;
            }
            animatorArr[0] = objectAnimator;
            animatorArr[1] = d();
            animatorSet4.playSequentially(animatorArr);
            this.f45437c.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45443a;

                /* renamed from: b  reason: collision with root package name */
                boolean f45444b;

                public final void onAnimationCancel(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f45443a, false, 41271, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f45443a, false, 41271, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    super.onAnimationCancel(animator);
                    this.f45444b = true;
                    if (i.this.c()) {
                        i.this.f45438d.i(false);
                    } else {
                        i.this.f45438d.c(false);
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f45443a, false, 41272, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f45443a, false, 41272, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    super.onAnimationEnd(animator);
                    if (!this.f45444b && i.this.f45437c != null) {
                        i.this.f45437c.start();
                    }
                }
            });
            this.h.start();
        }
    }

    public i(Context context, View view, String str) {
        this.g = context;
        this.f45439e = (ImageView) view.findViewById(C0906R.id.b5r);
        this.f45440f = (TextView) view.findViewById(C0906R.id.dk5);
        this.i = str;
    }
}
