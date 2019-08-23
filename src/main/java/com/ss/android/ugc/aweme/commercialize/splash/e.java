package com.ss.android.ugc.aweme.commercialize.splash;

import android.animation.ObjectAnimator;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39461a;

    /* renamed from: b  reason: collision with root package name */
    private final View f39462b;

    e(View view) {
        this.f39462b = view;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f39461a, false, 32015, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39461a, false, 32015, new Class[0], Void.TYPE);
            return;
        }
        View view = this.f39462b;
        view.setVisibility(0);
        view.setAlpha(0.0f);
        ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f}).setDuration(430).start();
    }
}
