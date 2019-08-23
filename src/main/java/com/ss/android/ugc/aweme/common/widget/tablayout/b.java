package com.ss.android.ugc.aweme.common.widget.tablayout;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout;

public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40644a;

    /* renamed from: b  reason: collision with root package name */
    private final CommonTabLayout.TabLayoutOnPageChangeListenerIndependent f40645b;

    /* renamed from: c  reason: collision with root package name */
    private final int f40646c;

    /* renamed from: d  reason: collision with root package name */
    private final int f40647d;

    /* renamed from: e  reason: collision with root package name */
    private final CommonTabLayout f40648e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f40649f;
    private final boolean g;

    b(CommonTabLayout.TabLayoutOnPageChangeListenerIndependent tabLayoutOnPageChangeListenerIndependent, int i, int i2, CommonTabLayout commonTabLayout, boolean z, boolean z2) {
        this.f40645b = tabLayoutOnPageChangeListenerIndependent;
        this.f40646c = i;
        this.f40647d = i2;
        this.f40648e = commonTabLayout;
        this.f40649f = z;
        this.g = z2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f40644a, false, 34070, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f40644a, false, 34070, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        CommonTabLayout.TabLayoutOnPageChangeListenerIndependent tabLayoutOnPageChangeListenerIndependent = this.f40645b;
        int i = this.f40646c;
        int i2 = this.f40647d;
        CommonTabLayout commonTabLayout = this.f40648e;
        boolean z = this.f40649f;
        boolean z2 = this.g;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (i >= i2 || tabLayoutOnPageChangeListenerIndependent.f40597b) {
            floatValue = 1.0f - floatValue;
        } else {
            i2--;
        }
        commonTabLayout.a(i2, floatValue, z, z2);
    }
}
