package com.mapbox.mapboxsdk.style.layers;

import android.support.annotation.NonNull;

public class d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f26799a;

    /* renamed from: b  reason: collision with root package name */
    public final T f26800b;

    public String toString() {
        return String.format("%s: %s", new Object[]{this.f26799a, this.f26800b});
    }

    public d(@NonNull String str, T t) {
        this.f26799a = str;
        this.f26800b = t;
    }
}
