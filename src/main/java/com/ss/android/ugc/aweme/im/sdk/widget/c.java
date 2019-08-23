package com.ss.android.ugc.aweme.im.sdk.widget;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52837a;

    /* renamed from: b  reason: collision with root package name */
    private final DragView f52838b;

    /* renamed from: c  reason: collision with root package name */
    private final float f52839c;

    /* renamed from: d  reason: collision with root package name */
    private final float f52840d;

    /* renamed from: e  reason: collision with root package name */
    private final float f52841e;

    /* renamed from: f  reason: collision with root package name */
    private final float f52842f;

    c(DragView dragView, float f2, float f3, float f4, float f5) {
        this.f52838b = dragView;
        this.f52839c = f2;
        this.f52840d = f3;
        this.f52841e = f4;
        this.f52842f = f5;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f52837a, false, 54074, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f52837a, false, 54074, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        DragView dragView = this.f52838b;
        float f2 = this.f52839c;
        float f3 = this.f52840d;
        float f4 = this.f52841e;
        float f5 = this.f52842f;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dragView.f52733e = (f2 * floatValue) + dragView.h;
        dragView.f52734f = (f3 * floatValue) + dragView.i;
        dragView.j = (int) (255.0f * floatValue);
        dragView.g = dragView.f52732d.f52750f * (1.0f - floatValue);
        dragView.a(dragView.t + ((int) (f4 * floatValue)), dragView.s + ((int) (floatValue * f5)));
    }
}
