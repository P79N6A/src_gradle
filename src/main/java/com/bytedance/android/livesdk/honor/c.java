package com.bytedance.android.livesdk.honor;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15536a;

    /* renamed from: b  reason: collision with root package name */
    private final b f15537b;

    c(b bVar) {
        this.f15537b = bVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f15536a, false, 10147, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f15536a, false, 10147, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        b bVar = this.f15537b;
        if (!bVar.n) {
            bVar.f15527b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
