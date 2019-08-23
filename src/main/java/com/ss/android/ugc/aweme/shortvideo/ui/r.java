package com.ss.android.ugc.aweme.shortvideo.ui;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class r implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70918a;

    /* renamed from: b  reason: collision with root package name */
    static final ValueAnimator.AnimatorUpdateListener f70919b = new r();

    private r() {
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f70918a, false, 80277, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f70918a, false, 80277, new Class[]{ValueAnimator.class}, Void.TYPE);
        }
    }
}
