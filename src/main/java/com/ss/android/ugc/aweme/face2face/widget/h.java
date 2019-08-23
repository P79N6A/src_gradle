package com.ss.android.ugc.aweme.face2face.widget;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44160a;

    /* renamed from: b  reason: collision with root package name */
    private final Face2FaceAvatarWidget f44161b;

    h(Face2FaceAvatarWidget face2FaceAvatarWidget) {
        this.f44161b = face2FaceAvatarWidget;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f44160a, false, 39310, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f44160a, false, 39310, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        this.f44161b.f44126c.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
