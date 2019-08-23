package com.mapbox.mapboxsdk.style.layers;

import android.support.annotation.Keep;

public class TransitionOptions {

    /* renamed from: a  reason: collision with root package name */
    public long f26797a;

    /* renamed from: b  reason: collision with root package name */
    public long f26798b;

    public int hashCode() {
        return (((int) (this.f26797a ^ (this.f26797a >>> 32))) * 31) + ((int) (this.f26798b ^ (this.f26798b >>> 32)));
    }

    public String toString() {
        return "TransitionOptions{duration=" + this.f26797a + ", delay=" + this.f26798b + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransitionOptions transitionOptions = (TransitionOptions) obj;
        if (this.f26797a == transitionOptions.f26797a && this.f26798b == transitionOptions.f26798b) {
            return true;
        }
        return false;
    }

    private TransitionOptions(long j, long j2) {
        this.f26797a = j;
        this.f26798b = j2;
    }

    @Keep
    public static TransitionOptions fromTransitionOptions(long j, long j2) {
        return new TransitionOptions(j, j2);
    }
}
