package com.bytedance.android.livesdk.fansclub;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import com.bytedance.android.livesdk.fansclub.JoinFansPortraitNotifyView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13885a;

    /* renamed from: b  reason: collision with root package name */
    private final JoinFansPortraitNotifyView.AnonymousClass3 f13886b;

    /* renamed from: c  reason: collision with root package name */
    private final float f13887c;

    /* renamed from: d  reason: collision with root package name */
    private final float f13888d;

    j(JoinFansPortraitNotifyView.AnonymousClass3 r1, float f2, float f3) {
        this.f13886b = r1;
        this.f13887c = f2;
        this.f13888d = f3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f13885a, false, 8326, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f13885a, false, 8326, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        JoinFansPortraitNotifyView.AnonymousClass3 r0 = this.f13886b;
        float f2 = this.f13887c;
        float f3 = this.f13888d;
        if (!JoinFansPortraitNotifyView.this.r) {
            JoinFansPortraitNotifyView.this.f13852c.setScaleX(1.0f - valueAnimator.getAnimatedFraction());
            JoinFansPortraitNotifyView.this.f13852c.setScaleY(1.0f - valueAnimator.getAnimatedFraction());
            PointF pointF = (PointF) valueAnimator.getAnimatedValue();
            JoinFansPortraitNotifyView.this.f13852c.setTranslationX((pointF.x - f2) - (((float) JoinFansPortraitNotifyView.this.f13852c.getWidth()) / 2.0f));
            JoinFansPortraitNotifyView.this.f13852c.setTranslationY((pointF.y - f3) - (((float) JoinFansPortraitNotifyView.this.f13852c.getHeight()) / 2.0f));
        }
    }
}
