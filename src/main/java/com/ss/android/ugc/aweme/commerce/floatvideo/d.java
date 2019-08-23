package com.ss.android.ugc.aweme.commerce.floatvideo;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36914a;

    /* renamed from: b  reason: collision with root package name */
    private final FloatVideoBrowsePresenter f36915b;

    d(FloatVideoBrowsePresenter floatVideoBrowsePresenter) {
        this.f36915b = floatVideoBrowsePresenter;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f36914a, false, 28190, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36914a, false, 28190, new Class[0], Void.TYPE);
            return;
        }
        FloatVideoBrowsePresenter floatVideoBrowsePresenter = this.f36915b;
        if (PatchProxy.isSupport(new Object[0], floatVideoBrowsePresenter, FloatVideoBrowsePresenter.f36898a, false, 28179, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], floatVideoBrowsePresenter, FloatVideoBrowsePresenter.f36898a, false, 28179, new Class[0], Void.TYPE);
            return;
        }
        if (floatVideoBrowsePresenter.g == 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ofFloat.addUpdateListener(new e(floatVideoBrowsePresenter));
            ofFloat.setDuration(500);
            ofFloat.start();
        }
    }
}
