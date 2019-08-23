package com.ss.android.ugc.aweme.face2face.widget;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44148a;

    /* renamed from: b  reason: collision with root package name */
    private final Face2FaceAvatarWidget f44149b;

    b(Face2FaceAvatarWidget face2FaceAvatarWidget) {
        this.f44149b = face2FaceAvatarWidget;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f44148a, false, 39304, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f44148a, false, 39304, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        Face2FaceAvatarWidget face2FaceAvatarWidget = this.f44149b;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        face2FaceAvatarWidget.f44128e.setScaleX(floatValue);
        face2FaceAvatarWidget.f44128e.setScaleY(floatValue);
    }
}
