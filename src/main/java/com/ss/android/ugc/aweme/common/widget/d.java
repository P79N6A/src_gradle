package com.ss.android.ugc.aweme.common.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40529a;

    /* renamed from: b  reason: collision with root package name */
    private final View f40530b;

    /* renamed from: c  reason: collision with root package name */
    private final float f40531c;

    /* renamed from: d  reason: collision with root package name */
    private final AnimatorSet f40532d;

    /* renamed from: e  reason: collision with root package name */
    private final ObjectAnimator f40533e;

    d(View view, float f2, AnimatorSet animatorSet, ObjectAnimator objectAnimator) {
        this.f40530b = view;
        this.f40531c = f2;
        this.f40532d = animatorSet;
        this.f40533e = objectAnimator;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f40529a, false, 33692, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40529a, false, 33692, new Class[0], Void.TYPE);
            return;
        }
        View view = this.f40530b;
        float f2 = this.f40531c;
        AnimatorSet animatorSet = this.f40532d;
        ObjectAnimator objectAnimator = this.f40533e;
        view.setPivotY(((float) view.getHeight()) / 2.0f);
        view.setPivotX(f2);
        animatorSet.playTogether(new Animator[]{objectAnimator});
        animatorSet.start();
    }
}
