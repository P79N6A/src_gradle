package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.chatroom.viewmodule.DailyRankWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class w implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13340a;

    /* renamed from: b  reason: collision with root package name */
    private final DailyRankWidget.a f13341b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13342c;

    /* renamed from: d  reason: collision with root package name */
    private final int f13343d;

    w(DailyRankWidget.a aVar, int i, int i2) {
        this.f13341b = aVar;
        this.f13342c = i;
        this.f13343d = i2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f13340a, false, 6715, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f13340a, false, 6715, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        DailyRankWidget.a aVar = this.f13341b;
        int i = this.f13342c;
        int i2 = this.f13343d;
        float intValue = ((float) ((Integer) valueAnimator.getAnimatedValue()).intValue()) / 10.0f;
        int i3 = aVar.f12449b - ((int) (((float) i) * intValue));
        int i4 = aVar.f12450c - ((int) (((float) i2) * intValue));
        aVar.f12452e.getLayoutParams().width = i3;
        aVar.f12452e.getLayoutParams().height = i4;
        aVar.f12452e.requestLayout();
    }
}
