package com.ss.android.ugc.aweme.live.sdk.chatroom.ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.views.LiveButtonView;
import java.util.Iterator;
import java.util.LinkedList;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53514a;

    /* renamed from: b  reason: collision with root package name */
    public int f53515b;

    /* renamed from: c  reason: collision with root package name */
    float f53516c;

    /* renamed from: d  reason: collision with root package name */
    LinkedList<View> f53517d = new LinkedList<>();

    /* renamed from: e  reason: collision with root package name */
    public ViewGroup f53518e;

    /* renamed from: f  reason: collision with root package name */
    public LiveButtonView.a f53519f;
    private ValueAnimator g;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f53514a, false, 55888, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53514a, false, 55888, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.cancel();
            this.g = null;
        }
        if (this.f53515b == 2) {
            this.g = ValueAnimator.ofFloat(new float[]{1.0f, 0.5f});
        } else {
            this.g = ValueAnimator.ofFloat(new float[]{0.5f, 1.0f});
        }
        this.g.setDuration(300);
        this.g.setInterpolator(new LinearInterpolator());
        this.g.addUpdateListener(new c(this));
        this.g.addListener(new Animator.AnimatorListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53520a;

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationCancel(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f53520a, false, 55893, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f53520a, false, 55893, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                switch (b.this.f53515b) {
                    case 1:
                        b.this.a(0.0f);
                        break;
                    case 2:
                        b.this.a(1.0f);
                        return;
                }
            }

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f53520a, false, 55892, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f53520a, false, 55892, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                b.this.f53518e.setEnabled(true);
                if (b.this.f53515b == 2) {
                    b.this.f53518e.setVisibility(8);
                    if (b.this.f53519f != null) {
                        b.this.f53519f.a();
                    }
                }
                switch (b.this.f53515b) {
                    case 1:
                        b.this.a(0.0f);
                        break;
                    case 2:
                        b.this.a(1.0f);
                        return;
                }
            }

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f53520a, false, 55891, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f53520a, false, 55891, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                b.this.f53518e.setEnabled(false);
                b.this.f53518e.setVisibility(0);
                if (b.this.f53515b == 1 && b.this.f53519f != null) {
                    b.this.f53519f.b();
                }
            }
        });
        this.g.start();
    }

    public b(ViewGroup viewGroup) {
        this.f53518e = viewGroup;
    }

    public final void a(float f2) {
        float f3 = f2;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f53514a, false, 55889, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f53514a, false, 55889, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        Iterator it2 = this.f53517d.iterator();
        while (it2.hasNext()) {
            View view = (View) it2.next();
            view.setAlpha(f3);
            if (f3 == 0.0f) {
                view.setEnabled(false);
            }
            if (f3 == 1.0f) {
                view.setEnabled(true);
            }
        }
    }
}
