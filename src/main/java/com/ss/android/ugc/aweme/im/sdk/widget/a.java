package com.ss.android.ugc.aweme.im.sdk.widget;

import android.animation.ValueAnimator;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52825a;

    /* renamed from: b  reason: collision with root package name */
    private final DragView f52826b;

    /* renamed from: c  reason: collision with root package name */
    private final float f52827c;

    /* renamed from: d  reason: collision with root package name */
    private final float f52828d;

    /* renamed from: e  reason: collision with root package name */
    private final float f52829e;

    /* renamed from: f  reason: collision with root package name */
    private final int f52830f;
    private final int g;

    a(DragView dragView, float f2, float f3, float f4, int i, int i2) {
        this.f52826b = dragView;
        this.f52827c = f2;
        this.f52828d = f3;
        this.f52829e = f4;
        this.f52830f = i;
        this.g = i2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f52825a, false, 54072, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f52825a, false, 54072, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        DragView dragView = this.f52826b;
        float f2 = this.f52827c;
        float f3 = this.f52828d;
        float f4 = this.f52829e;
        int i = this.f52830f;
        int i2 = this.g;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dragView.f52733e = (f2 * floatValue) + dragView.h;
        dragView.f52734f = (f3 * floatValue) + dragView.i;
        dragView.j = (int) (f4 * floatValue);
        int i3 = (int) ((((float) i) * floatValue) + ((float) dragView.f52732d.f52746b));
        int i4 = (int) ((((float) i2) * floatValue) + ((float) dragView.f52732d.f52747c));
        if (!dragView.l) {
            i4 = (int) (((float) i4) - ((1.0f - floatValue) * ((float) StatusBarUtils.getStatusBarHeight(dragView.f52730b.getContext()))));
        }
        dragView.g = dragView.f52732d.f52750f * (1.0f - floatValue);
        dragView.a(i3, i4);
        if (dragView.n != null) {
            dragView.n.a(valueAnimator);
        }
    }
}
