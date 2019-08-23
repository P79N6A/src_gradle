package com.ss.android.ugc.aweme.im.sdk.utils;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52535a;

    public static void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, null, f52535a, true, 53325, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, null, f52535a, true, 53325, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Animation animation = view.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        view.clearAnimation();
    }

    public static RotateAnimation a(int i, Animation.AnimationListener animationListener) {
        Animation.AnimationListener animationListener2 = animationListener;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), animationListener2}, null, f52535a, true, 53322, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, RotateAnimation.class)) {
            return (RotateAnimation) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), animationListener2}, null, f52535a, true, 53322, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, RotateAnimation.class);
        }
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration((long) i);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatMode(1);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setAnimationListener(animationListener2);
        return rotateAnimation;
    }

    public static TranslateAnimation a(int i, float f2, float f3, float f4, float f5) {
        if (PatchProxy.isSupport(new Object[]{240, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(0.0f), Float.valueOf(0.0f)}, null, f52535a, true, 53324, new Class[]{Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, TranslateAnimation.class)) {
            return (TranslateAnimation) PatchProxy.accessDispatch(new Object[]{240, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(0.0f), Float.valueOf(0.0f)}, null, f52535a, true, 53324, new Class[]{Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, TranslateAnimation.class);
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(f2, f3, 0.0f, 0.0f);
        translateAnimation.setDuration(240);
        translateAnimation.setInterpolator(new LinearInterpolator());
        translateAnimation.setRepeatMode(1);
        return translateAnimation;
    }
}
