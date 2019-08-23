package com.ss.android.ugc.aweme.shortvideo.mvtemplate.view.circleanimate;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68740a;

    /* renamed from: b  reason: collision with root package name */
    public b f68741b;

    /* renamed from: c  reason: collision with root package name */
    public int f68742c;

    /* renamed from: d  reason: collision with root package name */
    public int f68743d;

    /* renamed from: e  reason: collision with root package name */
    public int f68744e;

    /* renamed from: f  reason: collision with root package name */
    public int f68745f;
    public int g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public TextView m;
    private c n;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f68740a, false, 78119, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68740a, false, 78119, new Class[0], Void.TYPE);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f68743d, this.f68744e});
        final GradientDrawable gradientDrawable = this.n.f68754d;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f68746a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i;
                int i2;
                int i3;
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f68746a, false, 78120, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f68746a, false, 78120, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                if (a.this.f68743d > a.this.f68744e) {
                    i2 = (a.this.f68743d - num.intValue()) / 2;
                    i3 = a.this.f68743d - i2;
                    i = (int) (a.this.l * valueAnimator.getAnimatedFraction());
                } else {
                    i2 = (a.this.f68744e - num.intValue()) / 2;
                    i3 = a.this.f68744e - i2;
                    i = (int) (a.this.l - (a.this.l * valueAnimator.getAnimatedFraction()));
                }
                gradientDrawable.setBounds(i2 + i, i, i3 - i, a.this.m.getHeight() - i);
            }
        });
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(gradientDrawable, "color", new int[]{this.f68745f, this.g});
        ofInt2.setEvaluator(new ArgbEvaluator());
        ObjectAnimator ofInt3 = ObjectAnimator.ofInt(this.n, "strokeColor", new int[]{this.h, this.i});
        ofInt3.setEvaluator(new ArgbEvaluator());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gradientDrawable, "cornerRadius", new float[]{this.j, this.k});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration((long) this.f68742c);
        animatorSet.playTogether(new Animator[]{ofInt, ofInt2, ofInt3, ofFloat});
        animatorSet.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f68749a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f68749a, false, 78121, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f68749a, false, 78121, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationEnd(animator);
                if (a.this.f68741b != null) {
                    a.this.f68741b.a();
                }
            }
        });
        animatorSet.start();
    }

    a(TextView textView, c cVar) {
        this.m = textView;
        this.n = cVar;
    }
}
