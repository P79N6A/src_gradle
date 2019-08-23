package com.mapbox.mapboxsdk.location;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.support.annotation.NonNull;
import android.view.animation.Interpolator;
import java.util.List;

public final class s {
    static void a(@NonNull List<Animator> list, @NonNull Interpolator interpolator, long j) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(list);
        animatorSet.setInterpolator(interpolator);
        animatorSet.setDuration(j);
        animatorSet.start();
    }
}
