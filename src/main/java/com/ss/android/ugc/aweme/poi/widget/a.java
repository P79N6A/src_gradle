package com.ss.android.ugc.aweme.poi.widget;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61050a;

    /* renamed from: b  reason: collision with root package name */
    static final ValueAnimator.AnimatorUpdateListener f61051b = new a();

    private a() {
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f61050a, false, 66928, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f61050a, false, 66928, new Class[]{ValueAnimator.class}, Void.TYPE);
        }
    }
}
