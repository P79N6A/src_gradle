package com.ss.android.ugc.aweme.discover.helper;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.u;

public class g extends a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f42339e;

    /* renamed from: f  reason: collision with root package name */
    private View f42340f;
    private int g = u.a(-5.0d);

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f42339e, false, 36357, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42339e, false, 36357, new Class[0], Void.TYPE);
            return;
        }
        this.f42314c = 160;
        this.g = u.a(-5.0d);
    }

    public final g c() {
        if (PatchProxy.isSupport(new Object[0], this, f42339e, false, 36356, new Class[0], g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[0], this, f42339e, false, 36356, new Class[0], g.class);
        }
        this.f42314c = 0;
        this.g = u.a(0.0d);
        return this;
    }

    public final void a(Animator animator) {
        if (PatchProxy.isSupport(new Object[]{animator}, this, f42339e, false, 36358, new Class[]{Animator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{animator}, this, f42339e, false, 36358, new Class[]{Animator.class}, Void.TYPE);
            return;
        }
        this.f42340f.setTranslationY(0.0f);
        this.f42340f.setAlpha(1.0f);
    }

    public final void a(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f42339e, false, 36359, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f42339e, false, 36359, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        this.f42340f.setTranslationY(((float) this.g) * valueAnimator.getAnimatedFraction());
        this.f42340f.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
    }

    public final void b(Animator animator) {
        if (PatchProxy.isSupport(new Object[]{animator}, this, f42339e, false, 36360, new Class[]{Animator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{animator}, this, f42339e, false, 36360, new Class[]{Animator.class}, Void.TYPE);
            return;
        }
        this.f42340f.setVisibility(8);
        d();
    }

    public final void c(Animator animator) {
        if (PatchProxy.isSupport(new Object[]{animator}, this, f42339e, false, 36362, new Class[]{Animator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{animator}, this, f42339e, false, 36362, new Class[]{Animator.class}, Void.TYPE);
            return;
        }
        this.f42340f.setVisibility(0);
        this.f42340f.setTranslationY((float) this.g);
        this.f42340f.setAlpha(0.0f);
    }

    public final void d(Animator animator) {
        if (PatchProxy.isSupport(new Object[]{animator}, this, f42339e, false, 36363, new Class[]{Animator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{animator}, this, f42339e, false, 36363, new Class[]{Animator.class}, Void.TYPE);
            return;
        }
        d();
    }

    public final void b(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f42339e, false, 36361, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f42339e, false, 36361, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        this.f42340f.setTranslationY(((float) this.g) * (1.0f - valueAnimator.getAnimatedFraction()));
        this.f42340f.setAlpha(valueAnimator.getAnimatedFraction());
    }

    public g(Context context, View view) {
        super(context);
        this.f42340f = view;
        d();
        this.f42315d = 1;
    }
}
