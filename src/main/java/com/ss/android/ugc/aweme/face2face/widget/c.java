package com.ss.android.ugc.aweme.face2face.widget;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44150a;

    /* renamed from: b  reason: collision with root package name */
    private final Face2FaceAvatarWidget f44151b;

    c(Face2FaceAvatarWidget face2FaceAvatarWidget) {
        this.f44151b = face2FaceAvatarWidget;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f44150a, false, 39305, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f44150a, false, 39305, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        Face2FaceAvatarWidget face2FaceAvatarWidget = this.f44151b;
        face2FaceAvatarWidget.f44125b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
