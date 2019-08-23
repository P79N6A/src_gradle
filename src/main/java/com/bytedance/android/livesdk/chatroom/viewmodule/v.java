package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.chatroom.viewmodule.DailyRankWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class v implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13336a;

    /* renamed from: b  reason: collision with root package name */
    private final DailyRankWidget.a f13337b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13338c;

    /* renamed from: d  reason: collision with root package name */
    private final int f13339d;

    v(DailyRankWidget.a aVar, int i, int i2) {
        this.f13337b = aVar;
        this.f13338c = i;
        this.f13339d = i2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f13336a, false, 6714, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f13336a, false, 6714, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        DailyRankWidget.a aVar = this.f13337b;
        int i = this.f13338c;
        int i2 = this.f13339d;
        float intValue = ((float) ((Integer) valueAnimator.getAnimatedValue()).intValue()) / 10.0f;
        int i3 = aVar.f12449b + ((int) (((float) i) * intValue));
        int i4 = aVar.f12450c + ((int) (((float) i2) * intValue));
        aVar.f12452e.getLayoutParams().width = i3;
        aVar.f12452e.getLayoutParams().height = i4;
        aVar.f12452e.requestLayout();
    }
}
