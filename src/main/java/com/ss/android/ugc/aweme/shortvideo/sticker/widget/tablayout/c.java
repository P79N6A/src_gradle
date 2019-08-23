package com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;

public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70418a;

    /* renamed from: b  reason: collision with root package name */
    private final TabLayout.TabLayoutOnPageChangeListenerIndependent f70419b;

    /* renamed from: c  reason: collision with root package name */
    private final int f70420c;

    /* renamed from: d  reason: collision with root package name */
    private final int f70421d;

    /* renamed from: e  reason: collision with root package name */
    private final TabLayout f70422e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f70423f;
    private final boolean g;

    c(TabLayout.TabLayoutOnPageChangeListenerIndependent tabLayoutOnPageChangeListenerIndependent, int i, int i2, TabLayout tabLayout, boolean z, boolean z2) {
        this.f70419b = tabLayoutOnPageChangeListenerIndependent;
        this.f70420c = i;
        this.f70421d = i2;
        this.f70422e = tabLayout;
        this.f70423f = z;
        this.g = z2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f70418a, false, 80078, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f70418a, false, 80078, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        TabLayout.TabLayoutOnPageChangeListenerIndependent tabLayoutOnPageChangeListenerIndependent = this.f70419b;
        int i = this.f70420c;
        int i2 = this.f70421d;
        TabLayout tabLayout = this.f70422e;
        boolean z = this.f70423f;
        boolean z2 = this.g;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (i >= i2 || tabLayoutOnPageChangeListenerIndependent.f70368b) {
            floatValue = 1.0f - floatValue;
        } else {
            i2--;
        }
        tabLayout.a(i2, floatValue, z, z2);
    }
}
