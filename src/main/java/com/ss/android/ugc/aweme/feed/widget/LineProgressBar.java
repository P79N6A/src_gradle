package com.ss.android.ugc.aweme.feed.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class LineProgressBar extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46971a;

    /* renamed from: b  reason: collision with root package name */
    public View f46972b;

    /* renamed from: c  reason: collision with root package name */
    public ValueAnimator f46973c;

    /* renamed from: d  reason: collision with root package name */
    public ValueAnimator.AnimatorUpdateListener f46974d;

    /* renamed from: e  reason: collision with root package name */
    private View f46975e;

    /* renamed from: f  reason: collision with root package name */
    private View f46976f;
    private float g;
    private ObjectAnimator h;
    private ObjectAnimator i;

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f46971a, false, 43673, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46971a, false, 43673, new Class[0], Void.TYPE);
            return;
        }
        this.f46974d = new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46977a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f46977a, false, 43679, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f46977a, false, 43679, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                float intValue = (float) ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (intValue <= 0.0f || intValue > 100.0f) {
                    if (intValue > 100.0f && intValue <= 200.0f) {
                        float f2 = (intValue - 100.0f) / 100.0f;
                        LineProgressBar.this.f46972b.setAlpha(1.0f - f2);
                        LineProgressBar.this.f46972b.setScaleX((f2 * 0.2f) + 0.8f);
                    }
                    return;
                }
                float f3 = intValue / 100.0f;
                LineProgressBar.this.f46972b.setAlpha(f3);
                LineProgressBar.this.f46972b.setScaleX(f3 * 0.8f);
            }
        };
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f46971a, false, 43674, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46971a, false, 43674, new Class[0], Void.TYPE);
            return;
        }
        if (CollectionUtils.isEmpty(this.h.getListeners())) {
            this.h.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46979a;

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f46979a, false, 43680, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f46979a, false, 43680, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    if (CollectionUtils.isEmpty(LineProgressBar.this.f46973c.getListeners())) {
                        LineProgressBar.this.f46973c.addUpdateListener(LineProgressBar.this.f46974d);
                    }
                    LineProgressBar.this.f46973c.start();
                }
            });
        }
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f46971a, false, 43676, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46971a, false, 43676, new Class[0], Void.TYPE);
            return;
        }
        e();
        this.h.start();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f46971a, false, 43677, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46971a, false, 43677, new Class[0], Void.TYPE);
            return;
        }
        this.i = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.0f});
        this.i.setDuration(300);
        this.i.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46981a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f46981a, false, 43681, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f46981a, false, 43681, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                if (LineProgressBar.this.f46973c != null) {
                    LineProgressBar.this.f46973c.cancel();
                }
                LineProgressBar.this.setAlpha(1.0f);
                LineProgressBar.this.setVisibility(4);
            }
        });
        this.i.start();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f46971a, false, 43678, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46971a, false, 43678, new Class[0], Void.TYPE);
            return;
        }
        if (this.f46973c != null) {
            this.f46973c.removeAllUpdateListeners();
            this.f46973c.cancel();
        }
        if (this.h != null) {
            this.h.removeAllListeners();
            this.h.cancel();
        }
        if (this.i != null) {
            this.i.removeAllListeners();
            this.i.cancel();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f46971a, false, 43675, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46971a, false, 43675, new Class[0], Void.TYPE);
            return;
        }
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        if (this.f46973c == null) {
            this.f46973c = ValueAnimator.ofInt(new int[]{0, 200});
            this.f46973c.setDuration(600);
            this.f46973c.setRepeatCount(-1);
            this.f46973c.addUpdateListener(this.f46974d);
        }
        if (this.h == null) {
            this.h = ObjectAnimator.ofFloat(this.f46975e, "alpha", new float[]{0.0f, 1.0f});
            this.h.setDuration(300);
            e();
        }
        if (this.i == null || !this.i.isRunning()) {
            if (!this.h.isRunning() && !this.f46973c.isRunning()) {
                f();
            }
            return;
        }
        this.i.cancel();
        f();
    }

    public LineProgressBar(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f46971a, false, 43672, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f46971a, false, 43672, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f46976f = LayoutInflater.from(context).inflate(C0906R.layout.ar3, this);
        this.f46972b = this.f46976f.findViewById(C0906R.id.bbw);
        this.f46975e = this.f46976f.findViewById(C0906R.id.bbp);
        this.f46972b.setAlpha(0.0f);
        this.f46975e.setAlpha(0.0f);
        this.g = ((float) UIUtils.getScreenWidth(getContext())) - UIUtils.dip2Px(getContext(), 30.0f);
        d();
    }

    public LineProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public LineProgressBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context);
    }
}
