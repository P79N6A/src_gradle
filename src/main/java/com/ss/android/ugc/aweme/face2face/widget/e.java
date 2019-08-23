package com.ss.android.ugc.aweme.face2face.widget;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44154a;

    /* renamed from: b  reason: collision with root package name */
    private final Face2FaceAvatarWidget f44155b;

    e(Face2FaceAvatarWidget face2FaceAvatarWidget) {
        this.f44155b = face2FaceAvatarWidget;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f44154a, false, 39307, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f44154a, false, 39307, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        this.f44155b.f44126c.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
