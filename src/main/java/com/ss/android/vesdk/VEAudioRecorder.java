package com.ss.android.vesdk;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import com.ss.android.ttve.audio.TEDubWriter;
import com.ss.android.ttve.audio.b;
import com.ss.android.vesdk.runtime.VERuntime;

public class VEAudioRecorder implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    private VERuntime f4339a = VERuntime.a();

    /* renamed from: b  reason: collision with root package name */
    private b f4340b = new b(new TEDubWriter());

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void destory() {
        this.f4340b.a();
    }
}
