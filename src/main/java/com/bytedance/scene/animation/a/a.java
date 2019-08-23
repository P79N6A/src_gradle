package com.bytedance.scene.animation.a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.support.annotation.NonNull;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.scene.animation.d;
import com.bytedance.scene.animation.e;

public final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    private b f21990b = new b();

    public final boolean a() {
        return true;
    }

    @NonNull
    public final Animator a(com.bytedance.scene.animation.a aVar, com.bytedance.scene.animation.a aVar2) {
        if (aVar2.f21989d) {
            return this.f21990b.a(aVar, aVar2);
        }
        View view = aVar.f21987b;
        View view2 = aVar2.f21987b;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, 1.0f});
        ofFloat.setInterpolator(new FastOutSlowInInterpolator());
        ofFloat.setDuration(120);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat2.setInterpolator(new DecelerateInterpolator(2.0f));
        ofFloat2.setDuration(120);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[]{((float) view2.getHeight()) * 0.08f, 0.0f});
        ofFloat3.setInterpolator(new DecelerateInterpolator(2.5f));
        ofFloat3.setDuration(200);
        return e.a(ofFloat, ofFloat2, ofFloat3);
    }

    @NonNull
    public final Animator b(com.bytedance.scene.animation.a aVar, com.bytedance.scene.animation.a aVar2) {
        if (aVar.f21989d) {
            return this.f21990b.b(aVar, aVar2);
        }
        View view = aVar2.f21987b;
        View view2 = aVar.f21987b;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{1.0f, 0.0f});
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(150);
        ofFloat.setStartDelay(50);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[]{0.0f, ((float) view.getHeight()) * 0.08f});
        ofFloat2.setInterpolator(new AccelerateInterpolator(2.0f));
        ofFloat2.setDuration(200);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.7f, 1.0f});
        ofFloat3.setInterpolator(new LinearOutSlowInInterpolator());
        ofFloat3.setDuration(200);
        return e.a(ofFloat, ofFloat2, ofFloat3);
    }
}
