package com.ss.android.ugc.aweme.face2face.widget;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44152a;

    /* renamed from: b  reason: collision with root package name */
    private final Face2FaceAvatarWidget f44153b;

    d(Face2FaceAvatarWidget face2FaceAvatarWidget) {
        this.f44153b = face2FaceAvatarWidget;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f44152a, false, 39306, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f44152a, false, 39306, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        Face2FaceAvatarWidget face2FaceAvatarWidget = this.f44153b;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        face2FaceAvatarWidget.f44127d.setScaleX(floatValue);
        face2FaceAvatarWidget.f44127d.setScaleY(floatValue);
    }
}
