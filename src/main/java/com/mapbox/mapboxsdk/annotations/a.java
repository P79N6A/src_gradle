package com.mapbox.mapboxsdk.annotations;

import android.support.annotation.NonNull;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.o;

public abstract class a implements Comparable<a> {

    /* renamed from: a  reason: collision with root package name */
    public long f26421a = -1;

    /* renamed from: b  reason: collision with root package name */
    public o f26422b;

    /* renamed from: c  reason: collision with root package name */
    public MapView f26423c;

    protected a() {
    }

    public final void a() {
        if (this.f26422b != null) {
            this.f26422b.f26699e.a(this);
        }
    }

    public int hashCode() {
        return (int) (this.f26421a ^ (this.f26421a >>> 32));
    }

    public void a(o oVar) {
        this.f26422b = oVar;
    }

    public /* bridge */ /* synthetic */ int compareTo(@NonNull Object obj) {
        a aVar = (a) obj;
        if (this.f26421a < aVar.f26421a) {
            return 1;
        }
        if (this.f26421a > aVar.f26421a) {
            return -1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a) || this.f26421a != ((a) obj).f26421a) {
            return false;
        }
        return true;
    }
}
