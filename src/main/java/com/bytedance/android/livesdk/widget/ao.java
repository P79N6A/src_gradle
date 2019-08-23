package com.bytedance.android.livesdk.widget;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ao implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18443a;

    /* renamed from: b  reason: collision with root package name */
    private final WaveProgressView f18444b;

    ao(WaveProgressView waveProgressView) {
        this.f18444b = waveProgressView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f18443a, false, 14772, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f18443a, false, 14772, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        WaveProgressView waveProgressView = this.f18444b;
        waveProgressView.f18365b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        waveProgressView.postInvalidate();
    }
}
