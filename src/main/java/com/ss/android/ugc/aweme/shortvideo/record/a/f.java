package com.ss.android.ugc.aweme.shortvideo.record.a;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69078a;

    /* renamed from: b  reason: collision with root package name */
    public static final ValueAnimator.AnimatorUpdateListener f69079b = new f();

    private f() {
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f69078a, false, 78426, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f69078a, false, 78426, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        com.ss.android.medialib.f.a().a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
