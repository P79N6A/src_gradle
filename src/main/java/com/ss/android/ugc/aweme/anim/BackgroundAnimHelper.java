package com.ss.android.ugc.aweme.anim;

import android.animation.ValueAnimator;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class BackgroundAnimHelper implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2596a;

    /* renamed from: b  reason: collision with root package name */
    private ValueAnimator f2597b;

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void resumeAnim() {
        if (PatchProxy.isSupport(new Object[0], this, f2596a, false, 21620, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2596a, false, 21620, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f2597b.isStarted()) {
            this.f2597b.start();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void stopAnim() {
        if (PatchProxy.isSupport(new Object[0], this, f2596a, false, 21621, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2596a, false, 21621, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f2596a, false, 21618, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2596a, false, 21618, new Class[0], Void.TYPE);
            return;
        }
        this.f2597b.cancel();
    }
}
