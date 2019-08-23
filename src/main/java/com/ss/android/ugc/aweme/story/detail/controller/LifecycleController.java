package com.ss.android.ugc.aweme.story.detail.controller;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.ss.android.ugc.aweme.story.feed.model.LifeFeedModel;

public abstract class LifecycleController implements LifecycleObserver {

    /* renamed from: d  reason: collision with root package name */
    protected final LifeFeedModel f4117d;

    /* renamed from: e  reason: collision with root package name */
    protected Fragment f4118e;

    /* renamed from: f  reason: collision with root package name */
    protected FragmentActivity f4119f;

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
    }

    public LifecycleController(FragmentActivity fragmentActivity, Fragment fragment) {
        this.f4118e = fragment;
        this.f4119f = fragmentActivity;
        if (fragmentActivity != null) {
            this.f4118e.getLifecycle().addObserver(this);
        }
        this.f4117d = (LifeFeedModel) ViewModelProviders.of(fragmentActivity).get(LifeFeedModel.class);
    }
}
