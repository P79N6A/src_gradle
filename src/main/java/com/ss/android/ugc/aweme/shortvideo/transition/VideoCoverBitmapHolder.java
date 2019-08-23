package com.ss.android.ugc.aweme.shortvideo.transition;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.graphics.Bitmap;

public class VideoCoverBitmapHolder implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static Bitmap f4018a;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (f4018a != null) {
            f4018a = null;
        }
    }
}
