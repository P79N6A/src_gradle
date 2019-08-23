package com.ss.android.ugc.aweme.shortvideo.ui;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class s implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70920a;

    /* renamed from: b  reason: collision with root package name */
    static final ValueAnimator.AnimatorUpdateListener f70921b = new s();

    private s() {
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f70920a, false, 80278, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f70920a, false, 80278, new Class[]{ValueAnimator.class}, Void.TYPE);
        }
    }
}
