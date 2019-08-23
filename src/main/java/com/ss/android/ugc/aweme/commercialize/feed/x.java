package com.ss.android.ugc.aweme.commercialize.feed;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.card.CommerceGoodHalfCardContainer;

public final /* synthetic */ class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38868a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate f38869b;

    x(CommerceVideoDelegate commerceVideoDelegate) {
        this.f38869b = commerceVideoDelegate;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f38868a, false, 30703, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38868a, false, 30703, new Class[0], Void.TYPE);
            return;
        }
        CommerceVideoDelegate commerceVideoDelegate = this.f38869b;
        if (!commerceVideoDelegate.commerceGoodHalfCardContainer.j) {
            commerceVideoDelegate.commerceGoodHalfCardContainer.setVisibility(0);
        }
        commerceVideoDelegate.f();
        CommerceGoodHalfCardContainer commerceGoodHalfCardContainer = commerceVideoDelegate.commerceGoodHalfCardContainer;
        if (PatchProxy.isSupport(new Object[0], commerceGoodHalfCardContainer, CommerceGoodHalfCardContainer.f36809a, false, 28030, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], commerceGoodHalfCardContainer, CommerceGoodHalfCardContainer.f36809a, false, 28030, new Class[0], Void.TYPE);
        } else {
            commerceGoodHalfCardContainer.h = true;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(commerceGoodHalfCardContainer.f36811c, "alpha", new float[]{0.0f, 1.0f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(commerceGoodHalfCardContainer.f36811c, "translationY", new float[]{36.0f, 0.0f});
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(200);
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
            animatorSet.start();
            if (commerceGoodHalfCardContainer.f36812d.getVisibility() == 0) {
                commerceGoodHalfCardContainer.f36812d.animate().alpha(1.0f).setInterpolator(new LinearInterpolator()).setDuration(160).setStartDelay(80).start();
            }
        }
        commerceVideoDelegate.m();
        commerceVideoDelegate.y = true;
    }
}
