package com.bytedance.scene.animation.interaction;

import android.animation.Animator;
import android.support.v4.os.CancellationSignal;

class InteractionNavigationPopAnimationFactory$3 implements CancellationSignal.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Animator f22049a;

    public void onCancel() {
        this.f22049a.cancel();
    }
}
