package com.bytedance.scene.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.annotation.RestrictTo;
import android.view.View;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    private View f22081a;

    /* renamed from: b  reason: collision with root package name */
    private int f22082b = this.f22081a.getLayerType();

    public e(View view) {
        this.f22081a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f22081a.setLayerType(this.f22082b, null);
    }

    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.f22081a.setLayerType(2, null);
    }
}
