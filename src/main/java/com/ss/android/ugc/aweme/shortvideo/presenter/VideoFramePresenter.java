package com.ss.android.ugc.aweme.shortvideo.presenter;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.jni.FrameThumb;

public class VideoFramePresenter implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3957a;

    /* renamed from: b  reason: collision with root package name */
    public FrameThumb f3958b;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3957a, false, 78207, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3957a, false, 78207, new Class[0], Void.TYPE);
            return;
        }
        this.f3958b.unInitVideoToGraph();
    }
}
