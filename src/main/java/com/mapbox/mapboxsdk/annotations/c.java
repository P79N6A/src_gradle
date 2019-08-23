package com.mapbox.mapboxsdk.annotations;

import android.os.Parcelable;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.c;
import com.mapbox.mapboxsdk.geometry.LatLng;

public abstract class c<U extends Marker, T extends c<U, T>> implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    public LatLng f26425a;

    /* renamed from: b  reason: collision with root package name */
    public String f26426b;

    /* renamed from: c  reason: collision with root package name */
    public String f26427c;

    /* renamed from: d  reason: collision with root package name */
    public e f26428d;

    public abstract T a();

    public abstract U b();

    public final T a(e eVar) {
        this.f26428d = eVar;
        return a();
    }

    public final T a(LatLng latLng) {
        this.f26425a = latLng;
        return a();
    }
}
