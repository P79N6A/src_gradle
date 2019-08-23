package com.bytedance.scene.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import java.util.Arrays;
import java.util.List;

public final class e {
    public static Animator a(Animator... animatorArr) {
        List asList = Arrays.asList(animatorArr);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(asList);
        return animatorSet;
    }
}
