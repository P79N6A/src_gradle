package com.airbnb.lottie;

import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class e {
    @TargetClass
    @Proxy
    static void a(LottieAnimationView lottieAnimationView) {
        try {
            lottieAnimationView.recycleBitmaps();
        } catch (Exception unused) {
        }
    }
}
