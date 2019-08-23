package com.bytedance.ies.dmt.ui.widget.tablayout;

import android.animation.ValueAnimator;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;

public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final DmtTabLayout.TabLayoutOnPageChangeListenerIndependent f20580a;

    /* renamed from: b  reason: collision with root package name */
    private final int f20581b;

    /* renamed from: c  reason: collision with root package name */
    private final int f20582c;

    /* renamed from: d  reason: collision with root package name */
    private final DmtTabLayout f20583d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f20584e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f20585f;

    b(DmtTabLayout.TabLayoutOnPageChangeListenerIndependent tabLayoutOnPageChangeListenerIndependent, int i, int i2, DmtTabLayout dmtTabLayout, boolean z, boolean z2) {
        this.f20580a = tabLayoutOnPageChangeListenerIndependent;
        this.f20581b = i;
        this.f20582c = i2;
        this.f20583d = dmtTabLayout;
        this.f20584e = z;
        this.f20585f = z2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        DmtTabLayout.TabLayoutOnPageChangeListenerIndependent tabLayoutOnPageChangeListenerIndependent = this.f20580a;
        int i = this.f20581b;
        int i2 = this.f20582c;
        DmtTabLayout dmtTabLayout = this.f20583d;
        boolean z = this.f20584e;
        boolean z2 = this.f20585f;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (i >= i2 || tabLayoutOnPageChangeListenerIndependent.f20540a) {
            floatValue = 1.0f - floatValue;
        } else {
            i2--;
        }
        dmtTabLayout.a(i2, floatValue, z, z2);
    }
}
