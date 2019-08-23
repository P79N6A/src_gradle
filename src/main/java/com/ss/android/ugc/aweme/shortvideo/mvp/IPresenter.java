package com.ss.android.ugc.aweme.shortvideo.mvp;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvp.a;

public abstract class IPresenter<V extends a> extends ViewModel implements LifecycleObserver, LifecycleOwner {

    /* renamed from: a  reason: collision with root package name */
    public V f3956a;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void detachView() {
        this.f3956a = null;
    }
}
