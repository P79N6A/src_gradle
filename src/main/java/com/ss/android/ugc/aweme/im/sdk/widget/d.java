package com.ss.android.ugc.aweme.im.sdk.widget;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52843a;

    /* renamed from: b  reason: collision with root package name */
    private final DragView f52844b;

    /* renamed from: c  reason: collision with root package name */
    private final float f52845c;

    /* renamed from: d  reason: collision with root package name */
    private final float f52846d;

    /* renamed from: e  reason: collision with root package name */
    private final float f52847e;

    /* renamed from: f  reason: collision with root package name */
    private final float f52848f;
    private final float g;
    private final float h;
    private final float i;
    private final float j;
    private final float k;

    d(DragView dragView, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.f52844b = dragView;
        this.f52845c = f2;
        this.f52846d = f3;
        this.f52847e = f4;
        this.f52848f = f5;
        this.g = f6;
        this.h = f7;
        this.i = f8;
        this.j = f9;
        this.k = f10;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f52843a, false, 54075, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f52843a, false, 54075, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        DragView dragView = this.f52844b;
        float f2 = this.f52845c;
        float f3 = this.f52846d;
        float f4 = this.f52847e;
        float f5 = this.f52848f;
        float f6 = this.g;
        float f7 = this.h;
        float f8 = this.i;
        float f9 = this.j;
        float f10 = this.k;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dragView.f52733e = (f2 * floatValue) + f3;
        dragView.f52734f = (f4 * floatValue) + f5;
        dragView.j = (int) (f6 * floatValue);
        dragView.a((int) ((f7 * floatValue) + f8), (int) ((f9 * floatValue) + f10));
    }
}
