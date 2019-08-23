package com.ss.android.ugc.aweme.utils;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75893a;

    public static Animation a(float f2, float f3, long j) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), 300L}, null, f75893a, true, 87884, new Class[]{Float.TYPE, Float.TYPE, Long.TYPE}, Animation.class)) {
            return (Animation) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), 300L}, null, f75893a, true, 87884, new Class[]{Float.TYPE, Float.TYPE, Long.TYPE}, Animation.class);
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setDuration(300);
        return alphaAnimation;
    }
}
