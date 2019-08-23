package com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout;

import android.support.v4.view.animation.FastOutLinearInInterpolator;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70409a;

    /* renamed from: b  reason: collision with root package name */
    static final Interpolator f70410b = new LinearInterpolator();

    /* renamed from: c  reason: collision with root package name */
    static final Interpolator f70411c = new FastOutSlowInInterpolator();

    /* renamed from: d  reason: collision with root package name */
    static final Interpolator f70412d = new FastOutLinearInInterpolator();

    /* renamed from: e  reason: collision with root package name */
    static final Interpolator f70413e = new LinearOutSlowInInterpolator();

    /* renamed from: f  reason: collision with root package name */
    static final Interpolator f70414f = new DecelerateInterpolator();

    static int a(int i, int i2, float f2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2)}, null, f70409a, true, 79980, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE}, Integer.TYPE)) {
            return i + Math.round(((float) (i2 - i)) * f2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2)}, null, f70409a, true, 79980, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
    }
}
