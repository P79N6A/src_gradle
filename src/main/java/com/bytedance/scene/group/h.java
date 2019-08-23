package com.bytedance.scene.group;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LifecycleRegistry;
import android.support.annotation.NonNull;

public abstract class h extends c {
    public LifecycleRegistry k = new LifecycleRegistry(new LifecycleOwner() {
        @NonNull
        public final Lifecycle getLifecycle() {
            return h.this.k;
        }
    });
    public boolean l = true;
    public boolean m = false;
    public boolean n = false;

    public final void a(boolean z) {
        if (this.l != z) {
            this.l = z;
            v();
            if (this.l) {
                if (this.n) {
                    this.k.handleLifecycleEvent(Lifecycle.Event.ON_START);
                }
                if (this.m) {
                    this.k.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                }
            } else {
                if (this.m) {
                    this.k.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
                }
                if (this.n) {
                    this.k.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
                }
            }
        }
    }
}
