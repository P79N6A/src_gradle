package com.ss.android.ugc.aweme.im.sdk.widget;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52831a;

    /* renamed from: b  reason: collision with root package name */
    private final DragView f52832b;

    /* renamed from: c  reason: collision with root package name */
    private final float f52833c;

    /* renamed from: d  reason: collision with root package name */
    private final float f52834d;

    /* renamed from: e  reason: collision with root package name */
    private final float f52835e;

    /* renamed from: f  reason: collision with root package name */
    private final float f52836f;
    private final int g;
    private final int h;
    private final float i;
    private final float j;

    b(DragView dragView, float f2, float f3, float f4, float f5, int i2, int i3, float f6, float f7) {
        this.f52832b = dragView;
        this.f52833c = f2;
        this.f52834d = f3;
        this.f52835e = f4;
        this.f52836f = f5;
        this.g = i2;
        this.h = i3;
        this.i = f6;
        this.j = f7;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f52831a, false, 54073, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f52831a, false, 54073, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        DragView dragView = this.f52832b;
        float f2 = this.f52833c;
        float f3 = this.f52834d;
        float f4 = this.f52835e;
        float f5 = this.f52836f;
        int i2 = this.g;
        int i3 = this.h;
        float f6 = this.i;
        float f7 = this.j;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f8 = 1.0f - floatValue;
        dragView.f52733e = (f2 * f8) + f3;
        dragView.f52734f = (f4 * f8) + f5;
        dragView.j = ((int) (f8 * ((float) i2))) + i3;
        dragView.a((int) ((f6 * floatValue) + ((float) dragView.q)), (int) ((floatValue * f7) + ((float) dragView.r)));
    }
}
